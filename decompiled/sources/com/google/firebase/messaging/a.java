package com.google.firebase.messaging;

import com.esotericsoftware.kryo.util.Util;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: ByteStreams.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static byte[] a(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(C0215a c0215a) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, Util.maxArraySize - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = c0215a.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return a(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            long j10 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j10 > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
            }
        }
        if (c0215a.read() == -1) {
            return a(arrayDeque, Util.maxArraySize);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteStreams.java */
    public static final class C0215a extends FilterInputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long f48608p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f48609q0;

        public C0215a(InputStream inputStream) {
            super(inputStream);
            this.f48609q0 = -1L;
            this.f48608p0 = 1048577L;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f48608p0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f48609q0 = this.f48608p0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            if (this.f48608p0 == 0) {
                return -1;
            }
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f48608p0--;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f48609q0 == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f48608p0 = this.f48609q0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f48608p0));
            this.f48608p0 -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            long j10 = this.f48608p0;
            if (j10 == 0) {
                return -1;
            }
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
            if (i12 != -1) {
                this.f48608p0 -= (long) i12;
            }
            return i12;
        }
    }
}
