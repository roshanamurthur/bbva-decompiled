package org.bouncycastle.asn1.x509;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class NameConstraints extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GeneralSubtree[] f87651p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralSubtree[] f87652q0;

    public NameConstraints(GeneralSubtree[] generalSubtreeArr, GeneralSubtree[] generalSubtreeArr2) {
        GeneralSubtree[] generalSubtreeArr3;
        GeneralSubtree[] generalSubtreeArr4 = null;
        if (generalSubtreeArr != null) {
            int length = generalSubtreeArr.length;
            generalSubtreeArr3 = new GeneralSubtree[length];
            System.arraycopy(generalSubtreeArr, 0, generalSubtreeArr3, 0, length);
        } else {
            generalSubtreeArr3 = null;
        }
        this.f87651p0 = generalSubtreeArr3;
        if (generalSubtreeArr2 != null) {
            int length2 = generalSubtreeArr2.length;
            generalSubtreeArr4 = new GeneralSubtree[length2];
            System.arraycopy(generalSubtreeArr2, 0, generalSubtreeArr4, 0, length2);
        }
        this.f87652q0 = generalSubtreeArr4;
    }

    public static NameConstraints getInstance(Object obj) {
        if (obj instanceof NameConstraints) {
            return (NameConstraints) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        NameConstraints nameConstraints = new NameConstraints();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            int i10 = 0;
            if (tagNo == 0) {
                ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1TaggedObject, false);
                int size = aSN1Sequence2.size();
                GeneralSubtree[] generalSubtreeArr = new GeneralSubtree[size];
                while (i10 != size) {
                    generalSubtreeArr[i10] = GeneralSubtree.getInstance(aSN1Sequence2.getObjectAt(i10));
                    i10++;
                }
                nameConstraints.f87651p0 = generalSubtreeArr;
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag encountered: ")));
                }
                ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(aSN1TaggedObject, false);
                int size2 = aSN1Sequence3.size();
                GeneralSubtree[] generalSubtreeArr2 = new GeneralSubtree[size2];
                while (i10 != size2) {
                    generalSubtreeArr2[i10] = GeneralSubtree.getInstance(aSN1Sequence3.getObjectAt(i10));
                    i10++;
                }
                nameConstraints.f87652q0 = generalSubtreeArr2;
            }
        }
        return nameConstraints;
    }

    public GeneralSubtree[] getExcludedSubtrees() {
        GeneralSubtree[] generalSubtreeArr = this.f87652q0;
        if (generalSubtreeArr == null) {
            return null;
        }
        int length = generalSubtreeArr.length;
        GeneralSubtree[] generalSubtreeArr2 = new GeneralSubtree[length];
        System.arraycopy(generalSubtreeArr, 0, generalSubtreeArr2, 0, length);
        return generalSubtreeArr2;
    }

    public GeneralSubtree[] getPermittedSubtrees() {
        GeneralSubtree[] generalSubtreeArr = this.f87651p0;
        if (generalSubtreeArr == null) {
            return null;
        }
        int length = generalSubtreeArr.length;
        GeneralSubtree[] generalSubtreeArr2 = new GeneralSubtree[length];
        System.arraycopy(generalSubtreeArr, 0, generalSubtreeArr2, 0, length);
        return generalSubtreeArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        GeneralSubtree[] generalSubtreeArr = this.f87651p0;
        if (generalSubtreeArr != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, new DERSequence(generalSubtreeArr)));
        }
        GeneralSubtree[] generalSubtreeArr2 = this.f87652q0;
        if (generalSubtreeArr2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, new DERSequence(generalSubtreeArr2)));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
