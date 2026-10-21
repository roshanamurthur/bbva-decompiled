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

/* JADX INFO: loaded from: classes3.dex */
public class CamelliaLightEngine implements BlockCipher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f88339g = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f88340h = {Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -126, 44, -20, -77, 39, Constants.CVR_B2b87_11_RFU, -27, -28, -123, 87, 53, -22, 12, -82, 65, 35, ByteSourceJsonBootstrapper.UTF8_BOM_1, 107, -109, 69, 25, -91, 33, -19, Constants.CVR_B1b41_1110_ONLINE_PIN, 79, 78, 29, 101, -110, -67, -122, -72, -81, -113, 124, -21, 31, -50, 62, 48, -36, Constants.STATE_ERROR, 94, -59, 11, MessageUtils.MESSAGE_26_SUB, -90, -31, 57, -54, -43, 71, 93, Base64.padSymbol, -39, 1, 90, -42, 81, 86, 108, 77, -117, 13, -102, 102, -5, -52, UtilitiesSDKConstants.SRP_LABEL_ENC, 45, 116, MessageUtils.MESSAGE_18_DC2, 43, 32, Constants.CVR_B2b8765_1111_APP_DISABLED, -79, -124, -103, -33, 76, -53, -62, 52, 126, 118, 5, 109, -73, -87, 49, -47, 23, 4, -41, 20, 88, 58, Constants.DIRECTORY_ENTRY, -34, 27, 17, 28, 50, 15, -100, 22, 83, 24, -14, 34, -2, 68, Constants.CVR_B2b65_CLEAR_BITS, UtilitiesSDKConstants.SRP_LABEL_MAC, -61, -75, 122, -111, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 8, -24, -88, Constants.CVR_B1b85_0110_TERMINAL, -4, 105, Constants.CVR_B1b85_0101_MOBILE_APP, -86, -48, -96, 125, -95, -119, 98, -105, 84, 91, MessageUtils.MESSAGE_30_RS, -107, -32, -1, 100, -46, 16, -60, 0, 72, -93, -9, 117, -37, -118, 3, -26, -38, 9, 63, -35, -108, -121, 92, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 2, -51, 74, -112, 51, 115, 103, -10, -13, -99, 127, ByteSourceJsonBootstrapper.UTF8_BOM_3, -30, 82, -101, -40, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -56, 55, -58, 59, KSUtils.PLAIN_BUFFER, -106, Constants.FCI_TEMPLATE, 75, 19, -66, 99, 46, -23, 121, -89, -116, -97, 110, -68, ComputeCcCommandApdu.EXPECTED_P1, 41, -11, -7, -74, 47, -3, -76, 89, 120, -104, 6, GenerateAcResponseApdu.DDA_HEADER, -25, 70, 113, -70, -44, 37, -85, 66, -120, -94, -115, -6, 114, 7, -71, 85, -8, -18, -84, 10, 54, 73, 42, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, -55, 67, -63, MessageUtils.MESSAGE_21_NAK, -29, -83, -12, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -57, -128, -98};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f88343c = new int[96];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f88344d = new int[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f88345e = new int[12];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f88346f = new int[4];

    public static int a(int i10, byte[] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            i11 = (i11 << 8) + (bArr[i12 + i10] & 255);
        }
        return i11;
    }

    public static void b(int i10, int[] iArr, int[] iArr2) {
        int i11 = iArr[0] ^ iArr2[i10];
        int iL = l(i11 & 255) | (k((i11 >>> 8) & 255) << 8) | (j((i11 >>> 16) & 255) << 16);
        byte[] bArr = f88340h;
        int i12 = ((bArr[(i11 >>> 24) & 255] & 255) << 24) | iL;
        int i13 = iArr[1] ^ iArr2[i10 + 1];
        int iG = g((j((i13 >>> 24) & 255) << 24) | (bArr[i13 & 255] & 255) | (l((i13 >>> 8) & 255) << 8) | (k((i13 >>> 16) & 255) << 16), 8);
        int i14 = i12 ^ iG;
        int iG2 = g(iG, 8) ^ i14;
        int i15 = ((i14 >>> 8) + (i14 << 24)) ^ iG2;
        iArr[2] = (g(iG2, 16) ^ i15) ^ iArr[2];
        iArr[3] = g(i15, 8) ^ iArr[3];
        int i16 = iArr[2] ^ iArr2[i10 + 2];
        int iL2 = ((bArr[(i16 >>> 24) & 255] & 255) << 24) | l(i16 & 255) | (k((i16 >>> 8) & 255) << 8) | (j((i16 >>> 16) & 255) << 16);
        int i17 = iArr2[i10 + 3] ^ iArr[3];
        int iG3 = g((j((i17 >>> 24) & 255) << 24) | (bArr[i17 & 255] & 255) | (l((i17 >>> 8) & 255) << 8) | (k((i17 >>> 16) & 255) << 16), 8);
        int i18 = iL2 ^ iG3;
        int iG4 = g(iG3, 8) ^ i18;
        int i19 = ((i18 >>> 8) + (i18 << 24)) ^ iG4;
        iArr[0] = (g(iG4, 16) ^ i19) ^ iArr[0];
        iArr[1] = iArr[1] ^ g(i19, 8);
    }

    public static void c(int i10, int[] iArr, int[] iArr2) {
        int iG = iArr[1] ^ g(iArr[0] & iArr2[i10], 1);
        iArr[1] = iG;
        iArr[0] = (iG | iArr2[i10 + 1]) ^ iArr[0];
        int i11 = iArr[2];
        int i12 = iArr2[i10 + 3];
        int i13 = iArr[3];
        int i14 = i11 ^ (i12 | i13);
        iArr[2] = i14;
        iArr[3] = g(iArr2[i10 + 2] & i14, 1) ^ i13;
    }

    public static void d(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = i12 + 2;
        int i14 = i11 + 1;
        int i15 = 32 - i10;
        iArr2[i13] = (iArr[i11] << i10) | (iArr[i14] >>> i15);
        int i16 = i12 + 3;
        int i17 = i11 + 2;
        iArr2[i16] = (iArr[i14] << i10) | (iArr[i17] >>> i15);
        int i18 = i11 + 3;
        iArr2[i12] = (iArr[i17] << i10) | (iArr[i18] >>> i15);
        int i19 = i12 + 1;
        iArr2[i19] = (iArr[i18] << i10) | (iArr[i11] >>> i15);
        iArr[i11] = iArr2[i13];
        iArr[i14] = iArr2[i16];
        iArr[i17] = iArr2[i12];
        iArr[i18] = iArr2[i19];
    }

    public static void e(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = i12 + 2;
        int i14 = i11 + 1;
        int i15 = i10 - 32;
        int i16 = i11 + 2;
        int i17 = 64 - i10;
        iArr2[i13] = (iArr[i14] << i15) | (iArr[i16] >>> i17);
        int i18 = i12 + 3;
        int i19 = i11 + 3;
        iArr2[i18] = (iArr[i16] << i15) | (iArr[i19] >>> i17);
        iArr2[i12] = (iArr[i19] << i15) | (iArr[i11] >>> i17);
        int i20 = i12 + 1;
        iArr2[i20] = (iArr[i14] >>> i17) | (iArr[i11] << i15);
        iArr[i11] = iArr2[i13];
        iArr[i14] = iArr2[i18];
        iArr[i16] = iArr2[i12];
        iArr[i19] = iArr2[i20];
    }

    public static void f(int i10, int i11, byte[] bArr) {
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[(3 - i12) + i11] = (byte) i10;
            i10 >>>= 8;
        }
    }

    public static int g(int i10, int i11) {
        return (i10 << i11) + (i10 >>> (32 - i11));
    }

    public static void h(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = i11 + 1;
        int i14 = 32 - i10;
        iArr2[i12] = (iArr[i11] << i10) | (iArr[i13] >>> i14);
        int i15 = i12 + 1;
        int i16 = i11 + 2;
        iArr2[i15] = (iArr[i13] << i10) | (iArr[i16] >>> i14);
        int i17 = i12 + 2;
        int i18 = i11 + 3;
        iArr2[i17] = (iArr[i16] << i10) | (iArr[i18] >>> i14);
        int i19 = i12 + 3;
        iArr2[i19] = (iArr[i18] << i10) | (iArr[i11] >>> i14);
        iArr[i11] = iArr2[i12];
        iArr[i13] = iArr2[i15];
        iArr[i16] = iArr2[i17];
        iArr[i18] = iArr2[i19];
    }

    public static void i(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = i11 + 1;
        int i14 = i10 - 32;
        int i15 = i11 + 2;
        int i16 = 64 - i10;
        iArr2[i12] = (iArr[i13] << i14) | (iArr[i15] >>> i16);
        int i17 = i12 + 1;
        int i18 = i11 + 3;
        iArr2[i17] = (iArr[i15] << i14) | (iArr[i18] >>> i16);
        int i19 = i12 + 2;
        iArr2[i19] = (iArr[i18] << i14) | (iArr[i11] >>> i16);
        int i20 = i12 + 3;
        iArr2[i20] = (iArr[i13] >>> i16) | (iArr[i11] << i14);
        iArr[i11] = iArr2[i12];
        iArr[i13] = iArr2[i17];
        iArr[i15] = iArr2[i19];
        iArr[i18] = iArr2[i20];
    }

    public static int j(int i10) {
        byte b10 = f88340h[i10];
        return ((byte) (((b10 & 255) >>> 7) | (b10 << 1))) & 255;
    }

    public static int k(int i10) {
        byte b10 = f88340h[i10];
        return ((byte) (((b10 & 255) >>> 1) | (b10 << 7))) & 255;
    }

    public static int l(int i10) {
        byte b10 = (byte) i10;
        return f88340h[((byte) (((b10 & 255) >>> 7) | (b10 << 1))) & 255] & 255;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Camellia";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        int length = key.length;
        if (length != 16) {
            if (length == 24) {
                iArr[0] = a(0, key);
                iArr[1] = a(4, key);
                iArr[2] = a(8, key);
                iArr[3] = a(12, key);
                iArr[4] = a(16, key);
                int iA = a(20, key);
                iArr[5] = iA;
                iArr[6] = ~iArr[4];
                iArr[7] = ~iA;
            } else {
                if (length != 32) {
                    throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
                }
                iArr[0] = a(0, key);
                iArr[1] = a(4, key);
                iArr[2] = a(8, key);
                iArr[3] = a(12, key);
                iArr[4] = a(16, key);
                iArr[5] = a(20, key);
                iArr[6] = a(24, key);
                iArr[7] = a(28, key);
            }
            this.f88342b = false;
        } else {
            this.f88342b = true;
            iArr[0] = a(0, key);
            iArr[1] = a(4, key);
            iArr[2] = a(8, key);
            iArr[3] = a(12, key);
            iArr[7] = 0;
            iArr[6] = 0;
            iArr[5] = 0;
            iArr[4] = 0;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            iArr2[i10] = iArr[i10] ^ iArr[i10 + 4];
        }
        int[] iArr5 = f88339g;
        b(0, iArr2, iArr5);
        for (int i11 = 0; i11 < 4; i11++) {
            iArr2[i11] = iArr2[i11] ^ iArr[i11];
        }
        b(4, iArr2, iArr5);
        boolean z11 = this.f88342b;
        int[] iArr6 = this.f88344d;
        int[] iArr7 = this.f88345e;
        int[] iArr8 = this.f88343c;
        if (!z11) {
            for (int i12 = 0; i12 < 4; i12++) {
                iArr3[i12] = iArr2[i12] ^ iArr[i12 + 4];
            }
            b(8, iArr3, iArr5);
            if (z10) {
                iArr6[0] = iArr[0];
                iArr6[1] = iArr[1];
                iArr6[2] = iArr[2];
                iArr6[3] = iArr[3];
                i(45, iArr, 0, iArr8, 16);
                h(15, iArr, 0, iArr7, 4);
                h(17, iArr, 0, iArr8, 32);
                i(34, iArr, 0, iArr8, 44);
                h(15, iArr, 4, iArr8, 4);
                h(15, iArr, 4, iArr7, 0);
                h(30, iArr, 4, iArr8, 24);
                i(34, iArr, 4, iArr8, 36);
                h(15, iArr2, 0, iArr8, 8);
                h(30, iArr2, 0, iArr8, 20);
                iArr7[8] = iArr2[1];
                iArr7[9] = iArr2[2];
                iArr7[10] = iArr2[3];
                iArr7[11] = iArr2[0];
                i(49, iArr2, 0, iArr8, 40);
                iArr8[0] = iArr3[0];
                iArr8[1] = iArr3[1];
                iArr8[2] = iArr3[2];
                iArr8[3] = iArr3[3];
                h(30, iArr3, 0, iArr8, 12);
                h(30, iArr3, 0, iArr8, 28);
                i(51, iArr3, 0, iArr6, 4);
            } else {
                iArr6[4] = iArr[0];
                iArr6[5] = iArr[1];
                iArr6[6] = iArr[2];
                iArr6[7] = iArr[3];
                e(45, iArr, 0, iArr8, 28);
                d(15, iArr, 0, iArr7, 4);
                d(17, iArr, 0, iArr8, 12);
                e(34, iArr, 0, iArr8, 0);
                d(15, iArr, 4, iArr8, 40);
                d(15, iArr, 4, iArr7, 8);
                d(30, iArr, 4, iArr8, 20);
                e(34, iArr, 4, iArr8, 8);
                d(15, iArr2, 0, iArr8, 36);
                d(30, iArr2, 0, iArr8, 24);
                iArr7[2] = iArr2[1];
                iArr7[3] = iArr2[2];
                iArr7[0] = iArr2[3];
                iArr7[1] = iArr2[0];
                e(49, iArr2, 0, iArr8, 4);
                iArr8[46] = iArr3[0];
                iArr8[47] = iArr3[1];
                iArr8[44] = iArr3[2];
                iArr8[45] = iArr3[3];
                d(30, iArr3, 0, iArr8, 32);
                d(30, iArr3, 0, iArr8, 16);
                i(51, iArr3, 0, iArr6, 0);
            }
        } else if (z10) {
            iArr6[0] = iArr[0];
            iArr6[1] = iArr[1];
            iArr6[2] = iArr[2];
            iArr6[3] = iArr[3];
            h(15, iArr, 0, iArr8, 4);
            h(30, iArr, 0, iArr8, 12);
            h(15, iArr, 0, iArr4, 0);
            iArr8[18] = iArr4[2];
            iArr8[19] = iArr4[3];
            h(17, iArr, 0, iArr7, 4);
            h(17, iArr, 0, iArr8, 24);
            h(17, iArr, 0, iArr8, 32);
            iArr8[0] = iArr2[0];
            iArr8[1] = iArr2[1];
            iArr8[2] = iArr2[2];
            iArr8[3] = iArr2[3];
            h(15, iArr2, 0, iArr8, 8);
            h(15, iArr2, 0, iArr7, 0);
            h(15, iArr2, 0, iArr4, 0);
            iArr8[16] = iArr4[0];
            iArr8[17] = iArr4[1];
            h(15, iArr2, 0, iArr8, 20);
            i(34, iArr2, 0, iArr8, 28);
            h(17, iArr2, 0, iArr6, 4);
        } else {
            iArr6[4] = iArr[0];
            iArr6[5] = iArr[1];
            iArr6[6] = iArr[2];
            iArr6[7] = iArr[3];
            d(15, iArr, 0, iArr8, 28);
            d(30, iArr, 0, iArr8, 20);
            d(15, iArr, 0, iArr4, 0);
            iArr8[16] = iArr4[0];
            iArr8[17] = iArr4[1];
            d(17, iArr, 0, iArr7, 0);
            d(17, iArr, 0, iArr8, 8);
            d(17, iArr, 0, iArr8, 0);
            iArr8[34] = iArr2[0];
            iArr8[35] = iArr2[1];
            iArr8[32] = iArr2[2];
            iArr8[33] = iArr2[3];
            d(15, iArr2, 0, iArr8, 24);
            d(15, iArr2, 0, iArr7, 4);
            d(15, iArr2, 0, iArr4, 0);
            iArr8[18] = iArr4[2];
            iArr8[19] = iArr4[3];
            d(15, iArr2, 0, iArr8, 12);
            e(34, iArr2, 0, iArr8, 4);
            h(17, iArr2, 0, iArr6, 0);
        }
        this.f88341a = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException {
        if (!this.f88341a) {
            throw new IllegalStateException("Camellia is not initialized");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z10 = this.f88342b;
        int[] iArr = this.f88345e;
        int[] iArr2 = this.f88343c;
        int[] iArr3 = this.f88346f;
        int[] iArr4 = this.f88344d;
        if (z10) {
            for (int i12 = 0; i12 < 4; i12++) {
                int iA = a((i12 * 4) + i10, bArr);
                iArr3[i12] = iA;
                iArr3[i12] = iA ^ iArr4[i12];
            }
            b(0, iArr3, iArr2);
            b(4, iArr3, iArr2);
            b(8, iArr3, iArr2);
            c(0, iArr3, iArr);
            b(12, iArr3, iArr2);
            b(16, iArr3, iArr2);
            b(20, iArr3, iArr2);
            c(4, iArr3, iArr);
            b(24, iArr3, iArr2);
            b(28, iArr3, iArr2);
            b(32, iArr3, iArr2);
            int i13 = iArr3[2] ^ iArr4[4];
            iArr3[2] = i13;
            iArr3[3] = iArr3[3] ^ iArr4[5];
            iArr3[0] = iArr3[0] ^ iArr4[6];
            iArr3[1] = iArr3[1] ^ iArr4[7];
            f(i13, i11, bArr2);
            f(iArr3[3], i11 + 4, bArr2);
            f(iArr3[0], i11 + 8, bArr2);
            f(iArr3[1], i11 + 12, bArr2);
            return 16;
        }
        for (int i14 = 0; i14 < 4; i14++) {
            int iA2 = a((i14 * 4) + i10, bArr);
            iArr3[i14] = iA2;
            iArr3[i14] = iA2 ^ iArr4[i14];
        }
        b(0, iArr3, iArr2);
        b(4, iArr3, iArr2);
        b(8, iArr3, iArr2);
        c(0, iArr3, iArr);
        b(12, iArr3, iArr2);
        b(16, iArr3, iArr2);
        b(20, iArr3, iArr2);
        c(4, iArr3, iArr);
        b(24, iArr3, iArr2);
        b(28, iArr3, iArr2);
        b(32, iArr3, iArr2);
        c(8, iArr3, iArr);
        b(36, iArr3, iArr2);
        b(40, iArr3, iArr2);
        b(44, iArr3, iArr2);
        int i15 = iArr3[2] ^ iArr4[4];
        iArr3[2] = i15;
        iArr3[3] = iArr3[3] ^ iArr4[5];
        iArr3[0] = iArr3[0] ^ iArr4[6];
        iArr3[1] = iArr3[1] ^ iArr4[7];
        f(i15, i11, bArr2);
        f(iArr3[3], i11 + 4, bArr2);
        f(iArr3[0], i11 + 8, bArr2);
        f(iArr3[1], i11 + 12, bArr2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
