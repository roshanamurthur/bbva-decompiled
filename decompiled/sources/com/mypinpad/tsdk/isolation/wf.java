package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/wf;", "", "Ljava/io/Serializable;", "setOnFocusChangeListener", "setDividerPadding", "setX", "setY", "setCompoundDrawableTintBlendMode", "setOnLongClickListener", "getNavBarTitleString"}, k = 1, mv = {1, 8, 0})
public final class wf implements Serializable {
    public static final wf getNavBarTitleString;
    public static final wf setCompoundDrawableTintBlendMode;
    public static final wf setDividerPadding;
    private static int setLayoutAnimation = 0;
    private static int setNavigationOnClickListener = 1;
    private static final /* synthetic */ wf[] setOnDragListener;
    public static final wf setOnFocusChangeListener;
    public static final wf setOnLongClickListener;
    public static final wf setX;
    public static final wf setY;

    static {
        wf wfVar = new wf("REQ_DEBUG_LOG", 0);
        setOnFocusChangeListener = wfVar;
        wf wfVar2 = new wf("REQ_REDACTED_LOG", 1);
        setDividerPadding = wfVar2;
        wf wfVar3 = new wf("REQ_TRANSACTION_RESULT", 2);
        setX = wfVar3;
        wf wfVar4 = new wf("REQ_UI_MESSAGE", 3);
        setY = wfVar4;
        wf wfVar5 = new wf("REQ_NFC_LISTENING", 4);
        setCompoundDrawableTintBlendMode = wfVar5;
        wf wfVar6 = new wf("REQ_SESSION_TIMEOUT", 5);
        setOnLongClickListener = wfVar6;
        wf wfVar7 = new wf("REQ_PIN_PAD_SHOULD_LAUNCH", 6);
        getNavBarTitleString = wfVar7;
        int i10 = 1 & 93;
        int i11 = (1 ^ 93) | i10;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        setLayoutAnimation = i12 % 128;
        int i13 = i12 % 2;
        wf[] wfVarArr = {wfVar, wfVar2, wfVar3, wfVar4, wfVar5, wfVar6, wfVar7};
        int i14 = (1 & 89) + (1 | 89);
        setLayoutAnimation = i14 % 128;
        int i15 = i14 % 2;
        setOnDragListener = wfVarArr;
        int i16 = ((-1) << 1) - (((1 ^ 78) + ((1 & 78) << 1)) ^ (-1));
        setLayoutAnimation = i16 % 128;
        int i17 = i16 % 2;
    }

    public wf() {
        throw null;
    }

    public static wf valueOf(String str) {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 47;
        int i12 = ((i10 ^ 47) | i11) << 1;
        int i13 = -((i10 | 47) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        setNavigationOnClickListener = i14 % 128;
        int i15 = i14 % 2;
        wf wfVar = (wf) Enum.valueOf(wf.class, str);
        int i16 = setNavigationOnClickListener;
        int i17 = ((i16 | 29) << 1) - (i16 ^ 29);
        setLayoutAnimation = i17 % 128;
        int i18 = i17 % 2;
        return wfVar;
    }

    public static wf[] values() {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 103;
        int i12 = (i10 | 103) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        setNavigationOnClickListener = i14 % 128;
        int i15 = i14 % 2;
        wf[] wfVarArr = setOnDragListener;
        if (i15 != 0) {
            return (wf[]) wfVarArr.clone();
        }
        int i16 = 93 / 0;
        return (wf[]) wfVarArr.clone();
    }
}
