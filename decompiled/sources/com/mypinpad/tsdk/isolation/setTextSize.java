package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setTextSize;", "", "setOnFocusChangeListener", "setDividerPadding", "setX", "setY", "setCompoundDrawableTintBlendMode", "setOnLongClickListener"}, k = 1, mv = {1, 5, 1})
public final class setTextSize {
    private static final /* synthetic */ setTextSize[] getNavBarTitleString;
    public static final setTextSize setCompoundDrawableTintBlendMode;
    public static final setTextSize setDividerPadding;
    private static int setNavigationOnClickListener = 0;
    private static int setOnDragListener = 1;
    public static final setTextSize setOnFocusChangeListener;
    public static final setTextSize setOnLongClickListener;
    public static final setTextSize setX;
    public static final setTextSize setY;

    static {
        setTextSize settextsize = new setTextSize(ExpectedUserActionOnPoiTypes.NONE, 0);
        setOnFocusChangeListener = settextsize;
        setTextSize settextsize2 = new setTextSize("K", 1);
        setDividerPadding = settextsize2;
        setTextSize settextsize3 = new setTextSize("ACT", 2);
        setX = settextsize3;
        setTextSize settextsize4 = new setTextSize("DET", 3);
        setY = settextsize4;
        setTextSize settextsize5 = new setTextSize("RA", 4);
        setCompoundDrawableTintBlendMode = settextsize5;
        setTextSize settextsize6 = new setTextSize("CONFIG", 5);
        setOnLongClickListener = settextsize6;
        int i10 = -(-19);
        int i11 = (i10 << 1) - i10;
        int i12 = i11 % 128;
        setOnDragListener = i12;
        int i13 = i11 % 2;
        setTextSize[] settextsizeArr = {settextsize, settextsize2, settextsize3, settextsize4, settextsize5, settextsize6};
        int i14 = i12 + 79;
        setNavigationOnClickListener = i14 % 128;
        int i15 = i14 % 2;
        getNavBarTitleString = settextsizeArr;
        int i16 = ((i12 ^ 61) | (i12 & 61)) << 1;
        int i17 = -((i12 & (-62)) | ((~i12) & 61));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        setNavigationOnClickListener = i18 % 128;
        int i19 = i18 % 2;
    }

    public setTextSize() {
        throw null;
    }

    public static setTextSize valueOf(String str) {
        int i10 = setNavigationOnClickListener;
        int i11 = (((i10 ^ 59) | (i10 & 59)) << 1) - (((~i10) & 59) | (i10 & (-60)));
        setOnDragListener = i11 % 128;
        if (i11 % 2 != 0) {
            return (setTextSize) Enum.valueOf(setTextSize.class, str);
        }
        Enum.valueOf(setTextSize.class, str);
        throw null;
    }

    public static setTextSize[] values() {
        int i10 = setNavigationOnClickListener + 37;
        setOnDragListener = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        setTextSize[] settextsizeArr = (setTextSize[]) getNavBarTitleString.clone();
        int i11 = setNavigationOnClickListener + 121;
        setOnDragListener = i11 % 128;
        int i12 = i11 % 2;
        return settextsizeArr;
    }
}
