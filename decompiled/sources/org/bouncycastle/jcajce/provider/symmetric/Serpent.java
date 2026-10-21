package org.bouncycastle.jcajce.provider.symmetric;

import androidx.databinding.e;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SerpentEngine;
import org.bouncycastle.crypto.engines.TnepresEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import rm.b;

/* JADX INFO: loaded from: classes8.dex */
public final class Serpent {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Serpent IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {

        public class a implements BlockCipherProvider {
            @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
            public final BlockCipher get() {
                return new SerpentEngine();
            }
        }

        public ECB() {
            super(new a());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90190a = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90190a;
            configurableProvider.addAlgorithm("KeyGenerator.Serpent", e.d(str, "$ECB", configurableProvider, "Cipher.Serpent", "$KeyGen"));
            configurableProvider.addAlgorithm("Cipher.Tnepres", e.d(str, "$AlgParams", configurableProvider, "AlgorithmParameters.Serpent", "$TECB"));
            configurableProvider.addAlgorithm("AlgorithmParameters.Tnepres", e.d(str, "$TKeyGen", configurableProvider, "KeyGenerator.Tnepres", "$TAlgParams"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_128_ECB, str.concat("$ECB"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_192_ECB, str.concat("$ECB"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_256_ECB, str.concat("$ECB"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_128_CBC, str.concat("$CBC"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_192_CBC, str.concat("$CBC"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_256_CBC, str.concat("$CBC"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_128_CFB, str.concat("$CFB"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_192_CFB, str.concat("$CFB"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_256_CFB, str.concat("$CFB"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_128_OFB, str.concat("$OFB"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_192_OFB, str.concat("$OFB"));
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_256_OFB, str.concat("$OFB"));
            addGMacAlgorithm(configurableProvider, "SERPENT", str.concat("$SerpentGMAC"), str.concat("$KeyGen"));
            addGMacAlgorithm(configurableProvider, "TNEPRES", str.concat("$TSerpentGMAC"), str.concat("$TKeyGen"));
            addPoly1305Algorithm(configurableProvider, "SERPENT", str.concat("$Poly1305"), str.concat("$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SerpentEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new Poly1305KeyGenerator());
        }
    }

    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new SerpentEngine())));
        }
    }

    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Tnepres IV";
        }
    }

    public static class TECB extends BaseBlockCipher {

        public class a implements BlockCipherProvider {
            @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
            public final BlockCipher get() {
                return new TnepresEngine();
            }
        }

        public TECB() {
            super(new a());
        }
    }

    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new CipherKeyGenerator());
        }
    }

    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new TnepresEngine())));
        }
    }
}
