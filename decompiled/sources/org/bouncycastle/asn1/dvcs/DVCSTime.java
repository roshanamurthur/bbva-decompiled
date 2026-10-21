package org.bouncycastle.asn1.dvcs;

import java.util.Date;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.cms.ContentInfo;

/* JADX INFO: loaded from: classes12.dex */
public class DVCSTime extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1GeneralizedTime f87142p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ContentInfo f87143q0;

    public DVCSTime(Date date) {
        this(new ASN1GeneralizedTime(date));
    }

    public static DVCSTime getInstance(Object obj) {
        if (obj instanceof DVCSTime) {
            return (DVCSTime) obj;
        }
        if (obj instanceof ASN1GeneralizedTime) {
            return new DVCSTime(ASN1GeneralizedTime.getInstance(obj));
        }
        if (obj != null) {
            return new DVCSTime(ContentInfo.getInstance(obj));
        }
        return null;
    }

    public ASN1GeneralizedTime getGenTime() {
        return this.f87142p0;
    }

    public ContentInfo getTimeStampToken() {
        return this.f87143q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f87142p0;
        return aSN1GeneralizedTime != null ? aSN1GeneralizedTime : this.f87143q0.toASN1Primitive();
    }

    public String toString() {
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f87142p0;
        return aSN1GeneralizedTime != null ? aSN1GeneralizedTime.toString() : this.f87143q0.toString();
    }

    public DVCSTime(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.f87142p0 = aSN1GeneralizedTime;
        this.f87143q0 = null;
    }

    public static DVCSTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public DVCSTime(ContentInfo contentInfo) {
        this.f87142p0 = null;
        this.f87143q0 = contentInfo;
    }
}
