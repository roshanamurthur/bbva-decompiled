package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class SHA224 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA224Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA224Digest((SHA224Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA224Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", 224, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90063a = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90063a;
            configurableProvider.addAlgorithm("MessageDigest.SHA-224", str.concat("$Digest"));
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA224", McElieceCCA2KeyGenParameterSpec.SHA224);
            h0.c(new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha224, configurableProvider, McElieceCCA2KeyGenParameterSpec.SHA224);
            addHMACAlgorithm(configurableProvider, "SHA224", e.d(str, "$HashMac", configurableProvider, "Mac.PBEWITHHMACSHA224", "$HashMac"), str.concat("$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA224", PKCSObjectIdentifiers.id_hmacWithSHA224);
        }
    }
}
