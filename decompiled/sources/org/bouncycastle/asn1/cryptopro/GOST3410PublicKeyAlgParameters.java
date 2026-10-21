package org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class GOST3410PublicKeyAlgParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87078p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87079q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87080r0;

    public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.f87078p0 = aSN1ObjectIdentifier;
        this.f87079q0 = aSN1ObjectIdentifier2;
        this.f87080r0 = null;
    }

    public static GOST3410PublicKeyAlgParameters getInstance(Object obj) {
        if (obj instanceof GOST3410PublicKeyAlgParameters) {
            return (GOST3410PublicKeyAlgParameters) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = new GOST3410PublicKeyAlgParameters();
        gOST3410PublicKeyAlgParameters.f87078p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        gOST3410PublicKeyAlgParameters.f87079q0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(1);
        if (aSN1Sequence.size() > 2) {
            gOST3410PublicKeyAlgParameters.f87080r0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(2);
        }
        return gOST3410PublicKeyAlgParameters;
    }

    public ASN1ObjectIdentifier getDigestParamSet() {
        return this.f87079q0;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.f87080r0;
    }

    public ASN1ObjectIdentifier getPublicKeyParamSet() {
        return this.f87078p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87078p0);
        aSN1EncodableVector.add(this.f87079q0);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f87080r0;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, ASN1ObjectIdentifier aSN1ObjectIdentifier3) {
        this.f87078p0 = aSN1ObjectIdentifier;
        this.f87079q0 = aSN1ObjectIdentifier2;
        this.f87080r0 = aSN1ObjectIdentifier3;
    }

    public static GOST3410PublicKeyAlgParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
