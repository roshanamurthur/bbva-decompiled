package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class SubjectPublicKeyInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f87688p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DERBitString f87689q0;

    public SubjectPublicKeyInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f87688p0 = AlgorithmIdentifier.getInstance(objects.nextElement());
        this.f87689q0 = DERBitString.getInstance(objects.nextElement());
    }

    public static SubjectPublicKeyInfo getInstance(Object obj) {
        if (obj instanceof SubjectPublicKeyInfo) {
            return (SubjectPublicKeyInfo) obj;
        }
        if (obj != null) {
            return new SubjectPublicKeyInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getAlgorithm() {
        return this.f87688p0;
    }

    public AlgorithmIdentifier getAlgorithmId() {
        return this.f87688p0;
    }

    public ASN1Primitive getPublicKey() throws IOException {
        return ASN1Primitive.fromByteArray(this.f87689q0.getOctets());
    }

    public DERBitString getPublicKeyData() {
        return this.f87689q0;
    }

    public ASN1Primitive parsePublicKey() throws IOException {
        return ASN1Primitive.fromByteArray(this.f87689q0.getOctets());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87688p0);
        aSN1EncodableVector.add(this.f87689q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static SubjectPublicKeyInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) throws IOException {
        this.f87689q0 = new DERBitString(aSN1Encodable);
        this.f87688p0 = algorithmIdentifier;
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f87689q0 = new DERBitString(bArr);
        this.f87688p0 = algorithmIdentifier;
    }
}
