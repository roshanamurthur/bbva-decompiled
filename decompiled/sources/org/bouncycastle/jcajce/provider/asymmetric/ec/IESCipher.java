package org.bouncycastle.jcajce.provider.asymmetric.ec;

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
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.parsers.ECIESPublicKeyParser;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class IESCipher extends CipherSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f89845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IESEngine f89847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteArrayOutputStream f89849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlgorithmParameters f89850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IESParameterSpec f89851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AsymmetricKeyParameter f89852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SecureRandom f89853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AsymmetricKeyParameter f89854j;

    public static class ECIES extends IESCipher {
        public ECIES() {
            super(new IESEngine(new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()), new HMac(DigestFactory.createSHA1())));
        }
    }

    public static class ECIESwithAESCBC extends ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new CBCBlockCipher(new AESEngine()), 16);
        }
    }

    public static class ECIESwithCipher extends IESCipher {
        public ECIESwithCipher(BlockCipher blockCipher, int i10) {
            super(new IESEngine(new ECDHBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()), new HMac(DigestFactory.createSHA1()), new PaddedBufferedBlockCipher(blockCipher)), i10);
        }
    }

    public static class ECIESwithDESedeCBC extends ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new CBCBlockCipher(new DESedeEngine()), 8);
        }
    }

    public class a implements KeyEncoder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f89855a;

        public a(boolean z10) {
            this.f89855a = z10;
        }

        @Override // org.bouncycastle.crypto.KeyEncoder
        public final byte[] getEncoded(AsymmetricKeyParameter asymmetricKeyParameter) {
            return ((ECPublicKeyParameters) asymmetricKeyParameter).getQ().getEncoded(this.f89855a);
        }
    }

    public IESCipher(IESEngine iESEngine) {
        this.f89845a = new BCJcaJceHelper();
        this.f89848d = -1;
        this.f89849e = new ByteArrayOutputStream();
        this.f89850f = null;
        this.f89851g = null;
        this.f89854j = null;
        this.f89847c = iESEngine;
        this.f89846b = 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i10, i11);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i12, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        IESEngine iESEngine = this.f89847c;
        if (iESEngine.getCipher() != null) {
            return iESEngine.getCipher().getBlockSize();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        IESParameterSpec iESParameterSpec = this.f89851g;
        if (iESParameterSpec != null) {
            return iESParameterSpec.getNonce();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof ECKey) {
            return ((ECKey) key).getParameters().getCurve().getFieldSize();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        int size;
        BufferedBlockCipher cipher;
        if (this.f89852h == null) {
            throw new IllegalStateException("cipher not initialised");
        }
        IESEngine iESEngine = this.f89847c;
        int macSize = iESEngine.getMac().getMacSize();
        int fieldSize = this.f89854j == null ? ((((ECKeyParameters) this.f89852h).getParameters().getCurve().getFieldSize() + 7) / 8) * 2 : 0;
        if (iESEngine.getCipher() != null) {
            int i11 = this.f89848d;
            if (i11 == 1 || i11 == 3) {
                cipher = iESEngine.getCipher();
            } else {
                if (i11 != 2 && i11 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                }
                cipher = iESEngine.getCipher();
                i10 = (i10 - macSize) - fieldSize;
            }
            i10 = cipher.getOutputSize(i10);
        }
        int i12 = this.f89848d;
        ByteArrayOutputStream byteArrayOutputStream = this.f89849e;
        if (i12 == 1 || i12 == 3) {
            size = byteArrayOutputStream.size() + macSize + 1 + fieldSize;
        } else {
            if (i12 != 2 && i12 != 4) {
                throw new IllegalStateException("cipher not initialised");
            }
            size = (byteArrayOutputStream.size() - macSize) - fieldSize;
        }
        return size + i10;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f89850f == null && this.f89851g != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.f89845a.createAlgorithmParameters("IES");
                this.f89850f = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.f89851g);
            } catch (Exception e5) {
                throw new RuntimeException(e5.toString());
            }
        }
        return this.f89850f;
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
        this.f89850f = algorithmParameters;
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
        this.f89849e.write(bArr, i10, i11);
        return 0;
    }

    public IESCipher(IESEngine iESEngine, int i10) {
        this.f89845a = new BCJcaJceHelper();
        this.f89848d = -1;
        this.f89849e = new ByteArrayOutputStream();
        this.f89850f = null;
        this.f89851g = null;
        this.f89854j = null;
        this.f89847c = iESEngine;
        this.f89846b = i10;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        ByteArrayOutputStream byteArrayOutputStream = this.f89849e;
        if (i11 != 0) {
            byteArrayOutputStream.write(bArr, i10, i11);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        CipherParameters iESWithCipherParameters = new IESWithCipherParameters(this.f89851g.getDerivationV(), this.f89851g.getEncodingV(), this.f89851g.getMacKeySize(), this.f89851g.getCipherKeySize());
        if (this.f89851g.getNonce() != null) {
            iESWithCipherParameters = new ParametersWithIV(iESWithCipherParameters, this.f89851g.getNonce());
        }
        ECDomainParameters parameters = ((ECKeyParameters) this.f89852h).getParameters();
        AsymmetricKeyParameter asymmetricKeyParameter = this.f89854j;
        IESEngine iESEngine = this.f89847c;
        if (asymmetricKeyParameter != null) {
            try {
                int i12 = this.f89848d;
                if (i12 == 1 || i12 == 3) {
                    iESEngine.init(true, asymmetricKeyParameter, this.f89852h, iESWithCipherParameters);
                } else {
                    iESEngine.init(false, this.f89852h, asymmetricKeyParameter, iESWithCipherParameters);
                }
                return iESEngine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e5) {
                throw new BadBlockException("unable to process block", e5);
            }
        }
        int i13 = this.f89848d;
        if (i13 == 1 || i13 == 3) {
            ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
            eCKeyPairGenerator.init(new ECKeyGenerationParameters(parameters, this.f89853i));
            try {
                iESEngine.init(this.f89852h, iESWithCipherParameters, new EphemeralKeyPairGenerator(eCKeyPairGenerator, new a(this.f89851g.getPointCompression())));
                return iESEngine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e7) {
                throw new BadBlockException("unable to process block", e7);
            }
        }
        if (i13 != 2 && i13 != 4) {
            throw new IllegalStateException("cipher not initialised");
        }
        try {
            iESEngine.init(this.f89852h, iESWithCipherParameters, new ECIESPublicKeyParser(parameters));
            return iESEngine.processBlock(byteArray, 0, byteArray.length);
        } catch (InvalidCipherTextException e10) {
            throw new BadBlockException("unable to process block", e10);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        this.f89849e.write(bArr, i10, i11);
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
        AsymmetricKeyParameter asymmetricKeyParameterA;
        PrivateKey privateKey;
        byte[] bArr = null;
        this.f89854j = null;
        int i11 = this.f89846b;
        if (algorithmParameterSpec == null) {
            if (i11 != 0 && i10 == 1) {
                bArr = new byte[i11];
                secureRandom.nextBytes(bArr);
            }
            iESParameterSpecGuessParameterSpec = IESUtil.guessParameterSpec(this.f89847c.getCipher(), bArr);
        } else {
            if (!(algorithmParameterSpec instanceof IESParameterSpec)) {
                throw new InvalidAlgorithmParameterException("must be passed IES parameters");
            }
            iESParameterSpecGuessParameterSpec = (IESParameterSpec) algorithmParameterSpec;
        }
        this.f89851g = iESParameterSpecGuessParameterSpec;
        byte[] nonce = this.f89851g.getNonce();
        if (i11 != 0 && (nonce == null || nonce.length != i11)) {
            throw new InvalidAlgorithmParameterException(androidx.camera.core.impl.utils.b.a("NONCE in IES Parameters needs to be ", i11, " bytes long"));
        }
        if (i10 == 1 || i10 == 3) {
            if (key instanceof PublicKey) {
                asymmetricKeyParameterA = om.a.a((PublicKey) key);
            } else {
                if (!(key instanceof IESKey)) {
                    throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
                IESKey iESKey = (IESKey) key;
                this.f89852h = om.a.a(iESKey.getPublic());
                this.f89854j = ECUtil.generatePrivateKeyParameter(iESKey.getPrivate());
            }
            this.f89853i = secureRandom;
            this.f89848d = i10;
            this.f89849e.reset();
        }
        if (i10 != 2 && i10 != 4) {
            throw new InvalidKeyException("must be passed EC key");
        }
        if (key instanceof PrivateKey) {
            privateKey = (PrivateKey) key;
        } else {
            if (!(key instanceof IESKey)) {
                throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
            }
            IESKey iESKey2 = (IESKey) key;
            this.f89854j = om.a.a(iESKey2.getPublic());
            privateKey = iESKey2.getPrivate();
        }
        asymmetricKeyParameterA = ECUtil.generatePrivateKeyParameter(privateKey);
        this.f89852h = asymmetricKeyParameterA;
        this.f89853i = secureRandom;
        this.f89848d = i10;
        this.f89849e.reset();
    }
}
