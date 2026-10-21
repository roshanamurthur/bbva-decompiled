package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class RSAPublicKeyStructure extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f87682p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f87683q0;

    public RSAPublicKeyStructure(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f87682p0 = bigInteger;
        this.f87683q0 = bigInteger2;
    }

    public static RSAPublicKeyStructure getInstance(Object obj) {
        if (obj == null || (obj instanceof RSAPublicKeyStructure)) {
            return (RSAPublicKeyStructure) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new RSAPublicKeyStructure((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "Invalid RSAPublicKeyStructure: "));
    }

    public BigInteger getModulus() {
        return this.f87682p0;
    }

    public BigInteger getPublicExponent() {
        return this.f87683q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(getModulus()));
        aSN1EncodableVector.add(new ASN1Integer(getPublicExponent()));
        return new DERSequence(aSN1EncodableVector);
    }

    public RSAPublicKeyStructure(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f87682p0 = ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
        this.f87683q0 = ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
    }

    public static RSAPublicKeyStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
