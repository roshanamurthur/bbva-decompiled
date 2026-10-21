package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class X931Signer implements Signer {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA224 = 14540;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f89604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsymmetricBlockCipher f89605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RSAKeyParameters f89606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89608e;

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }

    public final void a(int i10) {
        int length;
        Digest digest = this.f89604a;
        int digestSize = digest.getDigestSize();
        if (i10 == 188) {
            byte[] bArr = this.f89608e;
            length = (bArr.length - digestSize) - 1;
            digest.doFinal(bArr, length);
            byte[] bArr2 = this.f89608e;
            bArr2[bArr2.length - 1] = -68;
        } else {
            byte[] bArr3 = this.f89608e;
            int length2 = (bArr3.length - digestSize) - 2;
            digest.doFinal(bArr3, length2);
            byte[] bArr4 = this.f89608e;
            bArr4[bArr4.length - 2] = (byte) (i10 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i10;
            length = length2;
        }
        this.f89608e[0] = 107;
        for (int i11 = length - 2; i11 != 0; i11--) {
            this.f89608e[i11] = -69;
        }
        this.f89608e[length - 1] = -70;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        a(this.f89607d);
        byte[] bArr = this.f89608e;
        BigInteger bigInteger = new BigInteger(1, this.f89605b.processBlock(bArr, 0, bArr.length));
        byte[] bArr2 = this.f89608e;
        for (int i10 = 0; i10 != bArr2.length; i10++) {
            bArr2[i10] = 0;
        }
        return BigIntegers.asUnsignedByteArray(BigIntegers.getUnsignedByteLength(this.f89606c.getModulus()), bigInteger.min(this.f89606c.getModulus().subtract(bigInteger)));
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.f89606c = rSAKeyParameters;
        this.f89605b.init(z10, rSAKeyParameters);
        this.f89608e = new byte[(this.f89606c.getModulus().bitLength() + 7) / 8];
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89604a.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89604a.update(b10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((r6.intValue() & 15) == 12) goto L9;
     */
    @Override // org.bouncycastle.crypto.Signer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verifySignature(byte[] r6) {
        /*
            r5 = this;
            r0 = 0
            org.bouncycastle.crypto.AsymmetricBlockCipher r1 = r5.f89605b     // Catch: java.lang.Exception -> L69
            int r2 = r6.length     // Catch: java.lang.Exception -> L69
            byte[] r6 = r1.processBlock(r6, r0, r2)     // Catch: java.lang.Exception -> L69
            r5.f89608e = r6     // Catch: java.lang.Exception -> L69
            java.math.BigInteger r6 = new java.math.BigInteger
            byte[] r1 = r5.f89608e
            r2 = 1
            r6.<init>(r2, r1)
            int r1 = r6.intValue()
            r1 = r1 & 15
            r2 = 12
            if (r1 != r2) goto L1d
            goto L2f
        L1d:
            org.bouncycastle.crypto.params.RSAKeyParameters r1 = r5.f89606c
            java.math.BigInteger r1 = r1.getModulus()
            java.math.BigInteger r6 = r1.subtract(r6)
            int r1 = r6.intValue()
            r1 = r1 & 15
            if (r1 != r2) goto L69
        L2f:
            int r1 = r5.f89607d
            r5.a(r1)
            byte[] r2 = r5.f89608e
            int r2 = r2.length
            byte[] r6 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(r2, r6)
            byte[] r2 = r5.f89608e
            boolean r2 = org.bouncycastle.util.Arrays.constantTimeAreEqual(r2, r6)
            r3 = 15052(0x3acc, float:2.1092E-41)
            if (r1 != r3) goto L54
            if (r2 != 0) goto L54
            byte[] r1 = r5.f89608e
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 64
            r1[r2] = r3
            boolean r2 = org.bouncycastle.util.Arrays.constantTimeAreEqual(r1, r6)
        L54:
            byte[] r1 = r5.f89608e
            r3 = r0
        L57:
            int r4 = r1.length
            if (r3 == r4) goto L5f
            r1[r3] = r0
            int r3 = r3 + 1
            goto L57
        L5f:
            r1 = r0
        L60:
            int r3 = r6.length
            if (r1 == r3) goto L68
            r6[r1] = r0
            int r1 = r1 + 1
            goto L60
        L68:
            return r2
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.signers.X931Signer.verifySignature(byte[]):boolean");
    }

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z10) {
        int iIntValue;
        this.f89605b = asymmetricBlockCipher;
        this.f89604a = digest;
        if (z10) {
            iIntValue = 188;
        } else {
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + digest.getAlgorithmName());
            }
            iIntValue = trailer.intValue();
        }
        this.f89607d = iIntValue;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f89604a.update(bArr, i10, i11);
    }
}
