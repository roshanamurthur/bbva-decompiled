package org.bouncycastle.asn1.cms;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class SignedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86961p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Set f86962q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ContentInfo f86963r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Set f86964s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1Set f86965t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ASN1Set f86966u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f86967w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final ASN1Integer f86959x0 = new ASN1Integer(1);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final ASN1Integer f86960y0 = new ASN1Integer(3);
    public static final ASN1Integer E0 = new ASN1Integer(4);
    public static final ASN1Integer F0 = new ASN1Integer(5);

    /* JADX WARN: Code duplicated, block: B:30:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[EDGE_INSN: B:42:0x0099->B:34:0x0074 BREAK  A[LOOP:2: B:36:0x007a->B:67:?]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0093 A[SYNTHETIC] */
    public SignedData(ASN1Set aSN1Set, ContentInfo contentInfo, ASN1Set aSN1Set2, ASN1Set aSN1Set3, ASN1Set aSN1Set4) {
        boolean z10;
        boolean z11;
        boolean z12;
        ASN1Integer aSN1Integer;
        Enumeration objects;
        ASN1Integer aSN1Integer2;
        ASN1ObjectIdentifier contentType = contentInfo.getContentType();
        boolean z13 = false;
        if (aSN1Set2 != null) {
            Enumeration objects2 = aSN1Set2.getObjects();
            z10 = false;
            z11 = false;
            z12 = false;
            while (objects2.hasMoreElements()) {
                Object objNextElement = objects2.nextElement();
                if (objNextElement instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objNextElement);
                    if (aSN1TaggedObject.getTagNo() == 1) {
                        z11 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 2) {
                        z12 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 3) {
                        z10 = true;
                    }
                }
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (z10) {
            aSN1Integer2 = new ASN1Integer(5L);
        } else if (aSN1Set3 != null) {
            Enumeration objects3 = aSN1Set3.getObjects();
            while (objects3.hasMoreElements()) {
                if (objects3.nextElement() instanceof ASN1TaggedObject) {
                    z13 = true;
                }
            }
            if (z13) {
                aSN1Integer2 = F0;
            } else if (z12) {
                aSN1Integer2 = E0;
            } else {
                aSN1Integer = f86960y0;
                if (z11) {
                    aSN1Integer2 = aSN1Integer;
                } else {
                    objects = aSN1Set4.getObjects();
                    do {
                        if (objects.hasMoreElements()) {
                            if (!CMSObjectIdentifiers.data.equals((ASN1Primitive) contentType)) {
                                break;
                            } else {
                                aSN1Integer2 = f86959x0;
                            }
                        }
                    } while (SignerInfo.getInstance(objects.nextElement()).getVersion().intValueExact() != 3);
                    aSN1Integer2 = aSN1Integer;
                }
            }
        } else if (z12) {
            aSN1Integer2 = E0;
        } else {
            aSN1Integer = f86960y0;
            if (z11) {
                aSN1Integer2 = aSN1Integer;
            } else {
                objects = aSN1Set4.getObjects();
                do {
                    if (objects.hasMoreElements()) {
                        if (!CMSObjectIdentifiers.data.equals((ASN1Primitive) contentType)) {
                            break;
                        } else {
                            aSN1Integer2 = f86959x0;
                        }
                    }
                } while (SignerInfo.getInstance(objects.nextElement()).getVersion().intValueExact() != 3);
                aSN1Integer2 = aSN1Integer;
            }
        }
        this.f86961p0 = aSN1Integer2;
        this.f86962q0 = aSN1Set;
        this.f86963r0 = contentInfo;
        this.f86964s0 = aSN1Set2;
        this.f86965t0 = aSN1Set3;
        this.f86966u0 = aSN1Set4;
        this.f86967w0 = aSN1Set3 instanceof BERSet;
        this.v0 = aSN1Set2 instanceof BERSet;
    }

    public static SignedData getInstance(Object obj) {
        if (obj instanceof SignedData) {
            return (SignedData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SignedData signedData = new SignedData();
        Enumeration objects = aSN1Sequence.getObjects();
        signedData.f86961p0 = ASN1Integer.getInstance(objects.nextElement());
        signedData.f86962q0 = (ASN1Set) objects.nextElement();
        signedData.f86963r0 = ContentInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1Primitive aSN1Primitive = (ASN1Primitive) objects.nextElement();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    signedData.v0 = aSN1TaggedObject instanceof BERTaggedObject;
                    signedData.f86964s0 = ASN1Set.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 1) {
                        throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag value ")));
                    }
                    signedData.f86967w0 = aSN1TaggedObject instanceof BERTaggedObject;
                    signedData.f86965t0 = ASN1Set.getInstance(aSN1TaggedObject, false);
                }
            } else {
                signedData.f86966u0 = (ASN1Set) aSN1Primitive;
            }
        }
        return signedData;
    }

    public ASN1Set getCRLs() {
        return this.f86965t0;
    }

    public ASN1Set getCertificates() {
        return this.f86964s0;
    }

    public ASN1Set getDigestAlgorithms() {
        return this.f86962q0;
    }

    public ContentInfo getEncapContentInfo() {
        return this.f86963r0;
    }

    public ASN1Set getSignerInfos() {
        return this.f86966u0;
    }

    public ASN1Integer getVersion() {
        return this.f86961p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f86961p0);
        aSN1EncodableVector.add(this.f86962q0);
        aSN1EncodableVector.add(this.f86963r0);
        ASN1Set aSN1Set = this.f86964s0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(this.v0 ? new BERTaggedObject(false, 0, aSN1Set) : new DERTaggedObject(false, 0, aSN1Set));
        }
        ASN1Set aSN1Set2 = this.f86965t0;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(this.f86967w0 ? new BERTaggedObject(false, 1, aSN1Set2) : new DERTaggedObject(false, 1, aSN1Set2));
        }
        aSN1EncodableVector.add(this.f86966u0);
        return new BERSequence(aSN1EncodableVector);
    }
}
