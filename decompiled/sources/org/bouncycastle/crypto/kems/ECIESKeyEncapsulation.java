package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.KeyEncapsulation;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class ECIESKeyEncapsulation implements KeyEncapsulation {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f88808g = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DerivationFunction f88809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecureRandom f88810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ECKeyParameters f88811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f88812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f88813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f88814f;

    public ECIESKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.f88809a = derivationFunction;
        this.f88810b = secureRandom;
        this.f88812d = false;
        this.f88813e = false;
        this.f88814f = false;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public CipherParameters decrypt(byte[] bArr, int i10) {
        return decrypt(bArr, 0, bArr.length, i10);
    }

    public KeyParameter deriveKey(int i10, byte[] bArr, byte[] bArr2) throws CloneNotSupportedException {
        DerivationFunction derivationFunction = this.f88809a;
        if (!this.f88814f) {
            byte[] bArrConcatenate = Arrays.concatenate(bArr, bArr2);
            Arrays.fill(bArr2, (byte) 0);
            bArr2 = bArrConcatenate;
        }
        try {
            derivationFunction.init(new KDFParameters(bArr2, null));
            byte[] bArr3 = new byte[i10];
            derivationFunction.generateBytes(bArr3, 0, i10);
            return new KeyParameter(bArr3);
        } finally {
            Arrays.fill(bArr2, (byte) 0);
        }
    }

    public CipherParameters encrypt(byte[] bArr, int i10) {
        return encrypt(bArr, 0, i10);
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ECKeyParameters)) {
            throw new IllegalArgumentException("EC key required");
        }
        this.f88811c = (ECKeyParameters) cipherParameters;
    }

    public ECIESKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom, boolean z10, boolean z11, boolean z12) {
        this.f88809a = derivationFunction;
        this.f88810b = secureRandom;
        this.f88812d = z10;
        if (z10) {
            this.f88813e = false;
        } else {
            this.f88813e = z11;
        }
        this.f88814f = z12;
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters decrypt(byte[] bArr, int i10, int i11, int i12) throws IllegalArgumentException {
        ECKeyParameters eCKeyParameters = this.f88811c;
        if (!(eCKeyParameters instanceof ECPrivateKeyParameters)) {
            throw new IllegalArgumentException("Private key required for encryption");
        }
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) eCKeyParameters;
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        ECCurve curve = parameters.getCurve();
        BigInteger n7 = parameters.getN();
        BigInteger h4 = parameters.getH();
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        ECPoint eCPointDecodePoint = curve.decodePoint(bArr2);
        boolean z10 = this.f88812d;
        if (z10 || this.f88813e) {
            eCPointDecodePoint = eCPointDecodePoint.multiply(h4);
        }
        BigInteger d2 = eCPrivateKeyParameters.getD();
        if (z10) {
            d2 = d2.multiply(h4.modInverse(n7)).mod(n7);
        }
        return deriveKey(i12, bArr2, eCPointDecodePoint.multiply(d2).normalize().getAffineXCoord().getEncoded());
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters encrypt(byte[] bArr, int i10, int i11) throws IllegalArgumentException {
        ECKeyParameters eCKeyParameters = this.f88811c;
        if (!(eCKeyParameters instanceof ECPublicKeyParameters)) {
            throw new IllegalArgumentException("Public key required for encryption");
        }
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) eCKeyParameters;
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        ECCurve curve = parameters.getCurve();
        BigInteger n7 = parameters.getN();
        BigInteger h4 = parameters.getH();
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(f88808g, n7, this.f88810b);
        ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), bigIntegerCreateRandomInRange), eCPublicKeyParameters.getQ().multiply(this.f88813e ? bigIntegerCreateRandomInRange.multiply(h4).mod(n7) : bigIntegerCreateRandomInRange)};
        curve.normalizeAll(eCPointArr);
        ECPoint eCPoint = eCPointArr[0];
        ECPoint eCPoint2 = eCPointArr[1];
        byte[] encoded = eCPoint.getEncoded(false);
        System.arraycopy(encoded, 0, bArr, i10, encoded.length);
        return deriveKey(i11, encoded, eCPoint2.getAffineXCoord().getEncoded());
    }
}
