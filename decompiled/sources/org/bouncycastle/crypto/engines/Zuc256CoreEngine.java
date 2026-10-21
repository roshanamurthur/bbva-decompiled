package org.bouncycastle.crypto.engines;

import androidx.appcompat.widget.g0;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public class Zuc256CoreEngine extends Zuc128CoreEngine {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f88658l = {34, 47, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    public static final byte[] m = {34, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f88659n = {35, 47, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f88660o = {35, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f88661k;

    public Zuc256CoreEngine() {
        this.f88661k = f88658l;
    }

    public static int i(byte b10, byte b11, byte b12, byte b13) {
        return ((b10 & 255) << 23) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new Zuc256CoreEngine(this);
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Zuc-256";
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine
    public int getMaxIterations() {
        return 625;
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        super.reset(memoable);
        this.f88661k = ((Zuc256CoreEngine) memoable).f88661k;
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine
    public void setKeyAndIV(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("A key of 32 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 25) {
            throw new IllegalArgumentException("An IV of 25 bytes is needed");
        }
        iArr[0] = i(bArr[0], this.f88661k[0], bArr[21], bArr[16]);
        iArr[1] = i(bArr[1], this.f88661k[1], bArr[22], bArr[17]);
        iArr[2] = i(bArr[2], this.f88661k[2], bArr[23], bArr[18]);
        iArr[3] = i(bArr[3], this.f88661k[3], bArr[24], bArr[19]);
        iArr[4] = i(bArr[4], this.f88661k[4], bArr[25], bArr[20]);
        iArr[5] = i(bArr2[0], (byte) (this.f88661k[5] | (bArr2[17] & 63)), bArr[5], bArr[26]);
        iArr[6] = i(bArr2[1], (byte) (this.f88661k[6] | (bArr2[18] & 63)), bArr[6], bArr[27]);
        iArr[7] = i(bArr2[10], (byte) (this.f88661k[7] | (bArr2[19] & 63)), bArr[7], bArr2[2]);
        iArr[8] = i(bArr[8], (byte) (this.f88661k[8] | (bArr2[20] & 63)), bArr2[3], bArr2[11]);
        iArr[9] = i(bArr[9], (byte) ((bArr2[21] & 63) | this.f88661k[9]), bArr2[12], bArr2[4]);
        iArr[10] = i(bArr2[5], (byte) (this.f88661k[10] | (bArr2[22] & 63)), bArr[10], bArr[28]);
        iArr[11] = i(bArr[11], (byte) (this.f88661k[11] | (bArr2[23] & 63)), bArr2[6], bArr2[13]);
        iArr[12] = i(bArr[12], (byte) (this.f88661k[12] | (bArr2[24] & 63)), bArr2[7], bArr2[14]);
        iArr[13] = i(bArr[13], this.f88661k[13], bArr2[15], bArr2[8]);
        iArr[14] = i(bArr[14], (byte) (this.f88661k[14] | ((bArr[31] >>> 4) & 15)), bArr2[16], bArr2[9]);
        iArr[15] = i(bArr[15], (byte) (this.f88661k[15] | (bArr[31] & 15)), bArr[30], bArr[29]);
    }

    public Zuc256CoreEngine(int i10) {
        if (i10 == 32) {
            this.f88661k = m;
        } else if (i10 == 64) {
            this.f88661k = f88659n;
        } else {
            if (i10 != 128) {
                throw new IllegalArgumentException(g0.c("Unsupported length: ", i10));
            }
            this.f88661k = f88660o;
        }
    }

    public Zuc256CoreEngine(Zuc256CoreEngine zuc256CoreEngine) {
        super(zuc256CoreEngine);
    }
}
