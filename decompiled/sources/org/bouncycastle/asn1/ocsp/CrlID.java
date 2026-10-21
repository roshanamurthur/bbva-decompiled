package org.bouncycastle.asn1.ocsp;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class CrlID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DERIA5String f87336p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87337q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1GeneralizedTime f87338r0;

    public static CrlID getInstance(Object obj) {
        if (obj instanceof CrlID) {
            return (CrlID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CrlID crlID = new CrlID();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                crlID.f87336p0 = DERIA5String.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                crlID.f87337q0 = ASN1Integer.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag number: ")));
                }
                crlID.f87338r0 = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, true);
            }
        }
        return crlID;
    }

    public ASN1Integer getCrlNum() {
        return this.f87337q0;
    }

    public ASN1GeneralizedTime getCrlTime() {
        return this.f87338r0;
    }

    public DERIA5String getCrlUrl() {
        return this.f87336p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        DERIA5String dERIA5String = this.f87336p0;
        if (dERIA5String != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, dERIA5String));
        }
        ASN1Integer aSN1Integer = this.f87337q0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, aSN1Integer));
        }
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f87338r0;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, aSN1GeneralizedTime));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
