package com.mypinpad.tsdk.isolation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class q2 {
    private static int getNavBarTitleString = 1;
    private static final /* synthetic */ q2[] setCompoundDrawableTintBlendMode;
    public static final q2 setDividerPadding;
    public static final q2 setOnFocusChangeListener;
    public static final q2 setX;
    private static int setY;

    static {
        q2 q2Var = new q2("CLASSIC", 0);
        setX = q2Var;
        q2 q2Var2 = new q2("CIRCUMZENITHAL", 1);
        setOnFocusChangeListener = q2Var2;
        q2 q2Var3 = new q2("COMPRESSED", 2);
        setDividerPadding = q2Var3;
        setCompoundDrawableTintBlendMode = new q2[]{q2Var, q2Var2, q2Var3};
        int i10 = 1 & 37;
        int i11 = (1 ^ 37) | i10;
        int i12 = (i10 & i11) + (i10 | i11);
        setY = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public q2() {
        throw null;
    }

    public static q2 valueOf(String str) {
        int i10 = getNavBarTitleString;
        int i11 = (i10 & (-42)) | ((~i10) & 41);
        int i12 = (i10 & 41) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setY = i13 % 128;
        int i14 = i13 % 2;
        q2 q2Var = (q2) Enum.valueOf(q2.class, str);
        int i15 = setY + 85;
        getNavBarTitleString = i15 % 128;
        if (i15 % 2 != 0) {
            return q2Var;
        }
        throw null;
    }

    public static q2[] values() throws CloneNotSupportedException {
        int i10 = setY;
        int i11 = (((i10 | 1) << 1) - (~(-(i10 ^ 1)))) - 1;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        q2[] q2VarArr = setCompoundDrawableTintBlendMode;
        if (i12 == 0) {
            q2VarArr.clone();
            throw null;
        }
        q2[] q2VarArr2 = (q2[]) q2VarArr.clone();
        int i13 = getNavBarTitleString;
        int i14 = (((i13 | 50) << 1) - (i13 ^ 50)) - 1;
        setY = i14 % 128;
        int i15 = i14 % 2;
        return q2VarArr2;
    }
}
