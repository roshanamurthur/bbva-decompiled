package org.bouncycastle.asn1.x509;

import ad.e;
import androidx.databinding.c;
import androidx.room.a;
import java.io.IOException;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class Extension extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87618p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f87619q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1OctetString f87620r0;
    public static final ASN1ObjectIdentifier subjectDirectoryAttributes = a.e("2.5.29.9");
    public static final ASN1ObjectIdentifier subjectKeyIdentifier = a.e("2.5.29.14");
    public static final ASN1ObjectIdentifier keyUsage = a.e("2.5.29.15");
    public static final ASN1ObjectIdentifier privateKeyUsagePeriod = a.e("2.5.29.16");
    public static final ASN1ObjectIdentifier subjectAlternativeName = a.e(ObjectIdentifiers.subjectAlternativeName);
    public static final ASN1ObjectIdentifier issuerAlternativeName = a.e("2.5.29.18");
    public static final ASN1ObjectIdentifier basicConstraints = a.e(ObjectIdentifiers.basicConstraints);
    public static final ASN1ObjectIdentifier cRLNumber = a.e("2.5.29.20");
    public static final ASN1ObjectIdentifier reasonCode = a.e("2.5.29.21");
    public static final ASN1ObjectIdentifier instructionCode = a.e("2.5.29.23");
    public static final ASN1ObjectIdentifier invalidityDate = a.e("2.5.29.24");
    public static final ASN1ObjectIdentifier deltaCRLIndicator = a.e("2.5.29.27");
    public static final ASN1ObjectIdentifier issuingDistributionPoint = a.e("2.5.29.28");
    public static final ASN1ObjectIdentifier certificateIssuer = a.e("2.5.29.29");
    public static final ASN1ObjectIdentifier nameConstraints = a.e("2.5.29.30");
    public static final ASN1ObjectIdentifier cRLDistributionPoints = a.e("2.5.29.31");
    public static final ASN1ObjectIdentifier certificatePolicies = a.e("2.5.29.32");
    public static final ASN1ObjectIdentifier policyMappings = a.e("2.5.29.33");
    public static final ASN1ObjectIdentifier authorityKeyIdentifier = a.e("2.5.29.35");
    public static final ASN1ObjectIdentifier policyConstraints = a.e("2.5.29.36");
    public static final ASN1ObjectIdentifier extendedKeyUsage = a.e("2.5.29.37");
    public static final ASN1ObjectIdentifier freshestCRL = a.e("2.5.29.46");
    public static final ASN1ObjectIdentifier inhibitAnyPolicy = a.e("2.5.29.54");
    public static final ASN1ObjectIdentifier authorityInfoAccess = a.e("1.3.6.1.5.5.7.1.1");
    public static final ASN1ObjectIdentifier subjectInfoAccess = a.e("1.3.6.1.5.5.7.1.11");
    public static final ASN1ObjectIdentifier logoType = a.e("1.3.6.1.5.5.7.1.12");
    public static final ASN1ObjectIdentifier biometricInfo = a.e("1.3.6.1.5.5.7.1.2");
    public static final ASN1ObjectIdentifier qCStatements = a.e("1.3.6.1.5.5.7.1.3");
    public static final ASN1ObjectIdentifier auditIdentity = a.e("1.3.6.1.5.5.7.1.4");
    public static final ASN1ObjectIdentifier noRevAvail = a.e("2.5.29.56");
    public static final ASN1ObjectIdentifier targetInformation = a.e("2.5.29.55");
    public static final ASN1ObjectIdentifier expiredCertsOnCRL = a.e("2.5.29.60");

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Boolean aSN1Boolean, ASN1OctetString aSN1OctetString) {
        this(aSN1ObjectIdentifier, aSN1Boolean.isTrue(), aSN1OctetString);
    }

    public static Extension create(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws IOException {
        return new Extension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded());
    }

    public static Extension getInstance(Object obj) {
        ASN1Encodable objectAt;
        if (obj instanceof Extension) {
            return (Extension) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Extension extension = new Extension();
        if (aSN1Sequence.size() == 2) {
            extension.f87618p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            extension.f87619q0 = false;
            objectAt = aSN1Sequence.getObjectAt(1);
        } else {
            if (aSN1Sequence.size() != 3) {
                throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            }
            extension.f87618p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            extension.f87619q0 = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(1)).isTrue();
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        extension.f87620r0 = ASN1OctetString.getInstance(objectAt);
        return extension;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (!(obj instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) obj;
        return extension.getExtnId().equals((ASN1Primitive) getExtnId()) && extension.getExtnValue().equals((ASN1Primitive) getExtnValue()) && extension.isCritical() == isCritical();
    }

    public ASN1ObjectIdentifier getExtnId() {
        return this.f87618p0;
    }

    public ASN1OctetString getExtnValue() {
        return this.f87620r0;
    }

    public ASN1Encodable getParsedValue() {
        try {
            return ASN1Primitive.fromByteArray(getExtnValue().getOctets());
        } catch (IOException e5) {
            throw new IllegalArgumentException(e.d("can't convert extension: ", e5));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isCritical() ? getExtnValue().hashCode() ^ getExtnId().hashCode() : ~(getExtnValue().hashCode() ^ getExtnId().hashCode());
    }

    public boolean isCritical() {
        return this.f87619q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87618p0);
        if (this.f87619q0) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(true));
        }
        aSN1EncodableVector.add(this.f87620r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1OctetString aSN1OctetString) {
        this.f87618p0 = aSN1ObjectIdentifier;
        this.f87619q0 = z10;
        this.f87620r0 = aSN1OctetString;
    }

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        this(aSN1ObjectIdentifier, z10, new DEROctetString(bArr));
    }
}
