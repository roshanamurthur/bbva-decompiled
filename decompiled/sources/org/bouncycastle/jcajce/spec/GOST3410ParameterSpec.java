package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;

/* JADX INFO: loaded from: classes8.dex */
public class GOST3410ParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1ObjectIdentifier f90273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ASN1ObjectIdentifier f90274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ASN1ObjectIdentifier f90275c;

    public GOST3410ParameterSpec(String str) {
        this(ECGOST3410NamedCurves.getOID(str), str.indexOf("12-512") > 0 ? RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512 : str.indexOf("12-256") > 0 ? RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256 : CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet, null);
    }

    public ASN1ObjectIdentifier getDigestParamSet() {
        return this.f90274b;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.f90275c;
    }

    public ASN1ObjectIdentifier getPublicKeyParamSet() {
        return this.f90273a;
    }

    public String getPublicKeyParamSetName() {
        return ECGOST3410NamedCurves.getName(getPublicKeyParamSet());
    }

    public GOST3410ParameterSpec(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this(aSN1ObjectIdentifier, aSN1ObjectIdentifier2, null);
    }

    public GOST3410ParameterSpec(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, ASN1ObjectIdentifier aSN1ObjectIdentifier3) {
        this.f90273a = aSN1ObjectIdentifier;
        this.f90274b = aSN1ObjectIdentifier2;
        this.f90275c = aSN1ObjectIdentifier3;
    }
}
