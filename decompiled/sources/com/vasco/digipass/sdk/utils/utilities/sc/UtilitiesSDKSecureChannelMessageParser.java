package com.vasco.digipass.sdk.utils.utilities.sc;

import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o5;
import com.vasco.digipass.sdk.utils.utilities.responses.UtilitiesSDKSecureChannelParseResponse;

/* JADX INFO: loaded from: classes9.dex */
public class UtilitiesSDKSecureChannelMessageParser {
    private UtilitiesSDKSecureChannelMessageParser() {
    }

    private static void a(byte[] bArr, UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage) throws UtilitiesSDKException {
        int i10;
        byte b10 = utilitiesSDKSecureChannelMessage.messageType;
        if (b10 == 0) {
            i10 = 54;
        } else if (b10 == 1) {
            i10 = 37;
        } else {
            i10 = b10 == 2 ? 17 : 15;
        }
        byte b11 = utilitiesSDKSecureChannelMessage.protectionType;
        if (b11 == 1 || b11 == 17) {
            i10 += 8;
        }
        if (bArr.length < i10) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_LENGTH);
        }
        int length = (bArr.length - 15) - (b11 == 0 ? 0 : 8);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 15, bArr2, 0, length);
        utilitiesSDKSecureChannelMessage.body = o5.a(bArr2);
    }

    private static void b(byte[] bArr, UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage) {
        if (utilitiesSDKSecureChannelMessage.protectionType != 0) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, bArr.length - 8, bArr2, 0, 8);
            utilitiesSDKSecureChannelMessage.authenticationTag = o5.a(bArr2);
        }
    }

    private static void c(byte[] bArr, UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage) throws UtilitiesSDKException {
        if (bArr.length < 15) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_LENGTH);
        }
        int iA = a(bArr, 0, 2);
        utilitiesSDKSecureChannelMessage.protocolVersion = (byte) (15 & (iA >> 12));
        byte b10 = (byte) ((iA >> 6) & 63);
        utilitiesSDKSecureChannelMessage.messageType = b10;
        byte b11 = (byte) (iA & 63);
        utilitiesSDKSecureChannelMessage.protectionType = b11;
        utilitiesSDKSecureChannelMessage.encrypted = b11 == 1;
        if (b10 != 0 && b10 != 1 && b10 != 2 && b10 != 3 && b10 != 4) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_FORMAT);
        }
        String strA = a(a(bArr, 2, 2));
        if (!strA.matches("[0-9A-Z]+") || strA.length() != 3) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_FORMAT);
        }
        int iA2 = a(bArr, 4, 3);
        if (iA2 < 0 || iA2 > 9999999) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_FORMAT);
        }
        String strValueOf = String.valueOf(iA2);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 7 - strValueOf.length(); i10++) {
            sb2.append("0");
        }
        if (strValueOf.matches("[0-9]+")) {
            if (sb2.length() + strValueOf.length() == 7) {
                utilitiesSDKSecureChannelMessage.serialNumber = strA + ((Object) sb2) + strValueOf;
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 7, bArr2, 0, 8);
                utilitiesSDKSecureChannelMessage.nonce = o5.a(bArr2);
                return;
            }
        }
        throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_FORMAT);
    }

    public static UtilitiesSDKSecureChannelParseResponse parseSecureChannelMessage(String str) {
        UtilitiesSDKSecureChannelParseResponse utilitiesSDKSecureChannelParseResponse;
        try {
            if (str == null) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NULL);
            }
            if (!o5.c(str)) {
                throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_FORMAT);
            }
            UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage = new UtilitiesSDKSecureChannelMessage();
            utilitiesSDKSecureChannelMessage.rawData = str;
            byte[] bArrA = o5.a(str);
            c(bArrA, utilitiesSDKSecureChannelMessage);
            a(bArrA, utilitiesSDKSecureChannelMessage);
            b(bArrA, utilitiesSDKSecureChannelMessage);
            return new UtilitiesSDKSecureChannelParseResponse(0, utilitiesSDKSecureChannelMessage);
        } catch (UtilitiesSDKException e5) {
            utilitiesSDKSecureChannelParseResponse = new UtilitiesSDKSecureChannelParseResponse(e5.getReturnErrorCode());
            return utilitiesSDKSecureChannelParseResponse;
        } catch (Exception e7) {
            utilitiesSDKSecureChannelParseResponse = new UtilitiesSDKSecureChannelParseResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR, e7);
            return utilitiesSDKSecureChannelParseResponse;
        }
    }

    private static int a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 += ((bArr[i13] + 256) % 256) << ((((i11 - i13) + i10) - 1) * 8);
        }
        return i12;
    }

    private static String a(int i10) {
        int i11 = i10 % 40;
        int i12 = (i10 - i11) / 40;
        int i13 = i12 % 40;
        return String.valueOf(new char[]{"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ &=%".charAt((i12 - i13) / 40), "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ &=%".charAt(i13), "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ &=%".charAt(i11)});
    }
}
