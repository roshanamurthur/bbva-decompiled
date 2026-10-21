package si;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: AppendStream.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final f f93197p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RandomAccessFile f93198q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f93199r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f93200s0;

    public a(f fVar) throws IOException {
        this.f93197p0 = fVar;
        RandomAccessFile randomAccessFile = fVar.f93222r0;
        this.f93198q0 = randomAccessFile;
        long length = randomAccessFile.length();
        this.f93199r0 = length;
        this.f93198q0.seek(length);
    }

    public final synchronized InputStream b() throws IOException {
        return this.f93197p0.newStream(this.f93199r0, this.f93200s0);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f93200s0 = this.f93197p0.l();
        this.f93198q0 = null;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f93198q0.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f93198q0.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f93198q0.write(bArr, i10, i11);
    }
}
