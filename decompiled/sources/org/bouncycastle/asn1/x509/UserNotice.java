package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class UserNotice extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final NoticeReference f87722p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DisplayText f87723q0;

    public UserNotice(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.f87722p0 = NoticeReference.getInstance(aSN1Sequence.getObjectAt(0));
            this.f87723q0 = DisplayText.getInstance(aSN1Sequence.getObjectAt(1));
            return;
        }
        if (aSN1Sequence.size() == 1) {
            boolean z10 = aSN1Sequence.getObjectAt(0).toASN1Primitive() instanceof ASN1Sequence;
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
            if (!z10) {
                this.f87723q0 = DisplayText.getInstance(objectAt);
                this.f87722p0 = null;
                return;
            }
            this.f87722p0 = NoticeReference.getInstance(objectAt);
        } else {
            if (aSN1Sequence.size() != 0) {
                throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            }
            this.f87722p0 = null;
        }
        this.f87723q0 = null;
    }

    public static UserNotice getInstance(Object obj) {
        if (obj instanceof UserNotice) {
            return (UserNotice) obj;
        }
        if (obj != null) {
            return new UserNotice(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DisplayText getExplicitText() {
        return this.f87723q0;
    }

    public NoticeReference getNoticeRef() {
        return this.f87722p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        NoticeReference noticeReference = this.f87722p0;
        if (noticeReference != null) {
            aSN1EncodableVector.add(noticeReference);
        }
        DisplayText displayText = this.f87723q0;
        if (displayText != null) {
            aSN1EncodableVector.add(displayText);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public UserNotice(NoticeReference noticeReference, String str) {
        this(noticeReference, new DisplayText(str));
    }

    public UserNotice(NoticeReference noticeReference, DisplayText displayText) {
        this.f87722p0 = noticeReference;
        this.f87723q0 = displayText;
    }
}
