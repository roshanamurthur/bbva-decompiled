package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class IssuerSerial extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GeneralNames f87640p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87641q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERBitString f87642r0;

    public IssuerSerial(X500Name x500Name, BigInteger bigInteger) {
        this(new GeneralNames(new GeneralName(x500Name)), new ASN1Integer(bigInteger));
    }

    public static IssuerSerial getInstance(Object obj) {
        if (obj instanceof IssuerSerial) {
            return (IssuerSerial) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        IssuerSerial issuerSerial = new IssuerSerial();
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        issuerSerial.f87640p0 = GeneralNames.getInstance(aSN1Sequence.getObjectAt(0));
        issuerSerial.f87641q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 3) {
            issuerSerial.f87642r0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(2));
        }
        return issuerSerial;
    }

    public GeneralNames getIssuer() {
        return this.f87640p0;
    }

    public DERBitString getIssuerUID() {
        return this.f87642r0;
    }

    public ASN1Integer getSerial() {
        return this.f87641q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87640p0);
        aSN1EncodableVector.add(this.f87641q0);
        DERBitString dERBitString = this.f87642r0;
        if (dERBitString != null) {
            aSN1EncodableVector.add(dERBitString);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public IssuerSerial(GeneralNames generalNames, BigInteger bigInteger) {
        this(generalNames, new ASN1Integer(bigInteger));
    }

    public IssuerSerial(GeneralNames generalNames, ASN1Integer aSN1Integer) {
        this.f87640p0 = generalNames;
        this.f87641q0 = aSN1Integer;
    }

    public static IssuerSerial getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
