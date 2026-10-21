package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;

/* JADX INFO: loaded from: classes12.dex */
public class TimeStampReq extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87508p0 = new ASN1Integer(1);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public MessageImprint f87509q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87510r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Integer f87511s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1Boolean f87512t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Extensions f87513u0;

    public TimeStampReq(MessageImprint messageImprint, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Boolean aSN1Boolean, Extensions extensions) {
        this.f87509q0 = messageImprint;
        this.f87510r0 = aSN1ObjectIdentifier;
        this.f87511s0 = aSN1Integer;
        this.f87512t0 = aSN1Boolean;
        this.f87513u0 = extensions;
    }

    public static TimeStampReq getInstance(Object obj) {
        if (obj instanceof TimeStampReq) {
            return (TimeStampReq) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TimeStampReq timeStampReq = new TimeStampReq();
        int size = aSN1Sequence.size();
        timeStampReq.f87508p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        timeStampReq.f87509q0 = MessageImprint.getInstance(aSN1Sequence.getObjectAt(1));
        for (int i10 = 2; i10 < size; i10++) {
            if (aSN1Sequence.getObjectAt(i10) instanceof ASN1ObjectIdentifier) {
                timeStampReq.f87510r0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(i10));
            } else if (aSN1Sequence.getObjectAt(i10) instanceof ASN1Integer) {
                timeStampReq.f87511s0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10));
            } else if (aSN1Sequence.getObjectAt(i10) instanceof ASN1Boolean) {
                timeStampReq.f87512t0 = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(i10));
            } else if (aSN1Sequence.getObjectAt(i10) instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i10);
                if (aSN1TaggedObject.getTagNo() == 0) {
                    timeStampReq.f87513u0 = Extensions.getInstance(aSN1TaggedObject, false);
                }
            }
        }
        return timeStampReq;
    }

    public ASN1Boolean getCertReq() {
        return this.f87512t0;
    }

    public Extensions getExtensions() {
        return this.f87513u0;
    }

    public MessageImprint getMessageImprint() {
        return this.f87509q0;
    }

    public ASN1Integer getNonce() {
        return this.f87511s0;
    }

    public ASN1ObjectIdentifier getReqPolicy() {
        return this.f87510r0;
    }

    public ASN1Integer getVersion() {
        return this.f87508p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f87508p0);
        aSN1EncodableVector.add(this.f87509q0);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f87510r0;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        ASN1Integer aSN1Integer = this.f87511s0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ASN1Boolean aSN1Boolean = this.f87512t0;
        if (aSN1Boolean != null && aSN1Boolean.isTrue()) {
            aSN1EncodableVector.add(aSN1Boolean);
        }
        Extensions extensions = this.f87513u0;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
