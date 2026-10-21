package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/setTextLocales;", "", "setNavigationOnClickListener", "setLayoutAnimation", "setDividerPadding", "setY", "setOnLongClickListener", "setAlwaysDrawnWithCacheEnabled", "setCompoundDrawableTintBlendMode", "setZ", "setX", "setOnFocusChangeListener", "setTextAlignment", "setOnDragListener", "getNavBarTitleString"}, k = 1, mv = {1, 5, 1})
public final class setTextLocales {
    private static final /* synthetic */ setTextLocales[] UiMessageCallbackKtWhenMappings;
    public static final setTextLocales getNavBarTitleString;
    private static setTextLocales setAlwaysDrawnWithCacheEnabled = null;
    public static final setTextLocales setCompoundDrawableTintBlendMode;
    public static final setTextLocales setDividerPadding;
    private static int setIncludeFontPadding = 0;
    private static setTextLocales setLayoutAnimation = null;
    private static setTextLocales setNavigationOnClickListener = null;
    public static final setTextLocales setOnDragListener;
    private static int setOnEditorActionListener = 1;
    public static final setTextLocales setOnFocusChangeListener;
    private static setTextLocales setOnLongClickListener;
    private static setTextLocales setTextAlignment;
    public static final setTextLocales setX;
    public static final setTextLocales setY;
    private static setTextLocales setZ;

    static {
        setTextLocales settextlocales = new setTextLocales("UPD", 0);
        setNavigationOnClickListener = settextlocales;
        setTextLocales settextlocales2 = new setTextLocales("QUERY", 1);
        setLayoutAnimation = settextlocales2;
        setTextLocales settextlocales3 = new setTextLocales("ACT", 2);
        setDividerPadding = settextlocales3;
        setTextLocales settextlocales4 = new setTextLocales("STOP", 3);
        setY = settextlocales4;
        setTextLocales settextlocales5 = new setTextLocales("ABORT", 4);
        setOnLongClickListener = settextlocales5;
        setTextLocales settextlocales6 = new setTextLocales("MSG", 5);
        setAlwaysDrawnWithCacheEnabled = settextlocales6;
        setTextLocales settextlocales7 = new setTextLocales("DET", 6);
        setCompoundDrawableTintBlendMode = settextlocales7;
        setTextLocales settextlocales8 = new setTextLocales("CLEAN", 7);
        setZ = settextlocales8;
        setTextLocales settextlocales9 = new setTextLocales("TIMEOUT", 8);
        setX = settextlocales9;
        setTextLocales settextlocales10 = new setTextLocales("PIN", 9);
        setOnFocusChangeListener = settextlocales10;
        setTextLocales settextlocales11 = new setTextLocales("TRM", 10);
        setTextAlignment = settextlocales11;
        setTextLocales settextlocales12 = new setTextLocales("ONLINE", 11);
        setOnDragListener = settextlocales12;
        setTextLocales settextlocales13 = new setTextLocales("ONLINEFAIL", 12);
        getNavBarTitleString = settextlocales13;
        setOnEditorActionListener = 69 % 128;
        int i10 = 69 % 2;
        setTextLocales[] settextlocalesArr = {settextlocales, settextlocales2, settextlocales3, settextlocales4, settextlocales5, settextlocales6, settextlocales7, settextlocales8, settextlocales9, settextlocales10, settextlocales11, settextlocales12, settextlocales13};
        int i11 = 53 % 128;
        setOnEditorActionListener = i11;
        if (53 % 2 == 0) {
            int i12 = 41 / 0;
        }
        UiMessageCallbackKtWhenMappings = settextlocalesArr;
        int i13 = (i11 | 107) << 1;
        int i14 = -(((~i11) & 107) | (i11 & (-108)));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        setIncludeFontPadding = i15 % 128;
        int i16 = i15 % 2;
    }

    public setTextLocales() {
        throw null;
    }

    public static setTextLocales valueOf(String str) {
        int i10 = setIncludeFontPadding + 31;
        setOnEditorActionListener = i10 % 128;
        int i11 = i10 % 2;
        setTextLocales settextlocales = (setTextLocales) Enum.valueOf(setTextLocales.class, str);
        int i12 = setIncludeFontPadding;
        int i13 = (i12 ^ 47) + ((i12 & 47) << 1);
        setOnEditorActionListener = i13 % 128;
        if (i13 % 2 != 0) {
            return settextlocales;
        }
        throw null;
    }

    public static setTextLocales[] values() {
        int i10 = setOnEditorActionListener;
        int i11 = i10 & 95;
        int i12 = (i10 | 95) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        setIncludeFontPadding = i14 % 128;
        int i15 = i14 % 2;
        setTextLocales[] settextlocalesArr = (setTextLocales[]) UiMessageCallbackKtWhenMappings.clone();
        int i16 = setOnEditorActionListener;
        int i17 = i16 & 69;
        int i18 = ((i16 ^ 69) | i17) << 1;
        int i19 = -((i16 | 69) & (~i17));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        setIncludeFontPadding = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 86 / 0;
        }
        return settextlocalesArr;
    }
}
