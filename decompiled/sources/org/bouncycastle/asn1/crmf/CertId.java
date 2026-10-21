package org.bouncycastle.asn1.crmf;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class CertId extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GeneralName f87001p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87002q0;

    public CertId(GeneralName generalName, BigInteger bigInteger) {
        this(generalName, new ASN1Integer(bigInteger));
    }

    public static CertId getInstance(Object obj) {
        if (obj instanceof CertId) {
            return (CertId) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertId certId = new CertId();
        certId.f87001p0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        certId.f87002q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        return certId;
    }

    public GeneralName getIssuer() {
        return this.f87001p0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f87002q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87001p0);
        aSN1EncodableVector.add(this.f87002q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public CertId(GeneralName generalName, ASN1Integer aSN1Integer) {
        this.f87001p0 = generalName;
        this.f87002q0 = aSN1Integer;
    }

    public static CertId getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
