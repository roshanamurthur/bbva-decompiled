package org.bouncycastle.asn1.ess;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ESSCertIDv2 extends ASN1Object {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final AlgorithmIdentifier f87245s0 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87246p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f87247q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public IssuerSerial f87248r0;

    public ESSCertIDv2(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this(algorithmIdentifier, bArr, null);
    }

    public static ESSCertIDv2 getInstance(Object obj) {
        if (obj instanceof ESSCertIDv2) {
            return (ESSCertIDv2) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ESSCertIDv2 eSSCertIDv2 = new ESSCertIDv2();
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        int i10 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1OctetString) {
            eSSCertIDv2.f87246p0 = f87245s0;
        } else {
            eSSCertIDv2.f87246p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0).toASN1Primitive());
            i10 = 1;
        }
        int i11 = i10 + 1;
        eSSCertIDv2.f87247q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10).toASN1Primitive()).getOctets();
        if (aSN1Sequence.size() > i11) {
            eSSCertIDv2.f87248r0 = IssuerSerial.getInstance(aSN1Sequence.getObjectAt(i11));
        }
        return eSSCertIDv2;
    }

    public byte[] getCertHash() {
        return Arrays.clone(this.f87247q0);
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.f87246p0;
    }

    public IssuerSerial getIssuerSerial() {
        return this.f87248r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        AlgorithmIdentifier algorithmIdentifier = f87245s0;
        AlgorithmIdentifier algorithmIdentifier2 = this.f87246p0;
        if (!algorithmIdentifier2.equals(algorithmIdentifier)) {
            aSN1EncodableVector.add(algorithmIdentifier2);
        }
        aSN1EncodableVector.add(new DEROctetString(this.f87247q0).toASN1Primitive());
        IssuerSerial issuerSerial = this.f87248r0;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ESSCertIDv2(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, IssuerSerial issuerSerial) {
        this.f87246p0 = algorithmIdentifier == null ? f87245s0 : algorithmIdentifier;
        this.f87247q0 = Arrays.clone(bArr);
        this.f87248r0 = issuerSerial;
    }

    public ESSCertIDv2(byte[] bArr) {
        this(null, bArr, null);
    }

    public ESSCertIDv2(byte[] bArr, IssuerSerial issuerSerial) {
        this(null, bArr, issuerSerial);
    }
}
