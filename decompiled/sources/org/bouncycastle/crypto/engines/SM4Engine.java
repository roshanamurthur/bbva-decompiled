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
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SM4Engine implements BlockCipher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f88590c = {-42, -112, -23, -2, -52, -31, Base64.padSymbol, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 73, -122, 6, -103, -100, 66, Constants.CVR_B1b85_0101_MOBILE_APP, -12, -111, ByteSourceJsonBootstrapper.UTF8_BOM_1, -104, 122, 51, 84, 11, 67, -19, Constants.CVR_B2b65_CLEAR_BITS, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, -128, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 89, 60, 25, -26, -123, 79, -88, 104, 107, KSUtils.PLAIN_BUFFER, UtilitiesSDKConstants.SRP_LABEL_MAC, 113, 100, -38, -117, -8, -21, 15, 75, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 86, -99, 53, MessageUtils.MESSAGE_30_RS, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, Constants.CVR_B1b41_1110_ONLINE_PIN, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, ByteSourceJsonBootstrapper.UTF8_BOM_3, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, Constants.DIRECTORY_ENTRY, MessageUtils.MESSAGE_21_NAK, -95, -32, -82, 93, -92, -101, 52, MessageUtils.MESSAGE_26_SUB, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, Constants.CVR_B1b85_0110_TERMINAL, Constants.CVR_B2b87_11_RFU, 41, 35, -85, 13, 83, 78, Constants.FCI_TEMPLATE, -43, -37, 55, 69, -34, -3, ComputeCcCommandApdu.EXPECTED_P1, 47, 3, -1, GenerateAcResponseApdu.DDA_HEADER, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, 127, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, MessageUtils.MESSAGE_18_DC2, -72, -27, -76, UtilitiesSDKConstants.SRP_LABEL_ENC, -119, 105, -105, 74, 12, -106, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, Constants.CVR_B2b8765_1111_APP_DISABLED, 125, -20, 58, -36, 77, 32, 121, -18, Constants.STATE_ERROR, 62, -41, -53, 57, 72};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f88591d = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f88592e = {-1548633402, 1453994832, 1736282519, -1301273892};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f88593a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f88594b;

    public static int a(int i10) {
        int iD = d(i10);
        return c(iD, 24) ^ (((c(iD, 2) ^ iD) ^ c(iD, 10)) ^ c(iD, 18));
    }

    public static int b(int i10) {
        int iD = d(i10);
        return c(iD, 23) ^ (c(iD, 13) ^ iD);
    }

    public static int c(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public static int d(int i10) {
        byte[] bArr = f88590c;
        return (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 24) & 255] & 255) << 24) | ((bArr[(i10 >> 16) & 255] & 255) << 16) | ((bArr[(i10 >> 8) & 255] & 255) << 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to SM4 init - "));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        int[] iArr = new int[32];
        int[] iArr2 = {Pack.bigEndianToInt(key, 0), Pack.bigEndianToInt(key, 4), Pack.bigEndianToInt(key, 8), Pack.bigEndianToInt(key, 12)};
        int i10 = iArr2[0];
        int[] iArr3 = f88592e;
        int[] iArr4 = {i10 ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        int[] iArr5 = f88591d;
        if (z10) {
            int iB = iArr4[0] ^ b(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ iArr5[0]);
            iArr[0] = iB;
            int iB2 = b((iB ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = iB2;
            int iB3 = b((iB2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = iB3;
            iArr[3] = b((iB3 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i11 = 4; i11 < 32; i11++) {
                iArr[i11] = iArr[i11 - 4] ^ b(((iArr[i11 - 3] ^ iArr[i11 - 2]) ^ iArr[i11 - 1]) ^ iArr5[i11]);
            }
        } else {
            int iB4 = iArr4[0] ^ b(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ iArr5[0]);
            iArr[31] = iB4;
            int iB5 = b((iB4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[30] = iB5;
            int iB6 = b((iB5 ^ (iArr4[3] ^ iArr[31])) ^ iArr5[2]) ^ iArr4[2];
            iArr[29] = iB6;
            iArr[28] = b((iB6 ^ (iArr[31] ^ iArr[30])) ^ iArr5[3]) ^ iArr4[3];
            for (int i12 = 27; i12 >= 0; i12--) {
                iArr[i12] = iArr[i12 + 4] ^ b(((iArr[i12 + 3] ^ iArr[i12 + 2]) ^ iArr[i12 + 1]) ^ iArr5[31 - i12]);
            }
        }
        this.f88594b = iArr;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        if (this.f88594b == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i10);
        int[] iArr = this.f88593a;
        iArr[0] = iBigEndianToInt;
        iArr[1] = Pack.bigEndianToInt(bArr, i10 + 4);
        iArr[2] = Pack.bigEndianToInt(bArr, i10 + 8);
        iArr[3] = Pack.bigEndianToInt(bArr, i10 + 12);
        for (int i12 = 0; i12 < 32; i12 += 4) {
            int iA = a(this.f88594b[i12] ^ ((iArr[1] ^ iArr[2]) ^ iArr[3])) ^ iArr[0];
            iArr[0] = iA;
            int iA2 = a((iA ^ (iArr[2] ^ iArr[3])) ^ this.f88594b[i12 + 1]) ^ iArr[1];
            iArr[1] = iA2;
            int iA3 = a((iA2 ^ (iArr[3] ^ iArr[0])) ^ this.f88594b[i12 + 2]) ^ iArr[2];
            iArr[2] = iA3;
            iArr[3] = a((iA3 ^ (iArr[0] ^ iArr[1])) ^ this.f88594b[i12 + 3]) ^ iArr[3];
        }
        Pack.intToBigEndian(iArr[3], bArr2, i11);
        Pack.intToBigEndian(iArr[2], bArr2, i11 + 4);
        Pack.intToBigEndian(iArr[1], bArr2, i11 + 8);
        Pack.intToBigEndian(iArr[0], bArr2, i11 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
