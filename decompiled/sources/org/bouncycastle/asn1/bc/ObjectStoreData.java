package org.bouncycastle.asn1.bc;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class ObjectStoreData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f86617p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86618q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1GeneralizedTime f86619r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1GeneralizedTime f86620s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ObjectDataSequence f86621t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f86622u0;

    public ObjectStoreData(ASN1Sequence aSN1Sequence) {
        this.f86617p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        this.f86618q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86619r0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        this.f86620s0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(3));
        this.f86621t0 = ObjectDataSequence.getInstance(aSN1Sequence.getObjectAt(4));
        this.f86622u0 = aSN1Sequence.size() == 6 ? DERUTF8String.getInstance(aSN1Sequence.getObjectAt(5)).getString() : null;
    }

    public static ObjectStoreData getInstance(Object obj) {
        if (obj instanceof ObjectStoreData) {
            return (ObjectStoreData) obj;
        }
        if (obj != null) {
            return new ObjectStoreData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public String getComment() {
        return this.f86622u0;
    }

    public ASN1GeneralizedTime getCreationDate() {
        return this.f86619r0;
    }

    public AlgorithmIdentifier getIntegrityAlgorithm() {
        return this.f86618q0;
    }

    public ASN1GeneralizedTime getLastModifiedDate() {
        return this.f86620s0;
    }

    public ObjectDataSequence getObjectDataSequence() {
        return this.f86621t0;
    }

    public BigInteger getVersion() {
        return this.f86617p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(new ASN1Integer(this.f86617p0));
        aSN1EncodableVector.add(this.f86618q0);
        aSN1EncodableVector.add(this.f86619r0);
        aSN1EncodableVector.add(this.f86620s0);
        aSN1EncodableVector.add(this.f86621t0);
        String str = this.f86622u0;
        if (str != null) {
            aSN1EncodableVector.add(new DERUTF8String(str));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ObjectStoreData(AlgorithmIdentifier algorithmIdentifier, Date date, Date date2, ObjectDataSequence objectDataSequence, String str) {
        this.f86617p0 = BigInteger.valueOf(1L);
        this.f86618q0 = algorithmIdentifier;
        this.f86619r0 = new DERGeneralizedTime(date);
        this.f86620s0 = new DERGeneralizedTime(date2);
        this.f86621t0 = objectDataSequence;
        this.f86622u0 = str;
    }
}
