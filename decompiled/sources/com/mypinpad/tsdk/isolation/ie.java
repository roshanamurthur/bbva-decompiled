package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/ie;", "", "setY", "setOnFocusChangeListener", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class ie {
    public static final ie setCompoundDrawableTintBlendMode;
    private static final /* synthetic */ ie[] setDividerPadding;
    public static final ie setOnFocusChangeListener;
    private static int setOnLongClickListener = 1;
    private static int setX;
    public static final ie setY;

    static {
        ie ieVar = new ie("ConditionsMet", 0);
        setY = ieVar;
        ie ieVar2 = new ie("ConditionNotMet", 1);
        setOnFocusChangeListener = ieVar2;
        ie ieVar3 = new ie("Error", 2);
        setCompoundDrawableTintBlendMode = ieVar3;
        int i10 = (1 & 41) + (1 | 41);
        int i11 = i10 % 128;
        setX = i11;
        int i12 = i10 % 2;
        ie[] ieVarArr = {ieVar, ieVar2, ieVar3};
        int i13 = (i11 & 61) + (i11 | 61);
        int i14 = i13 % 128;
        setOnLongClickListener = i14;
        int i15 = i13 % 2;
        setDividerPadding = ieVarArr;
        int i16 = i14 ^ 15;
        int i17 = -(-((i14 & 15) << 1));
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        setX = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 46 / 0;
        }
    }

    public ie() {
        throw null;
    }

    public static ie valueOf(String str) {
        int i10 = setOnLongClickListener;
        int i11 = ((-1) << 1) - ((-1) ^ ((i10 ^ 28) + ((i10 & 28) << 1)));
        setX = i11 % 128;
        int i12 = i11 % 2;
        ie ieVar = (ie) Enum.valueOf(ie.class, str);
        int i13 = setOnLongClickListener;
        int i14 = i13 & 115;
        int i15 = i14 + ((i13 ^ 115) | i14);
        setX = i15 % 128;
        if (i15 % 2 == 0) {
            return ieVar;
        }
        throw null;
    }

    public static ie[] values() {
        int i10 = setOnLongClickListener;
        int i11 = ((i10 | 63) << 1) - (i10 ^ 63);
        setX = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        ie[] ieVarArr = (ie[]) setDividerPadding.clone();
        int i12 = setX;
        int i13 = i12 & 9;
        int i14 = (i13 - (~(-(-((i12 ^ 9) | i13))))) - 1;
        setOnLongClickListener = i14 % 128;
        if (i14 % 2 != 0) {
            return ieVarArr;
        }
        throw null;
    }
}
