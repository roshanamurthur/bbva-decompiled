package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;

/* JADX INFO: loaded from: classes12.dex */
public class Request extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CertID f87344p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Extensions f87345q0;

    public Request(CertID certID, Extensions extensions) {
        this.f87344p0 = certID;
        this.f87345q0 = extensions;
    }

    public static Request getInstance(Object obj) {
        if (obj instanceof Request) {
            return (Request) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Request request = new Request();
        request.f87344p0 = CertID.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            request.f87345q0 = Extensions.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
        return request;
    }

    public CertID getReqCert() {
        return this.f87344p0;
    }

    public Extensions getSingleRequestExtensions() {
        return this.f87345q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87344p0);
        Extensions extensions = this.f87345q0;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static Request getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
