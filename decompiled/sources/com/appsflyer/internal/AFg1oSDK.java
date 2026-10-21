package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1oSDK extends FilterInputStream {
    private static final short AFInAppEventType = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFInAppEventParameterName;
    private int AFKeystoreWrapper;
    private int AFLogger;
    private int AFVersionDeclaration;
    private int afDebugLog;
    private int afErrorLog;
    private int afErrorLogForExcManagerOnly;
    private int afInfoLog;
    private int afRDLog;
    private int getLevel;
    private byte[] valueOf;
    private byte[] values;

    public AFg1oSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) throws IOException {
        super(inputStream);
        this.afErrorLog = Integer.MAX_VALUE;
        this.valueOf = new byte[8];
        this.AFInAppEventParameterName = new byte[8];
        this.values = new byte[8];
        this.AFKeystoreWrapper = 8;
        this.afInfoLog = 8;
        this.afDebugLog = Math.min(Math.max(i11, 5), 16);
        this.afRDLog = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, 8);
        }
        long j10 = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i10 != 0) {
            int i13 = (int) j10;
            this.AFLogger = i13;
            this.AFVersionDeclaration = i13 * i10;
            this.afErrorLogForExcManagerOnly = i13 ^ i10;
            this.getLevel = (int) (j10 >> 32);
            return;
        }
        this.AFLogger = (int) j10;
        long j11 = j10 >> 3;
        short s4 = AFInAppEventType;
        this.AFVersionDeclaration = (int) ((((long) s4) * j11) >> 32);
        this.afErrorLogForExcManagerOnly = (int) (j10 >> 32);
        this.getLevel = (int) (j11 + ((long) s4));
    }

    private int valueOf() throws IOException {
        if (this.afErrorLog == Integer.MAX_VALUE) {
            this.afErrorLog = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 8) {
            byte[] bArr = this.valueOf;
            int i10 = this.afErrorLog;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.valueOf, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            values();
            int i13 = ((FilterInputStream) this).in.read();
            this.afErrorLog = i13;
            this.AFKeystoreWrapper = 0;
            this.afInfoLog = i13 < 0 ? 8 - (this.valueOf[7] & 255) : 8;
        }
        return this.afInfoLog;
    }

    private void values() {
        if (this.afRDLog == 3) {
            byte[] bArr = this.valueOf;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.valueOf;
        int i10 = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = 0;
        while (true) {
            int i13 = this.afDebugLog;
            if (i12 >= i13) {
                break;
            }
            short s4 = AFInAppEventType;
            i11 -= ((((i13 - i12) * s4) + i10) ^ ((i10 << 4) + this.afErrorLogForExcManagerOnly)) ^ ((i10 >>> 5) + this.getLevel);
            i10 -= (((i11 << 4) + this.AFLogger) ^ (((i13 - i12) * s4) + i11)) ^ ((i11 >>> 5) + this.AFVersionDeclaration);
            i12++;
        }
        byte[] bArr3 = this.valueOf;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[1] = (byte) (i10 >> 16);
        bArr3[2] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.afRDLog == 3) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.valueOf;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.AFInAppEventParameterName[i14]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.AFInAppEventParameterName, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        valueOf();
        return this.afInfoLog - this.AFKeystoreWrapper;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        valueOf();
        int i10 = this.AFKeystoreWrapper;
        if (i10 >= this.afInfoLog) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.AFKeystoreWrapper = i10 + 1;
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
            valueOf();
            int i14 = this.AFKeystoreWrapper;
            if (i14 >= this.afInfoLog) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.valueOf;
            this.AFKeystoreWrapper = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
