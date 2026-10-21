package org.bouncycastle.crypto.digests;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HarakaBase implements Digest {
    protected static final int DIGEST_SIZE = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[][] f88071a = {new byte[]{99, 124, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 123, -14, 107, Constants.FCI_TEMPLATE, -59, 48, 1, 103, 43, -2, -41, -85, 118}, new byte[]{-54, -126, -55, 125, -6, 89, 71, Constants.CVR_B2b8765_1111_APP_DISABLED, -83, -44, -94, -81, -100, -92, 114, Constants.CVR_B2b87_11_RFU}, new byte[]{-73, -3, -109, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, MessageUtils.MESSAGE_21_NAK}, new byte[]{4, -57, 35, -61, 24, -106, 5, -102, 7, MessageUtils.MESSAGE_18_DC2, -128, -30, -21, 39, UtilitiesSDKConstants.SRP_LABEL_MAC, 117}, new byte[]{9, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 44, MessageUtils.MESSAGE_26_SUB, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124}, new byte[]{83, -47, 0, -19, 32, -4, -79, 91, GenerateAcResponseApdu.DDA_HEADER, -53, -66, 57, 74, 76, 88, Constants.CVR_B2b65_CLEAR_BITS}, new byte[]{-48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, Constants.CVR_B1b85_0101_MOBILE_APP, 60, -97, -88}, new byte[]{81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46}, new byte[]{-51, 12, 19, -20, Constants.STATE_ERROR, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115}, new byte[]{Constants.CVR_B1b85_0110_TERMINAL, KSUtils.PLAIN_BUFFER, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37}, new byte[]{-32, 50, 58, 10, 73, 6, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 92, -62, -45, -84, 98, -111, -107, -28, 121}, new byte[]{-25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8}, new byte[]{-70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118}, new byte[]{Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 62, -75, 102, 72, 3, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.DIRECTORY_ENTRY, 53, 87, -71, -122, -63, 29, -98}, new byte[]{-31, -8, -104, 17, 105, -39, ComputeCcCommandApdu.EXPECTED_P1, -108, -101, MessageUtils.MESSAGE_30_RS, -121, -23, -50, 85, 40, -33}, new byte[]{-116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, 45, 15, UtilitiesSDKConstants.SRP_LABEL_ENC, 84, -69, 22}};

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        bArr3[0] = b(bArr[0]);
        bArr3[1] = b(bArr[1]);
        bArr3[2] = b(bArr[2]);
        bArr3[3] = b(bArr[3]);
        bArr3[4] = b(bArr[4]);
        bArr3[5] = b(bArr[5]);
        bArr3[6] = b(bArr[6]);
        bArr3[7] = b(bArr[7]);
        bArr3[8] = b(bArr[8]);
        bArr3[9] = b(bArr[9]);
        bArr3[10] = b(bArr[10]);
        bArr3[11] = b(bArr[11]);
        bArr3[12] = b(bArr[12]);
        bArr3[13] = b(bArr[13]);
        bArr3[14] = b(bArr[14]);
        byte b10 = b(bArr[15]);
        bArr3[15] = b10;
        byte[] bArr4 = {bArr3[0], bArr3[5], bArr3[10], b10, bArr3[4], bArr3[9], bArr3[14], bArr3[3], bArr3[8], bArr3[13], bArr3[2], bArr3[7], bArr3[12], bArr3[1], bArr3[6], bArr3[11]};
        byte[] bArr5 = new byte[16];
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 * 4;
            int i13 = i12 + 1;
            int i14 = i12 + 2;
            int i15 = i12 + 3;
            bArr5[i10] = (byte) ((((c(bArr4[i12]) ^ c(bArr4[i13])) ^ bArr4[i13]) ^ bArr4[i14]) ^ bArr4[i15]);
            bArr5[i10 + 1] = (byte) ((((bArr4[i12] ^ c(bArr4[i13])) ^ c(bArr4[i14])) ^ bArr4[i14]) ^ bArr4[i15]);
            int i16 = i10 + 3;
            bArr5[i10 + 2] = (byte) ((((bArr4[i12] ^ bArr4[i13]) ^ c(bArr4[i14])) ^ c(bArr4[i15])) ^ bArr4[i15]);
            i10 += 4;
            bArr5[i16] = (byte) ((((c(bArr4[i12]) ^ bArr4[i12]) ^ bArr4[i13]) ^ bArr4[i14]) ^ c(bArr4[i15]));
        }
        bArr5[0] = (byte) (bArr5[0] ^ bArr2[15]);
        bArr5[1] = (byte) (bArr5[1] ^ bArr2[14]);
        bArr5[2] = (byte) (bArr5[2] ^ bArr2[13]);
        bArr5[3] = (byte) (bArr5[3] ^ bArr2[12]);
        bArr5[4] = (byte) (bArr5[4] ^ bArr2[11]);
        bArr5[5] = (byte) (bArr5[5] ^ bArr2[10]);
        bArr5[6] = (byte) (bArr5[6] ^ bArr2[9]);
        bArr5[7] = (byte) (bArr5[7] ^ bArr2[8]);
        bArr5[8] = (byte) (bArr2[7] ^ bArr5[8]);
        bArr5[9] = (byte) (bArr2[6] ^ bArr5[9]);
        bArr5[10] = (byte) (bArr5[10] ^ bArr2[5]);
        bArr5[11] = (byte) (bArr2[4] ^ bArr5[11]);
        bArr5[12] = (byte) (bArr2[3] ^ bArr5[12]);
        bArr5[13] = (byte) (bArr5[13] ^ bArr2[2]);
        bArr5[14] = (byte) (bArr5[14] ^ bArr2[1]);
        bArr5[15] = (byte) (bArr5[15] ^ bArr2[0]);
        return bArr5;
    }

    public static byte b(byte b10) {
        return f88071a[(b10 & 255) >>> 4][b10 & 15];
    }

    public static byte c(byte b10) {
        int i10 = b10 >>> 7;
        int i11 = b10 << 1;
        if (i10 > 0) {
            i11 ^= 27;
        }
        return (byte) (i11 & 255);
    }

    public static byte[] d(int i10, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[16];
        int i11 = 0;
        while (i11 < 16) {
            bArr3[i11] = (byte) (bArr2[i10] ^ bArr[i11]);
            i11++;
            i10++;
        }
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }
}
