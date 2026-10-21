package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
public final class axi implements awd {
    public static final axi setCompoundDrawableTintBlendMode;
    public static final axi setDividerPadding;
    public static final axi setLayoutAnimation;
    public static final axi setOnFocusChangeListener;
    public static final axi setX;
    public static final axi setY;

    static {
        short[] sArr = {4643, 13363, 20579, 25843, 29227, 31145, 32103, 32525, 32689, 32745, 32762, 32766, ShortCompanionObject.MAX_VALUE};
        short[] sArr2 = {5638, 15915, 23689, 28571, 31116, 32217, 32613, 32731, 32760, 32766, ShortCompanionObject.MAX_VALUE};
        short[] sArr3 = {9142, 23462, 30338, 32361, 32725, 32765, ShortCompanionObject.MAX_VALUE};
        setCompoundDrawableTintBlendMode = new axi(640, 15, 2, sArr, new alx(128));
        setDividerPadding = new axi(640, 15, 2, sArr, new alx(128));
        setX = new axi(976, 16, 3, sArr2, new alx(256));
        setY = new axi(976, 16, 3, sArr2, new alx(256));
        setOnFocusChangeListener = new axi(1344, 16, 4, sArr3, new alx(256));
        setLayoutAnimation = new axi(1344, 16, 4, sArr3, new alx(256));
    }

    public axi(int i10, int i11, int i12, short[] sArr, alx alxVar) {
        int i13 = (i12 << 6) / 8;
        int i14 = ((i10 * i11) << 3) / 8;
        int i15 = (i11 << 6) / 8;
    }
}
