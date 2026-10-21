package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.CertTemplate;

/* JADX INFO: loaded from: classes12.dex */
public class ModCertTemplate extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartPath f86699p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BodyPartList f86700q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f86701r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final CertTemplate f86702s0;

    public ModCertTemplate(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.size() != 4 && aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86699p0 = BodyPartPath.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86700q0 = BodyPartList.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 4) {
            this.f86701r0 = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(2)).isTrue();
            objectAt = aSN1Sequence.getObjectAt(3);
        } else {
            this.f86701r0 = true;
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.f86702s0 = CertTemplate.getInstance(objectAt);
    }

    public static ModCertTemplate getInstance(Object obj) {
        if (obj instanceof ModCertTemplate) {
            return (ModCertTemplate) obj;
        }
        if (obj != null) {
            return new ModCertTemplate(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartList getCertReferences() {
        return this.f86700q0;
    }

    public CertTemplate getCertTemplate() {
        return this.f86702s0;
    }

    public BodyPartPath getPkiDataReference() {
        return this.f86699p0;
    }

    public boolean isReplacingFields() {
        return this.f86701r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86699p0);
        aSN1EncodableVector.add(this.f86700q0);
        boolean z10 = this.f86701r0;
        if (!z10) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(z10));
        }
        aSN1EncodableVector.add(this.f86702s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public ModCertTemplate(BodyPartPath bodyPartPath, BodyPartList bodyPartList, boolean z10, CertTemplate certTemplate) {
        this.f86699p0 = bodyPartPath;
        this.f86700q0 = bodyPartList;
        this.f86701r0 = z10;
        this.f86702s0 = certTemplate;
    }
}
