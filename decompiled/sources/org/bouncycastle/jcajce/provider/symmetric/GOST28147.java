package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.core.processing.f;
import androidx.databinding.e;
import ci.a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CryptoProWrapEngine;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.engines.GOST28147WrapEngine;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public final class GOST28147 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f90150a;

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f90151b = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f90152c = GOST28147Engine.getSBox("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            SecureRandom secureRandom = this.random;
            byte[] bArr = this.f90151b;
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GOST28147");
                algorithmParametersCreateParametersInstance.init(new GOST28147ParameterSpec(this.f90152c, bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("parameter spec not supported");
            }
            this.f90152c = ((GOST28147ParameterSpec) algorithmParameterSpec).getSBox();
        }
    }

    public static class AlgParams extends BaseAlgParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ASN1ObjectIdentifier f90153c = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f90154d;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f90154d = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                    throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                }
                this.f90154d = ((GOST28147ParameterSpec) algorithmParameterSpec).getIV();
                try {
                    this.f90153c = BaseAlgParams.getSBoxOID(((GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
                } catch (IllegalArgumentException e5) {
                    throw new InvalidParameterSpecException(e5.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f90154d);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.f90153c, this.f90154d);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public byte[] localGetEncoded() throws IOException {
            return new GOST28147Parameters(this.f90154d, this.f90153c).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public void localInit(byte[] bArr) throws IOException {
            ASN1Primitive aSN1PrimitiveFromByteArray = ASN1Primitive.fromByteArray(bArr);
            if (aSN1PrimitiveFromByteArray instanceof ASN1OctetString) {
                this.f90154d = ASN1OctetString.getInstance(aSN1PrimitiveFromByteArray).getOctets();
            } else {
                if (!(aSN1PrimitiveFromByteArray instanceof ASN1Sequence)) {
                    throw new IOException("Unable to recognize parameters");
                }
                GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(aSN1PrimitiveFromByteArray);
                this.f90153c = gOST28147Parameters.getEncryptionParamSet();
                this.f90154d = gOST28147Parameters.getIV();
            }
        }
    }

    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ASN1ObjectIdentifier f90155a = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f90156b;

        public static ASN1ObjectIdentifier getSBoxOID(String str) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = str != null ? (ASN1ObjectIdentifier) GOST28147.f90150a.get(Strings.toUpperCase(str)) : null;
            if (aSN1ObjectIdentifier != null) {
                return aSN1ObjectIdentifier;
            }
            throw new IllegalArgumentException(f.d("Unknown SBOX name: ", str));
        }

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f90156b = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                    throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                }
                this.f90156b = ((GOST28147ParameterSpec) algorithmParameterSpec).getIV();
                try {
                    this.f90155a = getSBoxOID(((GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
                } catch (IllegalArgumentException e5) {
                    throw new InvalidParameterSpecException(e5.getMessage());
                }
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f90156b);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.f90155a, this.f90156b);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        public byte[] localGetEncoded() throws IOException {
            return new GOST28147Parameters(this.f90156b, this.f90155a).getEncoded();
        }

        public abstract void localInit(byte[] bArr) throws IOException;

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            throw new IOException(f.d("Unknown parameter format: ", str));
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr) throws IOException {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr, String str) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("Encoded parameters cannot be null");
            }
            if (isASN1FormatString(str)) {
                try {
                    localInit(bArr);
                    return;
                } catch (IOException e5) {
                    throw e5;
                } catch (Exception e7) {
                    throw new IOException(a.b(e7, new StringBuilder("Parameter parsing failed: ")));
                }
            }
            throw new IOException(f.d("Unknown parameter format: ", str));
        }

        public static ASN1ObjectIdentifier getSBoxOID(byte[] bArr) {
            return getSBoxOID(GOST28147Engine.getSBoxName(bArr));
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new GOST28147Engine()), 64);
        }
    }

    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new CryptoProWrapEngine());
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new GOST28147Engine());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new BufferedBlockCipher(new GCFBBlockCipher(new GOST28147Engine())), 64);
        }
    }

    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new GOST28147WrapEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i10) {
            super("GOST28147", i10, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new GOST28147Mac());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90157a = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90157a;
            configurableProvider.addAlgorithm("Cipher.GOST28147", str.concat("$ECB"));
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            StringBuilder sb2 = new StringBuilder("Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR28147_gcfb;
            sb2.append(aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm("KeyGenerator.GOST28147", e.d(str, "$GCFB", configurableProvider, sb2.toString(), "$KeyGen"));
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + aSN1ObjectIdentifier, "GOST28147");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GOST28147", e.d(str, "$AlgParams", configurableProvider, "AlgorithmParameters.GOST28147", "$AlgParamGen"));
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, "GOST28147");
            StringBuilder sbD = androidx.collection.a.d(str, "$CryptoProWrap", configurableProvider, "Cipher." + CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap, "Cipher.");
            sbD.append(CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap);
            configurableProvider.addAlgorithm("Mac.GOST28147MAC", e.d(str, "$GostWrap", configurableProvider, sbD.toString(), "$Mac"));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        f90150a = map2;
        map.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_TestParamSet, "E-TEST");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;
        map.put(aSN1ObjectIdentifier, "E-A");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet;
        map.put(aSN1ObjectIdentifier2, "E-B");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet;
        map.put(aSN1ObjectIdentifier3, "E-C");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet;
        map.put(aSN1ObjectIdentifier4, "E-D");
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z;
        map.put(aSN1ObjectIdentifier5, "PARAM-Z");
        map2.put("E-A", aSN1ObjectIdentifier);
        map2.put("E-B", aSN1ObjectIdentifier2);
        map2.put("E-C", aSN1ObjectIdentifier3);
        map2.put("E-D", aSN1ObjectIdentifier4);
        map2.put("PARAM-Z", aSN1ObjectIdentifier5);
    }
}
