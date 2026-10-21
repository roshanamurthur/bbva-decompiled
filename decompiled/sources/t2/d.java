package t2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.documentfile.provider.DocumentFile;
import java.util.ArrayList;

/* JADX INFO: compiled from: TreeDocumentFile.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class d extends DocumentFile {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f93443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f93444c;

    public d(@Nullable DocumentFile documentFile, Context context, Uri uri) {
        super(documentFile);
        this.f93443b = context;
        this.f93444c = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean canRead() {
        Context context = this.f93443b;
        Uri uri = this.f93444c;
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(a.e(context, uri, "mime_type"));
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean canWrite() {
        return a.a(this.f93443b, this.f93444c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final DocumentFile createDirectory(String str) {
        Uri uriCreateDocument;
        Uri uri = this.f93444c;
        Context context = this.f93443b;
        try {
            uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), uri, "vnd.android.document/directory", str);
        } catch (Exception unused) {
            uriCreateDocument = null;
        }
        if (uriCreateDocument != null) {
            return new d(this, context, uriCreateDocument);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final DocumentFile createFile(String str, String str2) {
        Uri uriCreateDocument;
        Uri uri = this.f93444c;
        Context context = this.f93443b;
        try {
            uriCreateDocument = DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            uriCreateDocument = null;
        }
        if (uriCreateDocument != null) {
            return new d(this, context, uriCreateDocument);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean delete() {
        try {
            return DocumentsContract.deleteDocument(this.f93443b.getContentResolver(), this.f93444c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean exists() {
        return a.c(this.f93443b, this.f93444c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final String getName() {
        return a.e(this.f93443b, this.f93444c, "_display_name");
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final String getType() throws Throwable {
        String strE = a.e(this.f93443b, this.f93444c, "mime_type");
        if ("vnd.android.document/directory".equals(strE)) {
            return null;
        }
        return strE;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final Uri getUri() {
        return this.f93444c;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isDirectory() {
        return "vnd.android.document/directory".equals(a.e(this.f93443b, this.f93444c, "mime_type"));
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isFile() throws Throwable {
        String strE = a.e(this.f93443b, this.f93444c, "mime_type");
        return ("vnd.android.document/directory".equals(strE) || TextUtils.isEmpty(strE)) ? false : true;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isVirtual() {
        Context context = this.f93443b;
        Uri uri = this.f93444c;
        return DocumentsContract.isDocumentUri(context, uri) && (a.d(context, uri, "flags", 0L) & 512) != 0;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final long lastModified() {
        return a.d(this.f93443b, this.f93444c, "last_modified", 0L);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final long length() {
        return a.d(this.f93443b, this.f93444c, "_size", 0L);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[LOOP:1: B:23:0x0070->B:25:0x0073, LOOP_END] */
    @Override // androidx.documentfile.provider.DocumentFile
    public final DocumentFile[] listFiles() {
        Uri[] uriArr;
        DocumentFile[] documentFileArr;
        Context context = this.f93443b;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = this.f93444c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f93444c, cursorQuery.getString(0)));
                    }
                    try {
                        cursorQuery.close();
                    } catch (RuntimeException e5) {
                        throw e5;
                    }
                } catch (Exception e7) {
                    Log.w("DocumentFile", "Failed query: " + e7);
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (RuntimeException e10) {
                            throw e10;
                        }
                    }
                    uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                    documentFileArr = new DocumentFile[uriArr.length];
                    for (int i10 = 0; i10 < uriArr.length; i10++) {
                        documentFileArr[i10] = new d(this, context, uriArr[i10]);
                    }
                    return documentFileArr;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (Exception unused2) {
        }
        uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        documentFileArr = new DocumentFile[uriArr.length];
        while (i10 < uriArr.length) {
            documentFileArr[i10] = new d(this, context, uriArr[i10]);
        }
        return documentFileArr;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean renameTo(String str) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f93443b.getContentResolver(), this.f93444c, str);
            if (uriRenameDocument != null) {
                this.f93444c = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
