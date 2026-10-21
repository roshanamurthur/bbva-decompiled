package org.bouncycastle.crypto.digests;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Blake2xsDigest implements Xof {
    public static final int UNKNOWN_DIGEST_LENGTH = 65535;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Blake2sDigest f88010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f88012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f88015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f88016h;

    public Blake2xsDigest() {
        this(65535);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        return doFinal(bArr, i10, bArr.length);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i10, int i11) {
        if (this.f88011c == null) {
            Blake2sDigest blake2sDigest = this.f88010b;
            byte[] bArr2 = new byte[blake2sDigest.getDigestSize()];
            this.f88011c = bArr2;
            blake2sDigest.doFinal(bArr2, 0);
        }
        int i12 = this.f88009a;
        if (i12 != 65535) {
            if (this.f88014f + i11 > i12) {
                throw new IllegalArgumentException("Output length is above the digest length");
            }
        } else if ((this.f88015g << 5) >= getUnknownMaxLength()) {
            throw new IllegalArgumentException("Maximum length is 2^32 blocks of 32 bytes");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = this.f88013e;
            byte[] bArr3 = this.f88012d;
            if (i14 >= 32) {
                int iMin = i12 == 65535 ? 32 : Math.min(32, i12 - this.f88014f);
                long j10 = this.f88016h;
                Blake2sDigest blake2sDigest2 = new Blake2sDigest();
                blake2sDigest2.f87993b = 0;
                blake2sDigest2.f87994c = null;
                blake2sDigest2.f87995d = null;
                blake2sDigest2.f87996e = null;
                blake2sDigest2.f88003l = null;
                blake2sDigest2.m = 0;
                blake2sDigest2.f88004n = new int[16];
                blake2sDigest2.f88005o = null;
                blake2sDigest2.f88006p = 0;
                blake2sDigest2.f88007q = 0;
                blake2sDigest2.f88008r = 0;
                blake2sDigest2.f87992a = iMin;
                blake2sDigest2.f88000i = j10;
                blake2sDigest2.f87997f = 0;
                blake2sDigest2.f87998g = 0;
                blake2sDigest2.f87999h = 32;
                blake2sDigest2.f88002k = 32;
                blake2sDigest2.f88001j = 0;
                blake2sDigest2.c(null, null, null);
                byte[] bArr4 = this.f88011c;
                blake2sDigest2.update(bArr4, 0, bArr4.length);
                Arrays.fill(bArr3, (byte) 0);
                blake2sDigest2.doFinal(bArr3, 0);
                this.f88013e = 0;
                this.f88016h++;
                this.f88015g++;
            }
            int i15 = this.f88013e;
            bArr[i13] = bArr3[i15];
            this.f88013e = i15 + 1;
            this.f88014f++;
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2xs";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.f88010b.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f88009a;
    }

    public long getUnknownMaxLength() {
        return SvgConstantsKt.SPECIFIED_IMAGE_RENDERING;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88010b.reset();
        this.f88011c = null;
        this.f88013e = 32;
        this.f88014f = 0;
        this.f88015g = 0L;
        this.f88016h = ((long) this.f88009a) * SvgConstantsKt.SPECIFIED_SOLID_OPACITY;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.f88010b.update(b10);
    }

    public Blake2xsDigest(int i10) {
        this(i10, null, null, null);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i10, int i11) {
        int iDoOutput = doOutput(bArr, i10, i11);
        reset();
        return iDoOutput;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        this.f88010b.update(bArr, i10, i11);
    }

    public Blake2xsDigest(int i10, byte[] bArr) {
        this(i10, bArr, null, null);
    }

    public Blake2xsDigest(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f88011c = null;
        this.f88012d = new byte[32];
        this.f88013e = 32;
        this.f88014f = 0;
        this.f88015g = 0L;
        if (i10 < 1 || i10 > 65535) {
            throw new IllegalArgumentException("BLAKE2xs digest length must be between 1 and 2^16-1");
        }
        this.f88009a = i10;
        long j10 = ((long) i10) * SvgConstantsKt.SPECIFIED_SOLID_OPACITY;
        this.f88016h = j10;
        Blake2sDigest blake2sDigest = new Blake2sDigest();
        blake2sDigest.f87993b = 0;
        blake2sDigest.f87994c = null;
        blake2sDigest.f87995d = null;
        blake2sDigest.f87996e = null;
        blake2sDigest.f87997f = 1;
        blake2sDigest.f87998g = 1;
        blake2sDigest.f87999h = 0;
        blake2sDigest.f88001j = 0;
        blake2sDigest.f88002k = 0;
        blake2sDigest.f88003l = null;
        blake2sDigest.m = 0;
        blake2sDigest.f88004n = new int[16];
        blake2sDigest.f88005o = null;
        blake2sDigest.f88006p = 0;
        blake2sDigest.f88007q = 0;
        blake2sDigest.f88008r = 0;
        blake2sDigest.f87992a = 32;
        blake2sDigest.f88000i = j10;
        blake2sDigest.c(bArr2, bArr3, bArr);
        this.f88010b = blake2sDigest;
    }

    public Blake2xsDigest(Blake2xsDigest blake2xsDigest) {
        this.f88011c = null;
        this.f88012d = new byte[32];
        this.f88013e = 32;
        this.f88014f = 0;
        this.f88015g = 0L;
        this.f88009a = blake2xsDigest.f88009a;
        this.f88010b = new Blake2sDigest(blake2xsDigest.f88010b);
        this.f88011c = Arrays.clone(blake2xsDigest.f88011c);
        this.f88012d = Arrays.clone(blake2xsDigest.f88012d);
        this.f88013e = blake2xsDigest.f88013e;
        this.f88014f = blake2xsDigest.f88014f;
        this.f88015g = blake2xsDigest.f88015g;
        this.f88016h = blake2xsDigest.f88016h;
    }
}
