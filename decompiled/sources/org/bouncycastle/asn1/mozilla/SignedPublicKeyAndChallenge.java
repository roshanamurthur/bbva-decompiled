package org.bouncycastle.asn1.mozilla;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class SignedPublicKeyAndChallenge extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PublicKeyAndChallenge f87322p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Sequence f87323q0;

    public SignedPublicKeyAndChallenge(ASN1Sequence aSN1Sequence) {
        this.f87323q0 = aSN1Sequence;
        this.f87322p0 = PublicKeyAndChallenge.getInstance(aSN1Sequence.getObjectAt(0));
    }

    public static SignedPublicKeyAndChallenge getInstance(Object obj) {
        if (obj instanceof SignedPublicKeyAndChallenge) {
            return (SignedPublicKeyAndChallenge) obj;
        }
        if (obj != null) {
            return new SignedPublicKeyAndChallenge(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PublicKeyAndChallenge getPublicKeyAndChallenge() {
        return this.f87322p0;
    }

    public DERBitString getSignature() {
        return DERBitString.getInstance(this.f87323q0.getObjectAt(2));
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return AlgorithmIdentifier.getInstance(this.f87323q0.getObjectAt(1));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87323q0;
    }
}
