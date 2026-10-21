package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.CAST6Engine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import rm.b;

/* JADX INFO: loaded from: classes8.dex */
public final class CAST6 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CAST6 IV";
        }
    }

    public static class ECB extends BaseBlockCipher {

        public class a implements BlockCipherProvider {
            @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
            public final BlockCipher get() {
                return new CAST6Engine();
            }
        }

        public ECB() {
            super(new a());
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new CAST6Engine())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST6", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90137a = CAST6.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90137a;
            configurableProvider.addAlgorithm("KeyGenerator.CAST6", e.d(str, "$ECB", configurableProvider, "Cipher.CAST6", "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "CAST6", e.d(str, "$AlgParams", configurableProvider, "AlgorithmParameters.CAST6", "$GMAC"), str.concat("$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "CAST6", str.concat("$Poly1305"), str.concat("$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new CAST6Engine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-CAST6", 256, new Poly1305KeyGenerator());
        }
    }
}
