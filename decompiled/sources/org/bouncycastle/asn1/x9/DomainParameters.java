package org.bouncycastle.asn1.x9;

import androidx.databinding.c;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class DomainParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f87816p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Integer f87817q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Integer f87818r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1Integer f87819s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ValidationParams f87820t0;

    public DomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ValidationParams validationParams) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        }
        this.f87816p0 = new ASN1Integer(bigInteger);
        this.f87817q0 = new ASN1Integer(bigInteger2);
        this.f87818r0 = new ASN1Integer(bigInteger3);
        this.f87819s0 = bigInteger4 != null ? new ASN1Integer(bigInteger4) : null;
        this.f87820t0 = validationParams;
    }

    public static DomainParameters getInstance(Object obj) {
        if (obj instanceof DomainParameters) {
            return (DomainParameters) obj;
        }
        if (obj != null) {
            return new DomainParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f87817q0.getPositiveValue();
    }

    public BigInteger getJ() {
        ASN1Integer aSN1Integer = this.f87819s0;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f87816p0.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f87818r0.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.f87820t0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f87816p0);
        aSN1EncodableVector.add(this.f87817q0);
        aSN1EncodableVector.add(this.f87818r0);
        ASN1Integer aSN1Integer = this.f87819s0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ValidationParams validationParams = this.f87820t0;
        if (validationParams != null) {
            aSN1EncodableVector.add(validationParams);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f87816p0 = ASN1Integer.getInstance(objects.nextElement());
        this.f87817q0 = ASN1Integer.getInstance(objects.nextElement());
        this.f87818r0 = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable aSN1Encodable = objects.hasMoreElements() ? (ASN1Encodable) objects.nextElement() : null;
        if (aSN1Encodable == null || !(aSN1Encodable instanceof ASN1Integer)) {
            this.f87819s0 = null;
        } else {
            this.f87819s0 = ASN1Integer.getInstance(aSN1Encodable);
            aSN1Encodable = objects.hasMoreElements() ? (ASN1Encodable) objects.nextElement() : null;
        }
        if (aSN1Encodable != null) {
            this.f87820t0 = ValidationParams.getInstance(aSN1Encodable.toASN1Primitive());
        } else {
            this.f87820t0 = null;
        }
    }

    public static DomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
