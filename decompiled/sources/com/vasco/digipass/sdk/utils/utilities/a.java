package com.vasco.digipass.sdk.utils.utilities;

import bc.org.bouncycastle.crypto.BlockCipher;
import bc.org.bouncycastle.crypto.BufferedBlockCipher;
import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.Digest;
import bc.org.bouncycastle.crypto.digests.MD5Digest;
import bc.org.bouncycastle.crypto.digests.SHA1Digest;
import bc.org.bouncycastle.crypto.digests.SHA256Digest;
import bc.org.bouncycastle.crypto.digests.b;
import bc.org.bouncycastle.crypto.engines.AESEngine;
import bc.org.bouncycastle.crypto.engines.DESEngine;
import bc.org.bouncycastle.crypto.engines.DESedeEngine;
import bc.org.bouncycastle.crypto.modes.CBCBlockCipher;
import bc.org.bouncycastle.crypto.params.KeyParameter;
import bc.org.bouncycastle.crypto.params.ParametersWithIV;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.a5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q0;

/* JADX INFO: loaded from: classes9.dex */
final class a {
    public static UtilitiesSDKCryptoResponse a(byte b10, byte[] bArr) {
        Digest sHA1Digest;
        if (bArr == null) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.INPUT_DATA_NULL);
        }
        if (b10 != 1 && b10 != 2 && b10 != 3 && b10 != 4) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.CRYPTO_MECANISM_INVALID);
        }
        if (b10 == 2) {
            sHA1Digest = new SHA1Digest();
        } else if (b10 != 3) {
            sHA1Digest = b10 != 4 ? new MD5Digest() : new b();
        } else {
            sHA1Digest = new SHA256Digest();
        }
        byte[] bArr2 = new byte[sHA1Digest.getDigestSize()];
        sHA1Digest.update(bArr, 0, bArr.length);
        sHA1Digest.doFinal(bArr2, 0);
        return new UtilitiesSDKCryptoResponse(0, bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    public static byte[] a(boolean z10, byte b10, byte b11, byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        BlockCipher dESEngine;
        BlockCipher a5Var;
        KeyParameter keyParameter;
        CipherParameters parametersWithIV;
        if (b10 == 1) {
            dESEngine = new DESEngine();
        } else if (b10 != 2) {
            dESEngine = new AESEngine();
        } else {
            dESEngine = new DESedeEngine();
        }
        try {
            try {
                if (b11 == 2) {
                    a5Var = new CBCBlockCipher(dESEngine);
                } else if (b11 == 3) {
                    a5Var = new q0(dESEngine, 8);
                } else {
                    if (b11 == 4) {
                        a5Var = new a5(dESEngine);
                    }
                    KeyParameter keyParameter2 = null;
                    keyParameter = new KeyParameter(bArr);
                    if (bArr2 != null || b11 == 1) {
                        parametersWithIV = keyParameter;
                    } else {
                        try {
                            parametersWithIV = new ParametersWithIV(keyParameter, bArr2);
                        } catch (Throwable th2) {
                            th = th2;
                            keyParameter2 = keyParameter;
                            keyParameter2.clear();
                            throw th;
                        }
                    }
                    byte[] bArr4 = new byte[bArr3.length];
                    BufferedBlockCipher bufferedBlockCipher = new BufferedBlockCipher(dESEngine);
                    bufferedBlockCipher.init(z10, parametersWithIV);
                    bufferedBlockCipher.doFinal(bArr4, bufferedBlockCipher.processBytes(bArr3, 0, bArr3.length, bArr4, 0));
                    keyParameter.clear();
                    return bArr4;
                }
                bufferedBlockCipher.doFinal(bArr4, bufferedBlockCipher.processBytes(bArr3, 0, bArr3.length, bArr4, 0));
                keyParameter.clear();
                return bArr4;
            } catch (Exception e5) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.UNKNOWN_ERROR, e5);
            }
            keyParameter = new KeyParameter(bArr);
            if (bArr2 != null) {
                parametersWithIV = keyParameter;
            } else {
                parametersWithIV = keyParameter;
            }
            byte[] bArr5 = new byte[bArr3.length];
            BufferedBlockCipher bufferedBlockCipher2 = new BufferedBlockCipher(dESEngine);
            bufferedBlockCipher2.init(z10, parametersWithIV);
        } catch (Throwable th3) {
            th = th3;
        }
        dESEngine = a5Var;
        KeyParameter keyParameter3 = null;
    }
}
