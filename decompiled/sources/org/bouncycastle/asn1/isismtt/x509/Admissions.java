package org.bouncycastle.asn1.isismtt.x509;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class Admissions extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GeneralName f87290p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public NamingAuthority f87291q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87292r0;

    public Admissions(GeneralName generalName, NamingAuthority namingAuthority, ProfessionInfo[] professionInfoArr) {
        this.f87290p0 = generalName;
        this.f87291q0 = namingAuthority;
        this.f87292r0 = new DERSequence(professionInfoArr);
    }

    public static Admissions getInstance(Object obj) {
        if (obj == null || (obj instanceof Admissions)) {
            return (Admissions) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        Admissions admissions = new Admissions();
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                admissions.f87290p0 = GeneralName.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
                }
                admissions.f87291q0 = NamingAuthority.getInstance(aSN1TaggedObject, true);
            }
            aSN1Encodable = (ASN1Encodable) objects.nextElement();
        }
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) aSN1Encodable;
            if (aSN1TaggedObject2.getTagNo() != 1) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject2, new StringBuilder("Bad tag number: ")));
            }
            admissions.f87291q0 = NamingAuthority.getInstance(aSN1TaggedObject2, true);
            aSN1Encodable = (ASN1Encodable) objects.nextElement();
        }
        admissions.f87292r0 = ASN1Sequence.getInstance(aSN1Encodable);
        if (!objects.hasMoreElements()) {
            return admissions;
        }
        throw new IllegalArgumentException("Bad object encountered: " + objects.nextElement().getClass());
    }

    public GeneralName getAdmissionAuthority() {
        return this.f87290p0;
    }

    public NamingAuthority getNamingAuthority() {
        return this.f87291q0;
    }

    public ProfessionInfo[] getProfessionInfos() {
        ASN1Sequence aSN1Sequence = this.f87292r0;
        ProfessionInfo[] professionInfoArr = new ProfessionInfo[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            professionInfoArr[i10] = ProfessionInfo.getInstance(objects.nextElement());
            i10++;
        }
        return professionInfoArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        GeneralName generalName = this.f87290p0;
        if (generalName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, generalName));
        }
        NamingAuthority namingAuthority = this.f87291q0;
        if (namingAuthority != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, namingAuthority));
        }
        aSN1EncodableVector.add(this.f87292r0);
        return new DERSequence(aSN1EncodableVector);
    }
}
