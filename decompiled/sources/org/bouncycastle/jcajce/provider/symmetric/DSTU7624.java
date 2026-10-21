package org.bouncycastle.jcajce.provider.symmetric;

import androidx.collection.a;
import androidx.databinding.e;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.engines.DSTU7624WrapEngine;
import org.bouncycastle.crypto.macs.KGMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import rm.b;

/* JADX INFO: loaded from: classes8.dex */
public class DSTU7624 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90148b;

        public AlgParamGen(int i10) {
            this.f90148b = i10 / 8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.f90148b];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DSTU7624");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    public static class AlgParamGen128 extends AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    public static class AlgParamGen256 extends AlgParamGen {
        public AlgParamGen256() {
            super(256);
        }
    }

    public static class AlgParamGen512 extends AlgParamGen {
        public AlgParamGen512() {
            super(512);
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "DSTU7624 IV";
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(new CBCBlockCipher(new DSTU7624Engine(128)), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(new CBCBlockCipher(new DSTU7624Engine(256)), 256);
        }
    }

    public static class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super(new CBCBlockCipher(new DSTU7624Engine(512)), 512);
        }
    }

    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(new KCCMBlockCipher(new DSTU7624Engine(128)));
        }
    }

    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(new KCCMBlockCipher(new DSTU7624Engine(256)));
        }
    }

    public static class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super(new KCCMBlockCipher(new DSTU7624Engine(512)));
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(128), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(256), 256)), 256);
        }
    }

    public static class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(512), 512)), 512);
        }
    }

    public static class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(128))), 128);
        }
    }

    public static class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(256))), 256);
        }
    }

    public static class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(512))), 512);
        }
    }

    public static class ECB extends BaseBlockCipher {

        public class a implements BlockCipherProvider {
            @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
            public final BlockCipher get() {
                return new DSTU7624Engine(128);
            }
        }

        public ECB() {
            super(new a());
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(new DSTU7624Engine(128));
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(new DSTU7624Engine(256));
        }
    }

    public static class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super(new DSTU7624Engine(512));
        }
    }

    public static class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super(new DSTU7624Engine(128));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new DSTU7624Engine(256));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new DSTU7624Engine(512));
        }
    }

    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(new KGCMBlockCipher(new DSTU7624Engine(128)));
        }
    }

    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(new KGCMBlockCipher(new DSTU7624Engine(256)));
        }
    }

    public static class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super(new KGCMBlockCipher(new DSTU7624Engine(512)));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(128)), 128));
        }
    }

    public static class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(128)), 128));
        }
    }

    public static class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(256)), 256));
        }
    }

    public static class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(512)), 512));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i10) {
            super("DSTU7624", i10, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    public static class Mappings extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90149a = DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90149a;
            configurableProvider.addAlgorithm("AlgorithmParameters.DSTU7624", str.concat("$AlgParams"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu7624cbc_128;
            configurableProvider.addAlgorithm("AlgorithmParameters", aSN1ObjectIdentifier, str.concat("$AlgParams"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = UAObjectIdentifiers.dstu7624cbc_256;
            configurableProvider.addAlgorithm("AlgorithmParameters", aSN1ObjectIdentifier2, str.concat("$AlgParams"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = UAObjectIdentifiers.dstu7624cbc_512;
            configurableProvider.addAlgorithm("AlgorithmParameters", aSN1ObjectIdentifier3, str.concat("$AlgParams"));
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", aSN1ObjectIdentifier, e.d(str, "$AlgParamGen128", configurableProvider, "AlgorithmParameterGenerator.DSTU7624", "$AlgParamGen128"));
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", aSN1ObjectIdentifier2, str.concat("$AlgParamGen256"));
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", aSN1ObjectIdentifier3, str.concat("$AlgParamGen512"));
            configurableProvider.addAlgorithm("Cipher.DSTU7624-128", e.d(str, "$ECB_128", configurableProvider, "Cipher.DSTU7624", "$ECB_128"));
            configurableProvider.addAlgorithm("Cipher.DSTU7624-512", e.d(str, "$ECB_256", configurableProvider, "Cipher.DSTU7624-256", "$ECB_512"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = UAObjectIdentifiers.dstu7624ecb_128;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier4, str.concat("$ECB128"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = UAObjectIdentifiers.dstu7624ecb_256;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier5, str.concat("$ECB256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = UAObjectIdentifiers.dstu7624ecb_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, str.concat("$ECB512"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, str.concat("$CBC128"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, str.concat("$CBC256"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, str.concat("$CBC512"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = UAObjectIdentifiers.dstu7624ofb_128;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier7, str.concat("$OFB128"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = UAObjectIdentifiers.dstu7624ofb_256;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier8, str.concat("$OFB256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = UAObjectIdentifiers.dstu7624ofb_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier9, str.concat("$OFB512"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = UAObjectIdentifiers.dstu7624cfb_128;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, str.concat("$CFB128"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = UAObjectIdentifiers.dstu7624cfb_256;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, str.concat("$CFB256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = UAObjectIdentifiers.dstu7624cfb_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, str.concat("$CFB512"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = UAObjectIdentifiers.dstu7624ctr_128;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier13, str.concat("$CTR128"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = UAObjectIdentifiers.dstu7624ctr_256;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier14, str.concat("$CTR256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = UAObjectIdentifiers.dstu7624ctr_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier15, str.concat("$CTR512"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = UAObjectIdentifiers.dstu7624ccm_128;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier16, str.concat("$CCM128"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = UAObjectIdentifiers.dstu7624ccm_256;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier17, str.concat("$CCM256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = UAObjectIdentifiers.dstu7624ccm_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier18, str.concat("$CCM512"));
            configurableProvider.addAlgorithm("Cipher.DSTU7624KW", str.concat("$Wrap"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW");
            StringBuilder sbD = a.d(str, "$Wrap128", configurableProvider, "Cipher.DSTU7624-128KW", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = UAObjectIdentifiers.dstu7624kw_128;
            sbD.append(aSN1ObjectIdentifier19.getId());
            configurableProvider.addAlgorithm(sbD.toString(), "DSTU7624-128KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW");
            StringBuilder sbD2 = a.d(str, "$Wrap256", configurableProvider, "Cipher.DSTU7624-256KW", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = UAObjectIdentifiers.dstu7624kw_256;
            sbD2.append(aSN1ObjectIdentifier20.getId());
            configurableProvider.addAlgorithm(sbD2.toString(), "DSTU7624-256KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW");
            StringBuilder sbD3 = a.d(str, "$Wrap512", configurableProvider, "Cipher.DSTU7624-512KW", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = UAObjectIdentifiers.dstu7624kw_512;
            sbD3.append(aSN1ObjectIdentifier21.getId());
            configurableProvider.addAlgorithm(sbD3.toString(), "DSTU7624-512KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW");
            configurableProvider.addAlgorithm("Mac.DSTU7624-128GMAC", e.d(str, "$GMAC", configurableProvider, "Mac.DSTU7624GMAC", "$GMAC128"));
            StringBuilder sb2 = new StringBuilder("Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = UAObjectIdentifiers.dstu7624gmac_128;
            sb2.append(aSN1ObjectIdentifier22.getId());
            configurableProvider.addAlgorithm(sb2.toString(), "DSTU7624-128GMAC");
            StringBuilder sbD4 = a.d(str, "$GMAC256", configurableProvider, "Mac.DSTU7624-256GMAC", "Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = UAObjectIdentifiers.dstu7624gmac_256;
            sbD4.append(aSN1ObjectIdentifier23.getId());
            configurableProvider.addAlgorithm(sbD4.toString(), "DSTU7624-256GMAC");
            StringBuilder sbD5 = a.d(str, "$GMAC512", configurableProvider, "Mac.DSTU7624-512GMAC", "Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = UAObjectIdentifiers.dstu7624gmac_512;
            sbD5.append(aSN1ObjectIdentifier24.getId());
            configurableProvider.addAlgorithm(sbD5.toString(), "DSTU7624-512GMAC");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier19, e.d(str, "$KeyGen", configurableProvider, "KeyGenerator.DSTU7624", "$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier20, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier21, str.concat("$KeyGen512"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier4, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier5, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier6, str.concat("$KeyGen512"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier2, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier3, str.concat("$KeyGen512"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier7, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier8, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier9, str.concat("$KeyGen512"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier10, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier11, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier12, str.concat("$KeyGen512"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier13, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier14, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier15, str.concat("$KeyGen512"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier16, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier17, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier18, str.concat("$KeyGen512"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier22, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier23, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, str.concat("$KeyGen512"));
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(128), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(256), 256)), 256);
        }
    }

    public static class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(512), 512)), 512);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new DSTU7624WrapEngine(128));
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new DSTU7624WrapEngine(128));
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new DSTU7624WrapEngine(256));
        }
    }

    public static class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new DSTU7624WrapEngine(512));
        }
    }
}
