package org.bouncycastle.jcajce.provider.asymmetric.ec;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.agreement.ECDHCBasicAgreement;
import org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement;
import org.bouncycastle.crypto.agreement.ECMQVBasicAgreement;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.ECDHUPrivateParameters;
import org.bouncycastle.crypto.params.ECDHUPublicParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.MQVPrivateParameters;
import org.bouncycastle.crypto.params.MQVPublicParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.MQVPrivateKey;
import org.bouncycastle.jce.interfaces.MQVPublicKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final X9IntegerConverter f89856k = new X9IntegerConverter();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f89857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ECDomainParameters f89858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f89859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MQVParameterSpec f89860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DHUParameterSpec f89861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f89862j;

    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", new ECDHCBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DH extends KeyAgreementSpi {
        public DH() {
            super("ECDH", new ECDHBasicAgreement(), (DerivationFunction) null);
        }
    }

    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", new ECDHCBasicAgreement(), (DerivationFunction) null);
        }
    }

    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new ECDHCUnifiedAgreement(), (DerivationFunction) null);
        }
    }

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("ECCDHUwithSHA1CKDF", new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("ECCDHUwithSHA1KDF", new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("ECCDHUwithSHA224CKDF", new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("ECCDHUwithSHA224KDF", new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("ECCDHUwithSHA256CKDF", new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("ECCDHUwithSHA256KDF", new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("ECCDHUwithSHA384CKDF", new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("ECCDHUwithSHA384KDF", new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("ECCDHUwithSHA512CKDF", new ECDHCUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("ECCDHUwithSHA512KDF", new ECDHCUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", new ECDHCBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", new ECDHCBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", new ECDHCBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", new ECDHCBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(new RIPEMD160Digest()));
        }
    }

    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super("ECKAEGwithSHA1KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super("ECKAEGwithSHA224KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super("ECKAEGwithSHA256KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super("ECKAEGwithSHA384KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super("ECKAEGwithSHA512KDF", new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", new ECMQVBasicAgreement(), (DerivationFunction) null);
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("ECMQVwithSHA1KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("ECMQVwithSHA224KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("ECMQVwithSHA256KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("ECMQVwithSHA384KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", new ECMQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("ECMQVwithSHA512KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", new ECMQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public class a extends InvalidKeyException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Exception f89863p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Exception exc) {
            super(str);
            this.f89863p0 = exc;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f89863p0;
        }
    }

    public KeyAgreementSpi(String str, BasicAgreement basicAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.f89857e = str;
        this.f89859g = basicAgreement;
    }

    public static String b(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        X9IntegerConverter x9IntegerConverter = f89856k;
        return x9IntegerConverter.integerToBytes(bigInteger, x9IntegerConverter.getByteLength(this.f89858f.getCurve()));
    }

    public final void c(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        ECPrivateKeyParameters eCPrivateKeyParameters;
        ECPrivateKeyParameters eCPrivateKeyParameters2;
        Object obj = this.f89859g;
        boolean z10 = obj instanceof ECMQVBasicAgreement;
        String str = this.f89857e;
        ECPublicKeyParameters eCPublicKeyParameters = null;
        if (z10) {
            this.f89860h = null;
            boolean z11 = key instanceof MQVPrivateKey;
            if (!z11 && !(algorithmParameterSpec instanceof MQVParameterSpec)) {
                throw new InvalidAlgorithmParameterException(str + " key agreement requires " + b(MQVParameterSpec.class) + " for initialisation");
            }
            if (z11) {
                MQVPrivateKey mQVPrivateKey = (MQVPrivateKey) key;
                eCPrivateKeyParameters2 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter(mQVPrivateKey.getStaticPrivateKey());
                eCPrivateKeyParameters = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter(mQVPrivateKey.getEphemeralPrivateKey());
                if (mQVPrivateKey.getEphemeralPublicKey() != null) {
                    eCPublicKeyParameters = (ECPublicKeyParameters) om.a.a(mQVPrivateKey.getEphemeralPublicKey());
                }
            } else {
                MQVParameterSpec mQVParameterSpec = (MQVParameterSpec) algorithmParameterSpec;
                ECPrivateKeyParameters eCPrivateKeyParameters3 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
                eCPrivateKeyParameters = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter(mQVParameterSpec.getEphemeralPrivateKey());
                eCPublicKeyParameters = mQVParameterSpec.getEphemeralPublicKey() != null ? (ECPublicKeyParameters) om.a.a(mQVParameterSpec.getEphemeralPublicKey()) : null;
                this.f89860h = mQVParameterSpec;
                this.ukmParameters = mQVParameterSpec.getUserKeyingMaterial();
                eCPrivateKeyParameters2 = eCPrivateKeyParameters3;
            }
            MQVPrivateParameters mQVPrivateParameters = new MQVPrivateParameters(eCPrivateKeyParameters2, eCPrivateKeyParameters, eCPublicKeyParameters);
            this.f89858f = eCPrivateKeyParameters2.getParameters();
            ((ECMQVBasicAgreement) obj).init(mQVPrivateParameters);
            return;
        }
        if (!(algorithmParameterSpec instanceof DHUParameterSpec)) {
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException(str + " key agreement requires " + b(ECPrivateKey.class) + " for initialisation");
            }
            if (this.kdf == null && (algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            ECPrivateKeyParameters eCPrivateKeyParameters4 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.f89858f = eCPrivateKeyParameters4.getParameters();
            this.ukmParameters = algorithmParameterSpec instanceof UserKeyingMaterialSpec ? ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial() : null;
            ((BasicAgreement) obj).init(eCPrivateKeyParameters4);
            return;
        }
        if (!(obj instanceof ECDHCUnifiedAgreement)) {
            throw new InvalidAlgorithmParameterException(str + " key agreement cannot be used with " + b(DHUParameterSpec.class));
        }
        DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
        ECPrivateKeyParameters eCPrivateKeyParameters5 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        ECPrivateKeyParameters eCPrivateKeyParameters6 = (ECPrivateKeyParameters) ECUtil.generatePrivateKeyParameter(dHUParameterSpec.getEphemeralPrivateKey());
        ECPublicKeyParameters eCPublicKeyParameters2 = dHUParameterSpec.getEphemeralPublicKey() != null ? (ECPublicKeyParameters) om.a.a(dHUParameterSpec.getEphemeralPublicKey()) : null;
        this.f89861i = dHUParameterSpec;
        this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
        ECDHUPrivateParameters eCDHUPrivateParameters = new ECDHUPrivateParameters(eCPrivateKeyParameters5, eCPrivateKeyParameters6, eCPublicKeyParameters2);
        this.f89858f = eCPrivateKeyParameters5.getParameters();
        ((ECDHCUnifiedAgreement) obj).init(eCDHUPrivateParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return Arrays.clone(this.f89862j);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z10) throws IllegalStateException, InvalidKeyException {
        CipherParameters cipherParametersA;
        ECDomainParameters eCDomainParameters = this.f89858f;
        String str = this.f89857e;
        if (eCDomainParameters == null) {
            throw new IllegalStateException(u.f(str, " not initialised."));
        }
        if (!z10) {
            throw new IllegalStateException(u.f(str, " can only be between two parties."));
        }
        Object obj = this.f89859g;
        if (obj instanceof ECMQVBasicAgreement) {
            if (key instanceof MQVPublicKey) {
                MQVPublicKey mQVPublicKey = (MQVPublicKey) key;
                cipherParametersA = new MQVPublicParameters((ECPublicKeyParameters) om.a.a(mQVPublicKey.getStaticKey()), (ECPublicKeyParameters) om.a.a(mQVPublicKey.getEphemeralKey()));
            } else {
                cipherParametersA = new MQVPublicParameters((ECPublicKeyParameters) om.a.a((PublicKey) key), (ECPublicKeyParameters) om.a.a(this.f89860h.getOtherPartyEphemeralKey()));
            }
        } else if (obj instanceof ECDHCUnifiedAgreement) {
            cipherParametersA = new ECDHUPublicParameters((ECPublicKeyParameters) om.a.a((PublicKey) key), (ECPublicKeyParameters) om.a.a(this.f89861i.getOtherPartyEphemeralKey()));
        } else {
            if (!(key instanceof PublicKey)) {
                StringBuilder sbE = f.e(str, " key agreement requires ");
                sbE.append(b(ECPublicKey.class));
                sbE.append(" for doPhase");
                throw new InvalidKeyException(sbE.toString());
            }
            cipherParametersA = om.a.a((PublicKey) key);
        }
        try {
            if (obj instanceof BasicAgreement) {
                this.f89862j = bigIntToBytes(((BasicAgreement) obj).calculateAgreement(cipherParametersA));
                return null;
            }
            this.f89862j = ((ECDHCUnifiedAgreement) obj).calculateAgreement(cipherParametersA);
            return null;
        } catch (Exception e5) {
            throw new a(ci.a.b(e5, new StringBuilder("calculation failed: ")), e5);
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            c(key, null);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    public KeyAgreementSpi(String str, ECDHCUnifiedAgreement eCDHCUnifiedAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.f89857e = str;
        this.f89859g = eCDHCUnifiedAgreement;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof MQVParameterSpec) && !(algorithmParameterSpec instanceof UserKeyingMaterialSpec) && !(algorithmParameterSpec instanceof DHUParameterSpec)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        c(key, algorithmParameterSpec);
    }
}
