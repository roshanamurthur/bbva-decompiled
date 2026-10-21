package org.bouncycastle.asn1.dvcs;

import androidx.appcompat.app.i;
import androidx.camera.core.impl.utils.b;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes12.dex */
public class PathProcInput extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PolicyInformation[] f87147p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f87148q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f87149r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f87150s0;

    public PathProcInput(PolicyInformation[] policyInformationArr) {
        this.f87148q0 = false;
        this.f87149r0 = false;
        this.f87150s0 = false;
        int length = policyInformationArr.length;
        PolicyInformation[] policyInformationArr2 = new PolicyInformation[length];
        System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, length);
        this.f87147p0 = policyInformationArr2;
    }

    public static PathProcInput getInstance(Object obj) {
        if (obj instanceof PathProcInput) {
            return (PathProcInput) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        int size = aSN1Sequence2.size();
        PolicyInformation[] policyInformationArr = new PolicyInformation[size];
        for (int i10 = 0; i10 != size; i10++) {
            policyInformationArr[i10] = PolicyInformation.getInstance(aSN1Sequence2.getObjectAt(i10));
        }
        PathProcInput pathProcInput = new PathProcInput(policyInformationArr);
        for (int i11 = 1; i11 < aSN1Sequence.size(); i11++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i11);
            if (objectAt instanceof ASN1Boolean) {
                pathProcInput.f87148q0 = ASN1Boolean.getInstance(objectAt).isTrue();
            } else if (objectAt instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    pathProcInput.f87149r0 = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
                } else {
                    if (tagNo != 1) {
                        throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag encountered: ")));
                    }
                    pathProcInput.f87150s0 = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
                }
            } else {
                continue;
            }
        }
        return pathProcInput;
    }

    public PolicyInformation[] getAcceptablePolicySet() {
        PolicyInformation[] policyInformationArr = this.f87147p0;
        int length = policyInformationArr.length;
        PolicyInformation[] policyInformationArr2 = new PolicyInformation[length];
        System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, length);
        return policyInformationArr2;
    }

    public boolean isExplicitPolicyReqd() {
        return this.f87149r0;
    }

    public boolean isInhibitAnyPolicy() {
        return this.f87150s0;
    }

    public boolean isInhibitPolicyMapping() {
        return this.f87148q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        PolicyInformation[] policyInformationArr = this.f87147p0;
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(policyInformationArr.length);
        for (int i10 = 0; i10 != policyInformationArr.length; i10++) {
            aSN1EncodableVector2.add(policyInformationArr[i10]);
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        boolean z10 = this.f87148q0;
        if (z10) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(z10));
        }
        boolean z11 = this.f87149r0;
        if (z11) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, ASN1Boolean.getInstance(z11)));
        }
        boolean z12 = this.f87150s0;
        if (z12) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, ASN1Boolean.getInstance(z12)));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PathProcInput: {\nacceptablePolicySet: ");
        sb2.append(Arrays.asList(this.f87147p0));
        sb2.append("\ninhibitPolicyMapping: ");
        sb2.append(this.f87148q0);
        sb2.append("\nexplicitPolicyReqd: ");
        sb2.append(this.f87149r0);
        sb2.append("\ninhibitAnyPolicy: ");
        return i.c(sb2, this.f87150s0, "\n}\n");
    }

    public PathProcInput(PolicyInformation[] policyInformationArr, boolean z10, boolean z11, boolean z12) {
        this.f87148q0 = false;
        this.f87149r0 = false;
        this.f87150s0 = false;
        int length = policyInformationArr.length;
        PolicyInformation[] policyInformationArr2 = new PolicyInformation[length];
        System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, length);
        this.f87147p0 = policyInformationArr2;
        this.f87148q0 = z10;
        this.f87149r0 = z11;
        this.f87150s0 = z12;
    }

    public static PathProcInput getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
