package org.bouncycastle.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.x509.Attribute;

/* JADX INFO: loaded from: classes13.dex */
public class X509Attribute extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Attribute f91702p0;

    public X509Attribute(String str, ASN1Encodable aSN1Encodable) {
        this.f91702p0 = new Attribute(new ASN1ObjectIdentifier(str), new DERSet(aSN1Encodable));
    }

    public String getOID() {
        return this.f91702p0.getAttrType().getId();
    }

    public ASN1Encodable[] getValues() {
        ASN1Set attrValues = this.f91702p0.getAttrValues();
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[attrValues.size()];
        for (int i10 = 0; i10 != attrValues.size(); i10++) {
            aSN1EncodableArr[i10] = attrValues.getObjectAt(i10);
        }
        return aSN1EncodableArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f91702p0.toASN1Primitive();
    }

    public X509Attribute(String str, ASN1EncodableVector aSN1EncodableVector) {
        this.f91702p0 = new Attribute(new ASN1ObjectIdentifier(str), new DERSet(aSN1EncodableVector));
    }

    public X509Attribute(ASN1Encodable aSN1Encodable) {
        this.f91702p0 = Attribute.getInstance(aSN1Encodable);
    }
}
