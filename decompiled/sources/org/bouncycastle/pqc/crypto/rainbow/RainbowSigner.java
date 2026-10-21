package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowSigner implements MessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f91247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short[] f91249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComputeInField f91250d = new ComputeInField();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RainbowKeyParameters f91251e;

    public final short[] a(Layer[] layerArr, short[] sArr) {
        short[] sArr2 = new short[sArr.length];
        short[] b10 = ((RainbowPrivateKeyParameters) this.f91251e).getB1();
        ComputeInField computeInField = this.f91250d;
        short[] sArrMultiplyMatrix = computeInField.multiplyMatrix(((RainbowPrivateKeyParameters) this.f91251e).getInvA1(), computeInField.addVect(b10, sArr));
        for (int i10 = 0; i10 < layerArr[0].getVi(); i10++) {
            this.f91249c[i10] = (short) this.f91247a.nextInt();
            short[] sArr3 = this.f91249c;
            sArr3[i10] = (short) (sArr3[i10] & 255);
        }
        return sArrMultiplyMatrix;
    }

    public final short[] b(byte[] bArr) {
        int i10 = this.f91248b;
        short[] sArr = new short[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            short s4 = bArr[i12];
            sArr[i11] = s4;
            sArr[i11] = (short) (s4 & 255);
            i12++;
            i11++;
            if (i11 >= i10) {
                break;
            }
        }
        return sArr;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        Layer[] layers = ((RainbowPrivateKeyParameters) this.f91251e).getLayers();
        int length = layers.length;
        this.f91249c = new short[((RainbowPrivateKeyParameters) this.f91251e).getInvA2().length];
        int viNext = layers[length - 1].getViNext();
        byte[] bArr2 = new byte[viNext];
        short[] sArrB = b(bArr);
        int i10 = 0;
        do {
            try {
                short[] sArrA = a(layers, sArrB);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    ComputeInField computeInField = this.f91250d;
                    if (i11 >= length) {
                        short[] sArrMultiplyMatrix = computeInField.multiplyMatrix(((RainbowPrivateKeyParameters) this.f91251e).getInvA2(), computeInField.addVect(((RainbowPrivateKeyParameters) this.f91251e).getB2(), this.f91249c));
                        for (int i13 = 0; i13 < viNext; i13++) {
                            bArr2[i13] = (byte) sArrMultiplyMatrix[i13];
                        }
                        break;
                    }
                    short[] sArr = new short[layers[i11].getOi()];
                    short[] sArr2 = new short[layers[i11].getOi()];
                    for (int i14 = 0; i14 < layers[i11].getOi(); i14++) {
                        sArr[i14] = sArrA[i12];
                        i12++;
                    }
                    short[] sArrSolveEquation = computeInField.solveEquation(layers[i11].plugInVinegars(this.f91249c), sArr);
                    if (sArrSolveEquation == null) {
                        throw new Exception("LES is not solveable!");
                    }
                    for (int i15 = 0; i15 < sArrSolveEquation.length; i15++) {
                        this.f91249c[layers[i11].getVi() + i15] = sArrSolveEquation[i15];
                    }
                    i11++;
                }
            } catch (Exception unused) {
                i10++;
            }
        } while (i10 < 65536);
        if (i10 != 65536) {
            return bArr2;
        }
        throw new IllegalStateException("unable to generate signature - LES not solvable");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        RainbowKeyParameters rainbowKeyParameters;
        if (z10) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.f91247a = parametersWithRandom.getRandom();
                this.f91251e = (RainbowPrivateKeyParameters) parametersWithRandom.getParameters();
            } else {
                this.f91247a = CryptoServicesRegistrar.getSecureRandom();
                rainbowKeyParameters = (RainbowPrivateKeyParameters) cipherParameters;
            }
            this.f91248b = this.f91251e.getDocLength();
        }
        rainbowKeyParameters = (RainbowPublicKeyParameters) cipherParameters;
        this.f91251e = rainbowKeyParameters;
        this.f91248b = this.f91251e.getDocLength();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArr = new short[bArr2.length];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            sArr[i11] = (short) (bArr2[i11] & 255);
        }
        short[] sArrB = b(bArr);
        short[][] coeffQuadratic = ((RainbowPublicKeyParameters) this.f91251e).getCoeffQuadratic();
        short[][] coeffSingular = ((RainbowPublicKeyParameters) this.f91251e).getCoeffSingular();
        short[] coeffScalar = ((RainbowPublicKeyParameters) this.f91251e).getCoeffScalar();
        int length = coeffQuadratic.length;
        short[] sArr2 = new short[length];
        int length2 = coeffSingular[0].length;
        int i12 = 0;
        while (i12 < coeffQuadratic.length) {
            int i13 = i10;
            int i14 = i13;
            while (i13 < length2) {
                for (int i15 = i13; i15 < length2; i15++) {
                    sArr2[i12] = GF2Field.addElem(sArr2[i12], GF2Field.multElem(coeffQuadratic[i12][i14], GF2Field.multElem(sArr[i13], sArr[i15])));
                    i14++;
                }
                sArr2[i12] = GF2Field.addElem(sArr2[i12], GF2Field.multElem(coeffSingular[i12][i13], sArr[i13]));
                i13++;
            }
            sArr2[i12] = GF2Field.addElem(sArr2[i12], coeffScalar[i12]);
            i12++;
            i10 = 0;
        }
        if (sArrB.length != length) {
            return false;
        }
        boolean z10 = true;
        for (int i16 = 0; i16 < sArrB.length; i16++) {
            z10 = z10 && sArrB[i16] == sArr2[i16];
        }
        return z10;
    }
}
