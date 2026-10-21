package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.EnvelopedData;

/* JADX INFO: loaded from: classes12.dex */
public class POPOPrivKey extends ASN1Object implements ASN1Choice {
    public static final int agreeMAC = 3;
    public static final int dhMAC = 2;
    public static final int encryptedKey = 4;
    public static final int subsequentMessage = 1;
    public static final int thisMessage = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f87049p0 = 3;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Object f87050q0;

    public POPOPrivKey(PKMACValue pKMACValue) {
        this.f87050q0 = pKMACValue;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    public static POPOPrivKey getInstance(Object obj) {
        ASN1Object dERBitString;
        if (obj instanceof POPOPrivKey) {
            return (POPOPrivKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj);
        POPOPrivKey pOPOPrivKey = new POPOPrivKey();
        int tagNo = aSN1TaggedObject.getTagNo();
        pOPOPrivKey.f87049p0 = tagNo;
        if (tagNo == 0) {
            dERBitString = DERBitString.getInstance(aSN1TaggedObject, false);
        } else if (tagNo == 1) {
            dERBitString = SubsequentMessage.valueOf(ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact());
        } else if (tagNo == 2) {
            dERBitString = DERBitString.getInstance(aSN1TaggedObject, false);
        } else if (tagNo == 3) {
            dERBitString = PKMACValue.getInstance(aSN1TaggedObject, false);
        } else {
            if (tagNo != 4) {
                throw new IllegalArgumentException("unknown tag in POPOPrivKey");
            }
            dERBitString = EnvelopedData.getInstance(aSN1TaggedObject, false);
        }
        pOPOPrivKey.f87050q0 = dERBitString;
        return pOPOPrivKey;
    }

    public int getType() {
        return this.f87049p0;
    }

    public ASN1Encodable getValue() {
        return this.f87050q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.f87049p0, this.f87050q0);
    }

    public POPOPrivKey(SubsequentMessage subsequentMessage2) {
        this.f87050q0 = subsequentMessage2;
    }

    public static POPOPrivKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1TaggedObject.getInstance(aSN1TaggedObject, z10));
    }
}
