package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/wm;", "", "Ljava/io/Serializable;", "setOnFocusChangeListener", "getAmountFieldTextColor", "setTextScaleX", "setY", "setDividerPadding", "setCompoundDrawableTintBlendMode", "setX", "setLayoutAnimation", "getNavBarTitleString", "setOnLongClickListener", "setOnDragListener", "setNavigationOnClickListener", "setAlwaysDrawnWithCacheEnabled", "setTextAlignment", "setZ", "UiMessageCallbackKtWhenMappings", "setIncludeFontPadding"}, k = 1, mv = {1, 8, 0})
public final class wm implements Serializable {
    public static final wm UiMessageCallbackKtWhenMappings;
    private static wm getAmountFieldTextColor = null;
    public static final wm getNavBarTitleString;
    public static final wm setAlwaysDrawnWithCacheEnabled;
    private static final /* synthetic */ wm[] setChildDivider;
    private static int setCompoundDrawablePadding = 1;
    public static final wm setCompoundDrawableTintBlendMode;
    public static final wm setDividerPadding;
    public static final wm setIncludeFontPadding;
    public static final wm setLayoutAnimation;
    public static final wm setNavigationOnClickListener;
    public static final wm setOnDragListener;
    private static int setOnEditorActionListener;
    public static final wm setOnFocusChangeListener;
    public static final wm setOnLongClickListener;
    public static final wm setTextAlignment;
    private static wm setTextScaleX;
    public static final wm setX;
    public static final wm setY;
    public static final wm setZ;

    static {
        wm wmVar = new wm("REQ_INIT_TERMINAL", 0);
        setOnFocusChangeListener = wmVar;
        wm wmVar2 = new wm("REQ_SET_DEBUG_LOGGER", 1);
        getAmountFieldTextColor = wmVar2;
        wm wmVar3 = new wm("REQ_SET_REDACTED_LOGGER", 2);
        setTextScaleX = wmVar3;
        wm wmVar4 = new wm("REQ_CREATE_TERMINAL", 3);
        setY = wmVar4;
        wm wmVar5 = new wm("REQ_DISPOSE_TERMINAL", 4);
        setDividerPadding = wmVar5;
        wm wmVar6 = new wm("REQ_ACTIVE_SESSION", 5);
        setCompoundDrawableTintBlendMode = wmVar6;
        wm wmVar7 = new wm("REQ_SET_BEEP_VOLUME", 6);
        setX = wmVar7;
        wm wmVar8 = new wm("REQ_GET_INSTALLATION_ID", 7);
        setLayoutAnimation = wmVar8;
        wm wmVar9 = new wm("REQ_GET_INSTALLATION_PUBLIC_KEY", 8);
        getNavBarTitleString = wmVar9;
        wm wmVar10 = new wm("REQ_START_TRANSACTION", 9);
        setOnLongClickListener = wmVar10;
        wm wmVar11 = new wm("REQ_NFC_TAG_FOUND", 10);
        setOnDragListener = wmVar11;
        wm wmVar12 = new wm("REQ_NFC_ERROR", 11);
        setNavigationOnClickListener = wmVar12;
        wm wmVar13 = new wm("REQ_PROCEED_LAUNCH_PIN_PAD", 12);
        setAlwaysDrawnWithCacheEnabled = wmVar13;
        wm wmVar14 = new wm("REQ_DEACTIVATE_SESSION", 13);
        setTextAlignment = wmVar14;
        wm wmVar15 = new wm("REQ_ON_ACTIVITY_RESUMED", 14);
        setZ = wmVar15;
        wm wmVar16 = new wm("REQ_ON_ACTIVITY_PAUSED", 15);
        UiMessageCallbackKtWhenMappings = wmVar16;
        wm wmVar17 = new wm("RESPONSE_EXCEPTION", 16);
        setIncludeFontPadding = wmVar17;
        int i10 = (((1 & (-64)) | ((~1) & 63)) - (~((1 & 63) << 1))) - 1;
        int i11 = i10 % 128;
        setOnEditorActionListener = i11;
        int i12 = i10 % 2;
        wm[] wmVarArr = {wmVar, wmVar2, wmVar3, wmVar4, wmVar5, wmVar6, wmVar7, wmVar8, wmVar9, wmVar10, wmVar11, wmVar12, wmVar13, wmVar14, wmVar15, wmVar16, wmVar17};
        int i13 = i11 & 11;
        int i14 = (i11 ^ 11) | i13;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        setCompoundDrawablePadding = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 43 / 0;
        }
        setChildDivider = wmVarArr;
        int i17 = i11 + 101;
        setCompoundDrawablePadding = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public wm() {
        throw null;
    }

    public static wm valueOf(String str) {
        int i10 = setOnEditorActionListener;
        int i11 = i10 & 93;
        int i12 = (((i10 ^ 93) | i11) << 1) - ((i10 | 93) & (~i11));
        setCompoundDrawablePadding = i12 % 128;
        if (i12 % 2 != 0) {
            return (wm) Enum.valueOf(wm.class, str);
        }
        Enum.valueOf(wm.class, str);
        throw null;
    }

    public static wm[] values() {
        int i10 = setOnEditorActionListener;
        int i11 = (((i10 | 42) << 1) - (i10 ^ 42)) - 1;
        setCompoundDrawablePadding = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        wm[] wmVarArr = (wm[]) setChildDivider.clone();
        int i12 = setOnEditorActionListener;
        int i13 = (i12 ^ 103) + ((i12 & 103) << 1);
        setCompoundDrawablePadding = i13 % 128;
        if (i13 % 2 != 0) {
            return wmVarArr;
        }
        throw null;
    }
}
