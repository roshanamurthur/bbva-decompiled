package org.bouncycastle.asn1.cmp;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class PKIHeader extends ASN1Object {
    public static final int CMP_1999 = 1;
    public static final int CMP_2000 = 2;
    public static final GeneralName NULL_NAME = new GeneralName(X500Name.getInstance(new DERSequence()));
    public PKIFreeText E0;
    public ASN1Sequence F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralName f86787q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public GeneralName f86788r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1GeneralizedTime f86789s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AlgorithmIdentifier f86790t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ASN1OctetString f86791u0;
    public ASN1OctetString v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ASN1OctetString f86792w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ASN1OctetString f86793x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ASN1OctetString f86794y0;

    public PKIHeader(int i10, GeneralName generalName, GeneralName generalName2) {
        this.f86786p0 = new ASN1Integer(i10);
        this.f86787q0 = generalName;
        this.f86788r0 = generalName2;
    }

    public static void a(ASN1EncodableVector aSN1EncodableVector, int i10, ASN1Object aSN1Object) {
        if (aSN1Object != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, i10, aSN1Object));
        }
    }

    public static PKIHeader getInstance(Object obj) {
        if (obj instanceof PKIHeader) {
            return (PKIHeader) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PKIHeader pKIHeader = new PKIHeader();
        Enumeration objects = aSN1Sequence.getObjects();
        pKIHeader.f86786p0 = ASN1Integer.getInstance(objects.nextElement());
        pKIHeader.f86787q0 = GeneralName.getInstance(objects.nextElement());
        pKIHeader.f86788r0 = GeneralName.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            switch (aSN1TaggedObject.getTagNo()) {
                case 0:
                    pKIHeader.f86789s0 = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, true);
                    break;
                case 1:
                    pKIHeader.f86790t0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
                    break;
                case 2:
                    pKIHeader.f86791u0 = ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 3:
                    pKIHeader.v0 = ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 4:
                    pKIHeader.f86792w0 = ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 5:
                    pKIHeader.f86793x0 = ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 6:
                    pKIHeader.f86794y0 = ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 7:
                    pKIHeader.E0 = PKIFreeText.getInstance(aSN1TaggedObject, true);
                    break;
                case 8:
                    pKIHeader.F0 = ASN1Sequence.getInstance(aSN1TaggedObject, true);
                    break;
                default:
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag number: ")));
            }
        }
        return pKIHeader;
    }

    public PKIFreeText getFreeText() {
        return this.E0;
    }

    public InfoTypeAndValue[] getGeneralInfo() {
        ASN1Sequence aSN1Sequence = this.F0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        InfoTypeAndValue[] infoTypeAndValueArr = new InfoTypeAndValue[size];
        for (int i10 = 0; i10 < size; i10++) {
            infoTypeAndValueArr[i10] = InfoTypeAndValue.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return infoTypeAndValueArr;
    }

    public ASN1GeneralizedTime getMessageTime() {
        return this.f86789s0;
    }

    public AlgorithmIdentifier getProtectionAlg() {
        return this.f86790t0;
    }

    public ASN1Integer getPvno() {
        return this.f86786p0;
    }

    public ASN1OctetString getRecipKID() {
        return this.v0;
    }

    public ASN1OctetString getRecipNonce() {
        return this.f86794y0;
    }

    public GeneralName getRecipient() {
        return this.f86788r0;
    }

    public GeneralName getSender() {
        return this.f86787q0;
    }

    public ASN1OctetString getSenderKID() {
        return this.f86791u0;
    }

    public ASN1OctetString getSenderNonce() {
        return this.f86793x0;
    }

    public ASN1OctetString getTransactionID() {
        return this.f86792w0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(12);
        aSN1EncodableVector.add(this.f86786p0);
        aSN1EncodableVector.add(this.f86787q0);
        aSN1EncodableVector.add(this.f86788r0);
        a(aSN1EncodableVector, 0, this.f86789s0);
        a(aSN1EncodableVector, 1, this.f86790t0);
        a(aSN1EncodableVector, 2, this.f86791u0);
        a(aSN1EncodableVector, 3, this.v0);
        a(aSN1EncodableVector, 4, this.f86792w0);
        a(aSN1EncodableVector, 5, this.f86793x0);
        a(aSN1EncodableVector, 6, this.f86794y0);
        a(aSN1EncodableVector, 7, this.E0);
        a(aSN1EncodableVector, 8, this.F0);
        return new DERSequence(aSN1EncodableVector);
    }
}
