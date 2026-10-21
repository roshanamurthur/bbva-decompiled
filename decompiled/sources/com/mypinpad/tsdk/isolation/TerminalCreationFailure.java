package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/mypinpad/tsdk/i/TerminalCreationFailure;", "", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setOnFocusChangeListener", "setY", "setX", "getNavBarTitleString", "setOnLongClickListener", "setLayoutAnimation", "setNavigationOnClickListener", "setOnDragListener", "setZ"}, k = 1, mv = {1, 5, 1})
public final class TerminalCreationFailure {
    private static int UiMessageCallbackKtWhenMappings = 1;
    public static final TerminalCreationFailure getNavBarTitleString;
    private static final /* synthetic */ TerminalCreationFailure[] setAlwaysDrawnWithCacheEnabled;
    public static final TerminalCreationFailure setCompoundDrawableTintBlendMode;
    public static final TerminalCreationFailure setDividerPadding;
    public static final TerminalCreationFailure setLayoutAnimation;
    public static final TerminalCreationFailure setNavigationOnClickListener;
    public static final TerminalCreationFailure setOnDragListener;
    public static final TerminalCreationFailure setOnFocusChangeListener;
    public static final TerminalCreationFailure setOnLongClickListener;
    private static int setTextAlignment;
    public static final TerminalCreationFailure setX;
    public static final TerminalCreationFailure setY;
    public static final TerminalCreationFailure setZ;

    static {
        TerminalCreationFailure terminalCreationFailure = new TerminalCreationFailure("None", 0);
        setCompoundDrawableTintBlendMode = terminalCreationFailure;
        TerminalCreationFailure terminalCreationFailure2 = new TerminalCreationFailure("_61", 1);
        setDividerPadding = terminalCreationFailure2;
        TerminalCreationFailure terminalCreationFailure3 = new TerminalCreationFailure("_6F", 2);
        setOnFocusChangeListener = terminalCreationFailure3;
        TerminalCreationFailure terminalCreationFailure4 = new TerminalCreationFailure("_70", 3);
        setY = terminalCreationFailure4;
        TerminalCreationFailure terminalCreationFailure5 = new TerminalCreationFailure("_71", 4);
        setX = terminalCreationFailure5;
        TerminalCreationFailure terminalCreationFailure6 = new TerminalCreationFailure("_72", 5);
        getNavBarTitleString = terminalCreationFailure6;
        TerminalCreationFailure terminalCreationFailure7 = new TerminalCreationFailure("_73", 6);
        setOnLongClickListener = terminalCreationFailure7;
        TerminalCreationFailure terminalCreationFailure8 = new TerminalCreationFailure("_77", 7);
        setLayoutAnimation = terminalCreationFailure8;
        TerminalCreationFailure terminalCreationFailure9 = new TerminalCreationFailure("_80", 8);
        setNavigationOnClickListener = terminalCreationFailure9;
        TerminalCreationFailure terminalCreationFailure10 = new TerminalCreationFailure("_A5", 9);
        setOnDragListener = terminalCreationFailure10;
        TerminalCreationFailure terminalCreationFailure11 = new TerminalCreationFailure("_BF0C", 10);
        setZ = terminalCreationFailure11;
        int i10 = (104 << 1) - 105;
        UiMessageCallbackKtWhenMappings = i10 % 128;
        int i11 = i10 % 2;
        TerminalCreationFailure[] terminalCreationFailureArr = {terminalCreationFailure, terminalCreationFailure2, terminalCreationFailure3, terminalCreationFailure4, terminalCreationFailure5, terminalCreationFailure6, terminalCreationFailure7, terminalCreationFailure8, terminalCreationFailure9, terminalCreationFailure10, terminalCreationFailure11};
        int i12 = 64 - 1;
        UiMessageCallbackKtWhenMappings = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        setAlwaysDrawnWithCacheEnabled = terminalCreationFailureArr;
        int i13 = (61 << 1) - 61;
        UiMessageCallbackKtWhenMappings = i13 % 128;
        int i14 = i13 % 2;
    }

    public TerminalCreationFailure() {
        throw null;
    }

    public static TerminalCreationFailure valueOf(String str) {
        int i10 = setTextAlignment + 125;
        UiMessageCallbackKtWhenMappings = i10 % 128;
        int i11 = i10 % 2;
        TerminalCreationFailure terminalCreationFailure = (TerminalCreationFailure) Enum.valueOf(TerminalCreationFailure.class, str);
        if (i11 == 0) {
            int i12 = 29 / 0;
        }
        int i13 = UiMessageCallbackKtWhenMappings;
        int i14 = i13 & 65;
        int i15 = (i13 | 65) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        setTextAlignment = i17 % 128;
        int i18 = i17 % 2;
        return terminalCreationFailure;
    }

    public static TerminalCreationFailure[] values() {
        int i10 = setTextAlignment;
        int i11 = i10 & 109;
        int i12 = (i10 | 109) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        UiMessageCallbackKtWhenMappings = i14 % 128;
        int i15 = i14 % 2;
        TerminalCreationFailure[] terminalCreationFailureArr = (TerminalCreationFailure[]) setAlwaysDrawnWithCacheEnabled.clone();
        int i16 = setTextAlignment;
        int i17 = (i16 & 21) + (i16 | 21);
        UiMessageCallbackKtWhenMappings = i17 % 128;
        if (i17 % 2 != 0) {
            return terminalCreationFailureArr;
        }
        throw null;
    }
}
