package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class Targets extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87720p0;

    public Targets(Target[] targetArr) {
        this.f87720p0 = new DERSequence(targetArr);
    }

    public static Targets getInstance(Object obj) {
        if (obj instanceof Targets) {
            return (Targets) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Targets targets = new Targets();
        targets.f87720p0 = aSN1Sequence;
        return targets;
    }

    public Target[] getTargets() {
        ASN1Sequence aSN1Sequence = this.f87720p0;
        Target[] targetArr = new Target[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            targetArr[i10] = Target.getInstance(objects.nextElement());
            i10++;
        }
        return targetArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87720p0;
    }
}
