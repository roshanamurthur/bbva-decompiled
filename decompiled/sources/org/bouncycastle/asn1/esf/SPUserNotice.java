package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.asn1.x509.NoticeReference;

/* JADX INFO: loaded from: classes12.dex */
public class SPUserNotice extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NoticeReference f87225p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DisplayText f87226q0;

    public SPUserNotice(NoticeReference noticeReference, DisplayText displayText) {
        this.f87225p0 = noticeReference;
        this.f87226q0 = displayText;
    }

    public static SPUserNotice getInstance(Object obj) {
        if (obj instanceof SPUserNotice) {
            return (SPUserNotice) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SPUserNotice sPUserNotice = new SPUserNotice();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
            if ((aSN1Encodable instanceof DisplayText) || (aSN1Encodable instanceof ASN1String)) {
                sPUserNotice.f87226q0 = DisplayText.getInstance(aSN1Encodable);
            } else {
                if (!(aSN1Encodable instanceof NoticeReference) && !(aSN1Encodable instanceof ASN1Sequence)) {
                    throw new IllegalArgumentException("Invalid element in 'SPUserNotice': ".concat(aSN1Encodable.getClass().getName()));
                }
                sPUserNotice.f87225p0 = NoticeReference.getInstance(aSN1Encodable);
            }
        }
        return sPUserNotice;
    }

    public DisplayText getExplicitText() {
        return this.f87226q0;
    }

    public NoticeReference getNoticeRef() {
        return this.f87225p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        NoticeReference noticeReference = this.f87225p0;
        if (noticeReference != null) {
            aSN1EncodableVector.add(noticeReference);
        }
        DisplayText displayText = this.f87226q0;
        if (displayText != null) {
            aSN1EncodableVector.add(displayText);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
