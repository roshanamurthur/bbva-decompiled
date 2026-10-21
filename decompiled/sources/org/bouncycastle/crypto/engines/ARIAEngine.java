package org.bouncycastle.crypto.engines;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Array;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes3.dex */
public class ARIAEngine implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[][] f88298b = {Hex.decodeStrict("517cc1b727220a94fe13abe8fa9a6ee0"), Hex.decodeStrict("6db14acc9e21c820ff28b1d5ef5de2b0"), Hex.decodeStrict("db92371d2126e9700324977504e8c90e")};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f88299c = {99, 124, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 123, -14, 107, Constants.FCI_TEMPLATE, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, Constants.CVR_B2b8765_1111_APP_DISABLED, -83, -44, -94, -81, -100, -92, 114, Constants.CVR_B2b87_11_RFU, -73, -3, -109, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, MessageUtils.MESSAGE_21_NAK, 4, -57, 35, -61, 24, -106, 5, -102, 7, MessageUtils.MESSAGE_18_DC2, -128, -30, -21, 39, UtilitiesSDKConstants.SRP_LABEL_MAC, 117, 9, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 44, MessageUtils.MESSAGE_26_SUB, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, GenerateAcResponseApdu.DDA_HEADER, -53, -66, 57, 74, 76, 88, Constants.CVR_B2b65_CLEAR_BITS, -48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, Constants.CVR_B1b85_0101_MOBILE_APP, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, Constants.STATE_ERROR, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, Constants.CVR_B1b85_0110_TERMINAL, KSUtils.PLAIN_BUFFER, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 62, -75, 102, 72, 3, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.DIRECTORY_ENTRY, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ComputeCcCommandApdu.EXPECTED_P1, -108, -101, MessageUtils.MESSAGE_30_RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, 45, 15, UtilitiesSDKConstants.SRP_LABEL_ENC, 84, -69, 22};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f88300d = {-30, 78, 84, -4, -108, -62, 74, -52, 98, 13, GenerateAcResponseApdu.DDA_HEADER, 70, 60, 77, -117, -47, 94, -6, 100, -53, -76, -105, -66, 43, -68, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 46, 3, -45, 25, 89, -63, 29, 6, 65, 107, 85, Constants.CVR_B2b8765_1111_APP_DISABLED, -103, 105, -22, -100, 24, -82, 99, -33, -25, -69, 0, 115, 102, -5, -106, 76, -123, -28, 58, 9, 69, -86, 15, -18, 16, -21, 45, 127, -12, 41, -84, Constants.CVR_B2b65_CLEAR_BITS, -83, -111, -115, 120, -56, -107, -7, 47, -50, -51, 8, 122, -120, 56, 92, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 42, 40, 71, -37, -72, -57, -109, -92, MessageUtils.MESSAGE_18_DC2, 83, -1, -121, Constants.CVR_B1b41_1110_ONLINE_PIN, 49, 54, 33, 88, 72, 1, ComputeCcCommandApdu.EXPECTED_P1, 55, 116, 50, -54, -23, -79, -73, -85, 12, -41, -60, 86, 66, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 7, -104, Constants.CVR_B1b85_0110_TERMINAL, -39, -74, -71, 17, 64, -20, 32, -116, -67, -96, -55, -124, 4, 73, 35, -15, 79, Constants.CVR_B1b85_0101_MOBILE_APP, 31, 19, -36, -40, Constants.CVR_B2b87_11_RFU, -98, 87, -29, -61, 123, 101, 59, 2, -113, 62, -24, 37, -110, -27, MessageUtils.MESSAGE_21_NAK, -35, -3, 23, -87, ByteSourceJsonBootstrapper.UTF8_BOM_3, -44, -102, 126, -59, 57, 103, -2, 118, -99, 67, -89, -31, -48, -11, 104, -14, 27, 52, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 5, -93, -118, -43, 121, -122, -88, 48, -58, 81, 75, MessageUtils.MESSAGE_30_RS, -90, 39, -10, 53, -46, 110, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 22, -126, Constants.STATE_ERROR, -38, -26, 117, -94, ByteSourceJsonBootstrapper.UTF8_BOM_1, 44, UtilitiesSDKConstants.SRP_LABEL_MAC, 28, -97, 93, Constants.FCI_TEMPLATE, -128, 10, 114, 68, -101, 108, -112, 11, 91, 51, 125, 90, 82, -13, Constants.DIRECTORY_ENTRY, -95, -9, UtilitiesSDKConstants.SRP_LABEL_ENC, -42, 63, 124, 109, -19, 20, -32, -91, Base64.padSymbol, 34, -77, -8, -119, -34, 113, MessageUtils.MESSAGE_26_SUB, -81, -70, -75, KSUtils.PLAIN_BUFFER};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f88301e = {82, 9, GenerateAcResponseApdu.DDA_HEADER, -43, 48, 54, -91, 56, ByteSourceJsonBootstrapper.UTF8_BOM_3, 64, -93, -98, KSUtils.PLAIN_BUFFER, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, ComputeCcCommandApdu.EXPECTED_P1, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, UtilitiesSDKConstants.SRP_LABEL_MAC, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 72, Constants.CVR_B1b85_0101_MOBILE_APP, -3, -19, -71, -38, 94, MessageUtils.MESSAGE_21_NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, MessageUtils.MESSAGE_30_RS, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, Constants.CVR_B2b65_CLEAR_BITS, -50, Constants.CVR_B2b8765_1111_APP_DISABLED, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, MessageUtils.MESSAGE_26_SUB, 113, 29, 41, -59, -119, Constants.FCI_TEMPLATE, -73, 98, Constants.CVR_B1b41_1110_ONLINE_PIN, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, Constants.CVR_B2b87_11_RFU, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, MessageUtils.MESSAGE_18_DC2, 16, 89, 39, -128, -20, Constants.STATE_ERROR, Constants.CVR_B1b85_0110_TERMINAL, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, ByteSourceJsonBootstrapper.UTF8_BOM_1, -96, -32, 59, 77, -82, 42, -11, UtilitiesSDKConstants.SRP_LABEL_ENC, -56, -21, -69, 60, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 83, -103, Constants.DIRECTORY_ENTRY, 23, 43, 4, 126, -70, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -42, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -31, 105, 20, 99, 85, 33, 12, 125};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f88302f = {48, 104, -103, 27, -121, -71, 33, 120, Constants.CVR_B1b85_0101_MOBILE_APP, 57, -37, -31, 114, 9, 98, 60, 62, 126, 94, ComputeCcCommandApdu.EXPECTED_P1, -15, -96, -52, -93, 42, 29, -5, -74, -42, 32, -60, -115, KSUtils.PLAIN_BUFFER, 101, -11, -119, -53, -99, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -58, 87, 67, 86, 23, -44, 64, MessageUtils.MESSAGE_26_SUB, 77, Constants.CVR_B2b87_11_RFU, 99, 108, -29, -73, -56, 100, GenerateAcResponseApdu.DDA_HEADER, 83, -86, 56, -104, 12, -12, -101, -19, 127, 34, 118, -81, -35, 58, 11, 88, 103, -120, 6, -61, 53, 13, 1, -117, -116, -62, -26, Constants.STATE_ERROR, 2, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 117, -109, 102, MessageUtils.MESSAGE_30_RS, -27, -30, 84, -40, 16, -50, 122, -24, 8, 44, MessageUtils.MESSAGE_18_DC2, -105, 50, -85, -76, 39, 10, 35, -33, ByteSourceJsonBootstrapper.UTF8_BOM_1, -54, -39, -72, -6, -36, 49, 107, -47, -83, 25, 73, -67, 81, -106, -18, -28, -88, 65, -38, -1, -51, 85, -122, 54, -66, Constants.DIRECTORY_ENTRY, 82, -8, -69, Constants.CVR_B1b41_1110_ONLINE_PIN, -126, 72, 105, -102, -32, 71, -98, 92, 4, 75, 52, MessageUtils.MESSAGE_21_NAK, 121, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -89, -34, 41, -82, -110, -41, -124, -23, -46, -70, 93, -13, -59, UtilitiesSDKConstants.SRP_LABEL_ENC, ByteSourceJsonBootstrapper.UTF8_BOM_3, -92, 59, 113, 68, 70, 43, -4, -21, Constants.FCI_TEMPLATE, -43, -10, 20, -2, 124, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 90, 125, -3, 47, 24, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 22, -91, -111, 31, 5, -107, 116, -87, -63, 91, 74, -123, 109, 19, 7, 79, 78, 69, UtilitiesSDKConstants.SRP_LABEL_MAC, 15, -55, 28, -90, -68, -20, 115, -112, 123, Constants.CVR_B2b65_CLEAR_BITS, 89, -113, -95, -7, 45, -14, -79, 0, -108, 55, -97, -48, 46, -100, 110, 40, 63, -128, Constants.CVR_B2b8765_1111_APP_DISABLED, Base64.padSymbol, -45, 37, -118, -75, -25, 66, -77, -57, -22, -9, 76, 17, 51, 3, -94, -84, Constants.CVR_B1b85_0110_TERMINAL};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[][] f88303a;

    public static void A(byte[] bArr) {
        byte b10 = bArr[0];
        byte b11 = bArr[1];
        byte b12 = bArr[2];
        byte b13 = bArr[3];
        byte b14 = bArr[4];
        byte b15 = bArr[5];
        byte b16 = bArr[6];
        byte b17 = bArr[7];
        byte b18 = bArr[8];
        byte b19 = bArr[9];
        byte b20 = bArr[10];
        byte b21 = bArr[11];
        byte b22 = bArr[12];
        byte b23 = bArr[13];
        byte b24 = bArr[14];
        byte b25 = bArr[15];
        bArr[0] = (byte) ((((((b13 ^ b14) ^ b16) ^ b18) ^ b19) ^ b23) ^ b24);
        bArr[1] = (byte) ((((((b12 ^ b15) ^ b17) ^ b18) ^ b19) ^ b22) ^ b25);
        bArr[2] = (byte) ((((((b11 ^ b14) ^ b16) ^ b20) ^ b21) ^ b22) ^ b25);
        bArr[3] = (byte) ((((((b10 ^ b15) ^ b17) ^ b20) ^ b21) ^ b23) ^ b24);
        int i10 = b10 ^ b12;
        bArr[4] = (byte) (((((i10 ^ b15) ^ b18) ^ b21) ^ b24) ^ b25);
        int i11 = b11 ^ b13;
        bArr[5] = (byte) (((((i11 ^ b14) ^ b19) ^ b20) ^ b24) ^ b25);
        bArr[6] = (byte) (((((i10 ^ b17) ^ b19) ^ b20) ^ b22) ^ b23);
        bArr[7] = (byte) (((((i11 ^ b16) ^ b18) ^ b21) ^ b22) ^ b23);
        int i12 = b10 ^ b11;
        bArr[8] = (byte) (((((i12 ^ b14) ^ b17) ^ b20) ^ b23) ^ b25);
        bArr[9] = (byte) (((((i12 ^ b15) ^ b16) ^ b21) ^ b22) ^ b24);
        int i13 = b12 ^ b13;
        bArr[10] = (byte) (((((i13 ^ b15) ^ b16) ^ b18) ^ b23) ^ b25);
        bArr[11] = (byte) (((((i13 ^ b14) ^ b17) ^ b19) ^ b22) ^ b24);
        int i14 = b11 ^ b12;
        bArr[12] = (byte) (((((i14 ^ b16) ^ b17) ^ b19) ^ b21) ^ b22);
        int i15 = b10 ^ b13;
        bArr[13] = (byte) (((((i15 ^ b16) ^ b17) ^ b18) ^ b20) ^ b23);
        bArr[14] = (byte) (((((i15 ^ b14) ^ b15) ^ b19) ^ b21) ^ b24);
        bArr[15] = (byte) (((((i14 ^ b14) ^ b15) ^ b18) ^ b20) ^ b25);
    }

    public static void FE(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        SL2(bArr);
        A(bArr);
    }

    public static void FO(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        SL1(bArr);
        A(bArr);
    }

    public static byte SB1(byte b10) {
        return f88299c[b10 & 255];
    }

    public static byte SB2(byte b10) {
        return f88300d[b10 & 255];
    }

    public static byte SB3(byte b10) {
        return f88301e[b10 & 255];
    }

    public static byte SB4(byte b10) {
        return f88302f[b10 & 255];
    }

    public static void SL1(byte[] bArr) {
        bArr[0] = SB1(bArr[0]);
        bArr[1] = SB2(bArr[1]);
        bArr[2] = SB3(bArr[2]);
        bArr[3] = SB4(bArr[3]);
        bArr[4] = SB1(bArr[4]);
        bArr[5] = SB2(bArr[5]);
        bArr[6] = SB3(bArr[6]);
        bArr[7] = SB4(bArr[7]);
        bArr[8] = SB1(bArr[8]);
        bArr[9] = SB2(bArr[9]);
        bArr[10] = SB3(bArr[10]);
        bArr[11] = SB4(bArr[11]);
        bArr[12] = SB1(bArr[12]);
        bArr[13] = SB2(bArr[13]);
        bArr[14] = SB3(bArr[14]);
        bArr[15] = SB4(bArr[15]);
    }

    public static void SL2(byte[] bArr) {
        bArr[0] = SB3(bArr[0]);
        bArr[1] = SB4(bArr[1]);
        bArr[2] = SB1(bArr[2]);
        bArr[3] = SB2(bArr[3]);
        bArr[4] = SB3(bArr[4]);
        bArr[5] = SB4(bArr[5]);
        bArr[6] = SB1(bArr[6]);
        bArr[7] = SB2(bArr[7]);
        bArr[8] = SB3(bArr[8]);
        bArr[9] = SB4(bArr[9]);
        bArr[10] = SB1(bArr[10]);
        bArr[11] = SB2(bArr[11]);
        bArr[12] = SB3(bArr[12]);
        bArr[13] = SB4(bArr[13]);
        bArr[14] = SB1(bArr[14]);
        bArr[15] = SB2(bArr[15]);
    }

    public static byte[][] keySchedule(boolean z10, byte[] bArr) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i10 = length >>> 3;
        int i11 = i10 - 2;
        byte[][] bArr2 = f88298b;
        byte[] bArr3 = bArr2[i11];
        byte[] bArr4 = bArr2[(i10 - 1) % 3];
        byte[] bArr5 = bArr2[i10 % 3];
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = new byte[16];
        System.arraycopy(bArr, 0, bArr6, 0, 16);
        System.arraycopy(bArr, 16, bArr7, 0, length - 16);
        byte[] bArr8 = new byte[16];
        byte[] bArr9 = new byte[16];
        byte[] bArr10 = new byte[16];
        byte[] bArr11 = new byte[16];
        System.arraycopy(bArr6, 0, bArr8, 0, 16);
        System.arraycopy(bArr8, 0, bArr9, 0, 16);
        FO(bArr9, bArr3);
        xor(bArr9, bArr7);
        System.arraycopy(bArr9, 0, bArr10, 0, 16);
        FE(bArr10, bArr4);
        xor(bArr10, bArr8);
        System.arraycopy(bArr10, 0, bArr11, 0, 16);
        FO(bArr11, bArr5);
        xor(bArr11, bArr9);
        int i12 = i11 * 2;
        int i13 = i12 + 12;
        byte[][] bArr12 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12 + 13, 16);
        keyScheduleRound(bArr12[0], bArr8, bArr9, 19);
        keyScheduleRound(bArr12[1], bArr9, bArr10, 19);
        keyScheduleRound(bArr12[2], bArr10, bArr11, 19);
        keyScheduleRound(bArr12[3], bArr11, bArr8, 19);
        keyScheduleRound(bArr12[4], bArr8, bArr9, 31);
        keyScheduleRound(bArr12[5], bArr9, bArr10, 31);
        keyScheduleRound(bArr12[6], bArr10, bArr11, 31);
        keyScheduleRound(bArr12[7], bArr11, bArr8, 31);
        keyScheduleRound(bArr12[8], bArr8, bArr9, 67);
        keyScheduleRound(bArr12[9], bArr9, bArr10, 67);
        keyScheduleRound(bArr12[10], bArr10, bArr11, 67);
        keyScheduleRound(bArr12[11], bArr11, bArr8, 67);
        keyScheduleRound(bArr12[12], bArr8, bArr9, 97);
        if (i13 > 12) {
            keyScheduleRound(bArr12[13], bArr9, bArr10, 97);
            keyScheduleRound(bArr12[14], bArr10, bArr11, 97);
            if (i13 > 14) {
                keyScheduleRound(bArr12[15], bArr11, bArr8, 97);
                keyScheduleRound(bArr12[16], bArr8, bArr9, 109);
            }
        }
        if (!z10) {
            reverseKeys(bArr12);
            for (int i14 = 1; i14 < i13; i14++) {
                A(bArr12[i14]);
            }
        }
        return bArr12;
    }

    public static void keyScheduleRound(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        int i13 = 8 - i12;
        int i14 = bArr3[15 - i11] & 255;
        int i15 = 0;
        while (i15 < 16) {
            int i16 = bArr3[(i15 - i11) & 15] & 255;
            bArr[i15] = (byte) (((i14 << i13) | (i16 >>> i12)) ^ (bArr2[i15] & 255));
            i15++;
            i14 = i16;
        }
    }

    public static void reverseKeys(byte[][] bArr) {
        int length = bArr.length;
        int i10 = length / 2;
        int i11 = length - 1;
        for (int i12 = 0; i12 < i10; i12++) {
            byte[] bArr2 = bArr[i12];
            int i13 = i11 - i12;
            bArr[i12] = bArr[i13];
            bArr[i13] = bArr2;
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "ARIA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to ARIA init - "));
        }
        this.f88303a = keySchedule(z10, ((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        if (this.f88303a == null) {
            throw new IllegalStateException("ARIA engine not initialised");
        }
        if (i10 > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, i10, bArr3, 0, 16);
        int length = this.f88303a.length - 3;
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 + 1;
            FO(bArr3, this.f88303a[i12]);
            i12 += 2;
            FE(bArr3, this.f88303a[i13]);
        }
        FO(bArr3, this.f88303a[i12]);
        xor(bArr3, this.f88303a[i12 + 1]);
        SL2(bArr3);
        xor(bArr3, this.f88303a[i12 + 2]);
        System.arraycopy(bArr3, 0, bArr2, i11, 16);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
