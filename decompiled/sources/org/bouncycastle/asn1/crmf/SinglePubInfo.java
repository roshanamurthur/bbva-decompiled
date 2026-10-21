package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class SinglePubInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87059p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralName f87060q0;
    public static final ASN1Integer dontCare = new ASN1Integer(0);
    public static final ASN1Integer x500 = new ASN1Integer(1);
    public static final ASN1Integer web = new ASN1Integer(2);
    public static final ASN1Integer ldap = new ASN1Integer(3);

    public SinglePubInfo(ASN1Integer aSN1Integer, GeneralName generalName) {
        this.f87059p0 = aSN1Integer;
        this.f87060q0 = generalName;
    }

    public static SinglePubInfo getInstance(Object obj) {
        if (obj instanceof SinglePubInfo) {
            return (SinglePubInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SinglePubInfo singlePubInfo = new SinglePubInfo();
        singlePubInfo.f87059p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            singlePubInfo.f87060q0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return singlePubInfo;
    }

    public GeneralName getPubLocation() {
        return this.f87060q0;
    }

    public ASN1Integer getPubMethod() {
        return this.f87059p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87059p0);
        GeneralName generalName = this.f87060q0;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
