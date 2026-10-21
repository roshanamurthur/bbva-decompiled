package net.lingala.zip4j.io.inputstream;

import androidx.camera.camera2.internal.h0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.util.FileUtils;

/* JADX INFO: loaded from: classes12.dex */
public class NumberedSplitRandomAccessFile extends RandomAccessFile {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f84945p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final File[] f84946q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RandomAccessFile f84947r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f84948s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f84949t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f84950u0;

    public NumberedSplitRandomAccessFile(String str, String str2) throws IOException {
        this(new File(str), str2);
    }

    public final void a(int i10) throws IOException {
        if (this.f84949t0 == i10) {
            return;
        }
        File[] fileArr = this.f84946q0;
        if (i10 > fileArr.length - 1) {
            throw new IOException("split counter greater than number of split files");
        }
        RandomAccessFile randomAccessFile = this.f84947r0;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.f84947r0 = new RandomAccessFile(fileArr[i10], this.f84950u0);
        this.f84949t0 = i10;
    }

    @Override // java.io.RandomAccessFile
    public long getFilePointer() throws IOException {
        return this.f84947r0.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public long length() throws IOException {
        return this.f84947r0.length();
    }

    public void openLastSplitFileForReading() throws IOException {
        a(this.f84946q0.length - 1);
    }

    @Override // java.io.RandomAccessFile
    public int read() throws IOException {
        byte[] bArr = this.f84948s0;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.RandomAccessFile
    public void seek(long j10) throws IOException {
        long j11 = this.f84945p0;
        int i10 = (int) (j10 / j11);
        if (i10 != this.f84949t0) {
            a(i10);
        }
        this.f84947r0.seek(j10 - (((long) i10) * j11));
    }

    public void seekInCurrentPart(long j10) throws IOException {
        this.f84947r0.seek(j10);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(int i10) throws IOException {
        throw new UnsupportedOperationException();
    }

    public NumberedSplitRandomAccessFile(File file, String str) throws IOException {
        this(file, str, FileUtils.getAllSortedNumberedSplitFiles(file));
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public NumberedSplitRandomAccessFile(File file, String str, File[] fileArr) throws IOException {
        super(file, str);
        int i10 = 1;
        this.f84948s0 = new byte[1];
        this.f84949t0 = 0;
        super.close();
        if (!RandomAccessFileMode.WRITE.getValue().equals(str)) {
            for (File file2 : fileArr) {
                String fileExtension = FileUtils.getFileExtension(file2);
                try {
                    if (i10 != Integer.parseInt(fileExtension)) {
                        throw new IOException("Split file number " + i10 + " does not exist");
                    }
                    i10++;
                } catch (NumberFormatException unused) {
                    throw new IOException(h0.b("Split file extension not in expected format. Found: ", fileExtension, " expected of format: .001, .002, etc"));
                }
            }
            this.f84947r0 = new RandomAccessFile(file, str);
            this.f84946q0 = fileArr;
            this.f84945p0 = file.length();
            this.f84950u0 = str;
            return;
        }
        throw new IllegalArgumentException("write mode is not allowed for NumberedSplitRandomAccessFile");
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f84947r0.read(bArr, i10, i11);
        if (i12 != -1) {
            return i12;
        }
        int i13 = this.f84949t0;
        if (i13 == this.f84946q0.length - 1) {
            return -1;
        }
        a(i13 + 1);
        return read(bArr, i10, i11);
    }
}
