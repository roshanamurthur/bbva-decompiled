package net.lingala.zip4j.io.inputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;

/* JADX INFO: loaded from: classes12.dex */
public abstract class SplitInputStream extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f84951p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f84952q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f84953r0 = new byte[1];
    protected RandomAccessFile randomAccessFile;
    protected File zipFile;

    public SplitInputStream(File file, boolean z10, int i10) throws FileNotFoundException {
        this.f84952q0 = 0;
        this.randomAccessFile = new RandomAccessFile(file, RandomAccessFileMode.READ.getValue());
        this.zipFile = file;
        this.f84951p0 = z10;
        if (z10) {
            this.f84952q0 = i10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    public abstract File getNextSplitFile(int i10) throws IOException;

    public void openRandomAccessFileForIndex(int i10) throws IOException {
        File nextSplitFile = getNextSplitFile(i10);
        if (nextSplitFile.exists()) {
            this.randomAccessFile.close();
            this.randomAccessFile = new RandomAccessFile(nextSplitFile, RandomAccessFileMode.READ.getValue());
        } else {
            throw new FileNotFoundException("zip split file does not exist: " + nextSplitFile);
        }
    }

    public void prepareExtractionForFileHeader(FileHeader fileHeader) throws IOException {
        if (this.f84951p0 && this.f84952q0 != fileHeader.getDiskNumberStart()) {
            openRandomAccessFileForIndex(fileHeader.getDiskNumberStart());
            this.f84952q0 = fileHeader.getDiskNumberStart();
        }
        this.randomAccessFile.seek(fileHeader.getOffsetLocalHeader());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f84953r0;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.randomAccessFile.read(bArr, i10, i11);
        if ((i12 == i11 && i12 != -1) || !this.f84951p0) {
            return i12;
        }
        openRandomAccessFileForIndex(this.f84952q0 + 1);
        this.f84952q0++;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = this.randomAccessFile.read(bArr, i12, i11 - i12);
        return i13 > 0 ? i12 + i13 : i12;
    }
}
