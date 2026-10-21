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
import org.bouncycastle.pqc.crypto.rainbow.Layer;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowPrivateKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f90917p0 = new ASN1Integer(1);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1ObjectIdentifier f90918q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[][] f90919r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f90920s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[][] f90921t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f90922u0;
    public byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Layer[] f90923w0;

    public RainbowPrivateKey(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.f90919r0 = RainbowUtil.convertArray(sArr);
        this.f90920s0 = RainbowUtil.convertArray(sArr2);
        this.f90921t0 = RainbowUtil.convertArray(sArr3);
        this.f90922u0 = RainbowUtil.convertArray(sArr4);
        this.v0 = RainbowUtil.convertIntArray(iArr);
        this.f90923w0 = layerArr;
    }

    public static RainbowPrivateKey getInstance(Object obj) {
        if (obj instanceof RainbowPrivateKey) {
            return (RainbowPrivateKey) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RainbowPrivateKey rainbowPrivateKey = new RainbowPrivateKey();
        int i10 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            rainbowPrivateKey.f90917p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            rainbowPrivateKey.f90918q0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        rainbowPrivateKey.f90919r0 = new byte[aSN1Sequence2.size()][];
        for (int i11 = 0; i11 < aSN1Sequence2.size(); i11++) {
            rainbowPrivateKey.f90919r0[i11] = ((ASN1OctetString) aSN1Sequence2.getObjectAt(i11)).getOctets();
        }
        rainbowPrivateKey.f90920s0 = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(2)).getObjectAt(0)).getOctets();
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        rainbowPrivateKey.f90921t0 = new byte[aSN1Sequence3.size()][];
        for (int i12 = 0; i12 < aSN1Sequence3.size(); i12++) {
            rainbowPrivateKey.f90921t0[i12] = ((ASN1OctetString) aSN1Sequence3.getObjectAt(i12)).getOctets();
        }
        rainbowPrivateKey.f90922u0 = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
        rainbowPrivateKey.v0 = ((ASN1OctetString) ((ASN1Sequence) aSN1Sequence.getObjectAt(5)).getObjectAt(0)).getOctets();
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(6);
        byte[][][][] bArr = new byte[aSN1Sequence4.size()][][][];
        byte[][][][] bArr2 = new byte[aSN1Sequence4.size()][][][];
        byte[][][] bArr3 = new byte[aSN1Sequence4.size()][][];
        byte[][] bArr4 = new byte[aSN1Sequence4.size()][];
        int i13 = 0;
        while (i13 < aSN1Sequence4.size()) {
            ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence4.getObjectAt(i13);
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i10);
            bArr[i13] = new byte[aSN1Sequence6.size()][][];
            for (int i14 = i10; i14 < aSN1Sequence6.size(); i14++) {
                ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence6.getObjectAt(i14);
                bArr[i13][i14] = new byte[aSN1Sequence7.size()][];
                for (int i15 = 0; i15 < aSN1Sequence7.size(); i15++) {
                    bArr[i13][i14][i15] = ((ASN1OctetString) aSN1Sequence7.getObjectAt(i15)).getOctets();
                }
            }
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence5.getObjectAt(1);
            bArr2[i13] = new byte[aSN1Sequence8.size()][][];
            for (int i16 = 0; i16 < aSN1Sequence8.size(); i16++) {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) aSN1Sequence8.getObjectAt(i16);
                bArr2[i13][i16] = new byte[aSN1Sequence9.size()][];
                for (int i17 = 0; i17 < aSN1Sequence9.size(); i17++) {
                    bArr2[i13][i16][i17] = ((ASN1OctetString) aSN1Sequence9.getObjectAt(i17)).getOctets();
                }
            }
            ASN1Sequence aSN1Sequence10 = (ASN1Sequence) aSN1Sequence5.getObjectAt(2);
            bArr3[i13] = new byte[aSN1Sequence10.size()][];
            for (int i18 = 0; i18 < aSN1Sequence10.size(); i18++) {
                bArr3[i13][i18] = ((ASN1OctetString) aSN1Sequence10.getObjectAt(i18)).getOctets();
            }
            bArr4[i13] = ((ASN1OctetString) aSN1Sequence5.getObjectAt(3)).getOctets();
            i13++;
            i10 = 0;
        }
        byte[] bArr5 = rainbowPrivateKey.v0;
        int length = bArr5.length - 1;
        rainbowPrivateKey.f90923w0 = new Layer[length];
        int i19 = 0;
        while (i19 < length) {
            int i20 = i19 + 1;
            rainbowPrivateKey.f90923w0[i19] = new Layer(bArr5[i19], bArr5[i20], RainbowUtil.convertArray(bArr[i19]), RainbowUtil.convertArray(bArr2[i19]), RainbowUtil.convertArray(bArr3[i19]), RainbowUtil.convertArray(bArr4[i19]));
            i19 = i20;
        }
        return rainbowPrivateKey;
    }

    public short[] getB1() {
        return RainbowUtil.convertArray(this.f90920s0);
    }

    public short[] getB2() {
        return RainbowUtil.convertArray(this.f90922u0);
    }

    public short[][] getInvA1() {
        return RainbowUtil.convertArray(this.f90919r0);
    }

    public short[][] getInvA2() {
        return RainbowUtil.convertArray(this.f90921t0);
    }

    public Layer[] getLayers() {
        return this.f90923w0;
    }

    public ASN1Integer getVersion() {
        return this.f90917p0;
    }

    public int[] getVi() {
        return RainbowUtil.convertArraytoInt(this.v0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Encodable aSN1Encodable = this.f90917p0;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.f90918q0;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i10 = 0;
        while (true) {
            byte[][] bArr = this.f90919r0;
            if (i10 >= bArr.length) {
                break;
            }
            aSN1EncodableVector2.add(new DEROctetString(bArr[i10]));
            i10++;
        }
        ASN1EncodableVector aSN1EncodableVectorD = a.d(aSN1EncodableVector2, aSN1EncodableVector);
        aSN1EncodableVectorD.add(new DEROctetString(this.f90920s0));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVectorD));
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        int i11 = 0;
        while (true) {
            byte[][] bArr2 = this.f90921t0;
            if (i11 >= bArr2.length) {
                break;
            }
            aSN1EncodableVector3.add(new DEROctetString(bArr2[i11]));
            i11++;
        }
        ASN1EncodableVector aSN1EncodableVectorD2 = a.d(aSN1EncodableVector3, aSN1EncodableVector);
        aSN1EncodableVectorD2.add(new DEROctetString(this.f90922u0));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVectorD2));
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new DEROctetString(this.v0));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        int i12 = 0;
        while (true) {
            Layer[] layerArr = this.f90923w0;
            if (i12 >= layerArr.length) {
                aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector5));
                return new DERSequence(aSN1EncodableVector);
            }
            ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
            byte[][][] bArrConvertArray = RainbowUtil.convertArray(layerArr[i12].getCoeffAlpha());
            ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
            for (byte[][] bArr3 : bArrConvertArray) {
                ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
                int i13 = 0;
                while (true) {
                    if (i13 < bArr3.length) {
                        aSN1EncodableVector8.add(new DEROctetString(bArr3[i13]));
                        i13++;
                    }
                }
                aSN1EncodableVector7.add(new DERSequence(aSN1EncodableVector8));
            }
            aSN1EncodableVector6.add(new DERSequence(aSN1EncodableVector7));
            byte[][][] bArrConvertArray2 = RainbowUtil.convertArray(layerArr[i12].getCoeffBeta());
            ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
            for (byte[][] bArr4 : bArrConvertArray2) {
                ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                int i14 = 0;
                while (true) {
                    if (i14 < bArr4.length) {
                        aSN1EncodableVector10.add(new DEROctetString(bArr4[i14]));
                        i14++;
                    }
                }
                aSN1EncodableVector9.add(new DERSequence(aSN1EncodableVector10));
            }
            aSN1EncodableVector6.add(new DERSequence(aSN1EncodableVector9));
            byte[][] bArrConvertArray3 = RainbowUtil.convertArray(layerArr[i12].getCoeffGamma());
            ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
            for (byte[] bArr5 : bArrConvertArray3) {
                aSN1EncodableVector11.add(new DEROctetString(bArr5));
            }
            aSN1EncodableVector6.add(new DERSequence(aSN1EncodableVector11));
            aSN1EncodableVector6.add(new DEROctetString(RainbowUtil.convertArray(layerArr[i12].getCoeffEta())));
            aSN1EncodableVector5.add(new DERSequence(aSN1EncodableVector6));
            i12++;
        }
    }
}
