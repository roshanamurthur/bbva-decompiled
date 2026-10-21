package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class Pfx extends ASN1Object implements PKCSObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ContentInfo f87415p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public MacData f87416q0;

    public Pfx(ContentInfo contentInfo, MacData macData) {
        this.f87415p0 = contentInfo;
        this.f87416q0 = macData;
    }

    public static Pfx getInstance(Object obj) {
        if (obj instanceof Pfx) {
            return (Pfx) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Pfx pfx = new Pfx();
        pfx.f87416q0 = null;
        if (ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact() != 3) {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        pfx.f87415p0 = ContentInfo.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 3) {
            pfx.f87416q0 = MacData.getInstance(aSN1Sequence.getObjectAt(2));
        }
        return pfx;
    }

    public ContentInfo getAuthSafe() {
        return this.f87415p0;
    }

    public MacData getMacData() {
        return this.f87416q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(new ASN1Integer(3L));
        aSN1EncodableVector.add(this.f87415p0);
        MacData macData = this.f87416q0;
        if (macData != null) {
            aSN1EncodableVector.add(macData);
        }
        return new BERSequence(aSN1EncodableVector);
    }
}
