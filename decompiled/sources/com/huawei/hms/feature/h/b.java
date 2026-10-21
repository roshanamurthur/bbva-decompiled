package com.huawei.hms.feature.h;

import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.v;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* JADX INFO: loaded from: classes10.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f50338a = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50339b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f50340c = 22;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50341d = 101010256;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f50342e = 65535;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f50343f = 4294967295L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f50344g = 12;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f50345h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f50346i = 1347094023;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ByteBuffer f50347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Long f50348b;

        public a(ByteBuffer byteBuffer, Long l6) {
            this.f50347a = byteBuffer;
            this.f50348b = l6;
        }
    }

    private b() {
    }

    private static int a(ByteBuffer byteBuffer) {
        if (ByteOrder.LITTLE_ENDIAN != byteBuffer.order()) {
            throw new IllegalArgumentException("zipContents illegal");
        }
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i10 = iCapacity - 22;
        int iMin = Math.min(i10, 65535);
        for (int i11 = 0; i11 <= iMin; i11++) {
            int i12 = i10 - i11;
            if (101010256 == byteBuffer.getInt(i12) && i11 == (byteBuffer.getShort(i12 + 20) & UShort.MAX_VALUE)) {
                return i12;
            }
        }
        return -1;
    }

    public static long b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return ((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L;
        }
        throw new IllegalArgumentException("getZipCentralDirSizeBytes zipEocd illegal");
    }

    public static long c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
        }
        throw new IllegalArgumentException("zipEocd illegal");
    }

    public static a a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        a aVarA = a(randomAccessFile, 0);
        return aVarA != null ? aVarA : a(randomAccessFile, 65535);
    }

    private static a a(RandomAccessFile randomAccessFile, int i10) throws IOException {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException(g0.c("maxCommentSize: ", i10));
        }
        long length = randomAccessFile.length();
        if (22 > length) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, length - 22)) + 22);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        int iA = a(byteBufferAllocate);
        if (iA == -1) {
            return null;
        }
        byteBufferAllocate.position(iA);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(byteOrder);
        return new a(byteBufferSlice, Long.valueOf(jCapacity + ((long) iA)));
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("size: ", i10));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 > iLimit || i11 < iPosition) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0 || i11 < i10 || i11 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("illegal args");
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i11);
            byteBuffer.position(i10);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static void a(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 8) & 255);
        bArr[i11] = (byte) (i10 & 255);
    }

    public static void a(ByteBuffer byteBuffer, long j10) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("zipEocd order illegal");
        }
        if (j10 < 0 || j10 > 4294967295L) {
            throw new IllegalArgumentException(v.c("offset out range: ", j10));
        }
        byteBuffer.putInt(byteBuffer.position() + byteBuffer.position() + 16, (int) j10);
    }

    public static final boolean a(RandomAccessFile randomAccessFile, long j10) throws IOException {
        long j11 = j10 - 20;
        if (0 > j11) {
            return false;
        }
        randomAccessFile.seek(j11);
        return f50346i == randomAccessFile.readInt();
    }
}
