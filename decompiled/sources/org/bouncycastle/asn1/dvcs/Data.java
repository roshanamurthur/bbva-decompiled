package org.bouncycastle.asn1.dvcs;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.DigestInfo;

/* JADX INFO: loaded from: classes12.dex */
public class Data extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1OctetString f87144p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DigestInfo f87145q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87146r0;

    public Data(ASN1OctetString aSN1OctetString) {
        this.f87144p0 = aSN1OctetString;
    }

    public static Data getInstance(Object obj) {
        if (obj instanceof Data) {
            return (Data) obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new Data((ASN1OctetString) obj);
        }
        if (obj instanceof ASN1Sequence) {
            return new Data(DigestInfo.getInstance(obj));
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(a.c(obj, "Unknown object submitted to getInstance: "));
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance((ASN1TaggedObject) obj, false);
        Data data = new Data();
        data.f87146r0 = aSN1Sequence;
        return data;
    }

    public TargetEtcChain[] getCerts() {
        ASN1Sequence aSN1Sequence = this.f87146r0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        TargetEtcChain[] targetEtcChainArr = new TargetEtcChain[size];
        for (int i10 = 0; i10 != size; i10++) {
            targetEtcChainArr[i10] = TargetEtcChain.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return targetEtcChainArr;
    }

    public ASN1OctetString getMessage() {
        return this.f87144p0;
    }

    public DigestInfo getMessageImprint() {
        return this.f87145q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1OctetString aSN1OctetString = this.f87144p0;
        if (aSN1OctetString != null) {
            return aSN1OctetString.toASN1Primitive();
        }
        DigestInfo digestInfo = this.f87145q0;
        return digestInfo != null ? digestInfo.toASN1Primitive() : new DERTaggedObject(false, 0, this.f87146r0);
    }

    public String toString() {
        ASN1OctetString aSN1OctetString = this.f87144p0;
        if (aSN1OctetString != null) {
            return "Data {\n" + aSN1OctetString + "}\n";
        }
        DigestInfo digestInfo = this.f87145q0;
        if (digestInfo != null) {
            return "Data {\n" + digestInfo + "}\n";
        }
        return "Data {\n" + this.f87146r0 + "}\n";
    }

    public Data(TargetEtcChain targetEtcChain) {
        this.f87146r0 = new DERSequence(targetEtcChain);
    }

    public Data(DigestInfo digestInfo) {
        this.f87145q0 = digestInfo;
    }

    public Data(byte[] bArr) {
        this.f87144p0 = new DEROctetString(bArr);
    }

    public Data(TargetEtcChain[] targetEtcChainArr) {
        this.f87146r0 = new DERSequence(targetEtcChainArr);
    }

    public static Data getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
