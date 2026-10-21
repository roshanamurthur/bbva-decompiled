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
import java.lang.reflect.Array;
import kotlin.io.encoding.Base64;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Haraka512Digest extends HarakaBase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[][] f88068d = {new byte[]{6, -124, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 76, -26, 32, Constants.CVR_B2b87_11_RFU, 10, UtilitiesSDKConstants.SRP_LABEL_MAC, -59, -2, Constants.CVR_B2b8765_1111_APP_DISABLED, 117, KSUtils.PLAIN_BUFFER, 123, -99}, new byte[]{-117, 102, -76, -31, -120, -13, -96, 107, 100, 15, 107, -92, 47, 8, -9, 23}, new byte[]{52, 2, -34, 45, 83, -14, -124, -104, Constants.CVR_B2b65_CLEAR_BITS, 2, -99, Constants.CVR_B1b85_0110_TERMINAL, -97, 2, -111, 20}, new byte[]{Constants.CVR_B1b41_1110_ONLINE_PIN, -42, -22, -26, 46, 123, 79, 8, -69, -13, -68, -81, -3, 91, 79, 121}, new byte[]{-53, Constants.CVR_B2b65_CLEAR_BITS, UtilitiesSDKConstants.SRP_LABEL_ENC, -53, 72, 114, 68, -117, 121, -18, -51, 28, -66, 57, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 68}, new byte[]{126, -22, -51, -18, 110, -112, 50, -73, -115, 83, 53, -19, 43, -118, 5, 123}, new byte[]{103, -62, -113, 67, 94, 46, 124, -48, -30, 65, 39, Constants.DIRECTORY_ENTRY, -38, 79, ByteSourceJsonBootstrapper.UTF8_BOM_1, 27}, new byte[]{41, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -39, UtilitiesSDKConstants.SRP_LABEL_ENC, -81, -54, -52, 7, 103, Constants.STATE_ERROR, -3, -30, 31, -57, 11, 59}, new byte[]{-85, 77, 99, -15, -26, -122, 127, -23, -20, -37, -113, -54, -71, -44, 101, -18}, new byte[]{28, 48, ByteSourceJsonBootstrapper.UTF8_BOM_3, -124, -44, -73, -51, 100, 91, 42, 64, 79, -83, 3, 126, 51}, new byte[]{UtilitiesSDKConstants.SRP_LABEL_MAC, -52, 11, -71, -108, 23, 35, ByteSourceJsonBootstrapper.UTF8_BOM_3, 105, 2, -117, 46, -115, -10, -104, 0}, new byte[]{-6, 4, 120, -90, -34, Constants.FCI_TEMPLATE, 85, 114, 74, -86, -98, -56, 92, -99, 45, -118}, new byte[]{-33, -76, -97, 43, 107, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 42, MessageUtils.MESSAGE_18_DC2, Constants.CVR_B1b41_1110_ONLINE_PIN, -6, 79, 46, 41, MessageUtils.MESSAGE_18_DC2, -97, -44}, new byte[]{MessageUtils.MESSAGE_30_RS, -95, 3, 68, -12, 73, -94, 54, 50, -42, 17, -82, -69, GenerateAcResponseApdu.DDA_HEADER, MessageUtils.MESSAGE_18_DC2, -18}, new byte[]{-81, 4, 73, -120, 75, 5, 0, -124, Constants.STATE_ERROR, -106, 0, -55, -100, -88, -20, -90}, new byte[]{33, 2, 94, -40, -99, 25, -100, 79, 120, -94, -57, -29, 39, -27, -109, -20}, new byte[]{ByteSourceJsonBootstrapper.UTF8_BOM_3, 58, -86, -8, -89, 89, -55, -73, -71, 40, 46, -51, -126, -44, 1, 115}, new byte[]{98, Constants.CVR_B1b85_0110_TERMINAL, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 13, Constants.DIRECTORY_ENTRY, -122, UtilitiesSDKConstants.SRP_LABEL_ENC, 23, 55, -14, ByteSourceJsonBootstrapper.UTF8_BOM_1, -39, 16, 48, 125, 107}, new byte[]{90, -54, 69, -62, 33, 48, 4, 67, KSUtils.PLAIN_BUFFER, -62, -111, 83, -10, -4, -102, -58}, new byte[]{-110, 35, -105, 60, 34, 107, 104, -69, 44, -81, -110, -24, 54, -47, -108, 58}, new byte[]{-45, ByteSourceJsonBootstrapper.UTF8_BOM_3, -110, 56, 34, 88, -122, -21, 108, -70, -71, 88, -27, 16, 113, -76}, new byte[]{-37, -122, 60, -27, -82, Constants.CVR_B2b8765_1111_APP_DISABLED, -58, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -109, Base64.padSymbol, -3, -35, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -31, MessageUtils.MESSAGE_18_DC2, -115}, new byte[]{-69, Constants.CVR_B1b85_0110_TERMINAL, 98, 104, -1, -21, -96, -100, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -28, -115, -29, -53, 34, MessageUtils.MESSAGE_18_DC2, -79}, new byte[]{115, 75, -45, -36, -30, -28, -47, -100, 45, -71, MessageUtils.MESSAGE_26_SUB, 78, -57, 43, -9, 125}, new byte[]{67, -69, 71, -61, Constants.DIRECTORY_ENTRY, 48, 27, 67, 75, 20, MessageUtils.MESSAGE_21_NAK, -60, 44, -77, -110, 78}, new byte[]{-37, -89, 117, -88, -25, 7, ByteSourceJsonBootstrapper.UTF8_BOM_1, -10, 3, UtilitiesSDKConstants.SRP_LABEL_MAC, 49, -35, 22, -21, 104, -103}, new byte[]{109, -13, Constants.DIRECTORY_ENTRY, 75, 60, 117, 89, Constants.RESP_MSG_TEMPLATE_FORMAT_2, ComputeCcCommandApdu.EXPECTED_P1, 94, 35, 2, 126, -54, 71, 44}, new byte[]{-51, -89, 90, 23, -42, -34, 125, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 109, 27, -27, -71, -72, -122, 23, -7}, new byte[]{-20, 107, 67, Constants.CVR_B2b8765_1111_APP_DISABLED, 107, -88, -23, -86, -99, 108, 6, -99, -87, 70, -18, 93}, new byte[]{-53, MessageUtils.MESSAGE_30_RS, 105, Constants.CVR_B1b85_0101_MOBILE_APP, -7, 87, 51, 43, -94, 83, 17, 89, 59, -13, 39, -63}, new byte[]{44, -18, 12, 117, 0, -38, Constants.DIRECTORY_ENTRY, -100, -28, -19, 3, 83, Constants.CVR_B1b85_0110_TERMINAL, Constants.CVR_B1b41_1110_ONLINE_PIN, -48, -39}, new byte[]{Constants.CVR_B2b8765_1111_APP_DISABLED, -79, -91, -95, -106, -23, 12, -85, -128, -69, -70, -68, 99, -92, -93, Constants.CVR_B1b85_0101_MOBILE_APP}, new byte[]{-82, Base64.padSymbol, -79, 2, 94, -106, 41, -120, -85, 13, -34, 48, -109, -115, -54, 57}, new byte[]{23, -69, -113, 56, -43, 84, -92, 11, -120, 20, -13, -88, 46, 117, -76, 66}, new byte[]{52, -69, -118, 91, Constants.STATE_ERROR, 66, 127, -41, -82, -74, -73, 121, 54, 10, 22, -10}, new byte[]{GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -10, 82, 65, -53, -27, 84, 56, 67, -50, 89, 24, -1, -70, -81, -34}, new byte[]{76, -23, -102, 84, -71, -13, 2, GenerateAcResponseApdu.DDA_HEADER, -94, -54, -100, -9, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -98, -55, 120}, new byte[]{-82, 81, -91, MessageUtils.MESSAGE_26_SUB, 27, -33, -9, -66, 64, Constants.CVR_B2b87_11_RFU, 110, 40, 34, -112, MessageUtils.MESSAGE_18_DC2, 53}, new byte[]{-96, -63, Constants.DIRECTORY_ENTRY, 60, -70, 126, -46, 43, -63, 115, -68, 15, 72, -90, 89, Constants.CVR_B2b65_CLEAR_BITS}, new byte[]{117, GenerateAcResponseApdu.DDA_HEADER, -52, 3, 2, 40, -126, -120, 74, -42, -67, -3, -23, -59, -99, -95}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88070c;

    public Haraka512Digest() {
        this.f88069b = new byte[64];
    }

    public static void e(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 12, bArr2[0], 0, 4);
        System.arraycopy(bArr[2], 12, bArr2[0], 4, 4);
        System.arraycopy(bArr[1], 12, bArr2[0], 8, 4);
        System.arraycopy(bArr[3], 12, bArr2[0], 12, 4);
        System.arraycopy(bArr[2], 0, bArr2[1], 0, 4);
        System.arraycopy(bArr[0], 0, bArr2[1], 4, 4);
        System.arraycopy(bArr[3], 0, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 0, bArr2[1], 12, 4);
        System.arraycopy(bArr[2], 4, bArr2[2], 0, 4);
        System.arraycopy(bArr[0], 4, bArr2[2], 4, 4);
        System.arraycopy(bArr[3], 4, bArr2[2], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[2], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[3], 0, 4);
        System.arraycopy(bArr[2], 8, bArr2[3], 4, 4);
        System.arraycopy(bArr[1], 8, bArr2[3], 8, 4);
        System.arraycopy(bArr[3], 8, bArr2[3], 12, 4);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        if (this.f88070c != 64) {
            throw new IllegalStateException("input must be exactly 64 bytes");
        }
        if (bArr.length - i10 < 32) {
            throw new IllegalArgumentException("output too short to receive digest");
        }
        Class cls = Byte.TYPE;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 16);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 16);
        byte[] bArr4 = bArr2[0];
        byte[] bArr5 = this.f88069b;
        System.arraycopy(bArr5, 0, bArr4, 0, 16);
        System.arraycopy(bArr5, 16, bArr2[1], 0, 16);
        System.arraycopy(bArr5, 32, bArr2[2], 0, 16);
        System.arraycopy(bArr5, 48, bArr2[3], 0, 16);
        byte[] bArr6 = bArr2[0];
        byte[][] bArr7 = f88068d;
        bArr2[0] = HarakaBase.a(bArr6, bArr7[0]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[1]);
        bArr2[2] = HarakaBase.a(bArr2[2], bArr7[2]);
        bArr2[3] = HarakaBase.a(bArr2[3], bArr7[3]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[4]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[5]);
        bArr2[2] = HarakaBase.a(bArr2[2], bArr7[6]);
        bArr2[3] = HarakaBase.a(bArr2[3], bArr7[7]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.a(bArr3[0], bArr7[8]);
        bArr2[1] = HarakaBase.a(bArr3[1], bArr7[9]);
        bArr2[2] = HarakaBase.a(bArr3[2], bArr7[10]);
        bArr2[3] = HarakaBase.a(bArr3[3], bArr7[11]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[12]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[13]);
        bArr2[2] = HarakaBase.a(bArr2[2], bArr7[14]);
        bArr2[3] = HarakaBase.a(bArr2[3], bArr7[15]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.a(bArr3[0], bArr7[16]);
        bArr2[1] = HarakaBase.a(bArr3[1], bArr7[17]);
        bArr2[2] = HarakaBase.a(bArr3[2], bArr7[18]);
        bArr2[3] = HarakaBase.a(bArr3[3], bArr7[19]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[20]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[21]);
        bArr2[2] = HarakaBase.a(bArr2[2], bArr7[22]);
        bArr2[3] = HarakaBase.a(bArr2[3], bArr7[23]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.a(bArr3[0], bArr7[24]);
        bArr2[1] = HarakaBase.a(bArr3[1], bArr7[25]);
        bArr2[2] = HarakaBase.a(bArr3[2], bArr7[26]);
        bArr2[3] = HarakaBase.a(bArr3[3], bArr7[27]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[28]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[29]);
        bArr2[2] = HarakaBase.a(bArr2[2], bArr7[30]);
        bArr2[3] = HarakaBase.a(bArr2[3], bArr7[31]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.a(bArr3[0], bArr7[32]);
        bArr2[1] = HarakaBase.a(bArr3[1], bArr7[33]);
        bArr2[2] = HarakaBase.a(bArr3[2], bArr7[34]);
        bArr2[3] = HarakaBase.a(bArr3[3], bArr7[35]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[36]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[37]);
        bArr2[2] = HarakaBase.a(bArr2[2], bArr7[38]);
        bArr2[3] = HarakaBase.a(bArr2[3], bArr7[39]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.d(0, bArr3[0], bArr5);
        bArr2[1] = HarakaBase.d(16, bArr3[1], bArr5);
        bArr2[2] = HarakaBase.d(32, bArr3[2], bArr5);
        bArr2[3] = HarakaBase.d(48, bArr3[3], bArr5);
        System.arraycopy(bArr2[0], 8, bArr, i10, 8);
        System.arraycopy(bArr2[1], 8, bArr, i10 + 8, 8);
        System.arraycopy(bArr2[2], 0, bArr, i10 + 16, 8);
        System.arraycopy(bArr2[3], 0, bArr, i10 + 24, 8);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Haraka-512";
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88070c = 0;
        Arrays.clear(this.f88069b);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f88070c;
        if (i10 + 1 > 64) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        this.f88070c = i10 + 1;
        this.f88069b[i10] = b10;
    }

    public Haraka512Digest(Haraka512Digest haraka512Digest) {
        this.f88069b = Arrays.clone(haraka512Digest.f88069b);
        this.f88070c = haraka512Digest.f88070c;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = this.f88070c;
        if (i12 + i11 > 64) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        System.arraycopy(bArr, i10, this.f88069b, i12, i11);
        this.f88070c += i11;
    }
}
