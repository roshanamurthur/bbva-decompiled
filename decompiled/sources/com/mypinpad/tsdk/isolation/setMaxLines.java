package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setMaxLines;", "", "setOnFocusChangeListener", "setY", "setX", "setDividerPadding", "setCompoundDrawableTintBlendMode", "setLayoutAnimation"}, k = 1, mv = {1, 5, 1})
public final class setMaxLines {
    private static final /* synthetic */ setMaxLines[] getNavBarTitleString;
    public static final setMaxLines setCompoundDrawableTintBlendMode;
    public static final setMaxLines setDividerPadding;
    public static final setMaxLines setLayoutAnimation;
    private static int setOnDragListener = 0;
    public static final setMaxLines setOnFocusChangeListener;
    private static int setOnLongClickListener = 1;
    public static final setMaxLines setX;
    public static final setMaxLines setY;

    static {
        setMaxLines[] setmaxlinesArr;
        setMaxLines setmaxlines = new setMaxLines("PREPROCESSING_START_A", 0);
        setOnFocusChangeListener = setmaxlines;
        setMaxLines setmaxlines2 = new setMaxLines("PROTOCOL_ACTIVATION_START_B", 1);
        setY = setmaxlines2;
        setMaxLines setmaxlines3 = new setMaxLines("COMBINATION_SELECTION_START_C", 2);
        setX = setmaxlines3;
        setMaxLines setmaxlines4 = new setMaxLines("KERNEL_ACTIVATION_START_D", 3);
        setDividerPadding = setmaxlines4;
        setMaxLines setmaxlines5 = new setMaxLines("ONLINE_PROCESSING", 4);
        setCompoundDrawableTintBlendMode = setmaxlines5;
        setMaxLines setmaxlines6 = new setMaxLines("END_PROCESSING", 5);
        setLayoutAnimation = setmaxlines6;
        int i10 = (1 ^ 73) + ((1 & 73) << 1);
        int i11 = i10 % 128;
        setOnDragListener = i11;
        if (i10 % 2 != 0) {
            setmaxlinesArr = new setMaxLines[107];
            setmaxlinesArr[1] = setmaxlines;
            setmaxlinesArr[0] = setmaxlines2;
            setmaxlinesArr[2] = setmaxlines3;
            setmaxlinesArr[3] = setmaxlines4;
            setmaxlinesArr[4] = setmaxlines5;
            setmaxlinesArr[2] = setmaxlines6;
        } else {
            setmaxlinesArr = new setMaxLines[]{setmaxlines, setmaxlines2, setmaxlines3, setmaxlines4, setmaxlines5, setmaxlines6};
        }
        getNavBarTitleString = setmaxlinesArr;
        int i12 = ((-1) << 1) - ((-1) ^ (i11 + 78));
        setOnLongClickListener = i12 % 128;
        int i13 = i12 % 2;
    }

    public setMaxLines() {
        throw null;
    }

    public static setMaxLines valueOf(String str) {
        int i10 = setOnLongClickListener;
        int i11 = (((i10 | 64) << 1) - (i10 ^ 64)) - 1;
        setOnDragListener = i11 % 128;
        int i12 = i11 % 2;
        setMaxLines setmaxlines = (setMaxLines) Enum.valueOf(setMaxLines.class, str);
        int i13 = setOnDragListener + 68;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        setOnLongClickListener = i14 % 128;
        if (i14 % 2 != 0) {
            return setmaxlines;
        }
        throw null;
    }

    public static setMaxLines[] values() {
        int i10 = setOnDragListener;
        int i11 = i10 & 59;
        int i12 = (i10 ^ 59) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setOnLongClickListener = i13 % 128;
        int i14 = i13 % 2;
        setMaxLines[] setmaxlinesArr = (setMaxLines[]) getNavBarTitleString.clone();
        int i15 = setOnDragListener;
        int i16 = i15 & 101;
        int i17 = -(-((i15 ^ 101) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        setOnLongClickListener = i18 % 128;
        int i19 = i18 % 2;
        return setmaxlinesArr;
    }
}
