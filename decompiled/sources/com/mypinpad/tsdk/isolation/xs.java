package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006j\u0002\b\u0005j\u0002\b\tj\u0002\b\bj\u0002\b\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/xs;", "", "", "setZ", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setOnFocusChangeListener", "()I", "setIncludeFontPadding", "setX", "setCompoundDrawableTintBlendMode", "setTextAlignment", "setY", "UiMessageCallbackKtWhenMappings", "setDividerPadding", "setOnLongClickListener", "setLayoutAnimation", "setNavigationOnClickListener", "getNavBarTitleString", "setOnDragListener", "setAlwaysDrawnWithCacheEnabled"}, k = 1, mv = {1, 5, 1})
public enum xs {
    INTERNAL_AUTHENTICATE(0, 136, 0, 0),
    SELECT(0, 164, 4, 0),
    SELECT_NEXT(0, 164, 4, 2),
    READ_RECORD(0, 178, 0, 0),
    SPI(128, 26, 0, 0),
    GPO(128, 168, 0, 0),
    RESUME_GPO(128, ErrorCodes.ERR_CRY_BAD_PROTO, 0, 0),
    GET_DATA(128, 202, 0, 0),
    EXCHANGE_RELAY_RESISTANCE_DATA(128, 234, 0, 0),
    PUT_DATA(128, 218, 0, 0),
    GENERATE_AC(128, 174, 0, 0);

    private static int setChildDivider = 0;
    private static int setOnEditorActionListener = 1;

    /* JADX INFO: renamed from: UiMessageCallbackKtWhenMappings, reason: from kotlin metadata */
    private final int setDividerPadding;

    /* JADX INFO: renamed from: setIncludeFontPadding, reason: from kotlin metadata */
    private final int setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: setTextAlignment, reason: from kotlin metadata */
    private final int setY;

    /* JADX INFO: renamed from: setZ, reason: from kotlin metadata */
    private final int setOnFocusChangeListener;

    static {
        int i10 = 0 - (-97);
        int i11 = i10 % 128;
        setOnEditorActionListener = i11;
        int i12 = i10 % 2;
        int i13 = (i11 | 93) << 1;
        int i14 = -(i11 ^ 93);
        int i15 = (i13 & i14) + (i13 | i14);
        int i16 = i15 % 128;
        setChildDivider = i16;
        int i17 = i15 % 2;
        int i18 = i16 + 101;
        setOnEditorActionListener = i18 % 128;
        int i19 = i18 % 2;
    }

    xs(int i10, int i11, int i12, int i13) {
        this.setOnFocusChangeListener = i10;
        this.setCompoundDrawableTintBlendMode = i11;
        this.setY = i12;
        this.setDividerPadding = i13;
    }

    public static xs valueOf(String str) {
        int i10 = setChildDivider;
        int i11 = i10 & 57;
        int i12 = ((i10 | 57) & (~i11)) + (i11 << 1);
        setOnEditorActionListener = i12 % 128;
        int i13 = i12 % 2;
        xs xsVar = (xs) Enum.valueOf(xs.class, str);
        int i14 = setOnEditorActionListener;
        int i15 = ((i14 & (-24)) | ((~i14) & 23)) + ((i14 & 23) << 1);
        setChildDivider = i15 % 128;
        if (i15 % 2 == 0) {
            return xsVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static xs[] valuesCustom() {
        int i10 = setOnEditorActionListener;
        int i11 = (i10 & (-86)) | ((~i10) & 85);
        int i12 = (i10 & 85) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setChildDivider = i13 % 128;
        int i14 = i13 % 2;
        xs[] xsVarArr = (xs[]) values().clone();
        int i15 = setChildDivider;
        int i16 = ((i15 | 44) << 1) - (i15 ^ 44);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        setOnEditorActionListener = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 91 / 0;
        }
        return xsVarArr;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final int setCompoundDrawableTintBlendMode() {
        int i10 = setOnEditorActionListener;
        int i11 = i10 & 111;
        int i12 = (i10 ^ 111) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        setChildDivider = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        int i15 = this.setY;
        int i16 = (i14 & 93) + (i14 | 93);
        setOnEditorActionListener = i16 % 128;
        if (i16 % 2 != 0) {
            return i15;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    public final int setDividerPadding() {
        int i10 = setOnEditorActionListener;
        int i11 = i10 ^ 91;
        int i12 = -(-((i10 & 91) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setChildDivider = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setDividerPadding;
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final int setOnFocusChangeListener() {
        int i10 = setOnEditorActionListener;
        int i11 = ((i10 | 49) << 1) - (i10 ^ 49);
        setChildDivider = i11 % 128;
        if (i11 % 2 == 0) {
            return this.setOnFocusChangeListener;
        }
        throw null;
    }

    @JvmName(name = "setX")
    public final int setX() {
        int i10 = setOnEditorActionListener;
        int i11 = ((i10 & 85) - (~(i10 | 85))) - 1;
        setChildDivider = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = this.setCompoundDrawableTintBlendMode;
        int i13 = i10 & 117;
        int i14 = ((i10 | 117) & (~i13)) + (i13 << 1);
        setChildDivider = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 53 / 0;
        }
        return i12;
    }
}
