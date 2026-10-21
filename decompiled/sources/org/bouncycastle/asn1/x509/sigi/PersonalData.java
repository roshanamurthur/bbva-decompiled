package org.bouncycastle.asn1.x509.sigi;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes12.dex */
public class PersonalData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NameOrPseudonym f87802p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f87803q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1GeneralizedTime f87804r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public DirectoryString f87805s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f87806t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public DirectoryString f87807u0;

    public PersonalData(NameOrPseudonym nameOrPseudonym, BigInteger bigInteger, ASN1GeneralizedTime aSN1GeneralizedTime, DirectoryString directoryString, String str, DirectoryString directoryString2) {
        this.f87802p0 = nameOrPseudonym;
        this.f87804r0 = aSN1GeneralizedTime;
        this.f87806t0 = str;
        this.f87803q0 = bigInteger;
        this.f87807u0 = directoryString2;
        this.f87805s0 = directoryString;
    }

    public static PersonalData getInstance(Object obj) {
        if (obj == null || (obj instanceof PersonalData)) {
            return (PersonalData) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        PersonalData personalData = new PersonalData();
        if (aSN1Sequence.size() < 1) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        personalData.f87802p0 = NameOrPseudonym.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                personalData.f87803q0 = ASN1Integer.getInstance(aSN1TaggedObject, false).getValue();
            } else if (tagNo == 1) {
                personalData.f87804r0 = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                personalData.f87805s0 = DirectoryString.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 3) {
                personalData.f87806t0 = DERPrintableString.getInstance(aSN1TaggedObject, false).getString();
            } else {
                if (tagNo != 4) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
                }
                personalData.f87807u0 = DirectoryString.getInstance(aSN1TaggedObject, true);
            }
        }
        return personalData;
    }

    public ASN1GeneralizedTime getDateOfBirth() {
        return this.f87804r0;
    }

    public String getGender() {
        return this.f87806t0;
    }

    public BigInteger getNameDistinguisher() {
        return this.f87803q0;
    }

    public NameOrPseudonym getNameOrPseudonym() {
        return this.f87802p0;
    }

    public DirectoryString getPlaceOfBirth() {
        return this.f87805s0;
    }

    public DirectoryString getPostalAddress() {
        return this.f87807u0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f87802p0);
        BigInteger bigInteger = this.f87803q0;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, new ASN1Integer(bigInteger)));
        }
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f87804r0;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1GeneralizedTime));
        }
        DirectoryString directoryString = this.f87805s0;
        if (directoryString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, directoryString));
        }
        String str = this.f87806t0;
        if (str != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, new DERPrintableString(str, true)));
        }
        DirectoryString directoryString2 = this.f87807u0;
        if (directoryString2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 4, directoryString2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
