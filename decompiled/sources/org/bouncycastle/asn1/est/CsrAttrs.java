package org.bouncycastle.asn1.est;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CsrAttrs extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AttrOrOID[] f87259p0;

    public CsrAttrs(ASN1Sequence aSN1Sequence) {
        this.f87259p0 = new AttrOrOID[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            this.f87259p0[i10] = AttrOrOID.getInstance(aSN1Sequence.getObjectAt(i10));
        }
    }

    public static CsrAttrs getInstance(Object obj) {
        if (obj instanceof CsrAttrs) {
            return (CsrAttrs) obj;
        }
        if (obj != null) {
            return new CsrAttrs(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AttrOrOID[] getAttrOrOIDs() {
        AttrOrOID[] attrOrOIDArr = this.f87259p0;
        AttrOrOID[] attrOrOIDArr2 = new AttrOrOID[attrOrOIDArr.length];
        System.arraycopy(attrOrOIDArr, 0, attrOrOIDArr2, 0, attrOrOIDArr.length);
        return attrOrOIDArr2;
    }

    public int size() {
        return this.f87259p0.length;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f87259p0);
    }

    public CsrAttrs(AttrOrOID attrOrOID) {
        this.f87259p0 = new AttrOrOID[]{attrOrOID};
    }

    public static CsrAttrs getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public CsrAttrs(AttrOrOID[] attrOrOIDArr) {
        AttrOrOID[] attrOrOIDArr2 = new AttrOrOID[attrOrOIDArr.length];
        System.arraycopy(attrOrOIDArr, 0, attrOrOIDArr2, 0, attrOrOIDArr.length);
        this.f87259p0 = attrOrOIDArr2;
    }
}
