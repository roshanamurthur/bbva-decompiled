package com.vasco.digipass.sdk.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import com.vasco.digipass.sdk.models.SecureChannelMessage;
import com.vasco.digipass.sdk.responses.ActivationResponse;
import com.vasco.digipass.sdk.responses.GenerateDerivationCodeResponse;
import com.vasco.digipass.sdk.responses.GenerationResponse;
import com.vasco.digipass.sdk.responses.MultiDeviceLicenseActivationResponse;
import com.vasco.digipass.sdk.responses.SecureChannelDecryptionResponse;
import com.vasco.digipass.sdk.responses.SecureChannelGenerateResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDK;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKCryptoResponse;
import com.vasco.digipass.sdk.utils.utilities.wbc.Serializer;
import com.vasco.digipass.sdk.utils.utilities.wbc.WBCTable;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements DigipassSDKConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f65781a = {71, -37, -99, 29};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f65782b = {Constants.CVR_B1b41_1110_ONLINE_PIN, -1, -100, 28};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f65783c = {-83, -5, 120, 116};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f65784d = {4, -35, -62, 73};

    private m() {
    }

    public static MultiDeviceLicenseActivationResponse a(SecureChannelMessage secureChannelMessage, String str, String str2, byte b10, long j10) {
        try {
            if (secureChannelMessage == null) {
                throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NULL);
            }
            if (secureChannelMessage.messageType != 0) {
                throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_TYPE);
            }
            if (b10 < 0 || b10 > 2) {
                throw new h(DigipassSDKReturnCodes.JAILBREAK_STATUS_INVALID);
            }
            n.b bVarB = n.b(secureChannelMessage);
            byte[] bArrA = bVarB.f65793c;
            if (str == null && bArrA == null) {
                throw new h(DigipassSDKReturnCodes.STATIC_VECTOR_NULL);
            }
            if (str != null && bArrA != null && !str.equals(q.a(bArrA))) {
                throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_STATIC_VECTOR_INCONSISTENT);
            }
            if (bArrA == null) {
                bArrA = q.a(str);
            }
            o.b(bArrA, bVarB.f65794d);
            e eVarA = a.a(bArrA, (byte[]) null, secureChannelMessage.serialNumber);
            i iVar = eVarA.f65717c;
            if (!iVar.f65766t) {
                throw new h(DigipassSDKReturnCodes.MULTI_DEVICE_ACTIVATION_DISABLED);
            }
            eVarA.f65718d.f65738n = true;
            byte[] bArr = iVar.f65750c;
            byte[] bArrB = iVar.f65769w ? b(bArr) : a(bArr);
            byte[] bArrA2 = o.a(bArrB, eVarA.f65717c.f65749b.getBytes());
            q.g(bArrB);
            eVarA.f65718d.f65740p = o.a(false, bArrA2, bVarB.f65791a, (byte) 1);
            q.g(bArrA2);
            a(eVarA, bVarB);
            byte[] bArrA3 = o.a(eVarA, str2);
            g gVar = eVarA.f65718d;
            gVar.f65741q = o.a(true, bArrA3, gVar.f65740p, (byte) 2);
            q.g(eVarA.f65718d.f65740p);
            eVarA.f65718d.f65739o = a(b10);
            eVarA.f65718d.f65728c = (byte) 1;
            GenerateDerivationCodeResponse generateDerivationCodeResponseA = k.a(bArrA, p.a(eVarA), j10, 100, null, 0, bArrA3, true, secureChannelMessage.nonce, str2);
            q.g(bArrA3);
            if (generateDerivationCodeResponseA.getReturnCode() != 0) {
                throw new h(generateDerivationCodeResponseA.getReturnCode());
            }
            String derivationCode = generateDerivationCodeResponseA.getDerivationCode();
            e eVarB = p.b(bArrA, generateDerivationCodeResponseA.getDynamicVector());
            eVarB.f65718d.f65728c = (byte) 4;
            MultiDeviceLicenseActivationResponse multiDeviceLicenseActivationResponse = new MultiDeviceLicenseActivationResponse(0, eVarB.f65718d.f65728c, bArrA, p.a(eVarB), derivationCode);
            eVarB.f();
            return multiDeviceLicenseActivationResponse;
        } catch (h e5) {
            return new MultiDeviceLicenseActivationResponse(e5.a());
        } catch (Exception e7) {
            return new MultiDeviceLicenseActivationResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
        }
    }

    public static SecureChannelDecryptionResponse b(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, String str) {
        if (secureChannelMessage != null) {
            try {
                byte b10 = secureChannelMessage.messageType;
                if (b10 == 0 || b10 == 1) {
                    throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_TYPE);
                }
            } catch (h e5) {
                return new SecureChannelDecryptionResponse(e5.a());
            } catch (Exception e7) {
                return new SecureChannelDecryptionResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
            }
        }
        e eVarA = a(bArr, bArr2, secureChannelMessage, str, true);
        if (!eVarA.e()) {
            throw new h(DigipassSDKReturnCodes.STATUS_INVALID);
        }
        SecureChannelDecryptionResponse secureChannelDecryptionResponse = new SecureChannelDecryptionResponse(0, secureChannelMessage.body);
        eVarA.f();
        return secureChannelDecryptionResponse;
    }

    public static String c() {
        byte[] bArr = new byte[32];
        int[] iArr = {106, 97, 118, 97, 120, 46, 109, 105, 99, 114, 111, 101, 100, 105, 116, 105, 111, 110, 46, 109, 105, 100, 108, 101, 116, 46, 77, 73, 68, 108, 101, 116};
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    private static byte[] b(byte[] bArr) {
        WBCTable wBCTableDeserializeResource;
        synchronized (m.class) {
            wBCTableDeserializeResource = new Serializer().deserializeResource("/encrypt_platform_key_tables.dat");
        }
        return UtilitiesSDK.encryptAESBlock(wBCTableDeserializeResource, bArr).getOutputData();
    }

    public static String b() {
        byte[] bArr = new byte[16];
        int[] iArr = {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48};
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }

    public static ActivationResponse a(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, byte[] bArr3, int i10, byte[] bArr4, boolean z10, String str) {
        Exception exc;
        byte[] bArr5;
        byte[] bArrA;
        byte[] bArrA2;
        h hVar;
        ActivationResponse activationResponse;
        byte[] bArr6;
        e eVar = null;
        try {
            l.a(bArr3, i10);
            if (secureChannelMessage != null && secureChannelMessage.messageType != 1) {
                throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_TYPE);
            }
            e eVarA = a(bArr, bArr2, secureChannelMessage, str, false);
            try {
                if (eVarA.f65718d.f65728c == 4) {
                    n.a aVarA = n.a(secureChannelMessage);
                    bArrA = j.a(eVarA, eVarA.f65719e, str, false);
                    try {
                        if (Arrays.areEqual(bArrA, aVarA.f65785a)) {
                            bArrA2 = o.a(eVarA, str);
                            try {
                                g gVar = eVarA.f65718d;
                                gVar.f65740p = o.a(false, bArrA2, gVar.f65741q, (byte) 2);
                                l.a aVarA2 = a.a(eVarA, bArr3, i10, bArr4, z10, str);
                                if (aVarA2.getReturnCode() == 0) {
                                    bArr6 = aVarA2.f65780c;
                                    g gVar2 = eVarA.f65718d;
                                    gVar2.f65732g = o.a(false, gVar2.f65740p, aVarA.f65787c, (byte) 1);
                                    g gVar3 = eVarA.f65718d;
                                    gVar3.f65733h = o.a(true, bArr6, gVar3.f65732g, (byte) 2);
                                    g gVar4 = eVarA.f65718d;
                                    boolean z11 = aVarA.f65790f;
                                    gVar4.f65746v = z11;
                                    if (z11) {
                                        gVar4.f65743s = o.a(false, gVar4.f65740p, aVarA.f65789e, (byte) 1);
                                        g gVar5 = eVarA.f65718d;
                                        gVar5.f65744t = o.a(true, bArrA2, gVar5.f65743s, (byte) 2);
                                    }
                                    g gVar6 = eVarA.f65718d;
                                    gVar6.f65728c = (byte) 1;
                                    gVar6.f65742r = aVarA.f65786b;
                                    gVar6.f65745u = aVarA.f65788d;
                                    gVar6.f65730e = eVarA.f65717c.f65756i;
                                    gVar6.f65736k = !q.f(bArr3);
                                    activationResponse = new ActivationResponse(0, eVarA.f65718d.f65728c, p.a(eVarA), 0);
                                    activationResponse.setStaticVector(bArr);
                                    q.g(bArrA);
                                    q.g(bArrA2);
                                    q.g(bArr6);
                                    if (eVarA != null) {
                                        eVarA.f();
                                    }
                                    return activationResponse;
                                }
                                throw new h(aVarA2.getReturnCode());
                            } catch (h e5) {
                                hVar = e5;
                                bArr5 = null;
                                eVar = eVarA;
                                activationResponse = new ActivationResponse(hVar.a());
                                eVarA = eVar;
                                bArr6 = bArr5;
                            } catch (Exception e7) {
                                exc = e7;
                                bArr5 = null;
                                eVar = eVarA;
                                activationResponse = new ActivationResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, exc);
                                eVarA = eVar;
                                bArr6 = bArr5;
                            }
                        } else {
                            throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_TARGET);
                        }
                    } catch (h e10) {
                        hVar = e10;
                        bArr5 = null;
                        bArrA2 = null;
                    } catch (Exception e11) {
                        exc = e11;
                        bArr5 = null;
                        bArrA2 = null;
                    }
                } else {
                    throw new h(DigipassSDKReturnCodes.STATUS_INVALID);
                }
            } catch (h e12) {
                hVar = e12;
                bArr5 = null;
                bArrA = null;
                bArrA2 = null;
            } catch (Exception e13) {
                exc = e13;
                bArr5 = null;
                bArrA = null;
                bArrA2 = null;
            }
        } catch (h e14) {
            hVar = e14;
            bArr5 = null;
            bArrA = null;
            bArrA2 = null;
        } catch (Exception e15) {
            exc = e15;
            bArr5 = null;
            bArrA = null;
            bArrA2 = null;
        }
    }

    public static GenerationResponse a(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, byte[] bArr3, int i10, byte[] bArr4, boolean z10, long j10, int i11, String str, byte b10, boolean z11) {
        GenerationResponse generationResponse;
        try {
            l.a(bArr3, i10);
            a(bArr, bArr2, secureChannelMessage, str);
            byte b11 = secureChannelMessage.messageType;
            if (b11 != 3 && b11 != 1) {
                throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_TYPE);
            }
            if (secureChannelMessage.protectionType != 0) {
                UtilitiesSDKCryptoResponse utilitiesSDKCryptoResponseHash = UtilitiesSDK.hash((byte) 3, q.a(secureChannelMessage.rawData));
                if (utilitiesSDKCryptoResponseHash.getReturnCode() == 0) {
                    byte[] outputData = utilitiesSDKCryptoResponseHash.getOutputData();
                    String[] strArr = new String[4];
                    byte[] bArr5 = new byte[8];
                    for (int i12 = 0; i12 < 4; i12++) {
                        System.arraycopy(outputData, i12 * 8, bArr5, 0, 8);
                        strArr[i12] = q.a(bArr5);
                    }
                    return k.a(bArr, bArr2, j10, i11, bArr3, i10, bArr4, z10, null, false, strArr, true, str, null, false, b10, z11);
                }
                throw new Exception("" + utilitiesSDKCryptoResponseHash.getReturnCode());
            }
            throw new h(DigipassSDKReturnCodes.PROTECTION_TYPE_NOT_SUPPORTED);
        } catch (h e5) {
            generationResponse = new GenerationResponse(e5.a());
            return generationResponse;
        } catch (Exception e7) {
            generationResponse = new GenerationResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
            return generationResponse;
        }
    }

    public static SecureChannelGenerateResponse a(byte[] bArr, byte[] bArr2, String str, byte b10, String str2) {
        SecureChannelGenerateResponse secureChannelGenerateResponse;
        try {
            if (!q.d(str2)) {
                if (b10 != 0 && b10 != 1) {
                    throw new h(DigipassSDKReturnCodes.PROTECTION_TYPE_NOT_SUPPORTED);
                }
                if (!q.d(str)) {
                    if (q.c(str)) {
                        if (str.length() % 2 == 0 && str.length() <= 1024) {
                            e eVarB = p.b(bArr, bArr2);
                            if (eVarB.f65718d.f65746v) {
                                String strA = q.a(UtilitiesSDK.generateRandomByteArray(8).getOutputData());
                                SecureChannelMessage secureChannelMessage = new SecureChannelMessage();
                                secureChannelMessage.protocolVersion = (byte) 0;
                                secureChannelMessage.messageType = DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE;
                                secureChannelMessage.serialNumber = eVarB.f65717c.f65749b;
                                secureChannelMessage.nonce = strA;
                                secureChannelMessage.body = str;
                                secureChannelMessage.encrypted = false;
                                secureChannelMessage.authenticationTag = null;
                                if (b10 == 0) {
                                    secureChannelMessage.protectionType = (byte) 0;
                                } else {
                                    secureChannelMessage.protectionType = (byte) 1;
                                    secureChannelMessage.authenticationTag = b();
                                    byte[] bArrB = o.b(eVarB, str2);
                                    byte[] bArrA = o.a(bArrB, f.f65724e);
                                    secureChannelMessage.body = o.a(true, secureChannelMessage, bArrA);
                                    secureChannelMessage.encrypted = true;
                                    q.g(bArrA);
                                    secureChannelMessage.rawData = o.a(secureChannelMessage);
                                    byte[] bArrA2 = o.a(bArrB, f.f65725f);
                                    q.g(bArrB);
                                    secureChannelMessage.authenticationTag = o.a(secureChannelMessage, bArrA2);
                                    q.g(bArrA2);
                                }
                                secureChannelMessage.rawData = o.a(secureChannelMessage);
                                return new SecureChannelGenerateResponse(0, secureChannelMessage);
                            }
                            throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_DISABLED);
                        }
                        throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_INCORRECT_LENGTH);
                    }
                    throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_INCORRECT_FORMAT);
                }
                throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_BODY_NULL_OR_EMPTY);
            }
            throw new h(DigipassSDKReturnCodes.PLATFORM_FINGERPRINT_NOT_DEFINED);
        } catch (h e5) {
            secureChannelGenerateResponse = new SecureChannelGenerateResponse(e5.a());
            return secureChannelGenerateResponse;
        } catch (Exception e7) {
            secureChannelGenerateResponse = new SecureChannelGenerateResponse(DigipassSDKReturnCodes.UNKNOWN_ERROR, e7);
            return secureChannelGenerateResponse;
        }
    }

    private static void a(e eVar, n.b bVar) throws h {
        byte[] bArr = new byte[3];
        System.arraycopy(UtilitiesSDK.encrypt((byte) 3, (byte) 1, eVar.f65718d.f65740p, null, new byte[16]).getOutputData(), 0, bArr, 0, 3);
        if (!Arrays.areEqual(bArr, bVar.f65792b)) {
            throw new h(DigipassSDKReturnCodes.PLATFORM_ACTIVATION_KEY_INVALID);
        }
    }

    private static byte a(byte b10) {
        try {
            try {
                Class.forName(a());
                return b10 == 2 ? (byte) 9 : (byte) 7;
            } catch (ClassNotFoundException unused) {
                Class.forName(c());
                return (byte) 15;
            }
        } catch (ClassNotFoundException | Exception unused2) {
            return (byte) 1;
        }
    }

    private static e a(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, String str, boolean z10) throws h {
        byte[] bArrC;
        byte[] bArr3;
        byte[] bArr4;
        e eVarA = a(bArr, bArr2, secureChannelMessage, str);
        if (z10 && !eVarA.f65718d.f65746v) {
            throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_DISABLED);
        }
        if (z10) {
            bArrC = o.b(eVarA, str);
            bArr3 = f.f65723d;
            bArr4 = f.f65722c;
        } else {
            bArrC = o.c(eVarA, str);
            bArr3 = f.f65721b;
            bArr4 = f.f65720a;
        }
        byte[] bArrA = o.a(bArrC, bArr3);
        o.b(secureChannelMessage, bArrA);
        q.g(bArrA);
        byte[] bArrA2 = o.a(bArrC, bArr4);
        q.g(bArrC);
        secureChannelMessage.body = o.a(false, secureChannelMessage, bArrA2);
        secureChannelMessage.encrypted = false;
        q.g(bArrA2);
        return eVarA;
    }

    private static e a(byte[] bArr, byte[] bArr2, SecureChannelMessage secureChannelMessage, String str) throws h {
        if (secureChannelMessage != null) {
            if (!q.d(str)) {
                e eVarB = p.b(bArr, bArr2);
                i iVar = eVarB.f65717c;
                if (iVar.f65766t) {
                    if (iVar.f65749b.equals(secureChannelMessage.serialNumber)) {
                        return eVarB;
                    }
                    throw new h(DigipassSDKReturnCodes.LICENSE_INCORRECT);
                }
                throw new h(DigipassSDKReturnCodes.MULTI_DEVICE_ACTIVATION_DISABLED);
            }
            throw new h(DigipassSDKReturnCodes.PLATFORM_FINGERPRINT_NOT_DEFINED);
        }
        throw new h(DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_NULL);
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(f65781a, 0, bArr2, 0, 4);
        System.arraycopy(f65782b, 0, bArr2, 4, 4);
        System.arraycopy(f65783c, 0, bArr2, 8, 4);
        System.arraycopy(f65784d, 0, bArr2, 12, 4);
        byte[] bArrA = o.a(true, bArr2, bArr, (byte) 1);
        q.g(bArr2);
        return bArrA;
    }

    public static String a() {
        byte[] bArr = new byte[20];
        int[] iArr = {97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 46, 65, 99, 116, 105, 118, 105, 116, 121};
        for (int i10 = 0; i10 < 20; i10++) {
            bArr[i10] = (byte) iArr[i10];
        }
        return new String(bArr);
    }
}
