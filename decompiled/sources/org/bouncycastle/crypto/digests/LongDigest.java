package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f88073g = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f88076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f88077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f88078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88079f;

    public LongDigest() {
        this.f88074a = new byte[8];
        this.f88078e = new long[80];
        this.f88075b = 0;
        reset();
    }

    public static long a(long j10, long j11, long j12) {
        return ((~j10) & j12) ^ (j11 & j10);
    }

    public static long b(long j10, long j11, long j12) {
        return ((j10 & j12) ^ (j10 & j11)) ^ (j11 & j12);
    }

    public static long c(long j10) {
        return ((j10 >>> 39) | (j10 << 25)) ^ (((j10 << 36) | (j10 >>> 28)) ^ ((j10 << 30) | (j10 >>> 34)));
    }

    public static long d(long j10) {
        return ((j10 >>> 41) | (j10 << 23)) ^ (((j10 << 50) | (j10 >>> 14)) ^ ((j10 << 46) | (j10 >>> 18)));
    }

    public void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.f88074a;
        System.arraycopy(bArr, 0, this.f88074a, 0, bArr.length);
        this.f88075b = longDigest.f88075b;
        this.f88076c = longDigest.f88076c;
        this.f88077d = longDigest.f88077d;
        this.H1 = longDigest.H1;
        this.H2 = longDigest.H2;
        this.H3 = longDigest.H3;
        this.H4 = longDigest.H4;
        this.H5 = longDigest.H5;
        this.H6 = longDigest.H6;
        this.H7 = longDigest.H7;
        this.H8 = longDigest.H8;
        long[] jArr = this.f88078e;
        long[] jArr2 = longDigest.f88078e;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.f88079f = longDigest.f88079f;
    }

    public void finish() {
        long j10 = this.f88076c;
        if (j10 > 2305843009213693951L) {
            this.f88077d += j10 >>> 61;
            this.f88076c = j10 & 2305843009213693951L;
        }
        long j11 = this.f88076c << 3;
        long j12 = this.f88077d;
        byte b10 = -128;
        while (true) {
            update(b10);
            if (this.f88075b == 0) {
                processLength(j11, j12);
                processBlock();
                return;
            }
            b10 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    public int getEncodedStateSize() {
        return (this.f88079f * 8) + 96;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.f88074a, 0, bArr, 0, this.f88075b);
        Pack.intToBigEndian(this.f88075b, bArr, 8);
        Pack.longToBigEndian(this.f88076c, bArr, 12);
        Pack.longToBigEndian(this.f88077d, bArr, 20);
        Pack.longToBigEndian(this.H1, bArr, 28);
        Pack.longToBigEndian(this.H2, bArr, 36);
        Pack.longToBigEndian(this.H3, bArr, 44);
        Pack.longToBigEndian(this.H4, bArr, 52);
        Pack.longToBigEndian(this.H5, bArr, 60);
        Pack.longToBigEndian(this.H6, bArr, 68);
        Pack.longToBigEndian(this.H7, bArr, 76);
        Pack.longToBigEndian(this.H8, bArr, 84);
        Pack.intToBigEndian(this.f88079f, bArr, 92);
        for (int i10 = 0; i10 < this.f88079f; i10++) {
            Pack.longToBigEndian(this.f88078e[i10], bArr, (i10 * 8) + 96);
        }
    }

    public void processBlock() {
        long[] jArr;
        long j10 = this.f88076c;
        if (j10 > 2305843009213693951L) {
            this.f88077d += j10 >>> 61;
            this.f88076c = j10 & 2305843009213693951L;
        }
        int i10 = 16;
        while (true) {
            jArr = this.f88078e;
            if (i10 > 79) {
                break;
            }
            long j11 = jArr[i10 - 2];
            long j12 = ((j11 >>> 6) ^ (((j11 << 45) | (j11 >>> 19)) ^ ((j11 << 3) | (j11 >>> 61)))) + jArr[i10 - 7];
            long j13 = jArr[i10 - 15];
            jArr[i10] = j12 + ((((j13 >>> 8) | (j13 << 56)) ^ ((j13 << 63) | (j13 >>> 1))) ^ (j13 >>> 7)) + jArr[i10 - 16];
            i10++;
        }
        long j14 = this.H1;
        long j15 = this.H2;
        long j16 = this.H3;
        long j17 = this.H4;
        long j18 = this.H5;
        long j19 = this.H6;
        long j20 = this.H7;
        long j21 = j19;
        long j22 = this.H8;
        int i11 = 0;
        int i12 = 0;
        long jC = j16;
        long j23 = j18;
        long jC2 = j15;
        long j24 = j17;
        long j25 = j14;
        while (i11 < 10) {
            long jD = d(j23) + a(j23, j21, j20);
            long[] jArr2 = f88073g;
            int i13 = i12 + 1;
            long j26 = jD + jArr2[i12] + jArr[i12] + j22;
            long j27 = j24 + j26;
            long jC3 = c(j25) + b(j25, jC2, jC) + j26;
            int i14 = i12 + 2;
            long jD2 = j20 + d(j27) + a(j27, j23, j21) + jArr2[i13] + jArr[i13];
            long j28 = jC + jD2;
            long jC4 = c(jC3) + b(jC3, j25, jC2) + jD2;
            int i15 = i12 + 3;
            long jD3 = d(j28) + a(j28, j27, j23) + jArr2[i14] + jArr[i14] + j21;
            long j29 = jC2 + jD3;
            long jC5 = c(jC4) + b(jC4, jC3, j25) + jD3;
            int i16 = i12 + 4;
            long jD4 = d(j29) + a(j29, j28, j27) + jArr2[i15] + jArr[i15] + j23;
            long j30 = j25 + jD4;
            long jC6 = c(jC5) + b(jC5, jC4, jC3) + jD4;
            int i17 = i12 + 5;
            long jD5 = d(j30) + a(j30, j29, j28) + jArr2[i16] + jArr[i16] + j27;
            j22 = jC3 + jD5;
            long jC7 = c(jC6) + b(jC6, jC5, jC4) + jD5;
            int i18 = i12 + 6;
            long jD6 = d(j22) + a(j22, j30, j29) + jArr2[i17] + jArr[i17] + j28;
            j20 = jC4 + jD6;
            jC = c(jC7) + b(jC7, jC6, jC5) + jD6;
            int i19 = i12 + 7;
            long jD7 = d(j20) + a(j20, j22, j30) + jArr2[i18] + jArr[i18] + j29;
            j21 = jC5 + jD7;
            jC2 = c(jC) + b(jC, jC7, jC6) + jD7;
            i12 += 8;
            long jD8 = d(j21) + a(j21, j20, j22) + jArr2[i19] + jArr[i19] + j30;
            long jC8 = c(jC2) + b(jC2, jC, jC7) + jD8;
            i11++;
            j23 = jC6 + jD8;
            j25 = jC8;
            j24 = jC7;
        }
        this.H1 += j25;
        this.H2 += jC2;
        this.H3 += jC;
        this.H4 += j24;
        this.H5 += j23;
        this.H6 += j21;
        this.H7 += j20;
        this.H8 += j22;
        this.f88079f = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            jArr[i20] = 0;
        }
    }

    public void processLength(long j10, long j11) {
        if (this.f88079f > 14) {
            processBlock();
        }
        long[] jArr = this.f88078e;
        jArr[14] = j11;
        jArr[15] = j10;
    }

    public void processWord(byte[] bArr, int i10) {
        this.f88078e[this.f88079f] = Pack.bigEndianToLong(bArr, i10);
        int i11 = this.f88079f + 1;
        this.f88079f = i11;
        if (i11 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88076c = 0L;
        this.f88077d = 0L;
        int i10 = 0;
        this.f88075b = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f88074a;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        this.f88079f = 0;
        while (true) {
            long[] jArr = this.f88078e;
            if (i10 == jArr.length) {
                return;
            }
            jArr[i10] = 0;
            i10++;
        }
    }

    public void restoreState(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.f88075b = iBigEndianToInt;
        System.arraycopy(bArr, 0, this.f88074a, 0, iBigEndianToInt);
        this.f88076c = Pack.bigEndianToLong(bArr, 12);
        this.f88077d = Pack.bigEndianToLong(bArr, 20);
        this.H1 = Pack.bigEndianToLong(bArr, 28);
        this.H2 = Pack.bigEndianToLong(bArr, 36);
        this.H3 = Pack.bigEndianToLong(bArr, 44);
        this.H4 = Pack.bigEndianToLong(bArr, 52);
        this.H5 = Pack.bigEndianToLong(bArr, 60);
        this.H6 = Pack.bigEndianToLong(bArr, 68);
        this.H7 = Pack.bigEndianToLong(bArr, 76);
        this.H8 = Pack.bigEndianToLong(bArr, 84);
        this.f88079f = Pack.bigEndianToInt(bArr, 92);
        for (int i10 = 0; i10 < this.f88079f; i10++) {
            this.f88078e[i10] = Pack.bigEndianToLong(bArr, (i10 * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f88075b;
        int i11 = i10 + 1;
        this.f88075b = i11;
        byte[] bArr = this.f88074a;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            processWord(bArr, 0);
            this.f88075b = 0;
        }
        this.f88076c++;
    }

    public LongDigest(LongDigest longDigest) {
        this.f88074a = new byte[8];
        this.f88078e = new long[80];
        copyIn(longDigest);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f88075b != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (true) {
            byte[] bArr2 = this.f88074a;
            if (i11 <= bArr2.length) {
                break;
            }
            processWord(bArr, i10);
            i10 += bArr2.length;
            i11 -= bArr2.length;
            this.f88076c += (long) bArr2.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
