package com.mypinpad.tsdk.isolation;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ln extends GlobalEndpoint<lq> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f56971q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f56972r = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final component17 f56973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final mc f56975p;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f56976s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56977t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f56978p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f56980r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            Object obj2 = objArr[1];
            int i10 = f56976s0;
            int i11 = (i10 & (-46)) | ((~i10) & 45);
            int i12 = (i10 & 45) << 1;
            int i13 = (i11 & i12) + (i12 | i11);
            f56977t0 = i13 % 128;
            int i14 = i13 % 2;
            aVar.f56978p0 = obj2;
            int i15 = aVar.f56980r0;
            int i16 = i15 ^ Integer.MIN_VALUE;
            int i17 = i15 & Integer.MIN_VALUE;
            aVar.f56980r0 = (i17 & i16) | (i16 ^ i17);
            Object compoundDrawableTintBlendMode = ln.this.setCompoundDrawableTintBlendMode(null, aVar);
            int i18 = f56977t0;
            int i19 = i18 & 63;
            int i20 = (((i18 ^ 63) | i19) << 1) - ((i18 | 63) & (~i19));
            f56976s0 = i20 % 128;
            int i21 = i20 % 2;
            return compoundDrawableTintBlendMode;
        }
    }

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[fg.values().length];
            iArr[fg.setDividerPadding.ordinal()] = 1;
            iArr[fg.setX.ordinal()] = 2;
            iArr[fg.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr[fg.setNavigationOnClickListener.ordinal()] = 4;
            iArr[fg.setZ.ordinal()] = 5;
            iArr[fg.getNavBarTitleString.ordinal()] = 6;
            iArr[fg.UiMessageCallbackKtWhenMappings.ordinal()] = 7;
            iArr[fg.setTextScaleX.ordinal()] = 8;
            setX = iArr;
            int i10 = (103 << 1) - 103;
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setTextKeepState settextkeepstate, @NotNull me meVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop, @NotNull setChildIndicator setchildindicator, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull component17 component17Var, @NotNull setContentDescription setcontentdescription) throws Exception {
        super(settextkeepstate, getvalue, diVar, component10Var, settop, setfontfeaturesettings);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(meVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56973n = component17Var;
        this.f56974o = setcontentdescription;
        setX(new lq(setbackgroundtintlist, diVar, setchildindicator));
        lq navigationOnClickListener = setNavigationOnClickListener();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{navigationOnClickListener, meVar.setCompoundDrawableTintBlendMode(), settop}, -919932723, 919932782, System.identityHashCode(navigationOnClickListener));
        this.f56975p = new mc();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[PHI: r6
      0x0045: PHI (r6v23 com.mypinpad.tsdk.i.ln$a) = (r6v22 com.mypinpad.tsdk.i.ln$a), (r6v25 com.mypinpad.tsdk.i.ln$a) binds: [B:11:0x0043, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        a aVar;
        int i13;
        int i14;
        fk fkVar;
        int i15;
        int i16;
        int i17;
        fk fkVar2;
        int i18;
        ln lnVar = (ln) objArr[0];
        fg fgVar = (fg) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i19 = (-2) - ((f56972r + 102) ^ (-1));
        int i20 = i19 % 128;
        f56971q = i20;
        int i21 = i19 % 2;
        if (!(continuation instanceof a)) {
            aVar = lnVar.new a(continuation);
            int i22 = f56972r;
            int i23 = i22 & 93;
            int i24 = (i22 ^ 93) | i23;
            i13 = (i23 ^ i24) + ((i24 & i23) << 1);
            f56971q = i13 % 128;
        } else {
            int i25 = (-2) - ((i20 + 44) ^ (-1));
            f56972r = i25 % 128;
            if (i25 % 2 == 0) {
                aVar = (a) continuation;
                int i26 = 74 / 0;
                if ((aVar.f56980r0 & Integer.MIN_VALUE) != 0) {
                    int i27 = aVar.f56980r0;
                    int iIdentityHashCode = System.identityHashCode(lnVar);
                    int i28 = i27 * (-167);
                    int i29 = ((Integer.MIN_VALUE | i28) << 1) - (i28 ^ Integer.MIN_VALUE);
                    int i30 = ~i27;
                    int i31 = (i30 | i27) & i30;
                    int i32 = ~((Integer.MAX_VALUE ^ i31) | (Integer.MAX_VALUE & i31));
                    int i33 = ~iIdentityHashCode;
                    int i34 = i33 & (i33 | iIdentityHashCode);
                    int i35 = i30 & i34;
                    int i36 = (~i35) & (i30 | i34);
                    int i37 = ~((i36 ^ i35) | (i36 & i35));
                    int i38 = ((~i32) & i37) | ((~i37) & i32);
                    int i39 = i37 & i32;
                    int i40 = ((i39 & i38) | (i38 ^ i39)) * 168;
                    int i41 = ((i29 | i40) << 1) - (i40 ^ i29);
                    int i42 = Integer.MAX_VALUE & i30;
                    int i43 = (i30 | Integer.MAX_VALUE) & (~i42);
                    int i44 = (i42 & i43) | (i43 ^ i42);
                    int i45 = i44 & iIdentityHashCode;
                    int i46 = (i44 | iIdentityHashCode) & (~i45);
                    int i47 = (-2) - (((i41 - (~(-(~((~((i46 & i45) | (i46 ^ i45))) * 168))))) - 1) ^ (-1));
                    int i48 = ((~i34) & Integer.MAX_VALUE) | (i34 & Integer.MIN_VALUE);
                    int i49 = Integer.MAX_VALUE & i34;
                    int i50 = (i48 & i49) | (i48 ^ i49);
                    int i51 = ~i50;
                    int i52 = (i50 | i51) & i51;
                    int i53 = (i27 & Integer.MAX_VALUE) | (Integer.MAX_VALUE ^ i27);
                    int i54 = ~i53;
                    int i55 = (i53 | i54) & i54;
                    int i56 = (i52 & i55) | ((~i55) & i52) | ((~i52) & i55);
                    int i57 = i31 & Integer.MIN_VALUE;
                    int i58 = (Integer.MIN_VALUE | i31) & (~i57);
                    int i59 = (i57 & i58) | (i58 ^ i57);
                    int i60 = i59 ^ iIdentityHashCode;
                    int i61 = i59 & iIdentityHashCode;
                    int i62 = -(-((i56 | (~((i61 & i60) | (i60 ^ i61)))) * 168));
                    aVar.f56980r0 = (i47 & i62) + (i47 | i62);
                    int i63 = f56971q;
                    int i64 = i63 ^ 77;
                    int i65 = -(-((i63 & 77) << 1));
                    i13 = (i64 & i65) + (i65 | i64);
                    f56972r = i13 % 128;
                } else {
                    aVar = lnVar.new a(continuation);
                    int i210 = f56972r;
                    int i211 = i210 & 93;
                    int i212 = (i210 ^ 93) | i211;
                    i13 = (i211 ^ i212) + ((i212 & i211) << 1);
                    f56971q = i13 % 128;
                }
            } else {
                aVar = (a) continuation;
                if ((aVar.f56980r0 & Integer.MIN_VALUE) != 0) {
                    int i213 = aVar.f56980r0;
                    int iIdentityHashCode2 = System.identityHashCode(lnVar);
                    int i214 = i213 * (-167);
                    int i215 = ((Integer.MIN_VALUE | i214) << 1) - (i214 ^ Integer.MIN_VALUE);
                    int i310 = ~i213;
                    int i311 = (i310 | i213) & i310;
                    int i312 = ~((Integer.MAX_VALUE ^ i311) | (Integer.MAX_VALUE & i311));
                    int i313 = ~iIdentityHashCode2;
                    int i314 = i313 & (i313 | iIdentityHashCode2);
                    int i315 = i310 & i314;
                    int i316 = (~i315) & (i310 | i314);
                    int i317 = ~((i316 ^ i315) | (i316 & i315));
                    int i318 = ((~i312) & i317) | ((~i317) & i312);
                    int i319 = i317 & i312;
                    int i410 = ((i319 & i318) | (i318 ^ i319)) * 168;
                    int i411 = ((i215 | i410) << 1) - (i410 ^ i215);
                    int i412 = Integer.MAX_VALUE & i310;
                    int i413 = (i310 | Integer.MAX_VALUE) & (~i412);
                    int i414 = (i412 & i413) | (i413 ^ i412);
                    int i415 = i414 & iIdentityHashCode2;
                    int i416 = (i414 | iIdentityHashCode2) & (~i415);
                    int i417 = (-2) - (((i411 - (~(-(~((~((i416 & i415) | (i416 ^ i415))) * 168))))) - 1) ^ (-1));
                    int i418 = ((~i314) & Integer.MAX_VALUE) | (i314 & Integer.MIN_VALUE);
                    int i419 = Integer.MAX_VALUE & i314;
                    int i510 = (i418 & i419) | (i418 ^ i419);
                    int i511 = ~i510;
                    int i512 = (i510 | i511) & i511;
                    int i513 = (i213 & Integer.MAX_VALUE) | (Integer.MAX_VALUE ^ i213);
                    int i514 = ~i513;
                    int i515 = (i513 | i514) & i514;
                    int i516 = (i512 & i515) | ((~i515) & i512) | ((~i512) & i515);
                    int i517 = i311 & Integer.MIN_VALUE;
                    int i518 = (Integer.MIN_VALUE | i311) & (~i517);
                    int i519 = (i517 & i518) | (i518 ^ i517);
                    int i66 = i519 ^ iIdentityHashCode2;
                    int i67 = i519 & iIdentityHashCode2;
                    int i68 = -(-((i516 | (~((i67 & i66) | (i66 ^ i67)))) * 168));
                    aVar.f56980r0 = (i417 & i68) + (i417 | i68);
                    int i69 = f56971q;
                    int i610 = i69 ^ 77;
                    int i611 = -(-((i69 & 77) << 1));
                    i13 = (i610 & i611) + (i611 | i610);
                    f56972r = i13 % 128;
                } else {
                    aVar = lnVar.new a(continuation);
                    int i216 = f56972r;
                    int i217 = i216 & 93;
                    int i218 = (i216 ^ 93) | i217;
                    i13 = (i217 ^ i218) + ((i218 & i217) << 1);
                    f56971q = i13 % 128;
                }
            }
        }
        int i70 = i13 % 2;
        Object compoundDrawableTintBlendMode = aVar.f56978p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (aVar.f56980r0) {
            case 0:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                switch (setDividerPadding.setX[fgVar.ordinal()]) {
                    case 1:
                        lm lmVar = new lm(lnVar.setNavigationOnClickListener(), lnVar.setOnFocusChangeListener(), lnVar.f56975p, lnVar.f56973n);
                        aVar.f56980r0 = 1;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lmVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lmVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i71 = f56971q;
                            int i72 = i71 + 53;
                            f56972r = i72 % 128;
                            int i73 = i72 % 2;
                            int i74 = i71 & 117;
                            int i75 = -(-((i71 ^ 117) | i74));
                            int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                            f56972r = i76 % 128;
                            if (i76 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            i14 = 43;
                            int i77 = i14 / 0;
                            return coroutine_suspended;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        int iIdentityHashCode3 = System.identityHashCode(lnVar);
                        int i78 = ((~(((-1917336695) & iIdentityHashCode3) | ((-1917336695) ^ iIdentityHashCode3))) | (-412819193)) * (-948);
                        int i79 = (-1611361786) & i78;
                        int i80 = (i78 | (-1611361786)) & (~i79);
                        int i81 = i79 << 1;
                        int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                        int i83 = ~iIdentityHashCode3;
                        int i84 = (-268967025) & i83;
                        int i85 = (~(((i83 | (-268967025)) & (~i84)) | i84)) * (-948);
                        int i86 = i82 & i85;
                        int i87 = ((((i82 ^ i85) | i86) << 1) - (~(-((i85 | i82) & (~i86))))) - 1;
                        int i88 = ((-713647637) & i87) | ((~i87) & 713647636);
                        int i89 = -(-((i87 & 713647636) << 1));
                        i15 = (i88 & i89) + (i88 | i89);
                        int iIdentityHashCode4 = System.identityHashCode(lnVar);
                        int i90 = ~iIdentityHashCode4;
                        int i91 = (-119718940) & i90;
                        int i92 = (iIdentityHashCode4 & 119718939) | i91;
                        int i93 = (-119718940) & iIdentityHashCode4;
                        int i94 = ~((i92 & i93) | (i92 ^ i93));
                        int i95 = (i90 | iIdentityHashCode4) & i90;
                        int i96 = (i95 & 1784998028) | ((~i95) & (-1784998029));
                        int i97 = i95 & (-1784998029);
                        int i98 = (i97 & i96) | (i96 ^ i97);
                        int i99 = (i98 & (-119718940)) | ((~i98) & 119718939);
                        int i100 = i98 & 119718939;
                        int i101 = (i100 & i99) | (i99 ^ i100);
                        int i102 = ~i101;
                        int i103 = (i101 | i102) & i102;
                        int i104 = ((i94 & i103) | (i94 ^ i103)) * (-406);
                        int i105 = ((-119718940) | i90) & (~i91);
                        int i106 = (i105 & i91) | (i105 ^ i91);
                        int i107 = i106 & (-1784998029);
                        int i108 = (i106 | (-1784998029)) & (~i107);
                        int i109 = (i108 & i107) | (i108 ^ i107);
                        int i110 = ~i109;
                        i16 = (((((-1444303362) | i104) << 1) - (i104 ^ (-1444303362))) - (~(-(-(((i109 | i110) & i110) * (-406)))))) - 1;
                        int i111 = ~((iIdentityHashCode4 & 1784998028) | (1784998028 ^ iIdentityHashCode4));
                        int i112 = i90 ^ 119718939;
                        int i113 = i90 & 119718939;
                        int i114 = ~((i113 & i112) | (i112 ^ i113));
                        int i115 = i111 & i114;
                        int i116 = (i111 | i114) & (~i115);
                        i17 = ((i116 & i115) | (i116 ^ i115)) * 406;
                        if (i15 > ((i16 ^ i17) - (~((i17 & i16) << 1))) - 1) {
                            return fkVar;
                        }
                        int i117 = 20 / 0;
                        return fkVar;
                    case 2:
                        lu luVar = new lu(lnVar.setNavigationOnClickListener(), lnVar.setOnFocusChangeListener(), lnVar.f56975p, lnVar.setY());
                        aVar.f56980r0 = 2;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{luVar, aVar}, 1559788296, -1559788294, System.identityHashCode(luVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i118 = f56972r;
                            int i119 = i118 & 97;
                            int i120 = i119 + ((i118 ^ 97) | i119);
                            int i121 = i120 % 128;
                            f56971q = i121;
                            int i122 = i120 % 2;
                            int i123 = i121 + 32;
                            int i124 = (i123 ^ (-1)) + (i123 << 1);
                            f56972r = i124 % 128;
                            if (i124 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        fk fkVar3 = (fk) compoundDrawableTintBlendMode;
                        int i125 = f56971q;
                        int i126 = (((i125 | 24) << 1) - (i125 ^ 24)) - 1;
                        f56972r = i126 % 128;
                        int i127 = i126 % 2;
                        return fkVar3;
                    case 3:
                        ls lsVar = new ls(lnVar.setNavigationOnClickListener(), lnVar.setOnFocusChangeListener(), lnVar.f56975p, lnVar.setY(), lnVar.f56974o);
                        aVar.f56980r0 = 3;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lsVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lsVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i128 = f56971q;
                            int i129 = (i128 & 16) + (i128 | 16);
                            int i130 = (i129 ^ (-1)) + (i129 << 1);
                            f56972r = i130 % 128;
                            if (i130 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 4:
                        lr lrVar = new lr(lnVar.setNavigationOnClickListener(), lnVar.setOnFocusChangeListener(), lnVar.f56975p, lnVar.setY(), lnVar.f56974o);
                        aVar.f56980r0 = 4;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lrVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lrVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i131 = f56972r;
                            int i132 = (i131 | 119) << 1;
                            int i133 = -((i131 & (-120)) | ((~i131) & 119));
                            int i134 = (i132 & i133) + (i132 | i133);
                            f56971q = i134 % 128;
                            int i135 = i134 % 2;
                            int i136 = i131 & 31;
                            int i137 = (i131 | 31) & (~i136);
                            int i138 = -(-(i136 << 1));
                            int i139 = (i137 ^ i138) + ((i137 & i138) << 1);
                            f56971q = i139 % 128;
                            if (i139 % 2 == 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        fkVar2 = (fk) compoundDrawableTintBlendMode;
                        i18 = f56972r + 83;
                        f56971q = i18 % 128;
                        int i140 = i18 % 2;
                        return fkVar2;
                    case 5:
                        lz lzVar = new lz(lnVar.setNavigationOnClickListener(), lnVar.setOnFocusChangeListener(), lnVar.f56975p, lnVar.setY(), lnVar.setX(), lnVar.setDividerPadding(), lnVar.f56974o);
                        aVar.f56980r0 = 5;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lzVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lzVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i141 = f56971q;
                            int i142 = (i141 & 111) + (i141 | 111);
                            f56972r = i142 % 128;
                            if (i142 % 2 != 0) {
                                return coroutine_suspended;
                            }
                            i14 = 72;
                            int i710 = i14 / 0;
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 6:
                        lx lxVar = new lx(lnVar.setNavigationOnClickListener(), lnVar.setOnFocusChangeListener(), lnVar.f56975p, lnVar.setY(), lnVar.setX(), lnVar.setDividerPadding(), lnVar.f56974o);
                        aVar.f56980r0 = 6;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lxVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lxVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i143 = f56972r;
                            int i144 = (((i143 | 100) << 1) - (i143 ^ 100)) - 1;
                            f56971q = i144 % 128;
                            if (i144 % 2 == 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        fkVar2 = (fk) compoundDrawableTintBlendMode;
                        int i145 = f56971q;
                        int i146 = i145 & 39;
                        i18 = (((i145 | 39) & (~i146)) - (~(-(-(i146 << 1))))) - 1;
                        f56972r = i18 % 128;
                        int i147 = i18 % 2;
                        return fkVar2;
                    case 7:
                        lw lwVar = new lw(lnVar.setNavigationOnClickListener(), lnVar.setOnFocusChangeListener(), lnVar.f56975p, lnVar.setY());
                        aVar.f56980r0 = 7;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lwVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lwVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i148 = f56971q + 55;
                            int i149 = i148 % 128;
                            f56972r = i149;
                            if (i148 % 2 == 0) {
                                throw null;
                            }
                            int i150 = (i149 & (-8)) | ((~i149) & 7);
                            int i151 = -(-((7 & i149) << 1));
                            int i152 = ((i150 | i151) << 1) - (i150 ^ i151);
                            f56971q = i152 % 128;
                            if (i152 % 2 == 0) {
                                return coroutine_suspended;
                            }
                            throw null;
                        }
                        fk fkVar4 = (fk) compoundDrawableTintBlendMode;
                        int i153 = f56971q;
                        int i154 = i153 & 89;
                        int i155 = (i153 ^ 89) | i154;
                        int i156 = (i154 & i155) + (i155 | i154);
                        f56972r = i156 % 128;
                        int i157 = i156 % 2;
                        return fkVar4;
                    case 8:
                        int i158 = f56972r + 37;
                        f56971q = i158 % 128;
                        if (i158 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    default:
                        throw new fh(1, fgVar.toString());
                }
            case 1:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i159 = f56972r;
                int i160 = ((i159 | 118) << 1) - (i159 ^ 118);
                int i161 = (i160 ^ (-1)) + (i160 << 1);
                f56971q = i161 % 128;
                int i162 = i161 % 2;
                fkVar = (fk) compoundDrawableTintBlendMode;
                int iIdentityHashCode5 = System.identityHashCode(lnVar);
                int i711 = ((~(((-1917336695) & iIdentityHashCode5) | ((-1917336695) ^ iIdentityHashCode5))) | (-412819193)) * (-948);
                int i712 = (-1611361786) & i711;
                int i810 = (i711 | (-1611361786)) & (~i712);
                int i811 = i712 << 1;
                int i812 = (i810 ^ i811) + ((i810 & i811) << 1);
                int i813 = ~iIdentityHashCode5;
                int i814 = (-268967025) & i813;
                int i815 = (~(((i813 | (-268967025)) & (~i814)) | i814)) * (-948);
                int i816 = i812 & i815;
                int i817 = ((((i812 ^ i815) | i816) << 1) - (~(-((i815 | i812) & (~i816))))) - 1;
                int i818 = ((-713647637) & i817) | ((~i817) & 713647636);
                int i819 = -(-((i817 & 713647636) << 1));
                i15 = (i818 & i819) + (i818 | i819);
                int iIdentityHashCode6 = System.identityHashCode(lnVar);
                int i910 = ~iIdentityHashCode6;
                int i911 = (-119718940) & i910;
                int i912 = (iIdentityHashCode6 & 119718939) | i911;
                int i913 = (-119718940) & iIdentityHashCode6;
                int i914 = ~((i912 & i913) | (i912 ^ i913));
                int i915 = (i910 | iIdentityHashCode6) & i910;
                int i916 = (i915 & 1784998028) | ((~i915) & (-1784998029));
                int i917 = i915 & (-1784998029);
                int i918 = (i917 & i916) | (i916 ^ i917);
                int i919 = (i918 & (-119718940)) | ((~i918) & 119718939);
                int i1010 = i918 & 119718939;
                int i1011 = (i1010 & i919) | (i919 ^ i1010);
                int i1012 = ~i1011;
                int i1013 = (i1011 | i1012) & i1012;
                int i1014 = ((i914 & i1013) | (i914 ^ i1013)) * (-406);
                int i1015 = ((-119718940) | i910) & (~i911);
                int i1016 = (i1015 & i911) | (i1015 ^ i911);
                int i1017 = i1016 & (-1784998029);
                int i1018 = (i1016 | (-1784998029)) & (~i1017);
                int i1019 = (i1018 & i1017) | (i1018 ^ i1017);
                int i1110 = ~i1019;
                i16 = (((((-1444303362) | i1014) << 1) - (i1014 ^ (-1444303362))) - (~(-(-(((i1019 | i1110) & i1110) * (-406)))))) - 1;
                int i1111 = ~((iIdentityHashCode6 & 1784998028) | (1784998028 ^ iIdentityHashCode6));
                int i1112 = i910 ^ 119718939;
                int i1113 = i910 & 119718939;
                int i1114 = ~((i1113 & i1112) | (i1112 ^ i1113));
                int i1115 = i1111 & i1114;
                int i1116 = (i1111 | i1114) & (~i1115);
                i17 = ((i1116 & i1115) | (i1116 ^ i1115)) * 406;
                if (i15 > ((i16 ^ i17) - (~((i17 & i16) << 1))) - 1) {
                    return fkVar;
                }
                int i1117 = 20 / 0;
                return fkVar;
            case 2:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                System.identityHashCode(lnVar);
                System.identityHashCode(lnVar);
                fk fkVar5 = (fk) compoundDrawableTintBlendMode;
                int i1210 = f56971q;
                int i1211 = (((i1210 | 24) << 1) - (i1210 ^ 24)) - 1;
                f56972r = i1211 % 128;
                int i1212 = i1211 % 2;
                return fkVar5;
            case 3:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i163 = f56972r;
                int i164 = i163 | 47;
                int i165 = i164 << 1;
                int i166 = -((~(i163 & 47)) & i164);
                int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                f56971q = i167 % 128;
                int i168 = i167 % 2;
                return (fk) compoundDrawableTintBlendMode;
            case 4:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i169 = f56972r + 55;
                f56971q = i169 % 128;
                int i170 = i169 % 2;
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                i18 = f56972r + 83;
                f56971q = i18 % 128;
                int i1410 = i18 % 2;
                return fkVar2;
            case 5:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                return (fk) compoundDrawableTintBlendMode;
            case 6:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i171 = f56972r;
                int i172 = (((i171 & (-58)) | ((~i171) & 57)) - (~(-(-((i171 & 57) << 1))))) - 1;
                f56971q = i172 % 128;
                int i173 = i172 % 2;
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                int i1411 = f56971q;
                int i1412 = i1411 & 39;
                i18 = (((i1411 | 39) & (~i1412)) - (~(-(-(i1412 << 1))))) - 1;
                f56972r = i18 % 128;
                int i1413 = i18 % 2;
                return fkVar2;
            case 7:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                fk fkVar6 = (fk) compoundDrawableTintBlendMode;
                int i1510 = f56971q;
                int i1511 = i1510 & 89;
                int i1512 = (i1510 ^ 89) | i1511;
                int i1513 = (i1511 & i1512) + (i1512 | i1511);
                f56972r = i1513 % 128;
                int i1514 = i1513 % 2;
                return fkVar6;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull fg fgVar, @NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, fgVar, continuation}, 2050803566, -2050803566, System.identityHashCode(this));
    }
}
