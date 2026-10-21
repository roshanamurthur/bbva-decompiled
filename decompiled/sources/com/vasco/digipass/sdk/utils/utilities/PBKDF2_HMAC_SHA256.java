package com.vasco.digipass.sdk.utils.utilities;

import bc.org.bouncycastle.crypto.digests.SHA256Digest;
import bc.org.bouncycastle.crypto.macs.HMac;
import c2.b;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o3;

/* JADX INFO: loaded from: classes9.dex */
public class PBKDF2_HMAC_SHA256 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o3 f65906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f65907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f65908c;

    public PBKDF2_HMAC_SHA256() {
        HMac hMac = new HMac(new SHA256Digest());
        this.f65906a = hMac;
        int macSize = hMac.getMacSize();
        this.f65907b = macSize;
        this.f65908c = new byte[macSize];
    }

    private void a(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    public byte[] generateDerivedKey(byte[] bArr, byte[] bArr2, int i10, int i11) {
        int i12 = this.f65907b;
        int iA = b.a(i11, i12, 1, i12);
        byte[] bArr3 = new byte[4];
        byte[] bArr4 = new byte[i12 * iA];
        for (int i13 = 1; i13 <= iA; i13++) {
            a(i13, bArr3);
            a(bArr, bArr2, i10, bArr3, bArr4, (i13 - 1) * this.f65907b);
        }
        byte[] bArr5 = new byte[i11];
        System.arraycopy(bArr4, 0, bArr5, 0, i11);
        return bArr5;
    }

    private void a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11) {
        byte[] bArr5 = new byte[bArr2.length + bArr3.length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr2.length, bArr3.length);
        byte[] outputData = UtilitiesSDK.hmac((byte) 3, bArr5, bArr).getOutputData();
        this.f65908c = outputData;
        System.arraycopy(outputData, 0, bArr4, i11, outputData.length);
        for (int i12 = 1; i12 < i10; i12++) {
            this.f65908c = UtilitiesSDK.hmac((byte) 3, this.f65908c, bArr).getOutputData();
            int i13 = 0;
            while (true) {
                byte[] bArr6 = this.f65908c;
                if (i13 != bArr6.length) {
                    int i14 = i11 + i13;
                    bArr4[i14] = (byte) (bArr6[i13] ^ bArr4[i14]);
                    i13++;
                }
            }
        }
    }
}
