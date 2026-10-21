package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.TlvEditor;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ContactlessUtils {
    private static final /* synthetic */ ContactlessUtils[] $VALUES;
    public static final byte[] APPLICATION_LABEL_TAG;
    public static final byte[] FCI_PROPRIETARY_TAG;
    public static final byte[] FCI_TEMPLATE_TAG;
    public static final ContactlessUtils INSTANCE;

    static {
        ContactlessUtils contactlessUtils = new ContactlessUtils("INSTANCE", 0);
        INSTANCE = contactlessUtils;
        $VALUES = new ContactlessUtils[]{contactlessUtils};
        FCI_TEMPLATE_TAG = new byte[]{Constants.FCI_TEMPLATE};
        FCI_PROPRIETARY_TAG = new byte[]{-91};
        APPLICATION_LABEL_TAG = new byte[]{Constants.CVR_B1b85_0101_MOBILE_APP};
    }

    public ContactlessUtils() {
        throw null;
    }

    public static boolean isContextMatching(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z10) {
        if (bArr3 == null || !z10) {
            return true;
        }
        if (validateCurrency(bArr4, bArr2)) {
            return validateAmount(bArr3, bArr, z10);
        }
        return false;
    }

    public static byte[] readApplicationLabel(byte[] bArr) {
        TlvEditor tlvEditorOf;
        TlvEditor tlvEditorOf2;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        TlvEditor tlvEditorOf3 = TlvEditor.of(bArr2);
        if (tlvEditorOf3 == null || (tlvEditorOf = TlvEditor.of(tlvEditorOf3.getValue(FCI_TEMPLATE_TAG))) == null || (tlvEditorOf2 = TlvEditor.of(tlvEditorOf.getValue(FCI_PROPRIETARY_TAG))) == null) {
            return null;
        }
        return tlvEditorOf2.getValue(APPLICATION_LABEL_TAG);
    }

    public static boolean validateAmount(byte[] bArr, byte[] bArr2, boolean z10) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        Long lValueOf = Long.valueOf(McmLiteUtils.byteArrayToHexString(bArr2), 10);
        Long lValueOf2 = Long.valueOf(McmLiteUtils.byteArrayToHexString(bArr), 10);
        return (!z10 && lValueOf2.compareTo(lValueOf) >= 1) || lValueOf2.compareTo(lValueOf) == 0;
    }

    public static boolean validateCurrency(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null || !Arrays.equals(bArr2, bArr)) ? false : true;
    }

    public static ContactlessUtils valueOf(String str) {
        return (ContactlessUtils) Enum.valueOf(ContactlessUtils.class, str);
    }

    public static ContactlessUtils[] values() {
        return (ContactlessUtils[]) $VALUES.clone();
    }
}
