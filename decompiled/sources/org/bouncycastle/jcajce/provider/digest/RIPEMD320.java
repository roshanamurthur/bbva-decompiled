package org.bouncycastle.jcajce.provider.digest;

import androidx.databinding.e;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.RIPEMD320Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/* JADX INFO: loaded from: classes8.dex */
public class RIPEMD320 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new RIPEMD320Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new RIPEMD320Digest((RIPEMD320Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new RIPEMD320Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD320", 320, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90061a = RIPEMD320.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90061a;
            addHMACAlgorithm(configurableProvider, "RIPEMD320", e.d(str, "$Digest", configurableProvider, "MessageDigest.RIPEMD320", "$HashMac"), str.concat("$KeyGenerator"));
        }
    }
}
