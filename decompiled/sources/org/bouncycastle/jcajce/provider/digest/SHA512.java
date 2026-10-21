package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;

/* JADX INFO: loaded from: classes8.dex */
public class SHA512 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA512Digest((SHA512Digest) this.digest);
            return digest;
        }
    }

    public static class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i10) {
            super(new SHA512tDigest(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new SHA512tDigest((SHA512tDigest) this.digest);
            return digestT;
        }
    }

    public static class DigestT224 extends DigestT {
        public DigestT224() {
            super(224);
        }
    }

    public static class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA512Digest()));
        }
    }

    public static class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new HMac(new SHA512tDigest(224)));
        }
    }

    public static class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new HMac(new SHA512tDigest(256)));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new CipherKeyGenerator());
        }
    }

    public static class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", 224, new CipherKeyGenerator());
        }
    }

    public static class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90067a = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90067a;
            configurableProvider.addAlgorithm("MessageDigest.SHA-512", str.concat("$Digest"));
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512", "SHA-512");
            h0.c(new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512, configurableProvider, "SHA-512");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512/224", str.concat("$DigestT224"));
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            h0.c(new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512_224, configurableProvider, "SHA-512/224");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512/256", str.concat("$DigestT256"));
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", SPHINCSKeyParameters.SHA512_256);
            h0.c(new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512_256, configurableProvider, SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA512", e.d(str, "$OldSHA512", configurableProvider, "Mac.OLDHMACSHA512", "$HashMac"));
            addHMACAlgorithm(configurableProvider, "SHA512", str.concat("$HashMac"), str.concat("$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA512", PKCSObjectIdentifiers.id_hmacWithSHA512);
            addHMACAlgorithm(configurableProvider, "SHA512/224", str.concat("$HashMacT224"), str.concat("$KeyGeneratorT224"));
            addHMACAlgorithm(configurableProvider, "SHA512/256", str.concat("$HashMacT256"), str.concat("$KeyGeneratorT256"));
        }
    }

    public static class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new OldHMac(new SHA512Digest()));
        }
    }
}
