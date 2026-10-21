package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes12.dex */
public class CRLNumber extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f87588p0;

    public CRLNumber(BigInteger bigInteger) {
        this.f87588p0 = bigInteger;
    }

    public static CRLNumber getInstance(Object obj) {
        if (obj instanceof CRLNumber) {
            return (CRLNumber) obj;
        }
        if (obj != null) {
            return new CRLNumber(ASN1Integer.getInstance(obj).getValue());
        }
        return null;
    }

    public BigInteger getCRLNumber() {
        return this.f87588p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.f87588p0);
    }

    public String toString() {
        return "CRLNumber: " + getCRLNumber();
    }
}
