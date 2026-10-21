package org.bouncycastle.crypto.prng.drbg;

import java.util.Hashtable;
import km.a;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class HMacSP800DRBG implements SP80090DRBG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f89482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EntropySource f89483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Mac f89484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89485f;

    public HMacSP800DRBG(Mac mac, int i10, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        Hashtable hashtable = a.f79375a;
        String algorithmName = mac.getAlgorithmName();
        if (i10 > ((Integer) a.f79375a.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue()) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (entropySource.entropySize() < i10) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f89485f = i10;
        this.f89483d = entropySource;
        this.f89484e = mac;
        byte[] entropy = entropySource.getEntropy();
        if (entropy.length < (this.f89485f + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] bArrConcatenate = Arrays.concatenate(entropy, bArr2, bArr);
        int macSize = mac.getMacSize();
        this.f89480a = new byte[macSize];
        byte[] bArr3 = new byte[macSize];
        this.f89481b = bArr3;
        Arrays.fill(bArr3, (byte) 1);
        a((byte) 0, bArrConcatenate);
        if (bArrConcatenate != null) {
            a((byte) 1, bArrConcatenate);
        }
        this.f89482c = 1L;
    }

    public final void a(byte b10, byte[] bArr) {
        byte[] bArr2 = this.f89480a;
        KeyParameter keyParameter = new KeyParameter(bArr2);
        Mac mac = this.f89484e;
        mac.init(keyParameter);
        byte[] bArr3 = this.f89481b;
        mac.update(bArr3, 0, bArr3.length);
        mac.update(b10);
        if (bArr != null) {
            mac.update(bArr, 0, bArr.length);
        }
        mac.doFinal(bArr2, 0);
        mac.init(new KeyParameter(bArr2));
        mac.update(bArr3, 0, bArr3.length);
        mac.doFinal(bArr3, 0);
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z10) throws CloneNotSupportedException {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this.f89482c > 140737488355328L) {
            return -1;
        }
        if (z10) {
            reseed(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            a((byte) 0, bArr2);
            a((byte) 1, bArr2);
        }
        int length2 = bArr.length;
        byte[] bArr3 = new byte[length2];
        int length3 = bArr.length;
        byte[] bArr4 = this.f89481b;
        int length4 = length3 / bArr4.length;
        KeyParameter keyParameter = new KeyParameter(this.f89480a);
        Mac mac = this.f89484e;
        mac.init(keyParameter);
        for (int i10 = 0; i10 < length4; i10++) {
            mac.update(bArr4, 0, bArr4.length);
            mac.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, bArr4.length * i10, bArr4.length);
        }
        if (bArr4.length * length4 < length2) {
            mac.update(bArr4, 0, bArr4.length);
            mac.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, bArr4.length * length4, length2 - (length4 * bArr4.length));
        }
        a((byte) 0, bArr2);
        if (bArr2 != null) {
            a((byte) 1, bArr2);
        }
        this.f89482c++;
        System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.f89481b.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) throws CloneNotSupportedException {
        byte[] entropy = this.f89483d.getEntropy();
        if (entropy.length < (this.f89485f + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] bArrConcatenate = Arrays.concatenate(entropy, bArr);
        a((byte) 0, bArrConcatenate);
        if (bArrConcatenate != null) {
            a((byte) 1, bArrConcatenate);
        }
        this.f89482c = 1L;
    }
}
