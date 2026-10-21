package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410NamedParameters;
import org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.jce.interfaces.GOST3410Params;

/* JADX INFO: loaded from: classes8.dex */
public class GOST3410ParameterSpec implements AlgorithmParameterSpec, GOST3410Params {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GOST3410PublicKeyParameterSetSpec f90534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f90537d;

    public GOST3410ParameterSpec(String str) {
        this(str, CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet.getId(), null);
    }

    public static GOST3410ParameterSpec fromPublicKeyAlg(GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters) {
        return gOST3410PublicKeyAlgParameters.getEncryptionParamSet() != null ? new GOST3410ParameterSpec(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet().getId(), gOST3410PublicKeyAlgParameters.getDigestParamSet().getId(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet().getId()) : new GOST3410ParameterSpec(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet().getId(), gOST3410PublicKeyAlgParameters.getDigestParamSet().getId());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ParameterSpec)) {
            return false;
        }
        GOST3410ParameterSpec gOST3410ParameterSpec = (GOST3410ParameterSpec) obj;
        if (!this.f90534a.equals(gOST3410ParameterSpec.f90534a) || !this.f90536c.equals(gOST3410ParameterSpec.f90536c)) {
            return false;
        }
        String str = this.f90537d;
        String str2 = gOST3410ParameterSpec.f90537d;
        return str == str2 || (str != null && str.equals(str2));
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public String getDigestParamSetOID() {
        return this.f90536c;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public String getEncryptionParamSetOID() {
        return this.f90537d;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public String getPublicKeyParamSetOID() {
        return this.f90535b;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public GOST3410PublicKeyParameterSetSpec getPublicKeyParameters() {
        return this.f90534a;
    }

    public int hashCode() {
        int iHashCode = this.f90534a.hashCode() ^ this.f90536c.hashCode();
        String str = this.f90537d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    public GOST3410ParameterSpec(String str, String str2) {
        this(str, str2, null);
    }

    public GOST3410ParameterSpec(String str, String str2, String str3) {
        GOST3410ParamSetParameters byOID;
        try {
            byOID = GOST3410NamedParameters.getByOID(new ASN1ObjectIdentifier(str));
        } catch (IllegalArgumentException unused) {
            ASN1ObjectIdentifier oid = GOST3410NamedParameters.getOID(str);
            if (oid != null) {
                str = oid.getId();
                byOID = GOST3410NamedParameters.getByOID(oid);
            } else {
                byOID = null;
            }
        }
        if (byOID == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.f90534a = new GOST3410PublicKeyParameterSetSpec(byOID.getP(), byOID.getQ(), byOID.getA());
        this.f90535b = str;
        this.f90536c = str2;
        this.f90537d = str3;
    }

    public GOST3410ParameterSpec(GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec) {
        this.f90534a = gOST3410PublicKeyParameterSetSpec;
        this.f90536c = CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet.getId();
        this.f90537d = null;
    }
}
