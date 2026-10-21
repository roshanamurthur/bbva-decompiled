package org.bouncycastle.pqc.jcajce.provider.util;

import androidx.appcompat.widget.a;
import androidx.appcompat.widget.o1;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AsymmetricBlockCipher extends CipherSpiExt {
    protected ByteArrayOutputStream buf = new ByteArrayOutputStream();
    protected int cipherTextSize;
    protected int maxPlainTextSize;
    protected AlgorithmParameterSpec paramSpec;

    public void checkLength(int i10) throws IllegalBlockSizeException {
        int size = this.buf.size() + i10;
        int i11 = this.opMode;
        if (i11 == 1) {
            if (size > this.maxPlainTextSize) {
                throw new IllegalBlockSizeException(a.c(o1.c("The length of the plaintext (", size, " bytes) is not supported by the cipher (max. "), this.maxPlainTextSize, " bytes)."));
            }
        } else {
            if (i11 != 2 || size == this.cipherTextSize) {
                return;
            }
            throw new IllegalBlockSizeException("Illegal ciphertext length (expected " + this.cipherTextSize + " bytes, was " + size + " bytes).");
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int doFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (bArr2.length < getOutputSize(i11)) {
            throw new ShortBufferException("Output buffer too short.");
        }
        byte[] bArrDoFinal = doFinal(bArr, i10, i11);
        System.arraycopy(bArrDoFinal, 0, bArr2, i12, bArrDoFinal.length);
        return bArrDoFinal.length;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getBlockSize() {
        return this.opMode == 1 ? this.maxPlainTextSize : this.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] getIV() {
        return null;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getOutputSize(int i10) {
        if (this.buf.size() + i10 > getBlockSize()) {
            return 0;
        }
        return this.opMode == 1 ? this.cipherTextSize : this.maxPlainTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final AlgorithmParameterSpec getParameters() {
        return this.paramSpec;
    }

    public abstract void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public abstract void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public final void initDecrypt(Key key) throws InvalidKeyException {
        try {
            initDecrypt(key, null);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void initEncrypt(Key key) throws InvalidKeyException {
        try {
            initEncrypt(key, null, CryptoServicesRegistrar.getSecureRandom());
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public abstract byte[] messageDecrypt(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException;

    public abstract byte[] messageEncrypt(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException;

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int update(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        update(bArr, i10, i11);
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] doFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        checkLength(i11);
        update(bArr, i10, i11);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        int i12 = this.opMode;
        if (i12 == 1) {
            return messageEncrypt(byteArray);
        }
        if (i12 != 2) {
            return null;
        }
        return messageDecrypt(byteArray);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 2;
        initCipherDecrypt(key, algorithmParameterSpec);
    }

    public final void initEncrypt(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            initEncrypt(key, null, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] update(byte[] bArr, int i10, int i11) {
        if (i11 != 0) {
            this.buf.write(bArr, i10, i11);
        }
        return new byte[0];
    }

    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        initEncrypt(key, algorithmParameterSpec, CryptoServicesRegistrar.getSecureRandom());
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 1;
        initCipherEncrypt(key, algorithmParameterSpec, secureRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void setMode(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void setPadding(String str) {
    }
}
