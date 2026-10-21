package org.bouncycastle.crypto.params;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes5.dex */
public class ECGOST3410Parameters extends ECNamedDomainParameters {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ASN1ObjectIdentifier f89275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ASN1ObjectIdentifier f89276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ASN1ObjectIdentifier f89277j;

    public ECGOST3410Parameters(ECDomainParameters eCDomainParameters, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this(eCDomainParameters, aSN1ObjectIdentifier, aSN1ObjectIdentifier2, null);
    }

    public ASN1ObjectIdentifier getDigestParamSet() {
        return this.f89276i;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.f89277j;
    }

    public ASN1ObjectIdentifier getPublicKeyParamSet() {
        return this.f89275h;
    }

    public ECGOST3410Parameters(ECDomainParameters eCDomainParameters, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, ASN1ObjectIdentifier aSN1ObjectIdentifier3) {
        super(aSN1ObjectIdentifier, eCDomainParameters.getCurve(), eCDomainParameters.getG(), eCDomainParameters.getN(), eCDomainParameters.getH(), eCDomainParameters.getSeed());
        if ((eCDomainParameters instanceof ECNamedDomainParameters) && !aSN1ObjectIdentifier.equals((ASN1Primitive) ((ECNamedDomainParameters) eCDomainParameters).getName())) {
            throw new IllegalArgumentException("named parameters do not match publicKeyParamSet value");
        }
        this.f89275h = aSN1ObjectIdentifier;
        this.f89276i = aSN1ObjectIdentifier2;
        this.f89277j = aSN1ObjectIdentifier3;
    }
}
