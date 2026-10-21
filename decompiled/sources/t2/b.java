package t2;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import androidx.documentfile.provider.DocumentFile;
import com.bbva.network.constant.ConstantsKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: RawDocumentFile.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends DocumentFile {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f93440b;

    public b(@Nullable DocumentFile documentFile, File file) {
        super(documentFile);
        this.f93440b = file;
    }

    public static boolean a(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zA = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zA &= a(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    zA = false;
                }
            }
        }
        return zA;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean canRead() {
        return this.f93440b.canRead();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean canWrite() {
        return this.f93440b.canWrite();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final DocumentFile createDirectory(String str) {
        File file = new File(this.f93440b, str);
        if (file.isDirectory() || file.mkdir()) {
            return new b(this, file);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final DocumentFile createFile(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = androidx.camera.core.impl.utils.a.b(str2, Constant.DOT_STRING, extensionFromMimeType);
        }
        File file = new File(this.f93440b, str2);
        try {
            file.createNewFile();
            return new b(this, file);
        } catch (IOException e5) {
            Log.w("DocumentFile", "Failed to createFile: " + e5);
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean delete() {
        a(this.f93440b);
        return this.f93440b.delete();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean exists() {
        return this.f93440b.exists();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final String getName() {
        return this.f93440b.getName();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public final String getType() {
        if (this.f93440b.isDirectory()) {
            return null;
        }
        String name = this.f93440b.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(iLastIndexOf + 1).toLowerCase());
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return ConstantsKt.DEFAULT_MEDIATYPE;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final Uri getUri() {
        return Uri.fromFile(this.f93440b);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isDirectory() {
        return this.f93440b.isDirectory();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isFile() {
        return this.f93440b.isFile();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean isVirtual() {
        return false;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final long lastModified() {
        return this.f93440b.lastModified();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final long length() {
        return this.f93440b.length();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final DocumentFile[] listFiles() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f93440b.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new b(this, file));
            }
        }
        return (DocumentFile[]) arrayList.toArray(new DocumentFile[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final boolean renameTo(String str) {
        File file = new File(this.f93440b.getParentFile(), str);
        if (!this.f93440b.renameTo(file)) {
            return false;
        }
        this.f93440b = file;
        return true;
    }
}
