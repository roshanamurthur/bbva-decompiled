package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.CMPObjectIdentifiers;
import org.bouncycastle.asn1.cmp.PBMParameter;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class PKMACValue extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87047p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DERBitString f87048q0;

    public PKMACValue(PBMParameter pBMParameter, DERBitString dERBitString) {
        this(new AlgorithmIdentifier(CMPObjectIdentifiers.passwordBasedMac, pBMParameter), dERBitString);
    }

    public static PKMACValue getInstance(Object obj) {
        if (obj instanceof PKMACValue) {
            return (PKMACValue) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PKMACValue pKMACValue = new PKMACValue();
        pKMACValue.f87047p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        pKMACValue.f87048q0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(1));
        return pKMACValue;
    }

    public AlgorithmIdentifier getAlgId() {
        return this.f87047p0;
    }

    public DERBitString getValue() {
        return this.f87048q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87047p0);
        aSN1EncodableVector.add(this.f87048q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public PKMACValue(AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
        this.f87047p0 = algorithmIdentifier;
        this.f87048q0 = dERBitString;
    }

    public static PKMACValue getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
