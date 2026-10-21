package org.bouncycastle.asn1.isismtt.x509;

import androidx.camera.core.impl.utils.b;
import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Choice;
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

/* JADX INFO: loaded from: classes12.dex */
public class DeclarationOfMajority extends ASN1Object implements ASN1Choice {
    public static final int dateOfBirth = 2;
    public static final int fullAgeAtCountry = 1;
    public static final int notYoungerThan = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1TaggedObject f87293p0;

    public DeclarationOfMajority(int i10) {
        this.f87293p0 = new DERTaggedObject(false, 0, new ASN1Integer(i10));
    }

    public static DeclarationOfMajority getInstance(Object obj) {
        if (obj == null || (obj instanceof DeclarationOfMajority)) {
            return (DeclarationOfMajority) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        DeclarationOfMajority declarationOfMajority = new DeclarationOfMajority();
        if (aSN1TaggedObject.getTagNo() > 2) {
            throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
        }
        declarationOfMajority.f87293p0 = aSN1TaggedObject;
        return declarationOfMajority;
    }

    public ASN1Sequence fullAgeAtCountry() {
        ASN1TaggedObject aSN1TaggedObject = this.f87293p0;
        if (aSN1TaggedObject.getTagNo() != 1) {
            return null;
        }
        return ASN1Sequence.getInstance(aSN1TaggedObject, false);
    }

    public ASN1GeneralizedTime getDateOfBirth() {
        ASN1TaggedObject aSN1TaggedObject = this.f87293p0;
        if (aSN1TaggedObject.getTagNo() != 2) {
            return null;
        }
        return ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
    }

    public int getType() {
        return this.f87293p0.getTagNo();
    }

    public int notYoungerThan() {
        ASN1TaggedObject aSN1TaggedObject = this.f87293p0;
        if (aSN1TaggedObject.getTagNo() != 0) {
            return -1;
        }
        return ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87293p0;
    }

    public DeclarationOfMajority(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.f87293p0 = new DERTaggedObject(false, 2, aSN1GeneralizedTime);
    }

    public DeclarationOfMajority(boolean z10, String str) {
        if (str.length() > 2) {
            throw new IllegalArgumentException("country can only be 2 characters");
        }
        if (z10) {
            this.f87293p0 = new DERTaggedObject(false, 1, new DERSequence(new DERPrintableString(str, true)));
            return;
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(ASN1Boolean.FALSE);
        aSN1EncodableVector.add(new DERPrintableString(str, true));
        this.f87293p0 = new DERTaggedObject(false, 1, new DERSequence(aSN1EncodableVector));
    }
}
