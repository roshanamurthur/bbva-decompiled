package org.bouncycastle.jcajce.provider.asymmetric.ec;

import androidx.camera.core.processing.f;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.Hashtable;
import om.a;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes8.dex */
public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    public static class EC extends KeyPairGeneratorSpi {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Hashtable f89866h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ECKeyGenerationParameters f89867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ECKeyPairGenerator f89868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AlgorithmParameterSpec f89869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f89870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f89871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f89872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ProviderConfiguration f89873g;

        static {
            Hashtable hashtable = new Hashtable();
            f89866h = hashtable;
            hashtable.put(Integers.valueOf(192), new ECGenParameterSpec("prime192v1"));
            hashtable.put(Integers.valueOf(239), new ECGenParameterSpec("prime239v1"));
            hashtable.put(Integers.valueOf(256), new ECGenParameterSpec("prime256v1"));
            hashtable.put(Integers.valueOf(224), new ECGenParameterSpec("P-224"));
            hashtable.put(Integers.valueOf(BluetoothState.REQUEST_CONNECT_DEVICE), new ECGenParameterSpec("P-384"));
            hashtable.put(Integers.valueOf(ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY), new ECGenParameterSpec("P-521"));
        }

        public EC() {
            super(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC);
            this.f89868b = new ECKeyPairGenerator();
            this.f89869c = null;
            this.f89870d = 239;
            CryptoServicesRegistrar.getSecureRandom();
            this.f89871e = false;
            this.f89872f = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
            this.f89873g = BouncyCastleProvider.CONFIGURATION;
        }

        public ECKeyGenerationParameters createKeyGenParamsBC(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            return new ECKeyGenerationParameters(new ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH()), secureRandom);
        }

        public ECKeyGenerationParameters createKeyGenParamsJCE(java.security.spec.ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            X9ECParameters x9ECParametersC;
            if ((eCParameterSpec instanceof ECNamedCurveSpec) && (x9ECParametersC = a.c(((ECNamedCurveSpec) eCParameterSpec).getName())) != null) {
                return new ECKeyGenerationParameters(new ECDomainParameters(x9ECParametersC.getCurve(), x9ECParametersC.getG(), x9ECParametersC.getN(), x9ECParametersC.getH()), secureRandom);
            }
            ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new ECKeyGenerationParameters(new ECDomainParameters(eCCurveConvertCurve, EC5Util.convertPoint(eCCurveConvertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
        }

        public ECNamedCurveSpec createNamedCurveSpec(String str) throws InvalidAlgorithmParameterException {
            X9ECParameters x9ECParametersC = a.c(str);
            if (x9ECParametersC == null) {
                try {
                    x9ECParametersC = ECNamedCurveTable.getByOID(new ASN1ObjectIdentifier(str));
                    if (x9ECParametersC == null && (x9ECParametersC = (X9ECParameters) this.f89873g.getAdditionalECParameters().get(new ASN1ObjectIdentifier(str))) == null) {
                        throw new InvalidAlgorithmParameterException("unknown curve OID: " + str);
                    }
                } catch (IllegalArgumentException unused) {
                    throw new InvalidAlgorithmParameterException(f.d("unknown curve name: ", str));
                }
            }
            return new ECNamedCurveSpec(str, x9ECParametersC.getCurve(), x9ECParametersC.getG(), x9ECParametersC.getN(), x9ECParametersC.getH(), null);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            if (!this.f89871e) {
                initialize(this.f89870d, new SecureRandom());
            }
            AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f89868b.generateKeyPair();
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
            ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
            AlgorithmParameterSpec algorithmParameterSpec = this.f89869c;
            boolean z10 = algorithmParameterSpec instanceof ECParameterSpec;
            ProviderConfiguration providerConfiguration = this.f89873g;
            String str = this.f89872f;
            if (z10) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(str, eCPublicKeyParameters, eCParameterSpec, providerConfiguration);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.f89872f, eCPrivateKeyParameters, bCECPublicKey, eCParameterSpec, this.f89873g));
            }
            if (algorithmParameterSpec == null) {
                return new KeyPair(new BCECPublicKey(str, eCPublicKeyParameters, providerConfiguration), new BCECPrivateKey(str, eCPrivateKeyParameters, providerConfiguration));
            }
            java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
            BCECPublicKey bCECPublicKey2 = new BCECPublicKey(str, eCPublicKeyParameters, eCParameterSpec2, providerConfiguration);
            return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.f89872f, eCPrivateKeyParameters, bCECPublicKey2, eCParameterSpec2, this.f89873g));
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i10, SecureRandom secureRandom) {
            this.f89870d = i10;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) f89866h.get(Integers.valueOf(i10));
            if (eCGenParameterSpec == null) {
                throw new InvalidParameterException("unknown key size.");
            }
            try {
                initialize(eCGenParameterSpec, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }

        public void initializeNamedCurve(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            ECNamedCurveSpec eCNamedCurveSpecCreateNamedCurveSpec = createNamedCurveSpec(str);
            this.f89869c = eCNamedCurveSpecCreateNamedCurveSpec;
            this.f89867a = createKeyGenParamsJCE(eCNamedCurveSpecCreateNamedCurveSpec, secureRandom);
        }

        public EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.f89868b = new ECKeyPairGenerator();
            this.f89869c = null;
            this.f89870d = 239;
            CryptoServicesRegistrar.getSecureRandom();
            this.f89871e = false;
            this.f89872f = str;
            this.f89873g = providerConfiguration;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            String name;
            ECKeyGenerationParameters eCKeyGenerationParametersCreateKeyGenParamsJCE;
            ECParameterSpec ecImplicitlyCa;
            if (algorithmParameterSpec != null) {
                if (algorithmParameterSpec instanceof ECParameterSpec) {
                    this.f89869c = algorithmParameterSpec;
                    ecImplicitlyCa = (ECParameterSpec) algorithmParameterSpec;
                } else if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
                    this.f89869c = algorithmParameterSpec;
                    eCKeyGenerationParametersCreateKeyGenParamsJCE = createKeyGenParamsJCE((java.security.spec.ECParameterSpec) algorithmParameterSpec, secureRandom);
                    this.f89867a = eCKeyGenerationParametersCreateKeyGenParamsJCE;
                } else {
                    if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                        name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                    } else if (algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec) {
                        name = ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
                    } else {
                        String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                        if (nameFrom == null) {
                            throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
                        }
                        initializeNamedCurve(nameFrom, secureRandom);
                    }
                    initializeNamedCurve(name, secureRandom);
                }
                this.f89868b.init(this.f89867a);
                this.f89871e = true;
            }
            ecImplicitlyCa = this.f89873g.getEcImplicitlyCa();
            if (ecImplicitlyCa == null) {
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            }
            this.f89869c = null;
            eCKeyGenerationParametersCreateKeyGenParamsJCE = createKeyGenParamsBC(ecImplicitlyCa, secureRandom);
            this.f89867a = eCKeyGenerationParametersCreateKeyGenParamsJCE;
            this.f89868b.init(this.f89867a);
            this.f89871e = true;
        }
    }

    public static class ECDH extends EC {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends EC {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends EC {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends EC {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }
}
