package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.TEAEngine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public final class TEA {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "TEA IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new TEAEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("TEA", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90195a = TEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90195a;
            configurableProvider.addAlgorithm("KeyGenerator.TEA", e.d(str, "$ECB", configurableProvider, "Cipher.TEA", "$KeyGen"));
            configurableProvider.addAlgorithm("AlgorithmParameters.TEA", str.concat("$AlgParams"));
        }
    }
}
