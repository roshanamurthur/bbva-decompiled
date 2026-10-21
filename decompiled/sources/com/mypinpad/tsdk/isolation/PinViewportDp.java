package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/PinViewportDp;", "", "setDividerPadding", "setOnFocusChangeListener", "setY", "setCompoundDrawableTintBlendMode", "setX", "getNavBarTitleString", "setLayoutAnimation", "setOnLongClickListener", "setNavigationOnClickListener", "setOnDragListener"}, k = 1, mv = {1, 5, 1})
public final class PinViewportDp {
    public static final PinViewportDp getNavBarTitleString;
    public static final PinViewportDp setCompoundDrawableTintBlendMode;
    public static final PinViewportDp setDividerPadding;
    private static int setIncludeFontPadding = 1;
    public static final PinViewportDp setLayoutAnimation;
    public static final PinViewportDp setNavigationOnClickListener;
    public static final PinViewportDp setOnDragListener;
    public static final PinViewportDp setOnFocusChangeListener;
    public static final PinViewportDp setOnLongClickListener;
    private static final /* synthetic */ PinViewportDp[] setTextAlignment;
    public static final PinViewportDp setX;
    public static final PinViewportDp setY;
    private static int setZ;

    static {
        PinViewportDp pinViewportDp = new PinViewportDp("_NUMERIC", 0);
        setDividerPadding = pinViewportDp;
        PinViewportDp pinViewportDp2 = new PinViewportDp("_ALPHA_NUMERIC", 1);
        setOnFocusChangeListener = pinViewportDp2;
        PinViewportDp pinViewportDp3 = new PinViewportDp("_ALPHA_NUMERIC_SPECIAL", 2);
        setY = pinViewportDp3;
        PinViewportDp pinViewportDp4 = new PinViewportDp("_ALPHA_NUMERIC_SPACE", 3);
        setCompoundDrawableTintBlendMode = pinViewportDp4;
        PinViewportDp pinViewportDp5 = new PinViewportDp("_ALPHA", 4);
        setX = pinViewportDp5;
        PinViewportDp pinViewportDp6 = new PinViewportDp("_CN", 5);
        getNavBarTitleString = pinViewportDp6;
        PinViewportDp pinViewportDp7 = new PinViewportDp("_TIME_HHMMSS", 6);
        setLayoutAnimation = pinViewportDp7;
        PinViewportDp pinViewportDp8 = new PinViewportDp("_DATE_YYMMDD", 7);
        setOnLongClickListener = pinViewportDp8;
        PinViewportDp pinViewportDp9 = new PinViewportDp("_BINARY", 8);
        setNavigationOnClickListener = pinViewportDp9;
        PinViewportDp pinViewportDp10 = new PinViewportDp("_BINARY_16", 9);
        setOnDragListener = pinViewportDp10;
        int i10 = (74 ^ (-1)) + (74 << 1);
        int i11 = i10 % 128;
        setIncludeFontPadding = i11;
        int i12 = i10 % 2;
        PinViewportDp[] pinViewportDpArr = {pinViewportDp, pinViewportDp2, pinViewportDp3, pinViewportDp4, pinViewportDp5, pinViewportDp6, pinViewportDp7, pinViewportDp8, pinViewportDp9, pinViewportDp10};
        int i13 = (-2) - (((i11 & 32) + (i11 | 32)) ^ (-1));
        int i14 = i13 % 128;
        setZ = i14;
        int i15 = i13 % 2;
        setTextAlignment = pinViewportDpArr;
        int i16 = (i14 & (-42)) | ((~i14) & 41);
        int i17 = -(-((i14 & 41) << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        setIncludeFontPadding = i18 % 128;
        int i19 = i18 % 2;
    }

    public PinViewportDp() {
        throw null;
    }

    public static PinViewportDp valueOf(String str) {
        int i10 = setZ;
        int i11 = ((-1) << 1) - (((i10 & 108) + (i10 | 108)) ^ (-1));
        setIncludeFontPadding = i11 % 128;
        int i12 = i11 % 2;
        PinViewportDp pinViewportDp = (PinViewportDp) Enum.valueOf(PinViewportDp.class, str);
        int i13 = setIncludeFontPadding;
        int i14 = i13 & 25;
        int i15 = ((((i13 ^ 25) | i14) << 1) - (~(-((i13 | 25) & (~i14))))) - 1;
        setZ = i15 % 128;
        if (i15 % 2 == 0) {
            return pinViewportDp;
        }
        throw null;
    }

    public static PinViewportDp[] values() {
        int i10 = setIncludeFontPadding + 75;
        setZ = i10 % 128;
        int i11 = i10 % 2;
        PinViewportDp[] pinViewportDpArr = (PinViewportDp[]) setTextAlignment.clone();
        int i12 = setIncludeFontPadding;
        int i13 = i12 & 65;
        int i14 = (((i12 | 65) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
        setZ = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 26 / 0;
        }
        return pinViewportDpArr;
    }
}
