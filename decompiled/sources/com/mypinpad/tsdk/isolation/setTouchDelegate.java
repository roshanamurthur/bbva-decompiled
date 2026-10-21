package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setTouchDelegate;", "", "setY", "setDividerPadding", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class setTouchDelegate {
    private static int getNavBarTitleString = 0;
    private static setTouchDelegate setCompoundDrawableTintBlendMode = null;
    public static final setTouchDelegate setDividerPadding;
    private static setTouchDelegate setOnFocusChangeListener = null;
    private static int setOnLongClickListener = 1;
    private static final /* synthetic */ setTouchDelegate[] setX;
    public static final setTouchDelegate setY;

    static {
        setTouchDelegate settouchdelegate = new setTouchDelegate("StartA", 0);
        setY = settouchdelegate;
        setTouchDelegate settouchdelegate2 = new setTouchDelegate("StartB", 1);
        setDividerPadding = settouchdelegate2;
        setTouchDelegate settouchdelegate3 = new setTouchDelegate("StartC", 2);
        setOnFocusChangeListener = settouchdelegate3;
        setTouchDelegate settouchdelegate4 = new setTouchDelegate("StartD", 3);
        setCompoundDrawableTintBlendMode = settouchdelegate4;
        int i10 = (((1 | 36) << 1) - (1 ^ 36)) - 1;
        getNavBarTitleString = i10 % 128;
        int i11 = i10 % 2;
        setTouchDelegate[] settouchdelegateArr = {settouchdelegate, settouchdelegate2, settouchdelegate3, settouchdelegate4};
        int i12 = 1 & 73;
        int i13 = (~i12) & (1 | 73);
        int i14 = i12 << 1;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = i15 % 128;
        getNavBarTitleString = i16;
        if (i15 % 2 != 0) {
            throw null;
        }
        setX = settouchdelegateArr;
        int i17 = ((-1) << 1) - ((-1) ^ ((i16 & 34) + (i16 | 34)));
        setOnLongClickListener = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 62 / 0;
        }
    }

    public setTouchDelegate() {
        throw null;
    }

    public static setTouchDelegate valueOf(String str) {
        int i10 = getNavBarTitleString;
        int i11 = i10 & 63;
        int i12 = ((((i10 ^ 63) | i11) << 1) - (~(-((i10 | 63) & (~i11))))) - 1;
        setOnLongClickListener = i12 % 128;
        if (i12 % 2 != 0) {
            return (setTouchDelegate) Enum.valueOf(setTouchDelegate.class, str);
        }
        Enum.valueOf(setTouchDelegate.class, str);
        throw null;
    }

    public static setTouchDelegate[] values() {
        setTouchDelegate[] settouchdelegateArr;
        int i10 = getNavBarTitleString;
        int i11 = (((i10 ^ 17) | (i10 & 17)) << 1) - (((~i10) & 17) | (i10 & (-18)));
        setOnLongClickListener = i11 % 128;
        int i12 = i11 % 2;
        setTouchDelegate[] settouchdelegateArr2 = setX;
        if (i12 == 0) {
            settouchdelegateArr = (setTouchDelegate[]) settouchdelegateArr2.clone();
            int i13 = 48 / 0;
        } else {
            settouchdelegateArr = (setTouchDelegate[]) settouchdelegateArr2.clone();
        }
        int i14 = getNavBarTitleString;
        int i15 = (i14 & 41) + (i14 | 41);
        setOnLongClickListener = i15 % 128;
        int i16 = i15 % 2;
        return settouchdelegateArr;
    }
}
