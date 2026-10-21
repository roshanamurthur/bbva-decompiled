package org.bouncycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GMSSRandom f90964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f90965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[][] f90966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[][] f90967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[][] f90968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GMSSDigestProvider f90969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f90970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f90971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f90972i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GMSSParameters f90973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f90974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f90975l;
    public int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GMSSKeyGenerationParameters f90976n;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.f90969f = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.f90965b = digest;
        this.f90970g = digest.getDigestSize();
        this.f90964a = new GMSSRandom(digest);
    }

    public final GMSSRootCalc a(byte[] bArr, Vector vector, byte[] bArr2, int i10) {
        byte[] bArrVerify;
        int i11 = this.f90970g;
        byte[] bArr3 = new byte[i11];
        byte[] bArr4 = new byte[i11];
        GMSSRandom gMSSRandom = this.f90964a;
        byte[] bArrNextSeed = gMSSRandom.nextSeed(bArr2);
        int i12 = this.f90974k[i10];
        int i13 = this.m[i10];
        GMSSDigestProvider gMSSDigestProvider = this.f90969f;
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(i12, i13, gMSSDigestProvider);
        gMSSRootCalc.initialize(vector);
        if (i10 == this.f90971h - 1) {
            bArrVerify = new WinternitzOTSignature(bArrNextSeed, gMSSDigestProvider.get(), this.f90975l[i10]).getPublicKey();
        } else {
            this.f90968e[i10] = new WinternitzOTSignature(bArrNextSeed, gMSSDigestProvider.get(), this.f90975l[i10]).getSignature(bArr);
            bArrVerify = new WinternitzOTSVerify(gMSSDigestProvider.get(), this.f90975l[i10]).Verify(bArr, this.f90968e[i10]);
        }
        gMSSRootCalc.update(bArrVerify);
        int i14 = 3;
        int i15 = 0;
        int i16 = 1;
        while (true) {
            int i17 = this.f90974k[i10];
            if (i16 >= (1 << i17)) {
                break;
            }
            if (i16 == i14 && i15 < i17 - this.m[i10]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i15);
                i14 *= 2;
                i15++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(gMSSRandom.nextSeed(bArr2), gMSSDigestProvider.get(), this.f90975l[i10]).getPublicKey());
            i16++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int i10;
        int i11;
        int i12;
        byte[][] bArr;
        if (!this.f90972i) {
            initialize(new GMSSKeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
        }
        int i13 = this.f90971h;
        byte[][][] bArr2 = new byte[i13][][];
        int i14 = i13 - 1;
        byte[][][] bArr3 = new byte[i14][][];
        Treehash[][] treehashArr = new Treehash[i13][];
        Treehash[][] treehashArr2 = new Treehash[i14][];
        Vector[] vectorArr = new Vector[i13];
        Vector[] vectorArr2 = new Vector[i14];
        Vector[][] vectorArr3 = new Vector[i13][];
        Vector[][] vectorArr4 = new Vector[i14][];
        int i15 = 0;
        while (true) {
            i10 = this.f90971h;
            i11 = this.f90970g;
            if (i15 >= i10) {
                break;
            }
            int[] iArr = {this.f90974k[i15], i11};
            Class cls = Byte.TYPE;
            bArr2[i15] = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
            int i16 = this.f90974k[i15];
            treehashArr[i15] = new Treehash[i16 - this.m[i15]];
            if (i15 > 0) {
                int i17 = i15 - 1;
                bArr3[i17] = (byte[][]) Array.newInstance((Class<?>) cls, i16, i11);
                treehashArr2[i17] = new Treehash[this.f90974k[i15] - this.m[i15]];
            }
            vectorArr[i15] = new Vector();
            if (i15 > 0) {
                vectorArr2[i15 - 1] = new Vector();
            }
            i15++;
        }
        Class cls2 = Byte.TYPE;
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls2, i10, i11);
        int i18 = 1;
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) cls2, this.f90971h - 1, i11);
        byte[][] bArr6 = (byte[][]) Array.newInstance((Class<?>) cls2, this.f90971h, i11);
        int i19 = 0;
        while (true) {
            i12 = this.f90971h;
            if (i19 >= i12) {
                break;
            }
            System.arraycopy(this.f90966c[i19], 0, bArr6[i19], 0, i11);
            i19++;
            i18 = 1;
        }
        int i20 = i18;
        this.f90968e = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12 - i20, i11);
        int i21 = this.f90971h - i20;
        while (i21 >= 0) {
            GMSSRootCalc gMSSRootCalcA = i21 == this.f90971h - i20 ? a(null, vectorArr[i21], bArr6[i21], i21) : a(bArr4[i21 + 1], vectorArr[i21], bArr6[i21], i21);
            int i22 = 0;
            while (i22 < this.f90974k[i21]) {
                System.arraycopy(gMSSRootCalcA.getAuthPath()[i22], 0, bArr2[i21][i22], 0, i11);
                i22++;
                bArr2 = bArr2;
                vectorArr = vectorArr;
            }
            vectorArr3[i21] = gMSSRootCalcA.getRetain();
            treehashArr[i21] = gMSSRootCalcA.getTreehash();
            System.arraycopy(gMSSRootCalcA.getRoot(), 0, bArr4[i21], 0, i11);
            i21--;
            bArr2 = bArr2;
            i20 = 1;
        }
        byte[][][] bArr7 = bArr2;
        Vector[] vectorArr5 = vectorArr;
        int i23 = this.f90971h - 2;
        while (i23 >= 0) {
            Vector vector = vectorArr2[i23];
            int i24 = i23 + 1;
            byte[] bArr8 = bArr6[i24];
            byte[] bArr9 = new byte[this.f90971h];
            int i25 = this.f90974k[i24];
            Vector[][] vectorArr6 = vectorArr3;
            int i26 = this.m[i24];
            Vector[] vectorArr7 = vectorArr2;
            GMSSDigestProvider gMSSDigestProvider = this.f90969f;
            GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(i25, i26, gMSSDigestProvider);
            gMSSRootCalc.initialize(vector);
            Treehash[][] treehashArr3 = treehashArr;
            int i27 = 0;
            int i28 = 0;
            int i29 = 3;
            while (true) {
                int i30 = this.f90974k[i24];
                bArr = bArr4;
                if (i27 >= (1 << i30)) {
                    break;
                }
                if (i27 == i29 && i28 < i30 - this.m[i24]) {
                    gMSSRootCalc.initializeTreehashSeed(bArr8, i28);
                    i29 *= 2;
                    i28++;
                }
                gMSSRootCalc.update(new WinternitzOTSignature(this.f90964a.nextSeed(bArr8), gMSSDigestProvider.get(), this.f90975l[i24]).getPublicKey());
                i27++;
                bArr4 = bArr;
                bArr8 = bArr8;
                gMSSDigestProvider = gMSSDigestProvider;
            }
            if (!gMSSRootCalc.wasFinished()) {
                System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
                gMSSRootCalc = null;
            }
            for (int i31 = 0; i31 < this.f90974k[i24]; i31++) {
                System.arraycopy(gMSSRootCalc.getAuthPath()[i31], 0, bArr3[i23][i31], 0, i11);
            }
            vectorArr4[i23] = gMSSRootCalc.getRetain();
            treehashArr2[i23] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr5[i23], 0, i11);
            System.arraycopy(bArr6[i24], 0, this.f90967d[i23], 0, i11);
            i23--;
            vectorArr3 = vectorArr6;
            vectorArr2 = vectorArr7;
            treehashArr = treehashArr3;
            bArr4 = bArr;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr4[0], this.f90973j), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.f90966c, this.f90967d, bArr7, bArr3, treehashArr, treehashArr2, vectorArr5, vectorArr2, vectorArr3, vectorArr4, bArr5, this.f90968e, this.f90973j, this.f90969f));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(int i10, SecureRandom secureRandom) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters;
        if (i10 <= 10) {
            gMSSKeyGenerationParameters = new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2}));
        } else {
            gMSSKeyGenerationParameters = i10 <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2}));
        }
        initialize(gMSSKeyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.f90976n = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.f90976n.getParameters().getHeightOfTrees(), this.f90976n.getParameters().getWinternitzParameter(), this.f90976n.getParameters().getK());
        this.f90973j = gMSSParameters;
        this.f90971h = gMSSParameters.getNumOfLayers();
        this.f90974k = this.f90973j.getHeightOfTrees();
        this.f90975l = this.f90973j.getWinternitzParameter();
        this.m = this.f90973j.getK();
        int i10 = this.f90971h;
        int i11 = this.f90970g;
        Class cls = Byte.TYPE;
        this.f90966c = (byte[][]) Array.newInstance((Class<?>) cls, i10, i11);
        this.f90967d = (byte[][]) Array.newInstance((Class<?>) cls, this.f90971h - 1, i11);
        SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
        for (int i12 = 0; i12 < this.f90971h; i12++) {
            secureRandom.nextBytes(this.f90966c[i12]);
            this.f90964a.nextSeed(this.f90966c[i12]);
        }
        this.f90972i = true;
    }
}
