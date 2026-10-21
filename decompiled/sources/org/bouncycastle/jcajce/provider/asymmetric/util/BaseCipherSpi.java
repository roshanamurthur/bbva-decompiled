package org.bouncycastle.jcajce.provider.asymmetric.util;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseCipherSpi extends CipherSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f90027a = new BCJcaJceHelper();
    protected AlgorithmParameters engineParams = null;
    protected Wrapper wrapEngine = null;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public class a extends InvalidKeyException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BadPaddingException f90028p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BadPaddingException badPaddingException) {
            super("unable to unwrap");
            this.f90028p0 = badPaddingException;
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable getCause() {
            return this.f90028p0;
        }
    }

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.f90027a.createAlgorithmParameters(str);
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
        return key.getEncoded().length;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
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
    public Key engineUnwrap(byte[] bArr, String str, int i10) throws InvalidKeyException {
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
                KeyFactory keyFactoryCreateKeyFactory = this.f90027a.createKeyFactory(str);
                if (i10 == 1) {
                    return keyFactoryCreateKeyFactory.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                }
                if (i10 == 2) {
                    return keyFactoryCreateKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                throw new InvalidKeyException(g0.c("Unknown key type ", i10));
            } catch (NoSuchAlgorithmException e5) {
                throw new InvalidKeyException("Unknown key type " + e5.getMessage());
            } catch (NoSuchProviderException e7) {
                throw new InvalidKeyException("Unknown key type " + e7.getMessage());
            } catch (InvalidKeySpecException e10) {
                throw new InvalidKeyException("Unknown key type " + e10.getMessage());
            }
        } catch (BadPaddingException e11) {
            throw new a(e11);
        } catch (IllegalBlockSizeException e12) {
            throw new InvalidKeyException(e12.getMessage());
        } catch (InvalidCipherTextException e13) {
            throw new InvalidKeyException(e13.getMessage());
        }
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
}
