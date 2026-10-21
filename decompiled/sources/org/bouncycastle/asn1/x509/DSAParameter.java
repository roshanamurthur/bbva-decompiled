package org.bouncycastle.asn1.x509;

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
public class DSAParameter extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87605p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87606q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87607r0;

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f87605p0 = new ASN1Integer(bigInteger);
        this.f87606q0 = new ASN1Integer(bigInteger2);
        this.f87607r0 = new ASN1Integer(bigInteger3);
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DSAParameter dSAParameter = new DSAParameter();
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        dSAParameter.f87605p0 = ASN1Integer.getInstance(objects.nextElement());
        dSAParameter.f87606q0 = ASN1Integer.getInstance(objects.nextElement());
        dSAParameter.f87607r0 = ASN1Integer.getInstance(objects.nextElement());
        return dSAParameter;
    }

    public BigInteger getG() {
        return this.f87607r0.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f87605p0.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f87606q0.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87605p0);
        aSN1EncodableVector.add(this.f87606q0);
        aSN1EncodableVector.add(this.f87607r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
