package org.bouncycastle.crypto.macs;

import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes4.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        long j10 = this.m;
        int i11 = this.wordPos;
        this.m = ((j10 >>> ((7 - i11) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i11)) & 255) << 56);
        processMessageWord();
        this.f88926v2 ^= 238;
        applySipRounds(this.f88922d);
        long j11 = this.v0;
        long j12 = this.f88925v1;
        long j13 = ((j11 ^ j12) ^ this.f88926v2) ^ this.v3;
        this.f88925v1 = j12 ^ 221;
        applySipRounds(this.f88922d);
        long j14 = ((this.v0 ^ this.f88925v1) ^ this.f88926v2) ^ this.v3;
        reset();
        Pack.longToLittleEndian(j13, bArr, i10);
        Pack.longToLittleEndian(j14, bArr, i10 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f88921c + Constant.DASH_STRING + this.f88922d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f88925v1 ^= 238;
    }

    public SipHash128(int i10, int i11) {
        super(i10, i11);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() throws IllegalStateException, DataLengthException {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
