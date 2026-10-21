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
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public McElieceKeyGenerationParameters f91156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SecureRandom f91161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91162g = false;

    public final void a(KeyGenerationParameters keyGenerationParameters) {
        this.f91156a = (McElieceKeyGenerationParameters) keyGenerationParameters;
        SecureRandom random = keyGenerationParameters.getRandom();
        this.f91161f = random;
        if (random == null) {
            this.f91161f = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f91157b = this.f91156a.getParameters().getM();
        this.f91158c = this.f91156a.getParameters().getN();
        this.f91159d = this.f91156a.getParameters().getT();
        this.f91160e = this.f91156a.getParameters().getFieldPoly();
        this.f91162g = true;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        if (!this.f91162g) {
            a(new McElieceKeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new McElieceParameters()));
        }
        GF2mField gF2mField = new GF2mField(this.f91157b, this.f91160e);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(gF2mField, this.f91159d, 'I', this.f91161f);
        new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
        GoppaCode.MaMaPe maMaPeComputeSystematicForm = GoppaCode.computeSystematicForm(GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), this.f91161f);
        GF2Matrix secondMatrix = maMaPeComputeSystematicForm.getSecondMatrix();
        Permutation permutation = maMaPeComputeSystematicForm.getPermutation();
        GF2Matrix gF2Matrix = (GF2Matrix) secondMatrix.computeTranspose();
        GF2Matrix gF2MatrixExtendLeftCompactForm = gF2Matrix.extendLeftCompactForm();
        int numRows = gF2Matrix.getNumRows();
        GF2Matrix[] gF2MatrixArrCreateRandomRegularMatrixAndItsInverse = GF2Matrix.createRandomRegularMatrixAndItsInverse(numRows, this.f91161f);
        Permutation permutation2 = new Permutation(this.f91158c, this.f91161f);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new McEliecePublicKeyParameters(this.f91158c, this.f91159d, (GF2Matrix) ((GF2Matrix) gF2MatrixArrCreateRandomRegularMatrixAndItsInverse[0].rightMultiply(gF2MatrixExtendLeftCompactForm)).rightMultiply(permutation2)), (AsymmetricKeyParameter) new McEliecePrivateKeyParameters(this.f91158c, numRows, gF2mField, polynomialGF2mSmallM, permutation, permutation2, gF2MatrixArrCreateRandomRegularMatrixAndItsInverse[1]));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        a(keyGenerationParameters);
    }
}
