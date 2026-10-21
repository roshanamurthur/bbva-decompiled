package org.bouncycastle.pqc.asn1;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f90892p0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f90893q0;

    public GMSSPublicKey(byte[] bArr) {
        this.f90893q0 = bArr;
    }

    public static GMSSPublicKey getInstance(Object obj) {
        if (obj instanceof GMSSPublicKey) {
            return (GMSSPublicKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        GMSSPublicKey gMSSPublicKey = new GMSSPublicKey();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("size of seq = ")));
        }
        gMSSPublicKey.f90892p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        gMSSPublicKey.f90893q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        return gMSSPublicKey;
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.f90893q0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f90892p0);
        aSN1EncodableVector.add(new DEROctetString(this.f90893q0));
        return new DERSequence(aSN1EncodableVector);
    }
}
