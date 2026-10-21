package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.crypto;

import android.media.MediaCodec;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.utils.LogTohu;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class CryptoUtils {
    private static final int DEFAULT_BLOCK_SIZE = 16;
    private static final String TAG = "CryptoUtils";

    public enum Mode {
        ENCRYPT,
        DECRYPT
    }

    private static byte[] addIso7816Padding(byte[] bArr) {
        return addIso7816Padding(bArr, 16);
    }

    public static byte[] aes(byte[] bArr, byte[] bArr2, boolean z10) throws InternalErrorException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            if (z10) {
                cipher.init(1, secretKeySpec);
            } else {
                cipher.init(2, secretKeySpec);
            }
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException e5) {
            e = e5;
            throw new InternalErrorException(e.toString());
        } catch (NoSuchAlgorithmException e7) {
            e = e7;
            throw new InternalErrorException(e.toString());
        } catch (BadPaddingException e10) {
            e = e10;
            throw new InternalErrorException(e.toString());
        } catch (IllegalBlockSizeException e11) {
            e = e11;
            throw new InternalErrorException(e.toString());
        } catch (NoSuchPaddingException e12) {
            e = e12;
            throw new InternalErrorException(e.toString());
        }
    }

    public static byte[] aesEcb(byte[] bArr, byte[] bArr2, Mode mode) throws GeneralSecurityException {
        return aes(bArr, bArr2, mode, true);
    }

    public static byte[] aesEcbWithPadding(byte[] bArr, byte[] bArr2, Mode mode) throws GeneralSecurityException {
        Mode mode2 = Mode.ENCRYPT;
        return mode == mode2 ? aesEcb(addIso7816Padding(bArr), bArr2, mode2) : removeIso7816Padding(aesEcb(bArr, bArr2, Mode.DECRYPT));
    }

    public static byte[] aesWithPadding(byte[] bArr, byte[] bArr2, boolean z10) throws GeneralSecurityException, InternalErrorException {
        return z10 ? aes(addIso7816Padding(bArr), bArr2, true) : removeIso7816Padding(aes(bArr, bArr2, false));
    }

    public static byte[] decryptIccComponent(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InternalErrorException {
        try {
            return aesWithPadding(bArr, bArr2, false);
        } catch (MediaCodec.CryptoException e5) {
            LogTohu.e(TAG, "DecryptIccComponent Error.", e5);
            return null;
        }
    }

    private static byte[] removeIso7816Padding(byte[] bArr) throws GeneralSecurityException {
        return removeIso7816Padding(bArr, 16);
    }

    private static byte[] addIso7816Padding(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[(bArr.length + i10) - (bArr.length % i10)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = -128;
        return bArr2;
    }

    private static byte[] removeIso7816Padding(byte[] bArr, int i10) throws GeneralSecurityException {
        if (bArr == null || bArr.length < i10) {
            throw new GeneralSecurityException("Invalid input size");
        }
        boolean z10 = true;
        int length = bArr.length - 1;
        int i11 = 0;
        while (true) {
            if (length < bArr.length - i10) {
                z10 = false;
                break;
            }
            i11++;
            byte b10 = bArr[length];
            if (b10 != 0 && b10 == -128) {
                break;
            }
            length--;
        }
        if (!z10) {
            return bArr;
        }
        int length2 = bArr.length - i11;
        byte[] bArr2 = new byte[length2];
        System.arraycopy(bArr, 0, bArr2, 0, length2);
        return bArr2;
    }

    private static byte[] aes(byte[] bArr, byte[] bArr2, Mode mode, boolean z10) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            byte[] bArr3 = new byte[16];
            Cipher cipher = Cipher.getInstance("AES/" + (z10 ? "ECB" : "CBC") + "/NoPadding");
            if (mode == Mode.ENCRYPT) {
                if (z10) {
                    cipher.init(1, secretKeySpec);
                } else {
                    cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                }
            } else if (z10) {
                cipher.init(2, secretKeySpec);
            } else {
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            }
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e5) {
            e = e5;
            throw new GeneralSecurityException(e.toString());
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new GeneralSecurityException(e.toString());
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            throw new GeneralSecurityException(e.toString());
        } catch (BadPaddingException e11) {
            e = e11;
            throw new GeneralSecurityException(e.toString());
        } catch (IllegalBlockSizeException e12) {
            e = e12;
            throw new GeneralSecurityException(e.toString());
        } catch (NoSuchPaddingException e13) {
            e = e13;
            throw new GeneralSecurityException(e.toString());
        }
    }
}
