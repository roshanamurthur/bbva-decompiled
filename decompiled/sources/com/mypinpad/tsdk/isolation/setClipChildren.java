package com.mypinpad.tsdk.isolation;

import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0011\u0010\u0005\u001a\u00020\u0002X\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/setClipChildren;", "", "", "setY", "B", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setX", "setDividerPadding", "setOnLongClickListener", "setOnDragListener", "setNavigationOnClickListener", "setLayoutAnimation", "getNavBarTitleString", "setTextAlignment", "setZ", "setAlwaysDrawnWithCacheEnabled", "setIncludeFontPadding"}, k = 1, mv = {1, 5, 1})
public final class setClipChildren {
    private static final /* synthetic */ setClipChildren[] UiMessageCallbackKtWhenMappings;
    public static final setClipChildren getNavBarTitleString;
    public static final setClipChildren setAlwaysDrawnWithCacheEnabled;
    private static int setChildDivider = 1;
    public static final setClipChildren setCompoundDrawableTintBlendMode;
    public static final setClipChildren setDividerPadding;
    public static final setClipChildren setIncludeFontPadding;
    public static final setClipChildren setLayoutAnimation;
    public static final setClipChildren setNavigationOnClickListener;
    public static final setClipChildren setOnDragListener;
    public static final setClipChildren setOnFocusChangeListener;
    public static final setClipChildren setOnLongClickListener;
    public static final setClipChildren setTextAlignment;
    private static int setTextScaleX;
    public static final setClipChildren setX;
    public static final setClipChildren setZ;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    public byte setCompoundDrawableTintBlendMode;

    static {
        setClipChildren setclipchildren = new setClipChildren("PRESENT_CARD", 0, MessageUtils.MESSAGE_21_NAK);
        setOnFocusChangeListener = setclipchildren;
        setClipChildren setclipchildren2 = new setClipChildren("ERROR_OTHER_CARD", 1, (byte) 28);
        setX = setclipchildren2;
        setClipChildren setclipchildren3 = new setClipChildren("CLEAR_DISPLAY", 2, MessageUtils.MESSAGE_30_RS);
        setCompoundDrawableTintBlendMode = setclipchildren3;
        setClipChildren setclipchildren4 = new setClipChildren("APPROVED", 3, (byte) 3);
        setDividerPadding = setclipchildren4;
        setClipChildren setclipchildren5 = new setClipChildren("PRESENT_CARD_AGAIN", 4, (byte) 33);
        setOnLongClickListener = setclipchildren5;
        setClipChildren setclipchildren6 = new setClipChildren("APPROVED_SIGN", 5, MessageUtils.MESSAGE_26_SUB);
        setOnDragListener = setclipchildren6;
        setClipChildren setclipchildren7 = new setClipChildren("NOT_AUTHORISED", 6, (byte) 7);
        setNavigationOnClickListener = setclipchildren7;
        setClipChildren setclipchildren8 = new setClipChildren("INSERT_CARD", 7, (byte) 29);
        setLayoutAnimation = setclipchildren8;
        setClipChildren setclipchildren9 = new setClipChildren("SEE_PHONE", 8, (byte) 32);
        getNavBarTitleString = setclipchildren9;
        setClipChildren setclipchildren10 = new setClipChildren("AUTHORISING_PLEASE_WAIT", 9, (byte) 27);
        setTextAlignment = setclipchildren10;
        setClipChildren setclipchildren11 = new setClipChildren("CARD_READ_OK", 10, (byte) 23);
        setZ = setclipchildren11;
        setClipChildren setclipchildren12 = new setClipChildren("NA", 11, (byte) -1);
        setAlwaysDrawnWithCacheEnabled = setclipchildren12;
        setClipChildren setclipchildren13 = new setClipChildren("END_TRANSACTION", 12, (byte) 0, 1, null);
        setIncludeFontPadding = setclipchildren13;
        int i10 = setTextScaleX;
        int i11 = ((i10 ^ 69) - (~(-(-((i10 & 69) << 1))))) - 1;
        setChildDivider = i11 % 128;
        int i12 = i11 % 2;
        setClipChildren[] setclipchildrenArr = {setclipchildren, setclipchildren2, setclipchildren3, setclipchildren4, setclipchildren5, setclipchildren6, setclipchildren7, setclipchildren8, setclipchildren9, setclipchildren10, setclipchildren11, setclipchildren12, setclipchildren13};
        int i13 = i10 & 53;
        int i14 = (((i10 ^ 53) | i13) << 1) - ((~i13) & (i10 | 53));
        int i15 = i14 % 128;
        setChildDivider = i15;
        if (i14 % 2 == 0) {
            throw null;
        }
        UiMessageCallbackKtWhenMappings = setclipchildrenArr;
        int i16 = ((-1) << 1) - ((((i15 | 32) << 1) - (i15 ^ 32)) ^ (-1));
        setTextScaleX = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public setClipChildren(String str, int i10, byte b10) {
        super(str, i10);
        this.setCompoundDrawableTintBlendMode = b10;
    }

    public static setClipChildren valueOf(String str) {
        int i10 = setChildDivider + 85;
        setTextScaleX = i10 % 128;
        if (i10 % 2 == 0) {
            return (setClipChildren) Enum.valueOf(setClipChildren.class, str);
        }
        Enum.valueOf(setClipChildren.class, str);
        throw null;
    }

    public static setClipChildren[] values() {
        int i10 = setTextScaleX;
        int i11 = i10 & 49;
        int i12 = (((i10 ^ 49) | i11) << 1) - ((i10 | 49) & (~i11));
        setChildDivider = i12 % 128;
        int i13 = i12 % 2;
        setClipChildren[] setclipchildrenArr = (setClipChildren[]) UiMessageCallbackKtWhenMappings.clone();
        int i14 = setChildDivider;
        int i15 = i14 & 3;
        int i16 = (i14 ^ 3) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        setTextScaleX = i17 % 128;
        int i18 = i17 % 2;
        return setclipchildrenArr;
    }

    public /* synthetic */ setClipChildren(String str, int i10, byte b10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 1) != 0 ? (byte) 0 : b10);
    }
}
