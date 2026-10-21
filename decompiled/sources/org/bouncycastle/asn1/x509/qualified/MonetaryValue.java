package org.bouncycastle.asn1.x509.qualified;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class MonetaryValue extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Iso4217CurrencyCode f87791p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87792q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87793r0;

    public MonetaryValue(Iso4217CurrencyCode iso4217CurrencyCode, int i10, int i11) {
        this.f87791p0 = iso4217CurrencyCode;
        this.f87792q0 = new ASN1Integer(i10);
        this.f87793r0 = new ASN1Integer(i11);
    }

    public static MonetaryValue getInstance(Object obj) {
        if (obj instanceof MonetaryValue) {
            return (MonetaryValue) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        MonetaryValue monetaryValue = new MonetaryValue();
        Enumeration objects = aSN1Sequence.getObjects();
        monetaryValue.f87791p0 = Iso4217CurrencyCode.getInstance(objects.nextElement());
        monetaryValue.f87792q0 = ASN1Integer.getInstance(objects.nextElement());
        monetaryValue.f87793r0 = ASN1Integer.getInstance(objects.nextElement());
        return monetaryValue;
    }

    public BigInteger getAmount() {
        return this.f87792q0.getValue();
    }

    public Iso4217CurrencyCode getCurrency() {
        return this.f87791p0;
    }

    public BigInteger getExponent() {
        return this.f87793r0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87791p0);
        aSN1EncodableVector.add(this.f87792q0);
        aSN1EncodableVector.add(this.f87793r0);
        return new DERSequence(aSN1EncodableVector);
    }
}
