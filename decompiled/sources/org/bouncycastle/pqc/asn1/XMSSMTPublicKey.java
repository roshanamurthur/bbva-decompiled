package org.bouncycastle.pqc.asn1;

import androidx.camera.core.impl.utils.a;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSMTPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f90946p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f90947q0;

    public XMSSMTPublicKey(ASN1Sequence aSN1Sequence) {
        if (!ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).hasValue(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f90946p0 = a.c(aSN1Sequence, 1);
        this.f90947q0 = a.c(aSN1Sequence, 2);
    }

    public static XMSSMTPublicKey getInstance(Object obj) {
        if (obj instanceof XMSSMTPublicKey) {
            return (XMSSMTPublicKey) obj;
        }
        if (obj != null) {
            return new XMSSMTPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f90946p0);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f90947q0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(0L));
        aSN1EncodableVector.add(new DEROctetString(this.f90946p0));
        aSN1EncodableVector.add(new DEROctetString(this.f90947q0));
        return new DERSequence(aSN1EncodableVector);
    }

    public XMSSMTPublicKey(byte[] bArr, byte[] bArr2) {
        this.f90946p0 = Arrays.clone(bArr);
        this.f90947q0 = Arrays.clone(bArr2);
    }
}
