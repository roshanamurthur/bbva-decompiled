package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Zuc128Engine;
import org.bouncycastle.crypto.engines.Zuc256Engine;
import org.bouncycastle.crypto.macs.Zuc128Mac;
import org.bouncycastle.crypto.macs.Zuc256Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import rm.b;

/* JADX INFO: loaded from: classes8.dex */
public class Zuc {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Zuc IV";
        }
    }

    public static class KeyGen128 extends BaseKeyGenerator {
        public KeyGen128() {
            super("ZUC128", 128, new CipherKeyGenerator());
        }
    }

    public static class KeyGen256 extends BaseKeyGenerator {
        public KeyGen256() {
            super("ZUC256", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90204a = Zuc.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90204a;
            configurableProvider.addAlgorithm("KeyGenerator.ZUC-128", e.d(str, "$Zuc128", configurableProvider, "Cipher.ZUC-128", "$KeyGen128"));
            configurableProvider.addAlgorithm("Cipher.ZUC-256", e.d(str, "$AlgParams", configurableProvider, "AlgorithmParameters.ZUC-128", "$Zuc256"));
            configurableProvider.addAlgorithm("AlgorithmParameters.ZUC-256", e.d(str, "$KeyGen256", configurableProvider, "KeyGenerator.ZUC-256", "$AlgParams"));
            configurableProvider.addAlgorithm("Mac.ZUC-256", e.d(str, "$ZucMac128", configurableProvider, "Mac.ZUC-128", "$ZucMac256"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ZUC-256-128", "ZUC-256");
            configurableProvider.addAlgorithm("Mac.ZUC-256-32", e.d(str, "$ZucMac256_64", configurableProvider, "Mac.ZUC-256-64", "$ZucMac256_32"));
        }
    }

    public static class Zuc128 extends BaseStreamCipher {
        public Zuc128() {
            super(new Zuc128Engine(), 16, 128);
        }
    }

    public static class Zuc256 extends BaseStreamCipher {
        public Zuc256() {
            super(new Zuc256Engine(), 25, 256);
        }
    }

    public static class ZucMac128 extends BaseMac {
        public ZucMac128() {
            super(new Zuc128Mac());
        }
    }

    public static class ZucMac256 extends BaseMac {
        public ZucMac256() {
            super(new Zuc256Mac(128));
        }
    }

    public static class ZucMac256_32 extends BaseMac {
        public ZucMac256_32() {
            super(new Zuc256Mac(32));
        }
    }

    public static class ZucMac256_64 extends BaseMac {
        public ZucMac256_64() {
            super(new Zuc256Mac(64));
        }
    }
}
