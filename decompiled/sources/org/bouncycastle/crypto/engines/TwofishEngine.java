package org.bouncycastle.crypto.engines;

import android.R;
import androidx.core.view.InputDeviceCompat;
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
public final class TwofishEngine implements BlockCipher {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[][] f88631j = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, -128, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, Base64.padSymbol, 89, -13, -82, -94, -126, 99, 1, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, Constants.DIRECTORY_ENTRY, Constants.CVR_B2b87_11_RFU, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, GenerateAcResponseApdu.DDA_HEADER, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, MessageUtils.MESSAGE_30_RS, -41, -5, -61, ComputeCcCommandApdu.EXPECTED_P1, -75, -23, Constants.CVR_B2b65_CLEAR_BITS, ByteSourceJsonBootstrapper.UTF8_BOM_3, -70, -22, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 57, -81, 51, -55, 98, 113, KSUtils.PLAIN_BUFFER, 121, 9, -83, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, UtilitiesSDKConstants.SRP_LABEL_MAC, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, Constants.CVR_B1b85_0110_TERMINAL, -1, -106, 92, -79, -85, -98, -100, 82, 27, Constants.STATE_ERROR, -109, 10, ByteSourceJsonBootstrapper.UTF8_BOM_1, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, 127, -43, MessageUtils.MESSAGE_26_SUB, 75, Constants.CVR_B1b41_1110_ONLINE_PIN, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, UtilitiesSDKConstants.SRP_LABEL_ENC, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, MessageUtils.MESSAGE_21_NAK, 34, MessageUtils.MESSAGE_18_DC2, 88, 7, -103, 52, 110, Constants.CVR_B1b85_0101_MOBILE_APP, -34, 104, 101, -68, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, 16, 33, Constants.CVR_B2b8765_1111_APP_DISABLED, -45, 93, 15, 0, Constants.FCI_TEMPLATE, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 109, -63, -79, Constants.CVR_B1b41_1110_ONLINE_PIN, -128, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, UtilitiesSDKConstants.SRP_LABEL_MAC, 115, 76, 84, -110, 116, 54, 81, 56, UtilitiesSDKConstants.SRP_LABEL_ENC, -67, 90, -4, Constants.CVR_B1b85_0110_TERMINAL, 98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 19, -107, -100, -57, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 70, 59, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -54, -29, -123, -53, 17, -48, -109, -72, -90, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 32, -1, -97, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -61, -52, 3, Constants.FCI_TEMPLATE, 8, ByteSourceJsonBootstrapper.UTF8_BOM_3, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, Base64.padSymbol, Constants.CVR_B2b8765_1111_APP_DISABLED, -34, -77, 11, 114, -89, 28, ByteSourceJsonBootstrapper.UTF8_BOM_1, -47, 83, 62, -113, 51, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, Constants.STATE_ERROR, -20, 118, 42, 73, KSUtils.PLAIN_BUFFER, -120, -18, 33, -60, MessageUtils.MESSAGE_26_SUB, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, ComputeCcCommandApdu.EXPECTED_P1, 120, 92, 88, 25, -115, -27, -104, 87, 103, 127, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, MessageUtils.MESSAGE_21_NAK, 89, -88, 10, -98, 110, 71, -33, 52, 53, GenerateAcResponseApdu.DDA_HEADER, Constants.CVR_B2b65_CLEAR_BITS, -36, 34, -55, Constants.CVR_B2b87_11_RFU, -101, -119, -44, -19, -85, MessageUtils.MESSAGE_18_DC2, -94, 13, 82, -69, 2, 47, -87, -41, Constants.DIRECTORY_ENTRY, MessageUtils.MESSAGE_30_RS, -76, Constants.CVR_B1b85_0101_MOBILE_APP, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f88637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f88638g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88632a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f88633b = new int[256];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f88634c = new int[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f88635d = new int[256];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f88636e = new int[256];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88639h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f88640i = null;

    public TwofishEngine() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        for (int i10 = 0; i10 < 256; i10++) {
            byte[][] bArr = f88631j;
            byte b10 = bArr[0][i10];
            int i11 = b10 & 255;
            iArr[0] = i11;
            iArr2[0] = (f(i11) ^ i11) & 255;
            int i12 = 180;
            iArr3[0] = (((((b10 & 1) != 0 ? 180 : 0) ^ (i11 >> 1)) ^ i11) ^ f(i11)) & 255;
            byte b11 = bArr[1][i10];
            int i13 = b11 & 255;
            iArr[1] = i13;
            iArr2[1] = (f(i13) ^ i13) & 255;
            int i14 = i13 >> 1;
            if ((b11 & 1) == 0) {
                i12 = 0;
            }
            int iF = (((i14 ^ i12) ^ i13) ^ f(i13)) & 255;
            iArr3[1] = iF;
            this.f88633b[i10] = (iF << 24) | iArr[1] | (iArr2[1] << 8) | (iF << 16);
            int[] iArr4 = this.f88634c;
            int i15 = iArr3[0];
            iArr4[i10] = i15 | (i15 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr5 = this.f88635d;
            int i16 = iArr2[1];
            int i17 = iArr3[1];
            iArr5[i10] = (iArr[1] << 16) | i16 | (i17 << 8) | (i17 << 24);
            int[] iArr6 = this.f88636e;
            int i18 = iArr2[0];
            iArr6[i10] = (i18 << 24) | (iArr[0] << 8) | i18 | (iArr3[0] << 16);
        }
    }

    public static void a(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
    }

    public static int b(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int f(int i10) {
        return ((i10 >> 2) ^ ((i10 & 2) != 0 ? 180 : 0)) ^ ((i10 & 1) != 0 ? 90 : 0);
    }

    public static int g(int i10) {
        int i11 = i10 >>> 24;
        int i12 = i11 & 255;
        int i13 = ((i12 << 1) ^ ((i11 & 128) != 0 ? 333 : 0)) & 255;
        int i14 = ((i12 >>> 1) ^ ((i11 & 1) != 0 ? 166 : 0)) ^ i13;
        return ((((i10 << 8) ^ (i14 << 24)) ^ (i13 << 16)) ^ (i14 << 8)) ^ i12;
    }

    public static int h(int i10) {
        return (i10 >>> 8) & 255;
    }

    public static int i(int i10) {
        return (i10 >>> 16) & 255;
    }

    public static int j(int i10) {
        return (i10 >>> 24) & 255;
    }

    public final int c(int i10, int[] iArr) {
        int i11;
        int i12;
        char c10;
        int i13 = i10 & 255;
        int iH = h(i10);
        int i14 = i(i10);
        int iJ = j(i10);
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        int i19 = this.f88639h & 3;
        int[] iArr2 = this.f88636e;
        int[] iArr3 = this.f88635d;
        int[] iArr4 = this.f88634c;
        int[] iArr5 = this.f88633b;
        byte[][] bArr = f88631j;
        if (i19 != 0) {
            if (i19 != 1) {
                if (i19 == 2) {
                    c10 = 0;
                } else if (i19 != 3) {
                    return 0;
                }
                byte[] bArr2 = bArr[c10];
                i11 = (iArr5[(bArr2[(bArr2[i13] & 255) ^ (i16 & 255)] & 255) ^ (i15 & 255)] ^ iArr4[(bArr2[(bArr[1][iH] & 255) ^ h(i16)] & 255) ^ h(i15)]) ^ iArr3[(bArr[1][(bArr[0][i14] & 255) ^ i(i16)] & 255) ^ i(i15)];
                byte[] bArr3 = bArr[1];
                i12 = iArr2[(bArr3[(bArr3[iJ] & 255) ^ j(i16)] & 255) ^ j(i15)];
            } else {
                byte[] bArr4 = bArr[0];
                i11 = (iArr5[(bArr4[i13] & 255) ^ (i15 & 255)] ^ iArr4[(bArr4[iH] & 255) ^ h(i15)]) ^ iArr3[(bArr[1][i14] & 255) ^ i(i15)];
                i12 = iArr2[(bArr[1][iJ] & 255) ^ j(i15)];
            }
            return i11 ^ i12;
        }
        i13 = (bArr[1][i13] & 255) ^ (i18 & 255);
        iH = (bArr[0][iH] & 255) ^ h(i18);
        i14 = (bArr[0][i14] & 255) ^ i(i18);
        iJ = (bArr[1][iJ] & 255) ^ j(i18);
        byte[] bArr5 = bArr[1];
        i13 = (bArr5[i13] & 255) ^ (i17 & 255);
        iH = (bArr5[iH] & 255) ^ h(i17);
        c10 = 0;
        i14 = (bArr[0][i14] & 255) ^ i(i17);
        iJ = (bArr[0][iJ] & 255) ^ j(i17);
        byte[] bArr6 = bArr[c10];
        i11 = (iArr5[(bArr6[(bArr6[i13] & 255) ^ (i16 & 255)] & 255) ^ (i15 & 255)] ^ iArr4[(bArr6[(bArr[1][iH] & 255) ^ h(i16)] & 255) ^ h(i15)]) ^ iArr3[(bArr[1][(bArr[0][i14] & 255) ^ i(i16)] & 255) ^ i(i15)];
        byte[] bArr7 = bArr[1];
        i12 = iArr2[(bArr7[(bArr7[iJ] & 255) ^ j(i16)] & 255) ^ j(i15)];
        return i11 ^ i12;
    }

    public final int d(int i10) {
        int[] iArr = this.f88638g;
        return iArr[(((i10 >>> 24) & 255) * 2) + InputDeviceCompat.SOURCE_DPAD] ^ ((iArr[(i10 & 255) * 2] ^ iArr[(((i10 >>> 8) & 255) * 2) + 1]) ^ iArr[(((i10 >>> 16) & 255) * 2) + 512]);
    }

    public final int e(int i10) {
        int[] iArr = this.f88638g;
        return iArr[(((i10 >>> 16) & 255) * 2) + InputDeviceCompat.SOURCE_DPAD] ^ ((iArr[((i10 >>> 24) & 255) * 2] ^ iArr[((i10 & 255) * 2) + 1]) ^ iArr[(((i10 >>> 8) & 255) * 2) + 512]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to Twofish init - "));
        }
        this.f88632a = z10;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.f88640i = key;
        this.f88639h = key.length / 8;
        k(key);
    }

    public final void k(byte[] bArr) {
        int i10;
        int iH;
        int i11;
        int iJ;
        int iJ2;
        int iH2;
        int i12;
        int i13;
        char c10;
        int i14;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.f88637f = new int[40];
        int i15 = this.f88639h;
        int i16 = 1;
        if (i15 < 1) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (i15 > 4) {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        char c11 = 0;
        for (int i17 = 0; i17 < this.f88639h; i17++) {
            int i18 = i17 * 8;
            iArr[i17] = b(i18, bArr);
            int iB = b(i18 + 4, bArr);
            iArr2[i17] = iB;
            int i19 = (this.f88639h - 1) - i17;
            int i20 = iArr[i17];
            for (int i21 = 0; i21 < 4; i21++) {
                iB = g(iB);
            }
            int iG = iB ^ i20;
            for (int i22 = 0; i22 < 4; i22++) {
                iG = g(iG);
            }
            iArr3[i19] = iG;
        }
        for (int i23 = 0; i23 < 20; i23++) {
            int i24 = 33686018 * i23;
            int iC = c(i24, iArr);
            int iC2 = c(i24 + R.attr.cacheColorHint, iArr2);
            int i25 = (iC2 >>> 24) | (iC2 << 8);
            int i26 = iC + i25;
            int[] iArr4 = this.f88637f;
            int i27 = i23 * 2;
            iArr4[i27] = i26;
            int i28 = i26 + i25;
            iArr4[i27 + 1] = (i28 << 9) | (i28 >>> 23);
        }
        int i29 = iArr3[0];
        int i30 = iArr3[1];
        int i31 = 2;
        int i32 = iArr3[2];
        int i33 = 3;
        int i34 = iArr3[3];
        this.f88638g = new int[1024];
        int i35 = 0;
        while (i35 < 256) {
            int i36 = this.f88639h & i33;
            int[] iArr5 = this.f88636e;
            int[] iArr6 = this.f88635d;
            int[] iArr7 = this.f88634c;
            int[] iArr8 = this.f88633b;
            byte[][] bArr2 = f88631j;
            if (i36 != 0) {
                if (i36 == i16) {
                    int[] iArr9 = this.f88638g;
                    int i37 = i35 * 2;
                    int i38 = bArr2[c11][i35] & 255;
                    iArr9[i37] = iArr8[(i29 & 255) ^ i38];
                    iArr9[i37 + 1] = iArr7[i38 ^ h(i29)];
                    this.f88638g[i37 + 512] = iArr6[(bArr2[i16][i35] & 255) ^ i(i29)];
                    this.f88638g[i37 + InputDeviceCompat.SOURCE_DPAD] = iArr5[(bArr2[i16][i35] & 255) ^ j(i29)];
                    i14 = i16;
                    c10 = 0;
                } else if (i36 == i31) {
                    i13 = i35;
                    i12 = i13;
                    iH2 = i12;
                    iJ2 = iH2;
                    int[] iArr10 = this.f88638g;
                    int i39 = i35 * 2;
                    byte[] bArr3 = bArr2[0];
                    iArr10[i39] = iArr8[(bArr3[(bArr3[i13] & 255) ^ (i30 & 255)] & 255) ^ (i29 & 255)];
                    iArr10[i39 + 1] = iArr7[(bArr3[(bArr2[1][iH2] & 255) ^ h(i30)] & 255) ^ h(i29)];
                    c10 = 0;
                    this.f88638g[i39 + 512] = iArr6[(bArr2[1][(bArr2[0][i12] & 255) ^ i(i30)] & 255) ^ i(i29)];
                    int[] iArr11 = this.f88638g;
                    int i40 = i39 + InputDeviceCompat.SOURCE_DPAD;
                    i14 = 1;
                    byte[] bArr4 = bArr2[1];
                    iArr11[i40] = iArr5[(bArr4[(bArr4[iJ2] & 255) ^ j(i30)] & 255) ^ j(i29)];
                } else if (i36 != i33) {
                    i14 = i16;
                    c10 = c11;
                } else {
                    i10 = i35;
                    i11 = i10;
                    iH = i11;
                    iJ = iH;
                }
                i35++;
                c11 = c10;
                i32 = i32;
                i31 = 2;
                i33 = 3;
                i16 = i14;
                i34 = i34;
            } else {
                i10 = (bArr2[i16][i35] & 255) ^ (i34 & 255);
                iH = (bArr2[0][i35] & 255) ^ h(i34);
                i11 = (bArr2[0][i35] & 255) ^ i(i34);
                iJ = (bArr2[i16][i35] & 255) ^ j(i34);
            }
            byte[] bArr5 = bArr2[i16];
            i13 = (bArr5[i10] & 255) ^ (i32 & 255);
            iH2 = (bArr5[iH] & 255) ^ h(i32);
            i12 = (bArr2[0][i11] & 255) ^ i(i32);
            iJ2 = (bArr2[0][iJ] & 255) ^ j(i32);
            int[] iArr12 = this.f88638g;
            int i310 = i35 * 2;
            byte[] bArr6 = bArr2[0];
            iArr12[i310] = iArr8[(bArr6[(bArr6[i13] & 255) ^ (i30 & 255)] & 255) ^ (i29 & 255)];
            iArr12[i310 + 1] = iArr7[(bArr6[(bArr2[1][iH2] & 255) ^ h(i30)] & 255) ^ h(i29)];
            c10 = 0;
            this.f88638g[i310 + 512] = iArr6[(bArr2[1][(bArr2[0][i12] & 255) ^ i(i30)] & 255) ^ i(i29)];
            int[] iArr13 = this.f88638g;
            int i41 = i310 + InputDeviceCompat.SOURCE_DPAD;
            i14 = 1;
            byte[] bArr7 = bArr2[1];
            iArr13[i41] = iArr5[(bArr7[(bArr7[iJ2] & 255) ^ j(i30)] & 255) ^ j(i29)];
            i35++;
            c11 = c10;
            i32 = i32;
            i31 = 2;
            i33 = 3;
            i16 = i14;
            i34 = i34;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f88640i == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.f88632a) {
            int iB = b(i10, bArr) ^ this.f88637f[0];
            int iB2 = this.f88637f[1] ^ b(i10 + 4, bArr);
            int iB3 = b(i10 + 8, bArr) ^ this.f88637f[2];
            int iB4 = b(i10 + 12, bArr) ^ this.f88637f[3];
            int i12 = 8;
            int i13 = iB3;
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int iD = d(iB);
                int iE = e(iB2);
                int[] iArr = this.f88637f;
                int i16 = i13 ^ ((iD + iE) + iArr[i12]);
                i13 = (i16 >>> 1) | (i16 << 31);
                iB4 = ((iB4 << 1) | (iB4 >>> 31)) ^ (((iE * 2) + iD) + iArr[i12 + 1]);
                int iD2 = d(i13);
                int iE2 = e(iB4);
                int[] iArr2 = this.f88637f;
                int i17 = i12 + 3;
                int i18 = iB ^ ((iD2 + iE2) + iArr2[i12 + 2]);
                iB = (i18 << 31) | (i18 >>> 1);
                i12 += 4;
                iB2 = ((iB2 >>> 31) | (iB2 << 1)) ^ (((iE2 * 2) + iD2) + iArr2[i17]);
                i14 += 2;
            }
            a(this.f88637f[4] ^ i13, i11, bArr2);
            a(iB4 ^ this.f88637f[5], i11 + 4, bArr2);
            a(this.f88637f[6] ^ iB, i11 + 8, bArr2);
            a(this.f88637f[7] ^ iB2, i11 + 12, bArr2);
            return 16;
        }
        int iB5 = b(i10, bArr) ^ this.f88637f[4];
        int iB6 = b(i10 + 4, bArr) ^ this.f88637f[5];
        int iB7 = b(i10 + 8, bArr) ^ this.f88637f[6];
        int iB8 = b(i10 + 12, bArr) ^ this.f88637f[7];
        int i19 = 39;
        int i20 = 0;
        for (int i21 = 16; i20 < i21; i21 = 16) {
            int iD3 = d(iB5);
            int iE3 = e(iB6);
            int[] iArr3 = this.f88637f;
            int i22 = iB8 ^ (((iE3 * 2) + iD3) + iArr3[i19]);
            iB7 = ((iB7 >>> 31) | (iB7 << 1)) ^ ((iD3 + iE3) + iArr3[i19 - 1]);
            iB8 = (i22 << 31) | (i22 >>> 1);
            int iD4 = d(iB7);
            int iE4 = e(iB8);
            int[] iArr4 = this.f88637f;
            int i23 = i19 - 3;
            int i24 = iB6 ^ (((iE4 * 2) + iD4) + iArr4[i19 - 2]);
            i19 -= 4;
            iB5 = ((iB5 >>> 31) | (iB5 << 1)) ^ ((iD4 + iE4) + iArr4[i23]);
            iB6 = (i24 << 31) | (i24 >>> 1);
            i20 += 2;
        }
        a(this.f88637f[0] ^ iB7, i11, bArr2);
        a(iB8 ^ this.f88637f[1], i11 + 4, bArr2);
        a(this.f88637f[2] ^ iB5, i11 + 8, bArr2);
        a(this.f88637f[3] ^ iB6, i11 + 12, bArr2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.f88640i;
        if (bArr != null) {
            k(bArr);
        }
    }
}
