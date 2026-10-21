package org.bouncycastle.asn1.cms;

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
public class GCMParameters extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public byte[] f86905p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f86906q0;

    public GCMParameters(byte[] bArr, int i10) {
        this.f86905p0 = Arrays.clone(bArr);
        this.f86906q0 = i10;
    }

    public static GCMParameters getInstance(Object obj) {
        if (obj instanceof GCMParameters) {
            return (GCMParameters) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        GCMParameters gCMParameters = new GCMParameters();
        gCMParameters.f86905p0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets();
        gCMParameters.f86906q0 = aSN1Sequence.size() == 2 ? ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).intValueExact() : 12;
        return gCMParameters;
    }

    public int getIcvLen() {
        return this.f86906q0;
    }

    public byte[] getNonce() {
        return Arrays.clone(this.f86905p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new DEROctetString(this.f86905p0));
        int i10 = this.f86906q0;
        if (i10 != 12) {
            aSN1EncodableVector.add(new ASN1Integer(i10));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
