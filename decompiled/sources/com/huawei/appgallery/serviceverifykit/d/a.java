package com.huawei.appgallery.serviceverifykit.d;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f50127a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 16, 17, MessageUtils.MESSAGE_18_DC2, 19, 20, MessageUtils.MESSAGE_21_NAK, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, MessageUtils.MESSAGE_26_SUB, 27, 28, 29, MessageUtils.MESSAGE_30_RS, 31, 32, 33, 34, 35, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 37, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public static byte[] a(String str) {
        int iB = b(str);
        int i10 = (iB / 4) * 3;
        int i11 = iB % 4;
        if (i11 == 3) {
            i10 += 2;
        }
        if (i11 == 2) {
            i10++;
        }
        byte[] bArr = new byte[i10];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            byte b10 = cCharAt > 255 ? (byte) -1 : f50127a[cCharAt];
            if (b10 >= 0) {
                int i16 = i14 + 6;
                i13 = (i13 << 6) | b10;
                if (i16 >= 8) {
                    i14 -= 2;
                    bArr[i12] = (byte) (255 & (i13 >> i14));
                    i12++;
                } else {
                    i14 = i16;
                }
            }
        }
        return i12 != i10 ? new byte[0] : bArr;
    }

    private static int b(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt > 255 || f50127a[cCharAt] < 0) {
                length--;
            }
        }
        return length;
    }
}
