package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import t2.b;
import t2.c;
import t2.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DocumentFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final DocumentFile f21161a;

    public DocumentFile(@Nullable DocumentFile documentFile) {
        this.f21161a = documentFile;
    }

    @NonNull
    public static DocumentFile fromFile(@NonNull File file) {
        return new b(null, file);
    }

    @Nullable
    public static DocumentFile fromSingleUri(@NonNull Context context, @NonNull Uri uri) {
        c cVar = new c(null);
        cVar.f93441b = context;
        cVar.f93442c = uri;
        return cVar;
    }

    @Nullable
    public static DocumentFile fromTreeUri(@NonNull Context context, @NonNull Uri uri) {
        return new d(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean isDocumentUri(@NonNull Context context, @Nullable Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    @Nullable
    public abstract DocumentFile createDirectory(@NonNull String str);

    @Nullable
    public abstract DocumentFile createFile(@NonNull String str, @NonNull String str2);

    public abstract boolean delete();

    public abstract boolean exists();

    @Nullable
    public DocumentFile findFile(@NonNull String str) {
        for (DocumentFile documentFile : listFiles()) {
            if (str.equals(documentFile.getName())) {
                return documentFile;
            }
        }
        return null;
    }

    @Nullable
    public abstract String getName();

    @Nullable
    public DocumentFile getParentFile() {
        return this.f21161a;
    }

    @Nullable
    public abstract String getType();

    @NonNull
    public abstract Uri getUri();

    public abstract boolean isDirectory();

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    @NonNull
    public abstract DocumentFile[] listFiles();

    public abstract boolean renameTo(@NonNull String str);
}
