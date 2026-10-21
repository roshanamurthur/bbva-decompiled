package org.bouncycastle.crypto.digests;

import bc.org.bouncycastle.math.ec.a;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class RIPEMD160Digest extends GeneralDigest {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f88111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88112j;

    public RIPEMD160Digest() {
        this.f88111i = new int[16];
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

    public final void b(RIPEMD160Digest rIPEMD160Digest) {
        super.copyIn(rIPEMD160Digest);
        this.f88106d = rIPEMD160Digest.f88106d;
        this.f88107e = rIPEMD160Digest.f88107e;
        this.f88108f = rIPEMD160Digest.f88108f;
        this.f88109g = rIPEMD160Digest.f88109g;
        this.f88110h = rIPEMD160Digest.f88110h;
        int[] iArr = this.f88111i;
        int[] iArr2 = rIPEMD160Digest.f88111i;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f88112j = rIPEMD160Digest.f88112j;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new RIPEMD160Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        h(this.f88106d, i10, bArr);
        h(this.f88107e, i10 + 4, bArr);
        h(this.f88108f, i10 + 8, bArr);
        h(this.f88109g, i10 + 12, bArr);
        h(this.f88110h, i10 + 16, bArr);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "RIPEMD160";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i10 = this.f88106d;
        int i11 = this.f88107e;
        int i12 = this.f88108f;
        int i13 = this.f88109g;
        int i14 = this.f88110h;
        int[] iArr = this.f88111i;
        int iD = a.d(((i11 ^ i12) ^ i13) + i10, iArr[0], 11, i14);
        int iA = a(i12, 10);
        int iD2 = a.d(((iD ^ i11) ^ iA) + i14, iArr[1], 14, i13);
        int iA2 = a(i11, 10);
        int iD3 = a.d(((iD2 ^ iD) ^ iA2) + i13, iArr[2], 15, iA);
        int iA3 = a(iD, 10);
        int iD4 = a.d(((iD3 ^ iD2) ^ iA3) + iA, iArr[3], 12, iA2);
        int iA4 = a(iD2, 10);
        int iD5 = a.d(((iD4 ^ iD3) ^ iA4) + iA2, iArr[4], 5, iA3);
        int iA5 = a(iD3, 10);
        int iD6 = a.d(((iD5 ^ iD4) ^ iA5) + iA3, iArr[5], 8, iA4);
        int iA6 = a(iD4, 10);
        int iD7 = a.d(((iD6 ^ iD5) ^ iA6) + iA4, iArr[6], 7, iA5);
        int iA7 = a(iD5, 10);
        int iD8 = a.d(((iD7 ^ iD6) ^ iA7) + iA5, iArr[7], 9, iA6);
        int iA8 = a(iD6, 10);
        int iD9 = a.d(((iD8 ^ iD7) ^ iA8) + iA6, iArr[8], 11, iA7);
        int iA9 = a(iD7, 10);
        int iD10 = a.d(((iD9 ^ iD8) ^ iA9) + iA7, iArr[9], 13, iA8);
        int iA10 = a(iD8, 10);
        int iD11 = a.d(((iD10 ^ iD9) ^ iA10) + iA8, iArr[10], 14, iA9);
        int iA11 = a(iD9, 10);
        int iD12 = a.d(((iD11 ^ iD10) ^ iA11) + iA9, iArr[11], 15, iA10);
        int iA12 = a(iD10, 10);
        int iD13 = a.d(((iD12 ^ iD11) ^ iA12) + iA10, iArr[12], 6, iA11);
        int iA13 = a(iD11, 10);
        int iD14 = a.d(((iD13 ^ iD12) ^ iA13) + iA11, iArr[13], 7, iA12);
        int iA14 = a(iD12, 10);
        int iD15 = a.d(((iD14 ^ iD13) ^ iA14) + iA12, iArr[14], 9, iA13);
        int iA15 = a(iD13, 10);
        int iD16 = a.d(((iD15 ^ iD14) ^ iA15) + iA13, iArr[15], 8, iA14);
        int iA16 = a(iD14, 10);
        int iE = ai.a.e((((~i13) | i12) ^ i11) + i10, iArr[5], 1352829926, 8, i14);
        int iA17 = a(i12, 10);
        int iE2 = ai.a.e((((~iA17) | i11) ^ iE) + i14, iArr[14], 1352829926, 9, i13);
        int iA18 = a(i11, 10);
        int iE3 = ai.a.e((((~iA18) | iE) ^ iE2) + i13, iArr[7], 1352829926, 9, iA17);
        int iA19 = a(iE, 10);
        int iE4 = ai.a.e((((~iA19) | iE2) ^ iE3) + iA17, iArr[0], 1352829926, 11, iA18);
        int iA20 = a(iE2, 10);
        int iE5 = ai.a.e((((~iA20) | iE3) ^ iE4) + iA18, iArr[9], 1352829926, 13, iA19);
        int iA21 = a(iE3, 10);
        int iA22 = a((((~iA21) | iE4) ^ iE5) + iA19 + iArr[2] + 1352829926, 15) + iA20;
        int iA23 = a(iE4, 10);
        int iE6 = ai.a.e((((~iA23) | iE5) ^ iA22) + iA20, iArr[11], 1352829926, 15, iA21);
        int iA24 = a(iE5, 10);
        int iE7 = ai.a.e((((~iA24) | iA22) ^ iE6) + iA21, iArr[4], 1352829926, 5, iA23);
        int iA25 = a(iA22, 10);
        int iE8 = ai.a.e((((~iA25) | iE6) ^ iE7) + iA23, iArr[13], 1352829926, 7, iA24);
        int iA26 = a(iE6, 10);
        int iE9 = ai.a.e((((~iA26) | iE7) ^ iE8) + iA24, iArr[6], 1352829926, 7, iA25);
        int iA27 = a(iE7, 10);
        int iE10 = ai.a.e((((~iA27) | iE8) ^ iE9) + iA25, iArr[15], 1352829926, 8, iA26);
        int iA28 = a(iE8, 10);
        int iE11 = ai.a.e((((~iA28) | iE9) ^ iE10) + iA26, iArr[8], 1352829926, 11, iA27);
        int iA29 = a(iE9, 10);
        int iE12 = ai.a.e((((~iA29) | iE10) ^ iE11) + iA27, iArr[1], 1352829926, 14, iA28);
        int iA30 = a(iE10, 10);
        int iE13 = ai.a.e((((~iA30) | iE11) ^ iE12) + iA28, iArr[10], 1352829926, 14, iA29);
        int iA31 = a(iE11, 10);
        int iE14 = ai.a.e((((~iA31) | iE12) ^ iE13) + iA29, iArr[3], 1352829926, 12, iA30);
        int iA32 = a(iE12, 10);
        int iE15 = ai.a.e((((~iA32) | iE13) ^ iE14) + iA30, iArr[12], 1352829926, 6, iA31);
        int iA33 = a(iE13, 10);
        int iE16 = ai.a.e(d(iD16, iD15, iA16) + iA14, iArr[7], 1518500249, 7, iA15);
        int iA34 = a(iD15, 10);
        int iE17 = ai.a.e(d(iE16, iD16, iA34) + iA15, iArr[4], 1518500249, 6, iA16);
        int iA35 = a(iD16, 10);
        int iE18 = ai.a.e(d(iE17, iE16, iA35) + iA16, iArr[13], 1518500249, 8, iA34);
        int iA36 = a(iE16, 10);
        int iE19 = ai.a.e(d(iE18, iE17, iA36) + iA34, iArr[1], 1518500249, 13, iA35);
        int iA37 = a(iE17, 10);
        int iE20 = ai.a.e(d(iE19, iE18, iA37) + iA35, iArr[10], 1518500249, 11, iA36);
        int iA38 = a(iE18, 10);
        int iE21 = ai.a.e(d(iE20, iE19, iA38) + iA36, iArr[6], 1518500249, 9, iA37);
        int iA39 = a(iE19, 10);
        int iE22 = ai.a.e(d(iE21, iE20, iA39) + iA37, iArr[15], 1518500249, 7, iA38);
        int iA40 = a(iE20, 10);
        int iE23 = ai.a.e(d(iE22, iE21, iA40) + iA38, iArr[3], 1518500249, 15, iA39);
        int iA41 = a(iE21, 10);
        int iE24 = ai.a.e(d(iE23, iE22, iA41) + iA39, iArr[12], 1518500249, 7, iA40);
        int iA42 = a(iE22, 10);
        int iE25 = ai.a.e(d(iE24, iE23, iA42) + iA40, iArr[0], 1518500249, 12, iA41);
        int iA43 = a(iE23, 10);
        int iE26 = ai.a.e(d(iE25, iE24, iA43) + iA41, iArr[9], 1518500249, 15, iA42);
        int iA44 = a(iE24, 10);
        int iE27 = ai.a.e(d(iE26, iE25, iA44) + iA42, iArr[5], 1518500249, 9, iA43);
        int iA45 = a(iE25, 10);
        int iE28 = ai.a.e(d(iE27, iE26, iA45) + iA43, iArr[2], 1518500249, 11, iA44);
        int iA46 = a(iE26, 10);
        int iE29 = ai.a.e(d(iE28, iE27, iA46) + iA44, iArr[14], 1518500249, 7, iA45);
        int iA47 = a(iE27, 10);
        int iE30 = ai.a.e(d(iE29, iE28, iA47) + iA45, iArr[11], 1518500249, 13, iA46);
        int iA48 = a(iE28, 10);
        int iE31 = ai.a.e(d(iE30, iE29, iA48) + iA46, iArr[8], 1518500249, 12, iA47);
        int iA49 = a(iE29, 10);
        int iE32 = ai.a.e(f(iE15, iE14, iA33) + iA31, iArr[6], 1548603684, 9, iA32);
        int iA50 = a(iE14, 10);
        int iE33 = ai.a.e(f(iE32, iE15, iA50) + iA32, iArr[11], 1548603684, 13, iA33);
        int iA51 = a(iE15, 10);
        int iE34 = ai.a.e(f(iE33, iE32, iA51) + iA33, iArr[3], 1548603684, 15, iA50);
        int iA52 = a(iE32, 10);
        int iE35 = ai.a.e(f(iE34, iE33, iA52) + iA50, iArr[7], 1548603684, 7, iA51);
        int iA53 = a(iE33, 10);
        int iE36 = ai.a.e(f(iE35, iE34, iA53) + iA51, iArr[0], 1548603684, 12, iA52);
        int iA54 = a(iE34, 10);
        int iE37 = ai.a.e(f(iE36, iE35, iA54) + iA52, iArr[13], 1548603684, 8, iA53);
        int iA55 = a(iE35, 10);
        int iE38 = ai.a.e(f(iE37, iE36, iA55) + iA53, iArr[5], 1548603684, 9, iA54);
        int iA56 = a(iE36, 10);
        int iE39 = ai.a.e(f(iE38, iE37, iA56) + iA54, iArr[10], 1548603684, 11, iA55);
        int iA57 = a(iE37, 10);
        int iE40 = ai.a.e(f(iE39, iE38, iA57) + iA55, iArr[14], 1548603684, 7, iA56);
        int iA58 = a(iE38, 10);
        int iE41 = ai.a.e(f(iE40, iE39, iA58) + iA56, iArr[15], 1548603684, 7, iA57);
        int iA59 = a(iE39, 10);
        int iE42 = ai.a.e(f(iE41, iE40, iA59) + iA57, iArr[8], 1548603684, 12, iA58);
        int iA60 = a(iE40, 10);
        int iE43 = ai.a.e(f(iE42, iE41, iA60) + iA58, iArr[12], 1548603684, 7, iA59);
        int iA61 = a(iE41, 10);
        int iE44 = ai.a.e(f(iE43, iE42, iA61) + iA59, iArr[4], 1548603684, 6, iA60);
        int iA62 = a(iE42, 10);
        int iE45 = ai.a.e(f(iE44, iE43, iA62) + iA60, iArr[9], 1548603684, 15, iA61);
        int iA63 = a(iE43, 10);
        int iE46 = ai.a.e(f(iE45, iE44, iA63) + iA61, iArr[1], 1548603684, 13, iA62);
        int iA64 = a(iE44, 10);
        int iE47 = ai.a.e(f(iE46, iE45, iA64) + iA62, iArr[2], 1548603684, 11, iA63);
        int iA65 = a(iE45, 10);
        int iE48 = ai.a.e((((~iE30) | iE31) ^ iA49) + iA47, iArr[3], 1859775393, 11, iA48);
        int iA66 = a(iE30, 10);
        int iE49 = ai.a.e((((~iE31) | iE48) ^ iA66) + iA48, iArr[10], 1859775393, 13, iA49);
        int iA67 = a(iE31, 10);
        int iE50 = ai.a.e((((~iE48) | iE49) ^ iA67) + iA49, iArr[14], 1859775393, 6, iA66);
        int iA68 = a(iE48, 10);
        int iE51 = ai.a.e((((~iE49) | iE50) ^ iA68) + iA66, iArr[4], 1859775393, 7, iA67);
        int iA69 = a(iE49, 10);
        int iE52 = ai.a.e((((~iE50) | iE51) ^ iA69) + iA67, iArr[9], 1859775393, 14, iA68);
        int iA70 = a(iE50, 10);
        int iE53 = ai.a.e((((~iE51) | iE52) ^ iA70) + iA68, iArr[15], 1859775393, 9, iA69);
        int iA71 = a(iE51, 10);
        int iE54 = ai.a.e((((~iE52) | iE53) ^ iA71) + iA69, iArr[8], 1859775393, 13, iA70);
        int iA72 = a(iE52, 10);
        int iE55 = ai.a.e((((~iE53) | iE54) ^ iA72) + iA70, iArr[1], 1859775393, 15, iA71);
        int iA73 = a(iE53, 10);
        int iE56 = ai.a.e((((~iE54) | iE55) ^ iA73) + iA71, iArr[2], 1859775393, 14, iA72);
        int iA74 = a(iE54, 10);
        int iE57 = ai.a.e((((~iE55) | iE56) ^ iA74) + iA72, iArr[7], 1859775393, 8, iA73);
        int iA75 = a(iE55, 10);
        int iA76 = a((((~iE56) | iE57) ^ iA75) + iA73 + iArr[0] + 1859775393, 13) + iA74;
        int iA77 = a(iE56, 10);
        int iE58 = ai.a.e((((~iE57) | iA76) ^ iA77) + iA74, iArr[6], 1859775393, 6, iA75);
        int iA78 = a(iE57, 10);
        int iE59 = ai.a.e((((~iA76) | iE58) ^ iA78) + iA75, iArr[13], 1859775393, 5, iA77);
        int iA79 = a(iA76, 10);
        int iE60 = ai.a.e((((~iE58) | iE59) ^ iA79) + iA77, iArr[11], 1859775393, 12, iA78);
        int iA80 = a(iE58, 10);
        int iE61 = ai.a.e((((~iE59) | iE60) ^ iA80) + iA78, iArr[5], 1859775393, 7, iA79);
        int iA81 = a(iE59, 10);
        int iE62 = ai.a.e((((~iE60) | iE61) ^ iA81) + iA79, iArr[12], 1859775393, 5, iA80);
        int iA82 = a(iE60, 10);
        int iE63 = ai.a.e((((~iE46) | iE47) ^ iA65) + iA63, iArr[15], 1836072691, 9, iA64);
        int iA83 = a(iE46, 10);
        int iE64 = ai.a.e((((~iE47) | iE63) ^ iA83) + iA64, iArr[5], 1836072691, 7, iA65);
        int iA84 = a(iE47, 10);
        int iE65 = ai.a.e((((~iE63) | iE64) ^ iA84) + iA65, iArr[1], 1836072691, 15, iA83);
        int iA85 = a(iE63, 10);
        int iE66 = ai.a.e((((~iE64) | iE65) ^ iA85) + iA83, iArr[3], 1836072691, 11, iA84);
        int iA86 = a(iE64, 10);
        int iE67 = ai.a.e((((~iE65) | iE66) ^ iA86) + iA84, iArr[7], 1836072691, 8, iA85);
        int iA87 = a(iE65, 10);
        int iE68 = ai.a.e((((~iE66) | iE67) ^ iA87) + iA85, iArr[14], 1836072691, 6, iA86);
        int iA88 = a(iE66, 10);
        int iE69 = ai.a.e((((~iE67) | iE68) ^ iA88) + iA86, iArr[6], 1836072691, 6, iA87);
        int iA89 = a(iE67, 10);
        int iE70 = ai.a.e((((~iE68) | iE69) ^ iA89) + iA87, iArr[9], 1836072691, 14, iA88);
        int iA90 = a(iE68, 10);
        int iE71 = ai.a.e((((~iE69) | iE70) ^ iA90) + iA88, iArr[11], 1836072691, 12, iA89);
        int iA91 = a(iE69, 10);
        int iE72 = ai.a.e((((~iE70) | iE71) ^ iA91) + iA89, iArr[8], 1836072691, 13, iA90);
        int iA92 = a(iE70, 10);
        int iE73 = ai.a.e((((~iE71) | iE72) ^ iA92) + iA90, iArr[12], 1836072691, 5, iA91);
        int iA93 = a(iE71, 10);
        int iE74 = ai.a.e((((~iE72) | iE73) ^ iA93) + iA91, iArr[2], 1836072691, 14, iA92);
        int iA94 = a(iE72, 10);
        int iE75 = ai.a.e((((~iE73) | iE74) ^ iA94) + iA92, iArr[10], 1836072691, 13, iA93);
        int iA95 = a(iE73, 10);
        int iE76 = ai.a.e(e(iE75, iE74, iA95) + iA93, iArr[0], 1836072691, 13, iA94);
        int iA96 = a(iE74, 10);
        int iE77 = ai.a.e(e(iE76, iE75, iA96) + iA94, iArr[4], 1836072691, 7, iA95);
        int iA97 = a(iE75, 10);
        int iE78 = ai.a.e(e(iE77, iE76, iA97) + iA95, iArr[13], 1836072691, 5, iA96);
        int iA98 = a(iE76, 10);
        int iE79 = ai.a.e(f(iE62, iE61, iA82) + iA80, iArr[1], -1894007588, 11, iA81);
        int iA99 = a(iE61, 10);
        int iE80 = ai.a.e(f(iE79, iE62, iA99) + iA81, iArr[9], -1894007588, 12, iA82);
        int iA100 = a(iE62, 10);
        int iE81 = ai.a.e(f(iE80, iE79, iA100) + iA82, iArr[11], -1894007588, 14, iA99);
        int iA101 = a(iE79, 10);
        int iE82 = ai.a.e(f(iE81, iE80, iA101) + iA99, iArr[10], -1894007588, 15, iA100);
        int iA102 = a(iE80, 10);
        int iE83 = ai.a.e(f(iE82, iE81, iA102) + iA100, iArr[0], -1894007588, 14, iA101);
        int iA103 = a(iE81, 10);
        int iE84 = ai.a.e(f(iE83, iE82, iA103) + iA101, iArr[8], -1894007588, 15, iA102);
        int iA104 = a(iE82, 10);
        int iE85 = ai.a.e(f(iE84, iE83, iA104) + iA102, iArr[12], -1894007588, 9, iA103);
        int iA105 = a(iE83, 10);
        int iE86 = ai.a.e(f(iE85, iE84, iA105) + iA103, iArr[4], -1894007588, 8, iA104);
        int iA106 = a(iE84, 10);
        int iE87 = ai.a.e(f(iE86, iE85, iA106) + iA104, iArr[13], -1894007588, 9, iA105);
        int iA107 = a(iE85, 10);
        int iE88 = ai.a.e(f(iE87, iE86, iA107) + iA105, iArr[3], -1894007588, 14, iA106);
        int iA108 = a(iE86, 10);
        int iE89 = ai.a.e(f(iE88, iE87, iA108) + iA106, iArr[7], -1894007588, 5, iA107);
        int iA109 = a(iE87, 10);
        int iE90 = ai.a.e(f(iE89, iE88, iA109) + iA107, iArr[15], -1894007588, 6, iA108);
        int iA110 = a(iE88, 10);
        int iE91 = ai.a.e(f(iE90, iE89, iA110) + iA108, iArr[14], -1894007588, 8, iA109);
        int iA111 = a(iE89, 10);
        int iE92 = ai.a.e(f(iE91, iE90, iA111) + iA109, iArr[5], -1894007588, 6, iA110);
        int iA112 = a(iE90, 10);
        int iE93 = ai.a.e(f(iE92, iE91, iA112) + iA110, iArr[6], -1894007588, 5, iA111);
        int iA113 = a(iE91, 10);
        int iE94 = ai.a.e(f(iE93, iE92, iA113) + iA111, iArr[2], -1894007588, 12, iA112);
        int iA114 = a(iE92, 10);
        int iE95 = ai.a.e(d(iE78, iE77, iA98) + iA96, iArr[8], 2053994217, 15, iA97);
        int iA115 = a(iE77, 10);
        int iE96 = ai.a.e(d(iE95, iE78, iA115) + iA97, iArr[6], 2053994217, 5, iA98);
        int iA116 = a(iE78, 10);
        int iE97 = ai.a.e(d(iE96, iE95, iA116) + iA98, iArr[4], 2053994217, 8, iA115);
        int iA117 = a(iE95, 10);
        int iE98 = ai.a.e(d(iE97, iE96, iA117) + iA115, iArr[1], 2053994217, 11, iA116);
        int iA118 = a(iE96, 10);
        int iE99 = ai.a.e(d(iE98, iE97, iA118) + iA116, iArr[3], 2053994217, 14, iA117);
        int iA119 = a(iE97, 10);
        int iE100 = ai.a.e(d(iE99, iE98, iA119) + iA117, iArr[11], 2053994217, 14, iA118);
        int iA120 = a(iE98, 10);
        int iE101 = ai.a.e(d(iE100, iE99, iA120) + iA118, iArr[15], 2053994217, 6, iA119);
        int iA121 = a(iE99, 10);
        int iE102 = ai.a.e(d(iE101, iE100, iA121) + iA119, iArr[0], 2053994217, 14, iA120);
        int iA122 = a(iE100, 10);
        int iE103 = ai.a.e(d(iE102, iE101, iA122) + iA120, iArr[5], 2053994217, 6, iA121);
        int iA123 = a(iE101, 10);
        int iE104 = ai.a.e(d(iE103, iE102, iA123) + iA121, iArr[12], 2053994217, 9, iA122);
        int iA124 = a(iE102, 10);
        int iE105 = ai.a.e(d(iE104, iE103, iA124) + iA122, iArr[2], 2053994217, 12, iA123);
        int iA125 = a(iE103, 10);
        int iE106 = ai.a.e(d(iE105, iE104, iA125) + iA123, iArr[13], 2053994217, 9, iA124);
        int iA126 = a(iE104, 10);
        int iE107 = ai.a.e(d(iE106, iE105, iA126) + iA124, iArr[9], 2053994217, 12, iA125);
        int iA127 = a(iE105, 10);
        int iE108 = ai.a.e(d(iE107, iE106, iA127) + iA125, iArr[7], 2053994217, 5, iA126);
        int iA128 = a(iE106, 10);
        int iE109 = ai.a.e(d(iE108, iE107, iA128) + iA126, iArr[10], 2053994217, 15, iA127);
        int iA129 = a(iE107, 10);
        int iE110 = ai.a.e(d(iE109, iE108, iA129) + iA127, iArr[14], 2053994217, 8, iA128);
        int iA130 = a(iE108, 10);
        int iE111 = ai.a.e(g(iE94, iE93, iA114) + iA112, iArr[4], -1454113458, 9, iA113);
        int iA131 = a(iE93, 10);
        int iE112 = ai.a.e(g(iE111, iE94, iA131) + iA113, iArr[0], -1454113458, 15, iA114);
        int iA132 = a(iE94, 10);
        int iE113 = ai.a.e(g(iE112, iE111, iA132) + iA114, iArr[5], -1454113458, 5, iA131);
        int iA133 = a(iE111, 10);
        int iE114 = ai.a.e(g(iE113, iE112, iA133) + iA131, iArr[9], -1454113458, 11, iA132);
        int iA134 = a(iE112, 10);
        int iE115 = ai.a.e(g(iE114, iE113, iA134) + iA132, iArr[7], -1454113458, 6, iA133);
        int iA135 = a(iE113, 10);
        int iE116 = ai.a.e(g(iE115, iE114, iA135) + iA133, iArr[12], -1454113458, 8, iA134);
        int iA136 = a(iE114, 10);
        int iE117 = ai.a.e(g(iE116, iE115, iA136) + iA134, iArr[2], -1454113458, 13, iA135);
        int iA137 = a(iE115, 10);
        int iE118 = ai.a.e(g(iE117, iE116, iA137) + iA135, iArr[10], -1454113458, 12, iA136);
        int iA138 = a(iE116, 10);
        int iE119 = ai.a.e(g(iE118, iE117, iA138) + iA136, iArr[14], -1454113458, 5, iA137);
        int iA139 = a(iE117, 10);
        int iE120 = ai.a.e(g(iE119, iE118, iA139) + iA137, iArr[1], -1454113458, 12, iA138);
        int iA140 = a(iE118, 10);
        int iE121 = ai.a.e(g(iE120, iE119, iA140) + iA138, iArr[3], -1454113458, 13, iA139);
        int iA141 = a(iE119, 10);
        int iE122 = ai.a.e(g(iE121, iE120, iA141) + iA139, iArr[8], -1454113458, 14, iA140);
        int iA142 = a(iE120, 10);
        int iE123 = ai.a.e(g(iE122, iE121, iA142) + iA140, iArr[11], -1454113458, 11, iA141);
        int iA143 = a(iE121, 10);
        int iE124 = ai.a.e(g(iE123, iE122, iA143) + iA141, iArr[6], -1454113458, 8, iA142);
        int iA144 = a(iE122, 10);
        int iE125 = ai.a.e(g(iE124, iE123, iA144) + iA142, iArr[15], -1454113458, 5, iA143);
        int iA145 = a(iE123, 10);
        int iE126 = ai.a.e(g(iE125, iE124, iA145) + iA143, iArr[13], -1454113458, 6, iA144);
        int iA146 = a(iE124, 10);
        int iD17 = a.d(c(iE110, iE109, iA130) + iA128, iArr[12], 8, iA129);
        int iA147 = a(iE109, 10);
        int iD18 = a.d(c(iD17, iE110, iA147) + iA129, iArr[15], 5, iA130);
        int iA148 = a(iE110, 10);
        int iD19 = a.d(c(iD18, iD17, iA148) + iA130, iArr[10], 12, iA147);
        int iA149 = a(iD17, 10);
        int iD20 = a.d(c(iD19, iD18, iA149) + iA147, iArr[4], 9, iA148);
        int iA150 = a(iD18, 10);
        int iD21 = a.d(c(iD20, iD19, iA150) + iA148, iArr[1], 12, iA149);
        int iA151 = a(iD19, 10);
        int iD22 = a.d(c(iD21, iD20, iA151) + iA149, iArr[5], 5, iA150);
        int iA152 = a(iD20, 10);
        int iD23 = a.d(c(iD22, iD21, iA152) + iA150, iArr[8], 14, iA151);
        int iA153 = a(iD21, 10);
        int iD24 = a.d(c(iD23, iD22, iA153) + iA151, iArr[7], 6, iA152);
        int iA154 = a(iD22, 10);
        int iD25 = a.d(c(iD24, iD23, iA154) + iA152, iArr[6], 8, iA153);
        int iA155 = a(iD23, 10);
        int iD26 = a.d(c(iD25, iD24, iA155) + iA153, iArr[2], 13, iA154);
        int iA156 = a(iD24, 10);
        int iD27 = a.d(c(iD26, iD25, iA156) + iA154, iArr[13], 6, iA155);
        int iA157 = a(iD25, 10);
        int iD28 = a.d(c(iD27, iD26, iA157) + iA155, iArr[14], 5, iA156);
        int iA158 = a(iD26, 10);
        int iD29 = a.d(c(iD28, iD27, iA158) + iA156, iArr[0], 15, iA157);
        int iA159 = a(iD27, 10);
        int iD30 = a.d(c(iD29, iD28, iA159) + iA157, iArr[3], 13, iA158);
        int iA160 = a(iD28, 10);
        int iD31 = a.d(c(iD30, iD29, iA160) + iA158, iArr[9], 11, iA159);
        int iA161 = a(iD29, 10);
        int iD32 = a.d(c(iD31, iD30, iA161) + iA159, iArr[11], 11, iA160);
        int iA162 = iE125 + this.f88107e + a(iD30, 10);
        this.f88107e = this.f88108f + iA146 + iA161;
        this.f88108f = this.f88109g + iA145 + iA160;
        this.f88109g = this.f88110h + iA144 + iD32;
        this.f88110h = this.f88106d + iE126 + iD31;
        this.f88106d = iA162;
        this.f88112j = 0;
        for (int i15 = 0; i15 != iArr.length; i15++) {
            iArr[i15] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.f88112j > 14) {
            processBlock();
        }
        int[] iArr = this.f88111i;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i10) {
        int i11 = this.f88112j;
        int i12 = i11 + 1;
        this.f88112j = i12;
        this.f88111i[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f88106d = 1732584193;
        this.f88107e = -271733879;
        this.f88108f = -1732584194;
        this.f88109g = 271733878;
        this.f88110h = -1009589776;
        this.f88112j = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f88111i;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public RIPEMD160Digest(RIPEMD160Digest rIPEMD160Digest) {
        super(rIPEMD160Digest);
        this.f88111i = new int[16];
        b(rIPEMD160Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        b((RIPEMD160Digest) memoable);
    }
}
