package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class LegacyAESGCM {
    public static final int AUTH_TAG_BIT_LENGTH = 128;

    public static AESEngine createAESCipher(SecretKey secretKey, boolean z10) {
        AESEngine aESEngine = new AESEngine();
        aESEngine.init(z10, new KeyParameter(secretKey.getEncoded()));
        return aESEngine;
    }

    public static byte[] decrypt(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws JOSEException {
        GCMBlockCipher gCMBlockCipher = new GCMBlockCipher(createAESCipher(secretKey, false));
        gCMBlockCipher.init(false, new AEADParameters(new KeyParameter(secretKey.getEncoded()), 128, bArr, bArr3));
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[gCMBlockCipher.getOutputSize(length)];
        try {
            gCMBlockCipher.doFinal(bArr6, gCMBlockCipher.processBytes(bArr5, 0, length, bArr6, 0));
            return bArr6;
        } catch (InvalidCipherTextException e5) {
            throw new JOSEException("Couldn't validate GCM authentication tag: " + e5.getMessage(), e5);
        }
    }

    public static AuthenticatedCipherText encrypt(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws JOSEException {
        GCMBlockCipher gCMBlockCipher = new GCMBlockCipher(createAESCipher(secretKey, true));
        gCMBlockCipher.init(true, new AEADParameters(new KeyParameter(secretKey.getEncoded()), 128, bArr, bArr3));
        byte[] bArr4 = new byte[gCMBlockCipher.getOutputSize(bArr2.length)];
        int iProcessBytes = gCMBlockCipher.processBytes(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int iDoFinal = (iProcessBytes + gCMBlockCipher.doFinal(bArr4, iProcessBytes)) - 16;
            byte[] bArr5 = new byte[iDoFinal];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, iDoFinal);
            System.arraycopy(bArr4, iDoFinal, bArr6, 0, 16);
            return new AuthenticatedCipherText(bArr5, bArr6);
        } catch (InvalidCipherTextException e5) {
            throw new JOSEException("Couldn't generate GCM authentication tag: " + e5.getMessage(), e5);
        }
    }
}
