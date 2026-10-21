package org.bouncycastle.asn1.x509.qualified;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class BiometricData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TypeOfBiometricData f87786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f87787q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1OctetString f87788r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public DERIA5String f87789s0;

    public BiometricData(TypeOfBiometricData typeOfBiometricData, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.f87786p0 = typeOfBiometricData;
        this.f87787q0 = algorithmIdentifier;
        this.f87788r0 = aSN1OctetString;
        this.f87789s0 = null;
    }

    public static BiometricData getInstance(Object obj) {
        if (obj instanceof BiometricData) {
            return (BiometricData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        BiometricData biometricData = new BiometricData();
        Enumeration objects = aSN1Sequence.getObjects();
        biometricData.f87786p0 = TypeOfBiometricData.getInstance(objects.nextElement());
        biometricData.f87787q0 = AlgorithmIdentifier.getInstance(objects.nextElement());
        biometricData.f87788r0 = ASN1OctetString.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            biometricData.f87789s0 = DERIA5String.getInstance(objects.nextElement());
        }
        return biometricData;
    }

    public ASN1OctetString getBiometricDataHash() {
        return this.f87788r0;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.f87787q0;
    }

    public DERIA5String getSourceDataUri() {
        return this.f87789s0;
    }

    public TypeOfBiometricData getTypeOfBiometricData() {
        return this.f87786p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f87786p0);
        aSN1EncodableVector.add(this.f87787q0);
        aSN1EncodableVector.add(this.f87788r0);
        DERIA5String dERIA5String = this.f87789s0;
        if (dERIA5String != null) {
            aSN1EncodableVector.add(dERIA5String);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public BiometricData(TypeOfBiometricData typeOfBiometricData, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString, DERIA5String dERIA5String) {
        this.f87786p0 = typeOfBiometricData;
        this.f87787q0 = algorithmIdentifier;
        this.f87788r0 = aSN1OctetString;
        this.f87789s0 = dERIA5String;
    }
}
