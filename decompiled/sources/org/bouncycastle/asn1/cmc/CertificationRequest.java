package org.bouncycastle.asn1.cmc;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class CertificationRequest extends ASN1Object {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final ASN1Integer f86668s0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final a f86669p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86670q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DERBitString f86671r0;

    public class a extends ASN1Object {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ASN1Integer f86672p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final X500Name f86673q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ASN1Sequence f86674r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ASN1Set f86675s0;

        public a(ASN1Sequence aSN1Sequence) {
            if (aSN1Sequence.size() != 4) {
                throw new IllegalArgumentException("incorrect sequence size for CertificationRequestInfo");
            }
            this.f86672p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            this.f86673q0 = X500Name.getInstance(aSN1Sequence.getObjectAt(1));
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
            this.f86674r0 = aSN1Sequence2;
            if (aSN1Sequence2.size() != 2) {
                throw new IllegalArgumentException("incorrect subjectPublicKeyInfo size for CertificationRequestInfo");
            }
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(3);
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException("incorrect tag number on attributes for CertificationRequestInfo");
            }
            this.f86675s0 = ASN1Set.getInstance(aSN1TaggedObject, false);
        }

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public final ASN1Primitive toASN1Primitive() {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
            aSN1EncodableVector.add(this.f86672p0);
            aSN1EncodableVector.add(this.f86673q0);
            aSN1EncodableVector.add(this.f86674r0);
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, this.f86675s0));
            return new DERSequence(aSN1EncodableVector);
        }

        public a(X500Name x500Name, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString, ASN1Set aSN1Set) {
            this.f86672p0 = CertificationRequest.f86668s0;
            this.f86673q0 = x500Name;
            this.f86674r0 = new DERSequence(new ASN1Encodable[]{algorithmIdentifier, dERBitString});
            this.f86675s0 = aSN1Set;
        }
    }

    public CertificationRequest(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86669p0 = new a(ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0)));
        this.f86670q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86671r0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static CertificationRequest getInstance(Object obj) {
        if (obj instanceof CertificationRequest) {
            return (CertificationRequest) obj;
        }
        if (obj != null) {
            return new CertificationRequest(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Set getAttributes() {
        return this.f86669p0.f86675s0;
    }

    public DERBitString getSignature() {
        return this.f86671r0;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f86670q0;
    }

    public X500Name getSubject() {
        return this.f86669p0.f86673q0;
    }

    public DERBitString getSubjectPublicKey() {
        return DERBitString.getInstance(this.f86669p0.f86674r0.getObjectAt(1));
    }

    public AlgorithmIdentifier getSubjectPublicKeyAlgorithm() {
        return AlgorithmIdentifier.getInstance(this.f86669p0.f86674r0.getObjectAt(0));
    }

    public BigInteger getVersion() {
        return this.f86669p0.f86672p0.getValue();
    }

    public ASN1Primitive parsePublicKey() throws IOException {
        return ASN1Primitive.fromByteArray(getSubjectPublicKey().getOctets());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86669p0);
        aSN1EncodableVector.add(this.f86670q0);
        aSN1EncodableVector.add(this.f86671r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public CertificationRequest(X500Name x500Name, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString, ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier2, DERBitString dERBitString2) {
        this.f86669p0 = new a(x500Name, algorithmIdentifier, dERBitString, aSN1Set);
        this.f86670q0 = algorithmIdentifier2;
        this.f86671r0 = dERBitString2;
    }
}
