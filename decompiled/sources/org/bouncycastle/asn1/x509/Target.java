package org.bouncycastle.asn1.x509;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class Target extends ASN1Object implements ASN1Choice {
    public static final int targetGroup = 1;
    public static final int targetName = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GeneralName f87717p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GeneralName f87718q0;

    public Target(int i10, GeneralName generalName) {
        this(new DERTaggedObject(i10, generalName));
    }

    public static Target getInstance(Object obj) {
        if (obj == null || (obj instanceof Target)) {
            return (Target) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new Target((ASN1TaggedObject) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass());
    }

    public GeneralName getTargetGroup() {
        return this.f87718q0;
    }

    public GeneralName getTargetName() {
        return this.f87717p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        GeneralName generalName = this.f87717p0;
        return generalName != null ? new DERTaggedObject(true, 0, generalName) : new DERTaggedObject(true, 1, this.f87718q0);
    }

    public Target(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.f87717p0 = GeneralName.getInstance(aSN1TaggedObject, true);
        } else {
            if (tagNo != 1) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag: ")));
            }
            this.f87718q0 = GeneralName.getInstance(aSN1TaggedObject, true);
        }
    }
}
