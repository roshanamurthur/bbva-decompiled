package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class akp {
    public static final akp getNavBarTitleString;
    private static int setAlwaysDrawnWithCacheEnabled = 1;
    public static final akp setCompoundDrawableTintBlendMode;
    public static final akp setDividerPadding;
    private static final /* synthetic */ akp[] setIncludeFontPadding;
    private static akp setLayoutAnimation;
    private static akp setNavigationOnClickListener;
    private static akp setOnDragListener;
    public static final akp setOnFocusChangeListener;
    public static final akp setOnLongClickListener;
    public static final akp setX;
    public static final akp setY;
    private static int setZ;

    static {
        akp akpVar = new akp("AGREEMENT", 0);
        setX = akpVar;
        akp akpVar2 = new akp("ENCRYPTION", 1);
        setY = akpVar2;
        akp akpVar3 = new akp("DECRYPTION", 2);
        setDividerPadding = akpVar3;
        akp akpVar4 = new akp("KEYGEN", 3);
        setOnFocusChangeListener = akpVar4;
        akp akpVar5 = new akp("SIGNING", 4);
        setCompoundDrawableTintBlendMode = akpVar5;
        akp akpVar6 = new akp("VERIFYING", 5);
        setOnLongClickListener = akpVar6;
        akp akpVar7 = new akp("AUTHENTICATION", 6);
        setNavigationOnClickListener = akpVar7;
        akp akpVar8 = new akp("VERIFICATION", 7);
        setLayoutAnimation = akpVar8;
        akp akpVar9 = new akp("PRF", 8);
        setOnDragListener = akpVar9;
        akp akpVar10 = new akp("ANY", 9);
        getNavBarTitleString = akpVar10;
        setIncludeFontPadding = new akp[]{akpVar, akpVar2, akpVar3, akpVar4, akpVar5, akpVar6, akpVar7, akpVar8, akpVar9, akpVar10};
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = 256507235 & iCurrentTimeMillis;
        int i11 = ((~((256507235 ^ iCurrentTimeMillis) | i10)) | 2083337375) * (-668);
        int i12 = (-823149157) & i11;
        int i13 = (i11 ^ (-823149157)) | i12;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = ~iCurrentTimeMillis;
        int i16 = (2083337375 & i15) | ((-2083337376) & iCurrentTimeMillis);
        int i17 = 2083337375 & iCurrentTimeMillis;
        int i18 = ~((i16 & i17) | (i16 ^ i17));
        int i19 = ((i18 & 256507235) | (256507235 ^ i18)) * 1336;
        int i20 = i14 & i19;
        int i21 = -(-((i14 ^ i19) | i20));
        int i22 = (i20 & i21) + (i21 | i20);
        int i23 = (iCurrentTimeMillis & (-256507236)) | (256507235 & i15) | i10;
        int i24 = i23 & 2083337375;
        int i25 = (i23 | 2083337375) & (~i24);
        int i26 = ((i25 & i24) | (i25 ^ i24)) * 668;
        int i27 = i22 & i26;
        int i28 = (i26 ^ i22) | i27;
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i30 = 810784293 & iCurrentTimeMillis2;
        int i31 = (~i30) & (810784293 | iCurrentTimeMillis2);
        int i32 = ~iCurrentTimeMillis2;
        int i33 = ~(i30 | i31);
        int i34 = -(-(((i33 & (-440914466)) | ((~i33) & (-440914466)) | (440914465 & i33)) * Opcodes.ATHROW));
        int i35 = (((~i34) & (-1073835589)) | (1073835588 & i34)) + ((i34 & (-1073835589)) << 1);
        int i36 = (iCurrentTimeMillis2 | i32) & (~iCurrentTimeMillis2);
        int i37 = i36 ^ 810784293;
        int i38 = i36 & 810784293;
        int i39 = ~((i38 & i37) | (i37 ^ i38));
        int i40 = ((~i39) & (-978834982)) | (978834981 & i39);
        int i41 = i39 & (-978834982);
        int i42 = ((i41 & i40) | (i40 ^ i41)) * Opcodes.ATHROW;
        if (i29 > ((((~i42) & i35) | ((~i35) & i42)) - (~((i42 & i35) << 1))) - 1) {
            throw null;
        }
    }

    public akp() {
        throw null;
    }

    public static akp valueOf(String str) {
        int i10 = setAlwaysDrawnWithCacheEnabled;
        int i11 = ((i10 & 26) + (i10 | 26)) - 1;
        setZ = i11 % 128;
        int i12 = i11 % 2;
        akp akpVar = (akp) Enum.valueOf(akp.class, str);
        int i13 = setAlwaysDrawnWithCacheEnabled;
        int i14 = i13 & 111;
        int i15 = (i13 | 111) & (~i14);
        int i16 = i14 << 1;
        int i17 = (i15 & i16) + (i15 | i16);
        setZ = i17 % 128;
        int i18 = i17 % 2;
        return akpVar;
    }

    public static akp[] values() {
        int i10 = setZ;
        int i11 = (i10 & (-106)) | ((~i10) & 105);
        int i12 = (i10 & 105) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        setAlwaysDrawnWithCacheEnabled = i13 % 128;
        int i14 = i13 % 2;
        akp[] akpVarArr = (akp[]) setIncludeFontPadding.clone();
        int i15 = setAlwaysDrawnWithCacheEnabled;
        int i16 = i15 & 51;
        int i17 = (i16 - (~(-(-((i15 ^ 51) | i16))))) - 1;
        setZ = i17 % 128;
        if (i17 % 2 == 0) {
            return akpVarArr;
        }
        throw null;
    }
}
