package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSKeyParams extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f90932p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f90933q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AlgorithmIdentifier f90934r0;

    public XMSSKeyParams(int i10, AlgorithmIdentifier algorithmIdentifier) {
        this.f90932p0 = new ASN1Integer(0L);
        this.f90933q0 = i10;
        this.f90934r0 = algorithmIdentifier;
    }

    public static XMSSKeyParams getInstance(Object obj) {
        if (obj instanceof XMSSKeyParams) {
            return (XMSSKeyParams) obj;
        }
        if (obj != null) {
            return new XMSSKeyParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getHeight() {
        return this.f90933q0;
    }

    public AlgorithmIdentifier getTreeDigest() {
        return this.f90934r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f90932p0);
        aSN1EncodableVector.add(new ASN1Integer(this.f90933q0));
        aSN1EncodableVector.add(this.f90934r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public XMSSKeyParams(ASN1Sequence aSN1Sequence) {
        this.f90932p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.f90933q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f90934r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
