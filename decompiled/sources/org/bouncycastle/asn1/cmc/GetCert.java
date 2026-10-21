package org.bouncycastle.asn1.cmc;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class GetCert extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GeneralName f86692p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f86693q0;

    public GetCert(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86692p0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86693q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
    }

    public static GetCert getInstance(Object obj) {
        if (obj instanceof GetCert) {
            return (GetCert) obj;
        }
        if (obj != null) {
            return new GetCert(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralName getIssuerName() {
        return this.f86692p0;
    }

    public BigInteger getSerialNumber() {
        return this.f86693q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86692p0);
        aSN1EncodableVector.add(new ASN1Integer(this.f86693q0));
        return new DERSequence(aSN1EncodableVector);
    }

    public GetCert(GeneralName generalName, BigInteger bigInteger) {
        this.f86692p0 = generalName;
        this.f86693q0 = bigInteger;
    }
}
