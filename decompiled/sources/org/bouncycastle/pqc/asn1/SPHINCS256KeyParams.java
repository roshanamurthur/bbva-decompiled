package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes13.dex */
public class SPHINCS256KeyParams extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f90930p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f90931q0;

    public SPHINCS256KeyParams(ASN1Sequence aSN1Sequence) {
        this.f90930p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.f90931q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static final SPHINCS256KeyParams getInstance(Object obj) {
        if (obj instanceof SPHINCS256KeyParams) {
            return (SPHINCS256KeyParams) obj;
        }
        if (obj != null) {
            return new SPHINCS256KeyParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getTreeDigest() {
        return this.f90931q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f90930p0);
        aSN1EncodableVector.add(this.f90931q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public SPHINCS256KeyParams(AlgorithmIdentifier algorithmIdentifier) {
        this.f90930p0 = new ASN1Integer(0L);
        this.f90931q0 = algorithmIdentifier;
    }
}
