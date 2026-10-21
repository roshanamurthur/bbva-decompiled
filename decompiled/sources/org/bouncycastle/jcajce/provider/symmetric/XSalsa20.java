package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.XSalsa20Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public final class XSalsa20 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "XSalsa20 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new XSalsa20Engine(), 24);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("XSalsa20", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90202a = XSalsa20.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90202a;
            configurableProvider.addAlgorithm("KeyGenerator.XSALSA20", e.d(str, "$Base", configurableProvider, "Cipher.XSALSA20", "$KeyGen"));
            configurableProvider.addAlgorithm("AlgorithmParameters.XSALSA20", str.concat("$AlgParams"));
        }
    }
}
