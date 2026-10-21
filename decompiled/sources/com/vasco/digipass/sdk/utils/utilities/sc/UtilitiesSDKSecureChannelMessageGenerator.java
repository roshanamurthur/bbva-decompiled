package com.vasco.digipass.sdk.utils.utilities.sc;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o5;
import com.vasco.digipass.sdk.utils.utilities.responses.UtilitiesSDKSecureChannelGenerateResponse;

/* JADX INFO: loaded from: classes9.dex */
public class UtilitiesSDKSecureChannelMessageGenerator {
    private UtilitiesSDKSecureChannelMessageGenerator() {
    }

    private static void a(String str, StringBuilder sb2) throws UtilitiesSDKException {
        String strSubstring = str.substring(0, 3);
        char cCharAt = strSubstring.charAt(0);
        char cCharAt2 = strSubstring.charAt(1);
        char cCharAt3 = strSubstring.charAt(2);
        int iIndexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ =&%".indexOf(cCharAt);
        int iIndexOf2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ =&%".indexOf(cCharAt2);
        int iIndexOf3 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ =&%".indexOf(cCharAt3);
        if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf3 == -1) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_SERIAL_NUMBER_INCORRECT_FORMAT);
        }
        StringBuilder sb3 = new StringBuilder(Integer.toHexString((iIndexOf2 * 40) + (iIndexOf * ReturnCode.ERR_STORAGE) + iIndexOf3));
        while (sb3.length() < 4) {
            sb3.insert(0, '0');
        }
        sb2.append((CharSequence) sb3);
    }

    private static void b(String str, StringBuilder sb2) throws UtilitiesSDKException {
        String strSubstring = str.substring(3);
        if (!o5.b(strSubstring)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_SERIAL_NUMBER_INCORRECT_FORMAT);
        }
        StringBuilder sb3 = new StringBuilder(Integer.toHexString(Integer.parseInt(strSubstring)));
        while (sb3.length() < 6) {
            sb3.insert(0, '0');
        }
        sb2.append((CharSequence) sb3);
    }

    private static void c(UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage, StringBuilder sb2) throws UtilitiesSDKException {
        f(utilitiesSDKSecureChannelMessage, sb2);
        e(utilitiesSDKSecureChannelMessage, sb2);
        d(utilitiesSDKSecureChannelMessage, sb2);
    }

    private static void d(UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage, StringBuilder sb2) throws UtilitiesSDKException {
        String str = utilitiesSDKSecureChannelMessage.nonce;
        if (str == null) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NONCE_NULL);
        }
        if (str.length() != 16) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NONCE_INCORRECT_LENGTH);
        }
        if (!o5.c(str)) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NONCE_INCORRECT_FORMAT);
        }
        sb2.append(str);
    }

    private static void e(UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage, StringBuilder sb2) throws UtilitiesSDKException {
        String str = utilitiesSDKSecureChannelMessage.serialNumber;
        if (str == null) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_SERIAL_NUMBER_NULL);
        }
        if (str.length() != 10) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_SERIAL_NUMBER_INCORRECT_LENGTH);
        }
        a(str, sb2);
        b(str, sb2);
    }

    private static void f(UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage, StringBuilder sb2) throws UtilitiesSDKException {
        byte b10 = utilitiesSDKSecureChannelMessage.protocolVersion;
        if (b10 < 0 || b10 > 15) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_PROTOCOL_VERSION);
        }
        byte b11 = utilitiesSDKSecureChannelMessage.messageType;
        if (b11 < 0 || b11 > 63) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_MESSAGE_TYPE);
        }
        byte b12 = utilitiesSDKSecureChannelMessage.protectionType;
        if (b12 < 0 || b12 > 63) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_PROTECTION_TYPE);
        }
        int i10 = (b10 << 12) + (b11 << 6) + b12;
        sb2.append(o5.a(new byte[]{(byte) ((i10 >> 8) & 255), (byte) (i10 & 255)}));
    }

    public static UtilitiesSDKSecureChannelGenerateResponse generateSecureChannelMessage(UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage) {
        try {
            if (utilitiesSDKSecureChannelMessage == null) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NULL);
            }
            StringBuilder sb2 = new StringBuilder();
            c(utilitiesSDKSecureChannelMessage, sb2);
            a(utilitiesSDKSecureChannelMessage, sb2);
            b(utilitiesSDKSecureChannelMessage, sb2);
            return new UtilitiesSDKSecureChannelGenerateResponse(0, sb2.toString().toUpperCase());
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKSecureChannelGenerateResponse(e5.getReturnErrorCode());
        } catch (Exception e7) {
            return new UtilitiesSDKSecureChannelGenerateResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    private static void b(UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage, StringBuilder sb2) throws UtilitiesSDKException {
        byte b10 = utilitiesSDKSecureChannelMessage.protectionType;
        if (b10 == 1 || b10 == 17) {
            String str = utilitiesSDKSecureChannelMessage.authenticationTag;
            if (str != null) {
                if (str.length() == 16) {
                    if (o5.c(str)) {
                        sb2.append(str);
                        return;
                    }
                    throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_AUTHENTICATION_TAG_INCORRECT_FORMAT);
                }
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_AUTHENTICATION_TAG_INCORRECT_LENGTH);
            }
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_AUTHENTICATION_TAG_NULL);
        }
    }

    private static void a(UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage, StringBuilder sb2) throws UtilitiesSDKException {
        String str = utilitiesSDKSecureChannelMessage.body;
        if (str != null) {
            if (str.length() != 0 && str.length() <= 1024 && str.length() % 2 == 0) {
                if (o5.c(str)) {
                    sb2.append(str);
                    return;
                }
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_INCORRECT_FORMAT);
            }
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_INCORRECT_LENGTH);
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_NULL);
    }
}
