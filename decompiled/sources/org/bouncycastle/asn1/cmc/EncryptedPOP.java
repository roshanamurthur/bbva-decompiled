package org.bouncycastle.asn1.cmc;

import androidx.camera.core.impl.utils.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedPOP extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TaggedRequest f86680p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ContentInfo f86681q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AlgorithmIdentifier f86682r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AlgorithmIdentifier f86683s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f86684t0;

    public EncryptedPOP(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 5) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86680p0 = TaggedRequest.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86681q0 = ContentInfo.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86682r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
        this.f86683s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
        this.f86684t0 = a.c(aSN1Sequence, 4);
    }

    public static EncryptedPOP getInstance(Object obj) {
        if (obj instanceof EncryptedPOP) {
            return (EncryptedPOP) obj;
        }
        if (obj != null) {
            return new EncryptedPOP(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ContentInfo getCms() {
        return this.f86681q0;
    }

    public TaggedRequest getRequest() {
        return this.f86680p0;
    }

    public AlgorithmIdentifier getThePOPAlgID() {
        return this.f86682r0;
    }

    public byte[] getWitness() {
        return Arrays.clone(this.f86684t0);
    }

    public AlgorithmIdentifier getWitnessAlgID() {
        return this.f86683s0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f86680p0);
        aSN1EncodableVector.add(this.f86681q0);
        aSN1EncodableVector.add(this.f86682r0);
        aSN1EncodableVector.add(this.f86683s0);
        aSN1EncodableVector.add(new DEROctetString(this.f86684t0));
        return new DERSequence(aSN1EncodableVector);
    }

    public EncryptedPOP(TaggedRequest taggedRequest, ContentInfo contentInfo, AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        this.f86680p0 = taggedRequest;
        this.f86681q0 = contentInfo;
        this.f86682r0 = algorithmIdentifier;
        this.f86683s0 = algorithmIdentifier2;
        this.f86684t0 = Arrays.clone(bArr);
    }
}
