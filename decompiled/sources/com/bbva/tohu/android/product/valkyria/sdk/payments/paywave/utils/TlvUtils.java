package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils;

import android.annotation.SuppressLint;
import androidx.core.view.MotionEventCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TlvUtils {
    @SuppressLint({"DefaultLocale"})
    public static String create(String str, String str2) {
        return (str + HexUtils.byteArrayToHexString(lengthBytes(HexUtils.byteArrayFromHexString(str2))) + str2).toUpperCase();
    }

    public static byte[] createSucessfulResponseApdu(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bArr);
        arrayList.add(Constants.ISO7816_SW_NO_ERROR);
        return HexUtils.concatenateArrays(arrayList);
    }

    public static byte[] createTlv(byte[] bArr, byte[] bArr2) {
        byte[] bArrLengthBytes = lengthBytes(bArr2);
        byte[] bArr3 = new byte[bArr.length + bArrLengthBytes.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArrLengthBytes, 0, bArr3, bArr.length, bArrLengthBytes.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + bArrLengthBytes.length, bArr2.length);
        return bArr3;
    }

    public static byte[] createTlvFromHexString(byte[] bArr, String str) {
        return createTlv(bArr, HexUtils.byteArrayFromHexString(str));
    }

    public static byte[] lengthBytes(byte[] bArr) {
        int length = bArr.length;
        if (length <= 127) {
            return new byte[]{(byte) length};
        }
        if (length <= 255) {
            return new byte[]{KSUtils.PLAIN_BUFFER, (byte) (length & 255)};
        }
        if (length <= 65535) {
            return new byte[]{-126, (byte) ((length & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8), (byte) (length & 255)};
        }
        return length <= 16777215 ? new byte[]{GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, (byte) ((length & 16711680) >> 16), (byte) ((length & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8), (byte) (length & 255)} : new byte[]{-124, (byte) (((-16777216) & length) >> 24), (byte) ((length & 16711680) >> 16), (byte) ((length & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8), (byte) (length & 255)};
    }

    public static byte[] createTlv(byte[] bArr, List<byte[]> list) {
        return createTlv(bArr, HexUtils.concatenateArrays(list));
    }
}
