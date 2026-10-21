package org.bouncycastle.asn1.dvcs;

import androidx.camera.core.impl.utils.b;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class TargetEtcChain extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CertEtcToken f87152p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87153q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PathProcInput f87154r0;

    public TargetEtcChain(CertEtcToken certEtcToken) {
        this(certEtcToken, null, null);
    }

    public static TargetEtcChain[] arrayFromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        TargetEtcChain[] targetEtcChainArr = new TargetEtcChain[size];
        for (int i10 = 0; i10 != size; i10++) {
            targetEtcChainArr[i10] = getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return targetEtcChainArr;
    }

    public static TargetEtcChain getInstance(Object obj) {
        if (obj instanceof TargetEtcChain) {
            return (TargetEtcChain) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TargetEtcChain targetEtcChain = new TargetEtcChain();
        targetEtcChain.f87152p0 = CertEtcToken.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
            if (objectAt instanceof ASN1TaggedObject) {
                targetEtcChain.a(objectAt);
            } else {
                targetEtcChain.f87153q0 = ASN1Sequence.getInstance(objectAt);
                if (aSN1Sequence.size() > 2) {
                    targetEtcChain.a(aSN1Sequence.getObjectAt(2));
                }
            }
        }
        return targetEtcChain;
    }

    public final void a(ASN1Encodable aSN1Encodable) {
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
        if (aSN1TaggedObject.getTagNo() != 0) {
            throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag encountered: ")));
        }
        this.f87154r0 = PathProcInput.getInstance(aSN1TaggedObject, false);
    }

    public CertEtcToken[] getChain() {
        ASN1Sequence aSN1Sequence = this.f87153q0;
        if (aSN1Sequence != null) {
            return CertEtcToken.arrayFromSequence(aSN1Sequence);
        }
        return null;
    }

    public PathProcInput getPathProcInput() {
        return this.f87154r0;
    }

    public CertEtcToken getTarget() {
        return this.f87152p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87152p0);
        ASN1Sequence aSN1Sequence = this.f87153q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        PathProcInput pathProcInput = this.f87154r0;
        if (pathProcInput != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, pathProcInput));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("TargetEtcChain {\n");
        stringBuffer.append("target: " + this.f87152p0 + RootService.LINE_BREAK);
        ASN1Sequence aSN1Sequence = this.f87153q0;
        if (aSN1Sequence != null) {
            stringBuffer.append("chain: " + aSN1Sequence + RootService.LINE_BREAK);
        }
        if (this.f87154r0 != null) {
            stringBuffer.append("pathProcInput: " + this.f87154r0 + RootService.LINE_BREAK);
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    public TargetEtcChain(CertEtcToken certEtcToken, PathProcInput pathProcInput) {
        this(certEtcToken, null, pathProcInput);
    }

    public static TargetEtcChain getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public TargetEtcChain(CertEtcToken certEtcToken, CertEtcToken[] certEtcTokenArr) {
        this(certEtcToken, certEtcTokenArr, null);
    }

    public TargetEtcChain(CertEtcToken certEtcToken, CertEtcToken[] certEtcTokenArr, PathProcInput pathProcInput) {
        this.f87152p0 = certEtcToken;
        if (certEtcTokenArr != null) {
            this.f87153q0 = new DERSequence(certEtcTokenArr);
        }
        this.f87154r0 = pathProcInput;
    }
}
