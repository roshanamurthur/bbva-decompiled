package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.camera2.internal.h0;
import androidx.collection.a;
import androidx.databinding.e;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.engines.SEEDWrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import rm.b;

/* JADX INFO: loaded from: classes8.dex */
public final class SEED {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("SEED");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "SEED IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new SEEDEngine()), 128);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new SEEDEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher {

        public class a implements BlockCipherProvider {
            @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
            public final BlockCipher get() {
                return new SEEDEngine();
            }
        }

        public ECB() {
            super(new a());
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new SEEDEngine())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("SEED", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SEED", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90187a = SEED.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90187a;
            StringBuilder sbD = a.d(str, "$AlgParams", configurableProvider, "AlgorithmParameters.SEED", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = KISAObjectIdentifiers.id_seedCBC;
            h0.c(sbD, aSN1ObjectIdentifier, configurableProvider, "SEED");
            h0.c(a.d(str, "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.SEED", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier, configurableProvider, "SEED");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, e.d(str, "$ECB", configurableProvider, "Cipher.SEED", "$CBC"));
            configurableProvider.addAlgorithm("Cipher.SEEDWRAP", str.concat("$Wrap"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier2, "SEEDWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier, e.d(str, "$KeyGen", configurableProvider, "KeyGenerator.SEED", "$KeyGen"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier2, str.concat("$KeyGen"));
            configurableProvider.addAlgorithm("SecretKeyFactory.SEED", str.concat("$KeyFactory"));
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier, "SEED");
            addCMacAlgorithm(configurableProvider, "SEED", str.concat("$CMAC"), str.concat("$KeyGen"));
            addGMacAlgorithm(configurableProvider, "SEED", str.concat("$GMAC"), str.concat("$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "SEED", str.concat("$Poly1305"), str.concat("$Poly1305KeyGen"));
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SEEDEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SEED", 256, new Poly1305KeyGenerator());
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new SEEDWrapEngine());
        }
    }
}
