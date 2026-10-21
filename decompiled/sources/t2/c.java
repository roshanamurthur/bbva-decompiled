package t2;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.documentfile.provider.DocumentFile;

/* JADX INFO: compiled from: SingleDocumentFile.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
public final class c extends DocumentFile {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f93441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f93442c;

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean canRead() {
        Context context = this.f93441b;
        Uri uri = this.f93442c;
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(a.e(context, uri, "mime_type"));
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean canWrite() {
        return a.a(this.f93441b, this.f93442c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final DocumentFile createDirectory(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final DocumentFile createFile(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean delete() {
        try {
            return DocumentsContract.deleteDocument(this.f93441b.getContentResolver(), this.f93442c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean exists() {
        return a.c(this.f93441b, this.f93442c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final String getName() {
        return a.e(this.f93441b, this.f93442c, "_display_name");
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final String getType() throws Throwable {
        String strE = a.e(this.f93441b, this.f93442c, "mime_type");
        if ("vnd.android.document/directory".equals(strE)) {
            return null;
        }
        return strE;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final Uri getUri() {
        return this.f93442c;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isDirectory() {
        return "vnd.android.document/directory".equals(a.e(this.f93441b, this.f93442c, "mime_type"));
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isFile() throws Throwable {
        String strE = a.e(this.f93441b, this.f93442c, "mime_type");
        return ("vnd.android.document/directory".equals(strE) || TextUtils.isEmpty(strE)) ? false : true;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isVirtual() {
        Context context = this.f93441b;
        Uri uri = this.f93442c;
        return DocumentsContract.isDocumentUri(context, uri) && (a.d(context, uri, "flags", 0L) & 512) != 0;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final long lastModified() {
        return a.d(this.f93441b, this.f93442c, "last_modified", 0L);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final long length() {
        return a.d(this.f93441b, this.f93442c, "_size", 0L);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final DocumentFile[] listFiles() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean renameTo(String str) {
        throw new UnsupportedOperationException();
    }
}
