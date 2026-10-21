package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class DRBG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[][] f90072a = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    public static class Default extends SecureRandomSpi {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final SP800SecureRandom f90073p0 = DRBG.a(true);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i10) {
            return f90073p0.generateSeed(i10);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            f90073p0.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            f90073p0.setSeed(bArr);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", "org.bouncycastle.jcajce.provider.drbg.DRBG$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", "org.bouncycastle.jcajce.provider.drbg.DRBG$NonceAndIV");
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final SP800SecureRandom f90074p0 = DRBG.a(false);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i10) {
            return f90074p0.generateSeed(i10);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            f90074p0.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            f90074p0.setSeed(bArr);
        }
    }

    public static class a extends SecureRandom {
        public a(Object[] objArr) {
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    public static class b extends Provider {
        public b() {
            super("BCHEP", 1.0d, "Bouncy Castle Hybrid Entropy Provider");
        }
    }

    public static class c extends SecureRandom {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicBoolean f90075p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f90076q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SecureRandom f90077r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SP800SecureRandom f90078s0;

        public class a implements EntropySourceProvider {
            public a() {
            }

            @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
            public final EntropySource get(int i10) {
                return c.this.new b(i10);
            }
        }

        public class b implements EntropySource {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f90080a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicReference f90081b = new AtomicReference();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AtomicBoolean f90082c = new AtomicBoolean(false);

            public class a implements Runnable {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final int f90084p0;

                public a(int i10) {
                    this.f90084p0 = i10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b bVar;
                    int i10;
                    int i11;
                    c cVar;
                    String propertyValue = Properties.getPropertyValue("org.bouncycastle.drbg.gather_pause_secs");
                    long j10 = 5000;
                    if (propertyValue != null) {
                        try {
                            j10 = Long.parseLong(propertyValue) * 1000;
                        } catch (Exception unused) {
                        }
                    }
                    int i12 = this.f90084p0;
                    byte[] bArr = new byte[i12];
                    int i13 = 0;
                    while (true) {
                        bVar = b.this;
                        i10 = bVar.f90080a;
                        i11 = i10 / 8;
                        cVar = c.this;
                        if (i13 >= i11) {
                            break;
                        }
                        try {
                            Thread.sleep(j10);
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                        }
                        byte[] bArrGenerateSeed = cVar.f90077r0.generateSeed(8);
                        System.arraycopy(bArrGenerateSeed, 0, bArr, i13 * 8, bArrGenerateSeed.length);
                        i13++;
                    }
                    int i14 = i10 - (i11 * 8);
                    if (i14 != 0) {
                        try {
                            Thread.sleep(j10);
                        } catch (InterruptedException unused3) {
                            Thread.currentThread().interrupt();
                        }
                        byte[] bArrGenerateSeed2 = cVar.f90077r0.generateSeed(i14);
                        System.arraycopy(bArrGenerateSeed2, 0, bArr, i12 - bArrGenerateSeed2.length, bArrGenerateSeed2.length);
                    }
                    bVar.f90081b.set(bArr);
                    cVar.f90075p0.set(true);
                }
            }

            public b(int i10) {
                this.f90080a = (i10 + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public final int entropySize() {
                return this.f90080a * 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public final byte[] getEntropy() {
                byte[] bArrGenerateSeed = (byte[]) this.f90081b.getAndSet(null);
                AtomicBoolean atomicBoolean = this.f90082c;
                int i10 = this.f90080a;
                if (bArrGenerateSeed == null || bArrGenerateSeed.length != i10) {
                    bArrGenerateSeed = c.this.f90077r0.generateSeed(i10);
                } else {
                    atomicBoolean.set(false);
                }
                if (!atomicBoolean.getAndSet(true)) {
                    Thread thread = new Thread(new a(i10));
                    thread.setDaemon(true);
                    thread.start();
                }
                return bArrGenerateSeed;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public final boolean isPredictionResistant() {
                return true;
            }
        }

        public c() {
            super(null, new b());
            this.f90075p0 = new AtomicBoolean(false);
            this.f90076q0 = new AtomicInteger(0);
            SecureRandom secureRandomB = ((Boolean) AccessController.doPrivileged(new qm.a())).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new qm.b()) : DRBG.b();
            this.f90077r0 = secureRandomB;
            this.f90078s0 = new SP800SecureRandomBuilder(new a()).setPersonalizationString(Strings.toByteArray("Bouncy Castle Hybrid Entropy Source")).buildHMAC(new HMac(new SHA512Digest()), secureRandomB.generateSeed(32), false);
        }

        @Override // java.security.SecureRandom
        public final byte[] generateSeed(int i10) {
            byte[] bArr = new byte[i10];
            AtomicInteger atomicInteger = this.f90076q0;
            int andIncrement = atomicInteger.getAndIncrement();
            SP800SecureRandom sP800SecureRandom = this.f90078s0;
            if (andIncrement > 20 && this.f90075p0.getAndSet(false)) {
                atomicInteger.set(0);
                sP800SecureRandom.reseed(null);
            }
            sP800SecureRandom.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public final void setSeed(long j10) {
            SP800SecureRandom sP800SecureRandom = this.f90078s0;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(j10);
            }
        }

        @Override // java.security.SecureRandom
        public final void setSeed(byte[] bArr) {
            SP800SecureRandom sP800SecureRandom = this.f90078s0;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(bArr);
            }
        }
    }

    public static class d extends SecureRandom {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final InputStream f90086p0;

        public class a implements PrivilegedAction<InputStream> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ URL f90087a;

            public a(URL url) {
                this.f90087a = url;
            }

            @Override // java.security.PrivilegedAction
            public final InputStream run() {
                try {
                    return this.f90087a.openStream();
                } catch (IOException unused) {
                    throw new IllegalStateException("unable to open random source");
                }
            }
        }

        public d(URL url) {
            super(null, new b());
            this.f90086p0 = (InputStream) AccessController.doPrivileged(new a(url));
        }

        @Override // java.security.SecureRandom
        public final byte[] generateSeed(int i10) {
            byte[] bArr;
            synchronized (this) {
                try {
                    bArr = new byte[i10];
                    int i11 = 0;
                    while (i11 != i10) {
                        int iIntValue = ((Integer) AccessController.doPrivileged(new org.bouncycastle.jcajce.provider.drbg.a(this, bArr, i11, i10 - i11))).intValue();
                        if (iIntValue <= -1) {
                            break;
                        }
                        i11 += iIntValue;
                    }
                    if (i11 != i10) {
                        throw new InternalError("unable to fully read random source");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public final void setSeed(long j10) {
        }

        @Override // java.security.SecureRandom
        public final void setSeed(byte[] bArr) {
        }
    }

    public static SP800SecureRandom a(boolean z10) {
        byte[] bArrConcatenate;
        if (Properties.getPropertyValue("org.bouncycastle.drbg.entropysource") == null) {
            c cVar = new c();
            byte[] bArrGenerateSeed = cVar.generateSeed(16);
            return new SP800SecureRandomBuilder(cVar, true).setPersonalizationString(z10 ? Arrays.concatenate(Strings.toByteArray("Default"), bArrGenerateSeed, Pack.longToBigEndian(Thread.currentThread().getId()), Pack.longToBigEndian(System.currentTimeMillis())) : Arrays.concatenate(Strings.toByteArray("Nonce"), bArrGenerateSeed, Pack.longToLittleEndian(Thread.currentThread().getId()), Pack.longToLittleEndian(System.currentTimeMillis()))).buildHash(new SHA512Digest(), cVar.generateSeed(32), z10);
        }
        EntropySourceProvider entropySourceProvider = (EntropySourceProvider) AccessController.doPrivileged(new qm.c(Properties.getPropertyValue("org.bouncycastle.drbg.entropysource")));
        EntropySource entropySource = entropySourceProvider.get(128);
        if (z10) {
            bArrConcatenate = Arrays.concatenate(Strings.toByteArray("Default"), entropySource.getEntropy(), Pack.longToBigEndian(Thread.currentThread().getId()), Pack.longToBigEndian(System.currentTimeMillis()));
        } else {
            bArrConcatenate = Arrays.concatenate(Strings.toByteArray("Nonce"), entropySource.getEntropy(), Pack.longToLittleEndian(Thread.currentThread().getId()), Pack.longToLittleEndian(System.currentTimeMillis()));
        }
        return new SP800SecureRandomBuilder(entropySourceProvider).setPersonalizationString(bArrConcatenate).buildHash(new SHA512Digest(), Arrays.concatenate(entropySource.getEntropy(), entropySource.getEntropy()), z10);
    }

    public static SecureRandom b() {
        if (Security.getProperty("securerandom.source") == null) {
            return new a(c());
        }
        try {
            return new d(new URL(Security.getProperty("securerandom.source")));
        } catch (Exception unused) {
            return new a(c());
        }
    }

    public static final Object[] c() {
        for (int i10 = 0; i10 < 4; i10++) {
            String[] strArr = f90072a[i10];
            try {
                return new Object[]{Class.forName(strArr[0]).newInstance(), Class.forName(strArr[1]).newInstance()};
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
