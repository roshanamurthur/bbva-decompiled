package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class KEKRecipientInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86914p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final KEKIdentifier f86915q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AlgorithmIdentifier f86916r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1OctetString f86917s0;

    public KEKRecipientInfo(ASN1Sequence aSN1Sequence) {
        this.f86914p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.f86915q0 = KEKIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86916r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
        this.f86917s0 = (ASN1OctetString) aSN1Sequence.getObjectAt(3);
    }

    public static KEKRecipientInfo getInstance(Object obj) {
        if (obj instanceof KEKRecipientInfo) {
            return (KEKRecipientInfo) obj;
        }
        if (obj != null) {
            return new KEKRecipientInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getEncryptedKey() {
        return this.f86917s0;
    }

    public KEKIdentifier getKekid() {
        return this.f86915q0;
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.f86916r0;
    }

    public ASN1Integer getVersion() {
        return this.f86914p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86914p0);
        aSN1EncodableVector.add(this.f86915q0);
        aSN1EncodableVector.add(this.f86916r0);
        aSN1EncodableVector.add(this.f86917s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public KEKRecipientInfo(KEKIdentifier kEKIdentifier, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.f86914p0 = new ASN1Integer(4L);
        this.f86915q0 = kEKIdentifier;
        this.f86916r0 = algorithmIdentifier;
        this.f86917s0 = aSN1OctetString;
    }

    public static KEKRecipientInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
