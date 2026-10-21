package org.bouncycastle.asn1.isismtt.x509;

import androidx.databinding.c;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class MonetaryLimit extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DERPrintableString f87294p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87295q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87296r0;

    public MonetaryLimit(String str, int i10, int i11) {
        this.f87294p0 = new DERPrintableString(str, true);
        this.f87295q0 = new ASN1Integer(i10);
        this.f87296r0 = new ASN1Integer(i11);
    }

    public static MonetaryLimit getInstance(Object obj) {
        if (obj == null || (obj instanceof MonetaryLimit)) {
            return (MonetaryLimit) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException("unknown object in getInstance");
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        MonetaryLimit monetaryLimit = new MonetaryLimit();
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        monetaryLimit.f87294p0 = DERPrintableString.getInstance(objects.nextElement());
        monetaryLimit.f87295q0 = ASN1Integer.getInstance(objects.nextElement());
        monetaryLimit.f87296r0 = ASN1Integer.getInstance(objects.nextElement());
        return monetaryLimit;
    }

    public BigInteger getAmount() {
        return this.f87295q0.getValue();
    }

    public String getCurrency() {
        return this.f87294p0.getString();
    }

    public BigInteger getExponent() {
        return this.f87296r0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87294p0);
        aSN1EncodableVector.add(this.f87295q0);
        aSN1EncodableVector.add(this.f87296r0);
        return new DERSequence(aSN1EncodableVector);
    }
}
