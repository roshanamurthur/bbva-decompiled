package com.vasco.digipass.sdk.obfuscated;

import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import com.vasco.digipass.sdk.models.SecureChannelMessage;
import com.vasco.digipass.sdk.responses.SecureChannelParseResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;
import com.vasco.digipass.sdk.utils.utilities.responses.UtilitiesSDKSecureChannelParseResponse;
import com.vasco.digipass.sdk.utils.utilities.sc.UtilitiesSDKSecureChannelMessage;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements DigipassSDKConstants {

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f65786b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f65788d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f65790f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f65785a = new byte[4];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f65787c = new byte[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f65789e = new byte[16];
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f65791a = new byte[16];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f65792b = new byte[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f65793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f65794d;
    }

    public static SecureChannelParseResponse a(String str) {
        UtilitiesSDKSecureChannelParseResponse secureChannelMessage = UtilitiesSDK.parseSecureChannelMessage(str);
        if (secureChannelMessage.getReturnCode() != 0) {
            switch (secureChannelMessage.getReturnCode()) {
                case UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_LENGTH /* -4215 */:
                    return new SecureChannelParseResponse(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_LENGTH);
                case UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_FORMAT /* -4214 */:
                    return new SecureChannelParseResponse(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_FORMAT);
                case UtilitiesSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NULL /* -4213 */:
                    return new SecureChannelParseResponse(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NULL);
                default:
                    return new SecureChannelParseResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, secureChannelMessage.getCause());
            }
        }
        UtilitiesSDKSecureChannelMessage message = secureChannelMessage.getMessage();
        SecureChannelMessage secureChannelMessage2 = new SecureChannelMessage();
        secureChannelMessage2.authenticationTag = message.authenticationTag;
        secureChannelMessage2.body = message.body;
        secureChannelMessage2.encrypted = message.encrypted;
        secureChannelMessage2.messageType = message.messageType;
        secureChannelMessage2.nonce = message.nonce;
        secureChannelMessage2.protectionType = message.protectionType;
        secureChannelMessage2.protocolVersion = message.protocolVersion;
        secureChannelMessage2.rawData = message.rawData;
        secureChannelMessage2.serialNumber = message.serialNumber;
        return new SecureChannelParseResponse(0, secureChannelMessage2);
    }

    public static b b(SecureChannelMessage secureChannelMessage) {
        b bVar = new b();
        byte[] bArrA = q.a(secureChannelMessage.body);
        byte b10 = bArrA[0];
        byte[] bArr = bVar.f65791a;
        System.arraycopy(bArrA, 17, bArr, 0, bArr.length);
        byte[] bArr2 = bVar.f65792b;
        System.arraycopy(bArrA, 36, bArr2, 0, bArr2.length);
        if (b10 == 1) {
            int length = bArrA.length - 39;
            byte[] bArr3 = new byte[length];
            bVar.f65793c = bArr3;
            System.arraycopy(bArrA, 39, bArr3, 0, length);
        } else if (b10 == 2) {
            int length2 = bArrA.length - 39;
            byte[] bArr4 = new byte[length2];
            bVar.f65794d = bArr4;
            System.arraycopy(bArrA, 39, bArr4, 0, length2);
        }
        return bVar;
    }

    public static a a(SecureChannelMessage secureChannelMessage) {
        a aVar = new a();
        byte[] bArrA = q.a(secureChannelMessage.body);
        byte b10 = bArrA[0];
        byte[] bArr = aVar.f65785a;
        System.arraycopy(bArrA, 1, bArr, 0, bArr.length);
        aVar.f65786b = bArrA[5];
        byte[] bArr2 = aVar.f65787c;
        System.arraycopy(bArrA, 6, bArr2, 0, bArr2.length);
        if (b10 == 0) {
            aVar.f65790f = true;
            aVar.f65788d = bArrA[22];
            byte[] bArr3 = aVar.f65789e;
            System.arraycopy(bArrA, 23, bArr3, 0, bArr3.length);
        }
        return aVar;
    }
}
