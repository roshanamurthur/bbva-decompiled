package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes12.dex */
public class PKIFreeText extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f86785p0;

    public PKIFreeText(String str) {
        this(new DERUTF8String(str));
    }

    public static PKIFreeText getInstance(Object obj) {
        if (obj instanceof PKIFreeText) {
            return (PKIFreeText) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PKIFreeText pKIFreeText = new PKIFreeText();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            if (!(objects.nextElement() instanceof DERUTF8String)) {
                throw new IllegalArgumentException("attempt to insert non UTF8 STRING into PKIFreeText");
            }
        }
        pKIFreeText.f86785p0 = aSN1Sequence;
        return pKIFreeText;
    }

    public DERUTF8String getStringAt(int i10) {
        return (DERUTF8String) this.f86785p0.getObjectAt(i10);
    }

    public int size() {
        return this.f86785p0.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86785p0;
    }

    public PKIFreeText(DERUTF8String dERUTF8String) {
        this.f86785p0 = new DERSequence(dERUTF8String);
    }

    public static PKIFreeText getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public PKIFreeText(String[] strArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(strArr.length);
        for (String str : strArr) {
            aSN1EncodableVector.add(new DERUTF8String(str));
        }
        this.f86785p0 = new DERSequence(aSN1EncodableVector);
    }

    public PKIFreeText(DERUTF8String[] dERUTF8StringArr) {
        this.f86785p0 = new DERSequence(dERUTF8StringArr);
    }
}
