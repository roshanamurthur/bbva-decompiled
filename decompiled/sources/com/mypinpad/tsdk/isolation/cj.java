package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/cj;", "", "setOnFocusChangeListener", "setY", "setCompoundDrawableTintBlendMode", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class cj {
    public static final cj setCompoundDrawableTintBlendMode;
    public static final cj setDividerPadding;
    private static int setLayoutAnimation = 1;
    private static int setOnDragListener;
    public static final cj setOnFocusChangeListener;
    private static final /* synthetic */ cj[] setX;
    public static final cj setY;

    static {
        cj cjVar = new cj("NA", 0);
        setOnFocusChangeListener = cjVar;
        cj cjVar2 = new cj("FINANCIAL_INSTITUTION", 1);
        setY = cjVar2;
        cj cjVar3 = new cj("MERCHANT", 2);
        setCompoundDrawableTintBlendMode = cjVar3;
        cj cjVar4 = new cj("CARD_HOLDER", 3);
        setDividerPadding = cjVar4;
        int i10 = 26 - 1;
        setLayoutAnimation = i10 % 128;
        int i11 = i10 % 2;
        cj[] cjVarArr = {cjVar, cjVar2, cjVar3, cjVar4};
        int i12 = 41 << 1;
        int i13 = -((~0) & 41);
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        int i15 = i14 % 128;
        setLayoutAnimation = i15;
        int i16 = i14 % 2;
        setX = cjVarArr;
        int i17 = i15 + 89;
        setOnDragListener = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 65 / 0;
        }
    }

    public cj() {
        throw null;
    }

    public static cj valueOf(String str) {
        int i10 = setLayoutAnimation;
        int i11 = i10 & 109;
        int i12 = -(-((i10 ^ 109) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        setOnDragListener = i13 % 128;
        if (i13 % 2 != 0) {
            Enum.valueOf(cj.class, str);
            throw null;
        }
        cj cjVar = (cj) Enum.valueOf(cj.class, str);
        int i14 = setOnDragListener;
        int i15 = i14 & 113;
        int i16 = ((i14 ^ 113) | i15) << 1;
        int i17 = -((i14 | 113) & (~i15));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        setLayoutAnimation = i18 % 128;
        int i19 = i18 % 2;
        return cjVar;
    }

    public static cj[] values() {
        System.currentTimeMillis();
        System.currentTimeMillis();
        cj[] cjVarArr = (cj[]) setX.clone();
        int i10 = setOnDragListener + 51;
        setLayoutAnimation = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 71 / 0;
        }
        return cjVarArr;
    }
}
