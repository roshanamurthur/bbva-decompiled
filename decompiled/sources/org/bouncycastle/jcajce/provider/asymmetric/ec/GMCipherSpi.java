package org.bouncycastle.jcajce.provider.asymmetric.ec;

import androidx.camera.core.processing.f;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import om.a;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.digests.Blake2sDigest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.crypto.engines.SM2Engine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class GMCipherSpi extends CipherSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SM2Engine f89836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ErasableOutputStream f89838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AsymmetricKeyParameter f89839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SecureRandom f89840e;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public static class SM2 extends GMCipherSpi {
        public SM2() {
            super(new SM2Engine());
        }
    }

    public static class SM2withBlake2b extends GMCipherSpi {
        public SM2withBlake2b() {
            super(new SM2Engine(new Blake2bDigest(512)));
        }
    }

    public static class SM2withBlake2s extends GMCipherSpi {
        public SM2withBlake2s() {
            super(new SM2Engine(new Blake2sDigest(256)));
        }
    }

    public static class SM2withMD5 extends GMCipherSpi {
        public SM2withMD5() {
            super(new SM2Engine(new MD5Digest()));
        }
    }

    public static class SM2withRMD extends GMCipherSpi {
        public SM2withRMD() {
            super(new SM2Engine(new RIPEMD160Digest()));
        }
    }

    public static class SM2withSha1 extends GMCipherSpi {
        public SM2withSha1() {
            super(new SM2Engine(new SHA1Digest()));
        }
    }

    public static class SM2withSha224 extends GMCipherSpi {
        public SM2withSha224() {
            super(new SM2Engine(new SHA224Digest()));
        }
    }

    public static class SM2withSha256 extends GMCipherSpi {
        public SM2withSha256() {
            super(new SM2Engine(new SHA256Digest()));
        }
    }

    public static class SM2withSha384 extends GMCipherSpi {
        public SM2withSha384() {
            super(new SM2Engine(new SHA384Digest()));
        }
    }

    public static class SM2withSha512 extends GMCipherSpi {
        public SM2withSha512() {
            super(new SM2Engine(new SHA512Digest()));
        }
    }

    public static class SM2withWhirlpool extends GMCipherSpi {
        public SM2withWhirlpool() {
            super(new SM2Engine(new WhirlpoolDigest()));
        }
    }

    public GMCipherSpi(SM2Engine sM2Engine) {
        new BCJcaJceHelper();
        this.f89837b = -1;
        this.f89838c = new ErasableOutputStream();
        this.f89836a = sM2Engine;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i10, i11);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i12, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
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
        int i11 = this.f89837b;
        SM2Engine sM2Engine = this.f89836a;
        if (i11 == 1 || i11 == 3) {
            return sM2Engine.getOutputSize(i10);
        }
        if (i11 == 2 || i11 == 4) {
            return sM2Engine.getOutputSize(i10);
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters != null) {
            throw new InvalidAlgorithmParameterException("cannot recognise parameters: ".concat(algorithmParameters.getClass().getName()));
        }
        engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (!Strings.toUpperCase(str).equals(ExpectedUserActionOnPoiTypes.NONE)) {
            throw new IllegalArgumentException(f.d("can't support mode ", str));
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!Strings.toUpperCase(str).equals("NOPADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException {
        this.f89838c.write(bArr, i10, i11);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException, IOException {
        ErasableOutputStream erasableOutputStream = this.f89838c;
        if (i11 != 0) {
            erasableOutputStream.write(bArr, i10, i11);
        }
        try {
            int i12 = this.f89837b;
            SM2Engine sM2Engine = this.f89836a;
            if (i12 == 1 || i12 == 3) {
                try {
                    sM2Engine.init(true, new ParametersWithRandom(this.f89839d, this.f89840e));
                    byte[] bArrProcessBlock = sM2Engine.processBlock(erasableOutputStream.getBuf(), 0, erasableOutputStream.size());
                    erasableOutputStream.erase();
                    return bArrProcessBlock;
                } catch (Exception e5) {
                    throw new BadBlockException("unable to process block", e5);
                }
            }
            if (i12 != 2 && i12 != 4) {
                throw new IllegalStateException("cipher not initialised");
            }
            try {
                sM2Engine.init(false, this.f89839d);
                byte[] bArrProcessBlock2 = sM2Engine.processBlock(erasableOutputStream.getBuf(), 0, erasableOutputStream.size());
                erasableOutputStream.erase();
                return bArrProcessBlock2;
            } catch (Exception e7) {
                throw new BadBlockException("unable to process block", e7);
            }
        } catch (Throwable th2) {
            erasableOutputStream.erase();
            throw th2;
        }
        erasableOutputStream.erase();
        throw th2;
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
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) throws IOException {
        this.f89838c.write(bArr, i10, i11);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AsymmetricKeyParameter asymmetricKeyParameterA;
        if (i10 == 1 || i10 == 3) {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException("must be passed public EC key for encryption");
            }
            asymmetricKeyParameterA = a.a((PublicKey) key);
        } else {
            if (i10 != 2 && i10 != 4) {
                throw new InvalidKeyException("must be passed EC key");
            }
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException("must be passed private EC key for decryption");
            }
            asymmetricKeyParameterA = ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.f89839d = asymmetricKeyParameterA;
        if (secureRandom != null) {
            this.f89840e = secureRandom;
        } else {
            this.f89840e = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f89837b = i10;
        this.f89838c.reset();
    }
}
