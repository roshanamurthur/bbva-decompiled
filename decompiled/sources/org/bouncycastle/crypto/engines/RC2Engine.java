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
import org.bouncycastle.crypto.params.RC2Parameters;

/* JADX INFO: loaded from: classes3.dex */
public class RC2Engine implements BlockCipher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f88509c = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 43, 118, 83, ComputeCcCommandApdu.EXPECTED_P1, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, Constants.DIRECTORY_ENTRY, 69, 109, -115, 9, KSUtils.PLAIN_BUFFER, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, Constants.CVR_B2b8765_1111_APP_DISABLED, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, Constants.CVR_B1b85_0110_TERMINAL, UtilitiesSDKConstants.SRP_LABEL_MAC, 28, 115, 86, Constants.CVR_B2b87_11_RFU, 20, -89, -116, -15, -36, MessageUtils.MESSAGE_18_DC2, 117, -54, 31, 59, -66, -28, -47, 66, Base64.padSymbol, -44, 48, -93, 60, -74, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, Constants.FCI_TEMPLATE, ByteSourceJsonBootstrapper.UTF8_BOM_3, Constants.CVR_B1b41_1110_ONLINE_PIN, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, ByteSourceJsonBootstrapper.UTF8_BOM_1, 62, -25, 6, -61, -43, 47, -56, 102, MessageUtils.MESSAGE_30_RS, -41, 8, -24, -22, -34, -128, 82, -18, -9, -124, -86, 114, -84, 53, 77, GenerateAcResponseApdu.DDA_HEADER, 42, -106, MessageUtils.MESSAGE_26_SUB, -46, 113, 90, MessageUtils.MESSAGE_21_NAK, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -111, -81, Constants.CVR_B1b85_0101_MOBILE_APP, -95, -12, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, Constants.CVR_B2b65_CLEAR_BITS, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, UtilitiesSDKConstants.SRP_LABEL_ENC, -69, 72, 12, Constants.STATE_ERROR, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 10, -90, 32, 104, -2, 127, -63, -83};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f88510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88511b;

    public static int[] a(int i10, byte[] bArr) {
        int[] iArr = new int[128];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        int length = bArr.length;
        byte[] bArr2 = f88509c;
        if (length < 128) {
            int i12 = iArr[length - 1];
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                i12 = bArr2[(i12 + iArr[i13]) & 255] & 255;
                int i15 = length + 1;
                iArr[length] = i12;
                if (i15 >= 128) {
                    break;
                }
                length = i15;
                i13 = i14;
            }
        }
        int i16 = (i10 + 7) >> 3;
        int i17 = 128 - i16;
        int i18 = bArr2[(255 >> ((-i10) & 7)) & iArr[i17]] & 255;
        iArr[i17] = i18;
        for (int i19 = 127 - i16; i19 >= 0; i19--) {
            i18 = bArr2[i18 ^ iArr[i19 + i16]] & 255;
            iArr[i19] = i18;
        }
        int[] iArr2 = new int[64];
        for (int i20 = 0; i20 != 64; i20++) {
            int i21 = i20 * 2;
            iArr2[i20] = iArr[i21] + (iArr[i21 + 1] << 8);
        }
        return iArr2;
    }

    public static int b(int i10, int i11) {
        int i12 = i10 & 65535;
        return (i12 >> (16 - i11)) | (i12 << i11);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f88511b = z10;
        if (cipherParameters instanceof RC2Parameters) {
            RC2Parameters rC2Parameters = (RC2Parameters) cipherParameters;
            this.f88510a = a(rC2Parameters.getEffectiveKeyBits(), rC2Parameters.getKey());
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to RC2 init - "));
            }
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.f88510a = a(key.length * 8, key);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f88510a == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.f88511b) {
            int iB = ((bArr[i10 + 7] & 255) << 8) + (bArr[i10 + 6] & 255);
            int iB2 = ((bArr[i10 + 5] & 255) << 8) + (bArr[i10 + 4] & 255);
            int iB3 = ((bArr[i10 + 3] & 255) << 8) + (bArr[i10 + 2] & 255);
            int iB4 = ((bArr[i10 + 1] & 255) << 8) + (bArr[i10] & 255);
            int i12 = 0;
            for (int i13 = 16; i12 <= i13; i13 = 16) {
                iB4 = b(iB4 + ((~iB) & iB3) + (iB2 & iB) + this.f88510a[i12], 1);
                iB3 = b(iB3 + ((~iB4) & iB2) + (iB & iB4) + this.f88510a[i12 + 1], 2);
                iB2 = b(iB2 + ((~iB3) & iB) + (iB4 & iB3) + this.f88510a[i12 + 2], 3);
                iB = b(iB + ((~iB2) & iB4) + (iB3 & iB2) + this.f88510a[i12 + 3], 5);
                i12 += 4;
            }
            int[] iArr = this.f88510a;
            int iB5 = iB4 + iArr[iB & 63];
            int iB6 = iB3 + iArr[iB5 & 63];
            int iB7 = iB2 + iArr[iB6 & 63];
            int iB8 = iB + iArr[iB7 & 63];
            for (int i14 = 20; i14 <= 40; i14 += 4) {
                iB5 = b(iB5 + ((~iB8) & iB6) + (iB7 & iB8) + this.f88510a[i14], 1);
                iB6 = b(iB6 + ((~iB5) & iB7) + (iB8 & iB5) + this.f88510a[i14 + 1], 2);
                iB7 = b(iB7 + ((~iB6) & iB8) + (iB5 & iB6) + this.f88510a[i14 + 2], 3);
                iB8 = b(iB8 + ((~iB7) & iB5) + (iB6 & iB7) + this.f88510a[i14 + 3], 5);
            }
            int[] iArr2 = this.f88510a;
            int iB9 = iB5 + iArr2[iB8 & 63];
            int iB10 = iB6 + iArr2[iB9 & 63];
            int iB11 = iB7 + iArr2[iB10 & 63];
            int iB12 = iB8 + iArr2[iB11 & 63];
            for (int i15 = 44; i15 < 64; i15 += 4) {
                iB9 = b(iB9 + ((~iB12) & iB10) + (iB11 & iB12) + this.f88510a[i15], 1);
                iB10 = b(iB10 + ((~iB9) & iB11) + (iB12 & iB9) + this.f88510a[i15 + 1], 2);
                iB11 = b(iB11 + ((~iB10) & iB12) + (iB9 & iB10) + this.f88510a[i15 + 2], 3);
                iB12 = b(iB12 + ((~iB11) & iB9) + (iB10 & iB11) + this.f88510a[i15 + 3], 5);
            }
            bArr2[i11] = (byte) iB9;
            bArr2[i11 + 1] = (byte) (iB9 >> 8);
            bArr2[i11 + 2] = (byte) iB10;
            bArr2[i11 + 3] = (byte) (iB10 >> 8);
            bArr2[i11 + 4] = (byte) iB11;
            bArr2[i11 + 5] = (byte) (iB11 >> 8);
            bArr2[i11 + 6] = (byte) iB12;
            bArr2[i11 + 7] = (byte) (iB12 >> 8);
        } else {
            int iB13 = ((bArr[i10 + 7] & 255) << 8) + (bArr[i10 + 6] & 255);
            int iB14 = ((bArr[i10 + 5] & 255) << 8) + (bArr[i10 + 4] & 255);
            int iB15 = ((bArr[i10 + 3] & 255) << 8) + (bArr[i10 + 2] & 255);
            int iB16 = ((bArr[i10 + 1] & 255) << 8) + (bArr[i10] & 255);
            for (int i16 = 60; i16 >= 44; i16 -= 4) {
                iB13 = b(iB13, 11) - ((((~iB14) & iB16) + (iB15 & iB14)) + this.f88510a[i16 + 3]);
                iB14 = b(iB14, 13) - ((((~iB15) & iB13) + (iB16 & iB15)) + this.f88510a[i16 + 2]);
                iB15 = b(iB15, 14) - ((((~iB16) & iB14) + (iB13 & iB16)) + this.f88510a[i16 + 1]);
                iB16 = b(iB16, 15) - ((((~iB13) & iB15) + (iB14 & iB13)) + this.f88510a[i16]);
            }
            int[] iArr3 = this.f88510a;
            int iB17 = iB13 - iArr3[iB14 & 63];
            int iB18 = iB14 - iArr3[iB15 & 63];
            int iB19 = iB15 - iArr3[iB16 & 63];
            int iB20 = iB16 - iArr3[iB17 & 63];
            for (int i17 = 40; i17 >= 20; i17 -= 4) {
                iB17 = b(iB17, 11) - ((((~iB18) & iB20) + (iB19 & iB18)) + this.f88510a[i17 + 3]);
                iB18 = b(iB18, 13) - ((((~iB19) & iB17) + (iB20 & iB19)) + this.f88510a[i17 + 2]);
                iB19 = b(iB19, 14) - ((((~iB20) & iB18) + (iB17 & iB20)) + this.f88510a[i17 + 1]);
                iB20 = b(iB20, 15) - ((((~iB17) & iB19) + (iB18 & iB17)) + this.f88510a[i17]);
            }
            int[] iArr4 = this.f88510a;
            int iB21 = iB17 - iArr4[iB18 & 63];
            int i18 = iB18 - iArr4[iB19 & 63];
            int iB22 = iB19 - iArr4[iB20 & 63];
            int iB23 = iB20 - iArr4[iB21 & 63];
            int iB24 = i18;
            for (int i19 = 16; i19 >= 0; i19 -= 4) {
                iB21 = b(iB21, 11) - ((((~iB24) & iB23) + (iB22 & iB24)) + this.f88510a[i19 + 3]);
                iB24 = b(iB24, 13) - ((((~iB22) & iB21) + (iB23 & iB22)) + this.f88510a[i19 + 2]);
                iB22 = b(iB22, 14) - ((((~iB23) & iB24) + (iB21 & iB23)) + this.f88510a[i19 + 1]);
                iB23 = b(iB23, 15) - ((((~iB21) & iB22) + (iB24 & iB21)) + this.f88510a[i19]);
            }
            bArr2[i11] = (byte) iB23;
            bArr2[i11 + 1] = (byte) (iB23 >> 8);
            bArr2[i11 + 2] = (byte) iB22;
            bArr2[i11 + 3] = (byte) (iB22 >> 8);
            bArr2[i11 + 4] = (byte) iB24;
            bArr2[i11 + 5] = (byte) (iB24 >> 8);
            bArr2[i11 + 6] = (byte) iB21;
            bArr2[i11 + 7] = (byte) (iB21 >> 8);
        }
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
