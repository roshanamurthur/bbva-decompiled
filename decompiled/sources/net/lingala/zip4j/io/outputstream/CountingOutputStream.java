package net.lingala.zip4j.io.outputstream;

import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: loaded from: classes12.dex */
public class CountingOutputStream extends OutputStream implements OutputStreamWithSplitZipSupport {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final OutputStream f84978p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f84979q0 = 0;

    public CountingOutputStream(OutputStream outputStream) {
        this.f84978p0 = outputStream;
    }

    public boolean checkBuffSizeAndStartNextSplitFile(int i10) throws ZipException {
        if (isSplitZipFile()) {
            return ((SplitOutputStream) this.f84978p0).checkBufferSizeAndStartNextSplitFile(i10);
        }
        return false;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f84978p0.close();
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public int getCurrentSplitFileCounter() {
        if (isSplitZipFile()) {
            return ((SplitOutputStream) this.f84978p0).getCurrentSplitFileCounter();
        }
        return 0;
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public long getFilePointer() throws IOException {
        OutputStream outputStream = this.f84978p0;
        return outputStream instanceof SplitOutputStream ? ((SplitOutputStream) outputStream).getFilePointer() : this.f84979q0;
    }

    public long getNumberOfBytesWritten() throws IOException {
        OutputStream outputStream = this.f84978p0;
        return outputStream instanceof SplitOutputStream ? ((SplitOutputStream) outputStream).getFilePointer() : this.f84979q0;
    }

    public long getOffsetForNextEntry() throws IOException {
        OutputStream outputStream = this.f84978p0;
        return outputStream instanceof SplitOutputStream ? ((SplitOutputStream) outputStream).getFilePointer() : this.f84979q0;
    }

    public long getSplitLength() {
        if (isSplitZipFile()) {
            return ((SplitOutputStream) this.f84978p0).getSplitLength();
        }
        return 0L;
    }

    public boolean isSplitZipFile() {
        OutputStream outputStream = this.f84978p0;
        return (outputStream instanceof SplitOutputStream) && ((SplitOutputStream) outputStream).isSplitZipFile();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f84978p0.write(bArr, i10, i11);
        this.f84979q0 += (long) i11;
    }
}
