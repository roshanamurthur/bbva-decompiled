package org.bouncycastle.asn1.x9;

import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
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
public class DHDomainParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87808p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87809q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87810r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Integer f87811s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public DHValidationParms f87812t0;

    public DHDomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParms dHValidationParms) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        }
        this.f87808p0 = new ASN1Integer(bigInteger);
        this.f87809q0 = new ASN1Integer(bigInteger2);
        this.f87810r0 = new ASN1Integer(bigInteger3);
        this.f87811s0 = new ASN1Integer(bigInteger4);
        this.f87812t0 = dHValidationParms;
    }

    public static DHDomainParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof DHDomainParameters)) {
            return (DHDomainParameters) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid DHDomainParameters: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        DHDomainParameters dHDomainParameters = new DHDomainParameters();
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        dHDomainParameters.f87808p0 = ASN1Integer.getInstance(objects.nextElement());
        dHDomainParameters.f87809q0 = ASN1Integer.getInstance(objects.nextElement());
        dHDomainParameters.f87810r0 = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable aSN1Encodable = objects.hasMoreElements() ? (ASN1Encodable) objects.nextElement() : null;
        if (aSN1Encodable != null && (aSN1Encodable instanceof ASN1Integer)) {
            dHDomainParameters.f87811s0 = ASN1Integer.getInstance(aSN1Encodable);
            aSN1Encodable = objects.hasMoreElements() ? (ASN1Encodable) objects.nextElement() : null;
        }
        if (aSN1Encodable != null) {
            dHDomainParameters.f87812t0 = DHValidationParms.getInstance(aSN1Encodable.toASN1Primitive());
        }
        return dHDomainParameters;
    }

    public ASN1Integer getG() {
        return this.f87809q0;
    }

    public ASN1Integer getJ() {
        return this.f87811s0;
    }

    public ASN1Integer getP() {
        return this.f87808p0;
    }

    public ASN1Integer getQ() {
        return this.f87810r0;
    }

    public DHValidationParms getValidationParms() {
        return this.f87812t0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f87808p0);
        aSN1EncodableVector.add(this.f87809q0);
        aSN1EncodableVector.add(this.f87810r0);
        ASN1Integer aSN1Integer = this.f87811s0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        DHValidationParms dHValidationParms = this.f87812t0;
        if (dHValidationParms != null) {
            aSN1EncodableVector.add(dHValidationParms);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DHDomainParameters(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, ASN1Integer aSN1Integer3, ASN1Integer aSN1Integer4, DHValidationParms dHValidationParms) {
        if (aSN1Integer == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (aSN1Integer2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (aSN1Integer3 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        }
        this.f87808p0 = aSN1Integer;
        this.f87809q0 = aSN1Integer2;
        this.f87810r0 = aSN1Integer3;
        this.f87811s0 = aSN1Integer4;
        this.f87812t0 = dHValidationParms;
    }

    public static DHDomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
