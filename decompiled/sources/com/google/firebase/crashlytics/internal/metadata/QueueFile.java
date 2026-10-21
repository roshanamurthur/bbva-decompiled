package com.google.firebase.crashlytics.internal.metadata;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class QueueFile implements Closeable {
    public static final Logger v0 = Logger.getLogger(QueueFile.class.getName());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RandomAccessFile f47833p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f47834q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f47835r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f47836s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f47837t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f47838u0;

    public interface ElementReader {
        void read(InputStream inputStream, int i10) throws IOException;
    }

    public class a implements ElementReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f47839a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f47840b;

        public a(StringBuilder sb2) {
            this.f47840b = sb2;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
        public final void read(InputStream inputStream, int i10) throws IOException {
            boolean z10 = this.f47839a;
            StringBuilder sb2 = this.f47840b;
            if (z10) {
                this.f47839a = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(i10);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f47841c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47843b;

        public b(int i10, int i11) {
            this.f47842a = i10;
            this.f47843b = i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f47842a);
            sb2.append(", length = ");
            return androidx.appcompat.widget.a.c(sb2, this.f47843b, Constant.BRACKET_CLOSE);
        }
    }

    public QueueFile(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f47838u0 = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(SvgConstantsKt.SPECIFIED_COLOR);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    u(i10, iArr[i11], bArr2);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f47833p0 = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iN = n(bArr, 0);
        this.f47834q0 = iN;
        if (iN > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f47834q0 + ", Actual length: " + randomAccessFile2.length());
        }
        this.f47835r0 = n(bArr, 4);
        int iN2 = n(bArr, 8);
        int iN3 = n(bArr, 12);
        this.f47836s0 = m(iN2);
        this.f47837t0 = m(iN3);
    }

    public static int n(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void u(int i10, int i11, byte[] bArr) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public final void c(byte[] bArr) throws IOException {
        int iS;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean zL = l();
                    if (zL) {
                        iS = 16;
                    } else {
                        b bVar = this.f47837t0;
                        iS = s(bVar.f47842a + 4 + bVar.f47843b);
                    }
                    b bVar2 = new b(iS, length);
                    u(0, length, this.f47838u0);
                    q(iS, this.f47838u0, 4);
                    q(iS + 4, bArr, length);
                    t(this.f47834q0, this.f47835r0 + 1, zL ? iS : this.f47836s0.f47842a, iS);
                    this.f47837t0 = bVar2;
                    this.f47835r0++;
                    if (zL) {
                        this.f47836s0 = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f47833p0.close();
    }

    public final synchronized void e() throws IOException {
        t(4096, 0, 0, 0);
        this.f47835r0 = 0;
        b bVar = b.f47841c;
        this.f47836s0 = bVar;
        this.f47837t0 = bVar;
        if (this.f47834q0 > 4096) {
            RandomAccessFile randomAccessFile = this.f47833p0;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f47834q0 = 4096;
    }

    public final void f(int i10) throws IOException {
        int i11 = i10 + 4;
        int iR = this.f47834q0 - r();
        if (iR >= i11) {
            return;
        }
        int i12 = this.f47834q0;
        do {
            iR += i12;
            i12 <<= 1;
        } while (iR < i11);
        RandomAccessFile randomAccessFile = this.f47833p0;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        b bVar = this.f47837t0;
        int iS = s(bVar.f47842a + 4 + bVar.f47843b);
        if (iS < this.f47836s0.f47842a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f47834q0);
            long j10 = iS - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f47837t0.f47842a;
        int i14 = this.f47836s0.f47842a;
        if (i13 < i14) {
            int i15 = (this.f47834q0 + i13) - 16;
            t(i12, this.f47835r0, i14, i15);
            this.f47837t0 = new b(i15, this.f47837t0.f47843b);
        } else {
            t(i12, this.f47835r0, i14, i13);
        }
        this.f47834q0 = i12;
    }

    public final synchronized void g(ElementReader elementReader) throws IOException {
        int iS = this.f47836s0.f47842a;
        for (int i10 = 0; i10 < this.f47835r0; i10++) {
            b bVarM = m(iS);
            elementReader.read(new c(bVarM), bVarM.f47843b);
            iS = s(bVarM.f47842a + 4 + bVarM.f47843b);
        }
    }

    public final synchronized boolean l() {
        return this.f47835r0 == 0;
    }

    public final b m(int i10) throws IOException {
        if (i10 == 0) {
            return b.f47841c;
        }
        RandomAccessFile randomAccessFile = this.f47833p0;
        randomAccessFile.seek(i10);
        return new b(i10, randomAccessFile.readInt());
    }

    public final synchronized void o() throws IOException {
        try {
            if (l()) {
                throw new NoSuchElementException();
            }
            if (this.f47835r0 == 1) {
                e();
            } else {
                b bVar = this.f47836s0;
                int iS = s(bVar.f47842a + 4 + bVar.f47843b);
                p(iS, 0, this.f47838u0, 4);
                int iN = n(this.f47838u0, 0);
                t(this.f47834q0, this.f47835r0 - 1, iS, this.f47837t0.f47842a);
                this.f47835r0--;
                this.f47836s0 = new b(iS, iN);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void p(int i10, int i11, byte[] bArr, int i12) throws IOException {
        int iS = s(i10);
        int i13 = iS + i12;
        int i14 = this.f47834q0;
        RandomAccessFile randomAccessFile = this.f47833p0;
        if (i13 <= i14) {
            randomAccessFile.seek(iS);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iS;
        randomAccessFile.seek(iS);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void q(int i10, byte[] bArr, int i11) throws IOException {
        int iS = s(i10);
        int i12 = iS + i11;
        int i13 = this.f47834q0;
        RandomAccessFile randomAccessFile = this.f47833p0;
        if (i12 <= i13) {
            randomAccessFile.seek(iS);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iS;
        randomAccessFile.seek(iS);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    public final int r() {
        if (this.f47835r0 == 0) {
            return 16;
        }
        b bVar = this.f47837t0;
        int i10 = bVar.f47842a;
        int i11 = this.f47836s0.f47842a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f47843b + 16 : (((i10 + 4) + bVar.f47843b) + this.f47834q0) - i11;
    }

    public final int s(int i10) {
        int i11 = this.f47834q0;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void t(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f47838u0;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.f47833p0;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                u(i15, iArr[i14], bArr);
                i15 += 4;
                i14++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(QueueFile.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f47834q0);
        sb2.append(", size=");
        sb2.append(this.f47835r0);
        sb2.append(", first=");
        sb2.append(this.f47836s0);
        sb2.append(", last=");
        sb2.append(this.f47837t0);
        sb2.append(", element lengths=[");
        try {
            g(new a(sb2));
        } catch (IOException e5) {
            v0.log(Level.WARNING, "read error", (Throwable) e5);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final class c extends InputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f47844p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f47845q0;

        public c(b bVar) {
            this.f47844p0 = QueueFile.this.s(bVar.f47842a + 4);
            this.f47845q0 = bVar.f47843b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f47845q0;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            int i13 = this.f47844p0;
            QueueFile queueFile = QueueFile.this;
            queueFile.p(i13, i10, bArr, i11);
            this.f47844p0 = queueFile.s(this.f47844p0 + i11);
            this.f47845q0 -= i11;
            return i11;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f47845q0 == 0) {
                return -1;
            }
            QueueFile queueFile = QueueFile.this;
            queueFile.f47833p0.seek(this.f47844p0);
            int i10 = queueFile.f47833p0.read();
            this.f47844p0 = queueFile.s(this.f47844p0 + 1);
            this.f47845q0--;
            return i10;
        }
    }
}
