package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019"}, d2 = {"Lcom/mypinpad/tsdk/i/fg;", "", "setDividerPadding", "setX", "setOnFocusChangeListener", "setY", "setCompoundDrawableTintBlendMode", "setOnLongClickListener", "setNavigationOnClickListener", "getNavBarTitleString", "setLayoutAnimation", "setOnDragListener", "setAlwaysDrawnWithCacheEnabled", "UiMessageCallbackKtWhenMappings", "setIncludeFontPadding", "setTextAlignment", "setImageResource", "setLayoutDirection", "setZ", "setTextScaleX", "setOnEditorActionListener", "getAmountFieldTextColor", "setChildDivider", "setCompoundDrawablePadding", "getSuppressed", "setMaxEms"}, k = 1, mv = {1, 5, 1})
public final class fg {
    public static final fg UiMessageCallbackKtWhenMappings;
    public static final fg getAmountFieldTextColor;
    public static final fg getNavBarTitleString;
    public static final fg getSuppressed;
    private static int printStackTrace = 1;
    public static final fg setAlwaysDrawnWithCacheEnabled;
    public static final fg setChildDivider;
    public static final fg setCompoundDrawablePadding;
    public static final fg setCompoundDrawableTintBlendMode;
    private static int setCursorVisible;
    public static final fg setDividerPadding;
    private static fg setImageResource;
    public static final fg setIncludeFontPadding;
    public static final fg setLayoutAnimation;
    private static fg setLayoutDirection;
    public static final fg setMaxEms;
    private static final /* synthetic */ fg[] setMinHeight;
    public static final fg setNavigationOnClickListener;
    public static final fg setOnDragListener;
    public static final fg setOnEditorActionListener;
    public static final fg setOnFocusChangeListener;
    public static final fg setOnLongClickListener;
    public static final fg setTextAlignment;
    public static final fg setTextScaleX;
    public static final fg setX;
    public static final fg setY;
    public static final fg setZ;

    static {
        fg fgVar = new fg("Execute_Idle", 0);
        setDividerPadding = fgVar;
        fg fgVar2 = new fg("Execute_InitiateApplicationProcessing", 1);
        setX = fgVar2;
        fg fgVar3 = new fg("Execute_Completion", 2);
        setOnFocusChangeListener = fgVar3;
        fg fgVar4 = new fg("Execute_WaitingForPDOLData", 3);
        setY = fgVar4;
        fg fgVar5 = new fg("Execute_WaitingForGPOResponse", 4);
        setCompoundDrawableTintBlendMode = fgVar5;
        fg fgVar6 = new fg("Execute_WaitingForExchangeRelayResistanceDataResponse", 5);
        setOnLongClickListener = fgVar6;
        fg fgVar7 = new fg("Execute_WaitingForEMVReadRecordResponse", 6);
        setNavigationOnClickListener = fgVar7;
        fg fgVar8 = new fg("Execute_WaitingForEMVInternalAuthenticateResponse", 7);
        getNavBarTitleString = fgVar8;
        fg fgVar9 = new fg("Execute_WaitingForGetDataResponse", 8);
        setLayoutAnimation = fgVar9;
        fg fgVar10 = new fg("Execute_WaitingForEMVModeFirstWriteFlag", 9);
        setOnDragListener = fgVar10;
        fg fgVar11 = new fg("Execute_WaitingForGenerateACResponse", 10);
        setAlwaysDrawnWithCacheEnabled = fgVar11;
        fg fgVar12 = new fg("Execute_WaitingForGenerateACResponse_1", 11);
        UiMessageCallbackKtWhenMappings = fgVar12;
        fg fgVar13 = new fg("Execute_WaitingForPutDataResponseBeforeGenerateAC", 12);
        setIncludeFontPadding = fgVar13;
        fg fgVar14 = new fg("Execute_WaitingForPutDataResponseAfterGenerateAC", 13);
        setTextAlignment = fgVar14;
        fg fgVar15 = new fg("Execute_WaitingForPreGenACBalance", 14);
        setImageResource = fgVar15;
        fg fgVar16 = new fg("Execute_WaitingForPostGenACBalance", 15);
        setLayoutDirection = fgVar16;
        fg fgVar17 = new fg("Execute_Processing", 16);
        setZ = fgVar17;
        fg fgVar18 = new fg("Execute_EXIT", 17);
        setTextScaleX = fgVar18;
        fg fgVar19 = new fg("Execute_IdleFor2ndTap", 18);
        setOnEditorActionListener = fgVar19;
        fg fgVar20 = new fg("Execute_InitiateApplicationProcessingFor2ndTap", 19);
        getAmountFieldTextColor = fgVar20;
        fg fgVar21 = new fg("Execute_WaitingFor2ndGPOResponse", 20);
        setChildDivider = fgVar21;
        fg fgVar22 = new fg("Execute_WaitingFor2ndEMVReadRecordResponse", 21);
        setCompoundDrawablePadding = fgVar22;
        fg fgVar23 = new fg("Execute_ProcessingFor2ndTap", 22);
        getSuppressed = fgVar23;
        fg fgVar24 = new fg("Execute_WaitingFor2ndGenerateACResponse", 23);
        setMaxEms = fgVar24;
        int i10 = (-2) - (((10 << 1) - 10) ^ (-1));
        int i11 = i10 % 128;
        printStackTrace = i11;
        int i12 = i10 % 2;
        fg[] fgVarArr = {fgVar, fgVar2, fgVar3, fgVar4, fgVar5, fgVar6, fgVar7, fgVar8, fgVar9, fgVar10, fgVar11, fgVar12, fgVar13, fgVar14, fgVar15, fgVar16, fgVar17, fgVar18, fgVar19, fgVar20, fgVar21, fgVar22, fgVar23, fgVar24};
        int i13 = (((i11 | 63) << 1) - (~(-((i11 & (-64)) | ((~i11) & 63))))) - 1;
        setCursorVisible = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        setMinHeight = fgVarArr;
        int i14 = (i11 | 9) << 1;
        int i15 = -((i11 & (-10)) | ((~i11) & 9));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        setCursorVisible = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 52 / 0;
        }
    }

    public fg() {
        throw null;
    }

    public static fg valueOf(String str) {
        int i10 = printStackTrace;
        int i11 = i10 & 23;
        int i12 = (i10 | 23) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        setCursorVisible = i14 % 128;
        int i15 = i14 % 2;
        fg fgVar = (fg) Enum.valueOf(fg.class, str);
        int i16 = printStackTrace;
        int i17 = i16 & 99;
        int i18 = ((i16 | 99) & (~i17)) + (i17 << 1);
        setCursorVisible = i18 % 128;
        int i19 = i18 % 2;
        return fgVar;
    }

    public static fg[] values() {
        int i10 = printStackTrace;
        int i11 = i10 & 23;
        int i12 = (i10 | 23) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        setCursorVisible = i14 % 128;
        int i15 = i14 % 2;
        fg[] fgVarArr = (fg[]) setMinHeight.clone();
        int i16 = setCursorVisible;
        int i17 = (i16 & 41) + (i16 | 41);
        printStackTrace = i17 % 128;
        int i18 = i17 % 2;
        return fgVarArr;
    }
}
