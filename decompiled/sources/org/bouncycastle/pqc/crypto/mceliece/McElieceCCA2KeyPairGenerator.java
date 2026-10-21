package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCCA2KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public McElieceCCA2KeyGenerationParameters f91124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SecureRandom f91129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91130g = false;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        if (!this.f91130g) {
            init(new McElieceCCA2KeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new McElieceCCA2Parameters()));
        }
        GF2mField gF2mField = new GF2mField(this.f91125b, this.f91128e);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f91127d, 'I', this.f91129f);
        GoppaCode.MaMaPe maMaPeComputeSystematicForm = GoppaCode.computeSystematicForm(GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), this.f91129f);
        GF2Matrix secondMatrix = maMaPeComputeSystematicForm.getSecondMatrix();
        Permutation permutation = maMaPeComputeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McElieceCCA2PublicKeyParameters(this.f91126c, this.f91127d, gF2Matrix, this.f91124a.getParameters().getDigest()), (AsymmetricKeyParameter) new McElieceCCA2PrivateKeyParameters(this.f91126c, gF2Matrix.getNumRows(), gF2mField, polynomialGF2mSmallM, permutation, this.f91124a.getParameters().getDigest()));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f91124a = (McElieceCCA2KeyGenerationParameters) keyGenerationParameters;
        this.f91129f = CryptoServicesRegistrar.getSecureRandom();
        this.f91125b = this.f91124a.getParameters().getM();
        this.f91126c = this.f91124a.getParameters().getN();
        this.f91127d = this.f91124a.getParameters().getT();
        this.f91128e = this.f91124a.getParameters().getFieldPoly();
        this.f91130g = true;
    }
}
