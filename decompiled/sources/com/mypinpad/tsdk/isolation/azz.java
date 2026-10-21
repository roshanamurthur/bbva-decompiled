package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class azz {
    public static final azz UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f54222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54223d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54224e = 1;
    public static final azz getAmountFieldTextColor;
    public static final azz getNavBarTitleString;
    public static final azz setAlwaysDrawnWithCacheEnabled;
    public static final azz setChildDivider;
    public static final azz setCompoundDrawablePadding;
    public static final azz setCompoundDrawableTintBlendMode;
    public static final azz setDividerPadding;
    public static final azz setIncludeFontPadding;
    public static final azz setLayoutAnimation;
    public static final azz setNavigationOnClickListener;
    public static final azz setOnDragListener;
    public static final azz setOnFocusChangeListener;
    public static final azz setOnLongClickListener;
    public static final azz setTextAlignment;
    public static final azz setX;
    public static final azz setY;
    public static final azz setZ;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f54225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f54226b;

    public static class a implements v2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54227b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54228a;

        public a(int i10) {
            this.f54228a = i10;
        }

        @Override // com.mypinpad.tsdk.isolation.v2
        public final int setOnFocusChangeListener() {
            System.identityHashCode(this);
            a aVar = (a) new Object[]{this}[0];
            int i10 = (-2) - ((f54227b + 26) ^ (-1));
            int i11 = i10 % 128;
            int i12 = i10 % 2;
            int i13 = aVar.f54228a;
            int i14 = i11 & 59;
            int i15 = i11 | 59;
            int i16 = (i14 & i15) + (i14 | i15);
            f54227b = i16 % 128;
            int i17 = i16 % 2;
            return Integer.valueOf(i13).intValue();
        }
    }

    public static class b implements v2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54229b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54230a;

        public b(int i10) {
            this.f54230a = i10;
        }

        @Override // com.mypinpad.tsdk.isolation.v2
        public final int setOnFocusChangeListener() {
            System.identityHashCode(this);
            b bVar = (b) new Object[]{this}[0];
            int i10 = f54229b;
            int i11 = i10 & 43;
            int i12 = ((i10 ^ 43) | i11) << 1;
            int i13 = -((i10 | 43) & (~i11));
            int i14 = (i12 & i13) + (i12 | i13);
            int i15 = i14 % 128;
            int i16 = i14 % 2;
            int i17 = bVar.f54230a;
            int i18 = i15 & 39;
            int i19 = i18 + ((i15 ^ 39) | i18);
            f54229b = i19 % 128;
            int i20 = i19 % 2;
            return Integer.valueOf(i17).intValue();
        }
    }

    public static class c implements v2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54231a;

        public c(int i10) {
            this.f54231a = i10;
        }

        @Override // com.mypinpad.tsdk.isolation.v2
        public final int setOnFocusChangeListener() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return Integer.valueOf(((c) objArr[0]).f54231a).intValue();
        }
    }

    static {
        azz azzVar = new azz((Integer) beq.setY(new Object[]{65793}, 843618426, -843618423, 65793), new a(16));
        setX = azzVar;
        azz azzVar2 = new azz((Integer) beq.setY(new Object[]{65794}, 843618426, -843618423, 65794), new a(16));
        setOnFocusChangeListener = azzVar2;
        azz azzVar3 = new azz((Integer) beq.setY(new Object[]{65795}, 843618426, -843618423, 65795), new a(24));
        setCompoundDrawableTintBlendMode = azzVar3;
        azz azzVar4 = new azz((Integer) beq.setY(new Object[]{65796}, 843618426, -843618423, 65796), new a(24));
        setDividerPadding = azzVar4;
        azz azzVar5 = new azz((Integer) beq.setY(new Object[]{65797}, 843618426, -843618423, 65797), new a(32));
        setY = azzVar5;
        azz azzVar6 = new azz((Integer) beq.setY(new Object[]{65798}, 843618426, -843618423, 65798), new a(32));
        setOnLongClickListener = azzVar6;
        azz azzVar7 = new azz((Integer) beq.setY(new Object[]{66049}, 843618426, -843618423, 66049), new a(16));
        azz azzVar8 = new azz((Integer) beq.setY(new Object[]{66050}, 843618426, -843618423, 66050), new a(16));
        azz azzVar9 = new azz((Integer) beq.setY(new Object[]{66051}, 843618426, -843618423, 66051), new a(24));
        azz azzVar10 = new azz((Integer) beq.setY(new Object[]{66052}, 843618426, -843618423, 66052), new a(24));
        azz azzVar11 = new azz((Integer) beq.setY(new Object[]{66053}, 843618426, -843618423, 66053), new a(32));
        azz azzVar12 = new azz((Integer) beq.setY(new Object[]{66054}, 843618426, -843618423, 66054), new a(32));
        azz azzVar13 = new azz((Integer) beq.setY(new Object[]{131329}, 843618426, -843618423, 131329), new c(16));
        setOnDragListener = azzVar13;
        azz azzVar14 = new azz((Integer) beq.setY(new Object[]{131330}, 843618426, -843618423, 131330), new c(16));
        setLayoutAnimation = azzVar14;
        azz azzVar15 = new azz((Integer) beq.setY(new Object[]{131331}, 843618426, -843618423, 131331), new c(24));
        getNavBarTitleString = azzVar15;
        azz azzVar16 = new azz((Integer) beq.setY(new Object[]{131332}, 843618426, -843618423, 131332), new c(24));
        setNavigationOnClickListener = azzVar16;
        azz azzVar17 = new azz((Integer) beq.setY(new Object[]{131333}, 843618426, -843618423, 131333), new c(32));
        setAlwaysDrawnWithCacheEnabled = azzVar17;
        azz azzVar18 = new azz((Integer) beq.setY(new Object[]{131334}, 843618426, -843618423, 131334), new c(32));
        setZ = azzVar18;
        azz azzVar19 = new azz((Integer) beq.setY(new Object[]{131585}, 843618426, -843618423, 131585), new c(16));
        azz azzVar20 = new azz((Integer) beq.setY(new Object[]{131586}, 843618426, -843618423, 131586), new c(16));
        azz azzVar21 = new azz((Integer) beq.setY(new Object[]{131587}, 843618426, -843618423, 131587), new c(24));
        azz azzVar22 = new azz((Integer) beq.setY(new Object[]{131588}, 843618426, -843618423, 131588), new c(24));
        azz azzVar23 = new azz((Integer) beq.setY(new Object[]{131589}, 843618426, -843618423, 131589), new c(32));
        azz azzVar24 = new azz((Integer) beq.setY(new Object[]{131590}, 843618426, -843618423, 131590), new c(32));
        azz azzVar25 = new azz((Integer) beq.setY(new Object[]{196865}, 843618426, -843618423, 196865), new b(16));
        UiMessageCallbackKtWhenMappings = azzVar25;
        azz azzVar26 = new azz((Integer) beq.setY(new Object[]{196866}, 843618426, -843618423, 196866), new b(16));
        setIncludeFontPadding = azzVar26;
        azz azzVar27 = new azz((Integer) beq.setY(new Object[]{196867}, 843618426, -843618423, 196867), new b(24));
        setTextAlignment = azzVar27;
        azz azzVar28 = new azz((Integer) beq.setY(new Object[]{196868}, 843618426, -843618423, 196868), new b(24));
        getAmountFieldTextColor = azzVar28;
        azz azzVar29 = new azz((Integer) beq.setY(new Object[]{196869}, 843618426, -843618423, 196869), new b(32));
        setCompoundDrawablePadding = azzVar29;
        azz azzVar30 = new azz((Integer) beq.setY(new Object[]{196870}, 843618426, -843618423, 196870), new b(32));
        setChildDivider = azzVar30;
        azz azzVar31 = new azz((Integer) beq.setY(new Object[]{197121}, 843618426, -843618423, 197121), new b(16));
        azz azzVar32 = new azz((Integer) beq.setY(new Object[]{197122}, 843618426, -843618423, 197122), new b(16));
        azz azzVar33 = new azz((Integer) beq.setY(new Object[]{197123}, 843618426, -843618423, 197123), new b(24));
        azz azzVar34 = new azz((Integer) beq.setY(new Object[]{197124}, 843618426, -843618423, 197124), new b(24));
        azz azzVar35 = new azz((Integer) beq.setY(new Object[]{197125}, 843618426, -843618423, 197125), new b(32));
        azz azzVar36 = new azz((Integer) beq.setY(new Object[]{197126}, 843618426, -843618423, 197126), new b(32));
        f54222c = new HashMap();
        azz[] azzVarArr = {azzVar, azzVar2, azzVar3, azzVar4, azzVar5, azzVar6, azzVar7, azzVar8, azzVar9, azzVar10, azzVar11, azzVar12, azzVar13, azzVar14, azzVar15, azzVar16, azzVar17, azzVar18, azzVar19, azzVar20, azzVar21, azzVar22, azzVar23, azzVar24, azzVar25, azzVar26, azzVar27, azzVar28, azzVar29, azzVar30, azzVar31, azzVar32, azzVar33, azzVar34, azzVar35, azzVar36};
        int i10 = f54223d;
        int i11 = i10 & 95;
        int i12 = ((i10 ^ 95) | i11) << 1;
        int i13 = -((i10 | 95) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f54224e = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < 36) {
            int i17 = f54224e;
            int i18 = i17 ^ 13;
            int i19 = ((((i17 & 13) | i18) << 1) - (~(-i18))) - 1;
            f54223d = i19 % 128;
            int i20 = i19 % 2;
            azz azzVar37 = azzVarArr[i16];
            f54222c.put((Integer) setOnFocusChangeListener(new Object[]{azzVar37}, 1140593598, -1140593598, System.identityHashCode(azzVar37)), azzVar37);
            int i21 = ((i16 & 1) - (~(i16 | 1))) - 1;
            int i22 = f54224e + 71;
            f54223d = i22 % 128;
            int i23 = i22 % 2;
            i16 = i21;
        }
        int i24 = f54224e + 45;
        f54223d = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }

    public azz(Integer num, v2 v2Var) {
        this.f54225a = num;
        this.f54226b = v2Var;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * TypedValues.MotionType.TYPE_EASING) + (i10 * 302);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i11 | i15)) * 301) + (((~(i10 | i15 | i11)) | (~(i12 | i14)) | (~((~i11) | i14))) * (-301)) + (((~(i14 | i15)) | i11) * (-602)) + i13;
        if (i16 == 1) {
            azz azzVar = (azz) objArr[0];
            int i17 = f54224e;
            int i18 = i17 ^ 97;
            int i19 = ((i17 & 97) | i18) << 1;
            int i20 = -i18;
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            f54223d = i21 % 128;
            if (i21 % 2 == 0) {
                int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{azzVar}, 1140593598, -1140593598, System.identityHashCode(azzVar))).intValue();
                return (byte[]) ber.setDividerPadding(new Object[]{Integer.valueOf(iIntValue)}, 1002534333, -1002534318, iIntValue);
            }
            int iIntValue2 = ((Integer) setOnFocusChangeListener(new Object[]{azzVar}, 1140593598, -1140593598, System.identityHashCode(azzVar))).intValue();
            int i22 = 34 / 0;
            return (byte[]) ber.setDividerPadding(new Object[]{Integer.valueOf(iIntValue2)}, 1002534333, -1002534318, iIntValue2);
        }
        if (i16 != 2) {
            azz azzVar2 = (azz) objArr[0];
            int i23 = f54223d;
            int i24 = ((-1) << 1) - (((i23 & 96) + (i23 | 96)) ^ (-1));
            int i25 = i24 % 128;
            f54224e = i25;
            int i26 = i24 % 2;
            Integer num = azzVar2.f54225a;
            int i27 = i25 & 39;
            int i28 = (i25 | 39) & (~i27);
            int i29 = -(-(i27 << 1));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f54223d = i30 % 128;
            int i31 = i30 % 2;
            return num;
        }
        azz azzVar3 = (azz) objArr[0];
        int i32 = f54224e + 5;
        f54223d = i32 % 128;
        int i33 = i32 % 2;
        v2 v2Var = azzVar3.f54226b;
        if (i33 != 0) {
            v2Var.setOnFocusChangeListener();
            throw null;
        }
        int onFocusChangeListener = v2Var.setOnFocusChangeListener();
        int i34 = f54223d;
        int i35 = (((i34 | 74) << 1) - (i34 ^ 74)) - 1;
        f54224e = i35 % 128;
        if (i35 % 2 != 0) {
            return Integer.valueOf(onFocusChangeListener);
        }
        throw null;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1303490317, 1303490318, System.identityHashCode(this));
    }
}
