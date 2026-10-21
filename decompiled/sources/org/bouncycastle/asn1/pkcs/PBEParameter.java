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
public class PBEParameter extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87404p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87405q0;

    public PBEParameter(byte[] bArr, int i10) {
        if (bArr.length != 8) {
            throw new IllegalArgumentException("salt length must be 8");
        }
        this.f87405q0 = new DEROctetString(bArr);
        this.f87404p0 = new ASN1Integer(i10);
    }

    public static PBEParameter getInstance(Object obj) {
        if (obj instanceof PBEParameter) {
            return (PBEParameter) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PBEParameter pBEParameter = new PBEParameter();
        pBEParameter.f87405q0 = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        pBEParameter.f87404p0 = (ASN1Integer) aSN1Sequence.getObjectAt(1);
        return pBEParameter;
    }

    public BigInteger getIterationCount() {
        return this.f87404p0.getValue();
    }

    public byte[] getSalt() {
        return this.f87405q0.getOctets();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87405q0);
        aSN1EncodableVector.add(this.f87404p0);
        return new DERSequence(aSN1EncodableVector);
    }
}
