package bc.org.bouncycastle.crypto.engines;

import android.R;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import bc.org.bouncycastle.crypto.BlockCipher;
import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.DataLengthException;
import bc.org.bouncycastle.crypto.params.KeyParameter;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.h4;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.io.encoding.Base64;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes2.dex */
public class DESEngine implements BlockCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final short[] f24951b = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f24952c = {8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f24953d = {56, 48, 40, 32, 24, 16, 8, 0, 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_18_DC2, 10, 2, 59, 51, 43, 35, 62, 54, 46, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, MessageUtils.MESSAGE_30_RS, 22, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, Base64.padSymbol, 53, 45, 37, 29, MessageUtils.MESSAGE_21_NAK, 13, 5, 60, 52, 44, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 28, 20, 12, 4, 27, 19, 11, 3};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f24954e = {1, 2, 4, 6, 8, 10, 12, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 17, 19, MessageUtils.MESSAGE_21_NAK, 23, 25, 27, 28};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f24955f = {13, 16, 10, 23, 0, 4, 2, 27, Constants.CVR_B1b41_1110_ONLINE_PIN, 5, 20, 9, 22, MessageUtils.MESSAGE_18_DC2, 11, 3, 25, 7, 15, 6, MessageUtils.MESSAGE_26_SUB, 19, 12, 1, 40, 51, MessageUtils.MESSAGE_30_RS, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 46, 54, 29, 39, 50, 44, 32, 47, 43, 48, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 55, 33, 52, 45, 41, 49, 35, 28, 31};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f24956g = {R.attr.transitionName, 0, 65536, R.attr.fillColor, R.attr.manageSpaceActivity, 66564, 4, 65536, 1024, R.attr.transitionName, R.attr.fillColor, 1024, 16778244, R.attr.manageSpaceActivity, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, R.attr.theme, R.attr.theme, 16778244, InputDeviceCompat.SOURCE_TRACKBALL, 16777220, 16777220, InputDeviceCompat.SOURCE_TRACKBALL, 0, 1028, 66564, 16777216, 65536, R.attr.fillColor, 4, R.attr.theme, R.attr.transitionName, 16777216, 16777216, 1024, R.attr.manageSpaceActivity, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, R.attr.fillColor, InputDeviceCompat.SOURCE_TRACKBALL, R.attr.theme, 16778244, 16777220, 1028, 66564, R.attr.transitionName, 1028, 16778240, 16778240, 0, InputDeviceCompat.SOURCE_TRACKBALL, 66560, 0, R.attr.manageSpaceActivity};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f24957h = {-2146402272, -2147450880, 32768, 1081376, 1048576, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, 1048576, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, 1048576, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, 1048576, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f24958i = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f24959j = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f24960k = {256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f24961l = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, PKIFailureInfo.duplicateCertReq, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, PKIFailureInfo.duplicateCertReq, 4194320, 536887312};
    public static final int[] m = {2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 2099200, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f24962n = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24963a = null;

    public int[] a(boolean z10, byte[] bArr) {
        byte[] bArr2;
        int i10;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= 56) {
                break;
            }
            byte b10 = f24953d[i11];
            if ((f24951b[b10 & 7] & bArr[b10 >>> 3]) == 0) {
                z11 = false;
            }
            zArr[i11] = z11;
            i11++;
        }
        for (int i12 = 0; i12 < 16; i12++) {
            int i13 = z10 ? i12 << 1 : (15 - i12) << 1;
            int i14 = i13 + 1;
            iArr[i14] = 0;
            iArr[i13] = 0;
            int i15 = 0;
            while (true) {
                bArr2 = f24954e;
                if (i15 >= 28) {
                    break;
                }
                int i16 = bArr2[i12] + i15;
                if (i16 < 28) {
                    zArr2[i15] = zArr[i16];
                } else {
                    zArr2[i15] = zArr[i16 - 28];
                }
                i15++;
            }
            for (i10 = 28; i10 < 56; i10++) {
                int i17 = bArr2[i12] + i10;
                if (i17 < 56) {
                    zArr2[i10] = zArr[i17];
                } else {
                    zArr2[i10] = zArr[i17 - 28];
                }
            }
            for (int i18 = 0; i18 < 24; i18++) {
                byte[] bArr3 = f24955f;
                boolean z12 = zArr2[bArr3[i18]];
                int[] iArr2 = f24952c;
                if (z12) {
                    iArr[i13] = iArr[i13] | iArr2[i18];
                }
                if (zArr2[bArr3[i18 + 24]]) {
                    iArr[i14] = iArr[i14] | iArr2[i18];
                }
            }
        }
        for (int i19 = 0; i19 != 32; i19 += 2) {
            int i20 = iArr[i19];
            int i21 = i19 + 1;
            int i22 = iArr[i21];
            iArr[i19] = ((16515072 & i22) >>> 10) | ((i20 & 16515072) << 6) | ((i20 & 4032) << 10) | ((i22 & 4032) >>> 6);
            iArr[i21] = ((i20 & 63) << 16) | ((i20 & 258048) << 12) | ((258048 & i22) >>> 4) | (i22 & 63);
        }
        return iArr;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DES";
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to DES init - ".concat(cipherParameters.getClass().getName()));
        }
        KeyParameter keyParameter = (KeyParameter) cipherParameters;
        if (keyParameter.getKey().length > 8) {
            throw new IllegalArgumentException("DES key too long - should be 8 bytes");
        }
        this.f24963a = a(z10, keyParameter.getKey());
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.f24963a;
        if (iArr == null) {
            throw new IllegalStateException("DES engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new h4("output buffer too short");
        }
        a(iArr, bArr, i10, bArr2, i11);
        return 8;
    }

    public void a(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
        int i13 = ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8) | (bArr[i10 + 7] & 255);
        int i14 = ((i12 >>> 4) ^ i13) & 252645135;
        int i15 = i13 ^ i14;
        int i16 = i12 ^ (i14 << 4);
        int i17 = ((i16 >>> 16) ^ i15) & 65535;
        int i18 = i15 ^ i17;
        int i19 = i16 ^ (i17 << 16);
        int i20 = ((i18 >>> 2) ^ i19) & 858993459;
        int i21 = i19 ^ i20;
        int i22 = i18 ^ (i20 << 2);
        int i23 = ((i22 >>> 8) ^ i21) & 16711935;
        int i24 = i21 ^ i23;
        int i25 = i22 ^ (i23 << 8);
        int i26 = ((i25 >>> 31) & 1) | (i25 << 1);
        int i27 = (i24 ^ i26) & (-1431655766);
        int i28 = i24 ^ i27;
        int i29 = i26 ^ i27;
        int i30 = ((i28 >>> 31) & 1) | (i28 << 1);
        for (int i31 = 0; i31 < 8; i31++) {
            int i32 = i31 * 4;
            int i33 = ((i29 << 28) | (i29 >>> 4)) ^ iArr[i32];
            int[] iArr2 = m;
            int i34 = iArr2[i33 & 63];
            int[] iArr3 = f24960k;
            int i35 = i34 | iArr3[(i33 >>> 8) & 63];
            int[] iArr4 = f24958i;
            int i36 = i35 | iArr4[(i33 >>> 16) & 63];
            int[] iArr5 = f24956g;
            int i37 = iArr5[(i33 >>> 24) & 63] | i36;
            int i38 = iArr[i32 + 1] ^ i29;
            int[] iArr6 = f24962n;
            int i39 = i37 | iArr6[i38 & 63];
            int[] iArr7 = f24961l;
            int i40 = i39 | iArr7[(i38 >>> 8) & 63];
            int[] iArr8 = f24959j;
            int i41 = i40 | iArr8[(i38 >>> 16) & 63];
            int[] iArr9 = f24957h;
            i30 ^= i41 | iArr9[(i38 >>> 24) & 63];
            int i42 = ((i30 << 28) | (i30 >>> 4)) ^ iArr[i32 + 2];
            int i43 = iArr5[(i42 >>> 24) & 63] | iArr2[i42 & 63] | iArr3[(i42 >>> 8) & 63] | iArr4[(i42 >>> 16) & 63];
            int i44 = iArr[i32 + 3] ^ i30;
            i29 ^= (((i43 | iArr6[i44 & 63]) | iArr7[(i44 >>> 8) & 63]) | iArr8[(i44 >>> 16) & 63]) | iArr9[(i44 >>> 24) & 63];
        }
        int i45 = (i29 >>> 1) | (i29 << 31);
        int i46 = (i30 ^ i45) & (-1431655766);
        int i47 = i30 ^ i46;
        int i48 = i45 ^ i46;
        int i49 = (i47 >>> 1) | (i47 << 31);
        int i50 = ((i49 >>> 8) ^ i48) & 16711935;
        int i51 = i48 ^ i50;
        int i52 = i49 ^ (i50 << 8);
        int i53 = ((i52 >>> 2) ^ i51) & 858993459;
        int i54 = i51 ^ i53;
        int i55 = i52 ^ (i53 << 2);
        int i56 = ((i54 >>> 16) ^ i55) & 65535;
        int i57 = i55 ^ i56;
        int i58 = i54 ^ (i56 << 16);
        int i59 = ((i58 >>> 4) ^ i57) & 252645135;
        int i60 = i57 ^ i59;
        int i61 = i58 ^ (i59 << 4);
        bArr2[i11] = (byte) ((i61 >>> 24) & 255);
        bArr2[i11 + 1] = (byte) ((i61 >>> 16) & 255);
        bArr2[i11 + 2] = (byte) ((i61 >>> 8) & 255);
        bArr2[i11 + 3] = (byte) (i61 & 255);
        bArr2[i11 + 4] = (byte) ((i60 >>> 24) & 255);
        bArr2[i11 + 5] = (byte) ((i60 >>> 16) & 255);
        bArr2[i11 + 6] = (byte) ((i60 >>> 8) & 255);
        bArr2[i11 + 7] = (byte) (i60 & 255);
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
