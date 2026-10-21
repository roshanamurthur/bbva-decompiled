package com.mypinpad.tsdk.isolation;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ix extends GlobalEndpoint<iv> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f56548r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f56549s = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final iw f56550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final component17 f56551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final kc f56553q;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f56554p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f56556r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f56554p0 = objArr[1];
            int i10 = aVar.f56556r0;
            aVar.f56556r0 = (i10 & Integer.MIN_VALUE) | (Integer.MAX_VALUE & i10) | ((~i10) & Integer.MIN_VALUE);
            return ix.this.setCompoundDrawableTintBlendMode(null, aVar);
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[fg.values().length];
            iArr[fg.setDividerPadding.ordinal()] = 1;
            iArr[fg.setX.ordinal()] = 2;
            iArr[fg.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr[fg.setNavigationOnClickListener.ordinal()] = 4;
            iArr[fg.setZ.ordinal()] = 5;
            iArr[fg.setAlwaysDrawnWithCacheEnabled.ordinal()] = 6;
            iArr[fg.setTextScaleX.ordinal()] = 7;
            setY = iArr;
            int i10 = 1 & 1;
            int i11 = ((~i10) & (1 | 1)) + (i10 << 1);
            int i12 = i11 % 128;
            if (i11 % 2 != 0) {
                int i13 = 30 / 0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setTextKeepState settextkeepstate, @NotNull me meVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull iw iwVar, @NotNull setChildIndicator setchildindicator, @NotNull component17 component17Var, @NotNull setContentDescription setcontentdescription) throws Exception {
        super(settextkeepstate, getvalue, diVar, component10Var, settop, setfontfeaturesettings);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(meVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(iwVar, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56550n = iwVar;
        this.f56551o = component17Var;
        this.f56552p = setcontentdescription;
        setX(new iv(setbackgroundtintlist, diVar, setchildindicator));
        iv navigationOnClickListener = setNavigationOnClickListener();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{navigationOnClickListener, meVar.setCompoundDrawableTintBlendMode(), settop}, -919932723, 919932782, System.identityHashCode(navigationOnClickListener));
        this.f56553q = new kc();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x020f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0212  */
    /* JADX WARN: Code duplicated, block: B:63:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        a aVar;
        fk fkVar;
        int i13;
        fk fkVar2;
        int i14;
        ix ixVar = (ix) objArr[0];
        fg fgVar = (fg) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i15 = f56548r + 25;
        int i16 = i15 % 128;
        f56549s = i16;
        if (i15 % 2 == 0) {
            boolean z10 = continuation instanceof a;
            throw null;
        }
        if (!(continuation instanceof a)) {
            aVar = ixVar.new a(continuation);
            int i17 = f56548r;
            int i18 = i17 ^ 21;
            int i19 = ((i17 & 21) | i18) << 1;
            int i20 = -i18;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            f56549s = i21 % 128;
            int i22 = i21 % 2;
        } else {
            int i23 = i16 & 107;
            int i24 = (((i16 ^ 107) | i23) << 1) - ((~i23) & (i16 | 107));
            f56548r = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = ((a) continuation).f56556r0;
                throw null;
            }
            aVar = (a) continuation;
            int i26 = aVar.f56556r0;
            int i27 = i26 & Integer.MIN_VALUE;
            if (i27 != 0) {
                aVar.f56556r0 = ((((i26 ^ Integer.MIN_VALUE) | i27) << 1) - (~(-(((~i26) & Integer.MIN_VALUE) | (Integer.MAX_VALUE & i26))))) - 1;
                int i28 = i16 & 3;
                int i29 = i16 | 3;
                int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                f56548r = i30 % 128;
                int i31 = i30 % 2;
            } else {
                aVar = ixVar.new a(continuation);
                int i110 = f56548r;
                int i111 = i110 ^ 21;
                int i112 = ((i110 & 21) | i111) << 1;
                int i210 = -i111;
                int i211 = ((i112 | i210) << 1) - (i112 ^ i210);
                f56549s = i211 % 128;
                int i212 = i211 % 2;
            }
        }
        Object compoundDrawableTintBlendMode = aVar.f56554p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (aVar.f56556r0) {
            case 0:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                switch (setOnFocusChangeListener.setY[fgVar.ordinal()]) {
                    case 1:
                        jj jjVar = new jj(ixVar.setNavigationOnClickListener(), ixVar.setOnFocusChangeListener(), ixVar.f56553q, ixVar.f56551o);
                        aVar.f56556r0 = 1;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{jjVar, aVar}, 1559788296, -1559788294, System.identityHashCode(jjVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            System.identityHashCode(ixVar);
                            System.identityHashCode(ixVar);
                            int i32 = f56549s;
                            int i33 = i32 & 71;
                            int i34 = (i33 - (~(-(-((i32 ^ 71) | i33))))) - 1;
                            f56548r = i34 % 128;
                            if (i34 % 2 != 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fk fkVar3 = (fk) compoundDrawableTintBlendMode;
                        int i35 = f56548r;
                        int i36 = i35 & 91;
                        int i37 = i36 + ((i35 ^ 91) | i36);
                        f56549s = i37 % 128;
                        int i38 = i37 % 2;
                        return fkVar3;
                    case 2:
                        jm jmVar = new jm(ixVar.setNavigationOnClickListener(), ixVar.setOnFocusChangeListener(), ixVar.f56553q, ixVar.setDividerPadding(), ixVar.setY());
                        aVar.f56556r0 = 2;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{jmVar, aVar}, 1559788296, -1559788294, System.identityHashCode(jmVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i39 = f56548r;
                            int i40 = (i39 & 59) + (i39 | 59);
                            int i41 = i40 % 128;
                            f56549s = i41;
                            int i42 = i40 % 2;
                            int i43 = (i41 ^ 67) + ((i41 & 67) << 1);
                            f56548r = i43 % 128;
                            int i44 = i43 % 2;
                            return coroutine_suspended;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        int i45 = f56549s;
                        int i46 = ((i45 ^ 77) | (i45 & 77)) << 1;
                        int i47 = -(((~i45) & 77) | (i45 & (-78)));
                        i13 = ((i46 | i47) << 1) - (i47 ^ i46);
                        f56548r = i13 % 128;
                        if (i13 % 2 != 0) {
                            return fkVar;
                        }
                        int i48 = 17 / 0;
                        return fkVar;
                    case 3:
                        jn jnVar = new jn(ixVar.setNavigationOnClickListener(), ixVar.setOnFocusChangeListener(), ixVar.f56553q, ixVar.setY(), ixVar.f56552p);
                        aVar.f56556r0 = 3;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{jnVar, aVar}, 1559788296, -1559788294, System.identityHashCode(jnVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i49 = ~System.identityHashCode(ixVar);
                            int i50 = (-1375750693) ^ i49;
                            int i51 = (-1375750693) & i49;
                            int i52 = ((i51 & i50) | (i50 ^ i51)) * 184;
                            int i53 = ((1156106753 ^ i52) | (1156106753 & i52)) << 1;
                            int i54 = -((i52 & (-1156106754)) | (1156106753 & (~i52)));
                            int i55 = (i53 & i54) + (i54 | i53);
                            int i56 = ~((i49 & (-1386565165)) | (i49 ^ (-1386565165)));
                            int i57 = (i56 & (-2012180350)) | ((-2012180350) ^ i56);
                            int i58 = i57 & 10814472;
                            int i59 = (i57 | 10814472) & (~i58);
                            int i60 = -(~(-(-(((i59 & i58) | (i59 ^ i58)) * 184))));
                            int i61 = ((i55 ^ i60) + ((i60 & i55) << 1)) - 1;
                            int iIdentityHashCode = System.identityHashCode(ixVar);
                            int i62 = ~iIdentityHashCode;
                            int i63 = (-106434626) & i62;
                            int i64 = ((-106434626) | i62) & (~i63);
                            int i65 = (i64 & i63) | (i64 ^ i63);
                            int i66 = ~i65;
                            int i67 = (i65 | i66) & i66;
                            int i68 = ~((2004662645 & iIdentityHashCode) | (2004662645 ^ iIdentityHashCode));
                            int i69 = i67 ^ i68;
                            int i70 = i67 & i68;
                            int i71 = (i70 & i69) | (i69 ^ i70);
                            int i72 = ~(((-556050453) & iIdentityHashCode) | ((-556050453) & i62) | (556050452 & iIdentityHashCode));
                            int i73 = ((~i72) & i71) | ((~i71) & i72);
                            int i74 = i71 & i72;
                            int i75 = (-2) - (((-339705887) - (~(((i74 & i73) | (i73 ^ i74)) * 765))) ^ (-1));
                            int i76 = i62 & (i62 | iIdentityHashCode);
                            int i77 = ~i76;
                            int i78 = ~((1898228020 & i77) | (i76 & (-1898228021)) | (1898228020 & i76));
                            int i79 = -(-(((i78 & 106434625) | (106434625 ^ i78)) * 1530));
                            int i80 = i75 & i79;
                            int i81 = (i75 ^ i79) | i80;
                            int i82 = (i80 & i81) + (i81 | i80);
                            int i83 = 1898228020 & iIdentityHashCode;
                            int i84 = (iIdentityHashCode | 1898228020) & (~i83);
                            int i85 = ~((i84 & i83) | (i84 ^ i83));
                            int i86 = (i77 & (-662485078)) | (662485077 & i76);
                            int i87 = i76 & (-662485078);
                            int i88 = ~((i87 & i86) | (i86 ^ i87) | (-1898228021));
                            int i89 = i85 ^ i88;
                            int i90 = i85 & i88;
                            int i91 = ((i90 & i89) | (i89 ^ i90)) * 765;
                            int i92 = i82 & i91;
                            if (i61 > i92 + ((i91 ^ i82) | i92)) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 4:
                        jp jpVar = new jp(ixVar.setNavigationOnClickListener(), ixVar.setOnFocusChangeListener(), ixVar.f56553q, ixVar.setY(), ixVar.f56552p);
                        aVar.f56556r0 = 4;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{jpVar, aVar}, 1559788296, -1559788294, System.identityHashCode(jpVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i93 = f56548r;
                            int i94 = i93 & 11;
                            int i95 = -(-((i93 ^ 11) | i94));
                            int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                            int i97 = i96 % 128;
                            f56549s = i97;
                            if (i96 % 2 == 0) {
                                throw null;
                            }
                            int i98 = i97 ^ 61;
                            int i99 = -(-((i97 & 61) << 1));
                            int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
                            f56548r = i100 % 128;
                            if (i100 % 2 != 0) {
                                int i101 = 49 / 0;
                            }
                            return coroutine_suspended;
                        }
                        fk fkVar4 = (fk) compoundDrawableTintBlendMode;
                        System.identityHashCode(ixVar);
                        System.identityHashCode(ixVar);
                        return fkVar4;
                    case 5:
                        jr jrVar = new jr(ixVar.setNavigationOnClickListener(), ixVar.setOnFocusChangeListener(), ixVar.f56553q, ixVar.setY(), ixVar.setX(), ixVar.setDividerPadding(), ixVar.f56550n, ixVar.f56552p);
                        aVar.f56556r0 = 5;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{jrVar, aVar}, 1559788296, -1559788294, System.identityHashCode(jrVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i102 = f56549s;
                            int i103 = (i102 & 57) + (i102 | 57);
                            f56548r = i103 % 128;
                            int i104 = i103 % 2;
                            int i105 = i102 + 35;
                            f56548r = i105 % 128;
                            int i106 = i105 % 2;
                            return coroutine_suspended;
                        }
                        fkVar2 = (fk) compoundDrawableTintBlendMode;
                        int i107 = f56549s;
                        int i108 = i107 & 79;
                        i14 = (((i107 | 79) & (~i108)) - (~(-(-(i108 << 1))))) - 1;
                        f56548r = i14 % 128;
                        if (i14 % 2 == 0) {
                            return fkVar2;
                        }
                        throw null;
                    case 6:
                        jx jxVar = new jx(ixVar.setNavigationOnClickListener(), ixVar.setOnFocusChangeListener(), ixVar.f56553q, ixVar.setY(), ixVar.f56550n);
                        aVar.f56556r0 = 6;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{jxVar, aVar}, 1559788296, -1559788294, System.identityHashCode(jxVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i109 = f56549s;
                            int i113 = ((i109 | 26) << 1) - (i109 ^ 26);
                            int i114 = (i113 ^ (-1)) + (i113 << 1);
                            f56548r = i114 % 128;
                            int i115 = i114 % 2;
                            int i116 = ((i109 ^ 105) | (i109 & 105)) << 1;
                            int i117 = -(((~i109) & 105) | (i109 & (-106)));
                            int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                            f56548r = i118 % 128;
                            int i119 = i118 % 2;
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 7:
                        int i120 = f56549s + 69;
                        f56548r = i120 % 128;
                        if (i120 % 2 == 0) {
                            return null;
                        }
                        int i121 = 94 / 0;
                        return null;
                    default:
                        throw new fh(1, fgVar.toString());
                }
            case 1:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i122 = f56548r;
                int i123 = i122 | 55;
                int i124 = i123 << 1;
                int i125 = -((~(i122 & 55)) & i123);
                int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                f56549s = i126 % 128;
                int i127 = i126 % 2;
                fk fkVar5 = (fk) compoundDrawableTintBlendMode;
                int i310 = f56548r;
                int i311 = i310 & 91;
                int i312 = i311 + ((i310 ^ 91) | i311);
                f56549s = i312 % 128;
                int i313 = i312 % 2;
                return fkVar5;
            case 2:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i128 = f56548r;
                int i129 = i128 ^ 81;
                int i130 = (((i128 & 81) | i129) << 1) - i129;
                f56549s = i130 % 128;
                int i131 = i130 % 2;
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i410 = f56549s;
                int i411 = ((i410 ^ 77) | (i410 & 77)) << 1;
                int i412 = -(((~i410) & 77) | (i410 & (-78)));
                i13 = ((i411 | i412) << 1) - (i412 ^ i411);
                f56548r = i13 % 128;
                if (i13 % 2 != 0) {
                    return fkVar;
                }
                int i413 = 17 / 0;
                return fkVar;
            case 3:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i132 = f56548r;
                int i133 = i132 & 19;
                int i134 = -(-((i132 ^ 19) | i133));
                int i135 = (i133 & i134) + (i134 | i133);
                f56549s = i135 % 128;
                int i136 = i135 % 2;
                return (fk) compoundDrawableTintBlendMode;
            case 4:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i137 = f56549s;
                int i138 = i137 & 117;
                int i139 = ((i137 ^ 117) | i138) << 1;
                int i140 = -((i137 | 117) & (~i138));
                int i141 = (i139 ^ i140) + ((i140 & i139) << 1);
                f56548r = i141 % 128;
                int i142 = i141 % 2;
                fk fkVar6 = (fk) compoundDrawableTintBlendMode;
                System.identityHashCode(ixVar);
                System.identityHashCode(ixVar);
                return fkVar6;
            case 5:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i143 = f56549s;
                int i144 = i143 & 49;
                int i145 = (i143 | 49) & (~i144);
                int i146 = -(-(i144 << 1));
                int i147 = (i145 & i146) + (i145 | i146);
                f56548r = i147 % 128;
                int i148 = i147 % 2;
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                int i1010 = f56549s;
                int i1011 = i1010 & 79;
                i14 = (((i1010 | 79) & (~i1011)) - (~(-(-(i1011 << 1))))) - 1;
                f56548r = i14 % 128;
                if (i14 % 2 == 0) {
                    return fkVar2;
                }
                throw null;
            case 6:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i149 = f56548r;
                int i150 = i149 & 51;
                int i151 = -(-((i149 ^ 51) | i150));
                int i152 = (i150 & i151) + (i151 | i150);
                f56549s = i152 % 128;
                int i153 = i152 % 2;
                return (fk) compoundDrawableTintBlendMode;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull fg fgVar, @NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, fgVar, continuation}, 1835458184, -1835458184, System.identityHashCode(this));
    }
}
