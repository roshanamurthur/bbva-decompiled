package org.bouncycastle.asn1.isismtt.x509;

import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class AdmissionSyntax extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GeneralName f87288p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87289q0;

    public AdmissionSyntax(GeneralName generalName, ASN1Sequence aSN1Sequence) {
        this.f87288p0 = generalName;
        this.f87289q0 = aSN1Sequence;
    }

    public static AdmissionSyntax getInstance(Object obj) {
        ASN1Encodable objectAt;
        if (obj == null || (obj instanceof AdmissionSyntax)) {
            return (AdmissionSyntax) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        AdmissionSyntax admissionSyntax = new AdmissionSyntax();
        int size = aSN1Sequence.size();
        if (size == 1) {
            objectAt = aSN1Sequence.getObjectAt(0);
        } else {
            if (size != 2) {
                throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            }
            admissionSyntax.f87288p0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
            objectAt = aSN1Sequence.getObjectAt(1);
        }
        admissionSyntax.f87289q0 = ASN1Sequence.getInstance(objectAt);
        return admissionSyntax;
    }

    public GeneralName getAdmissionAuthority() {
        return this.f87288p0;
    }

    public Admissions[] getContentsOfAdmissions() {
        ASN1Sequence aSN1Sequence = this.f87289q0;
        Admissions[] admissionsArr = new Admissions[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            admissionsArr[i10] = Admissions.getInstance(objects.nextElement());
            i10++;
        }
        return admissionsArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        GeneralName generalName = this.f87288p0;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        aSN1EncodableVector.add(this.f87289q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
