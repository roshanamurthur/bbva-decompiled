package javax.mail.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import javax.mail.internet.SharedInputStream;

/* JADX INFO: loaded from: classes12.dex */
public class SharedFileInputStream extends BufferedInputStream implements SharedInputStream {
    protected long bufpos;
    protected int bufsize;
    protected long datalen;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    protected RandomAccessFile f79052in;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f79053p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public a f79054q0;
    protected long start;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RandomAccessFile f79056b;

        public final synchronized void a() throws IOException {
            int i10 = this.f79055a;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f79055a = i11;
                if (i11 <= 0) {
                    this.f79056b.close();
                }
            }
        }

        public final synchronized RandomAccessFile b() {
            this.f79055a++;
            return this.f79056b;
        }

        public final void finalize() throws Throwable {
            try {
                this.f79056b.close();
            } finally {
                super.finalize();
            }
        }
    }

    public SharedFileInputStream(File file) throws IOException {
        this(file, 2048);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        int i10;
        b();
        i10 = ((BufferedInputStream) this).count;
        return (i10 - ((BufferedInputStream) this).pos) + ((int) ((this.start + this.datalen) - (this.bufpos + ((long) i10))));
    }

    public final void b() throws IOException {
        if (this.f79052in == null) {
            throw new IOException("Stream closed");
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f79052in == null) {
            return;
        }
        try {
            if (this.f79053p0) {
                a aVar = this.f79054q0;
                synchronized (aVar) {
                    if (aVar.f79055a > 0) {
                        aVar.f79055a = 0;
                        aVar.f79056b.close();
                    } else {
                        try {
                            aVar.f79056b.close();
                        } catch (IOException unused) {
                        }
                    }
                }
            } else {
                this.f79054q0.a();
            }
            this.f79054q0 = null;
            this.f79052in = null;
            ((BufferedInputStream) this).buf = null;
        } catch (Throwable th2) {
            this.f79054q0 = null;
            this.f79052in = null;
            ((BufferedInputStream) this).buf = null;
            throw th2;
        }
    }

    public final void e() throws IOException {
        if (((BufferedInputStream) this).markpos < 0) {
            ((BufferedInputStream) this).pos = 0;
            this.bufpos += (long) ((BufferedInputStream) this).count;
        } else if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).buf.length) {
            int i10 = ((BufferedInputStream) this).markpos;
            if (i10 > 0) {
                int i11 = ((BufferedInputStream) this).pos - i10;
                System.arraycopy(((BufferedInputStream) this).buf, ((BufferedInputStream) this).markpos, ((BufferedInputStream) this).buf, 0, i11);
                ((BufferedInputStream) this).pos = i11;
                this.bufpos += (long) ((BufferedInputStream) this).markpos;
                ((BufferedInputStream) this).markpos = 0;
            } else {
                int length = ((BufferedInputStream) this).buf.length;
                int i12 = ((BufferedInputStream) this).marklimit;
                if (length >= i12) {
                    ((BufferedInputStream) this).markpos = -1;
                    ((BufferedInputStream) this).pos = 0;
                    this.bufpos += (long) ((BufferedInputStream) this).count;
                } else {
                    int i13 = ((BufferedInputStream) this).pos * 2;
                    if (i13 <= i12) {
                        i12 = i13;
                    }
                    byte[] bArr = new byte[i12];
                    System.arraycopy(((BufferedInputStream) this).buf, 0, bArr, 0, ((BufferedInputStream) this).pos);
                    ((BufferedInputStream) this).buf = bArr;
                }
            }
        }
        ((BufferedInputStream) this).count = ((BufferedInputStream) this).pos;
        int length2 = ((BufferedInputStream) this).buf.length;
        int i14 = ((BufferedInputStream) this).pos;
        int i15 = length2 - i14;
        long j10 = this.bufpos;
        long j11 = this.start;
        long j12 = (j10 - j11) + ((long) i14) + ((long) i15);
        long j13 = this.datalen;
        if (j12 > j13) {
            i15 = (int) (j13 - ((j10 - j11) + ((long) i14)));
        }
        synchronized (this.f79052in) {
            try {
                this.f79052in.seek(this.bufpos + ((long) ((BufferedInputStream) this).pos));
                int i16 = this.f79052in.read(((BufferedInputStream) this).buf, ((BufferedInputStream) this).pos, i15);
                if (i16 > 0) {
                    ((BufferedInputStream) this).count = i16 + ((BufferedInputStream) this).pos;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int f(int i10, int i11, byte[] bArr) throws IOException {
        int i12 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
        if (i12 <= 0) {
            e();
            i12 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
            if (i12 <= 0) {
                return -1;
            }
        }
        if (i12 < i11) {
            i11 = i12;
        }
        System.arraycopy(((BufferedInputStream) this).buf, ((BufferedInputStream) this).pos, bArr, i10, i11);
        ((BufferedInputStream) this).pos += i11;
        return i11;
    }

    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    @Override // javax.mail.internet.SharedInputStream
    public long getPosition() {
        if (this.f79052in != null) {
            return (this.bufpos + ((long) ((BufferedInputStream) this).pos)) - this.start;
        }
        throw new RuntimeException("Stream closed");
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        ((BufferedInputStream) this).marklimit = i10;
        ((BufferedInputStream) this).markpos = ((BufferedInputStream) this).pos;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // javax.mail.internet.SharedInputStream
    public synchronized InputStream newStream(long j10, long j11) {
        SharedFileInputStream sharedFileInputStream;
        try {
            if (this.f79052in == null) {
                throw new RuntimeException("Stream closed");
            }
            if (j10 < 0) {
                throw new IllegalArgumentException("start < 0");
            }
            if (j11 == -1) {
                j11 = this.datalen;
            }
            a aVar = this.f79054q0;
            long j12 = this.start + j10;
            long j13 = j11 - j10;
            int i10 = this.bufsize;
            sharedFileInputStream = new SharedFileInputStream((InputStream) null);
            sharedFileInputStream.start = 0L;
            sharedFileInputStream.f79053p0 = false;
            sharedFileInputStream.f79054q0 = aVar;
            sharedFileInputStream.f79052in = aVar.b();
            sharedFileInputStream.start = j12;
            sharedFileInputStream.bufpos = j12;
            sharedFileInputStream.datalen = j13;
            sharedFileInputStream.bufsize = i10;
            ((BufferedInputStream) sharedFileInputStream).buf = new byte[i10];
        } catch (Throwable th2) {
            throw th2;
        }
        return sharedFileInputStream;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        b();
        if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).count) {
            e();
            if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).count) {
                return -1;
            }
        }
        byte[] bArr = ((BufferedInputStream) this).buf;
        int i10 = ((BufferedInputStream) this).pos;
        ((BufferedInputStream) this).pos = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        b();
        int i10 = ((BufferedInputStream) this).markpos;
        if (i10 < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        ((BufferedInputStream) this).pos = i10;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        b();
        if (j10 <= 0) {
            return 0L;
        }
        long j11 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
        if (j11 <= 0) {
            e();
            j11 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
            if (j11 <= 0) {
                return 0L;
            }
        }
        if (j11 < j10) {
            j10 = j11;
        }
        ((BufferedInputStream) this).pos = (int) (((long) ((BufferedInputStream) this).pos) + j10);
        return j10;
    }

    public SharedFileInputStream(String str) throws IOException {
        this(str, 2048);
    }

    public SharedFileInputStream(File file, int i10) throws IOException {
        super(null);
        this.start = 0L;
        this.f79053p0 = true;
        if (i10 > 0) {
            a aVar = new a();
            aVar.f79056b = new RandomAccessFile(file, "r");
            this.f79054q0 = aVar;
            RandomAccessFile randomAccessFileB = aVar.b();
            this.f79052in = randomAccessFileB;
            this.start = 0L;
            this.datalen = randomAccessFileB.length();
            this.bufsize = i10;
            ((BufferedInputStream) this).buf = new byte[i10];
            return;
        }
        throw new IllegalArgumentException("Buffer size <= 0");
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        b();
        int i12 = i10 + i11;
        if ((i10 | i11 | i12 | (bArr.length - i12)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int iF = f(i10, i11, bArr);
        if (iF <= 0) {
            return iF;
        }
        while (iF < i11) {
            int iF2 = f(i10 + iF, i11 - iF, bArr);
            if (iF2 <= 0) {
                break;
            }
            iF += iF2;
        }
        return iF;
    }

    public SharedFileInputStream(String str, int i10) throws IOException {
        super(null);
        this.start = 0L;
        this.f79053p0 = true;
        if (i10 > 0) {
            a aVar = new a();
            aVar.f79056b = new RandomAccessFile(str, "r");
            this.f79054q0 = aVar;
            RandomAccessFile randomAccessFileB = aVar.b();
            this.f79052in = randomAccessFileB;
            this.start = 0L;
            this.datalen = randomAccessFileB.length();
            this.bufsize = i10;
            ((BufferedInputStream) this).buf = new byte[i10];
            return;
        }
        throw new IllegalArgumentException("Buffer size <= 0");
    }
}
