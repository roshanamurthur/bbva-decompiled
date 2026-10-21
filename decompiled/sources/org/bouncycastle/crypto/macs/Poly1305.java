package org.bouncycastle.crypto.macs;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes4.dex */
public class Poly1305 implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f88900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f88911l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f88912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f88913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f88914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f88915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f88916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f88917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f88918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f88919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f88920v;

    public Poly1305() {
        this.f88901b = new byte[1];
        this.f88914p = new byte[16];
        this.f88915q = 0;
        this.f88900a = null;
    }

    public static final long a(int i10, int i11) {
        return (((long) i10) & 4294967295L) * ((long) i11);
    }

    public final void b() {
        int i10 = this.f88915q;
        byte[] bArr = this.f88914p;
        if (i10 < 16) {
            bArr[i10] = 1;
            for (int i11 = i10 + 1; i11 < 16; i11++) {
                bArr[i11] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        long j10 = jLittleEndianToInt & 4294967295L;
        long jLittleEndianToInt2 = ((long) Pack.littleEndianToInt(bArr, 4)) & 4294967295L;
        long jLittleEndianToInt3 = ((long) Pack.littleEndianToInt(bArr, 8)) & 4294967295L;
        long jLittleEndianToInt4 = 4294967295L & ((long) Pack.littleEndianToInt(bArr, 12));
        int i12 = (int) (((long) this.f88916r) + (jLittleEndianToInt & 67108863));
        this.f88916r = i12;
        this.f88917s = (int) (((long) this.f88917s) + ((((jLittleEndianToInt2 << 32) | j10) >>> 26) & 67108863));
        this.f88918t = (int) (((long) this.f88918t) + ((((jLittleEndianToInt3 << 32) | jLittleEndianToInt2) >>> 20) & 67108863));
        this.f88919u = (int) (((long) this.f88919u) + ((((jLittleEndianToInt4 << 32) | jLittleEndianToInt3) >>> 14) & 67108863));
        int i13 = (int) (((long) this.f88920v) + (jLittleEndianToInt4 >>> 8));
        this.f88920v = i13;
        if (this.f88915q == 16) {
            this.f88920v = i13 + 16777216;
        }
        long jA = a(this.f88920v, this.f88907h) + a(this.f88919u, this.f88908i) + a(this.f88918t, this.f88909j) + a(this.f88917s, this.f88910k) + a(i12, this.f88902c);
        long jA2 = a(this.f88920v, this.f88908i) + a(this.f88919u, this.f88909j) + a(this.f88918t, this.f88910k) + a(this.f88917s, this.f88902c) + a(this.f88916r, this.f88903d);
        long jA3 = a(this.f88920v, this.f88909j) + a(this.f88919u, this.f88910k) + a(this.f88918t, this.f88902c) + a(this.f88917s, this.f88903d) + a(this.f88916r, this.f88904e);
        long jA4 = a(this.f88920v, this.f88910k) + a(this.f88919u, this.f88902c) + a(this.f88918t, this.f88903d) + a(this.f88917s, this.f88904e) + a(this.f88916r, this.f88905f);
        long jA5 = a(this.f88920v, this.f88902c) + a(this.f88919u, this.f88903d) + a(this.f88918t, this.f88904e) + a(this.f88917s, this.f88905f) + a(this.f88916r, this.f88906g);
        long j11 = jA2 + (jA >>> 26);
        long j12 = jA3 + (j11 >>> 26);
        this.f88918t = ((int) j12) & 67108863;
        long j13 = jA4 + (j12 >>> 26);
        this.f88919u = ((int) j13) & 67108863;
        long j14 = jA5 + (j13 >>> 26);
        this.f88920v = ((int) j14) & 67108863;
        int i14 = (((int) (j14 >>> 26)) * 5) + (((int) jA) & 67108863);
        this.f88917s = (((int) j11) & 67108863) + (i14 >>> 26);
        this.f88916r = i14 & 67108863;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        if (i10 + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.f88915q > 0) {
            b();
        }
        int i11 = this.f88917s;
        int i12 = this.f88916r;
        int i13 = i11 + (i12 >>> 26);
        int i14 = this.f88918t + (i13 >>> 26);
        int i15 = this.f88919u + (i14 >>> 26);
        int i16 = i14 & 67108863;
        int i17 = this.f88920v + (i15 >>> 26);
        int i18 = i15 & 67108863;
        int i19 = ((i17 >>> 26) * 5) + (i12 & 67108863);
        int i20 = i17 & 67108863;
        int i21 = (i13 & 67108863) + (i19 >>> 26);
        int i22 = i19 & 67108863;
        int i23 = i22 + 5;
        int i24 = (i23 >>> 26) + i21;
        int i25 = (i24 >>> 26) + i16;
        int i26 = (i25 >>> 26) + i18;
        int i27 = 67108863 & i26;
        int i28 = ((i26 >>> 26) + i20) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        int i29 = (i28 >>> 31) - 1;
        int i30 = ~i29;
        int i31 = (i22 & i30) | (i23 & 67108863 & i29);
        this.f88916r = i31;
        int i32 = (i21 & i30) | (i24 & 67108863 & i29);
        this.f88917s = i32;
        int i33 = (i16 & i30) | (i25 & 67108863 & i29);
        this.f88918t = i33;
        int i34 = (i27 & i29) | (i18 & i30);
        this.f88919u = i34;
        int i35 = (i20 & i30) | (i28 & i29);
        this.f88920v = i35;
        long j10 = (((long) ((i32 << 26) | i31)) & 4294967295L) + (((long) this.f88911l) & 4294967295L);
        long j11 = (((long) ((i32 >>> 6) | (i33 << 20))) & 4294967295L) + (((long) this.m) & 4294967295L);
        long j12 = (((long) ((i33 >>> 12) | (i34 << 14))) & 4294967295L) + (((long) this.f88912n) & 4294967295L);
        long j13 = (((long) ((i34 >>> 18) | (i35 << 8))) & 4294967295L) + (((long) this.f88913o) & 4294967295L);
        Pack.intToLittleEndian((int) j10, bArr, i10);
        long j14 = j11 + (j10 >>> 32);
        Pack.intToLittleEndian((int) j14, bArr, i10 + 4);
        long j15 = j12 + (j14 >>> 32);
        Pack.intToLittleEndian((int) j15, bArr, i10 + 8);
        Pack.intToLittleEndian((int) (j13 + (j15 >>> 32)), bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        BlockCipher blockCipher = this.f88900a;
        if (blockCipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + blockCipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        BlockCipher blockCipher = this.f88900a;
        if (blockCipher == null) {
            iv = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i10 = 16;
        if (blockCipher != null && (iv == null || iv.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(key, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(key, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(key, 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(key, 12);
        this.f88902c = 67108863 & iLittleEndianToInt;
        int i11 = ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6)) & 67108611;
        this.f88903d = i11;
        int i12 = ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12)) & 67092735;
        this.f88904e = i12;
        int i13 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.f88905f = i13;
        int i14 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.f88906g = i14;
        this.f88907h = i11 * 5;
        this.f88908i = i12 * 5;
        this.f88909j = i13 * 5;
        this.f88910k = i14 * 5;
        if (blockCipher != null) {
            byte[] bArr = new byte[16];
            blockCipher.init(true, new KeyParameter(key, 16, 16));
            blockCipher.processBlock(iv, 0, bArr, 0);
            i10 = 0;
            key = bArr;
        }
        this.f88911l = Pack.littleEndianToInt(key, i10);
        this.m = Pack.littleEndianToInt(key, i10 + 4);
        this.f88912n = Pack.littleEndianToInt(key, i10 + 8);
        this.f88913o = Pack.littleEndianToInt(key, i10 + 12);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.f88915q = 0;
        this.f88920v = 0;
        this.f88919u = 0;
        this.f88918t = 0;
        this.f88917s = 0;
        this.f88916r = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        byte[] bArr = this.f88901b;
        bArr[0] = b10;
        update(bArr, 0, 1);
    }

    public Poly1305(BlockCipher blockCipher) {
        this.f88901b = new byte[1];
        this.f88914p = new byte[16];
        this.f88915q = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.f88900a = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        int i12 = 0;
        while (i11 > i12) {
            if (this.f88915q == 16) {
                b();
                this.f88915q = 0;
            }
            int iMin = Math.min(i11 - i12, 16 - this.f88915q);
            System.arraycopy(bArr, i12 + i10, this.f88914p, this.f88915q, iMin);
            i12 += iMin;
            this.f88915q += iMin;
        }
    }
}
