package org.bouncycastle.crypto.macs;

import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes4.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f88921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f88922d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected long f88923k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    protected long f88924k1;
    protected long m;
    protected long v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    protected long f88925v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    protected long f88926v2;
    protected long v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f88921c = 2;
        this.f88922d = 4;
    }

    public static long rotateLeft(long j10, int i10) {
        return (j10 >>> (-i10)) | (j10 << i10);
    }

    public void applySipRounds(int i10) {
        long jRotateLeft = this.v0;
        long jRotateLeft2 = this.f88925v1;
        long jRotateLeft3 = this.f88926v2;
        long jRotateLeft4 = this.v3;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = jRotateLeft + jRotateLeft2;
            long j11 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j10;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j11;
            long j12 = j11 + jRotateLeft5;
            jRotateLeft = rotateLeft(j10, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j12;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j12, 32);
        }
        this.v0 = jRotateLeft;
        this.f88925v1 = jRotateLeft2;
        this.f88926v2 = jRotateLeft3;
        this.v3 = jRotateLeft4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        Pack.longToLittleEndian(doFinal(), bArr, i10);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f88921c + Constant.DASH_STRING + this.f88922d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f88923k0 = Pack.littleEndianToLong(key, 0);
        this.f88924k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.v3 ^= this.m;
        applySipRounds(this.f88921c);
        this.v0 ^= this.m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j10 = this.f88923k0;
        this.v0 = 8317987319222330741L ^ j10;
        long j11 = this.f88924k1;
        this.f88925v1 = 7237128888997146477L ^ j11;
        this.f88926v2 = j10 ^ 7816392313619706465L;
        this.v3 = 8387220255154660723L ^ j11;
        this.m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        this.m = (this.m >>> 8) | ((((long) b10) & 255) << 56);
        int i10 = this.wordPos + 1;
        this.wordPos = i10;
        if (i10 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    public SipHash(int i10, int i11) {
        this.m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f88921c = i10;
        this.f88922d = i11;
    }

    public long doFinal() throws IllegalStateException, DataLengthException {
        long j10 = this.m;
        int i10 = this.wordPos;
        this.m = ((j10 >>> ((7 - i10) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i10)) & 255) << 56);
        processMessageWord();
        this.f88926v2 ^= 255;
        applySipRounds(this.f88922d);
        long j11 = ((this.v0 ^ this.f88925v1) ^ this.f88926v2) ^ this.v3;
        reset();
        return j11;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        int i12 = i11 & (-8);
        int i13 = this.wordPos;
        int i14 = 0;
        if (i13 == 0) {
            while (i14 < i12) {
                this.m = Pack.littleEndianToLong(bArr, i10 + i14);
                processMessageWord();
                i14 += 8;
            }
            while (i14 < i11) {
                this.m = (this.m >>> 8) | ((((long) bArr[i10 + i14]) & 255) << 56);
                i14++;
            }
            this.wordPos = i11 - i12;
            return;
        }
        int i15 = i13 << 3;
        int i16 = 0;
        while (i16 < i12) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i10 + i16);
            this.m = (this.m >>> (-i15)) | (jLittleEndianToLong << i15);
            processMessageWord();
            this.m = jLittleEndianToLong;
            i16 += 8;
        }
        while (i16 < i11) {
            this.m = (this.m >>> 8) | ((((long) bArr[i10 + i16]) & 255) << 56);
            int i17 = this.wordPos + 1;
            this.wordPos = i17;
            if (i17 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i16++;
        }
    }
}
