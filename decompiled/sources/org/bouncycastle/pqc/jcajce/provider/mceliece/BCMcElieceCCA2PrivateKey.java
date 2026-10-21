package org.bouncycastle.pqc.jcajce.provider.mceliece;

import bn.a;
import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes13.dex */
public class BCMcElieceCCA2PrivateKey implements PrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final McElieceCCA2PrivateKeyParameters f91452p0;

    public BCMcElieceCCA2PrivateKey(McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters) {
        this.f91452p0 = mcElieceCCA2PrivateKeyParameters;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PrivateKey)) {
            return false;
        }
        BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey = (BCMcElieceCCA2PrivateKey) obj;
        return getN() == bCMcElieceCCA2PrivateKey.getN() && getK() == bCMcElieceCCA2PrivateKey.getK() && getField().equals(bCMcElieceCCA2PrivateKey.getField()) && getGoppaPoly().equals(bCMcElieceCCA2PrivateKey.getGoppaPoly()) && getP().equals(bCMcElieceCCA2PrivateKey.getP()) && getH().equals(bCMcElieceCCA2PrivateKey.getH());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2), new McElieceCCA2PrivateKey(getN(), getK(), getField(), getGoppaPoly(), getP(), a.c(this.f91452p0.getDigest()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public GF2mField getField() {
        return this.f91452p0.getField();
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.f91452p0.getGoppaPoly();
    }

    public GF2Matrix getH() {
        return this.f91452p0.getH();
    }

    public int getK() {
        return this.f91452p0.getK();
    }

    public int getN() {
        return this.f91452p0.getN();
    }

    public Permutation getP() {
        return this.f91452p0.getP();
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.f91452p0.getQInv();
    }

    public int getT() {
        return this.f91452p0.getGoppaPoly().getDegree();
    }

    public int hashCode() {
        McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = this.f91452p0;
        return mcElieceCCA2PrivateKeyParameters.getH().hashCode() + ((mcElieceCCA2PrivateKeyParameters.getP().hashCode() + ((mcElieceCCA2PrivateKeyParameters.getGoppaPoly().hashCode() + ((mcElieceCCA2PrivateKeyParameters.getField().hashCode() + ((mcElieceCCA2PrivateKeyParameters.getN() + (mcElieceCCA2PrivateKeyParameters.getK() * 37)) * 37)) * 37)) * 37)) * 37);
    }
}
