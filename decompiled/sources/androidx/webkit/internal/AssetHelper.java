package androidx.webkit.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class AssetHelper {
    public static final String DEFAULT_MIME_TYPE = "text/plain";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f24054a;

    public AssetHelper(@NonNull Context context) {
        this.f24054a = context;
    }

    @NonNull
    public static String getCanonicalDirPath(@NonNull File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    @Nullable
    public static File getCanonicalFileIfChild(@NonNull File file, @NonNull String str) throws IOException {
        String canonicalDirPath = getCanonicalDirPath(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(canonicalDirPath)) {
            return new File(canonicalPath);
        }
        return null;
    }

    @NonNull
    public static File getDataDir(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 24 ? ApiHelperForN.getDataDir(context) : context.getCacheDir().getParentFile();
    }

    @NonNull
    public static String guessMimeType(@NonNull String str) {
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName == null ? DEFAULT_MIME_TYPE : strGuessContentTypeFromName;
    }

    @NonNull
    public static InputStream openFile(@NonNull File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return file.getPath().endsWith(".svgz") ? new GZIPInputStream(fileInputStream) : fileInputStream;
    }

    @NonNull
    public InputStream openAsset(@NonNull String str) throws IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        InputStream inputStreamOpen = this.f24054a.getAssets().open(str, 2);
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStreamOpen) : inputStreamOpen;
    }

    @NonNull
    public InputStream openResource(@NonNull String str) throws Resources.NotFoundException, IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] strArrSplit = str.split("/", -1);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: ".concat(str));
        }
        String str2 = strArrSplit[0];
        String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        Context context = this.f24054a;
        int identifier = context.getResources().getIdentifier(strSubstring, str2, context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(identifier, typedValue, true);
        int i10 = typedValue.type;
        if (i10 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i10)));
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStreamOpenRawResource) : inputStreamOpenRawResource;
    }
}
