package org.bouncycastle.asn1.cmc;

import androidx.camera.core.impl.utils.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class PopLinkWitnessV2 extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86718p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86719q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f86720r0;

    public PopLinkWitnessV2(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86718p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86719q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86720r0 = a.c(aSN1Sequence, 2);
    }

    public static PopLinkWitnessV2 getInstance(Object obj) {
        if (obj instanceof PopLinkWitnessV2) {
            return (PopLinkWitnessV2) obj;
        }
        if (obj != null) {
            return new PopLinkWitnessV2(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getKeyGenAlgorithm() {
        return this.f86718p0;
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.f86719q0;
    }

    public byte[] getWitness() {
        return Arrays.clone(this.f86720r0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86718p0);
        aSN1EncodableVector.add(this.f86719q0);
        aSN1EncodableVector.add(new DEROctetString(getWitness()));
        return new DERSequence(aSN1EncodableVector);
    }

    public PopLinkWitnessV2(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        this.f86718p0 = algorithmIdentifier;
        this.f86719q0 = algorithmIdentifier2;
        this.f86720r0 = Arrays.clone(bArr);
    }
}
