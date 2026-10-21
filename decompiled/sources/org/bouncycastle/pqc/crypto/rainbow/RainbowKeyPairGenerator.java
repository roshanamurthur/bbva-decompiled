package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f91223a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f91224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RainbowKeyGenerationParameters f91225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short[][] f91226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short[][] f91227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f91228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public short[][] f91229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public short[][] f91230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public short[] f91231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f91232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Layer[] f91233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f91234l;
    public short[][] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[][] f91235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public short[] f91236o;

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.f91223a) {
            initialize(new RainbowKeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new RainbowParameters()));
        }
        int[] iArr = this.f91234l;
        int i10 = 0;
        int i11 = iArr[iArr.length - 1] - iArr[0];
        this.f91226d = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i11);
        this.f91227e = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.f91227e == null) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    this.f91226d[i12][i13] = (short) (this.f91224b.nextInt() & 255);
                }
            }
            this.f91227e = computeInField.inverse(this.f91226d);
        }
        this.f91228f = new short[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.f91228f[i14] = (short) (this.f91224b.nextInt() & 255);
        }
        int[] iArr2 = this.f91234l;
        int i15 = iArr2[iArr2.length - 1];
        this.f91229g = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i15, i15);
        this.f91230h = null;
        ComputeInField computeInField2 = new ComputeInField();
        while (this.f91230h == null) {
            for (int i16 = 0; i16 < i15; i16++) {
                for (int i17 = 0; i17 < i15; i17++) {
                    this.f91229g[i16][i17] = (short) (this.f91224b.nextInt() & 255);
                }
            }
            this.f91230h = computeInField2.inverse(this.f91229g);
        }
        this.f91231i = new short[i15];
        for (int i18 = 0; i18 < i15; i18++) {
            this.f91231i[i18] = (short) (this.f91224b.nextInt() & 255);
        }
        this.f91233k = new Layer[this.f91232j];
        int i19 = 0;
        while (i19 < this.f91232j) {
            Layer[] layerArr = this.f91233k;
            int[] iArr3 = this.f91234l;
            int i20 = i19 + 1;
            layerArr[i19] = new Layer(iArr3[i19], iArr3[i20], this.f91224b);
            i19 = i20;
        }
        ComputeInField computeInField3 = new ComputeInField();
        int[] iArr4 = this.f91234l;
        int i21 = iArr4[iArr4.length - 1] - iArr4[0];
        int i22 = iArr4[iArr4.length - 1];
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i21, i22, i22);
        this.f91235n = (short[][]) Array.newInstance((Class<?>) cls, i21, i22);
        this.f91236o = new short[i21];
        short[] sArr2 = new short[i22];
        int i23 = 0;
        int i24 = 0;
        while (true) {
            Layer[] layerArr2 = this.f91233k;
            if (i23 >= layerArr2.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr2[i23].getCoeffAlpha();
            short[][][] coeffBeta = this.f91233k[i23].getCoeffBeta();
            short[][] coeffGamma = this.f91233k[i23].getCoeffGamma();
            short[] coeffEta = this.f91233k[i23].getCoeffEta();
            int length = coeffAlpha[i10].length;
            int length2 = coeffBeta[i10].length;
            int i25 = i10;
            while (i25 < length) {
                int i26 = i10;
                while (i26 < length) {
                    while (i10 < length2) {
                        int i27 = i22;
                        int i28 = i21;
                        int i29 = i26 + length2;
                        short[] sArrMultVect = computeInField3.multVect(coeffAlpha[i25][i26][i10], this.f91229g[i29]);
                        int i30 = i24 + i25;
                        int i31 = i23;
                        sArr[i30] = computeInField3.addSquareMatrix(sArr[i30], computeInField3.multVects(sArrMultVect, this.f91229g[i10]));
                        short[] sArrMultVect2 = computeInField3.multVect(this.f91231i[i10], sArrMultVect);
                        short[][] sArr3 = this.f91235n;
                        sArr3[i30] = computeInField3.addVect(sArrMultVect2, sArr3[i30]);
                        short[] sArrMultVect3 = computeInField3.multVect(this.f91231i[i29], computeInField3.multVect(coeffAlpha[i25][i26][i10], this.f91229g[i10]));
                        short[][] sArr4 = this.f91235n;
                        sArr4[i30] = computeInField3.addVect(sArrMultVect3, sArr4[i30]);
                        short sMultElem = GF2Field.multElem(coeffAlpha[i25][i26][i10], this.f91231i[i29]);
                        short[] sArr5 = this.f91236o;
                        sArr5[i30] = GF2Field.addElem(sArr5[i30], GF2Field.multElem(sMultElem, this.f91231i[i10]));
                        i10++;
                        i21 = i28;
                        i22 = i27;
                        coeffAlpha = coeffAlpha;
                        i23 = i31;
                        coeffEta = coeffEta;
                    }
                    i26++;
                    i10 = 0;
                }
                int i32 = i22;
                int i33 = i21;
                int i34 = i23;
                short[][][] sArr6 = coeffAlpha;
                short[] sArr7 = coeffEta;
                for (int i35 = 0; i35 < length2; i35++) {
                    for (int i36 = 0; i36 < length2; i36++) {
                        short[] sArrMultVect4 = computeInField3.multVect(coeffBeta[i25][i35][i36], this.f91229g[i35]);
                        int i37 = i24 + i25;
                        sArr[i37] = computeInField3.addSquareMatrix(sArr[i37], computeInField3.multVects(sArrMultVect4, this.f91229g[i36]));
                        short[] sArrMultVect5 = computeInField3.multVect(this.f91231i[i36], sArrMultVect4);
                        short[][] sArr8 = this.f91235n;
                        sArr8[i37] = computeInField3.addVect(sArrMultVect5, sArr8[i37]);
                        short[] sArrMultVect6 = computeInField3.multVect(this.f91231i[i35], computeInField3.multVect(coeffBeta[i25][i35][i36], this.f91229g[i36]));
                        short[][] sArr9 = this.f91235n;
                        sArr9[i37] = computeInField3.addVect(sArrMultVect6, sArr9[i37]);
                        short sMultElem2 = GF2Field.multElem(coeffBeta[i25][i35][i36], this.f91231i[i35]);
                        short[] sArr10 = this.f91236o;
                        sArr10[i37] = GF2Field.addElem(sArr10[i37], GF2Field.multElem(sMultElem2, this.f91231i[i36]));
                    }
                }
                for (int i38 = 0; i38 < length2 + length; i38++) {
                    short[] sArrMultVect7 = computeInField3.multVect(coeffGamma[i25][i38], this.f91229g[i38]);
                    short[][] sArr11 = this.f91235n;
                    int i39 = i24 + i25;
                    sArr11[i39] = computeInField3.addVect(sArrMultVect7, sArr11[i39]);
                    short[] sArr12 = this.f91236o;
                    sArr12[i39] = GF2Field.addElem(sArr12[i39], GF2Field.multElem(coeffGamma[i25][i38], this.f91231i[i38]));
                }
                short[] sArr13 = this.f91236o;
                int i40 = i24 + i25;
                sArr13[i40] = GF2Field.addElem(sArr13[i40], sArr7[i25]);
                i25++;
                i21 = i33;
                i22 = i32;
                coeffAlpha = sArr6;
                i23 = i34;
                coeffEta = sArr7;
                i10 = 0;
            }
            i24 += length;
            i23++;
            i10 = 0;
        }
        Class cls2 = Short.TYPE;
        short[][][] sArr14 = (short[][][]) Array.newInstance((Class<?>) cls2, i21, i22, i22);
        short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) cls2, i21, i22);
        short[] sArr16 = new short[i21];
        for (int i41 = 0; i41 < i21; i41++) {
            int i42 = 0;
            while (true) {
                short[][] sArr17 = this.f91226d;
                if (i42 < sArr17.length) {
                    sArr14[i41] = computeInField3.addSquareMatrix(sArr14[i41], computeInField3.multMatrix(sArr17[i41][i42], sArr[i42]));
                    sArr15[i41] = computeInField3.addVect(sArr15[i41], computeInField3.multVect(this.f91226d[i41][i42], this.f91235n[i42]));
                    sArr16[i41] = GF2Field.addElem(sArr16[i41], GF2Field.multElem(this.f91226d[i41][i42], this.f91236o[i42]));
                    i42++;
                }
            }
            sArr16[i41] = GF2Field.addElem(sArr16[i41], this.f91228f[i41]);
        }
        this.f91235n = sArr15;
        this.f91236o = sArr16;
        int length3 = sArr14.length;
        int length4 = sArr14[0].length;
        this.m = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length3, ((length4 + 1) * length4) / 2);
        for (int i43 = 0; i43 < length3; i43++) {
            int i44 = 0;
            for (int i45 = 0; i45 < length4; i45++) {
                for (int i46 = i45; i46 < length4; i46++) {
                    short[][] sArr18 = this.m;
                    if (i46 == i45) {
                        sArr18[i43][i44] = sArr14[i43][i45][i46];
                    } else {
                        short[] sArr19 = sArr18[i43];
                        short[][] sArr20 = sArr14[i43];
                        sArr19[i44] = GF2Field.addElem(sArr20[i45][i46], sArr20[i46][i45]);
                    }
                    i44++;
                }
            }
        }
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.f91227e, this.f91228f, this.f91230h, this.f91231i, this.f91234l, this.f91233k);
        int[] iArr5 = this.f91234l;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr5[iArr5.length - 1] - iArr5[0], this.m, this.f91235n, this.f91236o), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        RainbowKeyGenerationParameters rainbowKeyGenerationParameters = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.f91225c = rainbowKeyGenerationParameters;
        this.f91224b = rainbowKeyGenerationParameters.getRandom();
        this.f91234l = this.f91225c.getParameters().getVi();
        this.f91232j = this.f91225c.getParameters().getNumOfLayers();
        this.f91223a = true;
    }
}
