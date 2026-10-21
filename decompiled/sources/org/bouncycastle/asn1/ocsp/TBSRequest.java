package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes12.dex */
public class TBSRequest extends ASN1Object {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final ASN1Integer f87367u0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87368p0 = f87367u0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralName f87369q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87370r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Extensions f87371s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f87372t0;

    public TBSRequest(GeneralName generalName, ASN1Sequence aSN1Sequence, Extensions extensions) {
        this.f87369q0 = generalName;
        this.f87370r0 = aSN1Sequence;
        this.f87371s0 = extensions;
    }

    public static TBSRequest getInstance(Object obj) {
        if (obj instanceof TBSRequest) {
            return (TBSRequest) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TBSRequest tBSRequest = new TBSRequest();
        int i10 = 0;
        boolean z10 = aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject;
        ASN1Integer aSN1Integer = f87367u0;
        if (z10 && ((ASN1TaggedObject) aSN1Sequence.getObjectAt(0)).getTagNo() == 0) {
            tBSRequest.f87372t0 = true;
            tBSRequest.f87368p0 = ASN1Integer.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i10 = 1;
        } else {
            tBSRequest.f87368p0 = aSN1Integer;
        }
        if (aSN1Sequence.getObjectAt(i10) instanceof ASN1TaggedObject) {
            tBSRequest.f87369q0 = GeneralName.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i10), true);
            i10++;
        }
        int i11 = i10 + 1;
        tBSRequest.f87370r0 = (ASN1Sequence) aSN1Sequence.getObjectAt(i10);
        if (aSN1Sequence.size() == i10 + 2) {
            tBSRequest.f87371s0 = Extensions.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i11), true);
        }
        return tBSRequest;
    }

    public Extensions getRequestExtensions() {
        return this.f87371s0;
    }

    public ASN1Sequence getRequestList() {
        return this.f87370r0;
    }

    public GeneralName getRequestorName() {
        return this.f87369q0;
    }

    public ASN1Integer getVersion() {
        return this.f87368p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        ASN1Integer aSN1Integer = f87367u0;
        ASN1Integer aSN1Integer2 = this.f87368p0;
        if (!aSN1Integer2.equals((ASN1Primitive) aSN1Integer) || this.f87372t0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Integer2));
        }
        GeneralName generalName = this.f87369q0;
        if (generalName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, generalName));
        }
        aSN1EncodableVector.add(this.f87370r0);
        Extensions extensions = this.f87371s0;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public TBSRequest(GeneralName generalName, ASN1Sequence aSN1Sequence, X509Extensions x509Extensions) {
        this.f87369q0 = generalName;
        this.f87370r0 = aSN1Sequence;
        this.f87371s0 = Extensions.getInstance(x509Extensions);
    }

    public static TBSRequest getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
