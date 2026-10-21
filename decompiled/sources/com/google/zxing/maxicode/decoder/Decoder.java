package com.google.zxing.maxicode.decoder;

import ch.a;
import ch.b;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.text.DecimalFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class Decoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReedSolomonDecoder f49900a = new ReedSolomonDecoder(GenericGF.MAXICODE_FIELD_64);

    public final void a(byte[] bArr, int i10, int i11, int i12, int i13) throws ChecksumException {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[i14 / i15];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f49900a.decode(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        return decode(bitMatrix, null);
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        byte[] bArr;
        String strValueOf;
        byte[] bArr2 = new byte[144];
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        for (int i10 = 0; i10 < height; i10++) {
            int[] iArr = a.f25436a[i10];
            for (int i11 = 0; i11 < width; i11++) {
                int i12 = iArr[i11];
                if (i12 >= 0 && bitMatrix.get(i11, i10)) {
                    int i13 = i12 / 6;
                    bArr2[i13] = (byte) (((byte) (1 << (5 - (i12 % 6)))) | bArr2[i13]);
                }
            }
        }
        a(bArr2, 0, 10, 10, 0);
        int i14 = bArr2[0] & 15;
        if (i14 == 2 || i14 == 3 || i14 == 4) {
            a(bArr2, 20, 84, 40, 1);
            a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i14 != 5) {
                throw FormatException.getFormatInstance();
            }
            a(bArr2, 20, 68, 56, 1);
            a(bArr2, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArr2, 0, bArr, 0, 10);
        System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
        StringBuilder sb2 = new StringBuilder(144);
        if (i14 == 2 || i14 == 3) {
            if (i14 == 2) {
                strValueOf = new DecimalFormat("0000000000".substring(0, b.a(bArr, new byte[]{39, 40, 41, 42, 31, 32}))).format(b.a(bArr, new byte[]{33, 34, 35, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 25, MessageUtils.MESSAGE_26_SUB, 27, 28, 29, MessageUtils.MESSAGE_30_RS, 19, 20, MessageUtils.MESSAGE_21_NAK, 22, 23, 24, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 16, 17, MessageUtils.MESSAGE_18_DC2, 7, 8, 9, 10, 11, 12, 1, 2}));
            } else {
                String[] strArr = b.f25437a;
                strValueOf = String.valueOf(new char[]{strArr[0].charAt(b.a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(b.a(bArr, new byte[]{33, 34, 35, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 25, MessageUtils.MESSAGE_26_SUB})), strArr[0].charAt(b.a(bArr, new byte[]{27, 28, 29, MessageUtils.MESSAGE_30_RS, 19, 20})), strArr[0].charAt(b.a(bArr, new byte[]{MessageUtils.MESSAGE_21_NAK, 22, 23, 24, 13, Constants.CVR_B1b41_1110_ONLINE_PIN})), strArr[0].charAt(b.a(bArr, new byte[]{15, 16, 17, MessageUtils.MESSAGE_18_DC2, 7, 8})), strArr[0].charAt(b.a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(b.a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH}));
            String str2 = decimalFormat.format(b.a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
            sb2.append(b.b(10, 84, bArr));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            } else {
                sb2.insert(0, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            }
        } else if (i14 == 4) {
            sb2.append(b.b(1, 93, bArr));
        } else if (i14 == 5) {
            sb2.append(b.b(1, 77, bArr));
        }
        return new DecoderResult(bArr, sb2.toString(), null, String.valueOf(i14));
    }
}
