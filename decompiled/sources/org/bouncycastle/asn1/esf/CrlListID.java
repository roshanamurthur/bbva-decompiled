package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CrlListID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87203p0;

    public CrlListID(CrlValidatedID[] crlValidatedIDArr) {
        this.f87203p0 = new DERSequence(crlValidatedIDArr);
    }

    public static CrlListID getInstance(Object obj) {
        if (obj instanceof CrlListID) {
            return (CrlListID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CrlListID crlListID = new CrlListID();
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        crlListID.f87203p0 = aSN1Sequence2;
        Enumeration objects = aSN1Sequence2.getObjects();
        while (objects.hasMoreElements()) {
            CrlValidatedID.getInstance(objects.nextElement());
        }
        return crlListID;
    }

    public CrlValidatedID[] getCrls() {
        ASN1Sequence aSN1Sequence = this.f87203p0;
        int size = aSN1Sequence.size();
        CrlValidatedID[] crlValidatedIDArr = new CrlValidatedID[size];
        for (int i10 = 0; i10 < size; i10++) {
            crlValidatedIDArr[i10] = CrlValidatedID.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return crlValidatedIDArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f87203p0);
    }
}
