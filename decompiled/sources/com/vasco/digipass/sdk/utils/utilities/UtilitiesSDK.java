package com.vasco.digipass.sdk.utils.utilities;

import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o5;
import com.vasco.digipass.sdk.utils.utilities.responses.UtilitiesSDKSecureChannelGenerateResponse;
import com.vasco.digipass.sdk.utils.utilities.responses.UtilitiesSDKSecureChannelParseResponse;
import com.vasco.digipass.sdk.utils.utilities.sc.UtilitiesSDKSecureChannelMessage;
import com.vasco.digipass.sdk.utils.utilities.sc.UtilitiesSDKSecureChannelMessageGenerator;
import com.vasco.digipass.sdk.utils.utilities.sc.UtilitiesSDKSecureChannelMessageParser;
import com.vasco.digipass.sdk.utils.utilities.wbc.UtilitiesSDKWhiteBoxCryptography;
import com.vasco.digipass.sdk.utils.utilities.wbc.WBCTable;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes9.dex */
public final class UtilitiesSDK {
    public static final String VERSION = "4.29.0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f65909a = {37, -107, 7, 103, -67, 2, 2, -126};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f65910b = {29, -5, -57, MessageUtils.MESSAGE_18_DC2, -122, -88, 19, -88};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f65911c = {43, 44, -76, 4, -94, 125, 23, 28};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f65912d = {17, 72, 123, 99, KSUtils.PLAIN_BUFFER, 7, 100, 118};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f65913e = {45, -111, 107, -120, -61, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -5, -36};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f65914f = {1, -110, -76, -72, 85, 87, 53, -126};

    private UtilitiesSDK() {
    }

    private static int a(byte b10, byte b11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return UtilitiesSDKReturnCodes.KEY_NULL;
        }
        if (bArr3 == null) {
            return UtilitiesSDKReturnCodes.INPUT_DATA_NULL;
        }
        if (b10 != 1 && b10 != 2 && b10 != 3) {
            return UtilitiesSDKReturnCodes.CRYPTO_MECANISM_INVALID;
        }
        if (b11 != 1 && b11 != 2 && b11 != 3 && b11 != 4) {
            return UtilitiesSDKReturnCodes.CRYPTO_MODE_INVALID;
        }
        if (b10 == 1) {
            Integer numB = b(b11, bArr, bArr2, bArr3);
            if (numB != null) {
                return numB.intValue();
            }
        } else if (b10 != 2) {
            Integer numA = a(b11, bArr, bArr2, bArr3);
            if (numA != null) {
                return numA.intValue();
            }
        } else {
            Integer numC = c(b11, bArr, bArr2, bArr3);
            if (numC != null) {
                return numC.intValue();
            }
        }
        if (b11 == 4 && bArr2 == null) {
            return UtilitiesSDKReturnCodes.INITIAL_VECTOR_NULL;
        }
        return 0;
    }

    private static Integer b(byte b10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 8) {
            return Integer.valueOf(UtilitiesSDKReturnCodes.KEY_INCORRECT_LENGTH);
        }
        if (b10 != 3 && b10 != 4 && bArr3.length % 8 != 0) {
            return Integer.valueOf(UtilitiesSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH);
        }
        if ((b10 != 2 && b10 != 4 && b10 != 3) || bArr2 == null || bArr2.length == 8) {
            return null;
        }
        return Integer.valueOf(UtilitiesSDKReturnCodes.INITIAL_VECTOR_INCORRECT_LENGTH);
    }

    private static Integer c(byte b10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 16 && bArr.length != 24) {
            return Integer.valueOf(UtilitiesSDKReturnCodes.KEY_INCORRECT_LENGTH);
        }
        if (b10 != 3 && b10 != 4 && bArr3.length % 8 != 0) {
            return Integer.valueOf(UtilitiesSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH);
        }
        if ((b10 != 2 && b10 != 4 && b10 != 3) || bArr2 == null || bArr2.length == 8) {
            return null;
        }
        return Integer.valueOf(UtilitiesSDKReturnCodes.INITIAL_VECTOR_INCORRECT_LENGTH);
    }

    public static UtilitiesSDKCryptoResponse decrypt(byte b10, byte b11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int iA = a(b10, b11, bArr, bArr2, bArr3);
        if (iA != 0) {
            return new UtilitiesSDKCryptoResponse(iA);
        }
        try {
            return new UtilitiesSDKCryptoResponse(iA, a(false, b10, b11, bArr, bArr2, bArr3));
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        }
    }

    public static UtilitiesSDKCryptoResponse decryptAESCTR(WBCTable wBCTable, byte[] bArr, byte[] bArr2) {
        return UtilitiesSDKWhiteBoxCryptography.decryptAESCTR(wBCTable, bArr, bArr2);
    }

    public static UtilitiesSDKCryptoResponse decryptAESCTRWithMasterKey(byte[] bArr, byte[] bArr2) {
        return UtilitiesSDKWhiteBoxCryptography.decryptAESCTRWithMasterKey(bArr, bArr2);
    }

    public static UtilitiesSDKCryptoResponse deriveKey(byte b10, byte[] bArr, byte[] bArr2, int i10, int i11) {
        if (b10 != 3) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.CRYPTO_MECANISM_INVALID);
        }
        if (bArr == null) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.INPUT_KEY_NULL);
        }
        if (bArr2 == null) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.SALT_NULL);
        }
        if (i10 <= 0) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.ITERATION_COUNT_INCORRECT);
        }
        return i11 == 0 ? new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.OUTPUT_DATA_INCORRECT_LENGTH) : new UtilitiesSDKCryptoResponse(0, new PBKDF2_HMAC_SHA256().generateDerivedKey(bArr, bArr2, i10, i11));
    }

    public static UtilitiesSDKCryptoResponse encrypt(byte b10, byte b11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int iA = a(b10, b11, bArr, bArr2, bArr3);
        if (iA != 0) {
            return new UtilitiesSDKCryptoResponse(iA);
        }
        try {
            return new UtilitiesSDKCryptoResponse(iA, a(true, b10, b11, bArr, bArr2, bArr3));
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        }
    }

    public static UtilitiesSDKCryptoResponse encryptAESBlock(WBCTable wBCTable, byte[] bArr) {
        return UtilitiesSDKWhiteBoxCryptography.encryptAESBlock(wBCTable, bArr);
    }

    public static UtilitiesSDKCryptoResponse encryptAESCTR(WBCTable wBCTable, byte[] bArr, byte[] bArr2) {
        return UtilitiesSDKWhiteBoxCryptography.encryptAESCTR(wBCTable, bArr, bArr2);
    }

    public static UtilitiesSDKCryptoResponse encryptAESCTRWithMasterKey(byte[] bArr, byte[] bArr2) {
        return UtilitiesSDKWhiteBoxCryptography.encryptAESCTRWithMasterKey(bArr, bArr2);
    }

    public static UtilitiesSDKCryptoResponse generateRandomByteArray(int i10) {
        return UtilitiesSDKCrypto.b(i10);
    }

    public static UtilitiesSDKSecureChannelGenerateResponse generateSecureChannelMessage(UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage) {
        return UtilitiesSDKSecureChannelMessageGenerator.generateSecureChannelMessage(utilitiesSDKSecureChannelMessage);
    }

    public static UtilitiesSDKCryptoResponse hash(byte b10, byte[] bArr) {
        return UtilitiesSDKCrypto.hash(b10, bArr);
    }

    public static UtilitiesSDKCryptoResponse hmac(byte b10, byte[] bArr, byte[] bArr2) {
        return UtilitiesSDKCrypto.hmac(b10, bArr, bArr2);
    }

    public static boolean isPasswordWeak(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 4) {
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                if (!Character.isLetterOrDigit(charSequence.charAt(i10))) {
                    return true;
                }
            }
            if (((charSequence.charAt(0) == '0') ^ (charSequence.charAt(charSequence.length() - 1) == '0')) && a(charSequence) == charSequence.length() - 1) {
                return true;
            }
            int length = charSequence.length();
            int i11 = length - 1;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                iArr[i12] = charSequence.charAt(i12) - charSequence.charAt(i13);
                i12 = i13;
            }
            int i14 = 0;
            while (i14 < length - 2) {
                int i15 = iArr[i14];
                i14++;
                if (i15 != iArr[i14]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static UtilitiesSDKSecureChannelParseResponse parseSecureChannelMessage(String str) {
        return UtilitiesSDKSecureChannelMessageParser.parseSecureChannelMessage(str);
    }

    @Deprecated
    public static String xsVUhL4q6C(String str) {
        byte[] bArr = new byte[32];
        byte[] bArr2 = f65909a;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = f65910b;
        System.arraycopy(bArr3, 0, bArr, 8, bArr3.length);
        byte[] bArr4 = f65911c;
        System.arraycopy(bArr4, 0, bArr, 16, bArr4.length);
        byte[] bArr5 = f65912d;
        System.arraycopy(bArr5, 0, bArr, 24, bArr5.length);
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = f65913e;
        System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length);
        byte[] bArr8 = f65914f;
        System.arraycopy(bArr8, 0, bArr6, 8, bArr8.length);
        UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseDecrypt = decrypt((byte) 3, (byte) 4, bArr, bArr6, o5.a(str));
        if (utilitiesSDKCryptoResponseDecrypt.getReturnCode() != 0) {
            return null;
        }
        return new String(utilitiesSDKCryptoResponseDecrypt.getOutputData(), StandardCharsets.UTF_8);
    }

    private static Integer a(byte b10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 16 && bArr.length != 24 && bArr.length != 32) {
            return Integer.valueOf(UtilitiesSDKReturnCodes.KEY_INCORRECT_LENGTH);
        }
        if (b10 != 3 && b10 != 4 && bArr3.length % 16 != 0) {
            return Integer.valueOf(UtilitiesSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH);
        }
        if ((b10 != 2 && b10 != 4 && b10 != 3) || bArr2 == null || bArr2.length == 16) {
            return null;
        }
        return Integer.valueOf(UtilitiesSDKReturnCodes.INITIAL_VECTOR_INCORRECT_LENGTH);
    }

    private static byte[] a(boolean z10, byte b10, byte b11, byte[] bArr, byte[] bArr2, byte[] bArr3) throws UtilitiesSDKException {
        return UtilitiesSDKCrypto.a(z10, b10, b11, bArr, bArr2, bArr3);
    }

    private static int a(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (charSequence.charAt(i11) == '0') {
                i10++;
            }
        }
        return i10;
    }
}
