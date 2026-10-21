package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class Accuracy extends ASN1Object {
    protected static final int MAX_MICROS = 999;
    protected static final int MAX_MILLIS = 999;
    protected static final int MIN_MICROS = 1;
    protected static final int MIN_MILLIS = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87478p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87479q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87480r0;

    public Accuracy() {
    }

    public static Accuracy getInstance(Object obj) {
        if (obj instanceof Accuracy) {
            return (Accuracy) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Accuracy accuracy = new Accuracy();
        accuracy.f87478p0 = null;
        accuracy.f87479q0 = null;
        accuracy.f87480r0 = null;
        for (int i10 = 0; i10 < aSN1Sequence.size(); i10++) {
            if (aSN1Sequence.getObjectAt(i10) instanceof ASN1Integer) {
                accuracy.f87478p0 = (ASN1Integer) aSN1Sequence.getObjectAt(i10);
            } else if (aSN1Sequence.getObjectAt(i10) instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i10);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1TaggedObject, false);
                    accuracy.f87479q0 = aSN1Integer;
                    int iIntValueExact = aSN1Integer.intValueExact();
                    if (iIntValueExact < 1 || iIntValueExact > 999) {
                        throw new IllegalArgumentException("Invalid millis field : not in (1..999)");
                    }
                } else {
                    if (tagNo != 1) {
                        throw new IllegalArgumentException("Invalid tag number");
                    }
                    ASN1Integer aSN1Integer2 = ASN1Integer.getInstance(aSN1TaggedObject, false);
                    accuracy.f87480r0 = aSN1Integer2;
                    int iIntValueExact2 = aSN1Integer2.intValueExact();
                    if (iIntValueExact2 < 1 || iIntValueExact2 > 999) {
                        throw new IllegalArgumentException("Invalid micros field : not in (1..999)");
                    }
                }
            } else {
                continue;
            }
        }
        return accuracy;
    }

    public ASN1Integer getMicros() {
        return this.f87480r0;
    }

    public ASN1Integer getMillis() {
        return this.f87479q0;
    }

    public ASN1Integer getSeconds() {
        return this.f87478p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        ASN1Integer aSN1Integer = this.f87478p0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ASN1Integer aSN1Integer2 = this.f87479q0;
        if (aSN1Integer2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1Integer2));
        }
        ASN1Integer aSN1Integer3 = this.f87480r0;
        if (aSN1Integer3 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1Integer3));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Accuracy(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, ASN1Integer aSN1Integer3) {
        int iIntValueExact;
        int iIntValueExact2;
        if (aSN1Integer2 != null && ((iIntValueExact2 = aSN1Integer2.intValueExact()) < 1 || iIntValueExact2 > 999)) {
            throw new IllegalArgumentException("Invalid millis field : not in (1..999)");
        }
        if (aSN1Integer3 != null && ((iIntValueExact = aSN1Integer3.intValueExact()) < 1 || iIntValueExact > 999)) {
            throw new IllegalArgumentException("Invalid micros field : not in (1..999)");
        }
        this.f87478p0 = aSN1Integer;
        this.f87479q0 = aSN1Integer2;
        this.f87480r0 = aSN1Integer3;
    }
}
