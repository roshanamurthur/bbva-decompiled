package org.bouncycastle.crypto.prng.drbg;

import com.salesforce.marketingcloud.analytics.b;
import java.util.Hashtable;
import km.a;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public class HashSP800DRBG implements SP80090DRBG {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f89486h = {1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Hashtable f89487i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f89488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f89489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f89490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f89491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EntropySource f89492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f89494g;

    static {
        Hashtable hashtable = new Hashtable();
        f89487i = hashtable;
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, Integers.valueOf(440));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, Integers.valueOf(440));
        hashtable.put("SHA-256", Integers.valueOf(440));
        hashtable.put(SPHINCSKeyParameters.SHA512_256, Integers.valueOf(440));
        hashtable.put("SHA-512/224", Integers.valueOf(440));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, Integers.valueOf(b.C));
        hashtable.put("SHA-512", Integers.valueOf(b.C));
    }

    public HashSP800DRBG(Digest digest, int i10, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        if (i10 > ((Integer) a.f79375a.get(digest.getAlgorithmName())).intValue()) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (entropySource.entropySize() < i10) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f89488a = digest;
        this.f89492e = entropySource;
        this.f89493f = i10;
        int iIntValue = ((Integer) f89487i.get(digest.getAlgorithmName())).intValue();
        this.f89494g = iIntValue;
        byte[] entropy = this.f89492e.getEntropy();
        if (entropy.length < (this.f89493f + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] bArrA = a.a(digest, iIntValue, Arrays.concatenate(entropy, bArr2, bArr));
        this.f89489b = bArrA;
        byte[] bArr3 = new byte[bArrA.length + 1];
        System.arraycopy(bArrA, 0, bArr3, 1, bArrA.length);
        this.f89490c = a.a(digest, iIntValue, bArr3);
        this.f89491d = 1L;
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        for (int i11 = 1; i11 <= bArr2.length; i11++) {
            int i12 = (bArr[bArr.length - i11] & 255) + (bArr2[bArr2.length - i11] & 255) + i10;
            i10 = i12 > 255 ? 1 : 0;
            bArr[bArr.length - i11] = (byte) i12;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i13 = (bArr[bArr.length - length] & 255) + i10;
            i10 = i13 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i13;
        }
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z10) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f89491d > 140737488355328L) {
            return -1;
        }
        byte[] bArr3 = bArr2;
        if (z10) {
            reseed(bArr3);
            bArr3 = null;
        }
        if (bArr3 != null) {
            byte[] bArr4 = this.f89489b;
            int length2 = bArr4.length + 1 + bArr3.length;
            byte[] bArr5 = new byte[length2];
            bArr5[0] = 2;
            System.arraycopy(bArr4, 0, bArr5, 1, bArr4.length);
            System.arraycopy(bArr3, 0, bArr5, this.f89489b.length + 1, bArr3.length);
            byte[] bArr6 = new byte[this.f89488a.getDigestSize()];
            Digest digest = this.f89488a;
            digest.update(bArr5, 0, length2);
            digest.doFinal(bArr6, 0);
            a(this.f89489b, bArr6);
        }
        byte[] bArr7 = this.f89489b;
        Digest digest2 = this.f89488a;
        int i10 = length / 8;
        int digestSize = i10 / digest2.getDigestSize();
        int length3 = bArr7.length;
        byte[] bArr8 = new byte[length3];
        System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
        byte[] bArr9 = new byte[i10];
        int digestSize2 = digest2.getDigestSize();
        byte[] bArr10 = new byte[digestSize2];
        for (int i11 = 0; i11 <= digestSize; i11++) {
            Digest digest3 = this.f89488a;
            digest3.update(bArr8, 0, length3);
            digest3.doFinal(bArr10, 0);
            int i12 = i11 * digestSize2;
            int i13 = i10 - i12;
            if (i13 > digestSize2) {
                i13 = digestSize2;
            }
            System.arraycopy(bArr10, 0, bArr9, i12, i13);
            a(bArr8, f89486h);
        }
        byte[] bArr11 = this.f89489b;
        int length4 = bArr11.length + 1;
        byte[] bArr12 = new byte[length4];
        System.arraycopy(bArr11, 0, bArr12, 1, bArr11.length);
        bArr12[0] = 3;
        byte[] bArr13 = new byte[this.f89488a.getDigestSize()];
        Digest digest4 = this.f89488a;
        digest4.update(bArr12, 0, length4);
        digest4.doFinal(bArr13, 0);
        a(this.f89489b, bArr13);
        a(this.f89489b, this.f89490c);
        long j10 = this.f89491d;
        a(this.f89489b, new byte[]{(byte) (j10 >> 24), (byte) (j10 >> 16), (byte) (j10 >> 8), (byte) j10});
        this.f89491d++;
        System.arraycopy(bArr9, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.f89488a.getDigestSize() * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        byte[] entropy = this.f89492e.getEntropy();
        if (entropy.length < (this.f89493f + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] bArrConcatenate = Arrays.concatenate(f89486h, this.f89489b, entropy, bArr);
        Digest digest = this.f89488a;
        int i10 = this.f89494g;
        byte[] bArrA = a.a(digest, i10, bArrConcatenate);
        this.f89489b = bArrA;
        byte[] bArr2 = new byte[bArrA.length + 1];
        bArr2[0] = 0;
        System.arraycopy(bArrA, 0, bArr2, 1, bArrA.length);
        this.f89490c = a.a(digest, i10, bArr2);
        this.f89491d = 1L;
    }
}
