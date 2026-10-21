package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class NoticeReference extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DisplayText f87653p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87654q0;

    public NoticeReference(String str, Vector vector) {
        ASN1Integer aSN1Integer;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(vector.size());
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            Object objNextElement = enumerationElements.nextElement();
            if (objNextElement instanceof BigInteger) {
                aSN1Integer = new ASN1Integer((BigInteger) objNextElement);
            } else {
                if (!(objNextElement instanceof Integer)) {
                    throw new IllegalArgumentException();
                }
                aSN1Integer = new ASN1Integer(((Integer) objNextElement).intValue());
            }
            aSN1EncodableVector.add(aSN1Integer);
        }
        this(str, aSN1EncodableVector);
    }

    public static NoticeReference getInstance(Object obj) {
        if (obj instanceof NoticeReference) {
            return (NoticeReference) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        NoticeReference noticeReference = new NoticeReference();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        noticeReference.f87653p0 = DisplayText.getInstance(aSN1Sequence.getObjectAt(0));
        noticeReference.f87654q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        return noticeReference;
    }

    public ASN1Integer[] getNoticeNumbers() {
        ASN1Sequence aSN1Sequence = this.f87654q0;
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            aSN1IntegerArr[i10] = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return aSN1IntegerArr;
    }

    public DisplayText getOrganization() {
        return this.f87653p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87653p0);
        aSN1EncodableVector.add(this.f87654q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public NoticeReference(String str, ASN1EncodableVector aSN1EncodableVector) {
        this(new DisplayText(str), aSN1EncodableVector);
    }

    public NoticeReference(DisplayText displayText, ASN1EncodableVector aSN1EncodableVector) {
        this.f87653p0 = displayText;
        this.f87654q0 = new DERSequence(aSN1EncodableVector);
    }
}
