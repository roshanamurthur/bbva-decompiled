package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Grainv1Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public final class Grainv1 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Grainv1 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new Grainv1Engine(), 8);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Grainv1", 80, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90160a = Grainv1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90160a;
            configurableProvider.addAlgorithm("KeyGenerator.Grainv1", e.d(str, "$Base", configurableProvider, "Cipher.Grainv1", "$KeyGen"));
            configurableProvider.addAlgorithm("AlgorithmParameters.Grainv1", str.concat("$AlgParams"));
        }
    }
}
