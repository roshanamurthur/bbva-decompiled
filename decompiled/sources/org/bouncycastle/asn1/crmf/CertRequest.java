package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CertRequest extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87007p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CertTemplate f87008q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Controls f87009r0;

    public CertRequest(int i10, CertTemplate certTemplate, Controls controls) {
        this(new ASN1Integer(i10), certTemplate, controls);
    }

    public static CertRequest getInstance(Object obj) {
        if (obj instanceof CertRequest) {
            return (CertRequest) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertRequest certRequest = new CertRequest();
        certRequest.f87007p0 = new ASN1Integer(ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue());
        certRequest.f87008q0 = CertTemplate.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            certRequest.f87009r0 = Controls.getInstance(aSN1Sequence.getObjectAt(2));
        }
        return certRequest;
    }

    public ASN1Integer getCertReqId() {
        return this.f87007p0;
    }

    public CertTemplate getCertTemplate() {
        return this.f87008q0;
    }

    public Controls getControls() {
        return this.f87009r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87007p0);
        aSN1EncodableVector.add(this.f87008q0);
        Controls controls = this.f87009r0;
        if (controls != null) {
            aSN1EncodableVector.add(controls);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertRequest(ASN1Integer aSN1Integer, CertTemplate certTemplate, Controls controls) {
        this.f87007p0 = aSN1Integer;
        this.f87008q0 = certTemplate;
        this.f87009r0 = controls;
    }
}
