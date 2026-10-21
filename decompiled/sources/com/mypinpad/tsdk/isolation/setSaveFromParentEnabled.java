package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/setSaveFromParentEnabled;", "", "setX", "setOnFocusChangeListener", "setY", "setDividerPadding", "setCompoundDrawableTintBlendMode", "setLayoutAnimation"}, k = 1, mv = {1, 5, 1})
public final class setSaveFromParentEnabled {
    private static int getNavBarTitleString = 0;
    public static final setSaveFromParentEnabled setCompoundDrawableTintBlendMode;
    public static final setSaveFromParentEnabled setDividerPadding;
    public static final setSaveFromParentEnabled setLayoutAnimation;
    private static final /* synthetic */ setSaveFromParentEnabled[] setNavigationOnClickListener;
    public static final setSaveFromParentEnabled setOnFocusChangeListener;
    private static int setOnLongClickListener = 1;
    public static final setSaveFromParentEnabled setX;
    public static final setSaveFromParentEnabled setY;

    static {
        setSaveFromParentEnabled[] setsavefromparentenabledArr;
        setSaveFromParentEnabled setsavefromparentenabled = new setSaveFromParentEnabled("NO_CARD_APPLICATION_SELECTOR_MISMATCHED", 0);
        setX = setsavefromparentenabled;
        setSaveFromParentEnabled setsavefromparentenabled2 = new setSaveFromParentEnabled("NO_CARD_APPLICATION", 1);
        setOnFocusChangeListener = setsavefromparentenabled2;
        setSaveFromParentEnabled setsavefromparentenabled3 = new setSaveFromParentEnabled("CARD_ERROR", 2);
        setY = setsavefromparentenabled3;
        setSaveFromParentEnabled setsavefromparentenabled4 = new setSaveFromParentEnabled("PROCESSING_ERROR", 3);
        setDividerPadding = setsavefromparentenabled4;
        setSaveFromParentEnabled setsavefromparentenabled5 = new setSaveFromParentEnabled("INVALID_AUTHORISATION_DATA", 4);
        setCompoundDrawableTintBlendMode = setsavefromparentenabled5;
        setSaveFromParentEnabled setsavefromparentenabled6 = new setSaveFromParentEnabled("ONLINE_DECLINED", 5);
        setLayoutAnimation = setsavefromparentenabled6;
        int i10 = 1 + 41;
        getNavBarTitleString = i10 % 128;
        if (i10 % 2 != 0) {
            setsavefromparentenabledArr = new setSaveFromParentEnabled[102];
            setsavefromparentenabledArr[1] = setsavefromparentenabled;
            setsavefromparentenabledArr[0] = setsavefromparentenabled2;
            setsavefromparentenabledArr[3] = setsavefromparentenabled3;
            setsavefromparentenabledArr[2] = setsavefromparentenabled4;
            setsavefromparentenabledArr[4] = setsavefromparentenabled5;
            setsavefromparentenabledArr[2] = setsavefromparentenabled6;
        } else {
            setsavefromparentenabledArr = new setSaveFromParentEnabled[]{setsavefromparentenabled, setsavefromparentenabled2, setsavefromparentenabled3, setsavefromparentenabled4, setsavefromparentenabled5, setsavefromparentenabled6};
        }
        int i11 = ((1 | 51) << 1) - (1 ^ 51);
        int i12 = i11 % 128;
        getNavBarTitleString = i12;
        int i13 = i11 % 2;
        setNavigationOnClickListener = setsavefromparentenabledArr;
        int i14 = ((i12 | 27) << 1) - (i12 ^ 27);
        setOnLongClickListener = i14 % 128;
        int i15 = i14 % 2;
    }

    public setSaveFromParentEnabled() {
        throw null;
    }

    public static setSaveFromParentEnabled valueOf(String str) {
        int i10 = setOnLongClickListener + 99;
        getNavBarTitleString = i10 % 128;
        int i11 = i10 % 2;
        setSaveFromParentEnabled setsavefromparentenabled = (setSaveFromParentEnabled) Enum.valueOf(setSaveFromParentEnabled.class, str);
        if (i11 != 0) {
            int i12 = 47 / 0;
        }
        int i13 = setOnLongClickListener;
        int i14 = ((i13 | 29) << 1) - (i13 ^ 29);
        getNavBarTitleString = i14 % 128;
        int i15 = i14 % 2;
        return setsavefromparentenabled;
    }

    public static setSaveFromParentEnabled[] values() {
        int i10 = setOnLongClickListener;
        int i11 = (i10 & 27) + (i10 | 27);
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        setSaveFromParentEnabled[] setsavefromparentenabledArr = (setSaveFromParentEnabled[]) setNavigationOnClickListener.clone();
        int i13 = setOnLongClickListener;
        int i14 = ((i13 | 67) << 1) - (i13 ^ 67);
        getNavBarTitleString = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 8 / 0;
        }
        return setsavefromparentenabledArr;
    }
}
