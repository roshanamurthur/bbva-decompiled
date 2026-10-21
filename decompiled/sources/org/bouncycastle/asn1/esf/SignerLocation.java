package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes12.dex */
public class SignerLocation extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DirectoryString f87237p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DirectoryString f87238q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87239r0;

    public SignerLocation(DERUTF8String dERUTF8String, DERUTF8String dERUTF8String2, ASN1Sequence aSN1Sequence) {
        this(DirectoryString.getInstance(dERUTF8String), DirectoryString.getInstance(dERUTF8String2), aSN1Sequence);
    }

    public static SignerLocation getInstance(Object obj) {
        if (obj == null || (obj instanceof SignerLocation)) {
            return (SignerLocation) obj;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SignerLocation signerLocation = new SignerLocation();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                signerLocation.f87237p0 = DirectoryString.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                signerLocation.f87238q0 = DirectoryString.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException("illegal tag");
                }
                signerLocation.f87239r0 = aSN1TaggedObject.isExplicit() ? ASN1Sequence.getInstance(aSN1TaggedObject, true) : ASN1Sequence.getInstance(aSN1TaggedObject, false);
                ASN1Sequence aSN1Sequence2 = signerLocation.f87239r0;
                if (aSN1Sequence2 != null && aSN1Sequence2.size() > 6) {
                    throw new IllegalArgumentException("postal address must contain less than 6 strings");
                }
            }
        }
        return signerLocation;
    }

    public DirectoryString getCountry() {
        return this.f87237p0;
    }

    public DERUTF8String getCountryName() {
        if (this.f87237p0 == null) {
            return null;
        }
        return new DERUTF8String(getCountry().getString());
    }

    public DirectoryString getLocality() {
        return this.f87238q0;
    }

    public DERUTF8String getLocalityName() {
        if (this.f87238q0 == null) {
            return null;
        }
        return new DERUTF8String(getLocality().getString());
    }

    public DirectoryString[] getPostal() {
        ASN1Sequence aSN1Sequence = this.f87239r0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        DirectoryString[] directoryStringArr = new DirectoryString[size];
        for (int i10 = 0; i10 != size; i10++) {
            directoryStringArr[i10] = DirectoryString.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return directoryStringArr;
    }

    public ASN1Sequence getPostalAddress() {
        return this.f87239r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        DirectoryString directoryString = this.f87237p0;
        if (directoryString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, directoryString));
        }
        DirectoryString directoryString2 = this.f87238q0;
        if (directoryString2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, directoryString2));
        }
        ASN1Sequence aSN1Sequence = this.f87239r0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, aSN1Sequence));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SignerLocation(DirectoryString directoryString, DirectoryString directoryString2, ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence != null && aSN1Sequence.size() > 6) {
            throw new IllegalArgumentException("postal address must contain less than 6 strings");
        }
        this.f87237p0 = directoryString;
        this.f87238q0 = directoryString2;
        this.f87239r0 = aSN1Sequence;
    }

    public SignerLocation(DirectoryString directoryString, DirectoryString directoryString2, DirectoryString[] directoryStringArr) {
        this(directoryString, directoryString2, new DERSequence(directoryStringArr));
    }
}
