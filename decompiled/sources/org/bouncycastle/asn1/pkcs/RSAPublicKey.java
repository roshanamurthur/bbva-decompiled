package org.bouncycastle.asn1.pkcs;

import androidx.databinding.c;
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
public class RSAPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f87445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f87446q0;

    public RSAPublicKey(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f87445p0 = bigInteger;
        this.f87446q0 = bigInteger2;
    }

    public static RSAPublicKey getInstance(Object obj) {
        if (obj instanceof RSAPublicKey) {
            return (RSAPublicKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RSAPublicKey rSAPublicKey = new RSAPublicKey();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        rSAPublicKey.f87445p0 = ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
        rSAPublicKey.f87446q0 = ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
        return rSAPublicKey;
    }

    public BigInteger getModulus() {
        return this.f87445p0;
    }

    public BigInteger getPublicExponent() {
        return this.f87446q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(getModulus()));
        aSN1EncodableVector.add(new ASN1Integer(getPublicExponent()));
        return new DERSequence(aSN1EncodableVector);
    }

    public static RSAPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
