package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short[][][] f91218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final short[][][] f91219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final short[][] f91220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final short[] f91221g;

    public Layer(byte b10, byte b11, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i10 = b10 & 255;
        this.f91215a = i10;
        int i11 = b11 & 255;
        this.f91216b = i11;
        this.f91217c = i11 - i10;
        this.f91218d = sArr;
        this.f91219e = sArr2;
        this.f91220f = sArr3;
        this.f91221g = sArr4;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Layer)) {
            return false;
        }
        Layer layer = (Layer) obj;
        return this.f91215a == layer.getVi() && this.f91216b == layer.getViNext() && this.f91217c == layer.getOi() && RainbowUtil.equals(this.f91218d, layer.getCoeffAlpha()) && RainbowUtil.equals(this.f91219e, layer.getCoeffBeta()) && RainbowUtil.equals(this.f91220f, layer.getCoeffGamma()) && RainbowUtil.equals(this.f91221g, layer.getCoeffEta());
    }

    public short[][][] getCoeffAlpha() {
        return this.f91218d;
    }

    public short[][][] getCoeffBeta() {
        return this.f91219e;
    }

    public short[] getCoeffEta() {
        return this.f91221g;
    }

    public short[][] getCoeffGamma() {
        return this.f91220f;
    }

    public int getOi() {
        return this.f91217c;
    }

    public int getVi() {
        return this.f91215a;
    }

    public int getViNext() {
        return this.f91216b;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91221g) + ((Arrays.hashCode(this.f91220f) + ((Arrays.hashCode(this.f91219e) + ((Arrays.hashCode(this.f91218d) + (((((this.f91215a * 37) + this.f91216b) * 37) + this.f91217c) * 37)) * 37)) * 37)) * 37);
    }

    public short[][] plugInVinegars(short[] sArr) {
        int i10;
        short[][] sArr2;
        int i11 = this.f91217c;
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11, i11 + 1);
        short[] sArr4 = new short[i11];
        int i12 = 0;
        while (true) {
            i10 = this.f91215a;
            if (i12 >= i11) {
                break;
            }
            for (int i13 = 0; i13 < i10; i13++) {
                for (int i14 = 0; i14 < i10; i14++) {
                    sArr4[i12] = GF2Field.addElem(sArr4[i12], GF2Field.multElem(GF2Field.multElem(this.f91219e[i12][i13][i14], sArr[i13]), sArr[i14]));
                }
            }
            i12++;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i11; i16++) {
                for (int i17 = 0; i17 < i10; i17++) {
                    short sMultElem = GF2Field.multElem(this.f91218d[i15][i16][i17], sArr[i17]);
                    short[] sArr5 = sArr3[i15];
                    sArr5[i16] = GF2Field.addElem(sArr5[i16], sMultElem);
                }
            }
        }
        int i18 = 0;
        while (true) {
            sArr2 = this.f91220f;
            if (i18 >= i11) {
                break;
            }
            for (int i19 = 0; i19 < i10; i19++) {
                sArr4[i18] = GF2Field.addElem(sArr4[i18], GF2Field.multElem(sArr2[i18][i19], sArr[i19]));
            }
            i18++;
        }
        for (int i20 = 0; i20 < i11; i20++) {
            for (int i21 = i10; i21 < this.f91216b; i21++) {
                short[] sArr6 = sArr3[i20];
                sArr6[i21 - i10] = GF2Field.addElem(sArr2[i20][i21], sArr6[i21 - i10]);
            }
        }
        for (int i22 = 0; i22 < i11; i22++) {
            sArr4[i22] = GF2Field.addElem(sArr4[i22], this.f91221g[i22]);
        }
        for (int i23 = 0; i23 < i11; i23++) {
            sArr3[i23][i11] = sArr4[i23];
        }
        return sArr3;
    }

    public Layer(int i10, int i11, SecureRandom secureRandom) {
        this.f91215a = i10;
        this.f91216b = i11;
        int i12 = i11 - i10;
        this.f91217c = i12;
        Class cls = Short.TYPE;
        this.f91218d = (short[][][]) Array.newInstance((Class<?>) cls, i12, i12, i10);
        this.f91219e = (short[][][]) Array.newInstance((Class<?>) cls, i12, i10, i10);
        this.f91220f = (short[][]) Array.newInstance((Class<?>) cls, i12, i11);
        this.f91221g = new short[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < this.f91217c; i14++) {
                for (int i15 = 0; i15 < this.f91215a; i15++) {
                    this.f91218d[i13][i14][i15] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < this.f91215a; i17++) {
                for (int i18 = 0; i18 < this.f91215a; i18++) {
                    this.f91219e[i16][i17][i18] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i19 = 0; i19 < i12; i19++) {
            for (int i20 = 0; i20 < this.f91216b; i20++) {
                this.f91220f[i19][i20] = (short) (secureRandom.nextInt() & 255);
            }
        }
        for (int i21 = 0; i21 < i12; i21++) {
            this.f91221g[i21] = (short) (secureRandom.nextInt() & 255);
        }
    }
}
