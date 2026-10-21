package org.bouncycastle.asn1.eac;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class UnsignedInteger extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f87193p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f87194q0;

    public UnsignedInteger(int i10, BigInteger bigInteger) {
        this.f87193p0 = i10;
        this.f87194q0 = bigInteger;
    }

    public static UnsignedInteger getInstance(Object obj) {
        if (obj instanceof UnsignedInteger) {
            return (UnsignedInteger) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj);
        UnsignedInteger unsignedInteger = new UnsignedInteger();
        unsignedInteger.f87193p0 = aSN1TaggedObject.getTagNo();
        unsignedInteger.f87194q0 = new BigInteger(1, ASN1OctetString.getInstance(aSN1TaggedObject, false).getOctets());
        return unsignedInteger;
    }

    public int getTagNo() {
        return this.f87193p0;
    }

    public BigInteger getValue() {
        return this.f87194q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        byte[] byteArray = this.f87194q0.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        return new DERTaggedObject(false, this.f87193p0, new DEROctetString(byteArray));
    }
}
