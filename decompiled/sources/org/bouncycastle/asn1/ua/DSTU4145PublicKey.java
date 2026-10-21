package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes12.dex */
public class DSTU4145PublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1OctetString f87533p0;

    public DSTU4145PublicKey(ECPoint eCPoint) {
        this.f87533p0 = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCPoint));
    }

    public static DSTU4145PublicKey getInstance(Object obj) {
        if (obj instanceof DSTU4145PublicKey) {
            return (DSTU4145PublicKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(obj);
        DSTU4145PublicKey dSTU4145PublicKey = new DSTU4145PublicKey();
        dSTU4145PublicKey.f87533p0 = aSN1OctetString;
        return dSTU4145PublicKey;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87533p0;
    }
}
