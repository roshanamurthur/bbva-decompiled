package com.vasco.digipass.sdk;

import com.vasco.digipass.sdk.models.SecureChannelMessage;
import com.vasco.digipass.sdk.obfuscated.a;
import com.vasco.digipass.sdk.obfuscated.c;
import com.vasco.digipass.sdk.obfuscated.j;
import com.vasco.digipass.sdk.obfuscated.k;
import com.vasco.digipass.sdk.obfuscated.l;
import com.vasco.digipass.sdk.obfuscated.m;
import com.vasco.digipass.sdk.obfuscated.n;
import com.vasco.digipass.sdk.obfuscated.q;
import com.vasco.digipass.sdk.responses.ActivationResponse;
import com.vasco.digipass.sdk.responses.CryptoResponse;
import com.vasco.digipass.sdk.responses.DigipassPropertiesResponse;
import com.vasco.digipass.sdk.responses.GenerateDerivationCodeResponse;
import com.vasco.digipass.sdk.responses.GenerationResponse;
import com.vasco.digipass.sdk.responses.GenericResponse;
import com.vasco.digipass.sdk.responses.ManageApplicationResponse;
import com.vasco.digipass.sdk.responses.MultiDeviceLicenseActivationResponse;
import com.vasco.digipass.sdk.responses.SecureChannelDecryptionResponse;
import com.vasco.digipass.sdk.responses.SecureChannelGenerateResponse;
import com.vasco.digipass.sdk.responses.SecureChannelParseResponse;
import com.vasco.digipass.sdk.responses.ValidationResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKCryptoResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;

/* JADX INFO: loaded from: classes9.dex */
public final class DigipassSDK {
    public static final String VERSION = "4.32.0";

    private DigipassSDK() {
    }

    private static CryptoResponse a(byte b10, byte[] bArr) {
        int i10;
        UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseHash = UtilitiesSDK.hash(b10, bArr);
        int returnCode = utilitiesSDKCryptoResponseHash.getReturnCode();
        if (returnCode == -4205) {
            i10 = DigipassSDKReturnCodes.INPUT_DATA_NULL;
        } else if (returnCode != -4201) {
            i10 = returnCode != 0 ? DigipassSDKReturnCodes.UNKNOWN_ERROR : 0;
        } else {
            i10 = DigipassSDKReturnCodes.CRYPTO_MECANISM_INVALID;
        }
        return new CryptoResponse(i10, utilitiesSDKCryptoResponseHash.getOutputData());
    }

    @Deprecated
    public static ActivationResponse activateOffline(String str, String str2, String str3, String str4, CharSequence charSequence, CharSequence charSequence2, byte[] bArr) {
        return activateOfflineWithFingerprint(str, str2, str3, str4, charSequence, charSequence2, null, bArr);
    }

    @Deprecated
    public static ActivationResponse activateOfflineDPPlusWithFingerprint(String str, String str2, String str3, String str4, CharSequence charSequence, CharSequence charSequence2, String str5, byte[] bArr) {
        byte[] bArrA = charSequence2 != null ? c.a(charSequence2) : null;
        ActivationResponse activationResponseA = a.a(str, str2, str3, str4, charSequence, bArrA, charSequence2 != null ? charSequence2.length() : 0, null, false, true, str5, bArr);
        q.g(bArrA);
        return activationResponseA;
    }

    @Deprecated
    public static ActivationResponse activateOfflineDPPlusWithKey(String str, String str2, String str3, String str4, CharSequence charSequence, byte[] bArr, byte[] bArr2) {
        return a.a(str, str2, str3, str4, charSequence, null, 0, bArr, true, true, null, bArr2);
    }

    public static ActivationResponse activateOfflineWithFingerprint(String str, String str2, String str3, String str4, CharSequence charSequence, CharSequence charSequence2, String str5, byte[] bArr) {
        byte[] bArrA = charSequence2 != null ? c.a(charSequence2) : null;
        ActivationResponse activationResponseActivateOfflineWithFingerprintAndBytePassword = activateOfflineWithFingerprintAndBytePassword(str, str2, str3, str4, charSequence, bArrA, charSequence2 != null ? charSequence2.length() : 0, str5, bArr);
        q.g(bArrA);
        return activationResponseActivateOfflineWithFingerprintAndBytePassword;
    }

    public static ActivationResponse activateOfflineWithFingerprintAndBytePassword(String str, String str2, String str3, String str4, CharSequence charSequence, byte[] bArr, int i10, String str5, byte[] bArr2) {
        return a.a(str, str2, str3, str4, charSequence, bArr, i10, null, false, false, str5, bArr2);
    }

    public static ActivationResponse activateOfflineWithKey(String str, String str2, String str3, String str4, CharSequence charSequence, byte[] bArr, byte[] bArr2) {
        return a.a(str, str2, str3, str4, charSequence, null, 0, bArr, true, false, null, bArr2);
    }

    @Deprecated
    public static ActivationResponse activateOnline(String str, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, byte[] bArr) {
        return activateOnlineWithFingerprint(str, str2, charSequence, str3, charSequence2, null, bArr);
    }

    @Deprecated
    public static ActivationResponse activateOnlineDPPlus(String str, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, byte[] bArr) {
        return activateOnlineDPPlusWithFingerprint(str, str2, charSequence, str3, charSequence2, null, bArr);
    }

    @Deprecated
    public static ActivationResponse activateOnlineDPPlusWithFingerprint(String str, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, String str4, byte[] bArr) {
        byte[] bArrA = charSequence2 != null ? c.a(charSequence2) : null;
        ActivationResponse activationResponseA = a.a(str, str2, charSequence, str3, bArrA, charSequence2 != null ? charSequence2.length() : 0, null, false, true, str4, bArr);
        q.g(bArrA);
        return activationResponseA;
    }

    @Deprecated
    public static ActivationResponse activateOnlineDPPlusWithKey(String str, String str2, CharSequence charSequence, String str3, byte[] bArr, byte[] bArr2) {
        return a.a(str, str2, charSequence, str3, null, 0, bArr, true, true, null, bArr2);
    }

    public static ActivationResponse activateOnlineWithFingerprint(String str, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, String str4, byte[] bArr) {
        byte[] bArrA = charSequence2 != null ? c.a(charSequence2) : null;
        ActivationResponse activationResponseActivateOnlineWithFingerprintAndBytePassword = activateOnlineWithFingerprintAndBytePassword(str, str2, charSequence, str3, bArrA, charSequence2 != null ? charSequence2.length() : 0, str4, bArr);
        q.g(bArrA);
        return activationResponseActivateOnlineWithFingerprintAndBytePassword;
    }

    public static ActivationResponse activateOnlineWithFingerprintAndBytePassword(String str, String str2, CharSequence charSequence, String str3, byte[] bArr, int i10, String str4, byte[] bArr2) {
        return a.a(str, str2, charSequence, str3, bArr, i10, null, false, false, str4, bArr2);
    }

    public static ActivationResponse activateOnlineWithKey(String str, String str2, CharSequence charSequence, String str3, byte[] bArr, byte[] bArr2) {
        return a.a(str, str2, charSequence, str3, null, 0, bArr, true, false, null, bArr2);
    }

    public static GenericResponse changeBytePasswordWithFingerprint(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, int i11, String str) {
        return l.a(bArr, bArr2, bArr3, i10, bArr4, i11, str);
    }

    public static GenericResponse changeEncryptionKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return l.a(bArr, bArr2, bArr3, bArr4);
    }

    @Deprecated
    public static GenericResponse changePassword(byte[] bArr, byte[] bArr2, String str, String str2) {
        return changePasswordWithFingerprint(bArr, bArr2, str, str2, null);
    }

    public static GenericResponse changePasswordWithFingerprint(byte[] bArr, byte[] bArr2, CharSequence charSequence, CharSequence charSequence2, String str) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        int length = charSequence != null ? charSequence.length() : 0;
        byte[] bArrA2 = charSequence2 != null ? c.a(charSequence2) : null;
        GenericResponse genericResponseChangeBytePasswordWithFingerprint = changeBytePasswordWithFingerprint(bArr, bArr2, bArrA, length, bArrA2, charSequence2 != null ? charSequence2.length() : 0, str);
        q.g(bArrA);
        q.g(bArrA2);
        return genericResponseChangeBytePasswordWithFingerprint;
    }

    public static long computeClientServerTimeShiftFromServerTime(long j10) {
        return j.a(j10);
    }

    public static CryptoResponse decrypt(byte b10, byte b11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10;
        UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseDecrypt = UtilitiesSDK.decrypt(b10, b11, bArr, bArr2, bArr3);
        int returnCode = utilitiesSDKCryptoResponseDecrypt.getReturnCode();
        if (returnCode != 0) {
            switch (returnCode) {
                case UtilitiesSDKReturnCodes.INITIAL_VECTOR_INCORRECT_LENGTH /* -4207 */:
                    i10 = DigipassSDKReturnCodes.INITIAL_VECTOR_INCORRECT_LENGTH;
                    break;
                case UtilitiesSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH /* -4206 */:
                    i10 = DigipassSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH;
                    break;
                case UtilitiesSDKReturnCodes.INPUT_DATA_NULL /* -4205 */:
                    i10 = DigipassSDKReturnCodes.INPUT_DATA_NULL;
                    break;
                case UtilitiesSDKReturnCodes.KEY_INCORRECT_LENGTH /* -4204 */:
                    i10 = DigipassSDKReturnCodes.KEY_INCORRECT_LENGTH;
                    break;
                case UtilitiesSDKReturnCodes.KEY_NULL /* -4203 */:
                    i10 = DigipassSDKReturnCodes.KEY_NULL;
                    break;
                case UtilitiesSDKReturnCodes.CRYPTO_MODE_INVALID /* -4202 */:
                    i10 = DigipassSDKReturnCodes.CRYPTO_MODE_INVALID;
                    break;
                case UtilitiesSDKReturnCodes.CRYPTO_MECANISM_INVALID /* -4201 */:
                    i10 = DigipassSDKReturnCodes.CRYPTO_MECANISM_INVALID;
                    break;
                default:
                    i10 = DigipassSDKReturnCodes.UNKNOWN_ERROR;
                    break;
            }
        } else {
            i10 = 0;
        }
        return new CryptoResponse(i10, utilitiesSDKCryptoResponseDecrypt.getOutputData());
    }

    public static SecureChannelDecryptionResponse decryptSecureChannelMessageBody(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, String str) {
        return m.b(bArr, bArr2, secureChannelMessage, str);
    }

    public static ManageApplicationResponse disableApplication(byte[] bArr, byte[] bArr2, int i10) {
        return j.a(bArr, bArr2, i10, false);
    }

    public static ManageApplicationResponse enableApplication(byte[] bArr, byte[] bArr2, int i10) {
        return j.a(bArr, bArr2, i10, true);
    }

    public static CryptoResponse encrypt(byte b10, byte b11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10;
        UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseEncrypt = UtilitiesSDK.encrypt(b10, b11, bArr, bArr2, bArr3);
        int returnCode = utilitiesSDKCryptoResponseEncrypt.getReturnCode();
        if (returnCode != 0) {
            switch (returnCode) {
                case UtilitiesSDKReturnCodes.INITIAL_VECTOR_INCORRECT_LENGTH /* -4207 */:
                    i10 = DigipassSDKReturnCodes.INITIAL_VECTOR_INCORRECT_LENGTH;
                    break;
                case UtilitiesSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH /* -4206 */:
                    i10 = DigipassSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH;
                    break;
                case UtilitiesSDKReturnCodes.INPUT_DATA_NULL /* -4205 */:
                    i10 = DigipassSDKReturnCodes.INPUT_DATA_NULL;
                    break;
                case UtilitiesSDKReturnCodes.KEY_INCORRECT_LENGTH /* -4204 */:
                    i10 = DigipassSDKReturnCodes.KEY_INCORRECT_LENGTH;
                    break;
                case UtilitiesSDKReturnCodes.KEY_NULL /* -4203 */:
                    i10 = DigipassSDKReturnCodes.KEY_NULL;
                    break;
                case UtilitiesSDKReturnCodes.CRYPTO_MODE_INVALID /* -4202 */:
                    i10 = DigipassSDKReturnCodes.CRYPTO_MODE_INVALID;
                    break;
                case UtilitiesSDKReturnCodes.CRYPTO_MECANISM_INVALID /* -4201 */:
                    i10 = DigipassSDKReturnCodes.CRYPTO_MECANISM_INVALID;
                    break;
                default:
                    i10 = DigipassSDKReturnCodes.UNKNOWN_ERROR;
                    break;
            }
        } else {
            i10 = 0;
        }
        return new CryptoResponse(i10, utilitiesSDKCryptoResponseEncrypt.getOutputData());
    }

    public static GenerateDerivationCodeResponse generateDerivationCode(byte[] bArr, byte[] bArr2, CharSequence charSequence, long j10, int i10, String str, String str2) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerateDerivationCodeResponse generateDerivationCodeResponseGenerateDerivationCodeWithBytePassword = generateDerivationCodeWithBytePassword(bArr, bArr2, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str, str2);
        q.g(bArrA);
        return generateDerivationCodeResponseGenerateDerivationCodeWithBytePassword;
    }

    public static GenerateDerivationCodeResponse generateDerivationCodeWithBytePassword(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, long j10, int i11, String str, String str2) {
        return k.a(bArr, bArr2, j10, i11, bArr3, i10, null, false, str2, str);
    }

    public static GenerateDerivationCodeResponse generateDerivationCodeWithKey(byte[] bArr, byte[] bArr2, byte[] bArr3, long j10, int i10, String str, String str2) {
        return k.a(bArr, bArr2, j10, i10, null, 0, bArr3, true, str2, str);
    }

    public static GenerationResponse generateResponseFromChallenge(byte[] bArr, byte[] bArr2, String str, CharSequence charSequence, long j10, int i10, String str2) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseGenerateResponseFromChallengeWithBytePassword = generateResponseFromChallengeWithBytePassword(bArr, bArr2, str, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str2);
        q.g(bArrA);
        return generationResponseGenerateResponseFromChallengeWithBytePassword;
    }

    public static GenerationResponse generateResponseFromChallengeES(byte[] bArr, byte[] bArr2, String str, CharSequence charSequence, long j10, int i10, String str2, String str3) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseA = k.a(bArr, bArr2, j10, i10, bArrA, charSequence != null ? charSequence.length() : 0, null, false, str, true, null, false, str3, str2, true, (byte) 0, false);
        q.g(bArrA);
        return generationResponseA;
    }

    public static GenerationResponse generateResponseFromChallengeESWithKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, long j10, int i10, String str2, String str3) {
        return k.a(bArr, bArr2, j10, i10, null, 0, bArr3, true, str, true, null, false, str3, str2, true, (byte) 0, false);
    }

    public static GenerationResponse generateResponseFromChallengeWithBytePassword(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10, long j10, int i11, String str2) {
        return k.a(bArr, bArr2, j10, i11, bArr3, i10, null, false, str, true, null, false, str2, null, false, (byte) 0, false);
    }

    public static GenerationResponse generateResponseFromChallengeWithKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, long j10, int i10, String str2) {
        return k.a(bArr, bArr2, j10, i10, null, 0, bArr3, true, str, true, null, false, str2, null, false, (byte) 0, false);
    }

    public static GenerationResponse generateResponseFromChallengeWithScore(byte[] bArr, byte[] bArr2, String str, CharSequence charSequence, long j10, int i10, String str2, byte b10) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseGenerateResponseFromChallengeWithScoreAndBytePassword = generateResponseFromChallengeWithScoreAndBytePassword(bArr, bArr2, str, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str2, b10);
        q.g(bArrA);
        return generationResponseGenerateResponseFromChallengeWithScoreAndBytePassword;
    }

    public static GenerationResponse generateResponseFromChallengeWithScoreAndBytePassword(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10, long j10, int i11, String str2, byte b10) {
        return k.a(bArr, bArr2, j10, i11, bArr3, i10, null, false, str, true, null, false, str2, null, false, b10, true);
    }

    public static GenerationResponse generateResponseOnly(byte[] bArr, byte[] bArr2, CharSequence charSequence, long j10, int i10, String str) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseGenerateResponseOnlyWithBytePassword = generateResponseOnlyWithBytePassword(bArr, bArr2, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str);
        q.g(bArrA);
        return generationResponseGenerateResponseOnlyWithBytePassword;
    }

    public static GenerationResponse generateResponseOnlyES(byte[] bArr, byte[] bArr2, CharSequence charSequence, long j10, int i10, String str, String str2) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseA = k.a(bArr, bArr2, j10, i10, bArrA, charSequence != null ? charSequence.length() : 0, null, false, null, false, null, false, str2, str, true, (byte) 0, false);
        q.g(bArrA);
        return generationResponseA;
    }

    public static GenerationResponse generateResponseOnlyESWithKey(byte[] bArr, byte[] bArr2, byte[] bArr3, long j10, int i10, String str, String str2) {
        return k.a(bArr, bArr2, j10, i10, null, 0, bArr3, true, null, false, null, false, str2, str, true, (byte) 0, false);
    }

    public static GenerationResponse generateResponseOnlyWithBytePassword(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, long j10, int i11, String str) {
        return k.a(bArr, bArr2, j10, i11, bArr3, i10, null, false, null, false, null, false, str, null, false, (byte) 0, false);
    }

    public static GenerationResponse generateResponseOnlyWithKey(byte[] bArr, byte[] bArr2, byte[] bArr3, long j10, int i10, String str) {
        return k.a(bArr, bArr2, j10, i10, null, 0, bArr3, true, null, false, null, false, str, null, false, (byte) 0, false);
    }

    public static GenerationResponse generateResponseOnlyWithScore(byte[] bArr, byte[] bArr2, CharSequence charSequence, long j10, int i10, String str, byte b10) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseGenerateResponseOnlyWithScoreAndBytePassword = generateResponseOnlyWithScoreAndBytePassword(bArr, bArr2, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str, b10);
        q.g(bArrA);
        return generationResponseGenerateResponseOnlyWithScoreAndBytePassword;
    }

    public static GenerationResponse generateResponseOnlyWithScoreAndBytePassword(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, long j10, int i11, String str, byte b10) {
        return k.a(bArr, bArr2, j10, i11, bArr3, i10, null, false, null, false, null, false, str, null, false, b10, true);
    }

    public static SecureChannelGenerateResponse generateSecureChannelInformationMessage(byte[] bArr, byte[] bArr2, String str, byte b10, String str2) {
        return m.a(bArr, bArr2, str, b10, str2);
    }

    public static GenerationResponse generateSignature(byte[] bArr, byte[] bArr2, String[] strArr, CharSequence charSequence, long j10, int i10, String str) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseGenerateSignatureWithBytePassword = generateSignatureWithBytePassword(bArr, bArr2, strArr, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str);
        q.g(bArrA);
        return generationResponseGenerateSignatureWithBytePassword;
    }

    public static GenerationResponse generateSignatureES(byte[] bArr, byte[] bArr2, String[] strArr, CharSequence charSequence, long j10, int i10, String str, String str2) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseA = k.a(bArr, bArr2, j10, i10, bArrA, charSequence != null ? charSequence.length() : 0, null, false, null, false, strArr, true, str2, str, true, (byte) 0, false);
        q.g(bArrA);
        return generationResponseA;
    }

    public static GenerationResponse generateSignatureESWithKey(byte[] bArr, byte[] bArr2, String[] strArr, byte[] bArr3, long j10, int i10, String str, String str2) {
        return k.a(bArr, bArr2, j10, i10, null, 0, bArr3, true, null, false, strArr, true, str2, str, true, (byte) 0, false);
    }

    public static GenerationResponse generateSignatureFromSecureChannelMessage(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, CharSequence charSequence, long j10, int i10, String str) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseGenerateSignatureFromSecureChannelMessageWithBytePassword = generateSignatureFromSecureChannelMessageWithBytePassword(bArr, bArr2, secureChannelMessage, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str);
        q.g(bArrA);
        return generationResponseGenerateSignatureFromSecureChannelMessageWithBytePassword;
    }

    public static GenerationResponse generateSignatureFromSecureChannelMessageWithBytePassword(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, byte[] bArr3, int i10, long j10, int i11, String str) {
        return m.a(bArr, bArr2, secureChannelMessage, bArr3, i10, null, false, j10, i11, str, (byte) 0, false);
    }

    public static GenerationResponse generateSignatureFromSecureChannelMessageWithKey(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, byte[] bArr3, long j10, int i10, String str) {
        return m.a(bArr, bArr2, secureChannelMessage, null, 0, bArr3, true, j10, i10, str, (byte) 0, false);
    }

    public static GenerationResponse generateSignatureFromSecureChannelMessageWithScore(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, CharSequence charSequence, long j10, int i10, String str, byte b10) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseGenerateSignatureFromSecureChannelMessageWithScoreAndBytePassword = generateSignatureFromSecureChannelMessageWithScoreAndBytePassword(bArr, bArr2, secureChannelMessage, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str, b10);
        q.g(bArrA);
        return generationResponseGenerateSignatureFromSecureChannelMessageWithScoreAndBytePassword;
    }

    public static GenerationResponse generateSignatureFromSecureChannelMessageWithScoreAndBytePassword(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, byte[] bArr3, int i10, long j10, int i11, String str, byte b10) {
        return m.a(bArr, bArr2, secureChannelMessage, bArr3, i10, null, false, j10, i11, str, b10, true);
    }

    public static GenerationResponse generateSignatureWithBytePassword(byte[] bArr, byte[] bArr2, String[] strArr, byte[] bArr3, int i10, long j10, int i11, String str) {
        return k.a(bArr, bArr2, j10, i11, bArr3, i10, null, false, null, false, strArr, true, str, null, false, (byte) 0, false);
    }

    public static GenerationResponse generateSignatureWithKey(byte[] bArr, byte[] bArr2, String[] strArr, byte[] bArr3, long j10, int i10, String str) {
        return k.a(bArr, bArr2, j10, i10, null, 0, bArr3, true, null, false, strArr, true, str, null, false, (byte) 0, false);
    }

    public static GenerationResponse generateSignatureWithScore(byte[] bArr, byte[] bArr2, String[] strArr, CharSequence charSequence, long j10, int i10, String str, byte b10) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        GenerationResponse generationResponseGenerateSignatureWithScoreAndBytePassword = generateSignatureWithScoreAndBytePassword(bArr, bArr2, strArr, bArrA, charSequence != null ? charSequence.length() : 0, j10, i10, str, b10);
        q.g(bArrA);
        return generationResponseGenerateSignatureWithScoreAndBytePassword;
    }

    public static GenerationResponse generateSignatureWithScoreAndBytePassword(byte[] bArr, byte[] bArr2, String[] strArr, byte[] bArr3, int i10, long j10, int i11, String str, byte b10) {
        return k.a(bArr, bArr2, j10, i11, bArr3, i10, null, false, null, false, strArr, true, str, null, false, b10, true);
    }

    public static DigipassPropertiesResponse getDigipassProperties(byte[] bArr, byte[] bArr2) {
        return j.a(bArr, bArr2, (String) null);
    }

    public static DigipassPropertiesResponse getDigipassPropertiesFromXFAD(String str) {
        return j.a((byte[]) null, (byte[]) null, str);
    }

    public static String getMessageForReturnCode(int i10) {
        return j.a(i10);
    }

    @Deprecated
    public static CryptoResponse hash(byte b10, byte[] bArr) {
        return a(b10, bArr);
    }

    public static boolean isBytePasswordWeak(byte[] bArr, int i10) {
        return q.b(bArr, i10);
    }

    public static boolean isPasswordWeak(CharSequence charSequence) {
        return UtilitiesSDK.isPasswordWeak(charSequence);
    }

    public static ActivationResponse multiDeviceActivateInstance(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, CharSequence charSequence, String str) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        ActivationResponse activationResponseMultiDeviceActivateInstanceWithBytePassword = multiDeviceActivateInstanceWithBytePassword(bArr, bArr2, secureChannelMessage, bArrA, charSequence != null ? charSequence.length() : 0, str);
        q.g(bArrA);
        return activationResponseMultiDeviceActivateInstanceWithBytePassword;
    }

    public static ActivationResponse multiDeviceActivateInstanceWithBytePassword(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, byte[] bArr3, int i10, String str) {
        return m.a(bArr, bArr2, secureChannelMessage, bArr3, i10, null, false, str);
    }

    public static ActivationResponse multiDeviceActivateInstanceWithKey(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, byte[] bArr3, String str) {
        return m.a(bArr, bArr2, secureChannelMessage, null, 0, bArr3, true, str);
    }

    public static MultiDeviceLicenseActivationResponse multiDeviceActivateLicense(SecureChannelMessage secureChannelMessage, String str, String str2, byte b10, long j10) {
        return m.a(secureChannelMessage, str, str2, b10, j10);
    }

    public static SecureChannelParseResponse parseSecureChannelMessage(String str) {
        return n.a(str);
    }

    public static CryptoResponse sha256Hash(byte[] bArr) {
        return a((byte) 3, bArr);
    }

    public static ValidationResponse validateBytePasswordWithFingerprint(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, String str) {
        return l.a(bArr, bArr2, bArr3, i10, str);
    }

    public static ValidationResponse validatePassword(byte[] bArr, byte[] bArr2, CharSequence charSequence) {
        return validatePasswordWithFingerprint(bArr, bArr2, charSequence, null);
    }

    public static ValidationResponse validatePasswordWithFingerprint(byte[] bArr, byte[] bArr2, CharSequence charSequence, String str) {
        byte[] bArrA = charSequence != null ? c.a(charSequence) : null;
        ValidationResponse validationResponseValidateBytePasswordWithFingerprint = validateBytePasswordWithFingerprint(bArr, bArr2, bArrA, charSequence != null ? charSequence.length() : 0, str);
        q.g(bArrA);
        return validationResponseValidateBytePasswordWithFingerprint;
    }
}
