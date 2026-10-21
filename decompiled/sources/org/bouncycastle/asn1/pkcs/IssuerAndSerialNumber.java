package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes12.dex */
public class IssuerAndSerialNumber extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public X500Name f87397p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87398q0;

    public IssuerAndSerialNumber(X500Name x500Name, BigInteger bigInteger) {
        this.f87397p0 = x500Name;
        this.f87398q0 = new ASN1Integer(bigInteger);
    }

    public static IssuerAndSerialNumber getInstance(Object obj) {
        if (obj instanceof IssuerAndSerialNumber) {
            return (IssuerAndSerialNumber) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber();
        issuerAndSerialNumber.f87397p0 = X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        issuerAndSerialNumber.f87398q0 = (ASN1Integer) aSN1Sequence.getObjectAt(1);
        return issuerAndSerialNumber;
    }

    public ASN1Integer getCertificateSerialNumber() {
        return this.f87398q0;
    }

    public X500Name getName() {
        return this.f87397p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87397p0);
        aSN1EncodableVector.add(this.f87398q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public IssuerAndSerialNumber(X509Name x509Name, BigInteger bigInteger) {
        this.f87397p0 = X500Name.getInstance(x509Name.toASN1Primitive());
        this.f87398q0 = new ASN1Integer(bigInteger);
    }

    public IssuerAndSerialNumber(X509Name x509Name, ASN1Integer aSN1Integer) {
        this.f87397p0 = X500Name.getInstance(x509Name.toASN1Primitive());
        this.f87398q0 = aSN1Integer;
    }
}
