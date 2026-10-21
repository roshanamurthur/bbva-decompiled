package javax.activation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class FileDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f78862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileTypeMap f78863b;

    public FileDataSource(File file) {
        this.f78863b = null;
        this.f78862a = file;
    }

    @Override // javax.activation.DataSource
    public String getContentType() {
        FileTypeMap fileTypeMap = this.f78863b;
        File file = this.f78862a;
        return fileTypeMap == null ? FileTypeMap.getDefaultFileTypeMap().getContentType(file) : fileTypeMap.getContentType(file);
    }

    public File getFile() {
        return this.f78862a;
    }

    @Override // javax.activation.DataSource
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.f78862a);
    }

    @Override // javax.activation.DataSource
    public String getName() {
        return this.f78862a.getName();
    }

    @Override // javax.activation.DataSource
    public OutputStream getOutputStream() throws IOException {
        return new FileOutputStream(this.f78862a);
    }

    public void setFileTypeMap(FileTypeMap fileTypeMap) {
        this.f78863b = fileTypeMap;
    }

    public FileDataSource(String str) {
        this(new File(str));
    }
}
