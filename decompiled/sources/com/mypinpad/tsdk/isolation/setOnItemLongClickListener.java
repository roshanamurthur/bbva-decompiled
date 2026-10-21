package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0011\u0010\u0005\u001a\u00020\u0002X\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0005j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setOnItemLongClickListener;", "", "", "setCompoundDrawableTintBlendMode", "B", "setDividerPadding", "setOnFocusChangeListener", "setY"}, k = 1, mv = {1, 5, 1})
public final class setOnItemLongClickListener {
    public static final setOnItemLongClickListener setDividerPadding;
    private static int setLayoutAnimation = 0;
    private static int setNavigationOnClickListener = 1;
    public static final setOnItemLongClickListener setOnFocusChangeListener;
    private static final /* synthetic */ setOnItemLongClickListener[] setX;
    public static final setOnItemLongClickListener setY;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    public byte setDividerPadding;

    static {
        setOnItemLongClickListener setonitemlongclicklistener = new setOnItemLongClickListener(ExpectedUserActionOnPoiTypes.NONE, 0, (byte) 0);
        setOnFocusChangeListener = setonitemlongclicklistener;
        setOnItemLongClickListener setonitemlongclicklistener2 = new setOnItemLongClickListener("AMOUNT", 1, (byte) 16);
        setDividerPadding = setonitemlongclicklistener2;
        setOnItemLongClickListener setonitemlongclicklistener3 = new setOnItemLongClickListener("BALANCE", 2, (byte) 32);
        setY = setonitemlongclicklistener3;
        int i10 = 1 & 33;
        int i11 = ((1 ^ 33) | i10) << 1;
        int i12 = -((~i10) & (1 | 33));
        int i13 = (i11 & i12) + (i11 | i12);
        setLayoutAnimation = i13 % 128;
        int i14 = i13 % 2;
        setOnItemLongClickListener[] setonitemlongclicklistenerArr = {setonitemlongclicklistener, setonitemlongclicklistener2, setonitemlongclicklistener3};
        int i15 = 1 & 57;
        int i16 = (((~i15) & (1 | 57)) - (~(i15 << 1))) - 1;
        int i17 = i16 % 128;
        setLayoutAnimation = i17;
        if (i16 % 2 != 0) {
            int i18 = 27 / 0;
        }
        setX = setonitemlongclicklistenerArr;
        int i19 = (i17 & (-96)) | ((~i17) & 95);
        int i20 = -(-((i17 & 95) << 1));
        int i21 = (i19 & i20) + (i20 | i19);
        setNavigationOnClickListener = i21 % 128;
        int i22 = i21 % 2;
    }

    public setOnItemLongClickListener(String str, int i10, byte b10) {
        super(str, i10);
        this.setDividerPadding = b10;
    }

    public static setOnItemLongClickListener valueOf(String str) {
        int i10 = setNavigationOnClickListener;
        int i11 = ((i10 & 38) + (i10 | 38)) - 1;
        setLayoutAnimation = i11 % 128;
        int i12 = i11 % 2;
        setOnItemLongClickListener setonitemlongclicklistener = (setOnItemLongClickListener) Enum.valueOf(setOnItemLongClickListener.class, str);
        int i13 = setLayoutAnimation;
        int i14 = (i13 & (-90)) | ((~i13) & 89);
        int i15 = -(-((i13 & 89) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        setNavigationOnClickListener = i16 % 128;
        int i17 = i16 % 2;
        return setonitemlongclicklistener;
    }

    public static setOnItemLongClickListener[] values() {
        int i10 = setNavigationOnClickListener;
        int i11 = i10 & 23;
        int i12 = ((i10 ^ 23) | i11) << 1;
        int i13 = -((i10 | 23) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        setLayoutAnimation = i14 % 128;
        int i15 = i14 % 2;
        setOnItemLongClickListener[] setonitemlongclicklistenerArr = (setOnItemLongClickListener[]) setX.clone();
        int i16 = setLayoutAnimation;
        int i17 = ((i16 ^ 89) - (~(-(-((i16 & 89) << 1))))) - 1;
        setNavigationOnClickListener = i17 % 128;
        if (i17 % 2 != 0) {
            return setonitemlongclicklistenerArr;
        }
        throw null;
    }
}
