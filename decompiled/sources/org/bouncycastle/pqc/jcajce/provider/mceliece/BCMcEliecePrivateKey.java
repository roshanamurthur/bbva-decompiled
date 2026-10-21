package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.asn1.McEliecePrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes13.dex */
public class BCMcEliecePrivateKey implements CipherParameters, PrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final McEliecePrivateKeyParameters f91454p0;

    public BCMcEliecePrivateKey(McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.f91454p0 = mcEliecePrivateKeyParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = this.f91454p0;
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcEliece), new McEliecePrivateKey(mcEliecePrivateKeyParameters.getN(), mcEliecePrivateKeyParameters.getK(), mcEliecePrivateKeyParameters.getField(), mcEliecePrivateKeyParameters.getGoppaPoly(), mcEliecePrivateKeyParameters.getP1(), mcEliecePrivateKeyParameters.getP2(), mcEliecePrivateKeyParameters.getSInv())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public GF2mField getField() {
        return this.f91454p0.getField();
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.f91454p0.getGoppaPoly();
    }

    public GF2Matrix getH() {
        return this.f91454p0.getH();
    }

    public int getK() {
        return this.f91454p0.getK();
    }

    public int getN() {
        return this.f91454p0.getN();
    }

    public Permutation getP1() {
        return this.f91454p0.getP1();
    }

    public Permutation getP2() {
        return this.f91454p0.getP2();
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.f91454p0.getQInv();
    }

    public GF2Matrix getSInv() {
        return this.f91454p0.getSInv();
    }

    public int hashCode() {
        McEliecePrivateKeyParameters mcEliecePrivateKeyParameters = this.f91454p0;
        return mcEliecePrivateKeyParameters.getSInv().hashCode() + ((mcEliecePrivateKeyParameters.getP2().hashCode() + ((mcEliecePrivateKeyParameters.getP1().hashCode() + ((mcEliecePrivateKeyParameters.getGoppaPoly().hashCode() + ((mcEliecePrivateKeyParameters.getField().hashCode() + ((mcEliecePrivateKeyParameters.getN() + (mcEliecePrivateKeyParameters.getK() * 37)) * 37)) * 37)) * 37)) * 37)) * 37);
    }
}
