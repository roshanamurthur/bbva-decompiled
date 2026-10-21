package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ErrorMsgContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PKIStatusInfo f86764p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f86765q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PKIFreeText f86766r0;

    public ErrorMsgContent(PKIStatusInfo pKIStatusInfo) {
        this(pKIStatusInfo, null, null);
    }

    public static ErrorMsgContent getInstance(Object obj) {
        if (obj instanceof ErrorMsgContent) {
            return (ErrorMsgContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ErrorMsgContent errorMsgContent = new ErrorMsgContent();
        Enumeration objects = aSN1Sequence.getObjects();
        errorMsgContent.f86764p0 = PKIStatusInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            Object objNextElement = objects.nextElement();
            if (objNextElement instanceof ASN1Integer) {
                errorMsgContent.f86765q0 = ASN1Integer.getInstance(objNextElement);
            } else {
                errorMsgContent.f86766r0 = PKIFreeText.getInstance(objNextElement);
            }
        }
        return errorMsgContent;
    }

    public ASN1Integer getErrorCode() {
        return this.f86765q0;
    }

    public PKIFreeText getErrorDetails() {
        return this.f86766r0;
    }

    public PKIStatusInfo getPKIStatusInfo() {
        return this.f86764p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86764p0);
        ASN1Integer aSN1Integer = this.f86765q0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        PKIFreeText pKIFreeText = this.f86766r0;
        if (pKIFreeText != null) {
            aSN1EncodableVector.add(pKIFreeText);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ErrorMsgContent(PKIStatusInfo pKIStatusInfo, ASN1Integer aSN1Integer, PKIFreeText pKIFreeText) {
        if (pKIStatusInfo == null) {
            throw new IllegalArgumentException("'pkiStatusInfo' cannot be null");
        }
        this.f86764p0 = pKIStatusInfo;
        this.f86765q0 = aSN1Integer;
        this.f86766r0 = pKIFreeText;
    }
}
