package com.mastercard.mpsdk.mcbp.mcmlite.utils;

import androidx.core.view.MotionEventCompat;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Tlv {
    private static final /* synthetic */ Tlv[] $VALUES;
    public static final Tlv INSTANCE;

    static {
        Tlv tlv = new Tlv("INSTANCE", 0);
        INSTANCE = tlv;
        $VALUES = new Tlv[]{tlv};
    }

    public Tlv() {
        throw null;
    }

    public static byte[] a(byte[] bArr) {
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

    public static byte[] create(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = a(bArr2);
        byte[] bArr3 = new byte[bArr.length + bArrA.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArrA, 0, bArr3, bArr.length, bArrA.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + bArrA.length, bArr2.length);
        return bArr3;
    }

    public static Tlv valueOf(String str) {
        return (Tlv) Enum.valueOf(Tlv.class, str);
    }

    public static Tlv[] values() {
        return (Tlv[]) $VALUES.clone();
    }

    public static String create(String str, String str2) {
        return (str + McmLiteUtils.byteArrayToHexString(a(McmLiteUtils.byteArrayFromHexString(str2))) + str2).toUpperCase();
    }
}
