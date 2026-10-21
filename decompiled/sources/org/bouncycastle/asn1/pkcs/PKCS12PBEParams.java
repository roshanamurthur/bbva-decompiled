package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PKCS12PBEParams extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87414q0;

    public PKCS12PBEParams(byte[] bArr, int i10) {
        this.f87414q0 = new DEROctetString(bArr);
        this.f87413p0 = new ASN1Integer(i10);
    }

    public static PKCS12PBEParams getInstance(Object obj) {
        if (obj instanceof PKCS12PBEParams) {
            return (PKCS12PBEParams) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams();
        pKCS12PBEParams.f87414q0 = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        pKCS12PBEParams.f87413p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        return pKCS12PBEParams;
    }

    public byte[] getIV() {
        return this.f87414q0.getOctets();
    }

    public BigInteger getIterations() {
        return this.f87413p0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87414q0);
        aSN1EncodableVector.add(this.f87413p0);
        return new DERSequence(aSN1EncodableVector);
    }
}
