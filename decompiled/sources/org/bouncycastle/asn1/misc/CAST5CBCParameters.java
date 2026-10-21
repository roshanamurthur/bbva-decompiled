package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class CAST5CBCParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87311p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87312q0;

    public CAST5CBCParameters(byte[] bArr, int i10) {
        this.f87312q0 = new DEROctetString(Arrays.clone(bArr));
        this.f87311p0 = new ASN1Integer(i10);
    }

    public static CAST5CBCParameters getInstance(Object obj) {
        if (obj instanceof CAST5CBCParameters) {
            return (CAST5CBCParameters) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CAST5CBCParameters cAST5CBCParameters = new CAST5CBCParameters();
        cAST5CBCParameters.f87312q0 = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        cAST5CBCParameters.f87311p0 = (ASN1Integer) aSN1Sequence.getObjectAt(1);
        return cAST5CBCParameters;
    }

    public byte[] getIV() {
        return Arrays.clone(this.f87312q0.getOctets());
    }

    public int getKeyLength() {
        return this.f87311p0.intValueExact();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87312q0);
        aSN1EncodableVector.add(this.f87311p0);
        return new DERSequence(aSN1EncodableVector);
    }
}
