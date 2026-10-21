package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class OtherHash extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1OctetString f87214p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final OtherHashAlgAndValue f87215q0;

    public OtherHash(OtherHashAlgAndValue otherHashAlgAndValue) {
        this.f87215q0 = otherHashAlgAndValue;
    }

    public static OtherHash getInstance(Object obj) {
        if (obj instanceof OtherHash) {
            return (OtherHash) obj;
        }
        if (!(obj instanceof ASN1OctetString)) {
            return new OtherHash(OtherHashAlgAndValue.getInstance(obj));
        }
        OtherHash otherHash = new OtherHash();
        otherHash.f87214p0 = (ASN1OctetString) obj;
        return otherHash;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        OtherHashAlgAndValue otherHashAlgAndValue = this.f87215q0;
        return otherHashAlgAndValue == null ? new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1) : otherHashAlgAndValue.getHashAlgorithm();
    }

    public byte[] getHashValue() {
        OtherHashAlgAndValue otherHashAlgAndValue = this.f87215q0;
        return (otherHashAlgAndValue == null ? this.f87214p0 : otherHashAlgAndValue.getHashValue()).getOctets();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        OtherHashAlgAndValue otherHashAlgAndValue = this.f87215q0;
        return otherHashAlgAndValue == null ? this.f87214p0 : otherHashAlgAndValue.toASN1Primitive();
    }

    public OtherHash(byte[] bArr) {
        this.f87214p0 = new DEROctetString(bArr);
    }
}
