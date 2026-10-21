package org.bouncycastle.pqc.asn1;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f90924p0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1ObjectIdentifier f90925q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f90926r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[][] f90927s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[][] f90928t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f90929u0;

    public RainbowPublicKey(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f90926r0 = new ASN1Integer(i10);
        this.f90927s0 = RainbowUtil.convertArray(sArr);
        this.f90928t0 = RainbowUtil.convertArray(sArr2);
        this.f90929u0 = RainbowUtil.convertArray(sArr3);
    }

    public static RainbowPublicKey getInstance(Object obj) {
        if (obj instanceof RainbowPublicKey) {
            return (RainbowPublicKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RainbowPublicKey rainbowPublicKey = new RainbowPublicKey();
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            rainbowPublicKey.f90924p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            rainbowPublicKey.f90925q0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        rainbowPublicKey.f90926r0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
        rainbowPublicKey.f90927s0 = new byte[aSN1Sequence2.size()][];
        for (int i10 = 0; i10 < aSN1Sequence2.size(); i10++) {
            rainbowPublicKey.f90927s0[i10] = ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(i10)).getOctets();
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        rainbowPublicKey.f90928t0 = new byte[aSN1Sequence3.size()][];
        for (int i11 = 0; i11 < aSN1Sequence3.size(); i11++) {
            rainbowPublicKey.f90928t0[i11] = ASN1OctetString.getInstance(aSN1Sequence3.getObjectAt(i11)).getOctets();
        }
        rainbowPublicKey.f90929u0 = ASN1OctetString.getInstance(((ASN1Sequence) aSN1Sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
        return rainbowPublicKey;
    }

    public short[][] getCoeffQuadratic() {
        return RainbowUtil.convertArray(this.f90927s0);
    }

    public short[] getCoeffScalar() {
        return RainbowUtil.convertArray(this.f90929u0);
    }

    public short[][] getCoeffSingular() {
        return RainbowUtil.convertArray(this.f90928t0);
    }

    public int getDocLength() {
        return this.f90926r0.intValueExact();
    }

    public ASN1Integer getVersion() {
        return this.f90924p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Encodable aSN1Encodable = this.f90924p0;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.f90925q0;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        aSN1EncodableVector.add(this.f90926r0);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr = this.f90927s0;
            if (i11 >= bArr.length) {
                break;
            }
            aSN1EncodableVector2.add(new DEROctetString(bArr[i11]));
            i11++;
        }
        ASN1EncodableVector aSN1EncodableVectorD = a.d(aSN1EncodableVector2, aSN1EncodableVector);
        while (true) {
            byte[][] bArr2 = this.f90928t0;
            if (i10 >= bArr2.length) {
                ASN1EncodableVector aSN1EncodableVectorD2 = a.d(aSN1EncodableVectorD, aSN1EncodableVector);
                aSN1EncodableVectorD2.add(new DEROctetString(this.f90929u0));
                aSN1EncodableVector.add(new DERSequence(aSN1EncodableVectorD2));
                return new DERSequence(aSN1EncodableVector);
            }
            aSN1EncodableVectorD.add(new DEROctetString(bArr2[i10]));
            i10++;
        }
    }
}
