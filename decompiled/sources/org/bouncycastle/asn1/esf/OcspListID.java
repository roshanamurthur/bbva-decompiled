package org.bouncycastle.asn1.esf;

import androidx.databinding.c;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class OcspListID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87211p0;

    public OcspListID(OcspResponsesID[] ocspResponsesIDArr) {
        this.f87211p0 = new DERSequence(ocspResponsesIDArr);
    }

    public static OcspListID getInstance(Object obj) {
        if (obj instanceof OcspListID) {
            return (OcspListID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OcspListID ocspListID = new OcspListID();
        if (aSN1Sequence.size() != 1) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        ocspListID.f87211p0 = aSN1Sequence2;
        Enumeration objects = aSN1Sequence2.getObjects();
        while (objects.hasMoreElements()) {
            OcspResponsesID.getInstance(objects.nextElement());
        }
        return ocspListID;
    }

    public OcspResponsesID[] getOcspResponses() {
        ASN1Sequence aSN1Sequence = this.f87211p0;
        int size = aSN1Sequence.size();
        OcspResponsesID[] ocspResponsesIDArr = new OcspResponsesID[size];
        for (int i10 = 0; i10 < size; i10++) {
            ocspResponsesIDArr[i10] = OcspResponsesID.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return ocspResponsesIDArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f87211p0);
    }
}
