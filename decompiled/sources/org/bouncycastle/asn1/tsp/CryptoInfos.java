package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.Attribute;

/* JADX INFO: loaded from: classes12.dex */
public class CryptoInfos extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87487p0;

    public CryptoInfos(Attribute[] attributeArr) {
        this.f87487p0 = new DERSequence(attributeArr);
    }

    public static CryptoInfos getInstance(Object obj) {
        if (obj instanceof CryptoInfos) {
            return (CryptoInfos) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CryptoInfos cryptoInfos = new CryptoInfos();
        cryptoInfos.f87487p0 = aSN1Sequence;
        return cryptoInfos;
    }

    public Attribute[] getAttributes() {
        ASN1Sequence aSN1Sequence = this.f87487p0;
        int size = aSN1Sequence.size();
        Attribute[] attributeArr = new Attribute[size];
        for (int i10 = 0; i10 != size; i10++) {
            attributeArr[i10] = Attribute.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return attributeArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87487p0;
    }

    public static CryptoInfos getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
