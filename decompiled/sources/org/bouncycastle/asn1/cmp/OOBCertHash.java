package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class OOBCertHash extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f86775p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CertId f86776q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERBitString f86777r0;

    public OOBCertHash(AlgorithmIdentifier algorithmIdentifier, CertId certId, DERBitString dERBitString) {
        this.f86775p0 = algorithmIdentifier;
        this.f86776q0 = certId;
        this.f86777r0 = dERBitString;
    }

    public static OOBCertHash getInstance(Object obj) {
        if (obj instanceof OOBCertHash) {
            return (OOBCertHash) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OOBCertHash oOBCertHash = new OOBCertHash();
        int size = aSN1Sequence.size();
        int i10 = size - 1;
        oOBCertHash.f86777r0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(i10));
        for (int i11 = size - 2; i11 >= 0; i11--) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i11);
            if (aSN1TaggedObject.getTagNo() == 0) {
                oOBCertHash.f86775p0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else {
                oOBCertHash.f86776q0 = CertId.getInstance(aSN1TaggedObject, true);
            }
        }
        return oOBCertHash;
    }

    public CertId getCertId() {
        return this.f86776q0;
    }

    public AlgorithmIdentifier getHashAlg() {
        return this.f86775p0;
    }

    public DERBitString getHashVal() {
        return this.f86777r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        AlgorithmIdentifier algorithmIdentifier = this.f86775p0;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, algorithmIdentifier));
        }
        CertId certId = this.f86776q0;
        if (certId != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, certId));
        }
        aSN1EncodableVector.add(this.f86777r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public OOBCertHash(AlgorithmIdentifier algorithmIdentifier, CertId certId, byte[] bArr) {
        this(algorithmIdentifier, certId, new DERBitString(bArr));
    }
}
