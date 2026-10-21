package org.bouncycastle.crypto.engines;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.esotericsoftware.asm.Opcodes;
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
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class AESLightEngine implements BlockCipher {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f88288h = {99, 124, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 123, -14, 107, Constants.FCI_TEMPLATE, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, Constants.CVR_B2b8765_1111_APP_DISABLED, -83, -44, -94, -81, -100, -92, 114, Constants.CVR_B2b87_11_RFU, -73, -3, -109, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, MessageUtils.MESSAGE_21_NAK, 4, -57, 35, -61, 24, -106, 5, -102, 7, MessageUtils.MESSAGE_18_DC2, -128, -30, -21, 39, UtilitiesSDKConstants.SRP_LABEL_MAC, 117, 9, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 44, MessageUtils.MESSAGE_26_SUB, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, GenerateAcResponseApdu.DDA_HEADER, -53, -66, 57, 74, 76, 88, Constants.CVR_B2b65_CLEAR_BITS, -48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, Constants.CVR_B1b85_0101_MOBILE_APP, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, Constants.STATE_ERROR, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, Constants.CVR_B1b85_0110_TERMINAL, KSUtils.PLAIN_BUFFER, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 62, -75, 102, 72, 3, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.DIRECTORY_ENTRY, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ComputeCcCommandApdu.EXPECTED_P1, -108, -101, MessageUtils.MESSAGE_30_RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, 45, 15, UtilitiesSDKConstants.SRP_LABEL_ENC, 84, -69, 22};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f88289i = {82, 9, GenerateAcResponseApdu.DDA_HEADER, -43, 48, 54, -91, 56, ByteSourceJsonBootstrapper.UTF8_BOM_3, 64, -93, -98, KSUtils.PLAIN_BUFFER, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, ComputeCcCommandApdu.EXPECTED_P1, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, UtilitiesSDKConstants.SRP_LABEL_MAC, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 72, Constants.CVR_B1b85_0101_MOBILE_APP, -3, -19, -71, -38, 94, MessageUtils.MESSAGE_21_NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, MessageUtils.MESSAGE_30_RS, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, Constants.CVR_B2b65_CLEAR_BITS, -50, Constants.CVR_B2b8765_1111_APP_DISABLED, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, MessageUtils.MESSAGE_26_SUB, 113, 29, 41, -59, -119, Constants.FCI_TEMPLATE, -73, 98, Constants.CVR_B1b41_1110_ONLINE_PIN, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, Constants.CVR_B2b87_11_RFU, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, MessageUtils.MESSAGE_18_DC2, 16, 89, 39, -128, -20, Constants.STATE_ERROR, Constants.CVR_B1b85_0110_TERMINAL, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, ByteSourceJsonBootstrapper.UTF8_BOM_1, -96, -32, 59, 77, -82, 42, -11, UtilitiesSDKConstants.SRP_LABEL_ENC, -56, -21, -69, 60, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 83, -103, Constants.DIRECTORY_ENTRY, 23, 43, 4, 126, -70, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -42, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -31, 105, 20, 99, 85, 33, 12, 125};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f88290j = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 179, 125, 250, 239, Opcodes.MULTIANEWARRAY, 145};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[][] f88292b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f88297g;

    public static int a(int i10) {
        int iD = d(i10, 8) ^ i10;
        int i11 = i10 ^ (((2139062143 & iD) << 1) ^ ((((-2139062144) & iD) >>> 7) * 27));
        int i12 = (-1061109568) & i11;
        int i13 = i12 ^ (i12 >>> 1);
        int i14 = iD ^ ((((1061109567 & i11) << 2) ^ (i13 >>> 2)) ^ (i13 >>> 5));
        return i11 ^ (i14 ^ d(i14, 16));
    }

    public static int b(int i10) {
        int iD = d(i10, 8);
        int i11 = i10 ^ iD;
        return ((((i11 & (-2139062144)) >>> 7) * 27) ^ ((2139062143 & i11) << 1)) ^ (iD ^ d(i11, 16));
    }

    public static int d(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public static int e(int i10) {
        byte[] bArr = f88288h;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 8) & 255] & 255) << 8) | ((bArr[(i10 >> 16) & 255] & 255) << 16);
    }

    public final void c(int i10, byte[] bArr) {
        int i11 = this.f88293c;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
        int i12 = this.f88294d;
        bArr[i10 + 4] = (byte) i12;
        bArr[i10 + 5] = (byte) (i12 >> 8);
        bArr[i10 + 6] = (byte) (i12 >> 16);
        bArr[i10 + 7] = (byte) (i12 >> 24);
        int i13 = this.f88295e;
        bArr[i10 + 8] = (byte) i13;
        bArr[i10 + 9] = (byte) (i13 >> 8);
        bArr[i10 + 10] = (byte) (i13 >> 16);
        bArr[i10 + 11] = (byte) (i13 >> 24);
        int i14 = this.f88296f;
        bArr[i10 + 12] = (byte) i14;
        bArr[i10 + 13] = (byte) (i14 >> 8);
        bArr[i10 + 14] = (byte) (i14 >> 16);
        bArr[i10 + 15] = (byte) (i14 >> 24);
    }

    public final void f(int i10, byte[] bArr) {
        this.f88293c = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16) | (bArr[i10 + 3] << 24);
        this.f88294d = ((bArr[i10 + 5] & 255) << 8) | (bArr[i10 + 4] & 255) | ((bArr[i10 + 6] & 255) << 16) | (bArr[i10 + 7] << 24);
        this.f88295e = ((bArr[i10 + 9] & 255) << 8) | (bArr[i10 + 8] & 255) | ((bArr[i10 + 10] & 255) << 16) | (bArr[i10 + 11] << 24);
        int i11 = ((bArr[i10 + 13] & 255) << 8) | (bArr[i10 + 12] & 255);
        this.f88296f = (bArr[i10 + 15] << 24) | i11 | ((bArr[i10 + 14] & 255) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to AES init - "));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i10 = length >> 2;
        this.f88291a = i10 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10 + 7, 4);
        if (i10 == 4) {
            int iLittleEndianToInt = Pack.littleEndianToInt(key, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(key, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(key, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(key, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i11 = 1; i11 <= 10; i11++) {
                iLittleEndianToInt ^= e(d(iLittleEndianToInt4, 8)) ^ f88290j[i11 - 1];
                int[] iArr2 = iArr[i11];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i10 == 6) {
            int iLittleEndianToInt5 = Pack.littleEndianToInt(key, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(key, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(key, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(key, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(key, 16);
            iArr[1][0] = iLittleEndianToInt9;
            int iLittleEndianToInt10 = Pack.littleEndianToInt(key, 20);
            iArr[1][1] = iLittleEndianToInt10;
            int iE = iLittleEndianToInt5 ^ (e(d(iLittleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iE;
            int i12 = iLittleEndianToInt6 ^ iE;
            iArr3[3] = i12;
            int i13 = iLittleEndianToInt7 ^ i12;
            int[] iArr4 = iArr[2];
            iArr4[0] = i13;
            int i14 = iLittleEndianToInt8 ^ i13;
            iArr4[1] = i14;
            int i15 = iLittleEndianToInt9 ^ i14;
            iArr4[2] = i15;
            int i16 = iLittleEndianToInt10 ^ i15;
            iArr4[3] = i16;
            int i17 = 2;
            for (int i18 = 3; i18 < 12; i18 += 3) {
                int iE2 = iE ^ (e(d(i16, 8)) ^ i17);
                int[] iArr5 = iArr[i18];
                iArr5[0] = iE2;
                int i19 = i12 ^ iE2;
                iArr5[1] = i19;
                int i20 = i13 ^ i19;
                iArr5[2] = i20;
                int i21 = i14 ^ i20;
                iArr5[3] = i21;
                int i22 = i15 ^ i21;
                int i23 = i18 + 1;
                int[] iArr6 = iArr[i23];
                iArr6[0] = i22;
                int i24 = i16 ^ i22;
                iArr6[1] = i24;
                int iE3 = e(d(i24, 8)) ^ (i17 << 1);
                i17 <<= 2;
                iE = iE2 ^ iE3;
                int[] iArr7 = iArr[i23];
                iArr7[2] = iE;
                i12 = i19 ^ iE;
                iArr7[3] = i12;
                i13 = i20 ^ i12;
                int[] iArr8 = iArr[i18 + 2];
                iArr8[0] = i13;
                i14 = i21 ^ i13;
                iArr8[1] = i14;
                i15 = i22 ^ i14;
                iArr8[2] = i15;
                i16 = i24 ^ i15;
                iArr8[3] = i16;
            }
            int iE4 = (e(d(i16, 8)) ^ i17) ^ iE;
            int[] iArr9 = iArr[12];
            iArr9[0] = iE4;
            int i25 = iE4 ^ i12;
            iArr9[1] = i25;
            int i26 = i25 ^ i13;
            iArr9[2] = i26;
            iArr9[3] = i26 ^ i14;
        } else {
            if (i10 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(key, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(key, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(key, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(key, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(key, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(key, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(key, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(key, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i27 = 1;
            for (int i28 = 2; i28 < 14; i28 += 2) {
                int iE5 = e(d(iLittleEndianToInt18, 8)) ^ i27;
                i27 <<= 1;
                iLittleEndianToInt11 ^= iE5;
                int[] iArr10 = iArr[i28];
                iArr10[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr10[1] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr10[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr10[3] = iLittleEndianToInt14;
                iLittleEndianToInt15 ^= e(iLittleEndianToInt14);
                int[] iArr11 = iArr[i28 + 1];
                iArr11[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr11[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr11[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr11[3] = iLittleEndianToInt18;
            }
            int iE6 = (e(d(iLittleEndianToInt18, 8)) ^ i27) ^ iLittleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iE6;
            int i29 = iE6 ^ iLittleEndianToInt12;
            iArr12[1] = i29;
            int i30 = i29 ^ iLittleEndianToInt13;
            iArr12[2] = i30;
            iArr12[3] = i30 ^ iLittleEndianToInt14;
        }
        if (!z10) {
            for (int i31 = 1; i31 < this.f88291a; i31++) {
                for (int i32 = 0; i32 < 4; i32++) {
                    int[] iArr13 = iArr[i31];
                    iArr13[i32] = a(iArr13[i32]);
                }
            }
        }
        this.f88292b = iArr;
        this.f88297g = z10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        byte[] bArr3;
        byte[] bArr4;
        if (this.f88292b == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        char c10 = 0;
        char c11 = 2;
        int i12 = 1;
        if (this.f88297g) {
            f(i10, bArr);
            int[][] iArr = this.f88292b;
            int i13 = this.f88293c;
            int[] iArr2 = iArr[0];
            int i14 = i13 ^ iArr2[0];
            int i15 = this.f88294d ^ iArr2[1];
            int i16 = this.f88295e ^ iArr2[2];
            int iB = iArr2[3] ^ this.f88296f;
            int i17 = 1;
            while (true) {
                int i18 = this.f88291a - i12;
                bArr4 = f88288h;
                if (i17 >= i18) {
                    break;
                }
                int iB2 = b(((((bArr4[(i15 >> 8) & 255] & 255) << 8) ^ (bArr4[i14 & 255] & 255)) ^ ((bArr4[(i16 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB >> 24) & 255] << 24)) ^ iArr[i17][c10];
                int iB3 = b(((((bArr4[(i16 >> 8) & 255] & 255) << 8) ^ (bArr4[i15 & 255] & 255)) ^ ((bArr4[(iB >> 16) & 255] & 255) << 16)) ^ (bArr4[(i14 >> 24) & 255] << 24)) ^ iArr[i17][i12];
                int iB4 = b(((((bArr4[(iB >> 8) & 255] & 255) << 8) ^ (bArr4[i16 & 255] & 255)) ^ ((bArr4[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i15 >> 24) & 255] << 24)) ^ iArr[i17][c11];
                int iB5 = b(((((bArr4[(i14 >> 8) & 255] & 255) << 8) ^ (bArr4[iB & 255] & 255)) ^ ((bArr4[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i16 >> 24) & 255] << 24));
                int i19 = i17 + 1;
                int i20 = iB5 ^ iArr[i17][3];
                int iB6 = b((((bArr4[iB2 & 255] & 255) ^ ((bArr4[(iB3 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iB4 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i20 >> 24) & 255] << 24)) ^ iArr[i19][0];
                int iB7 = b((((bArr4[iB3 & 255] & 255) ^ ((bArr4[(iB4 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i20 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB2 >> 24) & 255] << 24)) ^ iArr[i19][1];
                int iB8 = b(((((bArr4[(i20 >> 8) & 255] & 255) << 8) ^ (bArr4[iB4 & 255] & 255)) ^ ((bArr4[(iB2 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB3 >> 24) & 255] << 24)) ^ iArr[i19][2];
                i17 += 2;
                iB = iArr[i19][3] ^ b((((bArr4[i20 & 255] & 255) ^ ((bArr4[(iB2 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iB3 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB4 >> 24) & 255] << 24));
                i14 = iB6;
                i15 = iB7;
                c10 = 0;
                i12 = 1;
                i16 = iB8;
                c11 = 2;
            }
            int iB9 = b((((bArr4[i14 & 255] & 255) ^ ((bArr4[(i15 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i16 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB >> 24) & 255] << 24)) ^ iArr[i17][0];
            int iB10 = b((((bArr4[i15 & 255] & 255) ^ ((bArr4[(i16 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iB >> 16) & 255] & 255) << 16)) ^ (bArr4[(i14 >> 24) & 255] << 24)) ^ iArr[i17][1];
            int iB11 = b((((bArr4[i16 & 255] & 255) ^ ((bArr4[(iB >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i15 >> 24) & 255] << 24)) ^ iArr[i17][2];
            int iB12 = b(((((bArr4[(i14 >> 8) & 255] & 255) << 8) ^ (bArr4[iB & 255] & 255)) ^ ((bArr4[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i16 >> 24) & 255] << 24)) ^ iArr[i17][3];
            int i21 = (((bArr4[iB9 & 255] & 255) ^ ((bArr4[(iB10 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iB11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB12 >> 24) & 255] << 24);
            int[] iArr3 = iArr[i17 + 1];
            this.f88293c = iArr3[0] ^ i21;
            this.f88294d = ((((bArr4[iB10 & 255] & 255) ^ ((bArr4[(iB11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iB12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB9 >> 24) & 255] << 24)) ^ iArr3[1];
            this.f88295e = ((((bArr4[iB11 & 255] & 255) ^ ((bArr4[(iB12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iB9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB10 >> 24) & 255] << 24)) ^ iArr3[2];
            this.f88296f = iArr3[3] ^ ((((bArr4[iB12 & 255] & 255) ^ ((bArr4[(iB9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iB10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB11 >> 24) & 255] << 24));
        } else {
            f(i10, bArr);
            int[][] iArr4 = this.f88292b;
            int i22 = this.f88293c;
            int i23 = this.f88291a;
            int[] iArr5 = iArr4[i23];
            int i24 = i22 ^ iArr5[0];
            int i25 = 1;
            int i26 = this.f88294d ^ iArr5[1];
            int i27 = this.f88295e ^ iArr5[2];
            int i28 = i23 - 1;
            int iA = iArr5[3] ^ this.f88296f;
            while (true) {
                bArr3 = f88289i;
                if (i28 <= i25) {
                    break;
                }
                int iA2 = a((((bArr3[i24 & 255] & 255) ^ ((bArr3[(iA >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i27 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i26 >> 24) & 255] << 24)) ^ iArr4[i28][0];
                int iA3 = a((((bArr3[i26 & 255] & 255) ^ ((bArr3[(i24 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA >> 16) & 255] & 255) << 16)) ^ (bArr3[(i27 >> 24) & 255] << 24)) ^ iArr4[i28][1];
                int iA4 = a((((bArr3[i27 & 255] & 255) ^ ((bArr3[(i26 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i24 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA >> 24) & 255] << 24)) ^ iArr4[i28][2];
                int iA5 = a((bArr3[(i24 >> 24) & 255] << 24) ^ (((bArr3[iA & 255] & 255) ^ ((bArr3[(i27 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i26 >> 16) & 255] & 255) << 16)));
                int i29 = i28 - 1;
                int i30 = iA5 ^ iArr4[i28][3];
                int iA6 = a((((bArr3[iA2 & 255] & 255) ^ ((bArr3[(i30 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA3 >> 24) & 255] << 24)) ^ iArr4[i29][0];
                int iA7 = a((((bArr3[iA3 & 255] & 255) ^ ((bArr3[(iA2 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i30 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA4 >> 24) & 255] << 24)) ^ iArr4[i29][1];
                int iA8 = a((((bArr3[iA4 & 255] & 255) ^ ((bArr3[(iA3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i30 >> 24) & 255] << 24)) ^ iArr4[i29][2];
                i28 -= 2;
                iA = iArr4[i29][3] ^ a((((bArr3[i30 & 255] & 255) ^ ((bArr3[(iA4 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA2 >> 24) & 255] << 24));
                i24 = iA6;
                i26 = iA7;
                i27 = iA8;
                i25 = 1;
            }
            int iA9 = a((((bArr3[i24 & 255] & 255) ^ ((bArr3[(iA >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i27 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i26 >> 24) & 255] << 24)) ^ iArr4[i28][0];
            int iA10 = a((((bArr3[i26 & 255] & 255) ^ ((bArr3[(i24 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA >> 16) & 255] & 255) << 16)) ^ (bArr3[(i27 >> 24) & 255] << 24)) ^ iArr4[i28][1];
            int iA11 = a((((bArr3[i27 & 255] & 255) ^ ((bArr3[(i26 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i24 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA >> 24) & 255] << 24)) ^ iArr4[i28][2];
            int iA12 = a((bArr3[(i24 >> 24) & 255] << 24) ^ (((bArr3[iA & 255] & 255) ^ ((bArr3[(i27 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i26 >> 16) & 255] & 255) << 16))) ^ iArr4[i28][3];
            int i31 = (((bArr3[iA9 & 255] & 255) ^ ((bArr3[(iA12 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA11 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA10 >> 24) & 255] << 24);
            int[] iArr6 = iArr4[0];
            this.f88293c = i31 ^ iArr6[0];
            this.f88294d = ((((bArr3[iA10 & 255] & 255) ^ ((bArr3[(iA9 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA12 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA11 >> 24) & 255] << 24)) ^ iArr6[1];
            this.f88295e = ((((bArr3[iA11 & 255] & 255) ^ ((bArr3[(iA10 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA9 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA12 >> 24) & 255] << 24)) ^ iArr6[2];
            this.f88296f = iArr6[3] ^ ((((bArr3[iA12 & 255] & 255) ^ ((bArr3[(iA11 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA10 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA9 >> 24) & 255] << 24));
        }
        c(i11, bArr2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
