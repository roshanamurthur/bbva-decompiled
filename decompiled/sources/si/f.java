package si;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.mail.util.SharedFileInputStream;

/* JADX INFO: compiled from: WritableSharedFile.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f extends SharedFileInputStream {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RandomAccessFile f93222r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f93223s0;

    public f(File file) throws IOException {
        super(file);
        try {
            this.f93222r0 = new RandomAccessFile(file, RootService.RW);
        } catch (IOException unused) {
            super.close();
        }
    }

    @Override // javax.mail.util.SharedFileInputStream, java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f93222r0;
        try {
            super.close();
        } finally {
            randomAccessFile.close();
        }
    }

    public final synchronized long l() throws IOException {
        long length;
        length = this.f79052in.length();
        this.datalen = length;
        this.f93223s0 = null;
        return length;
    }
}
