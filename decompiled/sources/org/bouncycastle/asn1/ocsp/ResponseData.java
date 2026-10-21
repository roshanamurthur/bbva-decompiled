package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes12.dex */
public class ResponseData extends ASN1Object {
    public static final ASN1Integer v0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f87349p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87350q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ResponderID f87351r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1GeneralizedTime f87352s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1Sequence f87353t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Extensions f87354u0;

    public ResponseData(ASN1Integer aSN1Integer, ResponderID responderID, ASN1GeneralizedTime aSN1GeneralizedTime, ASN1Sequence aSN1Sequence, Extensions extensions) {
        this.f87350q0 = aSN1Integer;
        this.f87351r0 = responderID;
        this.f87352s0 = aSN1GeneralizedTime;
        this.f87353t0 = aSN1Sequence;
        this.f87354u0 = extensions;
    }

    public static ResponseData getInstance(Object obj) {
        if (obj instanceof ResponseData) {
            return (ResponseData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ResponseData responseData = new ResponseData();
        int i10 = 0;
        boolean z10 = aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject;
        ASN1Integer aSN1Integer = v0;
        if (z10 && ((ASN1TaggedObject) aSN1Sequence.getObjectAt(0)).getTagNo() == 0) {
            responseData.f87349p0 = true;
            responseData.f87350q0 = ASN1Integer.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i10 = 1;
        } else {
            responseData.f87350q0 = aSN1Integer;
        }
        responseData.f87351r0 = ResponderID.getInstance(aSN1Sequence.getObjectAt(i10));
        int i11 = i10 + 2;
        responseData.f87352s0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        int i12 = i10 + 3;
        responseData.f87353t0 = (ASN1Sequence) aSN1Sequence.getObjectAt(i11);
        if (aSN1Sequence.size() > i12) {
            responseData.f87354u0 = Extensions.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i12), true);
        }
        return responseData;
    }

    public ASN1GeneralizedTime getProducedAt() {
        return this.f87352s0;
    }

    public ResponderID getResponderID() {
        return this.f87351r0;
    }

    public Extensions getResponseExtensions() {
        return this.f87354u0;
    }

    public ASN1Sequence getResponses() {
        return this.f87353t0;
    }

    public ASN1Integer getVersion() {
        return this.f87350q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        boolean z10 = this.f87349p0;
        ASN1Integer aSN1Integer = this.f87350q0;
        if (z10 || !aSN1Integer.equals((ASN1Primitive) v0)) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Integer));
        }
        aSN1EncodableVector.add(this.f87351r0);
        aSN1EncodableVector.add(this.f87352s0);
        aSN1EncodableVector.add(this.f87353t0);
        Extensions extensions = this.f87354u0;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ResponseData(ResponderID responderID, ASN1GeneralizedTime aSN1GeneralizedTime, ASN1Sequence aSN1Sequence, Extensions extensions) {
        this(v0, responderID, aSN1GeneralizedTime, aSN1Sequence, extensions);
    }

    public static ResponseData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public ResponseData(ResponderID responderID, ASN1GeneralizedTime aSN1GeneralizedTime, ASN1Sequence aSN1Sequence, X509Extensions x509Extensions) {
        this(v0, responderID, ASN1GeneralizedTime.getInstance(aSN1GeneralizedTime), aSN1Sequence, Extensions.getInstance(x509Extensions));
    }
}
