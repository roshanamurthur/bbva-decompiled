package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1rSDK extends FilterInputStream {
    private long[] AFInAppEventParameterName;
    private final int AFInAppEventType;
    private long[] AFKeystoreWrapper;
    private int AFLogger;
    private int afErrorLog;
    private int afInfoLog;
    private short valueOf;
    private byte[] values;

    public AFg1rSDK(InputStream inputStream, int i10, int i11, short s4, int i12, int i13) throws IOException {
        super(inputStream);
        this.afInfoLog = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s4, 4), 8);
        this.AFInAppEventType = iMin;
        this.values = new byte[iMin];
        this.AFKeystoreWrapper = new long[4];
        this.AFInAppEventParameterName = new long[4];
        this.AFLogger = iMin;
        this.afErrorLog = iMin;
        this.AFKeystoreWrapper = AFg1vSDK.AFInAppEventParameterName(i10 ^ i13, iMin ^ i13);
        this.AFInAppEventParameterName = AFg1vSDK.AFInAppEventParameterName(i11 ^ i13, i12 ^ i13);
    }

    private int AFInAppEventType() throws IOException {
        int i10;
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == this.AFInAppEventType) {
            byte[] bArr = this.values;
            int i11 = this.afInfoLog;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.values, i12, this.AFInAppEventType - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < this.AFInAppEventType);
            if (i12 < this.AFInAppEventType) {
                throw new IllegalStateException("unexpected block size");
            }
            values();
            int i14 = ((FilterInputStream) this).in.read();
            this.afInfoLog = i14;
            this.AFLogger = 0;
            if (i14 < 0) {
                int i15 = this.AFInAppEventType;
                i10 = i15 - (this.values[i15 - 1] & 255);
            } else {
                i10 = this.AFInAppEventType;
            }
            this.afErrorLog = i10;
        }
        return this.afErrorLog;
    }

    private void values() {
        long[] jArr = this.AFKeystoreWrapper;
        long[] jArr2 = this.AFInAppEventParameterName;
        short s4 = this.valueOf;
        long j10 = jArr[s4 % 4] * 2147483085;
        long j11 = jArr2[(s4 + 2) % 4];
        int i10 = (s4 + 3) % 4;
        jArr2[i10] = ((jArr[i10] * 2147483085) + j11) / 2147483647L;
        jArr[i10] = (j10 + j11) % 2147483647L;
        for (int i11 = 0; i11 < this.AFInAppEventType; i11++) {
            byte[] bArr = this.values;
            bArr[i11] = (byte) (((long) bArr[i11]) ^ ((this.AFKeystoreWrapper[this.valueOf] >> (i11 << 3)) & 255));
        }
        this.valueOf = (short) ((this.valueOf + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.afErrorLog - this.AFLogger;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i10 = this.AFLogger;
        if (i10 >= this.afErrorLog) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFLogger = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFInAppEventType();
            int i14 = this.AFLogger;
            if (i14 >= this.afErrorLog) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.values;
            this.AFLogger = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
