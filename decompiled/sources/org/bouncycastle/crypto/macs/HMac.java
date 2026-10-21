package org.bouncycastle.crypto.macs;

import java.util.Hashtable;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes4.dex */
public class HMac implements Mac {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Hashtable f88871h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f88872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Memoable f88875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Memoable f88876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f88877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f88878g;

    static {
        Hashtable hashtable = new Hashtable();
        f88871h = hashtable;
        hashtable.put("GOST3411", Integers.valueOf(32));
        hashtable.put("MD2", Integers.valueOf(16));
        hashtable.put("MD4", Integers.valueOf(64));
        hashtable.put("MD5", Integers.valueOf(64));
        hashtable.put("RIPEMD128", Integers.valueOf(64));
        hashtable.put("RIPEMD160", Integers.valueOf(64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, Integers.valueOf(64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, Integers.valueOf(64));
        hashtable.put("SHA-256", Integers.valueOf(64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, Integers.valueOf(128));
        hashtable.put("SHA-512", Integers.valueOf(128));
        hashtable.put("Tiger", Integers.valueOf(64));
        hashtable.put("Whirlpool", Integers.valueOf(64));
    }

    public HMac(Digest digest) {
        int iIntValue;
        if (digest instanceof ExtendedDigest) {
            iIntValue = ((ExtendedDigest) digest).getByteLength();
        } else {
            Integer num = (Integer) f88871h.get(digest.getAlgorithmName());
            if (num == null) {
                throw new IllegalArgumentException("unknown digest passed: " + digest.getAlgorithmName());
            }
            iIntValue = num.intValue();
        }
        this.f88872a = digest;
        int digestSize = digest.getDigestSize();
        this.f88873b = digestSize;
        this.f88874c = iIntValue;
        this.f88877f = new byte[iIntValue];
        this.f88878g = new byte[iIntValue + digestSize];
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        Digest digest = this.f88872a;
        byte[] bArr2 = this.f88878g;
        int i11 = this.f88874c;
        digest.doFinal(bArr2, i11);
        Memoable memoable = this.f88876e;
        if (memoable != null) {
            ((Memoable) digest).reset(memoable);
            digest.update(bArr2, i11, digest.getDigestSize());
        } else {
            digest.update(bArr2, 0, bArr2.length);
        }
        int iDoFinal = digest.doFinal(bArr, i10);
        while (i11 < bArr2.length) {
            bArr2[i11] = 0;
            i11++;
        }
        Memoable memoable2 = this.f88875d;
        if (memoable2 != null) {
            ((Memoable) digest).reset(memoable2);
        } else {
            byte[] bArr3 = this.f88877f;
            digest.update(bArr3, 0, bArr3.length);
        }
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.f88872a.getAlgorithmName() + "/HMAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88873b;
    }

    public Digest getUnderlyingDigest() {
        return this.f88872a;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        Digest digest = this.f88872a;
        digest.reset();
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        byte[] bArr = this.f88877f;
        int i10 = this.f88874c;
        if (length > i10) {
            digest.update(key, 0, length);
            digest.doFinal(bArr, 0);
            length = this.f88873b;
        } else {
            System.arraycopy(key, 0, bArr, 0, length);
        }
        while (length < bArr.length) {
            bArr[length] = 0;
            length++;
        }
        byte[] bArr2 = this.f88878g;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ 54);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) (bArr2[i12] ^ 92);
        }
        boolean z10 = digest instanceof Memoable;
        if (z10) {
            Memoable memoableCopy = ((Memoable) digest).copy();
            this.f88876e = memoableCopy;
            ((Digest) memoableCopy).update(bArr2, 0, i10);
        }
        digest.update(bArr, 0, bArr.length);
        if (z10) {
            this.f88875d = ((Memoable) digest).copy();
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Digest digest = this.f88872a;
        digest.reset();
        byte[] bArr = this.f88877f;
        digest.update(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        this.f88872a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        this.f88872a.update(bArr, i10, i11);
    }
}
