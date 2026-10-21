package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0011\u0010\u0005\u001a\u00020\u0002X\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0005j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setSupportBackgroundTintMode;", "", "", "setX", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setY", "setCompoundDrawableTintBlendMode", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class setSupportBackgroundTintMode {
    public static final setSupportBackgroundTintMode setCompoundDrawableTintBlendMode;
    public static final setSupportBackgroundTintMode setDividerPadding;
    private static int setLayoutAnimation = 0;
    private static int setOnDragListener = 1;
    private static final /* synthetic */ setSupportBackgroundTintMode[] setOnFocusChangeListener;
    public static final setSupportBackgroundTintMode setY;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    public int setY;

    static {
        setSupportBackgroundTintMode setsupportbackgroundtintmode = new setSupportBackgroundTintMode("READ_RECORD", 0, 0);
        setCompoundDrawableTintBlendMode = setsupportbackgroundtintmode;
        setSupportBackgroundTintMode setsupportbackgroundtintmode2 = new setSupportBackgroundTintMode("GET_DATA", 1, 1);
        setY = setsupportbackgroundtintmode2;
        setSupportBackgroundTintMode setsupportbackgroundtintmode3 = new setSupportBackgroundTintMode(ExpectedUserActionOnPoiTypes.NONE, 2, 16);
        setDividerPadding = setsupportbackgroundtintmode3;
        int i10 = (1 ^ 49) + ((1 & 49) << 1);
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        setSupportBackgroundTintMode[] setsupportbackgroundtintmodeArr = {setsupportbackgroundtintmode, setsupportbackgroundtintmode2, setsupportbackgroundtintmode3};
        int i12 = 1 & 123;
        int i13 = i12 + ((1 ^ 123) | i12);
        setLayoutAnimation = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        setOnFocusChangeListener = setsupportbackgroundtintmodeArr;
        int i14 = 1 & 69;
        int i15 = -(-((1 ^ 69) | i14));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        setLayoutAnimation = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public setSupportBackgroundTintMode(String str, int i10, int i11) {
        super(str, i10);
        this.setY = i11;
    }

    public static setSupportBackgroundTintMode valueOf(String str) {
        int i10 = setLayoutAnimation;
        int i11 = (i10 & (-40)) | ((~i10) & 39);
        int i12 = (i10 & 39) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setOnDragListener = i13 % 128;
        int i14 = i13 % 2;
        setSupportBackgroundTintMode setsupportbackgroundtintmode = (setSupportBackgroundTintMode) Enum.valueOf(setSupportBackgroundTintMode.class, str);
        int i15 = setLayoutAnimation;
        int i16 = i15 & 67;
        int i17 = i15 | 67;
        int i18 = (i16 & i17) + (i17 | i16);
        setOnDragListener = i18 % 128;
        int i19 = i18 % 2;
        return setsupportbackgroundtintmode;
    }

    public static setSupportBackgroundTintMode[] values() {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 33;
        int i12 = i11 + ((i10 ^ 33) | i11);
        setOnDragListener = i12 % 128;
        int i13 = i12 % 2;
        setSupportBackgroundTintMode[] setsupportbackgroundtintmodeArr = setOnFocusChangeListener;
        if (i13 != 0) {
            return (setSupportBackgroundTintMode[]) setsupportbackgroundtintmodeArr.clone();
        }
        throw null;
    }
}
