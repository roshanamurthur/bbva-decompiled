package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class CertID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87330p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87331q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1OctetString f87332r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Integer f87333s0;

    public CertID(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2, ASN1Integer aSN1Integer) {
        this.f87330p0 = algorithmIdentifier;
        this.f87331q0 = aSN1OctetString;
        this.f87332r0 = aSN1OctetString2;
        this.f87333s0 = aSN1Integer;
    }

    public static CertID getInstance(Object obj) {
        if (obj instanceof CertID) {
            return (CertID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertID certID = new CertID();
        certID.f87330p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        certID.f87331q0 = (ASN1OctetString) aSN1Sequence.getObjectAt(1);
        certID.f87332r0 = (ASN1OctetString) aSN1Sequence.getObjectAt(2);
        certID.f87333s0 = (ASN1Integer) aSN1Sequence.getObjectAt(3);
        return certID;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.f87330p0;
    }

    public ASN1OctetString getIssuerKeyHash() {
        return this.f87332r0;
    }

    public ASN1OctetString getIssuerNameHash() {
        return this.f87331q0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f87333s0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f87330p0);
        aSN1EncodableVector.add(this.f87331q0);
        aSN1EncodableVector.add(this.f87332r0);
        aSN1EncodableVector.add(this.f87333s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static CertID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
