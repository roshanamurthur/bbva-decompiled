package org.bouncycastle.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ElGamalParameter extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87373p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87374q0;

    public ElGamalParameter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f87373p0 = new ASN1Integer(bigInteger);
        this.f87374q0 = new ASN1Integer(bigInteger2);
    }

    public static ElGamalParameter getInstance(Object obj) {
        if (obj instanceof ElGamalParameter) {
            return (ElGamalParameter) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ElGamalParameter elGamalParameter = new ElGamalParameter();
        Enumeration objects = aSN1Sequence.getObjects();
        elGamalParameter.f87373p0 = (ASN1Integer) objects.nextElement();
        elGamalParameter.f87374q0 = (ASN1Integer) objects.nextElement();
        return elGamalParameter;
    }

    public BigInteger getG() {
        return this.f87374q0.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f87373p0.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87373p0);
        aSN1EncodableVector.add(this.f87374q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
