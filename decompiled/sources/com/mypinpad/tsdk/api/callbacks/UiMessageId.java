package com.mypinpad.tsdk.api.callbacks;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/UiMessageId;", "", "", "setDividerPadding", "B", "getId", "()B", "id", "APPROVED", "NOT_AUTHORISED", "PLEASE_ENTER_PIN", "PROCESSING_ERROR", "PRESENT_CARD", "CARD_READ_OK_PLEASE_REMOVE", "APPROVED_PLEASE_SIGN", "AUTHORISING_PLEASE_WAIT", "TRY_ANOTHER_CARD", "CLEAR_DISPLAY", "SEE_PHONE", "PRESENT_CARD_AGAIN", "HOLD_STILL"}, k = 1, mv = {1, 8, 0})
public enum UiMessageId {
    APPROVED((byte) 3),
    NOT_AUTHORISED((byte) 7),
    PLEASE_ENTER_PIN((byte) 9),
    PROCESSING_ERROR((byte) 15),
    PRESENT_CARD(MessageUtils.MESSAGE_21_NAK),
    CARD_READ_OK_PLEASE_REMOVE((byte) 23),
    APPROVED_PLEASE_SIGN(MessageUtils.MESSAGE_26_SUB),
    AUTHORISING_PLEASE_WAIT((byte) 27),
    TRY_ANOTHER_CARD((byte) 28),
    CLEAR_DISPLAY(MessageUtils.MESSAGE_30_RS),
    SEE_PHONE((byte) 32),
    PRESENT_CARD_AGAIN((byte) 33),
    HOLD_STILL(Constants.CVR_B1b85_0111_VERIFIED_CLOUD);

    private static int setCompoundDrawableTintBlendMode = 0;
    private static int setX = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    private final byte id;

    static {
        int i10 = 1 - (-100);
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        setCompoundDrawableTintBlendMode = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((1 | 81) << 1) - (1 ^ 81);
        int i14 = i13 % 128;
        setCompoundDrawableTintBlendMode = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 77;
        setX = i16 % 128;
        int i17 = i16 % 2;
    }

    UiMessageId(byte b10) {
        this.id = b10;
    }

    public static UiMessageId valueOf(String str) {
        int i10 = setX;
        int i11 = i10 & 123;
        int i12 = ((i10 ^ 123) | i11) << 1;
        int i13 = -((i10 | 123) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        setCompoundDrawableTintBlendMode = i14 % 128;
        int i15 = i14 % 2;
        UiMessageId uiMessageId = (UiMessageId) Enum.valueOf(UiMessageId.class, str);
        int i16 = setCompoundDrawableTintBlendMode;
        int i17 = (i16 ^ 99) + ((i16 & 99) << 1);
        setX = i17 % 128;
        if (i17 % 2 != 0) {
            return uiMessageId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static UiMessageId[] valuesCustom() {
        int i10 = setCompoundDrawableTintBlendMode;
        int i11 = i10 & 33;
        int i12 = (((i10 | 33) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        setX = i12 % 128;
        if (i12 % 2 != 0) {
            return (UiMessageId[]) values().clone();
        }
        int i13 = 68 / 0;
        return (UiMessageId[]) values().clone();
    }

    @JvmName(name = "getId")
    public final byte getId() {
        int i10 = setCompoundDrawableTintBlendMode;
        int i11 = i10 & 125;
        int i12 = ((i10 | 125) & (~i11)) + (i11 << 1);
        setX = i12 % 128;
        if (i12 % 2 != 0) {
            return this.id;
        }
        int i13 = 38 / 0;
        return this.id;
    }
}
