package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CCMParameters;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.ARIAEngine;
import org.bouncycastle.crypto.engines.ARIAWrapEngine;
import org.bouncycastle.crypto.engines.ARIAWrapPadEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import rm.a;
import rm.b;

/* JADX INFO: loaded from: classes8.dex */
public final class ARIA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("ARIA");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ARIA IV";
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CCMParameters f90130a;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.f90130a.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (a.c(algorithmParameterSpec)) {
                this.f90130a = CCMParameters.getInstance(a.a(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.f90130a = new CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || a.f93108a == cls) {
                return a.f93108a != null ? a.b(this.f90130a.toASN1Primitive()) : new AEADParameterSpec(this.f90130a.getNonce(), this.f90130a.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.f90130a.getNonce(), this.f90130a.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f90130a.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.f90130a.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.f90130a = CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.f90130a = CCMParameters.getInstance(bArr);
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GCMParameters f90131a;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.f90131a.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (a.c(algorithmParameterSpec)) {
                this.f90131a = a.a(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.f90131a = new GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return CodePackage.GCM;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || a.f93108a == cls) {
                return a.f93108a != null ? a.b(this.f90131a.toASN1Primitive()) : new AEADParameterSpec(this.f90131a.getNonce(), this.f90131a.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.f90131a.getNonce(), this.f90131a.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f90131a.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.f90131a.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.f90131a = GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.f90131a = GCMParameters.getInstance(bArr);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new ARIAEngine()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((AEADBlockCipher) new CCMBlockCipher(new ARIAEngine()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new ARIAEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {

        public class a implements BlockCipherProvider {
            @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
            public final BlockCipher get() {
                return new ARIAEngine();
            }
        }

        public ECB() {
            super(new a());
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new GCMBlockCipher(new ARIAEngine()));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new ARIAEngine())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i10) {
            super("ARIA", i10, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90132a = ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90132a;
            configurableProvider.addAlgorithm("AlgorithmParameters.ARIA", str.concat("$AlgParams"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NSRIObjectIdentifiers.id_aria128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NSRIObjectIdentifiers.id_aria192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier2, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NSRIObjectIdentifiers.id_aria256_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier3, "ARIA");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIA", str.concat("$AlgParamGen"));
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier3, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NSRIObjectIdentifiers.id_aria128_ofb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier4, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NSRIObjectIdentifiers.id_aria192_ofb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier5, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NSRIObjectIdentifiers.id_aria256_ofb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier6, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NSRIObjectIdentifiers.id_aria128_cfb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier7, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NSRIObjectIdentifiers.id_aria192_cfb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier8, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NSRIObjectIdentifiers.id_aria256_cfb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier9, "ARIA");
            configurableProvider.addAlgorithm("Cipher.ARIA", str.concat("$ECB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NSRIObjectIdentifiers.id_aria128_ecb;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, str.concat("$ECB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NSRIObjectIdentifiers.id_aria192_ecb;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, str.concat("$ECB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NSRIObjectIdentifiers.id_aria256_ecb;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, str.concat("$ECB"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, str.concat("$CBC"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, str.concat("$CBC"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, str.concat("$CBC"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier7, str.concat("$CFB"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier8, str.concat("$CFB"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier9, str.concat("$CFB"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier4, str.concat("$OFB"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier5, str.concat("$OFB"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, str.concat("$OFB"));
            configurableProvider.addAlgorithm("Cipher.ARIAWRAP", e.d(str, "$RFC3211Wrap", configurableProvider, "Cipher.ARIARFC3211WRAP", "$Wrap"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NSRIObjectIdentifiers.id_aria128_kw;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier13, "ARIAWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NSRIObjectIdentifiers.id_aria192_kw;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier14, "ARIAWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NSRIObjectIdentifiers.id_aria256_kw;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier15, "ARIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAPPAD", str.concat("$WrapPad"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NSRIObjectIdentifiers.id_aria128_kwp;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier16, "ARIAWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NSRIObjectIdentifiers.id_aria192_kwp;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier17, "ARIAWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NSRIObjectIdentifiers.id_aria256_kwp;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier18, "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier13, e.d(str, "$KeyGen", configurableProvider, "KeyGenerator.ARIA", "$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier14, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier15, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier16, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier17, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier18, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier10, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier11, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier12, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier2, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier3, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier7, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier8, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier9, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier4, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier5, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier6, str.concat("$KeyGen256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NSRIObjectIdentifiers.id_aria128_ccm;
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier19, str.concat("$KeyGen128"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NSRIObjectIdentifiers.id_aria192_ccm;
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier20, str.concat("$KeyGen192"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NSRIObjectIdentifiers.id_aria256_ccm;
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier21, str.concat("$KeyGen256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NSRIObjectIdentifiers.id_aria128_gcm;
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier22, str.concat("$KeyGen128"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NSRIObjectIdentifiers.id_aria192_gcm;
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier23, str.concat("$KeyGen192"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NSRIObjectIdentifiers.id_aria256_gcm;
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("SecretKeyFactory.ARIA", str.concat("$KeyFactory"));
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier3, "ARIA");
            h0.c(androidx.fragment.app.a.b(androidx.fragment.app.a.b(androidx.collection.a.d(str, "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.ARIACCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier19, configurableProvider, "ARIACCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier20, configurableProvider, "ARIACCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier21, configurableProvider, "ARIACCM");
            configurableProvider.addAlgorithm("Cipher.ARIACCM", str.concat("$CCM"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier19, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier20, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier21, "CCM");
            h0.c(androidx.fragment.app.a.b(androidx.fragment.app.a.b(androidx.collection.a.d(str, "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier22, configurableProvider, "ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier23, configurableProvider, "ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier24, configurableProvider, "ARIAGCM");
            configurableProvider.addAlgorithm("Cipher.ARIAGCM", str.concat("$GCM"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier23, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier24, "ARIAGCM");
            addGMacAlgorithm(configurableProvider, "ARIA", str.concat("$GMAC"), str.concat("$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "ARIA", str.concat("$Poly1305"), str.concat("$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new ARIAEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new ARIAEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new ARIAEngine()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new ARIAWrapEngine());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new ARIAWrapPadEngine());
        }
    }
}
