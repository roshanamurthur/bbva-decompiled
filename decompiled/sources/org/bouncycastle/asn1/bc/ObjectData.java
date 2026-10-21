package org.bouncycastle.asn1.bc;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ObjectData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f86608p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f86609q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1GeneralizedTime f86610r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1GeneralizedTime f86611s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ASN1OctetString f86612t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f86613u0;

    public ObjectData(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr, String str2) {
        this.f86608p0 = bigInteger;
        this.f86609q0 = str;
        this.f86610r0 = new DERGeneralizedTime(date);
        this.f86611s0 = new DERGeneralizedTime(date2);
        this.f86612t0 = new DEROctetString(Arrays.clone(bArr));
        this.f86613u0 = str2;
    }

    public static ObjectData getInstance(Object obj) {
        if (obj instanceof ObjectData) {
            return (ObjectData) obj;
        }
        if (obj != null) {
            return new ObjectData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public String getComment() {
        return this.f86613u0;
    }

    public ASN1GeneralizedTime getCreationDate() {
        return this.f86610r0;
    }

    public byte[] getData() {
        return Arrays.clone(this.f86612t0.getOctets());
    }

    public String getIdentifier() {
        return this.f86609q0;
    }

    public ASN1GeneralizedTime getLastModifiedDate() {
        return this.f86611s0;
    }

    public BigInteger getType() {
        return this.f86608p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(new ASN1Integer(this.f86608p0));
        aSN1EncodableVector.add(new DERUTF8String(this.f86609q0));
        aSN1EncodableVector.add(this.f86610r0);
        aSN1EncodableVector.add(this.f86611s0);
        aSN1EncodableVector.add(this.f86612t0);
        String str = this.f86613u0;
        if (str != null) {
            aSN1EncodableVector.add(new DERUTF8String(str));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ObjectData(ASN1Sequence aSN1Sequence) {
        this.f86608p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        this.f86609q0 = DERUTF8String.getInstance(aSN1Sequence.getObjectAt(1)).getString();
        this.f86610r0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        this.f86611s0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(3));
        this.f86612t0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(4));
        this.f86613u0 = aSN1Sequence.size() == 6 ? DERUTF8String.getInstance(aSN1Sequence.getObjectAt(5)).getString() : null;
    }
}
