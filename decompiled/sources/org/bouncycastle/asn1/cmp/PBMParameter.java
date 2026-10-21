package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class PBMParameter extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1OctetString f86778p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f86779q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f86780r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AlgorithmIdentifier f86781s0;

    public PBMParameter(ASN1OctetString aSN1OctetString, AlgorithmIdentifier algorithmIdentifier, ASN1Integer aSN1Integer, AlgorithmIdentifier algorithmIdentifier2) {
        this.f86778p0 = aSN1OctetString;
        this.f86779q0 = algorithmIdentifier;
        this.f86780r0 = aSN1Integer;
        this.f86781s0 = algorithmIdentifier2;
    }

    public static PBMParameter getInstance(Object obj) {
        if (obj instanceof PBMParameter) {
            return (PBMParameter) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PBMParameter pBMParameter = new PBMParameter();
        pBMParameter.f86778p0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        pBMParameter.f86779q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        pBMParameter.f86780r0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2));
        pBMParameter.f86781s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
        return pBMParameter;
    }

    public ASN1Integer getIterationCount() {
        return this.f86780r0;
    }

    public AlgorithmIdentifier getMac() {
        return this.f86781s0;
    }

    public AlgorithmIdentifier getOwf() {
        return this.f86779q0;
    }

    public ASN1OctetString getSalt() {
        return this.f86778p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86778p0);
        aSN1EncodableVector.add(this.f86779q0);
        aSN1EncodableVector.add(this.f86780r0);
        aSN1EncodableVector.add(this.f86781s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public PBMParameter(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, int i10, AlgorithmIdentifier algorithmIdentifier2) {
        this(new DEROctetString(bArr), algorithmIdentifier, new ASN1Integer(i10), algorithmIdentifier2);
    }
}
