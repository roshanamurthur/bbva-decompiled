package org.bouncycastle.asn1.pkcs;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class SignedData extends ASN1Object implements PKCSObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f87454p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Set f87455q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ContentInfo f87456r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1Set f87457s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ASN1Set f87458t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ASN1Set f87459u0;

    public SignedData(ASN1Integer aSN1Integer, ASN1Set aSN1Set, ContentInfo contentInfo, ASN1Set aSN1Set2, ASN1Set aSN1Set3, ASN1Set aSN1Set4) {
        this.f87454p0 = aSN1Integer;
        this.f87455q0 = aSN1Set;
        this.f87456r0 = contentInfo;
        this.f87457s0 = aSN1Set2;
        this.f87458t0 = aSN1Set3;
        this.f87459u0 = aSN1Set4;
    }

    public static SignedData getInstance(Object obj) {
        if (obj instanceof SignedData) {
            return (SignedData) obj;
        }
        if (obj != null) {
            return new SignedData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Set getCRLs() {
        return this.f87458t0;
    }

    public ASN1Set getCertificates() {
        return this.f87457s0;
    }

    public ContentInfo getContentInfo() {
        return this.f87456r0;
    }

    public ASN1Set getDigestAlgorithms() {
        return this.f87455q0;
    }

    public ASN1Set getSignerInfos() {
        return this.f87459u0;
    }

    public ASN1Integer getVersion() {
        return this.f87454p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f87454p0);
        aSN1EncodableVector.add(this.f87455q0);
        aSN1EncodableVector.add(this.f87456r0);
        ASN1Set aSN1Set = this.f87457s0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1Set));
        }
        ASN1Set aSN1Set2 = this.f87458t0;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1Set2));
        }
        aSN1EncodableVector.add(this.f87459u0);
        return new BERSequence(aSN1EncodableVector);
    }

    public SignedData(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f87454p0 = (ASN1Integer) objects.nextElement();
        this.f87455q0 = (ASN1Set) objects.nextElement();
        this.f87456r0 = ContentInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = (ASN1Primitive) objects.nextElement();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.f87457s0 = ASN1Set.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 1) {
                        throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag value ")));
                    }
                    this.f87458t0 = ASN1Set.getInstance(aSN1TaggedObject, false);
                }
            } else {
                this.f87459u0 = (ASN1Set) aSN1Primitive;
            }
        }
    }
}
