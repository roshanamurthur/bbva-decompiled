package org.bouncycastle.asn1.cms;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class AuthEnvelopedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86842p0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OriginatorInfo f86843q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Set f86844r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public EncryptedContentInfo f86845s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1Set f86846t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ASN1OctetString f86847u0;
    public ASN1Set v0;

    public AuthEnvelopedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, EncryptedContentInfo encryptedContentInfo, ASN1Set aSN1Set2, ASN1OctetString aSN1OctetString, ASN1Set aSN1Set3) {
        this.f86843q0 = originatorInfo;
        this.f86844r0 = aSN1Set;
        if (aSN1Set.size() == 0) {
            throw new IllegalArgumentException("AuthEnvelopedData requires at least 1 RecipientInfo");
        }
        this.f86845s0 = encryptedContentInfo;
        this.f86846t0 = aSN1Set2;
        if (!encryptedContentInfo.getContentType().equals((ASN1Primitive) CMSObjectIdentifiers.data) && (aSN1Set2 == null || aSN1Set2.size() == 0)) {
            throw new IllegalArgumentException("authAttrs must be present with non-data content");
        }
        this.f86847u0 = aSN1OctetString;
        this.v0 = aSN1Set3;
    }

    public static AuthEnvelopedData getInstance(Object obj) {
        ASN1Set aSN1Set;
        if (obj == null || (obj instanceof AuthEnvelopedData)) {
            return (AuthEnvelopedData) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid AuthEnvelopedData: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        AuthEnvelopedData authEnvelopedData = new AuthEnvelopedData();
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0).toASN1Primitive());
        authEnvelopedData.f86842p0 = aSN1Integer;
        if (aSN1Integer.intValueExact() != 0) {
            throw new IllegalArgumentException("AuthEnvelopedData version number must be 0");
        }
        ASN1Primitive aSN1Primitive = aSN1Sequence.getObjectAt(1).toASN1Primitive();
        int i10 = 2;
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            authEnvelopedData.f86843q0 = OriginatorInfo.getInstance((ASN1TaggedObject) aSN1Primitive, false);
            aSN1Primitive = aSN1Sequence.getObjectAt(2).toASN1Primitive();
            i10 = 3;
        }
        ASN1Set aSN1Set2 = ASN1Set.getInstance(aSN1Primitive);
        authEnvelopedData.f86844r0 = aSN1Set2;
        if (aSN1Set2.size() == 0) {
            throw new IllegalArgumentException("AuthEnvelopedData requires at least 1 RecipientInfo");
        }
        EncryptedContentInfo encryptedContentInfo = EncryptedContentInfo.getInstance(aSN1Sequence.getObjectAt(i10).toASN1Primitive());
        authEnvelopedData.f86845s0 = encryptedContentInfo;
        int i11 = i10 + 2;
        ASN1Primitive aSN1Primitive2 = aSN1Sequence.getObjectAt(i10 + 1).toASN1Primitive();
        if (aSN1Primitive2 instanceof ASN1TaggedObject) {
            authEnvelopedData.f86846t0 = ASN1Set.getInstance((ASN1TaggedObject) aSN1Primitive2, false);
            aSN1Primitive2 = aSN1Sequence.getObjectAt(i11).toASN1Primitive();
            i11 = i10 + 3;
        } else if (!encryptedContentInfo.getContentType().equals((ASN1Primitive) CMSObjectIdentifiers.data) && ((aSN1Set = authEnvelopedData.f86846t0) == null || aSN1Set.size() == 0)) {
            throw new IllegalArgumentException("authAttrs must be present with non-data content");
        }
        authEnvelopedData.f86847u0 = ASN1OctetString.getInstance(aSN1Primitive2);
        if (aSN1Sequence.size() > i11) {
            authEnvelopedData.v0 = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i11).toASN1Primitive(), false);
        }
        return authEnvelopedData;
    }

    public ASN1Set getAuthAttrs() {
        return this.f86846t0;
    }

    public EncryptedContentInfo getAuthEncryptedContentInfo() {
        return this.f86845s0;
    }

    public ASN1OctetString getMac() {
        return this.f86847u0;
    }

    public OriginatorInfo getOriginatorInfo() {
        return this.f86843q0;
    }

    public ASN1Set getRecipientInfos() {
        return this.f86844r0;
    }

    public ASN1Set getUnauthAttrs() {
        return this.v0;
    }

    public ASN1Integer getVersion() {
        return this.f86842p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.f86842p0);
        OriginatorInfo originatorInfo = this.f86843q0;
        if (originatorInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, originatorInfo));
        }
        aSN1EncodableVector.add(this.f86844r0);
        aSN1EncodableVector.add(this.f86845s0);
        ASN1Set aSN1Set = this.f86846t0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1Set));
        }
        aSN1EncodableVector.add(this.f86847u0);
        ASN1Set aSN1Set2 = this.v0;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, aSN1Set2));
        }
        return new BERSequence(aSN1EncodableVector);
    }

    public static AuthEnvelopedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
