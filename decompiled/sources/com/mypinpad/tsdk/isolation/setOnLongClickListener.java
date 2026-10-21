package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnLongClickListener {
    public int setCompoundDrawableTintBlendMode;
    public int setDividerPadding;
    public int setY;

    public static int setCompoundDrawableTintBlendMode(int i10) {
        int[][] iArr = setX.setOnFocusChangeListener.setX;
        return ((iArr[0][(i10 >>> 24) & 255] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }

    public static void setX(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }
}
