package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.MemoableResetException;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SHA512tDigest extends LongDigest {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f88160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f88161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f88162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f88163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f88164l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f88165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f88166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f88167p;

    public SHA512tDigest(int i10) {
        if (i10 >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i10 == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i11 = i10 / 8;
        this.f88160h = i11;
        int i12 = i11 * 8;
        this.H1 = -3482333909917012819L;
        this.H2 = 2216346199247487646L;
        this.H3 = -7364697282686394994L;
        this.H4 = 65953792586715988L;
        this.H5 = -816286391624063116L;
        this.H6 = 4512832404995164602L;
        this.H7 = -5033199132376557362L;
        this.H8 = -124578254951840548L;
        update((byte) 83);
        update((byte) 72);
        update((byte) 65);
        update((byte) 45);
        update((byte) 53);
        update((byte) 49);
        update((byte) 50);
        update((byte) 47);
        if (i12 <= 100) {
            if (i12 > 10) {
            }
            update((byte) (i12 + 48));
            finish();
            this.f88161i = this.H1;
            this.f88162j = this.H2;
            this.f88163k = this.H3;
            this.f88164l = this.H4;
            this.m = this.H5;
            this.f88165n = this.H6;
            this.f88166o = this.H7;
            this.f88167p = this.H8;
            reset();
        }
        update((byte) ((i12 / 100) + 48));
        i12 %= 100;
        update((byte) ((i12 / 10) + 48));
        i12 %= 10;
        update((byte) (i12 + 48));
        finish();
        this.f88161i = this.H1;
        this.f88162j = this.H2;
        this.f88163k = this.H3;
        this.f88164l = this.H4;
        this.m = this.H5;
        this.f88165n = this.H6;
        this.f88166o = this.H7;
        this.f88167p = this.H8;
        reset();
    }

    public static void e(long j10, byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return;
        }
        int i12 = (int) (j10 >>> 32);
        int iMin = Math.min(4, i11);
        while (true) {
            iMin--;
            if (iMin < 0) {
                break;
            } else {
                bArr[i10 + iMin] = (byte) (i12 >>> ((3 - iMin) * 8));
            }
        }
        if (i11 <= 4) {
            return;
        }
        int i13 = (int) (j10 & 4294967295L);
        int i14 = i10 + 4;
        int iMin2 = Math.min(4, i11 - 4);
        while (true) {
            iMin2--;
            if (iMin2 < 0) {
                return;
            } else {
                bArr[i14 + iMin2] = (byte) (i13 >>> ((3 - iMin2) * 8));
            }
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA512tDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        long j10 = this.H1;
        int i11 = this.f88160h;
        e(j10, bArr, i10, i11);
        e(this.H2, bArr, i10 + 8, i11 - 8);
        e(this.H3, bArr, i10 + 16, i11 - 16);
        e(this.H4, bArr, i10 + 24, i11 - 24);
        e(this.H5, bArr, i10 + 32, i11 - 32);
        e(this.H6, bArr, i10 + 40, i11 - 40);
        e(this.H7, bArr, i10 + 48, i11 - 48);
        e(this.H8, bArr, i10 + 56, i11 - 56);
        reset();
        return i11;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.f88160h * 8);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f88160h;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int encodedStateSize = getEncodedStateSize();
        byte[] bArr = new byte[encodedStateSize + 4];
        populateState(bArr);
        Pack.intToBigEndian(this.f88160h * 8, bArr, encodedStateSize);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = this.f88161i;
        this.H2 = this.f88162j;
        this.H3 = this.f88163k;
        this.H4 = this.f88164l;
        this.H5 = this.m;
        this.H6 = this.f88165n;
        this.H7 = this.f88166o;
        this.H8 = this.f88167p;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA512tDigest sHA512tDigest = (SHA512tDigest) memoable;
        if (this.f88160h != sHA512tDigest.f88160h) {
            throw new MemoableResetException("digestLength inappropriate in other");
        }
        super.copyIn(sHA512tDigest);
        this.f88161i = sHA512tDigest.f88161i;
        this.f88162j = sHA512tDigest.f88162j;
        this.f88163k = sHA512tDigest.f88163k;
        this.f88164l = sHA512tDigest.f88164l;
        this.m = sHA512tDigest.m;
        this.f88165n = sHA512tDigest.f88165n;
        this.f88166o = sHA512tDigest.f88166o;
        this.f88167p = sHA512tDigest.f88167p;
    }

    public SHA512tDigest(SHA512tDigest sHA512tDigest) {
        super(sHA512tDigest);
        this.f88160h = sHA512tDigest.f88160h;
        reset(sHA512tDigest);
    }

    public SHA512tDigest(byte[] bArr) {
        this(Pack.bigEndianToInt(bArr, bArr.length - 4));
        restoreState(bArr);
    }
}
