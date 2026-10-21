package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class RC2CBCParameter extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87422p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87423q0;

    public RC2CBCParameter(int i10, byte[] bArr) {
        this.f87422p0 = new ASN1Integer(i10);
        this.f87423q0 = new DEROctetString(bArr);
    }

    public static RC2CBCParameter getInstance(Object obj) {
        ASN1Encodable objectAt;
        if (obj instanceof RC2CBCParameter) {
            return (RC2CBCParameter) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RC2CBCParameter rC2CBCParameter = new RC2CBCParameter();
        if (aSN1Sequence.size() == 1) {
            rC2CBCParameter.f87422p0 = null;
            objectAt = aSN1Sequence.getObjectAt(0);
        } else {
            rC2CBCParameter.f87422p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
            objectAt = aSN1Sequence.getObjectAt(1);
        }
        rC2CBCParameter.f87423q0 = (ASN1OctetString) objectAt;
        return rC2CBCParameter;
    }

    public byte[] getIV() {
        return this.f87423q0.getOctets();
    }

    public BigInteger getRC2ParameterVersion() {
        ASN1Integer aSN1Integer = this.f87422p0;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Integer aSN1Integer = this.f87422p0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        aSN1EncodableVector.add(this.f87423q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public RC2CBCParameter(byte[] bArr) {
        this.f87422p0 = null;
        this.f87423q0 = new DEROctetString(bArr);
    }
}
