package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class PKIHeaderBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1Integer f86795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GeneralName f86796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GeneralName f86797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ASN1GeneralizedTime f86798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlgorithmIdentifier f86799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ASN1OctetString f86800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DEROctetString f86801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ASN1OctetString f86802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ASN1OctetString f86803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ASN1OctetString f86804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PKIFreeText f86805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ASN1Sequence f86806l;

    public PKIHeaderBuilder(int i10, GeneralName generalName, GeneralName generalName2) {
        this.f86795a = new ASN1Integer(i10);
        this.f86796b = generalName;
        this.f86797c = generalName2;
    }

    public static void a(ASN1EncodableVector aSN1EncodableVector, int i10, ASN1Object aSN1Object) {
        if (aSN1Object != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, i10, aSN1Object));
        }
    }

    public PKIHeader build() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(12);
        aSN1EncodableVector.add(this.f86795a);
        aSN1EncodableVector.add(this.f86796b);
        aSN1EncodableVector.add(this.f86797c);
        a(aSN1EncodableVector, 0, this.f86798d);
        a(aSN1EncodableVector, 1, this.f86799e);
        a(aSN1EncodableVector, 2, this.f86800f);
        a(aSN1EncodableVector, 3, this.f86801g);
        a(aSN1EncodableVector, 4, this.f86802h);
        a(aSN1EncodableVector, 5, this.f86803i);
        a(aSN1EncodableVector, 6, this.f86804j);
        a(aSN1EncodableVector, 7, this.f86805k);
        a(aSN1EncodableVector, 8, this.f86806l);
        this.f86798d = null;
        this.f86799e = null;
        this.f86800f = null;
        this.f86801g = null;
        this.f86802h = null;
        this.f86803i = null;
        this.f86804j = null;
        this.f86805k = null;
        this.f86806l = null;
        return PKIHeader.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public PKIHeaderBuilder setFreeText(PKIFreeText pKIFreeText) {
        this.f86805k = pKIFreeText;
        return this;
    }

    public PKIHeaderBuilder setGeneralInfo(ASN1Sequence aSN1Sequence) {
        this.f86806l = aSN1Sequence;
        return this;
    }

    public PKIHeaderBuilder setMessageTime(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.f86798d = aSN1GeneralizedTime;
        return this;
    }

    public PKIHeaderBuilder setProtectionAlg(AlgorithmIdentifier algorithmIdentifier) {
        this.f86799e = algorithmIdentifier;
        return this;
    }

    public PKIHeaderBuilder setRecipKID(DEROctetString dEROctetString) {
        this.f86801g = dEROctetString;
        return this;
    }

    public PKIHeaderBuilder setRecipNonce(ASN1OctetString aSN1OctetString) {
        this.f86804j = aSN1OctetString;
        return this;
    }

    public PKIHeaderBuilder setSenderKID(ASN1OctetString aSN1OctetString) {
        this.f86800f = aSN1OctetString;
        return this;
    }

    public PKIHeaderBuilder setSenderNonce(ASN1OctetString aSN1OctetString) {
        this.f86803i = aSN1OctetString;
        return this;
    }

    public PKIHeaderBuilder setTransactionID(ASN1OctetString aSN1OctetString) {
        this.f86802h = aSN1OctetString;
        return this;
    }

    public PKIHeaderBuilder setGeneralInfo(InfoTypeAndValue infoTypeAndValue) {
        return setGeneralInfo(new DERSequence(infoTypeAndValue));
    }

    public PKIHeaderBuilder setRecipKID(byte[] bArr) {
        return setRecipKID(bArr == null ? null : new DEROctetString(bArr));
    }

    public PKIHeaderBuilder setRecipNonce(byte[] bArr) {
        return setRecipNonce(bArr == null ? null : new DEROctetString(bArr));
    }

    public PKIHeaderBuilder setSenderKID(byte[] bArr) {
        return setSenderKID(bArr == null ? null : new DEROctetString(bArr));
    }

    public PKIHeaderBuilder setSenderNonce(byte[] bArr) {
        return setSenderNonce(bArr == null ? null : new DEROctetString(bArr));
    }

    public PKIHeaderBuilder setTransactionID(byte[] bArr) {
        return setTransactionID(bArr == null ? null : new DEROctetString(bArr));
    }

    public PKIHeaderBuilder setGeneralInfo(InfoTypeAndValue[] infoTypeAndValueArr) {
        return setGeneralInfo(infoTypeAndValueArr != null ? new DERSequence(infoTypeAndValueArr) : null);
    }
}
