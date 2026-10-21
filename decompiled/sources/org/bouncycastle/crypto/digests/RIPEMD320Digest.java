package org.bouncycastle.crypto.digests;

import androidx.camera.camera2.internal.n1;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class RIPEMD320Digest extends GeneralDigest {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f88130l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f88131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f88132o;

    public RIPEMD320Digest() {
        this.f88131n = new int[16];
        reset();
    }

    public static int a(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static int c(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    public static int d(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    public static int e(int i10, int i11, int i12) {
        return (i10 | (~i11)) ^ i12;
    }

    public static int f(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    public static int g(int i10, int i11, int i12) {
        return i10 ^ (i11 | (~i12));
    }

    public static void h(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public final void b(RIPEMD320Digest rIPEMD320Digest) {
        super.copyIn(rIPEMD320Digest);
        this.f88122d = rIPEMD320Digest.f88122d;
        this.f88123e = rIPEMD320Digest.f88123e;
        this.f88124f = rIPEMD320Digest.f88124f;
        this.f88125g = rIPEMD320Digest.f88125g;
        this.f88126h = rIPEMD320Digest.f88126h;
        this.f88127i = rIPEMD320Digest.f88127i;
        this.f88128j = rIPEMD320Digest.f88128j;
        this.f88129k = rIPEMD320Digest.f88129k;
        this.f88130l = rIPEMD320Digest.f88130l;
        this.m = rIPEMD320Digest.m;
        int[] iArr = this.f88131n;
        int[] iArr2 = rIPEMD320Digest.f88131n;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f88132o = rIPEMD320Digest.f88132o;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD320Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        h(this.f88122d, i10, bArr);
        h(this.f88123e, i10 + 4, bArr);
        h(this.f88124f, i10 + 8, bArr);
        h(this.f88125g, i10 + 12, bArr);
        h(this.f88126h, i10 + 16, bArr);
        h(this.f88127i, i10 + 20, bArr);
        h(this.f88128j, i10 + 24, bArr);
        h(this.f88129k, i10 + 28, bArr);
        h(this.f88130l, i10 + 32, bArr);
        h(this.m, i10 + 36, bArr);
        reset();
        return 40;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD320";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 40;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10 = this.f88122d;
        int i11 = this.f88123e;
        int i12 = this.f88124f;
        int i13 = this.f88125g;
        int i14 = this.f88126h;
        int i15 = this.f88127i;
        int i16 = this.f88128j;
        int i17 = this.f88129k;
        int i18 = this.f88130l;
        int i19 = this.m;
        int i20 = ((i11 ^ i12) ^ i13) + i10;
        int[] iArr = this.f88131n;
        int iA = n1.a(i20, iArr[0], 11, i14);
        int iA2 = a(i12, 10);
        int iA3 = n1.a(((iA ^ i11) ^ iA2) + i14, iArr[1], 14, i13);
        int iA4 = a(i11, 10);
        int iA5 = n1.a(((iA3 ^ iA) ^ iA4) + i13, iArr[2], 15, iA2);
        int iA6 = a(iA, 10);
        int iA7 = n1.a(((iA5 ^ iA3) ^ iA6) + iA2, iArr[3], 12, iA4);
        int iA8 = a(iA3, 10);
        int iA9 = n1.a(((iA7 ^ iA5) ^ iA8) + iA4, iArr[4], 5, iA6);
        int iA10 = a(iA5, 10);
        int iA11 = n1.a(((iA9 ^ iA7) ^ iA10) + iA6, iArr[5], 8, iA8);
        int iA12 = a(iA7, 10);
        int iA13 = n1.a(((iA11 ^ iA9) ^ iA12) + iA8, iArr[6], 7, iA10);
        int iA14 = a(iA9, 10);
        int iA15 = n1.a(((iA13 ^ iA11) ^ iA14) + iA10, iArr[7], 9, iA12);
        int iA16 = a(iA11, 10);
        int iA17 = n1.a(((iA15 ^ iA13) ^ iA16) + iA12, iArr[8], 11, iA14);
        int iA18 = a(iA13, 10);
        int iA19 = a(((iA17 ^ iA15) ^ iA18) + iA14 + iArr[9], 13) + iA16;
        int iA20 = a(iA15, 10);
        int iA21 = n1.a(((iA19 ^ iA17) ^ iA20) + iA16, iArr[10], 14, iA18);
        int iA22 = a(iA17, 10);
        int iA23 = n1.a(((iA21 ^ iA19) ^ iA22) + iA18, iArr[11], 15, iA20);
        int iA24 = a(iA19, 10);
        int iA25 = n1.a(((iA23 ^ iA21) ^ iA24) + iA20, iArr[12], 6, iA22);
        int iA26 = a(iA21, 10);
        int iA27 = n1.a(((iA25 ^ iA23) ^ iA26) + iA22, iArr[13], 7, iA24);
        int iA28 = a(iA23, 10);
        int iA29 = n1.a(((iA27 ^ iA25) ^ iA28) + iA24, iArr[14], 9, iA26);
        int iA30 = a(iA25, 10);
        int iA31 = n1.a(((iA29 ^ iA27) ^ iA30) + iA26, iArr[15], 8, iA28);
        int iA32 = a(iA27, 10);
        int iA33 = a.a((((~i18) | i17) ^ i16) + i15, iArr[5], 1352829926, 8, i19);
        int iA34 = a(i17, 10);
        int iA35 = a.a((((~iA34) | i16) ^ iA33) + i19, iArr[14], 1352829926, 9, i18);
        int iA36 = a(i16, 10);
        int iA37 = a.a((((~iA36) | iA33) ^ iA35) + i18, iArr[7], 1352829926, 9, iA34);
        int iA38 = a(iA33, 10);
        int iA39 = a.a((((~iA38) | iA35) ^ iA37) + iA34, iArr[0], 1352829926, 11, iA36);
        int iA40 = a(iA35, 10);
        int iA41 = a.a((((~iA40) | iA37) ^ iA39) + iA36, iArr[9], 1352829926, 13, iA38);
        int iA42 = a(iA37, 10);
        int iA43 = a((((~iA42) | iA39) ^ iA41) + iA38 + iArr[2] + 1352829926, 15) + iA40;
        int iA44 = a(iA39, 10);
        int iA45 = a.a((((~iA44) | iA41) ^ iA43) + iA40, iArr[11], 1352829926, 15, iA42);
        int iA46 = a(iA41, 10);
        int iA47 = a.a((((~iA46) | iA43) ^ iA45) + iA42, iArr[4], 1352829926, 5, iA44);
        int iA48 = a(iA43, 10);
        int iA49 = a.a((((~iA48) | iA45) ^ iA47) + iA44, iArr[13], 1352829926, 7, iA46);
        int iA50 = a(iA45, 10);
        int iA51 = a.a((((~iA50) | iA47) ^ iA49) + iA46, iArr[6], 1352829926, 7, iA48);
        int iA52 = a(iA47, 10);
        int iA53 = a.a((((~iA52) | iA49) ^ iA51) + iA48, iArr[15], 1352829926, 8, iA50);
        int iA54 = a(iA49, 10);
        int iA55 = a.a((((~iA54) | iA51) ^ iA53) + iA50, iArr[8], 1352829926, 11, iA52);
        int iA56 = a(iA51, 10);
        int iA57 = a.a((((~iA56) | iA53) ^ iA55) + iA52, iArr[1], 1352829926, 14, iA54);
        int iA58 = a(iA53, 10);
        int iA59 = a.a((((~iA58) | iA55) ^ iA57) + iA54, iArr[10], 1352829926, 14, iA56);
        int iA60 = a(iA55, 10);
        int iA61 = a.a((((~iA60) | iA57) ^ iA59) + iA56, iArr[3], 1352829926, 12, iA58);
        int iA62 = a(iA57, 10);
        int iA63 = a.a((((~iA62) | iA59) ^ iA61) + iA58, iArr[12], 1352829926, 6, iA60);
        int iA64 = a(iA59, 10);
        int iA65 = a.a(d(iA63, iA29, iA32) + iA28, iArr[7], 1518500249, 7, iA30);
        int iA66 = a(iA29, 10);
        int iA67 = a.a(d(iA65, iA63, iA66) + iA30, iArr[4], 1518500249, 6, iA32);
        int iA68 = a(iA63, 10);
        int iA69 = a.a(d(iA67, iA65, iA68) + iA32, iArr[13], 1518500249, 8, iA66);
        int iA70 = a(iA65, 10);
        int iA71 = a.a(d(iA69, iA67, iA70) + iA66, iArr[1], 1518500249, 13, iA68);
        int iA72 = a(iA67, 10);
        int iA73 = a.a(d(iA71, iA69, iA72) + iA68, iArr[10], 1518500249, 11, iA70);
        int iA74 = a(iA69, 10);
        int iA75 = a.a(d(iA73, iA71, iA74) + iA70, iArr[6], 1518500249, 9, iA72);
        int iA76 = a(iA71, 10);
        int iA77 = a.a(d(iA75, iA73, iA76) + iA72, iArr[15], 1518500249, 7, iA74);
        int iA78 = a(iA73, 10);
        int iA79 = a.a(d(iA77, iA75, iA78) + iA74, iArr[3], 1518500249, 15, iA76);
        int iA80 = a(iA75, 10);
        int iA81 = a.a(d(iA79, iA77, iA80) + iA76, iArr[12], 1518500249, 7, iA78);
        int iA82 = a(iA77, 10);
        int iA83 = a.a(d(iA81, iA79, iA82) + iA78, iArr[0], 1518500249, 12, iA80);
        int iA84 = a(iA79, 10);
        int iA85 = a.a(d(iA83, iA81, iA84) + iA80, iArr[9], 1518500249, 15, iA82);
        int iA86 = a(iA81, 10);
        int iA87 = a.a(d(iA85, iA83, iA86) + iA82, iArr[5], 1518500249, 9, iA84);
        int iA88 = a(iA83, 10);
        int iA89 = a.a(d(iA87, iA85, iA88) + iA84, iArr[2], 1518500249, 11, iA86);
        int iA90 = a(iA85, 10);
        int iA91 = a.a(d(iA89, iA87, iA90) + iA86, iArr[14], 1518500249, 7, iA88);
        int iA92 = a(iA87, 10);
        int iA93 = a.a(d(iA91, iA89, iA92) + iA88, iArr[11], 1518500249, 13, iA90);
        int iA94 = a(iA89, 10);
        int iA95 = a.a(d(iA93, iA91, iA94) + iA90, iArr[8], 1518500249, 12, iA92);
        int iA96 = a(iA91, 10);
        int iA97 = a.a(f(iA31, iA61, iA64) + iA60, iArr[6], 1548603684, 9, iA62);
        int iA98 = a(iA61, 10);
        int iA99 = a.a(f(iA97, iA31, iA98) + iA62, iArr[11], 1548603684, 13, iA64);
        int iA100 = a(iA31, 10);
        int iA101 = a.a(f(iA99, iA97, iA100) + iA64, iArr[3], 1548603684, 15, iA98);
        int iA102 = a(iA97, 10);
        int iA103 = a.a(f(iA101, iA99, iA102) + iA98, iArr[7], 1548603684, 7, iA100);
        int iA104 = a(iA99, 10);
        int iA105 = a.a(f(iA103, iA101, iA104) + iA100, iArr[0], 1548603684, 12, iA102);
        int iA106 = a(iA101, 10);
        int iA107 = a.a(f(iA105, iA103, iA106) + iA102, iArr[13], 1548603684, 8, iA104);
        int iA108 = a(iA103, 10);
        int iA109 = a.a(f(iA107, iA105, iA108) + iA104, iArr[5], 1548603684, 9, iA106);
        int iA110 = a(iA105, 10);
        int iA111 = a.a(f(iA109, iA107, iA110) + iA106, iArr[10], 1548603684, 11, iA108);
        int iA112 = a(iA107, 10);
        int iA113 = a.a(f(iA111, iA109, iA112) + iA108, iArr[14], 1548603684, 7, iA110);
        int iA114 = a(iA109, 10);
        int iA115 = a.a(f(iA113, iA111, iA114) + iA110, iArr[15], 1548603684, 7, iA112);
        int iA116 = a(iA111, 10);
        int iA117 = a.a(f(iA115, iA113, iA116) + iA112, iArr[8], 1548603684, 12, iA114);
        int iA118 = a(iA113, 10);
        int iA119 = a.a(f(iA117, iA115, iA118) + iA114, iArr[12], 1548603684, 7, iA116);
        int iA120 = a(iA115, 10);
        int iA121 = a.a(f(iA119, iA117, iA120) + iA116, iArr[4], 1548603684, 6, iA118);
        int iA122 = a(iA117, 10);
        int iA123 = a.a(f(iA121, iA119, iA122) + iA118, iArr[9], 1548603684, 15, iA120);
        int iA124 = a(iA119, 10);
        int iA125 = a.a(f(iA123, iA121, iA124) + iA120, iArr[1], 1548603684, 13, iA122);
        int iA126 = a(iA121, 10);
        int iA127 = a.a(f(iA125, iA123, iA126) + iA122, iArr[2], 1548603684, 11, iA124);
        int iA128 = a(iA123, 10);
        int iA129 = a.a((((~iA93) | iA95) ^ iA128) + iA92, iArr[3], 1859775393, 11, iA94);
        int iA130 = a(iA93, 10);
        int iA131 = a.a((((~iA95) | iA129) ^ iA130) + iA94, iArr[10], 1859775393, 13, iA128);
        int iA132 = a(iA95, 10);
        int iA133 = a.a((((~iA129) | iA131) ^ iA132) + iA128, iArr[14], 1859775393, 6, iA130);
        int iA134 = a(iA129, 10);
        int iA135 = a.a((((~iA131) | iA133) ^ iA134) + iA130, iArr[4], 1859775393, 7, iA132);
        int iA136 = a(iA131, 10);
        int iA137 = a.a((((~iA133) | iA135) ^ iA136) + iA132, iArr[9], 1859775393, 14, iA134);
        int iA138 = a(iA133, 10);
        int iA139 = a.a((((~iA135) | iA137) ^ iA138) + iA134, iArr[15], 1859775393, 9, iA136);
        int iA140 = a(iA135, 10);
        int iA141 = a.a((((~iA137) | iA139) ^ iA140) + iA136, iArr[8], 1859775393, 13, iA138);
        int iA142 = a(iA137, 10);
        int iA143 = a.a((((~iA139) | iA141) ^ iA142) + iA138, iArr[1], 1859775393, 15, iA140);
        int iA144 = a(iA139, 10);
        int iA145 = a.a((((~iA141) | iA143) ^ iA144) + iA140, iArr[2], 1859775393, 14, iA142);
        int iA146 = a(iA141, 10);
        int iA147 = a.a((((~iA143) | iA145) ^ iA146) + iA142, iArr[7], 1859775393, 8, iA144);
        int iA148 = a(iA143, 10);
        int iA149 = a((((~iA145) | iA147) ^ iA148) + iA144 + iArr[0] + 1859775393, 13) + iA146;
        int iA150 = a(iA145, 10);
        int iA151 = a.a((((~iA147) | iA149) ^ iA150) + iA146, iArr[6], 1859775393, 6, iA148);
        int iA152 = a(iA147, 10);
        int iA153 = a.a((((~iA149) | iA151) ^ iA152) + iA148, iArr[13], 1859775393, 5, iA150);
        int iA154 = a(iA149, 10);
        int iA155 = a.a((((~iA151) | iA153) ^ iA154) + iA150, iArr[11], 1859775393, 12, iA152);
        int iA156 = a(iA151, 10);
        int iA157 = a.a((((~iA153) | iA155) ^ iA156) + iA152, iArr[5], 1859775393, 7, iA154);
        int iA158 = a(iA153, 10);
        int iA159 = a.a((((~iA155) | iA157) ^ iA158) + iA154, iArr[12], 1859775393, 5, iA156);
        int iA160 = a(iA155, 10);
        int iA161 = a.a((((~iA125) | iA127) ^ iA96) + iA124, iArr[15], 1836072691, 9, iA126);
        int iA162 = a(iA125, 10);
        int iA163 = a.a((((~iA127) | iA161) ^ iA162) + iA126, iArr[5], 1836072691, 7, iA96);
        int iA164 = a(iA127, 10);
        int iA165 = a.a((((~iA161) | iA163) ^ iA164) + iA96, iArr[1], 1836072691, 15, iA162);
        int iA166 = a(iA161, 10);
        int iA167 = a.a((((~iA163) | iA165) ^ iA166) + iA162, iArr[3], 1836072691, 11, iA164);
        int iA168 = a(iA163, 10);
        int iA169 = a.a((((~iA165) | iA167) ^ iA168) + iA164, iArr[7], 1836072691, 8, iA166);
        int iA170 = a(iA165, 10);
        int iA171 = a.a((((~iA167) | iA169) ^ iA170) + iA166, iArr[14], 1836072691, 6, iA168);
        int iA172 = a(iA167, 10);
        int iA173 = a.a((((~iA169) | iA171) ^ iA172) + iA168, iArr[6], 1836072691, 6, iA170);
        int iA174 = a(iA169, 10);
        int iA175 = a.a((((~iA171) | iA173) ^ iA174) + iA170, iArr[9], 1836072691, 14, iA172);
        int iA176 = a(iA171, 10);
        int iA177 = a.a(e(iA175, iA173, iA176) + iA172, iArr[11], 1836072691, 12, iA174);
        int iA178 = a(iA173, 10);
        int iA179 = a.a(e(iA177, iA175, iA178) + iA174, iArr[8], 1836072691, 13, iA176);
        int iA180 = a(iA175, 10);
        int iA181 = a.a(e(iA179, iA177, iA180) + iA176, iArr[12], 1836072691, 5, iA178);
        int iA182 = a(iA177, 10);
        int iA183 = a.a(e(iA181, iA179, iA182) + iA178, iArr[2], 1836072691, 14, iA180);
        int iA184 = a(iA179, 10);
        int iA185 = a.a(e(iA183, iA181, iA184) + iA180, iArr[10], 1836072691, 13, iA182);
        int iA186 = a(iA181, 10);
        int iA187 = a.a(e(iA185, iA183, iA186) + iA182, iArr[0], 1836072691, 13, iA184);
        int iA188 = a(iA183, 10);
        int iA189 = a.a(e(iA187, iA185, iA188) + iA184, iArr[4], 1836072691, 7, iA186);
        int iA190 = a(iA185, 10);
        int iA191 = a.a(e(iA189, iA187, iA190) + iA186, iArr[13], 1836072691, 5, iA188);
        int iA192 = a(iA187, 10);
        int iA193 = a.a(f(iA159, iA157, iA160) + iA188, iArr[1], -1894007588, 11, iA158);
        int iA194 = a(iA157, 10);
        int iA195 = a.a(f(iA193, iA159, iA194) + iA158, iArr[9], -1894007588, 12, iA160);
        int iA196 = a(iA159, 10);
        int iA197 = a.a(f(iA195, iA193, iA196) + iA160, iArr[11], -1894007588, 14, iA194);
        int iA198 = a(iA193, 10);
        int iA199 = a.a(f(iA197, iA195, iA198) + iA194, iArr[10], -1894007588, 15, iA196);
        int iA200 = a(iA195, 10);
        int iA201 = a.a(f(iA199, iA197, iA200) + iA196, iArr[0], -1894007588, 14, iA198);
        int iA202 = a(iA197, 10);
        int iA203 = a.a(f(iA201, iA199, iA202) + iA198, iArr[8], -1894007588, 15, iA200);
        int iA204 = a(iA199, 10);
        int iA205 = a.a(f(iA203, iA201, iA204) + iA200, iArr[12], -1894007588, 9, iA202);
        int iA206 = a(iA201, 10);
        int iA207 = a.a(f(iA205, iA203, iA206) + iA202, iArr[4], -1894007588, 8, iA204);
        int iA208 = a(iA203, 10);
        int iA209 = a.a(f(iA207, iA205, iA208) + iA204, iArr[13], -1894007588, 9, iA206);
        int iA210 = a(iA205, 10);
        int iA211 = a.a(f(iA209, iA207, iA210) + iA206, iArr[3], -1894007588, 14, iA208);
        int iA212 = a(iA207, 10);
        int iA213 = a.a(f(iA211, iA209, iA212) + iA208, iArr[7], -1894007588, 5, iA210);
        int iA214 = a(iA209, 10);
        int iA215 = a.a(f(iA213, iA211, iA214) + iA210, iArr[15], -1894007588, 6, iA212);
        int iA216 = a(iA211, 10);
        int iA217 = a.a(f(iA215, iA213, iA216) + iA212, iArr[14], -1894007588, 8, iA214);
        int iA218 = a(iA213, 10);
        int iA219 = a.a(f(iA217, iA215, iA218) + iA214, iArr[5], -1894007588, 6, iA216);
        int iA220 = a(iA215, 10);
        int iA221 = a.a(f(iA219, iA217, iA220) + iA216, iArr[6], -1894007588, 5, iA218);
        int iA222 = a(iA217, 10);
        int iA223 = a.a(f(iA221, iA219, iA222) + iA218, iArr[2], -1894007588, 12, iA220);
        int iA224 = a(iA219, 10);
        int iA225 = a.a(d(iA191, iA189, iA192) + iA156, iArr[8], 2053994217, 15, iA190);
        int iA226 = a(iA189, 10);
        int iA227 = a.a(d(iA225, iA191, iA226) + iA190, iArr[6], 2053994217, 5, iA192);
        int iA228 = a(iA191, 10);
        int iA229 = a.a(d(iA227, iA225, iA228) + iA192, iArr[4], 2053994217, 8, iA226);
        int iA230 = a(iA225, 10);
        int iA231 = a.a(d(iA229, iA227, iA230) + iA226, iArr[1], 2053994217, 11, iA228);
        int iA232 = a(iA227, 10);
        int iA233 = a.a(d(iA231, iA229, iA232) + iA228, iArr[3], 2053994217, 14, iA230);
        int iA234 = a(iA229, 10);
        int iA235 = a.a(d(iA233, iA231, iA234) + iA230, iArr[11], 2053994217, 14, iA232);
        int iA236 = a(iA231, 10);
        int iA237 = a.a(d(iA235, iA233, iA236) + iA232, iArr[15], 2053994217, 6, iA234);
        int iA238 = a(iA233, 10);
        int iA239 = a.a(d(iA237, iA235, iA238) + iA234, iArr[0], 2053994217, 14, iA236);
        int iA240 = a(iA235, 10);
        int iA241 = a.a(d(iA239, iA237, iA240) + iA236, iArr[5], 2053994217, 6, iA238);
        int iA242 = a(iA237, 10);
        int iA243 = a.a(d(iA241, iA239, iA242) + iA238, iArr[12], 2053994217, 9, iA240);
        int iA244 = a(iA239, 10);
        int iA245 = a.a(d(iA243, iA241, iA244) + iA240, iArr[2], 2053994217, 12, iA242);
        int iA246 = a(iA241, 10);
        int iA247 = a.a(d(iA245, iA243, iA246) + iA242, iArr[13], 2053994217, 9, iA244);
        int iA248 = a(iA243, 10);
        int iA249 = a.a(d(iA247, iA245, iA248) + iA244, iArr[9], 2053994217, 12, iA246);
        int iA250 = a(iA245, 10);
        int iA251 = a.a(d(iA249, iA247, iA250) + iA246, iArr[7], 2053994217, 5, iA248);
        int iA252 = a(iA247, 10);
        int iA253 = a.a(d(iA251, iA249, iA252) + iA248, iArr[10], 2053994217, 15, iA250);
        int iA254 = a(iA249, 10);
        int iA255 = a.a(d(iA253, iA251, iA254) + iA250, iArr[14], 2053994217, 8, iA252);
        int iA256 = a(iA251, 10);
        int iA257 = a.a(g(iA223, iA253, iA224) + iA220, iArr[4], -1454113458, 9, iA222);
        int iA258 = a(iA253, 10);
        int iA259 = a.a(g(iA257, iA223, iA258) + iA222, iArr[0], -1454113458, 15, iA224);
        int iA260 = a(iA223, 10);
        int iA261 = a.a(g(iA259, iA257, iA260) + iA224, iArr[5], -1454113458, 5, iA258);
        int iA262 = a(iA257, 10);
        int iA263 = a.a(g(iA261, iA259, iA262) + iA258, iArr[9], -1454113458, 11, iA260);
        int iA264 = a(iA259, 10);
        int iA265 = a.a(g(iA263, iA261, iA264) + iA260, iArr[7], -1454113458, 6, iA262);
        int iA266 = a(iA261, 10);
        int iA267 = a.a(g(iA265, iA263, iA266) + iA262, iArr[12], -1454113458, 8, iA264);
        int iA268 = a(iA263, 10);
        int iA269 = a.a(g(iA267, iA265, iA268) + iA264, iArr[2], -1454113458, 13, iA266);
        int iA270 = a(iA265, 10);
        int iA271 = a.a(g(iA269, iA267, iA270) + iA266, iArr[10], -1454113458, 12, iA268);
        int iA272 = a(iA267, 10);
        int iA273 = a.a(g(iA271, iA269, iA272) + iA268, iArr[14], -1454113458, 5, iA270);
        int iA274 = a(iA269, 10);
        int iA275 = a.a(g(iA273, iA271, iA274) + iA270, iArr[1], -1454113458, 12, iA272);
        int iA276 = a(iA271, 10);
        int iA277 = a.a(g(iA275, iA273, iA276) + iA272, iArr[3], -1454113458, 13, iA274);
        int iA278 = a(iA273, 10);
        int iA279 = a.a(g(iA277, iA275, iA278) + iA274, iArr[8], -1454113458, 14, iA276);
        int iA280 = a(iA275, 10);
        int iA281 = a.a(g(iA279, iA277, iA280) + iA276, iArr[11], -1454113458, 11, iA278);
        int iA282 = a(iA277, 10);
        int iA283 = a.a(g(iA281, iA279, iA282) + iA278, iArr[6], -1454113458, 8, iA280);
        int iA284 = a(iA279, 10);
        int iA285 = a.a(g(iA283, iA281, iA284) + iA280, iArr[15], -1454113458, 5, iA282);
        int iA286 = a(iA281, 10);
        int iA287 = a.a(g(iA285, iA283, iA286) + iA282, iArr[13], -1454113458, 6, iA284);
        int iA288 = a(iA283, 10);
        int iA289 = n1.a(c(iA255, iA221, iA256) + iA252, iArr[12], 8, iA254);
        int iA290 = a(iA221, 10);
        int iA291 = n1.a(c(iA289, iA255, iA290) + iA254, iArr[15], 5, iA256);
        int iA292 = a(iA255, 10);
        int iA293 = n1.a(c(iA291, iA289, iA292) + iA256, iArr[10], 12, iA290);
        int iA294 = a(iA289, 10);
        int iA295 = n1.a(c(iA293, iA291, iA294) + iA290, iArr[4], 9, iA292);
        int iA296 = a(iA291, 10);
        int iA297 = n1.a(c(iA295, iA293, iA296) + iA292, iArr[1], 12, iA294);
        int iA298 = a(iA293, 10);
        int iA299 = n1.a(c(iA297, iA295, iA298) + iA294, iArr[5], 5, iA296);
        int iA300 = a(iA295, 10);
        int iA301 = n1.a(c(iA299, iA297, iA300) + iA296, iArr[8], 14, iA298);
        int iA302 = a(iA297, 10);
        int iA303 = n1.a(c(iA301, iA299, iA302) + iA298, iArr[7], 6, iA300);
        int iA304 = a(iA299, 10);
        int iA305 = n1.a(c(iA303, iA301, iA304) + iA300, iArr[6], 8, iA302);
        int iA306 = a(iA301, 10);
        int iA307 = n1.a(c(iA305, iA303, iA306) + iA302, iArr[2], 13, iA304);
        int iA308 = a(iA303, 10);
        int iA309 = n1.a(c(iA307, iA305, iA308) + iA304, iArr[13], 6, iA306);
        int iA310 = a(iA305, 10);
        int iA311 = n1.a(c(iA309, iA307, iA310) + iA306, iArr[14], 5, iA308);
        int iA312 = a(iA307, 10);
        int iA313 = n1.a(c(iA311, iA309, iA312) + iA308, iArr[0], 15, iA310);
        int iA314 = a(iA309, 10);
        int iA315 = n1.a(c(iA313, iA311, iA314) + iA310, iArr[3], 13, iA312);
        int iA316 = a(iA311, 10);
        int iA317 = n1.a(c(iA315, iA313, iA316) + iA312, iArr[9], 11, iA314);
        int iA318 = a(iA313, 10);
        int iA319 = n1.a(c(iA317, iA315, iA318) + iA314, iArr[11], 11, iA316);
        int iA320 = a(iA315, 10);
        this.f88122d += iA284;
        this.f88123e += iA287;
        this.f88124f += iA285;
        this.f88125g += iA288;
        this.f88126h += iA318;
        this.f88127i += iA316;
        this.f88128j += iA319;
        this.f88129k += iA317;
        this.f88130l += iA320;
        this.m += iA286;
        this.f88132o = 0;
        for (int i21 = 0; i21 != iArr.length; i21++) {
            iArr[i21] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.f88132o > 14) {
            processBlock();
        }
        int[] iArr = this.f88131n;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = this.f88132o;
        int i12 = i11 + 1;
        this.f88132o = i12;
        this.f88131n[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f88122d = 1732584193;
        this.f88123e = -271733879;
        this.f88124f = -1732584194;
        this.f88125g = 271733878;
        this.f88126h = -1009589776;
        this.f88127i = 1985229328;
        this.f88128j = -19088744;
        this.f88129k = -1985229329;
        this.f88130l = 19088743;
        this.m = 1009589775;
        this.f88132o = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f88131n;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public RIPEMD320Digest(RIPEMD320Digest rIPEMD320Digest) {
        super(rIPEMD320Digest);
        this.f88131n = new int[16];
        b(rIPEMD320Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        b((RIPEMD320Digest) memoable);
    }
}
