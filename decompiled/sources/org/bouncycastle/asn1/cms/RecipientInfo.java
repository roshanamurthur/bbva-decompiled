package org.bouncycastle.asn1.cms;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class RecipientInfo extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Object f86951p0;

    public RecipientInfo(ASN1Primitive aSN1Primitive) {
        this.f86951p0 = aSN1Primitive;
    }

    public static RecipientInfo getInstance(Object obj) {
        if (obj == null || (obj instanceof RecipientInfo)) {
            return (RecipientInfo) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new RecipientInfo((ASN1Sequence) obj);
        }
        if (obj instanceof ASN1TaggedObject) {
            return new RecipientInfo((ASN1TaggedObject) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "unknown object in factory: "));
    }

    public ASN1Encodable getInfo() {
        ASN1Object aSN1Object = this.f86951p0;
        if (!(aSN1Object instanceof ASN1TaggedObject)) {
            return KeyTransRecipientInfo.getInstance(aSN1Object);
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Object;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 1) {
            return KeyAgreeRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 2) {
            return aSN1TaggedObject.isExplicit() ? KEKRecipientInfo.getInstance(aSN1TaggedObject, true) : KEKRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 3) {
            return PasswordRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 4) {
            return OtherRecipientInfo.getInstance(aSN1TaggedObject, false);
        }
        throw new IllegalStateException("unknown tag");
    }

    public ASN1Integer getVersion() {
        ASN1Object aSN1Object = this.f86951p0;
        if (!(aSN1Object instanceof ASN1TaggedObject)) {
            return KeyTransRecipientInfo.getInstance(aSN1Object).getVersion();
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Object;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 1) {
            return KeyAgreeRecipientInfo.getInstance(aSN1TaggedObject, false).getVersion();
        }
        if (tagNo == 2) {
            return (aSN1TaggedObject.isExplicit() ? KEKRecipientInfo.getInstance(aSN1TaggedObject, true) : KEKRecipientInfo.getInstance(aSN1TaggedObject, false)).getVersion();
        }
        if (tagNo == 3) {
            return PasswordRecipientInfo.getInstance(aSN1TaggedObject, false).getVersion();
        }
        if (tagNo == 4) {
            return new ASN1Integer(0L);
        }
        throw new IllegalStateException("unknown tag");
    }

    public boolean isTagged() {
        return this.f86951p0 instanceof ASN1TaggedObject;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86951p0.toASN1Primitive();
    }

    public RecipientInfo(KEKRecipientInfo kEKRecipientInfo) {
        this.f86951p0 = new DERTaggedObject(false, 2, kEKRecipientInfo);
    }

    public RecipientInfo(KeyAgreeRecipientInfo keyAgreeRecipientInfo) {
        this.f86951p0 = new DERTaggedObject(false, 1, keyAgreeRecipientInfo);
    }

    public RecipientInfo(KeyTransRecipientInfo keyTransRecipientInfo) {
        this.f86951p0 = keyTransRecipientInfo;
    }

    public RecipientInfo(OtherRecipientInfo otherRecipientInfo) {
        this.f86951p0 = new DERTaggedObject(false, 4, otherRecipientInfo);
    }

    public RecipientInfo(PasswordRecipientInfo passwordRecipientInfo) {
        this.f86951p0 = new DERTaggedObject(false, 3, passwordRecipientInfo);
    }
}
