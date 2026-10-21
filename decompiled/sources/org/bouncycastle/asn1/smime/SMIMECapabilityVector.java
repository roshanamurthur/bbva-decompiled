package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class SMIMECapabilityVector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1EncodableVector f87474a = new ASN1EncodableVector();

    public void addCapability(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87474a.add(new DERSequence(aSN1ObjectIdentifier));
    }

    public ASN1EncodableVector toASN1EncodableVector() {
        return this.f87474a;
    }

    public void addCapability(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        aSN1EncodableVector.add(new ASN1Integer(i10));
        this.f87474a.add(new DERSequence(aSN1EncodableVector));
    }

    public void addCapability(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        aSN1EncodableVector.add(aSN1Encodable);
        this.f87474a.add(new DERSequence(aSN1EncodableVector));
    }
}
