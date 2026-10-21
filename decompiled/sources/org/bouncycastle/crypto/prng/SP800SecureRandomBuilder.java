package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.HMacSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.HashSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.SP80090DRBG;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class SP800SecureRandomBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f89418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntropySourceProvider f89419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f89420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89422e;

    public static class a implements jm.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BlockCipher f89423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f89424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f89425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f89426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f89427e;

        public a(BlockCipher blockCipher, int i10, byte[] bArr, byte[] bArr2, int i11) {
            this.f89423a = blockCipher;
            this.f89424b = i10;
            this.f89425c = bArr;
            this.f89426d = bArr2;
            this.f89427e = i11;
        }

        @Override // jm.a
        public final SP80090DRBG a(EntropySource entropySource) {
            return new CTRSP800DRBG(this.f89423a, this.f89424b, this.f89427e, entropySource, this.f89426d, this.f89425c);
        }
    }

    public static class b implements jm.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Mac f89428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f89429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f89430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f89431d;

        public b(Mac mac, byte[] bArr, byte[] bArr2, int i10) {
            this.f89428a = mac;
            this.f89429b = bArr;
            this.f89430c = bArr2;
            this.f89431d = i10;
        }

        @Override // jm.a
        public final SP80090DRBG a(EntropySource entropySource) {
            return new HMacSP800DRBG(this.f89428a, this.f89431d, entropySource, this.f89430c, this.f89429b);
        }
    }

    public static class c implements jm.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Digest f89432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f89433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f89434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f89435d;

        public c(Digest digest, byte[] bArr, byte[] bArr2, int i10) {
            this.f89432a = digest;
            this.f89433b = bArr;
            this.f89434c = bArr2;
            this.f89435d = i10;
        }

        @Override // jm.a
        public final SP80090DRBG a(EntropySource entropySource) {
            return new HashSP800DRBG(this.f89432a, this.f89435d, entropySource, this.f89434c, this.f89433b);
        }
    }

    public SP800SecureRandomBuilder() {
        this(CryptoServicesRegistrar.getSecureRandom(), false);
    }

    public SP800SecureRandom buildCTR(BlockCipher blockCipher, int i10, byte[] bArr, boolean z10) {
        return new SP800SecureRandom(this.f89418a, this.f89419b.get(this.f89422e), new a(blockCipher, i10, bArr, this.f89420c, this.f89421d), z10);
    }

    public SP800SecureRandom buildHMAC(Mac mac, byte[] bArr, boolean z10) {
        return new SP800SecureRandom(this.f89418a, this.f89419b.get(this.f89422e), new b(mac, bArr, this.f89420c, this.f89421d), z10);
    }

    public SP800SecureRandom buildHash(Digest digest, byte[] bArr, boolean z10) {
        return new SP800SecureRandom(this.f89418a, this.f89419b.get(this.f89422e), new c(digest, bArr, this.f89420c, this.f89421d), z10);
    }

    public SP800SecureRandomBuilder setEntropyBitsRequired(int i10) {
        this.f89422e = i10;
        return this;
    }

    public SP800SecureRandomBuilder setPersonalizationString(byte[] bArr) {
        this.f89420c = Arrays.clone(bArr);
        return this;
    }

    public SP800SecureRandomBuilder setSecurityStrength(int i10) {
        this.f89421d = i10;
        return this;
    }

    public SP800SecureRandomBuilder(SecureRandom secureRandom, boolean z10) {
        this.f89421d = 256;
        this.f89422e = 256;
        this.f89418a = secureRandom;
        this.f89419b = new BasicEntropySourceProvider(secureRandom, z10);
    }

    public SP800SecureRandomBuilder(EntropySourceProvider entropySourceProvider) {
        this.f89421d = 256;
        this.f89422e = 256;
        this.f89418a = null;
        this.f89419b = entropySourceProvider;
    }
}
