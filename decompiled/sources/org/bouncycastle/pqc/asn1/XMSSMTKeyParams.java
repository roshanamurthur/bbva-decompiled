package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSMTKeyParams extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f90935p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f90936q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f90937r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AlgorithmIdentifier f90938s0;

    public XMSSMTKeyParams(int i10, int i11, AlgorithmIdentifier algorithmIdentifier) {
        this.f90935p0 = new ASN1Integer(0L);
        this.f90936q0 = i10;
        this.f90937r0 = i11;
        this.f90938s0 = algorithmIdentifier;
    }

    public static XMSSMTKeyParams getInstance(Object obj) {
        if (obj instanceof XMSSMTKeyParams) {
            return (XMSSMTKeyParams) obj;
        }
        if (obj != null) {
            return new XMSSMTKeyParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getHeight() {
        return this.f90936q0;
    }

    public int getLayers() {
        return this.f90937r0;
    }

    public AlgorithmIdentifier getTreeDigest() {
        return this.f90938s0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f90935p0);
        aSN1EncodableVector.add(new ASN1Integer(this.f90936q0));
        aSN1EncodableVector.add(new ASN1Integer(this.f90937r0));
        aSN1EncodableVector.add(this.f90938s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public XMSSMTKeyParams(ASN1Sequence aSN1Sequence) {
        this.f90935p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.f90936q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f90937r0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2)).intValueExact();
        this.f90938s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
    }
}
