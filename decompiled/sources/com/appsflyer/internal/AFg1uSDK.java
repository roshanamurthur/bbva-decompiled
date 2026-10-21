package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class AFg1uSDK extends FilterInputStream {
    private AFg1sSDK AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger;
    private int afDebugLog;
    private int[] afErrorLog;
    private int afInfoLog;
    private int afRDLog;
    private final int valueOf;
    private byte[] values;

    public AFg1uSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z10, int i11) throws IOException {
        super(inputStream);
        this.afInfoLog = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i10, 3), 16);
        this.valueOf = iMin;
        this.AFInAppEventType = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFKeystoreWrapper = bArr2;
        this.values = new byte[8];
        this.afErrorLog = new int[2];
        this.AFLogger = 8;
        this.afRDLog = 8;
        this.afDebugLog = i11;
        if (i11 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.AFInAppEventParameterName = new AFg1sSDK(iArr, iMin, true, false);
    }

    private void AFInAppEventParameterName() {
        if (this.afDebugLog == 2) {
            byte[] bArr = this.AFInAppEventType;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.AFInAppEventType;
        int i10 = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = this.valueOf;
        AFg1sSDK aFg1sSDK = this.AFInAppEventParameterName;
        AFg1tSDK.AFInAppEventParameterName(i10, i11, false, i12, aFg1sSDK.valueOf, aFg1sSDK.AFKeystoreWrapper, this.afErrorLog);
        int[] iArr = this.afErrorLog;
        int i13 = iArr[0];
        int i14 = iArr[1];
        byte[] bArr3 = this.AFInAppEventType;
        bArr3[0] = (byte) (i13 >> 24);
        bArr3[1] = (byte) (i13 >> 16);
        bArr3[2] = (byte) (i13 >> 8);
        bArr3[3] = (byte) i13;
        bArr3[4] = (byte) (i14 >> 24);
        bArr3[5] = (byte) (i14 >> 16);
        bArr3[6] = (byte) (i14 >> 8);
        bArr3[7] = (byte) i14;
        if (this.afDebugLog == 2) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.AFInAppEventType;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.AFKeystoreWrapper[i15]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    private int AFKeystoreWrapper() throws IOException {
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == 8) {
            byte[] bArr = this.AFInAppEventType;
            int i10 = this.afInfoLog;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.AFInAppEventType, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            AFInAppEventParameterName();
            int i13 = ((FilterInputStream) this).in.read();
            this.afInfoLog = i13;
            this.AFLogger = 0;
            this.afRDLog = i13 < 0 ? 8 - (this.AFInAppEventType[7] & 255) : 8;
        }
        return this.afRDLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.afRDLog - this.AFLogger;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i10 = this.AFLogger;
        if (i10 >= this.afRDLog) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventType;
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
            AFKeystoreWrapper();
            int i14 = this.AFLogger;
            if (i14 >= this.afRDLog) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.AFInAppEventType;
            this.AFLogger = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
