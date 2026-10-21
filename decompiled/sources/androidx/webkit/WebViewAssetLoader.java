package androidx.webkit;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.util.Pair;
import androidx.webkit.internal.AssetHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewAssetLoader {
    public static final String DEFAULT_DOMAIN = "appassets.androidplatform.net";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f24032a;

    public static final class AssetsPathHandler implements PathHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetHelper f24033a;

        public AssetsPathHandler(@NonNull Context context) {
            this.f24033a = new AssetHelper(context);
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        @Nullable
        @WorkerThread
        public WebResourceResponse handle(@NonNull String str) {
            try {
                return new WebResourceResponse(AssetHelper.guessMimeType(str), null, this.f24033a.openAsset(str));
            } catch (IOException unused) {
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f24035b = WebViewAssetLoader.DEFAULT_DOMAIN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final ArrayList f24036c = new ArrayList();

        @NonNull
        public Builder addPathHandler(@NonNull String str, @NonNull PathHandler pathHandler) {
            this.f24036c.add(Pair.create(str, pathHandler));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public WebViewAssetLoader build() {
            ArrayList arrayList = new ArrayList();
            for (Pair pair : this.f24036c) {
                arrayList.add(new a(this.f24035b, (String) pair.first, this.f24034a, (PathHandler) pair.second));
            }
            return new WebViewAssetLoader(arrayList);
        }

        @NonNull
        public Builder setDomain(@NonNull String str) {
            this.f24035b = str;
            return this;
        }

        @NonNull
        public Builder setHttpAllowed(boolean z10) {
            this.f24034a = z10;
            return this;
        }
    }

    public static final class InternalStoragePathHandler implements PathHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f24037b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final File f24038a;

        public InternalStoragePathHandler(@NonNull Context context, @NonNull File file) {
            try {
                this.f24038a = new File(AssetHelper.getCanonicalDirPath(file));
                if (a(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e5) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e5);
            }
        }

        public final boolean a(@NonNull Context context) throws IOException {
            String canonicalDirPath = AssetHelper.getCanonicalDirPath(this.f24038a);
            String canonicalDirPath2 = AssetHelper.getCanonicalDirPath(context.getCacheDir());
            String canonicalDirPath3 = AssetHelper.getCanonicalDirPath(AssetHelper.getDataDir(context));
            if ((!canonicalDirPath.startsWith(canonicalDirPath2) && !canonicalDirPath.startsWith(canonicalDirPath3)) || canonicalDirPath.equals(canonicalDirPath2) || canonicalDirPath.equals(canonicalDirPath3)) {
                return false;
            }
            String[] strArr = f24037b;
            for (int i10 = 0; i10 < 5; i10++) {
                if (canonicalDirPath.startsWith(canonicalDirPath3 + strArr[i10])) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        @NonNull
        @WorkerThread
        public WebResourceResponse handle(@NonNull String str) {
            File file = this.f24038a;
            try {
                File canonicalFileIfChild = AssetHelper.getCanonicalFileIfChild(file, str);
                if (canonicalFileIfChild != null) {
                    return new WebResourceResponse(AssetHelper.guessMimeType(str), null, AssetHelper.openFile(canonicalFileIfChild));
                }
                String.format("The requested file: %s is outside the mounted directory: %s", str, file);
                return new WebResourceResponse(null, null, null);
            } catch (IOException unused) {
            }
        }
    }

    public interface PathHandler {
        @Nullable
        @WorkerThread
        WebResourceResponse handle(@NonNull String str);
    }

    public static final class ResourcesPathHandler implements PathHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetHelper f24039a;

        public ResourcesPathHandler(@NonNull Context context) {
            this.f24039a = new AssetHelper(context);
        }

        @Override // androidx.webkit.WebViewAssetLoader.PathHandler
        @Nullable
        @WorkerThread
        public WebResourceResponse handle(@NonNull String str) {
            try {
                return new WebResourceResponse(AssetHelper.guessMimeType(str), null, this.f24039a.openResource(str));
            } catch (Resources.NotFoundException | IOException unused) {
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    @VisibleForTesting
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final String f24041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final String f24042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final PathHandler f24043d;

        public a(@NonNull String str, @NonNull String str2, boolean z10, @NonNull PathHandler pathHandler) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f24041b = str;
            this.f24042c = str2;
            this.f24040a = z10;
            this.f24043d = pathHandler;
        }
    }

    public WebViewAssetLoader(@NonNull ArrayList arrayList) {
        this.f24032a = arrayList;
    }

    @Nullable
    @WorkerThread
    public WebResourceResponse shouldInterceptRequest(@NonNull Uri uri) {
        WebResourceResponse webResourceResponseHandle;
        Iterator<a> it = this.f24032a.iterator();
        while (true) {
            PathHandler pathHandler = null;
            if (!it.hasNext()) {
                return null;
            }
            a next = it.next();
            next.getClass();
            boolean zEquals = uri.getScheme().equals(ProxyConfig.MATCH_HTTP);
            String str = next.f24042c;
            if ((!zEquals || next.f24040a) && ((uri.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri.getScheme().equals(ProxyConfig.MATCH_HTTPS)) && uri.getAuthority().equals(next.f24041b) && uri.getPath().startsWith(str))) {
                pathHandler = next.f24043d;
            }
            if (pathHandler != null && (webResourceResponseHandle = pathHandler.handle(uri.getPath().replaceFirst(str, ""))) != null) {
                return webResourceResponseHandle;
            }
        }
    }
}
