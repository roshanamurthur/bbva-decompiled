package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public final class SipHash {

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SipHash", 128, new CipherKeyGenerator());
        }
    }

    public static class Mac24 extends BaseMac {
        public Mac24() {
            super(new org.bouncycastle.crypto.macs.SipHash());
        }
    }

    public static class Mac48 extends BaseMac {
        public Mac48() {
            super(new org.bouncycastle.crypto.macs.SipHash(4, 8));
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90192a = SipHash.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90192a;
            configurableProvider.addAlgorithm("Mac.SIPHASH-2-4", str.concat("$Mac24"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4");
            configurableProvider.addAlgorithm("KeyGenerator.SIPHASH", e.d(str, "$Mac48", configurableProvider, "Mac.SIPHASH-4-8", "$KeyGen"));
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
        }
    }
}
