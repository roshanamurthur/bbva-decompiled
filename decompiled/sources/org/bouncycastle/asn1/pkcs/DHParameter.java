package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87390p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87391q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87392r0;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f87390p0 = new ASN1Integer(bigInteger);
        this.f87391q0 = new ASN1Integer(bigInteger2);
        this.f87392r0 = i10 != 0 ? new ASN1Integer(i10) : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DHParameter dHParameter = new DHParameter();
        Enumeration objects = aSN1Sequence.getObjects();
        dHParameter.f87390p0 = ASN1Integer.getInstance(objects.nextElement());
        dHParameter.f87391q0 = ASN1Integer.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            dHParameter.f87392r0 = (ASN1Integer) objects.nextElement();
        } else {
            dHParameter.f87392r0 = null;
        }
        return dHParameter;
    }

    public BigInteger getG() {
        return this.f87391q0.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f87392r0;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f87390p0.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87390p0);
        aSN1EncodableVector.add(this.f87391q0);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f87392r0);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
