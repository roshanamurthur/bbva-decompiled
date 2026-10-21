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
public class DecryptedPOP extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartID f86677p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86678q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f86679r0;

    public DecryptedPOP(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86677p0 = BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86678q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86679r0 = a.c(aSN1Sequence, 2);
    }

    public static DecryptedPOP getInstance(Object obj) {
        if (obj instanceof DecryptedPOP) {
            return (DecryptedPOP) obj;
        }
        if (obj != null) {
            return new DecryptedPOP(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartID getBodyPartID() {
        return this.f86677p0;
    }

    public byte[] getThePOP() {
        return Arrays.clone(this.f86679r0);
    }

    public AlgorithmIdentifier getThePOPAlgID() {
        return this.f86678q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86677p0);
        aSN1EncodableVector.add(this.f86678q0);
        aSN1EncodableVector.add(new DEROctetString(this.f86679r0));
        return new DERSequence(aSN1EncodableVector);
    }

    public DecryptedPOP(BodyPartID bodyPartID, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f86677p0 = bodyPartID;
        this.f86678q0 = algorithmIdentifier;
        this.f86679r0 = Arrays.clone(bArr);
    }
}
