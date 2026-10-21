package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f88618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f88619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f88620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f88621k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f88624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f88625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f88626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f88627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f88628g;

    public static final class a extends d {
        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.d
        public final void a(long[] jArr, long[] jArr2) {
            int[] iArr = ThreefishEngine.f88619i;
            int[] iArr2 = ThreefishEngine.f88621k;
            long[] jArr3 = this.f88630b;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            long[] jArr4 = this.f88629a;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            long j19 = jArr[9];
            long j20 = jArr[10];
            long j21 = jArr[11];
            long j22 = jArr[12];
            long jB = jArr[13];
            long j23 = jArr[14];
            long jB2 = jArr[15];
            int i11 = 19;
            while (i11 >= i10) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j24 = j10 - jArr3[i14];
                int i15 = i12 + 2;
                long j25 = j11 - jArr3[i15];
                int i16 = i12 + 3;
                long j26 = j12 - jArr3[i16];
                int i17 = i12 + 4;
                long j27 = j13 - jArr3[i17];
                int i18 = i12 + 5;
                long j28 = j14 - jArr3[i18];
                int i19 = i12 + 6;
                long j29 = j15 - jArr3[i19];
                int i20 = i12 + 7;
                long j30 = j16 - jArr3[i20];
                int i21 = i12 + 8;
                long j31 = j17 - jArr3[i21];
                int i22 = i12 + 9;
                long j32 = j18 - jArr3[i22];
                int i23 = i12 + 10;
                long j33 = j19 - jArr3[i23];
                int i24 = i12 + 11;
                long j34 = j20 - jArr3[i24];
                int i25 = i12 + 12;
                long j35 = j21 - jArr3[i25];
                int i26 = i12 + 13;
                long j36 = j22 - jArr3[i26];
                int i27 = i12 + 14;
                int i28 = i13 + 1;
                long j37 = jB - (jArr3[i27] + jArr4[i28]);
                int i29 = i12 + 15;
                long j38 = j23 - (jArr3[i29] + jArr4[i13 + 2]);
                long j39 = i11;
                int[] iArr3 = iArr2;
                long jB3 = ThreefishEngine.b(9, jB2 - ((jArr3[i12 + 16] + j39) + 1), j24);
                long j40 = j24 - jB3;
                long[] jArr5 = jArr4;
                long jB4 = ThreefishEngine.b(48, j35, j26);
                long j41 = j26 - jB4;
                long jB5 = ThreefishEngine.b(35, j37, j30);
                long j42 = j30 - jB5;
                long jB6 = ThreefishEngine.b(52, j33, j28);
                long j43 = j28 - jB6;
                long jB7 = ThreefishEngine.b(23, j25, j38);
                long j44 = j38 - jB7;
                long jB8 = ThreefishEngine.b(31, j29, j32);
                long j45 = j32 - jB8;
                long jB9 = ThreefishEngine.b(37, j27, j34);
                long j46 = j34 - jB9;
                long jB10 = ThreefishEngine.b(20, j31, j36);
                long j47 = j36 - jB10;
                long jB11 = ThreefishEngine.b(31, jB10, j40);
                long j48 = j40 - jB11;
                long jB12 = ThreefishEngine.b(44, jB8, j41);
                long j49 = j41 - jB12;
                long jB13 = ThreefishEngine.b(47, jB9, j43);
                long j50 = j43 - jB13;
                long jB14 = ThreefishEngine.b(46, jB7, j42);
                long j51 = j42 - jB14;
                long jB15 = ThreefishEngine.b(19, jB3, j47);
                long j52 = j47 - jB15;
                long jB16 = ThreefishEngine.b(42, jB5, j44);
                long j53 = j44 - jB16;
                long[] jArr6 = jArr3;
                long jB17 = ThreefishEngine.b(44, jB4, j45);
                long j54 = j45 - jB17;
                long jB18 = ThreefishEngine.b(25, jB6, j46);
                long j55 = j46 - jB18;
                long jB19 = ThreefishEngine.b(16, jB18, j48);
                long j56 = j48 - jB19;
                long jB20 = ThreefishEngine.b(34, jB16, j49);
                long j57 = j49 - jB20;
                long jB21 = ThreefishEngine.b(56, jB17, j51);
                long j58 = j51 - jB21;
                long jB22 = ThreefishEngine.b(51, jB15, j50);
                long j59 = j50 - jB22;
                long jB23 = ThreefishEngine.b(4, jB11, j55);
                long j60 = j55 - jB23;
                long jB24 = ThreefishEngine.b(53, jB13, j52);
                long j61 = j52 - jB24;
                long jB25 = ThreefishEngine.b(42, jB12, j53);
                long j62 = j53 - jB25;
                long jB26 = ThreefishEngine.b(41, jB14, j54);
                long j63 = j54 - jB26;
                long jB27 = ThreefishEngine.b(41, jB26, j56);
                long jB28 = ThreefishEngine.b(9, jB24, j57);
                long jB29 = ThreefishEngine.b(37, jB25, j59);
                long j64 = j59 - jB29;
                long jB30 = ThreefishEngine.b(31, jB23, j58);
                long j65 = j58 - jB30;
                long jB31 = ThreefishEngine.b(12, jB19, j63);
                long j66 = j63 - jB31;
                long jB32 = ThreefishEngine.b(47, jB21, j60);
                long j67 = j60 - jB32;
                long jB33 = ThreefishEngine.b(44, jB20, j61);
                long j68 = j61 - jB33;
                long jB34 = ThreefishEngine.b(30, jB22, j62);
                long j69 = j62 - jB34;
                long j70 = (j56 - jB27) - jArr6[i12];
                long j71 = jB27 - jArr6[i14];
                long j72 = (j57 - jB28) - jArr6[i15];
                long j73 = jB28 - jArr6[i16];
                long j74 = j64 - jArr6[i17];
                long j75 = jB29 - jArr6[i18];
                long j76 = j65 - jArr6[i19];
                long j77 = jB30 - jArr6[i20];
                long j78 = j66 - jArr6[i21];
                long j79 = jB31 - jArr6[i22];
                long j80 = j67 - jArr6[i23];
                long j81 = jB32 - jArr6[i24];
                long j82 = j68 - jArr6[i25];
                long j83 = jB33 - (jArr6[i26] + jArr5[i13]);
                long j84 = j69 - (jArr6[i27] + jArr5[i28]);
                long jB35 = ThreefishEngine.b(5, jB34 - (jArr6[i29] + j39), j70);
                long j85 = j70 - jB35;
                long jB36 = ThreefishEngine.b(20, j81, j72);
                long j86 = j72 - jB36;
                long jB37 = ThreefishEngine.b(48, j83, j76);
                long j87 = j76 - jB37;
                long jB38 = ThreefishEngine.b(41, j79, j74);
                long j88 = j74 - jB38;
                long jB39 = ThreefishEngine.b(47, j71, j84);
                long j89 = j84 - jB39;
                long jB40 = ThreefishEngine.b(28, j75, j78);
                long j90 = j78 - jB40;
                long jB41 = ThreefishEngine.b(16, j73, j80);
                long j91 = j80 - jB41;
                long jB42 = ThreefishEngine.b(25, j77, j82);
                long j92 = j82 - jB42;
                long jB43 = ThreefishEngine.b(33, jB42, j85);
                long j93 = j85 - jB43;
                long jB44 = ThreefishEngine.b(4, jB40, j86);
                long j94 = j86 - jB44;
                long jB45 = ThreefishEngine.b(51, jB41, j88);
                long j95 = j88 - jB45;
                long jB46 = ThreefishEngine.b(13, jB39, j87);
                long j96 = j87 - jB46;
                long jB47 = ThreefishEngine.b(34, jB35, j92);
                long j97 = j92 - jB47;
                long jB48 = ThreefishEngine.b(41, jB37, j89);
                long j98 = j89 - jB48;
                long jB49 = ThreefishEngine.b(59, jB36, j90);
                long j99 = j90 - jB49;
                long jB50 = ThreefishEngine.b(17, jB38, j91);
                long j100 = j91 - jB50;
                long jB51 = ThreefishEngine.b(38, jB50, j93);
                long j101 = j93 - jB51;
                long jB52 = ThreefishEngine.b(19, jB48, j94);
                long j102 = j94 - jB52;
                long jB53 = ThreefishEngine.b(10, jB49, j96);
                long j103 = j96 - jB53;
                long jB54 = ThreefishEngine.b(55, jB47, j95);
                long j104 = j95 - jB54;
                long jB55 = ThreefishEngine.b(49, jB43, j100);
                long j105 = j100 - jB55;
                long jB56 = ThreefishEngine.b(18, jB45, j97);
                long j106 = j97 - jB56;
                long jB57 = ThreefishEngine.b(23, jB44, j98);
                long j107 = j98 - jB57;
                long jB58 = ThreefishEngine.b(52, jB46, j99);
                long j108 = j99 - jB58;
                long jB59 = ThreefishEngine.b(24, jB58, j101);
                j10 = j101 - jB59;
                long jB60 = ThreefishEngine.b(13, jB56, j102);
                long jB61 = ThreefishEngine.b(8, jB57, j104);
                long j109 = j104 - jB61;
                long jB62 = ThreefishEngine.b(47, jB55, j103);
                long j110 = j103 - jB62;
                long jB63 = ThreefishEngine.b(8, jB51, j108);
                j18 = j108 - jB63;
                long jB64 = ThreefishEngine.b(17, jB53, j105);
                jB = ThreefishEngine.b(22, jB52, j106);
                j22 = j106 - jB;
                jB2 = ThreefishEngine.b(37, jB54, j107);
                j23 = j107 - jB2;
                j12 = j102 - jB60;
                j19 = jB63;
                j15 = jB61;
                iArr = iArr;
                jArr3 = jArr6;
                iArr2 = iArr3;
                jArr4 = jArr5;
                i11 -= 2;
                j13 = jB60;
                j20 = j105 - jB64;
                j14 = j109;
                i10 = 1;
                j11 = jB59;
                j17 = jB62;
                j16 = j110;
                j21 = jB64;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j111 = j10 - jArr7[0];
            long j112 = j11 - jArr7[1];
            long j113 = j12 - jArr7[2];
            long j114 = j13 - jArr7[3];
            long j115 = j14 - jArr7[4];
            long j116 = j15 - jArr7[5];
            long j117 = j16 - jArr7[6];
            long j118 = j17 - jArr7[7];
            long j119 = j18 - jArr7[8];
            long j120 = j19 - jArr7[9];
            long j121 = j20 - jArr7[10];
            long j122 = j21 - jArr7[11];
            long j123 = j22 - jArr7[12];
            long j124 = jB - (jArr7[13] + jArr8[0]);
            long j125 = j23 - (jArr7[14] + jArr8[1]);
            long j126 = jB2 - jArr7[15];
            jArr2[0] = j111;
            jArr2[1] = j112;
            jArr2[2] = j113;
            jArr2[3] = j114;
            jArr2[4] = j115;
            jArr2[5] = j116;
            jArr2[6] = j117;
            jArr2[7] = j118;
            jArr2[8] = j119;
            jArr2[9] = j120;
            jArr2[10] = j121;
            jArr2[11] = j122;
            jArr2[12] = j123;
            jArr2[13] = j124;
            jArr2[14] = j125;
            jArr2[15] = j126;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.d
        public final void b(long[] jArr, long[] jArr2) {
            int[] iArr = ThreefishEngine.f88619i;
            int[] iArr2 = ThreefishEngine.f88621k;
            long[] jArr3 = this.f88630b;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            long[] jArr4 = this.f88629a;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            long j19 = jArr[9];
            long j20 = jArr[10];
            long j21 = jArr[11];
            long j22 = jArr[12];
            int i11 = 13;
            long j23 = jArr[13];
            long j24 = jArr[14];
            long j25 = jArr[15];
            long j26 = j10 + jArr3[0];
            long j27 = j11 + jArr3[1];
            long j28 = j12 + jArr3[2];
            long j29 = j13 + jArr3[3];
            long j30 = j14 + jArr3[4];
            long j31 = j15 + jArr3[5];
            long j32 = j16 + jArr3[6];
            long j33 = j17 + jArr3[7];
            long j34 = j18 + jArr3[8];
            long j35 = j19 + jArr3[9];
            long j36 = j20 + jArr3[10];
            long j37 = j21 + jArr3[11];
            long j38 = j22 + jArr3[12];
            long j39 = jArr3[13] + jArr4[0] + j23;
            long j40 = jArr3[14] + jArr4[1] + j24;
            long j41 = j29;
            long j42 = j31;
            long j43 = j33;
            long j44 = j35;
            long j45 = j37;
            long j46 = j25 + jArr3[15];
            long j47 = j39;
            while (i10 < 20) {
                int i12 = iArr[i10];
                int i13 = iArr2[i10];
                long j48 = j26 + j27;
                long jA = ThreefishEngine.a(24, j27, j48);
                long j49 = j28 + j41;
                long jA2 = ThreefishEngine.a(i11, j41, j49);
                long j50 = j42;
                long j51 = j30 + j50;
                long jA3 = ThreefishEngine.a(8, j50, j51);
                int i14 = i10;
                long j52 = j43;
                long j53 = j32 + j52;
                long jA4 = ThreefishEngine.a(47, j52, j53);
                int[] iArr3 = iArr2;
                long[] jArr5 = jArr3;
                long j54 = j44;
                long j55 = j34 + j54;
                long jA5 = ThreefishEngine.a(8, j54, j55);
                long j56 = j45;
                long j57 = j36 + j56;
                long jA6 = ThreefishEngine.a(17, j56, j57);
                long[] jArr6 = jArr4;
                long j58 = j47;
                long j59 = j38 + j58;
                long jA7 = ThreefishEngine.a(22, j58, j59);
                long j60 = j46;
                long j61 = j40 + j60;
                long jA8 = ThreefishEngine.a(37, j60, j61);
                long j62 = j48 + jA5;
                long jA9 = ThreefishEngine.a(38, jA5, j62);
                long j63 = j49 + jA7;
                long jA10 = ThreefishEngine.a(19, jA7, j63);
                long j64 = j53 + jA6;
                long jA11 = ThreefishEngine.a(10, jA6, j64);
                long j65 = j51 + jA8;
                long jA12 = ThreefishEngine.a(55, jA8, j65);
                long j66 = j57 + jA4;
                long jA13 = ThreefishEngine.a(49, jA4, j66);
                long j67 = j59 + jA2;
                long jA14 = ThreefishEngine.a(18, jA2, j67);
                long j68 = j61 + jA3;
                long jA15 = ThreefishEngine.a(23, jA3, j68);
                long j69 = j55 + jA;
                long jA16 = ThreefishEngine.a(52, jA, j69);
                long j70 = j62 + jA13;
                long jA17 = ThreefishEngine.a(33, jA13, j70);
                long j71 = j63 + jA15;
                long jA18 = ThreefishEngine.a(4, jA15, j71);
                long j72 = j65 + jA14;
                long jA19 = ThreefishEngine.a(51, jA14, j72);
                long j73 = j64 + jA16;
                long jA20 = ThreefishEngine.a(13, jA16, j73);
                long j74 = j67 + jA12;
                long jA21 = ThreefishEngine.a(34, jA12, j74);
                long j75 = j68 + jA10;
                long jA22 = ThreefishEngine.a(41, jA10, j75);
                long j76 = j69 + jA11;
                long jA23 = ThreefishEngine.a(59, jA11, j76);
                long j77 = j66 + jA9;
                long jA24 = ThreefishEngine.a(17, jA9, j77);
                long j78 = j70 + jA21;
                long jA25 = ThreefishEngine.a(5, jA21, j78);
                long j79 = j71 + jA23;
                long jA26 = ThreefishEngine.a(20, jA23, j79);
                long j80 = j73 + jA22;
                long jA27 = ThreefishEngine.a(48, jA22, j80);
                long j81 = j72 + jA24;
                long jA28 = ThreefishEngine.a(41, jA24, j81);
                long j82 = j75 + jA20;
                long jA29 = ThreefishEngine.a(47, jA20, j82);
                long j83 = j76 + jA18;
                long jA30 = ThreefishEngine.a(28, jA18, j83);
                long j84 = j77 + jA19;
                long jA31 = ThreefishEngine.a(16, jA19, j84);
                long j85 = j74 + jA17;
                long jA32 = ThreefishEngine.a(25, jA17, j85);
                long j86 = j78 + jArr5[i12];
                int i15 = i12 + 1;
                long j87 = jA29 + jArr5[i15];
                int i16 = i12 + 2;
                long j88 = j79 + jArr5[i16];
                int i17 = i12 + 3;
                long j89 = jA31 + jArr5[i17];
                int i18 = i12 + 4;
                long j90 = j81 + jArr5[i18];
                int i19 = i12 + 5;
                long j91 = jA30 + jArr5[i19];
                int i20 = i12 + 6;
                long j92 = j80 + jArr5[i20];
                int i21 = i12 + 7;
                long j93 = jA32 + jArr5[i21];
                int i22 = i12 + 8;
                long j94 = j83 + jArr5[i22];
                int i23 = i12 + 9;
                long j95 = jA28 + jArr5[i23];
                int i24 = i12 + 10;
                long j96 = j84 + jArr5[i24];
                int i25 = i12 + 11;
                long j97 = jA26 + jArr5[i25];
                int i26 = i12 + 12;
                long j98 = j85 + jArr5[i26];
                int i27 = i12 + 13;
                long j99 = jArr5[i27] + jArr6[i13] + jA27;
                int i28 = i12 + 14;
                int i29 = i13 + 1;
                long j100 = jArr5[i28] + jArr6[i29] + j82;
                int i30 = i12 + 15;
                long j101 = i14;
                long j102 = jArr5[i30] + j101 + jA25;
                long j103 = j86 + j87;
                long jA33 = ThreefishEngine.a(41, j87, j103);
                long j104 = j88 + j89;
                long jA34 = ThreefishEngine.a(9, j89, j104);
                long j105 = j90 + j91;
                long jA35 = ThreefishEngine.a(37, j91, j105);
                long j106 = j92 + j93;
                long jA36 = ThreefishEngine.a(31, j93, j106);
                long j107 = j94 + j95;
                long jA37 = ThreefishEngine.a(12, j95, j107);
                long j108 = j96 + j97;
                long jA38 = ThreefishEngine.a(47, j97, j108);
                long j109 = j98 + j99;
                long jA39 = ThreefishEngine.a(44, j99, j109);
                long j110 = j100 + j102;
                long jA40 = ThreefishEngine.a(30, j102, j110);
                long j111 = j103 + jA37;
                long jA41 = ThreefishEngine.a(16, jA37, j111);
                long j112 = j104 + jA39;
                long jA42 = ThreefishEngine.a(34, jA39, j112);
                long j113 = j106 + jA38;
                long jA43 = ThreefishEngine.a(56, jA38, j113);
                long j114 = j105 + jA40;
                long jA44 = ThreefishEngine.a(51, jA40, j114);
                long j115 = j108 + jA36;
                long jA45 = ThreefishEngine.a(4, jA36, j115);
                long j116 = j109 + jA34;
                long jA46 = ThreefishEngine.a(53, jA34, j116);
                long j117 = j110 + jA35;
                long jA47 = ThreefishEngine.a(42, jA35, j117);
                long j118 = j107 + jA33;
                long jA48 = ThreefishEngine.a(41, jA33, j118);
                long j119 = j111 + jA45;
                long jA49 = ThreefishEngine.a(31, jA45, j119);
                long j120 = j112 + jA47;
                long jA50 = ThreefishEngine.a(44, jA47, j120);
                long j121 = j114 + jA46;
                long jA51 = ThreefishEngine.a(47, jA46, j121);
                long j122 = j113 + jA48;
                long jA52 = ThreefishEngine.a(46, jA48, j122);
                long j123 = j116 + jA44;
                long jA53 = ThreefishEngine.a(19, jA44, j123);
                long j124 = j117 + jA42;
                long jA54 = ThreefishEngine.a(42, jA42, j124);
                long j125 = j118 + jA43;
                long jA55 = ThreefishEngine.a(44, jA43, j125);
                long j126 = j115 + jA41;
                long jA56 = ThreefishEngine.a(25, jA41, j126);
                long j127 = j119 + jA53;
                long jA57 = ThreefishEngine.a(9, jA53, j127);
                long j128 = j120 + jA55;
                long jA58 = ThreefishEngine.a(48, jA55, j128);
                long j129 = j122 + jA54;
                long jA59 = ThreefishEngine.a(35, jA54, j129);
                long j130 = j121 + jA56;
                long jA60 = ThreefishEngine.a(52, jA56, j130);
                long j131 = j124 + jA52;
                long jA61 = ThreefishEngine.a(23, jA52, j131);
                long j132 = j125 + jA50;
                long jA62 = ThreefishEngine.a(31, jA50, j132);
                long j133 = j126 + jA51;
                long jA63 = ThreefishEngine.a(37, jA51, j133);
                long j134 = j123 + jA49;
                long jA64 = ThreefishEngine.a(20, jA49, j134);
                j26 = jArr5[i15] + j127;
                long j135 = jA61 + jArr5[i16];
                long j136 = j128 + jArr5[i17];
                long j137 = jA63 + jArr5[i18];
                long j138 = jArr5[i19] + j130;
                long j139 = jA62 + jArr5[i20];
                long j140 = j129 + jArr5[i21];
                long j141 = jA64 + jArr5[i22];
                long j142 = j132 + jArr5[i23];
                j44 = jA60 + jArr5[i24];
                j36 = j133 + jArr5[i25];
                long j143 = jA58 + jArr5[i26];
                j38 = j134 + jArr5[i27];
                long j144 = jArr5[i28] + jArr6[i29] + jA59;
                j40 = jArr5[i30] + jArr6[i13 + 2] + j131;
                j46 = jArr5[i12 + 16] + j101 + 1 + jA57;
                j43 = j141;
                j41 = j137;
                j47 = j144;
                j45 = j143;
                j32 = j140;
                jArr4 = jArr6;
                i11 = 13;
                j42 = j139;
                j34 = j142;
                j28 = j136;
                j30 = j138;
                i10 = i14 + 2;
                iArr = iArr;
                j27 = j135;
                iArr2 = iArr3;
                jArr3 = jArr5;
            }
            jArr2[0] = j26;
            jArr2[1] = j27;
            jArr2[2] = j28;
            jArr2[3] = j41;
            jArr2[4] = j30;
            jArr2[5] = j42;
            jArr2[6] = j32;
            jArr2[7] = j43;
            jArr2[8] = j34;
            jArr2[9] = j44;
            jArr2[10] = j36;
            jArr2[11] = j45;
            jArr2[12] = j38;
            jArr2[13] = j47;
            jArr2[14] = j40;
            jArr2[15] = j46;
        }
    }

    public static final class b extends d {
        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.d
        public final void a(long[] jArr, long[] jArr2) {
            int[] iArr = ThreefishEngine.f88620j;
            int[] iArr2 = ThreefishEngine.f88621k;
            long[] jArr3 = this.f88630b;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            long[] jArr4 = this.f88629a;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            boolean z10 = false;
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long jB = jArr[3];
            int i10 = 17;
            for (int i11 = 1; i10 >= i11; i11 = 1) {
                int i12 = iArr[i10];
                int i13 = iArr2[i10];
                int i14 = i12 + 1;
                long j13 = j10 - jArr3[i14];
                int i15 = i12 + 2;
                int i16 = i13 + 1;
                long j14 = j11 - (jArr3[i15] + jArr4[i16]);
                int i17 = i12 + 3;
                long j15 = j12 - (jArr3[i17] + jArr4[i13 + 2]);
                long j16 = i10;
                long jB2 = ThreefishEngine.b(32, jB - ((jArr3[i12 + 4] + j16) + 1), j13);
                long j17 = j13 - jB2;
                long jB3 = ThreefishEngine.b(32, j14, j15);
                long j18 = j15 - jB3;
                long jB4 = ThreefishEngine.b(58, jB3, j17);
                long j19 = j17 - jB4;
                long jB5 = ThreefishEngine.b(22, jB2, j18);
                long j20 = j18 - jB5;
                long jB6 = ThreefishEngine.b(46, jB5, j19);
                long j21 = j19 - jB6;
                long jB7 = ThreefishEngine.b(12, jB4, j20);
                long j22 = j20 - jB7;
                long jB8 = ThreefishEngine.b(25, jB7, j21);
                long jB9 = ThreefishEngine.b(33, jB6, j22);
                long j23 = (j21 - jB8) - jArr3[i12];
                long j24 = jB8 - (jArr3[i14] + jArr4[i13]);
                long j25 = (j22 - jB9) - (jArr3[i15] + jArr4[i16]);
                long jB10 = ThreefishEngine.b(5, jB9 - (jArr3[i17] + j16), j23);
                long j26 = j23 - jB10;
                long jB11 = ThreefishEngine.b(37, j24, j25);
                long j27 = j25 - jB11;
                long jB12 = ThreefishEngine.b(23, jB11, j26);
                long j28 = j26 - jB12;
                long jB13 = ThreefishEngine.b(40, jB10, j27);
                long j29 = j27 - jB13;
                long jB14 = ThreefishEngine.b(52, jB13, j28);
                long j30 = j28 - jB14;
                long jB15 = ThreefishEngine.b(57, jB12, j29);
                long j31 = j29 - jB15;
                long jB16 = ThreefishEngine.b(14, jB15, j30);
                j10 = j30 - jB16;
                jB = ThreefishEngine.b(16, jB14, j31);
                j12 = j31 - jB;
                i10 -= 2;
                j11 = jB16;
                iArr = iArr;
                z10 = false;
            }
            boolean z11 = z10;
            long j32 = j10 - jArr3[z11 ? 1 : 0];
            long j33 = j11 - (jArr3[1] + jArr4[z11 ? 1 : 0]);
            long j34 = j12 - (jArr3[2] + jArr4[1]);
            long j35 = jB - jArr3[3];
            jArr2[z11 ? 1 : 0] = j32;
            jArr2[1] = j33;
            jArr2[2] = j34;
            jArr2[3] = j35;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.d
        public final void b(long[] jArr, long[] jArr2) {
            int[] iArr = ThreefishEngine.f88620j;
            int[] iArr2 = ThreefishEngine.f88621k;
            long[] jArr3 = this.f88630b;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            long[] jArr4 = this.f88629a;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = j10 + jArr3[0];
            long j15 = jArr3[1] + jArr4[0] + j11;
            long j16 = jArr3[2] + jArr4[1] + j12;
            int i10 = 1;
            long j17 = j13 + jArr3[3];
            long j18 = j15;
            while (i10 < 18) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                long j19 = j14 + j18;
                long jA = ThreefishEngine.a(14, j18, j19);
                long j20 = j16 + j17;
                long jA2 = ThreefishEngine.a(16, j17, j20);
                long j21 = j19 + jA2;
                long jA3 = ThreefishEngine.a(52, jA2, j21);
                long j22 = j20 + jA;
                long jA4 = ThreefishEngine.a(57, jA, j22);
                long j23 = j21 + jA4;
                long jA5 = ThreefishEngine.a(23, jA4, j23);
                long j24 = j22 + jA3;
                long jA6 = ThreefishEngine.a(40, jA3, j24);
                long j25 = j23 + jA6;
                long jA7 = ThreefishEngine.a(5, jA6, j25);
                long j26 = j24 + jA5;
                long jA8 = ThreefishEngine.a(37, jA5, j26);
                long j27 = j25 + jArr3[i11];
                int i13 = i11 + 1;
                long j28 = jArr3[i13] + jArr4[i12] + jA8;
                int i14 = i11 + 2;
                int i15 = i12 + 1;
                long j29 = jArr3[i14] + jArr4[i15] + j26;
                int i16 = i11 + 3;
                long j30 = i10;
                long j31 = jArr3[i16] + j30 + jA7;
                long j32 = j27 + j28;
                long jA9 = ThreefishEngine.a(25, j28, j32);
                long j33 = j29 + j31;
                long jA10 = ThreefishEngine.a(33, j31, j33);
                long j34 = j32 + jA10;
                long jA11 = ThreefishEngine.a(46, jA10, j34);
                long j35 = j33 + jA9;
                long jA12 = ThreefishEngine.a(12, jA9, j35);
                long j36 = j34 + jA12;
                long jA13 = ThreefishEngine.a(58, jA12, j36);
                long j37 = j35 + jA11;
                long jA14 = ThreefishEngine.a(22, jA11, j37);
                long j38 = j36 + jA14;
                long jA15 = ThreefishEngine.a(32, jA14, j38);
                long j39 = j37 + jA13;
                long jA16 = ThreefishEngine.a(32, jA13, j39);
                j14 = j38 + jArr3[i13];
                j18 = jA16 + jArr3[i14] + jArr4[i15];
                long j40 = j39 + jArr3[i16] + jArr4[i12 + 2];
                j17 = jArr3[i11 + 4] + j30 + 1 + jA15;
                i10 += 2;
                j16 = j40;
                iArr = iArr;
            }
            jArr2[0] = j14;
            jArr2[1] = j18;
            jArr2[2] = j16;
            jArr2[3] = j17;
        }
    }

    public static final class c extends d {
        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.d
        public final void a(long[] jArr, long[] jArr2) {
            int[] iArr = ThreefishEngine.f88618h;
            int[] iArr2 = ThreefishEngine.f88621k;
            long[] jArr3 = this.f88630b;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            long[] jArr4 = this.f88629a;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            boolean z10 = false;
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long jB = jArr[3];
            long j13 = jArr[4];
            long jB2 = jArr[5];
            long j14 = jArr[6];
            long jB3 = jArr[7];
            int i11 = 17;
            while (i11 >= i10) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j15 = j10 - jArr3[i14];
                int i15 = i12 + 2;
                long j16 = j11 - jArr3[i15];
                int i16 = i12 + 3;
                long j17 = j12 - jArr3[i16];
                int i17 = i12 + 4;
                long j18 = jB - jArr3[i17];
                int i18 = i12 + 5;
                long j19 = j13 - jArr3[i18];
                int i19 = i12 + 6;
                int i20 = i13 + 1;
                long j20 = jB2 - (jArr3[i19] + jArr4[i20]);
                int i21 = i12 + 7;
                long j21 = j14 - (jArr3[i21] + jArr4[i13 + 2]);
                int[] iArr3 = iArr2;
                long[] jArr5 = jArr3;
                long j22 = i11;
                long j23 = jB3 - ((jArr3[i12 + 8] + j22) + 1);
                long[] jArr6 = jArr4;
                long jB4 = ThreefishEngine.b(8, j16, j21);
                long j24 = j21 - jB4;
                long jB5 = ThreefishEngine.b(35, j23, j15);
                long j25 = j15 - jB5;
                long jB6 = ThreefishEngine.b(56, j20, j17);
                long j26 = j17 - jB6;
                long jB7 = ThreefishEngine.b(22, j18, j19);
                long j27 = j19 - jB7;
                long jB8 = ThreefishEngine.b(25, jB4, j27);
                long j28 = j27 - jB8;
                long jB9 = ThreefishEngine.b(29, jB7, j24);
                long j29 = j24 - jB9;
                long jB10 = ThreefishEngine.b(39, jB6, j25);
                long j30 = j25 - jB10;
                long jB11 = ThreefishEngine.b(43, jB5, j26);
                long j31 = j26 - jB11;
                long jB12 = ThreefishEngine.b(13, jB8, j31);
                long j32 = j31 - jB12;
                long jB13 = ThreefishEngine.b(50, jB11, j28);
                long j33 = j28 - jB13;
                long jB14 = ThreefishEngine.b(10, jB10, j29);
                long j34 = j29 - jB14;
                long jB15 = ThreefishEngine.b(17, jB9, j30);
                long j35 = j30 - jB15;
                long jB16 = ThreefishEngine.b(39, jB12, j35);
                long jB17 = ThreefishEngine.b(30, jB15, j32);
                long jB18 = ThreefishEngine.b(34, jB14, j33);
                long j36 = j33 - jB18;
                long jB19 = ThreefishEngine.b(24, jB13, j34);
                long j37 = j34 - jB19;
                long j38 = (j35 - jB16) - jArr5[i12];
                long j39 = jB16 - jArr5[i14];
                long j40 = (j32 - jB17) - jArr5[i15];
                long j41 = jB17 - jArr5[i16];
                long j42 = j36 - jArr5[i17];
                long j43 = jB18 - (jArr5[i18] + jArr6[i13]);
                long j44 = j37 - (jArr5[i19] + jArr6[i20]);
                long j45 = jB19 - (jArr5[i21] + j22);
                long jB20 = ThreefishEngine.b(44, j39, j44);
                long j46 = j44 - jB20;
                long jB21 = ThreefishEngine.b(9, j45, j38);
                long j47 = j38 - jB21;
                long jB22 = ThreefishEngine.b(54, j43, j40);
                long j48 = j40 - jB22;
                long jB23 = ThreefishEngine.b(56, j41, j42);
                long j49 = j42 - jB23;
                long jB24 = ThreefishEngine.b(17, jB20, j49);
                long j50 = j49 - jB24;
                long jB25 = ThreefishEngine.b(49, jB23, j46);
                long j51 = j46 - jB25;
                long jB26 = ThreefishEngine.b(36, jB22, j47);
                long j52 = j47 - jB26;
                long jB27 = ThreefishEngine.b(39, jB21, j48);
                long j53 = j48 - jB27;
                long jB28 = ThreefishEngine.b(33, jB24, j53);
                long j54 = j53 - jB28;
                long jB29 = ThreefishEngine.b(27, jB27, j50);
                long j55 = j50 - jB29;
                long jB30 = ThreefishEngine.b(14, jB26, j51);
                long j56 = j51 - jB30;
                long jB31 = ThreefishEngine.b(42, jB25, j52);
                long j57 = j52 - jB31;
                long jB32 = ThreefishEngine.b(46, jB28, j57);
                long j58 = j57 - jB32;
                jB = ThreefishEngine.b(36, jB31, j54);
                jB2 = ThreefishEngine.b(19, jB30, j55);
                jB3 = ThreefishEngine.b(37, jB29, j56);
                j14 = j56 - jB3;
                j12 = j54 - jB;
                j13 = j55 - jB2;
                j11 = jB32;
                iArr = iArr;
                iArr2 = iArr3;
                jArr3 = jArr5;
                jArr4 = jArr6;
                i10 = 1;
                i11 -= 2;
                j10 = j58;
                z10 = false;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            boolean z11 = z10;
            long j59 = j10 - jArr7[z11 ? 1 : 0];
            long j60 = j11 - jArr7[1];
            long j61 = j12 - jArr7[2];
            long j62 = jB - jArr7[3];
            long j63 = j13 - jArr7[4];
            long j64 = jB2 - (jArr7[5] + jArr8[z11 ? 1 : 0]);
            long j65 = j14 - (jArr7[6] + jArr8[1]);
            long j66 = jB3 - jArr7[7];
            jArr2[z11 ? 1 : 0] = j59;
            jArr2[1] = j60;
            jArr2[2] = j61;
            jArr2[3] = j62;
            jArr2[4] = j63;
            jArr2[5] = j64;
            jArr2[6] = j65;
            jArr2[7] = j66;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.d
        public final void b(long[] jArr, long[] jArr2) {
            int[] iArr = ThreefishEngine.f88618h;
            int[] iArr2 = ThreefishEngine.f88621k;
            long[] jArr3 = this.f88630b;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            long[] jArr4 = this.f88629a;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = j10 + jArr3[0];
            long j19 = j11 + jArr3[1];
            long j20 = j12 + jArr3[2];
            long j21 = j13 + jArr3[3];
            long j22 = j14 + jArr3[4];
            long j23 = jArr3[5] + jArr4[0] + j15;
            long j24 = jArr3[6] + jArr4[1] + j16;
            long j25 = j21;
            long j26 = j17 + jArr3[7];
            long j27 = j23;
            while (i10 < 18) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                long j28 = j18 + j19;
                long jA = ThreefishEngine.a(46, j19, j28);
                long j29 = j20 + j25;
                long jA2 = ThreefishEngine.a(36, j25, j29);
                long j30 = j27;
                long j31 = j22 + j30;
                int[] iArr3 = iArr2;
                long jA3 = ThreefishEngine.a(19, j30, j31);
                long[] jArr5 = jArr3;
                long j32 = j26;
                long j33 = j24 + j32;
                long jA4 = ThreefishEngine.a(37, j32, j33);
                long j34 = j29 + jA;
                long jA5 = ThreefishEngine.a(33, jA, j34);
                long j35 = j31 + jA4;
                long jA6 = ThreefishEngine.a(27, jA4, j35);
                long j36 = j33 + jA3;
                long jA7 = ThreefishEngine.a(14, jA3, j36);
                int i13 = i10;
                long j37 = j28 + jA2;
                long[] jArr6 = jArr4;
                long jA8 = ThreefishEngine.a(42, jA2, j37);
                long j38 = j35 + jA5;
                long jA9 = ThreefishEngine.a(17, jA5, j38);
                long j39 = j36 + jA8;
                long jA10 = ThreefishEngine.a(49, jA8, j39);
                long j40 = j37 + jA7;
                long jA11 = ThreefishEngine.a(36, jA7, j40);
                long j41 = j34 + jA6;
                long jA12 = ThreefishEngine.a(39, jA6, j41);
                long j42 = j39 + jA9;
                long jA13 = ThreefishEngine.a(44, jA9, j42);
                long j43 = j40 + jA12;
                long jA14 = ThreefishEngine.a(9, jA12, j43);
                long j44 = j41 + jA11;
                long jA15 = ThreefishEngine.a(54, jA11, j44);
                long j45 = j38 + jA10;
                long jA16 = ThreefishEngine.a(56, jA10, j45);
                long j46 = j43 + jArr5[i11];
                int i14 = i11 + 1;
                long j47 = jA13 + jArr5[i14];
                int i15 = i11 + 2;
                long j48 = j44 + jArr5[i15];
                int i16 = i11 + 3;
                long j49 = jA16 + jArr5[i16];
                int i17 = i11 + 4;
                long j50 = j45 + jArr5[i17];
                int i18 = i11 + 5;
                long j51 = jArr5[i18] + jArr6[i12] + jA15;
                int i19 = i11 + 6;
                int i20 = i12 + 1;
                long j52 = jArr5[i19] + jArr6[i20] + j42;
                int i21 = i11 + 7;
                long j53 = i13;
                long j54 = jArr5[i21] + j53 + jA14;
                long j55 = j46 + j47;
                long jA17 = ThreefishEngine.a(39, j47, j55);
                long j56 = j48 + j49;
                long jA18 = ThreefishEngine.a(30, j49, j56);
                long j57 = j50 + j51;
                long jA19 = ThreefishEngine.a(34, j51, j57);
                long j58 = j52 + j54;
                long jA20 = ThreefishEngine.a(24, j54, j58);
                long j59 = j56 + jA17;
                long jA21 = ThreefishEngine.a(13, jA17, j59);
                long j60 = j57 + jA20;
                long jA22 = ThreefishEngine.a(50, jA20, j60);
                long j61 = j58 + jA19;
                long jA23 = ThreefishEngine.a(10, jA19, j61);
                long j62 = j55 + jA18;
                long jA24 = ThreefishEngine.a(17, jA18, j62);
                long j63 = j60 + jA21;
                long jA25 = ThreefishEngine.a(25, jA21, j63);
                long j64 = j61 + jA24;
                long jA26 = ThreefishEngine.a(29, jA24, j64);
                long j65 = j62 + jA23;
                long jA27 = ThreefishEngine.a(39, jA23, j65);
                long j66 = j59 + jA22;
                long jA28 = ThreefishEngine.a(43, jA22, j66);
                long j67 = j64 + jA25;
                long jA29 = ThreefishEngine.a(8, jA25, j67);
                long j68 = j65 + jA28;
                long jA30 = ThreefishEngine.a(35, jA28, j68);
                long j69 = j66 + jA27;
                long jA31 = ThreefishEngine.a(56, jA27, j69);
                long j70 = j63 + jA26;
                long jA32 = ThreefishEngine.a(22, jA26, j70);
                j18 = j68 + jArr5[i14];
                j19 = jA29 + jArr5[i15];
                j20 = j69 + jArr5[i16];
                j25 = jA32 + jArr5[i17];
                long j71 = j70 + jArr5[i18];
                long j72 = jArr5[i19] + jArr6[i20] + jA31;
                j24 = jArr5[i21] + jArr6[i12 + 2] + j67;
                i10 = i13 + 2;
                j22 = j71;
                iArr = iArr;
                j27 = j72;
                jArr4 = jArr6;
                j26 = jArr5[i11 + 8] + j53 + 1 + jA30;
                iArr2 = iArr3;
                jArr3 = jArr5;
            }
            jArr2[0] = j18;
            jArr2[1] = j19;
            jArr2[2] = j20;
            jArr2[3] = j25;
            jArr2[4] = j22;
            jArr2[5] = j27;
            jArr2[6] = j24;
            jArr2[7] = j26;
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f88629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f88630b;

        public d(long[] jArr, long[] jArr2) {
            this.f88630b = jArr;
            this.f88629a = jArr2;
        }

        public abstract void a(long[] jArr, long[] jArr2);

        public abstract void b(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        f88618h = iArr;
        f88619i = new int[iArr.length];
        f88620j = new int[iArr.length];
        f88621k = new int[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = f88618h;
            if (i10 >= iArr2.length) {
                return;
            }
            f88619i[i10] = i10 % 17;
            iArr2[i10] = i10 % 9;
            f88620j[i10] = i10 % 5;
            f88621k[i10] = i10 % 3;
            i10++;
        }
    }

    public ThreefishEngine(int i10) {
        d bVar;
        long[] jArr = new long[5];
        this.f88625d = jArr;
        int i11 = i10 / 8;
        this.f88622a = i11;
        int i12 = i11 / 8;
        this.f88623b = i12;
        this.f88624c = new long[i12];
        long[] jArr2 = new long[(i12 * 2) + 1];
        this.f88626e = jArr2;
        if (i10 == 256) {
            bVar = new b(jArr2, jArr);
        } else if (i10 == 512) {
            bVar = new c(jArr2, jArr);
        } else {
            if (i10 != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            bVar = new a(jArr2, jArr);
        }
        this.f88627f = bVar;
    }

    public static long a(int i10, long j10, long j11) {
        return ((j10 >>> (-i10)) | (j10 << i10)) ^ j11;
    }

    public static long b(int i10, long j10, long j11) {
        long j12 = j10 ^ j11;
        return (j12 << (-i10)) | (j12 >>> i10);
    }

    public static long bytesToWord(byte[] bArr, int i10) {
        if (i10 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40);
        return ((((long) bArr[i10 + 7]) & 255) << 56) | j10 | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static void wordToBytes(long j10, byte[] bArr, int i10) {
        if (i10 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.f88622a * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f88622a;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "Invalid parameter passed to Threefish init - "));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key != null) {
            int length = key.length;
            int i10 = this.f88622a;
            if (length != i10) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Threefish key must be same size as block (", i10, " bytes)"));
            }
            int i11 = this.f88623b;
            jArr = new long[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                jArr[i12] = bytesToWord(key, i12 * 8);
            }
        } else {
            jArr = null;
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{bytesToWord(tweak, 0), bytesToWord(tweak, 8)};
        }
        init(z10, jArr, jArr2);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        long[] jArr;
        int i12 = this.f88622a;
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i11 + i12 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i13 = 0;
        while (true) {
            jArr = this.f88624c;
            if (i13 >= i12) {
                break;
            }
            jArr[i13 >> 3] = bytesToWord(bArr, i10 + i13);
            i13 += 8;
        }
        processBlock(jArr, jArr);
        for (int i14 = 0; i14 < i12; i14 += 8) {
            wordToBytes(jArr[i14 >> 3], bArr2, i11 + i14);
        }
        return i12;
    }

    public int processBlock(long[] jArr, long[] jArr2) throws IllegalStateException, DataLengthException {
        long[] jArr3 = this.f88626e;
        int i10 = this.f88623b;
        if (jArr3[i10] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i10) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i10) {
            throw new OutputLengthException("Output buffer too short");
        }
        boolean z10 = this.f88628g;
        d dVar = this.f88627f;
        if (z10) {
            dVar.b(jArr, jArr2);
        } else {
            dVar.a(jArr, jArr2);
        }
        return i10;
    }

    public void init(boolean z10, long[] jArr, long[] jArr2) {
        long[] jArr3;
        this.f88628g = z10;
        if (jArr != null) {
            int length = jArr.length;
            int i10 = this.f88623b;
            if (length != i10) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Threefish key must be same size as block (", i10, " words)"));
            }
            long j10 = 2004413935125273122L;
            int i11 = 0;
            while (true) {
                jArr3 = this.f88626e;
                if (i11 >= i10) {
                    break;
                }
                long j11 = jArr[i11];
                jArr3[i11] = j11;
                j10 ^= j11;
                i11++;
            }
            jArr3[i10] = j10;
            System.arraycopy(jArr3, 0, jArr3, i10 + 1, i10);
        }
        if (jArr2 != null) {
            if (jArr2.length != 2) {
                throw new IllegalArgumentException("Tweak must be 2 words.");
            }
            long j12 = jArr2[0];
            long[] jArr4 = this.f88625d;
            jArr4[0] = j12;
            long j13 = jArr2[1];
            jArr4[1] = j13;
            jArr4[2] = j12 ^ j13;
            jArr4[3] = j12;
            jArr4[4] = j13;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
