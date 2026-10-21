package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/cg;", "", "setOnFocusChangeListener", "setY", "setDividerPadding", "setX"}, k = 1, mv = {1, 5, 1})
public final class cg {
    private static final /* synthetic */ cg[] setCompoundDrawableTintBlendMode;
    public static final cg setDividerPadding;
    private static int setNavigationOnClickListener = 0;
    private static int setOnDragListener = 1;
    public static final cg setOnFocusChangeListener;
    public static final cg setX;
    public static final cg setY;

    static {
        cg cgVar = new cg("NA", 0);
        setOnFocusChangeListener = cgVar;
        cg cgVar2 = new cg("ONLINE_ONLY", 1);
        setY = cgVar2;
        cg cgVar3 = new cg("OFFLINE_WITH_ONLINE_CAPABILITY", 2);
        setDividerPadding = cgVar3;
        cg cgVar4 = new cg("OFFLINE_ONLY", 3);
        setX = cgVar4;
        int i10 = 119 << 1;
        int i11 = -((~0) & 119);
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i12 % 128;
        setOnDragListener = i13;
        int i14 = i12 % 2;
        cg[] cgVarArr = {cgVar, cgVar2, cgVar3, cgVar4};
        int i15 = (i13 ^ 77) + ((i13 & 77) << 1);
        setNavigationOnClickListener = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        setCompoundDrawableTintBlendMode = cgVarArr;
        int i16 = (i13 ^ 89) + ((i13 & 89) << 1);
        setNavigationOnClickListener = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public cg() {
        throw null;
    }

    public static cg valueOf(String str) {
        int i10 = setOnDragListener;
        int i11 = (i10 & 85) + (i10 | 85);
        setNavigationOnClickListener = i11 % 128;
        if (i11 % 2 == 0) {
            return (cg) Enum.valueOf(cg.class, str);
        }
        Enum.valueOf(cg.class, str);
        throw null;
    }

    public static cg[] values() {
        int i10 = setNavigationOnClickListener;
        int i11 = i10 ^ 123;
        int i12 = (i10 & 123) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setOnDragListener = i13 % 128;
        int i14 = i13 % 2;
        cg[] cgVarArr = (cg[]) setCompoundDrawableTintBlendMode.clone();
        int i15 = setNavigationOnClickListener;
        int i16 = ((-1) << 1) - ((-1) ^ ((i15 ^ 82) + ((i15 & 82) << 1)));
        setOnDragListener = i16 % 128;
        if (i16 % 2 != 0) {
            return cgVarArr;
        }
        throw null;
    }
}
