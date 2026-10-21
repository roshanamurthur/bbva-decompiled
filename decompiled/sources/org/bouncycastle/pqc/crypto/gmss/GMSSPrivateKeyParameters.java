package org.bouncycastle.pqc.crypto.gmss;

import androidx.collection.k;
import java.lang.reflect.Array;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSPrivateKeyParameters extends GMSSKeyParameters {
    public Vector[] E0;
    public Vector[][] F0;
    public Vector[][] G0;
    public byte[][][] H0;
    public GMSSLeaf[] I0;
    public GMSSLeaf[] J0;
    public GMSSLeaf[] K0;
    public int[] L0;
    public GMSSParameters M0;
    public byte[][] N0;
    public GMSSRootCalc[] O0;
    public byte[][] P0;
    public GMSSRootSig[] Q0;
    public GMSSDigestProvider R0;
    public boolean S0;
    public int[] T0;
    public int[] U0;
    public int[] V0;
    public int W0;
    public Digest X0;
    public int Y0;
    public GMSSRandom Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int[] f90994a1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int[] f90995r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[][] f90996s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[][] f90997t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[][][] f90998u0;
    public byte[][][] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Treehash[][] f90999w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Treehash[][] f91000x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Vector[] f91001y0;

    public GMSSPrivateKeyParameters(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        super(true, gMSSParameters);
        this.S0 = false;
        Digest digest = gMSSDigestProvider.get();
        this.X0 = digest;
        this.Y0 = digest.getDigestSize();
        this.M0 = gMSSParameters;
        this.U0 = gMSSParameters.getWinternitzParameter();
        this.V0 = gMSSParameters.getK();
        this.T0 = gMSSParameters.getHeightOfTrees();
        int numOfLayers = gMSSParameters.getNumOfLayers();
        this.W0 = numOfLayers;
        if (iArr == null) {
            this.f90995r0 = new int[numOfLayers];
            for (int i10 = 0; i10 < this.W0; i10++) {
                this.f90995r0[i10] = 0;
            }
        } else {
            this.f90995r0 = iArr;
        }
        this.f90996s0 = bArr;
        this.f90997t0 = bArr2;
        this.f90998u0 = Arrays.clone(bArr3);
        this.v0 = bArr4;
        int i11 = 2;
        if (bArr5 == null) {
            this.H0 = new byte[this.W0][][];
            int i12 = 0;
            while (i12 < this.W0) {
                this.H0[i12] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, (int) Math.floor(this.T0[i12] / i11), this.Y0);
                i12++;
                i11 = 2;
            }
        } else {
            this.H0 = bArr5;
        }
        if (vectorArr == null) {
            this.f91001y0 = new Vector[this.W0];
            for (int i13 = 0; i13 < this.W0; i13++) {
                this.f91001y0[i13] = new Vector();
            }
        } else {
            this.f91001y0 = vectorArr;
        }
        if (vectorArr2 == null) {
            this.E0 = new Vector[this.W0 - 1];
            int i14 = 0;
            for (int i15 = 1; i14 < this.W0 - i15; i15 = 1) {
                this.E0[i14] = new Vector();
                i14++;
            }
        } else {
            this.E0 = vectorArr2;
        }
        this.f90999w0 = treehashArr;
        this.f91000x0 = treehashArr2;
        this.F0 = vectorArr3;
        this.G0 = vectorArr4;
        this.N0 = bArr6;
        this.R0 = gMSSDigestProvider;
        if (gMSSRootCalcArr == null) {
            this.O0 = new GMSSRootCalc[this.W0 - 1];
            int i16 = 0;
            for (int i17 = 1; i16 < this.W0 - i17; i17 = 1) {
                int i18 = i16 + 1;
                this.O0[i16] = new GMSSRootCalc(this.T0[i18], this.V0[i18], this.R0);
                i16 = i18;
            }
        } else {
            this.O0 = gMSSRootCalcArr;
        }
        this.P0 = bArr7;
        this.f90994a1 = new int[this.W0];
        for (int i19 = 0; i19 < this.W0; i19++) {
            this.f90994a1[i19] = 1 << this.T0[i19];
        }
        this.Z0 = new GMSSRandom(this.X0);
        int i20 = this.W0;
        if (i20 <= 1) {
            this.I0 = new GMSSLeaf[0];
        } else if (gMSSLeafArr == null) {
            this.I0 = new GMSSLeaf[i20 - 2];
            int i21 = 0;
            for (int i22 = 2; i21 < this.W0 - i22; i22 = 2) {
                int i23 = i21 + 1;
                this.I0[i21] = new GMSSLeaf(gMSSDigestProvider.get(), this.U0[i23], this.f90994a1[i21 + 2], this.f90997t0[i21]);
                i21 = i23;
            }
        } else {
            this.I0 = gMSSLeafArr;
        }
        if (gMSSLeafArr2 == null) {
            this.J0 = new GMSSLeaf[this.W0 - 1];
            int i24 = 0;
            for (int i25 = 1; i24 < this.W0 - i25; i25 = 1) {
                int i26 = i24 + 1;
                this.J0[i24] = new GMSSLeaf(gMSSDigestProvider.get(), this.U0[i24], this.f90994a1[i26], this.f90996s0[i24]);
                i24 = i26;
            }
        } else {
            this.J0 = gMSSLeafArr2;
        }
        if (gMSSLeafArr3 == null) {
            this.K0 = new GMSSLeaf[this.W0 - 1];
            int i27 = 0;
            for (int i28 = 1; i27 < this.W0 - i28; i28 = 1) {
                GMSSLeaf[] gMSSLeafArr4 = this.K0;
                Digest digest2 = gMSSDigestProvider.get();
                int i29 = this.U0[i27];
                int i30 = i27 + 1;
                int i31 = this.f90994a1[i30];
                GMSSLeaf gMSSLeaf = new GMSSLeaf();
                gMSSLeaf.f90987j = i29;
                gMSSLeaf.f90978a = digest2;
                gMSSLeaf.f90981d = new GMSSRandom(digest2);
                int digestSize = digest2.getDigestSize();
                gMSSLeaf.f90979b = digestSize;
                double d2 = i29;
                int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d2);
                int i32 = 2;
                int i33 = 1;
                while (i32 < (iCeil << i29) + 1) {
                    i32 <<= 1;
                    i33++;
                }
                int iCeil2 = iCeil + ((int) Math.ceil(((double) i33) / d2));
                gMSSLeaf.f90980c = iCeil2;
                int i34 = 1 << i29;
                gMSSLeaf.f90986i = i34;
                gMSSLeaf.f90988k = (int) Math.ceil(((double) ((((i34 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i31));
                gMSSLeaf.f90989l = new byte[digestSize];
                gMSSLeaf.f90982e = new byte[digestSize];
                gMSSLeaf.m = new byte[digestSize];
                gMSSLeaf.f90983f = new byte[digestSize * iCeil2];
                gMSSLeafArr4[i27] = gMSSLeaf;
                i27 = i30;
            }
        } else {
            this.K0 = gMSSLeafArr3;
        }
        if (iArr2 == null) {
            this.L0 = new int[this.W0 - 1];
            int i35 = 0;
            for (int i36 = 1; i35 < this.W0 - i36; i36 = 1) {
                this.L0[i35] = -1;
                i35++;
            }
        } else {
            this.L0 = iArr2;
        }
        int i37 = this.Y0;
        byte[] bArr8 = new byte[i37];
        byte[] bArr9 = new byte[i37];
        if (gMSSRootSigArr != null) {
            this.Q0 = gMSSRootSigArr;
            return;
        }
        this.Q0 = new GMSSRootSig[this.W0 - 1];
        int i38 = 0;
        while (i38 < this.W0 - 1) {
            System.arraycopy(bArr[i38], 0, bArr8, 0, this.Y0);
            this.Z0.nextSeed(bArr8);
            byte[] bArrNextSeed = this.Z0.nextSeed(bArr8);
            int i39 = i38 + 1;
            this.Q0[i38] = new GMSSRootSig(gMSSDigestProvider.get(), this.U0[i38], this.T0[i39]);
            this.Q0[i38].initSign(bArrNextSeed, bArr6[i38]);
            i38 = i39;
        }
    }

    public final int a(int i10) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.T0[i10] - this.V0[i10]; i12++) {
            Treehash[][] treehashArr = this.f90999w0;
            if (treehashArr[i10][i12].wasInitialized() && !treehashArr[i10][i12].wasFinished() && (i11 == -1 || treehashArr[i10][i12].getLowestNodeHeight() < treehashArr[i10][i11].getLowestNodeHeight())) {
                i11 = i12;
            }
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a5  */
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        byte[] publicKey;
        int i14;
        int i15 = this.W0;
        int i16 = i15 - 1;
        int[] iArr = this.f90995r0;
        if (i10 == i16) {
            iArr[i10] = iArr[i10] + 1;
        }
        int i17 = iArr[i10];
        int[] iArr2 = this.f90994a1;
        int i18 = iArr2[i10];
        Vector[][] vectorArr = this.F0;
        byte[][][] bArr = this.f90998u0;
        int i19 = this.Y0;
        GMSSRootCalc[] gMSSRootCalcArr = this.O0;
        int[] iArr3 = this.V0;
        int[] iArr4 = this.T0;
        GMSSLeaf[] gMSSLeafArr = this.K0;
        Treehash[][] treehashArr = this.f90999w0;
        int[] iArr5 = this.L0;
        GMSSLeaf[] gMSSLeafArr2 = this.J0;
        GMSSLeaf[] gMSSLeafArr3 = this.I0;
        GMSSRootSig[] gMSSRootSigArr = this.Q0;
        GMSSRandom gMSSRandom = this.Z0;
        byte[][] bArr2 = this.f90996s0;
        int i20 = -1;
        if (i17 == i18) {
            if (i15 != 1) {
                if (i10 > 0) {
                    int i21 = i10 - 1;
                    iArr[i21] = iArr[i21] + 1;
                    int i22 = i10;
                    boolean z10 = true;
                    do {
                        i22--;
                        z10 = iArr[i22] < iArr2[i22] ? false : z10;
                        if (!z10) {
                            break;
                        }
                    } while (i22 > 0);
                    if (z10) {
                        i14 = 0;
                    } else {
                        gMSSRandom.nextSeed(bArr2[i10]);
                        gMSSRootSigArr[i21].updateSign();
                        if (i10 > 1) {
                            int i23 = i10 - 2;
                            gMSSLeafArr3[i23] = gMSSLeafArr3[i23].b();
                        }
                        gMSSLeafArr2[i21] = gMSSLeafArr2[i21].b();
                        if (iArr5[i21] >= 0) {
                            GMSSLeaf gMSSLeafB = gMSSLeafArr[i21].b();
                            gMSSLeafArr[i21] = gMSSLeafB;
                            try {
                                treehashArr[i21][iArr5[i21]].update(gMSSRandom, gMSSLeafB.getLeaf());
                                treehashArr[i21][iArr5[i21]].wasFinished();
                            } catch (Exception e5) {
                                System.out.println(e5);
                            }
                        }
                        c(i10);
                        this.P0[i21] = gMSSRootSigArr[i21].getSig();
                        for (int i24 = 0; i24 < iArr4[i10] - iArr3[i10]; i24++) {
                            Treehash[] treehashArr2 = treehashArr[i10];
                            Treehash[][] treehashArr3 = this.f91000x0;
                            treehashArr2[i24] = treehashArr3[i21][i24];
                            treehashArr3[i21][i24] = gMSSRootCalcArr[i21].getTreehash()[i24];
                        }
                        for (int i25 = 0; i25 < iArr4[i10]; i25++) {
                            byte[][][] bArr3 = this.v0;
                            System.arraycopy(bArr3[i21][i25], 0, bArr[i10][i25], 0, i19);
                            System.arraycopy(gMSSRootCalcArr[i21].getAuthPath()[i25], 0, bArr3[i21][i25], 0, i19);
                        }
                        for (int i26 = 0; i26 < iArr3[i10] - 1; i26++) {
                            Vector[] vectorArr2 = vectorArr[i10];
                            Vector[][] vectorArr3 = this.G0;
                            vectorArr2[i26] = vectorArr3[i21][i26];
                            vectorArr3[i21][i26] = gMSSRootCalcArr[i21].getRetain()[i26];
                        }
                        Vector[] vectorArr4 = this.E0;
                        this.f91001y0[i10] = vectorArr4[i21];
                        vectorArr4[i21] = gMSSRootCalcArr[i21].getStack();
                        byte[] root = gMSSRootCalcArr[i21].getRoot();
                        byte[][] bArr4 = this.N0;
                        bArr4[i21] = root;
                        byte[] bArr5 = new byte[i19];
                        byte[] bArr6 = new byte[i19];
                        i14 = 0;
                        System.arraycopy(bArr2[i21], 0, bArr6, 0, i19);
                        gMSSRandom.nextSeed(bArr6);
                        gMSSRandom.nextSeed(bArr6);
                        gMSSRootSigArr[i21].initSign(gMSSRandom.nextSeed(bArr6), bArr4[i21]);
                        b(i21);
                    }
                } else {
                    i14 = 0;
                }
                iArr[i10] = i14;
                return;
            }
            return;
        }
        int i27 = iArr4[i10];
        int i28 = iArr3[i10];
        int i29 = 0;
        while (true) {
            i11 = i27 - i28;
            if (i29 >= i11) {
                break;
            }
            treehashArr[i10][i29].updateNextSeed(gMSSRandom);
            i29++;
        }
        if (i17 != 0) {
            int i30 = 1;
            int i31 = 0;
            while (i17 % i30 == 0) {
                i30 *= 2;
                i31++;
            }
            i20 = i31 - 1;
        }
        int i32 = i20;
        byte[] bArr7 = new byte[i19];
        byte[] bArrNextSeed = gMSSRandom.nextSeed(bArr2[i10]);
        int i33 = (i17 >>> (i32 + 1)) & 1;
        byte[] bArr8 = new byte[i19];
        int i34 = i27 - 1;
        if (i32 < i34 && i33 == 0) {
            System.arraycopy(bArr[i10][i32], 0, bArr8, 0, i19);
        }
        byte[] bArr9 = new byte[i19];
        GMSSDigestProvider gMSSDigestProvider = this.R0;
        int[] iArr6 = this.U0;
        byte[][][] bArr10 = this.H0;
        if (i32 == 0) {
            if (i10 == i15 - 1) {
                publicKey = new WinternitzOTSignature(bArrNextSeed, gMSSDigestProvider.get(), iArr6[i10]).getPublicKey();
                i13 = 0;
            } else {
                byte[] bArr11 = new byte[i19];
                i13 = 0;
                System.arraycopy(bArr2[i10], 0, bArr11, 0, i19);
                gMSSRandom.nextSeed(bArr11);
                byte[] leaf = gMSSLeafArr2[i10].getLeaf();
                gMSSLeafArr2[i10].a(bArr11);
                publicKey = leaf;
            }
            System.arraycopy(publicKey, i13, bArr[i10][i13], i13, i19);
        } else {
            gMSSDigestProvider = gMSSDigestProvider;
            int i35 = i19 << 1;
            byte[] bArr12 = new byte[i35];
            int i36 = i32 - 1;
            System.arraycopy(bArr[i10][i36], 0, bArr12, 0, i19);
            System.arraycopy(bArr10[i10][(int) Math.floor(i36 / 2)], 0, bArr12, i19, i19);
            Digest digest = this.X0;
            digest.update(bArr12, 0, i35);
            bArr[i10][i32] = new byte[digest.getDigestSize()];
            digest.doFinal(bArr[i10][i32], 0);
            for (int i37 = 0; i37 < i32; i37++) {
                if (i37 < i11) {
                    if (treehashArr[i10][i37].wasFinished()) {
                        System.arraycopy(treehashArr[i10][i37].getFirstNode(), 0, bArr[i10][i37], 0, i19);
                        treehashArr[i10][i37].destroy();
                    } else {
                        System.err.println(k.c("Treehash (", i10, ",", i37, ") not finished when needed in AuthPathComputation"));
                    }
                }
                if (i37 >= i34 || i37 < i11) {
                    i12 = 1;
                } else {
                    int i38 = i37 - i11;
                    if (vectorArr[i10][i38].size() > 0) {
                        System.arraycopy(vectorArr[i10][i38].lastElement(), 0, bArr[i10][i37], 0, i19);
                        Vector vector = vectorArr[i10][i38];
                        i12 = 1;
                        vector.removeElementAt(vector.size() - 1);
                    } else {
                        i12 = 1;
                    }
                }
                if (i37 < i11 && ((i12 << i37) * 3) + i17 < iArr2[i10]) {
                    treehashArr[i10][i37].initialize();
                }
            }
        }
        if (i32 < i34 && i33 == 0) {
            System.arraycopy(bArr8, 0, bArr10[i10][(int) Math.floor(i32 / 2)], 0, i19);
        }
        if (i10 == i15 - 1) {
            for (int i39 = 1; i39 <= i11 / 2; i39++) {
                int iA = a(i10);
                if (iA >= 0) {
                    try {
                        byte[] bArr13 = new byte[i19];
                        try {
                            System.arraycopy(treehashArr[i10][iA].getSeedActive(), 0, bArr13, 0, i19);
                            treehashArr[i10][iA].update(gMSSRandom, new WinternitzOTSignature(gMSSRandom.nextSeed(bArr13), gMSSDigestProvider.get(), iArr6[i10]).getPublicKey());
                        } catch (Exception e7) {
                            e = e7;
                            System.out.println(e);
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                }
            }
        } else {
            iArr5[i10] = a(i10);
        }
        if (i10 > 0) {
            if (i10 > 1) {
                int i40 = i10 - 2;
                gMSSLeafArr3[i40] = gMSSLeafArr3[i40].b();
            }
            int i41 = i10 - 1;
            gMSSLeafArr2[i41] = gMSSLeafArr2[i41].b();
            int iFloor = (int) Math.floor(((double) (getNumLeafs(i10) * 2)) / ((double) (iArr4[i41] - iArr3[i41])));
            int i42 = iArr[i10];
            if (i42 % iFloor == 1) {
                if (i42 > 1 && iArr5[i41] >= 0) {
                    try {
                        treehashArr[i41][iArr5[i41]].update(gMSSRandom, gMSSLeafArr[i41].getLeaf());
                        treehashArr[i41][iArr5[i41]].wasFinished();
                    } catch (Exception e11) {
                        System.out.println(e11);
                    }
                }
                int iA2 = a(i41);
                iArr5[i41] = iA2;
                if (iA2 >= 0) {
                    GMSSLeaf gMSSLeaf = new GMSSLeaf(gMSSDigestProvider.get(), iArr6[i41], iFloor, treehashArr[i41][iA2].getSeedActive());
                    gMSSLeafArr[i41] = gMSSLeaf;
                    gMSSLeafArr[i41] = gMSSLeaf.b();
                }
            } else if (iArr5[i41] >= 0) {
                gMSSLeafArr[i41] = gMSSLeafArr[i41].b();
            }
            gMSSRootSigArr[i41].updateSign();
            if (iArr[i10] == 1) {
                gMSSRootCalcArr[i41].initialize(new Vector());
            }
            c(i10);
        }
    }

    public final void c(int i10) {
        byte[] bArr = new byte[this.Y0];
        int i11 = i10 - 1;
        byte[][] bArr2 = this.f90997t0;
        byte[] bArrNextSeed = this.Z0.nextSeed(bArr2[i11]);
        int i12 = this.W0 - 1;
        GMSSRootCalc[] gMSSRootCalcArr = this.O0;
        if (i10 == i12) {
            gMSSRootCalcArr[i11].update(bArr2[i11], new WinternitzOTSignature(bArrNextSeed, this.R0.get(), this.U0[i10]).getPublicKey());
            return;
        }
        GMSSRootCalc gMSSRootCalc = gMSSRootCalcArr[i11];
        byte[] bArr3 = bArr2[i11];
        GMSSLeaf[] gMSSLeafArr = this.I0;
        gMSSRootCalc.update(bArr3, gMSSLeafArr[i11].getLeaf());
        gMSSLeafArr[i11].a(bArr2[i11]);
    }

    public byte[][][] getCurrentAuthPaths() {
        return Arrays.clone(this.f90998u0);
    }

    public byte[][] getCurrentSeeds() {
        return Arrays.clone(this.f90996s0);
    }

    public int getIndex(int i10) {
        return this.f90995r0[i10];
    }

    public GMSSDigestProvider getName() {
        return this.R0;
    }

    public int getNumLeafs(int i10) {
        return this.f90994a1[i10];
    }

    public byte[] getSubtreeRootSig(int i10) {
        return this.P0[i10];
    }

    public boolean isUsed() {
        return this.S0;
    }

    public void markUsed() {
        this.S0 = true;
    }

    public GMSSPrivateKeyParameters nextKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = new GMSSPrivateKeyParameters(true, getParameters());
        gMSSPrivateKeyParameters.S0 = false;
        gMSSPrivateKeyParameters.f90995r0 = Arrays.clone(this.f90995r0);
        gMSSPrivateKeyParameters.f90996s0 = Arrays.clone(this.f90996s0);
        gMSSPrivateKeyParameters.f90997t0 = Arrays.clone(this.f90997t0);
        gMSSPrivateKeyParameters.f90998u0 = Arrays.clone(this.f90998u0);
        gMSSPrivateKeyParameters.v0 = Arrays.clone(this.v0);
        gMSSPrivateKeyParameters.f90999w0 = this.f90999w0;
        gMSSPrivateKeyParameters.f91000x0 = this.f91000x0;
        gMSSPrivateKeyParameters.f91001y0 = this.f91001y0;
        gMSSPrivateKeyParameters.E0 = this.E0;
        gMSSPrivateKeyParameters.F0 = this.F0;
        gMSSPrivateKeyParameters.G0 = this.G0;
        gMSSPrivateKeyParameters.H0 = Arrays.clone(this.H0);
        gMSSPrivateKeyParameters.I0 = this.I0;
        gMSSPrivateKeyParameters.J0 = this.J0;
        gMSSPrivateKeyParameters.K0 = this.K0;
        gMSSPrivateKeyParameters.L0 = this.L0;
        GMSSParameters gMSSParameters = this.M0;
        gMSSPrivateKeyParameters.M0 = gMSSParameters;
        gMSSPrivateKeyParameters.N0 = Arrays.clone(this.N0);
        gMSSPrivateKeyParameters.O0 = this.O0;
        gMSSPrivateKeyParameters.P0 = this.P0;
        gMSSPrivateKeyParameters.Q0 = this.Q0;
        gMSSPrivateKeyParameters.R0 = this.R0;
        gMSSPrivateKeyParameters.T0 = this.T0;
        gMSSPrivateKeyParameters.U0 = this.U0;
        gMSSPrivateKeyParameters.V0 = this.V0;
        gMSSPrivateKeyParameters.W0 = this.W0;
        gMSSPrivateKeyParameters.X0 = this.X0;
        gMSSPrivateKeyParameters.Y0 = this.Y0;
        gMSSPrivateKeyParameters.Z0 = this.Z0;
        gMSSPrivateKeyParameters.f90994a1 = this.f90994a1;
        gMSSPrivateKeyParameters.b(gMSSParameters.getNumOfLayers() - 1);
        return gMSSPrivateKeyParameters;
    }

    public int[] getIndex() {
        return this.f90995r0;
    }

    public GMSSPrivateKeyParameters(byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][] bArr5, byte[][] bArr6, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        this(null, bArr, bArr2, bArr3, bArr4, null, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, null, null, null, null, bArr5, null, bArr6, null, gMSSParameters, gMSSDigestProvider);
    }
}
