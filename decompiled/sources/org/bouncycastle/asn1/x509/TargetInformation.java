package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class TargetInformation extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87719p0;

    public TargetInformation(Targets targets) {
        this.f87719p0 = new DERSequence(targets);
    }

    public static TargetInformation getInstance(Object obj) {
        if (obj instanceof TargetInformation) {
            return (TargetInformation) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TargetInformation targetInformation = new TargetInformation();
        targetInformation.f87719p0 = aSN1Sequence;
        return targetInformation;
    }

    public Targets[] getTargetsObjects() {
        ASN1Sequence aSN1Sequence = this.f87719p0;
        Targets[] targetsArr = new Targets[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            targetsArr[i10] = Targets.getInstance(objects.nextElement());
            i10++;
        }
        return targetsArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87719p0;
    }

    public TargetInformation(Target[] targetArr) {
        this(new Targets(targetArr));
    }
}
