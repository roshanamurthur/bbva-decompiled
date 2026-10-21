package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class ByteBufferUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<byte[]> f38892a = new AtomicReference<>();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f38896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f38897c;

        public b(@NonNull byte[] bArr, int i10, int i11) {
            this.f38897c = bArr;
            this.f38895a = i10;
            this.f38896b = i11;
        }
    }

    @NonNull
    public static ByteBuffer fromFile(@NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static ByteBuffer fromStream(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference = f38892a;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i10 = inputStream.read(andSet);
            if (i10 < 0) {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return rewind(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i10);
        }
    }

    public static ByteBuffer rewind(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @NonNull
    public static byte[] toBytes(@NonNull ByteBuffer byteBuffer) {
        b bVar = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (bVar != null && bVar.f38895a == 0) {
            if (bVar.f38896b == bVar.f38897c.length) {
                return byteBuffer.array();
            }
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        rewind(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void toFile(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        rewind(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, RootService.RW);
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static InputStream toStream(@NonNull ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    public static class a extends InputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f38893p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f38894q0 = -1;

        public a(@NonNull ByteBuffer byteBuffer) {
            this.f38893p0 = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f38893p0.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i10) {
            this.f38894q0 = this.f38893p0.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f38893p0;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            int i10 = this.f38894q0;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f38893p0.position(i10);
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f38893p0;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, byteBuffer.remaining());
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public final int read(@NonNull byte[] bArr, int i10, int i11) {
            ByteBuffer byteBuffer = this.f38893p0;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, byteBuffer.remaining());
            byteBuffer.get(bArr, i10, iMin);
            return iMin;
        }
    }

    public static void toStream(@NonNull ByteBuffer byteBuffer, @NonNull OutputStream outputStream) throws IOException {
        b bVar = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (bVar != null) {
            int i10 = bVar.f38895a;
            outputStream.write(bVar.f38897c, i10, bVar.f38896b + i10);
            return;
        }
        AtomicReference<byte[]> atomicReference = f38892a;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int iMin = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, iMin);
            outputStream.write(andSet, 0, iMin);
        }
        atomicReference.set(andSet);
    }
}
