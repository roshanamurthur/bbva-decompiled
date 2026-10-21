package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import com.bbva.ethermobilesdk.cipher.token.utils.HMACUtilsKt;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.cms.CCMParameters;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.engines.AESWrapPadEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.engines.RFC5649WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
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
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import rm.a;
import rm.b;

/* JADX INFO: loaded from: classes8.dex */
public final class AES {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f90123a;

    public static class AESCCMMAC extends BaseMac {

        public static class a implements Mac {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CCMBlockCipher f90124a = new CCMBlockCipher(new AESEngine());

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f90125b = 8;

            @Override // org.bouncycastle.crypto.Mac
            public final int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
                try {
                    return this.f90124a.doFinal(bArr, 0);
                } catch (InvalidCipherTextException e5) {
                    throw new IllegalStateException("exception on doFinal(): " + e5.toString());
                }
            }

            @Override // org.bouncycastle.crypto.Mac
            public final String getAlgorithmName() {
                return this.f90124a.getAlgorithmName() + "Mac";
            }

            @Override // org.bouncycastle.crypto.Mac
            public final int getMacSize() {
                return this.f90125b;
            }

            @Override // org.bouncycastle.crypto.Mac
            public final void init(CipherParameters cipherParameters) throws IllegalArgumentException {
                CCMBlockCipher cCMBlockCipher = this.f90124a;
                cCMBlockCipher.init(true, cipherParameters);
                this.f90125b = cCMBlockCipher.getMac().length;
            }

            @Override // org.bouncycastle.crypto.Mac
            public final void reset() {
                this.f90124a.reset();
            }

            @Override // org.bouncycastle.crypto.Mac
            public final void update(byte b10) throws IllegalStateException, IOException {
                this.f90124a.processAADByte(b10);
            }

            @Override // org.bouncycastle.crypto.Mac
            public final void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException, IOException {
                this.f90124a.processAADBytes(bArr, i10, i11);
            }
        }

        public AESCCMMAC() {
            super(new a());
        }
    }

    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new CMac(new AESEngine()));
        }
    }

    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new GMac(new GCMBlockCipher(new AESEngine())));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("AES");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("CCM");
                algorithmParametersCreateParametersInstance.init(new CCMParameters(bArr, 12).getEncoded());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(CodePackage.GCM);
                algorithmParametersCreateParametersInstance.init(new GCMParameters(bArr, 16).getEncoded());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "AES IV";
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CCMParameters f90126a;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.f90126a.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (a.c(algorithmParameterSpec)) {
                this.f90126a = CCMParameters.getInstance(a.a(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.f90126a = new CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || a.f93108a == cls) {
                return a.f93108a != null ? a.b(this.f90126a.toASN1Primitive()) : new AEADParameterSpec(this.f90126a.getNonce(), this.f90126a.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.f90126a.getNonce(), this.f90126a.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f90126a.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.f90126a.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.f90126a = CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.f90126a = CCMParameters.getInstance(bArr);
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GCMParameters f90127a;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.f90127a.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (a.c(algorithmParameterSpec)) {
                this.f90127a = a.a(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.f90127a = new GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return CodePackage.GCM;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || a.f93108a == cls) {
                return a.f93108a != null ? a.b(this.f90127a.toASN1Primitive()) : new AEADParameterSpec(this.f90127a.getNonce(), this.f90127a.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.f90127a.getNonce(), this.f90127a.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f90127a.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.f90127a.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.f90127a = GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.f90127a = GCMParameters.getInstance(bArr);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new AESEngine()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((AEADBlockCipher) new CCMBlockCipher(new AESEngine()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new AESEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {

        public class a implements BlockCipherProvider {
            @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
            public final BlockCipher get() {
                return new AESEngine();
            }
        }

        public ECB() {
            super(new a());
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new GCMBlockCipher(new AESEngine()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i10) {
            super("AES", i10, new CipherKeyGenerator());
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
        public static final String f90128a = AES.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90128a;
            configurableProvider.addAlgorithm("AlgorithmParameters.AES", str.concat("$AlgParams"));
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes128_CBC;
            StringBuilder sbB = androidx.fragment.app.a.b(sb2, aSN1ObjectIdentifier, configurableProvider, "AES", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_CBC;
            StringBuilder sbB2 = androidx.fragment.app.a.b(sbB, aSN1ObjectIdentifier2, configurableProvider, "AES", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes256_CBC;
            h0.c(sbB2, aSN1ObjectIdentifier3, configurableProvider, "AES");
            StringBuilder sbD = androidx.collection.a.d(str, "$AlgParamsGCM", configurableProvider, "AlgorithmParameters.GCM", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes128_GCM;
            StringBuilder sbB3 = androidx.fragment.app.a.b(sbD, aSN1ObjectIdentifier4, configurableProvider, CodePackage.GCM, "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_aes192_GCM;
            StringBuilder sbB4 = androidx.fragment.app.a.b(sbB3, aSN1ObjectIdentifier5, configurableProvider, CodePackage.GCM, "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_GCM;
            h0.c(sbB4, aSN1ObjectIdentifier6, configurableProvider, CodePackage.GCM);
            StringBuilder sbD2 = androidx.collection.a.d(str, "$AlgParamsCCM", configurableProvider, "AlgorithmParameters.CCM", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_aes128_CCM;
            StringBuilder sbB5 = androidx.fragment.app.a.b(sbD2, aSN1ObjectIdentifier7, configurableProvider, "CCM", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_aes192_CCM;
            StringBuilder sbB6 = androidx.fragment.app.a.b(sbB5, aSN1ObjectIdentifier8, configurableProvider, "CCM", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_aes256_CCM;
            h0.c(sbB6, aSN1ObjectIdentifier9, configurableProvider, "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.AES", str.concat("$AlgParamGen"));
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, "AES");
            h0.c(androidx.fragment.app.a.b(new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier2, configurableProvider, "AES", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier3, configurableProvider, "AES");
            HashMap map = AES.f90123a;
            configurableProvider.addAttributes("Cipher.AES", map);
            configurableProvider.addAlgorithm("Cipher.AES", str.concat("$ECB"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_aes128_ECB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, str.concat("$ECB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_aes192_ECB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, str.concat("$ECB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_aes256_ECB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, str.concat("$ECB"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, str.concat("$CBC"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, str.concat("$CBC"));
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, str.concat("$CBC"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_aes128_OFB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier13, str.concat("$OFB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_aes192_OFB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier14, str.concat("$OFB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.id_aes256_OFB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier15, str.concat("$OFB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.id_aes128_CFB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier16, str.concat("$CFB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.id_aes192_CFB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier17, str.concat("$CFB"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NISTObjectIdentifiers.id_aes256_CFB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier18, str.concat("$CFB"));
            configurableProvider.addAttributes("Cipher.AESWRAP", map);
            configurableProvider.addAlgorithm("Cipher.AESWRAP", str.concat("$Wrap"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NISTObjectIdentifiers.id_aes128_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier19, "AESWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NISTObjectIdentifiers.id_aes192_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier20, "AESWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NISTObjectIdentifiers.id_aes256_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier21, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.addAttributes("Cipher.AESWRAPPAD", map);
            configurableProvider.addAlgorithm("Cipher.AESWRAPPAD", str.concat("$WrapPad"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_aes128_wrap_pad;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier22, "AESWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NISTObjectIdentifiers.id_aes192_wrap_pad;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier23, "AESWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_aes256_wrap_pad;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier24, "AESWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            configurableProvider.addAlgorithm("Cipher.AESRFC5649WRAP", e.d(str, "$RFC3211Wrap", configurableProvider, "Cipher.AESRFC3211WRAP", "$RFC5649Wrap"));
            h0.c(androidx.fragment.app.a.b(androidx.fragment.app.a.b(androidx.collection.a.d(str, "$AlgParamGenCCM", configurableProvider, "AlgorithmParameterGenerator.CCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier7, configurableProvider, "CCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier8, configurableProvider, "CCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier9, configurableProvider, "CCM");
            configurableProvider.addAttributes("Cipher.CCM", map);
            configurableProvider.addAlgorithm("Cipher.CCM", str.concat("$CCM"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier7, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier8, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier9, "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", str.concat("$AlgParamGenGCM"));
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier4, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier5, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier6, CodePackage.GCM);
            configurableProvider.addAttributes("Cipher.GCM", map);
            configurableProvider.addAlgorithm("Cipher.GCM", str.concat("$GCM"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier4, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier5, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier6, CodePackage.GCM);
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.2", e.d(str, "$KeyGen", configurableProvider, "KeyGenerator.AES", "$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.42", e.d(str, "$KeyGen192", configurableProvider, "KeyGenerator.2.16.840.1.101.3.4.22", "$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier10, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier13, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier16, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier11, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier2, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier14, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier17, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier12, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier3, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier15, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier18, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier19, e.d(str, "$KeyGen", configurableProvider, "KeyGenerator.AESWRAP", "$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier20, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier21, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier4, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier5, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier6, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier7, str.concat("$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier8, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier9, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier22, e.d(str, "$KeyGen", configurableProvider, "KeyGenerator.AESWRAPPAD", "$KeyGen128"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier23, str.concat("$KeyGen192"));
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, str.concat("$KeyGen256"));
            configurableProvider.addAlgorithm("Mac.AESCCMMAC", e.d(str, "$AESCMAC", configurableProvider, "Mac.AESCMAC", "$AESCCMMAC"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier7.getId(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier8.getId(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier9.getId(), "AESCCMMAC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier25, "PBEWITHSHAAND128BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier26, "PBEWITHSHAAND192BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier27, "PBEWITHSHAAND256BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", e.d(str, "$PBEWithSHA1AESCBC128", configurableProvider, "Cipher.PBEWITHSHAAND128BITAES-CBC-BC", "$PBEWithSHA1AESCBC192"));
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", e.d(str, "$PBEWithSHA1AESCBC256", configurableProvider, "Cipher.PBEWITHSHAAND256BITAES-CBC-BC", "$PBEWithSHA256AESCBC128"));
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", e.d(str, "$PBEWithSHA256AESCBC192", configurableProvider, "Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", "$PBEWithSHA256AESCBC256"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", e.d(str, "$PBEWithAESCBC", configurableProvider, "Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "$PBEWithAESCBC"));
            configurableProvider.addAlgorithm("SecretKeyFactory.AES", e.d(str, "$PBEWithAESCBC", configurableProvider, "Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "$KeyFactory"));
            configurableProvider.addAlgorithm("SecretKeyFactory", NISTObjectIdentifiers.aes, str.concat("$KeyFactory"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", e.d(str, "$PBEWithMD5And128BitAESCBCOpenSSL", configurableProvider, "SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", "$PBEWithMD5And192BitAESCBCOpenSSL"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", e.d(str, "$PBEWithMD5And256BitAESCBCOpenSSL", configurableProvider, "SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", "$PBEWithSHAAnd128BitAESBC"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", e.d(str, "$PBEWithSHAAnd192BitAESBC", configurableProvider, "SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", "$PBEWithSHAAnd256BitAESBC"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", e.d(str, "$PBEWithSHA256And128BitAESBC", configurableProvider, "SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", "$PBEWithSHA256And192BitAESBC"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", str.concat("$PBEWithSHA256And256BitAESBC"));
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier25, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier26, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier27, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier25.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier26.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier27.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier28.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier29.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier30.getId(), "PKCS12PBE");
            addGMacAlgorithm(configurableProvider, "AES", str.concat("$AESGMAC"), str.concat("$KeyGen128"));
            addPoly1305Algorithm(configurableProvider, "AES", str.concat("$Poly1305"), str.concat("$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new AESEngine(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(new CBCBlockCipher(new AESEngine()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new CBCBlockCipher(new AESEngine()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new CBCBlockCipher(new AESEngine()), 2, 1, 192, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new CBCBlockCipher(new AESEngine()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new CBCBlockCipher(new AESEngine()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new CBCBlockCipher(new AESEngine()), 2, 4, 192, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new CBCBlockCipher(new AESEngine()), 2, 4, 256, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new AESEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new AESEngine()), 16);
        }
    }

    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new RFC5649WrapEngine(new AESEngine()));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new AESWrapEngine());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new AESWrapPadEngine());
        }
    }

    static {
        HashMap map = new HashMap();
        f90123a = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        map.put("SupportedKeyFormats", HMACUtilsKt.DEFAULT_SECRET_KEYSPEC_ALGORITHM);
    }
}
