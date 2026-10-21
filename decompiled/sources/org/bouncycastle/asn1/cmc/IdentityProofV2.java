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
public class IdentityProofV2 extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86694p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86695q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f86696r0;

    public IdentityProofV2(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86694p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86695q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86696r0 = a.c(aSN1Sequence, 2);
    }

    public static IdentityProofV2 getInstance(Object obj) {
        if (obj instanceof IdentityProofV2) {
            return (IdentityProofV2) obj;
        }
        if (obj != null) {
            return new IdentityProofV2(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getMacAlgId() {
        return this.f86695q0;
    }

    public AlgorithmIdentifier getProofAlgID() {
        return this.f86694p0;
    }

    public byte[] getWitness() {
        return Arrays.clone(this.f86696r0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86694p0);
        aSN1EncodableVector.add(this.f86695q0);
        aSN1EncodableVector.add(new DEROctetString(getWitness()));
        return new DERSequence(aSN1EncodableVector);
    }

    public IdentityProofV2(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        this.f86694p0 = algorithmIdentifier;
        this.f86695q0 = algorithmIdentifier2;
        this.f86696r0 = Arrays.clone(bArr);
    }
}
