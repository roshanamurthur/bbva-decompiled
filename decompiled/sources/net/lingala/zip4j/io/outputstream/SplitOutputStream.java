package net.lingala.zip4j.io.outputstream;

import androidx.camera.core.impl.utils.a;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.RawIO;

/* JADX INFO: loaded from: classes12.dex */
public class SplitOutputStream extends OutputStream implements OutputStreamWithSplitZipSupport {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RandomAccessFile f84980p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f84981q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public File f84982r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f84983s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f84984t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final RawIO f84985u0;

    public SplitOutputStream(File file) throws ZipException, FileNotFoundException {
        this(file, -1L);
    }

    public final void b() throws IOException {
        String str;
        String zipFileNameWithoutExtension = FileUtils.getZipFileNameWithoutExtension(this.f84982r0.getName());
        String absolutePath = this.f84982r0.getAbsolutePath();
        if (this.f84982r0.getParent() == null) {
            str = "";
        } else {
            str = this.f84982r0.getParent() + System.getProperty("file.separator");
        }
        String str2 = ".z0" + (this.f84983s0 + 1);
        if (this.f84983s0 >= 9) {
            str2 = ".z" + (this.f84983s0 + 1);
        }
        File file = new File(a.b(str, zipFileNameWithoutExtension, str2));
        this.f84980p0.close();
        if (file.exists()) {
            throw new IOException("split file: " + file.getName() + " already exists in the current directory, cannot rename this file");
        }
        if (!this.f84982r0.renameTo(file)) {
            throw new IOException("cannot rename newly created split file");
        }
        this.f84982r0 = new File(absolutePath);
        this.f84980p0 = new RandomAccessFile(this.f84982r0, RandomAccessFileMode.WRITE.getValue());
        this.f84983s0++;
    }

    public boolean checkBufferSizeAndStartNextSplitFile(int i10) throws ZipException {
        if (i10 < 0) {
            throw new ZipException("negative buffersize for checkBufferSizeAndStartNextSplitFile");
        }
        long j10 = this.f84981q0;
        if (j10 < SvgConstantsKt.SPECIFIED_FONT_STYLE || this.f84984t0 + ((long) i10) <= j10) {
            return false;
        }
        try {
            b();
            this.f84984t0 = 0L;
            return true;
        } catch (IOException e5) {
            throw new ZipException(e5);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f84980p0.close();
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public int getCurrentSplitFileCounter() {
        return this.f84983s0;
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public long getFilePointer() throws IOException {
        return this.f84980p0.getFilePointer();
    }

    public long getSplitLength() {
        return this.f84981q0;
    }

    public boolean isSplitZipFile() {
        return this.f84981q0 != -1;
    }

    public void seek(long j10) throws IOException {
        this.f84980p0.seek(j10);
    }

    public int skipBytes(int i10) throws IOException {
        return this.f84980p0.skipBytes(i10);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    public SplitOutputStream(File file, long j10) throws ZipException, FileNotFoundException {
        this.f84985u0 = new RawIO();
        if (j10 >= 0 && j10 < SvgConstantsKt.SPECIFIED_FONT_STYLE) {
            throw new ZipException("split length less than minimum allowed split length of 65536 Bytes");
        }
        this.f84980p0 = new RandomAccessFile(file, RandomAccessFileMode.WRITE.getValue());
        this.f84981q0 = j10;
        this.f84982r0 = file;
        this.f84983s0 = 0;
        this.f84984t0 = 0L;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 <= 0) {
            return;
        }
        long j10 = this.f84981q0;
        if (j10 == -1) {
            this.f84980p0.write(bArr, i10, i11);
            this.f84984t0 += (long) i11;
            return;
        }
        long j11 = this.f84984t0;
        if (j11 >= j10) {
            b();
            this.f84980p0.write(bArr, i10, i11);
            this.f84984t0 = i11;
            return;
        }
        long j12 = i11;
        if (j11 + j12 > j10) {
            int intLittleEndian = this.f84985u0.readIntLittleEndian(bArr);
            for (HeaderSignature headerSignature : HeaderSignature.values()) {
                if (headerSignature != HeaderSignature.SPLIT_ZIP && headerSignature.getValue() == intLittleEndian) {
                    b();
                    this.f84980p0.write(bArr, i10, i11);
                    this.f84984t0 = j12;
                    return;
                }
            }
            this.f84980p0.write(bArr, i10, (int) (j10 - this.f84984t0));
            b();
            RandomAccessFile randomAccessFile = this.f84980p0;
            long j13 = this.f84984t0;
            randomAccessFile.write(bArr, i10 + ((int) (j10 - j13)), (int) (j12 - (j10 - j13)));
            this.f84984t0 = j12 - (j10 - this.f84984t0);
            return;
        }
        this.f84980p0.write(bArr, i10, i11);
        this.f84984t0 += j12;
    }
}
