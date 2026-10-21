package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes12.dex */
public class MetaData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Boolean f86929p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DERUTF8String f86930q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERIA5String f86931r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Attributes f86932s0;

    public MetaData(ASN1Boolean aSN1Boolean, DERUTF8String dERUTF8String, DERIA5String dERIA5String, Attributes attributes) {
        this.f86929p0 = aSN1Boolean;
        this.f86930q0 = dERUTF8String;
        this.f86931r0 = dERIA5String;
        this.f86932s0 = attributes;
    }

    public static MetaData getInstance(Object obj) {
        if (obj instanceof MetaData) {
            return (MetaData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        MetaData metaData = new MetaData();
        metaData.f86929p0 = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(0));
        int i10 = 1;
        if (1 < aSN1Sequence.size() && (aSN1Sequence.getObjectAt(1) instanceof DERUTF8String)) {
            metaData.f86930q0 = DERUTF8String.getInstance(aSN1Sequence.getObjectAt(1));
            i10 = 2;
        }
        if (i10 < aSN1Sequence.size() && (aSN1Sequence.getObjectAt(i10) instanceof DERIA5String)) {
            metaData.f86931r0 = DERIA5String.getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
        if (i10 < aSN1Sequence.size()) {
            metaData.f86932s0 = Attributes.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return metaData;
    }

    public DERUTF8String getFileName() {
        return this.f86930q0;
    }

    public DERIA5String getMediaType() {
        return this.f86931r0;
    }

    public Attributes getOtherMetaData() {
        return this.f86932s0;
    }

    public boolean isHashProtected() {
        return this.f86929p0.isTrue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86929p0);
        DERUTF8String dERUTF8String = this.f86930q0;
        if (dERUTF8String != null) {
            aSN1EncodableVector.add(dERUTF8String);
        }
        DERIA5String dERIA5String = this.f86931r0;
        if (dERIA5String != null) {
            aSN1EncodableVector.add(dERIA5String);
        }
        Attributes attributes = this.f86932s0;
        if (attributes != null) {
            aSN1EncodableVector.add(attributes);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
