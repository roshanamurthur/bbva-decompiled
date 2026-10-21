package com.vasco.digipass.sdk.obfuscated;

import bc.org.bouncycastle.crypto.paddings.PKCS7Padding;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import com.vasco.digipass.sdk.models.SecureChannelMessage;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKCryptoResponse;
import com.vasco.digipass.sdk.utils.utilities.responses.UtilitiesSDKSecureChannelGenerateResponse;
import com.vasco.digipass.sdk.utils.utilities.sc.UtilitiesSDKSecureChannelMessage;
import com.vasco.digipass.sdk.utils.utilities.sc.UtilitiesSDKSecureChannelMessageGenerator;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f65795a = {UtilitiesSDKConstants.SRP_LABEL_ENC, -123, 42, -101, -7, -42, 35, 66, 12, 24, 78, -103, 87, 77, -82, -95};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f65796b = {71, 109, 122, 15, Base64.padSymbol, -2, -54, -71, -112, -96, -31, 73, Constants.STATE_ERROR, 127, 109, -36};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f65797c = {10, -73, 56, 92, -81, 66, -84, 34, -62, 92, 107, -4, 116, Constants.CVR_B1b85_0101_MOBILE_APP, -8, 64};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f65798d = {-124, Constants.CVR_B2b8765_1111_APP_DISABLED, 27, 4, -32, 115, 113, -58, -117, 55, 76, 104, 32, 81, -58, -108};

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f65799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c[] f65800b;

        private b() {
            this.f65799a = new c();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte f65801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f65802b;

        private c() {
        }
    }

    public static byte[] a(e eVar, String str) {
        byte[] bytes = l.a(eVar).getBytes();
        byte[] bArr = new byte[64];
        byte[] bArr2 = f65795a;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = f65796b;
        System.arraycopy(bArr3, 0, bArr, 16, bArr3.length);
        byte[] bArr4 = f65797c;
        System.arraycopy(bArr4, 0, bArr, 32, bArr4.length);
        byte[] bArr5 = f65798d;
        System.arraycopy(bArr5, 0, bArr, 48, bArr5.length);
        return l.a(bytes, eVar, str, q.a(bArr));
    }

    public static UtilitiesSDKSecureChannelMessage b(SecureChannelMessage secureChannelMessage) {
        UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage = new UtilitiesSDKSecureChannelMessage();
        utilitiesSDKSecureChannelMessage.authenticationTag = secureChannelMessage.authenticationTag;
        utilitiesSDKSecureChannelMessage.body = secureChannelMessage.body;
        utilitiesSDKSecureChannelMessage.encrypted = secureChannelMessage.encrypted;
        utilitiesSDKSecureChannelMessage.messageType = secureChannelMessage.messageType;
        utilitiesSDKSecureChannelMessage.nonce = secureChannelMessage.nonce;
        utilitiesSDKSecureChannelMessage.protectionType = secureChannelMessage.protectionType;
        utilitiesSDKSecureChannelMessage.protocolVersion = secureChannelMessage.protocolVersion;
        utilitiesSDKSecureChannelMessage.rawData = secureChannelMessage.rawData;
        utilitiesSDKSecureChannelMessage.serialNumber = secureChannelMessage.serialNumber;
        return utilitiesSDKSecureChannelMessage;
    }

    public static byte[] c(e eVar, String str) {
        return a(eVar, str, false);
    }

    public static byte[] a(e eVar, String str, boolean z10) {
        byte[] bArr;
        byte[] bArrA = a(eVar, str);
        if (z10) {
            bArr = eVar.f65718d.f65744t;
        } else {
            bArr = eVar.f65718d.f65741q;
        }
        byte[] bArrA2 = a(false, bArrA, bArr, (byte) 2);
        q.g(bArrA);
        return bArrA2;
    }

    public static byte[] b(e eVar, String str) {
        return a(eVar, str, true);
    }

    public static void b(SecureChannelMessage secureChannelMessage, byte[] bArr) throws h {
        if (secureChannelMessage.protectionType == 0) {
            return;
        }
        if (secureChannelMessage.authenticationTag.compareTo(a(secureChannelMessage, bArr)) != 0) {
            throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_SIGNATURE_INVALID);
        }
    }

    public static String a(SecureChannelMessage secureChannelMessage) throws Exception {
        UtilitiesSDKSecureChannelGenerateResponse utilitiesSDKSecureChannelGenerateResponseGenerateSecureChannelMessage = UtilitiesSDKSecureChannelMessageGenerator.generateSecureChannelMessage(b(secureChannelMessage));
        if (utilitiesSDKSecureChannelGenerateResponseGenerateSecureChannelMessage.getReturnCode() == 0) {
            return utilitiesSDKSecureChannelGenerateResponseGenerateSecureChannelMessage.getMessage();
        }
        throw new Exception("" + utilitiesSDKSecureChannelGenerateResponseGenerateSecureChannelMessage.getReturnCode());
    }

    public static void b(byte[] bArr, byte[] bArr2) throws h {
        if (q.f(bArr2)) {
            return;
        }
        b bVar = new b();
        a(bVar.f65799a, bArr2[1]);
        int length = bArr2.length - 2;
        bVar.f65800b = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            c cVar = new c();
            a(cVar, bArr2[i10 + 2]);
            bVar.f65800b[i10] = cVar;
        }
        p.a(bArr);
        if (bArr[1] == 8) {
            if (((bArr[2] & 255) << 8) + (bArr[3] & 255) == bArr.length - 4) {
                a(bArr, 4, DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT, bVar);
                return;
            }
            throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_LENGTH);
        }
        throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_INCORRECT_FORMAT);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        new PKCS7Padding().addPadding(bArr3, bArr2.length);
        return UtilitiesSDK.encrypt((byte) 3, (byte) 1, bArr, null, bArr3).getOutputData();
    }

    public static byte[] a(boolean z10, byte[] bArr, byte[] bArr2, byte b10, byte[] bArr3) throws Exception {
        UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseDecrypt;
        if (z10) {
            utilitiesSDKCryptoResponseDecrypt = UtilitiesSDK.encrypt((byte) 3, b10, bArr, bArr3, bArr2);
        } else {
            utilitiesSDKCryptoResponseDecrypt = UtilitiesSDK.decrypt((byte) 3, b10, bArr, bArr3, bArr2);
        }
        if (utilitiesSDKCryptoResponseDecrypt.getReturnCode() == 0) {
            return utilitiesSDKCryptoResponseDecrypt.getOutputData();
        }
        throw new Exception("" + utilitiesSDKCryptoResponseDecrypt.getReturnCode());
    }

    public static byte[] a(boolean z10, byte[] bArr, byte[] bArr2, byte b10) {
        return a(z10, bArr, bArr2, b10, null);
    }

    public static String a(boolean z10, SecureChannelMessage secureChannelMessage, byte[] bArr) {
        boolean z11 = secureChannelMessage.encrypted;
        if ((z11 && z10) || (!z11 && !z10)) {
            return secureChannelMessage.body;
        }
        byte[] bArrA = q.a(secureChannelMessage.nonce);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArrA, 0, bArr2, 0, bArrA.length);
        return q.a(a(z10, bArr, q.a(secureChannelMessage.body), (byte) 4, bArr2));
    }

    public static String a(SecureChannelMessage secureChannelMessage, byte[] bArr) {
        byte[] bArrA = q.a(secureChannelMessage.rawData);
        int length = bArrA.length - 8;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrA, 0, bArr2, 0, length);
        byte[] outputData = UtilitiesSDK.hmac((byte) 3, bArr2, bArr).getOutputData();
        byte[] bArr3 = new byte[8];
        System.arraycopy(outputData, 0, bArr3, 0, 8);
        return q.a(bArr3);
    }

    private static void a(c cVar, byte b10) {
        cVar.f65801a = (byte) (((b10 >> 4) & 15) + 1);
        cVar.f65802b = (b10 & 15) == 1;
    }

    private static void a(byte[] bArr, int i10, int i11, b bVar) throws h {
        c cVar;
        if (q.f(bArr)) {
            return;
        }
        byte b10 = 9;
        boolean z10 = false;
        while (i10 < bArr.length) {
            int i12 = i10 + 1;
            byte b11 = bArr[i10];
            if (i12 < bArr.length) {
                int i13 = i10 + 2;
                int i14 = bArr[i12] & 255;
                if (i13 < bArr.length) {
                    int i15 = i14 + i13;
                    if (i15 > bArr.length) {
                        throw new h(i11);
                    }
                    if (b11 == 61) {
                        z10 = true;
                    } else if (b11 == 17) {
                        z10 = false;
                    } else if (b11 == 20) {
                        i10 += 3;
                        b10 = bArr[i13];
                    } else if (b11 == 41 || b11 == 43) {
                        if (z10) {
                            cVar = bVar.f65799a;
                        } else {
                            cVar = b10 <= bVar.f65800b.length ? bVar.f65800b[b10 - 1] : null;
                        }
                        if (cVar != null) {
                            if (b11 == 41) {
                                i10 += 3;
                                bArr[i13] = cVar.f65801a;
                            } else {
                                i10 += 3;
                                bArr[i13] = cVar.f65802b ? (byte) 1 : (byte) 0;
                            }
                        }
                    } else {
                        i10 = i15;
                    }
                    i10 = i13;
                } else {
                    throw new h(i11);
                }
            } else {
                throw new h(i11);
            }
        }
    }
}
