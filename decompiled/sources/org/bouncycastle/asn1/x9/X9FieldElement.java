package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECFieldElement;

/* JADX INFO: loaded from: classes12.dex */
public class X9FieldElement extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final X9IntegerConverter f87845p0 = new X9IntegerConverter();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ECFieldElement f87846f;

    public X9FieldElement(int i10, int i11, int i12, int i13, ASN1OctetString aSN1OctetString) {
        this(new ECFieldElement.F2m(i10, i11, i12, i13, new BigInteger(1, aSN1OctetString.getOctets())));
    }

    public ECFieldElement getValue() {
        return this.f87846f;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        X9IntegerConverter x9IntegerConverter = f87845p0;
        return new DEROctetString(x9IntegerConverter.integerToBytes(this.f87846f.toBigInteger(), x9IntegerConverter.getByteLength(this.f87846f)));
    }

    public X9FieldElement(BigInteger bigInteger, ASN1OctetString aSN1OctetString) {
        this(new ECFieldElement.Fp(bigInteger, new BigInteger(1, aSN1OctetString.getOctets())));
    }

    public X9FieldElement(ECFieldElement eCFieldElement) {
        this.f87846f = eCFieldElement;
    }
}
