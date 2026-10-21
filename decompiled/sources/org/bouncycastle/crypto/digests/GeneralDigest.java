package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneralDigest implements ExtendedDigest, Memoable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f88064c;

    public GeneralDigest() {
        this.f88062a = new byte[4];
        this.f88063b = 0;
    }

    public void copyIn(GeneralDigest generalDigest) {
        byte[] bArr = generalDigest.f88062a;
        System.arraycopy(bArr, 0, this.f88062a, 0, bArr.length);
        this.f88063b = generalDigest.f88063b;
        this.f88064c = generalDigest.f88064c;
    }

    public void finish() {
        long j10 = this.f88064c << 3;
        byte b10 = -128;
        while (true) {
            update(b10);
            if (this.f88063b == 0) {
                processLength(j10);
                processBlock();
                return;
            }
            b10 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.f88062a, 0, bArr, 0, this.f88063b);
        Pack.intToBigEndian(this.f88063b, bArr, 4);
        Pack.longToBigEndian(this.f88064c, bArr, 8);
    }

    public abstract void processBlock();

    public abstract void processLength(long j10);

    public abstract void processWord(byte[] bArr, int i10);

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88064c = 0L;
        this.f88063b = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f88062a;
            if (i10 >= bArr.length) {
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f88063b;
        int i11 = i10 + 1;
        this.f88063b = i11;
        byte[] bArr = this.f88062a;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            processWord(bArr, 0);
            this.f88063b = 0;
        }
        this.f88064c++;
    }

    public GeneralDigest(GeneralDigest generalDigest) {
        this.f88062a = new byte[4];
        copyIn(generalDigest);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int iMax = Math.max(0, i11);
        int i13 = this.f88063b;
        byte[] bArr2 = this.f88062a;
        if (i13 != 0) {
            int i14 = 0;
            while (true) {
                if (i14 >= iMax) {
                    i12 = i14;
                    break;
                }
                int i15 = this.f88063b;
                int i16 = i15 + 1;
                this.f88063b = i16;
                int i17 = i14 + 1;
                bArr2[i15] = bArr[i14 + i10];
                if (i16 == 4) {
                    processWord(bArr2, 0);
                    this.f88063b = 0;
                    i12 = i17;
                    break;
                }
                i14 = i17;
            }
        }
        int i18 = ((iMax - i12) & (-4)) + i12;
        while (i12 < i18) {
            processWord(bArr, i10 + i12);
            i12 += 4;
        }
        while (i12 < iMax) {
            int i19 = this.f88063b;
            this.f88063b = i19 + 1;
            bArr2[i19] = bArr[i12 + i10];
            i12++;
        }
        this.f88064c += (long) iMax;
    }

    public GeneralDigest(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.f88062a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f88063b = Pack.bigEndianToInt(bArr, 4);
        this.f88064c = Pack.bigEndianToLong(bArr, 8);
    }
}
