package org.bouncycastle.asn1.icao;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.x509.Certificate;

/* JADX INFO: loaded from: classes12.dex */
public class CscaMasterList extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87272p0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Certificate[] f87273q0;

    public CscaMasterList(Certificate[] certificateArr) {
        int length = certificateArr.length;
        Certificate[] certificateArr2 = new Certificate[length];
        for (int i10 = 0; i10 != length; i10++) {
            certificateArr2[i10] = certificateArr[i10];
        }
        this.f87273q0 = certificateArr2;
    }

    public static CscaMasterList getInstance(Object obj) {
        if (obj instanceof CscaMasterList) {
            return (CscaMasterList) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CscaMasterList cscaMasterList = new CscaMasterList();
        cscaMasterList.f87272p0 = new ASN1Integer(0L);
        if (aSN1Sequence == null || aSN1Sequence.size() == 0) {
            throw new IllegalArgumentException("null or empty sequence passed.");
        }
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Incorrect sequence size: ")));
        }
        int i10 = 0;
        cscaMasterList.f87272p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1Set aSN1Set = ASN1Set.getInstance(aSN1Sequence.getObjectAt(1));
        cscaMasterList.f87273q0 = new Certificate[aSN1Set.size()];
        while (true) {
            Certificate[] certificateArr = cscaMasterList.f87273q0;
            if (i10 >= certificateArr.length) {
                return cscaMasterList;
            }
            certificateArr[i10] = Certificate.getInstance(aSN1Set.getObjectAt(i10));
            i10++;
        }
    }

    public Certificate[] getCertStructs() {
        Certificate[] certificateArr = this.f87273q0;
        int length = certificateArr.length;
        Certificate[] certificateArr2 = new Certificate[length];
        for (int i10 = 0; i10 != length; i10++) {
            certificateArr2[i10] = certificateArr[i10];
        }
        return certificateArr2;
    }

    public int getVersion() {
        return this.f87272p0.intValueExact();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87272p0);
        aSN1EncodableVector.add(new DERSet(this.f87273q0));
        return new DERSequence(aSN1EncodableVector);
    }
}
