package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/ck;", "", "setDividerPadding", "setY", "setX"}, k = 1, mv = {1, 5, 1})
public final class ck {
    private static int setCompoundDrawableTintBlendMode = 0;
    public static final ck setDividerPadding;
    private static int setNavigationOnClickListener = 1;
    private static final /* synthetic */ ck[] setOnFocusChangeListener;
    public static final ck setX;
    public static final ck setY;

    static {
        ck[] ckVarArr;
        ck ckVar = new ck("NA", 0);
        setDividerPadding = ckVar;
        ck ckVar2 = new ck("ATTENDED", 1);
        setY = ckVar2;
        ck ckVar3 = new ck("UNATTENDED", 2);
        setX = ckVar3;
        int i10 = (74 ^ (-1)) + (74 << 1);
        int i11 = i10 % 128;
        setNavigationOnClickListener = i11;
        if (i10 % 2 == 0) {
            ckVarArr = new ck[3];
            ckVarArr[1] = ckVar;
            ckVarArr[1] = ckVar2;
            ckVarArr[5] = ckVar3;
        } else {
            ckVarArr = new ck[]{ckVar, ckVar2, ckVar3};
        }
        int i12 = i11 & 85;
        int i13 = i12 + ((i11 ^ 85) | i12);
        int i14 = i13 % 128;
        setCompoundDrawableTintBlendMode = i14;
        int i15 = i13 % 2;
        setOnFocusChangeListener = ckVarArr;
        int i16 = (i14 & 7) + (i14 | 7);
        setNavigationOnClickListener = i16 % 128;
        int i17 = i16 % 2;
    }

    public ck() {
        throw null;
    }

    public static ck valueOf(String str) {
        int i10 = setNavigationOnClickListener;
        int i11 = (i10 & (-76)) | ((~i10) & 75);
        int i12 = -(-((i10 & 75) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        setCompoundDrawableTintBlendMode = i13 % 128;
        if (i13 % 2 == 0) {
            return (ck) Enum.valueOf(ck.class, str);
        }
        Enum.valueOf(ck.class, str);
        throw null;
    }

    public static ck[] values() {
        int i10 = setNavigationOnClickListener;
        int i11 = i10 & 97;
        int i12 = (i10 ^ 97) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setCompoundDrawableTintBlendMode = i13 % 128;
        int i14 = i13 % 2;
        ck[] ckVarArr = setOnFocusChangeListener;
        if (i14 == 0) {
            return (ck[]) ckVarArr.clone();
        }
        throw null;
    }
}
