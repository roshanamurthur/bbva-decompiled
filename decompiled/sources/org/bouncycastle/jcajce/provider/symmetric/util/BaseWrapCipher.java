package org.bouncycastle.jcajce.provider.symmetric.util;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    protected AlgorithmParameters engineParams;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class[] f90226p0;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f90227q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f90228r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ErasableOutputStream f90229s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f90230t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final BCJcaJceHelper f90231u0;
    protected Wrapper wrapEngine;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public static class InvalidKeyOrParametersException extends InvalidKeyException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Throwable f90232p0;

        public InvalidKeyOrParametersException(String str, Exception exc) {
            super(str);
            this.f90232p0 = exc;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f90232p0;
        }
    }

    public BaseWrapCipher() {
        this.f90226p0 = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.f90229s0 = null;
        this.f90231u0 = new BCJcaJceHelper();
    }

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.f90231u0.createAlgorithmParameters(str);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        byte[] bArrWrap;
        ErasableOutputStream erasableOutputStream = this.f90229s0;
        if (erasableOutputStream == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        erasableOutputStream.write(bArr, i10, i11);
        try {
            if (this.f90230t0) {
                try {
                    bArrWrap = this.wrapEngine.wrap(this.f90229s0.getBuf(), 0, this.f90229s0.size());
                } catch (Exception e5) {
                    throw new IllegalBlockSizeException(e5.getMessage());
                }
            } else {
                try {
                    bArrWrap = this.wrapEngine.unwrap(this.f90229s0.getBuf(), 0, this.f90229s0.size());
                } catch (InvalidCipherTextException e7) {
                    throw new BadPaddingException(e7.getMessage());
                }
            }
            if (bArrWrap.length + i12 > bArr2.length) {
                throw new ShortBufferException("output buffer too short for input.");
            }
            System.arraycopy(bArrWrap, 0, bArr2, i12, bArrWrap.length);
            int length = bArrWrap.length;
            this.f90229s0.erase();
            return length;
        } catch (Throwable th2) {
            this.f90229s0.erase();
            throw th2;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return Arrays.clone(this.f90228r0);
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.f90228r0 != null) {
            String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = algorithmParametersCreateParametersInstance;
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(this.f90228r0));
            } catch (Exception e5) {
                throw new RuntimeException(e5.toString());
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            int i11 = 0;
            while (true) {
                Class[] clsArr = this.f90226p0;
                if (i11 == clsArr.length) {
                    break;
                }
                try {
                    parameterSpec = algorithmParameters.getParameterSpec(clsArr[i11]);
                    break;
                } catch (Exception unused) {
                    i11++;
                }
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        this.engineParams = algorithmParameters;
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(f.d("can't support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(h0.b("Padding ", str, " unknown."));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i10) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            Wrapper wrapper = this.wrapEngine;
            byte[] bArrEngineDoFinal = wrapper == null ? engineDoFinal(bArr, 0, bArr.length) : wrapper.unwrap(bArr, 0, bArr.length);
            if (i10 == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            if (str.equals("") && i10 == 2) {
                try {
                    PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(bArrEngineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(privateKeyInfo);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException("algorithm " + privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm() + " not supported");
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory keyFactoryCreateKeyFactory = this.f90231u0.createKeyFactory(str);
                if (i10 == 1) {
                    return keyFactoryCreateKeyFactory.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                }
                if (i10 == 2) {
                    return keyFactoryCreateKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                throw new InvalidKeyException(g0.c("Unknown key type ", i10));
            } catch (NoSuchProviderException e5) {
                throw new InvalidKeyException("Unknown key type " + e5.getMessage());
            } catch (InvalidKeySpecException e7) {
                throw new InvalidKeyException("Unknown key type " + e7.getMessage());
            }
        } catch (BadPaddingException e10) {
            throw new InvalidKeyException(e10.getMessage());
        } catch (IllegalBlockSizeException e11) {
            throw new InvalidKeyException(e11.getMessage());
        } catch (InvalidCipherTextException e12) {
            throw new InvalidKeyException(e12.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException, ShortBufferException {
        ErasableOutputStream erasableOutputStream = this.f90229s0;
        if (erasableOutputStream == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        erasableOutputStream.write(bArr, i10, i11);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            Wrapper wrapper = this.wrapEngine;
            return wrapper == null ? engineDoFinal(encoded, 0, encoded.length) : wrapper.wrap(encoded, 0, encoded.length);
        } catch (BadPaddingException e5) {
            throw new IllegalBlockSizeException(e5.getMessage());
        }
    }

    public BaseWrapCipher(Wrapper wrapper) {
        this(wrapper, 0);
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException, IOException {
        byte[] bArrUnwrap;
        ErasableOutputStream erasableOutputStream = this.f90229s0;
        if (erasableOutputStream == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        if (bArr != null) {
            erasableOutputStream.write(bArr, i10, i11);
        }
        try {
            if (this.f90230t0) {
                try {
                    bArrUnwrap = this.wrapEngine.wrap(this.f90229s0.getBuf(), 0, this.f90229s0.size());
                } catch (Exception e5) {
                    throw new IllegalBlockSizeException(e5.getMessage());
                }
            } else {
                try {
                    bArrUnwrap = this.wrapEngine.unwrap(this.f90229s0.getBuf(), 0, this.f90229s0.size());
                } catch (InvalidCipherTextException e7) {
                    throw new BadPaddingException(e7.getMessage());
                }
            }
            this.f90229s0.erase();
            return bArrUnwrap;
        } catch (Throwable th2) {
            this.f90229s0.erase();
            throw th2;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new InvalidKeyOrParametersException(e5.getMessage(), e5);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) throws IOException {
        ErasableOutputStream erasableOutputStream = this.f90229s0;
        if (erasableOutputStream == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        erasableOutputStream.write(bArr, i10, i11);
        return null;
    }

    public BaseWrapCipher(Wrapper wrapper, int i10) {
        this.f90226p0 = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.f90229s0 = null;
        this.f90231u0 = new BCJcaJceHelper();
        this.wrapEngine = wrapper;
        this.f90227q0 = i10;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters keyParameter;
        int i11;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                keyParameter = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else {
                if (bCPBEKey.getParam() == null) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                keyParameter = bCPBEKey.getParam();
            }
        } else {
            keyParameter = new KeyParameter(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            byte[] iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            this.f90228r0 = iv;
            keyParameter = new ParametersWithIV(keyParameter, iv);
        }
        if (algorithmParameterSpec instanceof GOST28147WrapParameterSpec) {
            GOST28147WrapParameterSpec gOST28147WrapParameterSpec = (GOST28147WrapParameterSpec) algorithmParameterSpec;
            byte[] sBox = gOST28147WrapParameterSpec.getSBox();
            if (sBox != null) {
                keyParameter = new ParametersWithSBox(keyParameter, sBox);
            }
            keyParameter = new ParametersWithUKM(keyParameter, gOST28147WrapParameterSpec.getUKM());
        }
        if ((keyParameter instanceof KeyParameter) && (i11 = this.f90227q0) != 0 && (i10 == 3 || i10 == 1)) {
            byte[] bArr = new byte[i11];
            this.f90228r0 = bArr;
            secureRandom.nextBytes(bArr);
            keyParameter = new ParametersWithIV(keyParameter, this.f90228r0);
        }
        if (secureRandom != null) {
            keyParameter = new ParametersWithRandom(keyParameter, secureRandom);
        }
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.wrapEngine.init(false, keyParameter);
                    this.f90229s0 = new ErasableOutputStream();
                } else if (i10 == 3) {
                    this.wrapEngine.init(true, keyParameter);
                    this.f90229s0 = null;
                } else {
                    if (i10 != 4) {
                        throw new InvalidParameterException("Unknown mode parameter passed to init.");
                    }
                    this.wrapEngine.init(false, keyParameter);
                    this.f90229s0 = null;
                }
                this.f90230t0 = false;
                return;
            }
            this.wrapEngine.init(true, keyParameter);
            this.f90229s0 = new ErasableOutputStream();
            this.f90230t0 = true;
        } catch (Exception e5) {
            throw new InvalidKeyOrParametersException(e5.getMessage(), e5);
        }
    }
}
