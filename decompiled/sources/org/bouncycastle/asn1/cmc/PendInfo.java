package org.bouncycastle.asn1.cmc;

import androidx.camera.core.impl.utils.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class PendInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86716p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1GeneralizedTime f86717q0;

    public PendInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86716p0 = a.c(aSN1Sequence, 0);
        this.f86717q0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static PendInfo getInstance(Object obj) {
        if (obj instanceof PendInfo) {
            return (PendInfo) obj;
        }
        if (obj != null) {
            return new PendInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1GeneralizedTime getPendTime() {
        return this.f86717q0;
    }

    public byte[] getPendToken() {
        return Arrays.clone(this.f86716p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new DEROctetString(this.f86716p0));
        aSN1EncodableVector.add(this.f86717q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public PendInfo(byte[] bArr, ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.f86716p0 = Arrays.clone(bArr);
        this.f86717q0 = aSN1GeneralizedTime;
    }
}
