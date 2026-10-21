package org.bouncycastle.jcajce.provider.asymmetric.dh;

import androidx.appcompat.view.menu.b;
import androidx.camera.core.processing.f;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHKeyParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.parsers.DHIESPublicKeyParser;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class IESCipher extends CipherSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f89759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IESEngine f89761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteArrayOutputStream f89763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlgorithmParameters f89764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IESParameterSpec f89765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AsymmetricKeyParameter f89766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SecureRandom f89767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AsymmetricKeyParameter f89768j;

    public static class IES extends IESCipher {
        public IES() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()), new HMac(DigestFactory.createSHA1())));
        }
    }

    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()), new HMac(DigestFactory.createSHA1()), new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESEngine()))), 16);
        }
    }

    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()), new HMac(DigestFactory.createSHA1()), new PaddedBufferedBlockCipher(new CBCBlockCipher(new DESedeEngine()))), 8);
        }
    }

    public class a implements KeyEncoder {
        @Override // org.bouncycastle.crypto.KeyEncoder
        public final byte[] getEncoded(AsymmetricKeyParameter asymmetricKeyParameter) {
            int iBitLength = (((DHKeyParameters) asymmetricKeyParameter).getParameters().getP().bitLength() + 7) / 8;
            byte[] bArr = new byte[iBitLength];
            byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(((DHPublicKeyParameters) asymmetricKeyParameter).getY());
            if (bArrAsUnsignedByteArray.length > iBitLength) {
                throw new IllegalArgumentException("Senders's public key longer than expected.");
            }
            System.arraycopy(bArrAsUnsignedByteArray, 0, bArr, iBitLength - bArrAsUnsignedByteArray.length, bArrAsUnsignedByteArray.length);
            return bArr;
        }
    }

    public IESCipher(IESEngine iESEngine) {
        this.f89759a = new BCJcaJceHelper();
        this.f89762d = -1;
        this.f89763e = new ByteArrayOutputStream();
        this.f89764f = null;
        this.f89765g = null;
        this.f89768j = null;
        this.f89761c = iESEngine;
        this.f89760b = 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i10, i11);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i12, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        IESEngine iESEngine = this.f89761c;
        if (iESEngine.getCipher() != null) {
            return iESEngine.getCipher().getBlockSize();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        IESParameterSpec iESParameterSpec = this.f89765g;
        if (iESParameterSpec != null) {
            return iESParameterSpec.getNonce();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        int size;
        BufferedBlockCipher cipher;
        if (this.f89766h == null) {
            throw new IllegalStateException("cipher not initialised");
        }
        IESEngine iESEngine = this.f89761c;
        int macSize = iESEngine.getMac().getMacSize();
        int iBitLength = this.f89768j == null ? (((((DHKeyParameters) this.f89766h).getParameters().getP().bitLength() + 7) * 2) / 8) + 1 : 0;
        if (iESEngine.getCipher() != null) {
            int i11 = this.f89762d;
            if (i11 == 1 || i11 == 3) {
                cipher = iESEngine.getCipher();
            } else {
                if (i11 != 2 && i11 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                cipher = iESEngine.getCipher();
                i10 = (i10 - macSize) - iBitLength;
            }
            i10 = cipher.getOutputSize(i10);
        }
        int i12 = this.f89762d;
        ByteArrayOutputStream byteArrayOutputStream = this.f89763e;
        if (i12 == 1 || i12 == 3) {
            size = byteArrayOutputStream.size() + macSize + iBitLength;
        } else {
            if (i12 != 2 && i12 != 4) {
                throw new IllegalStateException("IESCipher not initialised");
            }
            size = (byteArrayOutputStream.size() - macSize) - iBitLength;
        }
        return size + i10;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f89764f == null && this.f89765g != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.f89759a.createAlgorithmParameters("IES");
                this.f89764f = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.f89765g);
            } catch (Exception e5) {
                throw new RuntimeException(e5.toString());
            }
        }
        return this.f89764f;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(IESParameterSpec.class);
            } catch (Exception e5) {
                throw new InvalidAlgorithmParameterException(b.c(e5, new StringBuilder("cannot recognise parameters: ")));
            }
        } else {
            parameterSpec = null;
        }
        this.f89764f = algorithmParameters;
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = Strings.toUpperCase(str);
        if (!upperCase.equals(ExpectedUserActionOnPoiTypes.NONE) && !upperCase.equals("DHAES")) {
            throw new IllegalArgumentException(f.d("can't support mode ", str));
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (!upperCase.equals("NOPADDING") && !upperCase.equals("PKCS5PADDING") && !upperCase.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        this.f89763e.write(bArr, i10, i11);
        return 0;
    }

    public IESCipher(IESEngine iESEngine, int i10) {
        this.f89759a = new BCJcaJceHelper();
        this.f89762d = -1;
        this.f89763e = new ByteArrayOutputStream();
        this.f89764f = null;
        this.f89765g = null;
        this.f89768j = null;
        this.f89761c = iESEngine;
        this.f89760b = i10;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        ByteArrayOutputStream byteArrayOutputStream = this.f89763e;
        if (i11 != 0) {
            byteArrayOutputStream.write(bArr, i10, i11);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        CipherParameters iESWithCipherParameters = new IESWithCipherParameters(this.f89765g.getDerivationV(), this.f89765g.getEncodingV(), this.f89765g.getMacKeySize(), this.f89765g.getCipherKeySize());
        if (this.f89765g.getNonce() != null) {
            iESWithCipherParameters = new ParametersWithIV(iESWithCipherParameters, this.f89765g.getNonce());
        }
        DHParameters parameters = ((DHKeyParameters) this.f89766h).getParameters();
        AsymmetricKeyParameter asymmetricKeyParameter = this.f89768j;
        IESEngine iESEngine = this.f89761c;
        if (asymmetricKeyParameter != null) {
            try {
                int i12 = this.f89762d;
                if (i12 == 1 || i12 == 3) {
                    iESEngine.init(true, asymmetricKeyParameter, this.f89766h, iESWithCipherParameters);
                } else {
                    iESEngine.init(false, this.f89766h, asymmetricKeyParameter, iESWithCipherParameters);
                }
                return iESEngine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e5) {
                throw new BadBlockException("unable to process block", e5);
            }
        }
        int i13 = this.f89762d;
        if (i13 == 1 || i13 == 3) {
            DHKeyPairGenerator dHKeyPairGenerator = new DHKeyPairGenerator();
            dHKeyPairGenerator.init(new DHKeyGenerationParameters(this.f89767i, parameters));
            try {
                iESEngine.init(this.f89766h, iESWithCipherParameters, new EphemeralKeyPairGenerator(dHKeyPairGenerator, new a()));
                return iESEngine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e7) {
                throw new BadBlockException("unable to process block", e7);
            }
        }
        if (i13 != 2 && i13 != 4) {
            throw new IllegalStateException("IESCipher not initialised");
        }
        try {
            AsymmetricKeyParameter asymmetricKeyParameter2 = this.f89766h;
            iESEngine.init(asymmetricKeyParameter2, iESWithCipherParameters, new DHIESPublicKeyParser(((DHKeyParameters) asymmetricKeyParameter2).getParameters()));
            return iESEngine.processBlock(byteArray, 0, byteArray.length);
        } catch (InvalidCipherTextException e10) {
            throw new BadBlockException("unable to process block", e10);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        this.f89763e.write(bArr, i10, i11);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + e5.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        IESParameterSpec iESParameterSpecGuessParameterSpec;
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePublicKeyParameter;
        PrivateKey privateKey;
        byte[] bArr;
        int i11 = this.f89760b;
        if (algorithmParameterSpec == null) {
            if (i11 == 0 || i10 != 1) {
                bArr = null;
            } else {
                bArr = new byte[i11];
                secureRandom.nextBytes(bArr);
            }
            iESParameterSpecGuessParameterSpec = IESUtil.guessParameterSpec(this.f89761c.getCipher(), bArr);
        } else {
            if (!(algorithmParameterSpec instanceof IESParameterSpec)) {
                throw new InvalidAlgorithmParameterException("must be passed IES parameters");
            }
            iESParameterSpecGuessParameterSpec = (IESParameterSpec) algorithmParameterSpec;
        }
        this.f89765g = iESParameterSpecGuessParameterSpec;
        byte[] nonce = this.f89765g.getNonce();
        if (i11 != 0 && (nonce == null || nonce.length != i11)) {
            throw new InvalidAlgorithmParameterException(androidx.camera.core.impl.utils.b.a("NONCE in IES Parameters needs to be ", i11, " bytes long"));
        }
        if (i10 == 1 || i10 == 3) {
            if (key instanceof DHPublicKey) {
                asymmetricKeyParameterGeneratePublicKeyParameter = DHUtil.generatePublicKeyParameter((PublicKey) key);
            } else {
                if (!(key instanceof IESKey)) {
                    throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
                IESKey iESKey = (IESKey) key;
                this.f89766h = DHUtil.generatePublicKeyParameter(iESKey.getPublic());
                this.f89768j = DHUtil.generatePrivateKeyParameter(iESKey.getPrivate());
            }
            this.f89767i = secureRandom;
            this.f89762d = i10;
            this.f89763e.reset();
        }
        if (i10 != 2 && i10 != 4) {
            throw new InvalidKeyException("must be passed EC key");
        }
        if (key instanceof DHPrivateKey) {
            privateKey = (PrivateKey) key;
        } else {
            if (!(key instanceof IESKey)) {
                throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
            }
            IESKey iESKey2 = (IESKey) key;
            this.f89768j = DHUtil.generatePublicKeyParameter(iESKey2.getPublic());
            privateKey = iESKey2.getPrivate();
        }
        asymmetricKeyParameterGeneratePublicKeyParameter = DHUtil.generatePrivateKeyParameter(privateKey);
        this.f89766h = asymmetricKeyParameterGeneratePublicKeyParameter;
        this.f89767i = secureRandom;
        this.f89762d = i10;
        this.f89763e.reset();
    }
}
