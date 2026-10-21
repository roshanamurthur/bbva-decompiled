package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DocumentsContractCompat {

    public static final class DocumentCompat {
        public static final int FLAG_VIRTUAL_DOCUMENT = 512;
    }

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @DoNotInline
        public static boolean b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @DoNotInline
        public static String c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @DoNotInline
        public static boolean d(Context context, @Nullable Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    @RequiresApi(21)
    public static class b {
        @DoNotInline
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @DoNotInline
        public static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @DoNotInline
        public static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @DoNotInline
        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @DoNotInline
        public static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @DoNotInline
        public static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @DoNotInline
        public static Uri g(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    @RequiresApi(24)
    public static class c {
        @DoNotInline
        public static boolean a(@NonNull Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @DoNotInline
        public static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    @Nullable
    public static Uri buildChildDocumentsUri(@NonNull String str, @Nullable String str2) {
        return b.a(str, str2);
    }

    @Nullable
    public static Uri buildChildDocumentsUriUsingTree(@NonNull Uri uri, @NonNull String str) {
        return b.b(uri, str);
    }

    @Nullable
    public static Uri buildDocumentUri(@NonNull String str, @NonNull String str2) {
        return a.a(str, str2);
    }

    @Nullable
    public static Uri buildDocumentUriUsingTree(@NonNull Uri uri, @NonNull String str) {
        return b.c(uri, str);
    }

    @Nullable
    public static Uri buildTreeDocumentUri(@NonNull String str, @NonNull String str2) {
        return b.d(str, str2);
    }

    @Nullable
    public static Uri createDocument(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str, @NonNull String str2) throws FileNotFoundException {
        return b.e(contentResolver, uri, str, str2);
    }

    @Nullable
    public static String getDocumentId(@NonNull Uri uri) {
        return a.c(uri);
    }

    @Nullable
    public static String getTreeDocumentId(@NonNull Uri uri) {
        return b.f(uri);
    }

    public static boolean isDocumentUri(@NonNull Context context, @Nullable Uri uri) {
        return a.d(context, uri);
    }

    public static boolean isTreeUri(@NonNull Uri uri) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.a(uri);
        }
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.size() >= 2 && "tree".equals(pathSegments.get(0));
    }

    public static boolean removeDocument(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull Uri uri2) throws FileNotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? c.b(contentResolver, uri, uri2) : a.b(contentResolver, uri);
    }

    @Nullable
    public static Uri renameDocument(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return b.g(contentResolver, uri, str);
    }
}
