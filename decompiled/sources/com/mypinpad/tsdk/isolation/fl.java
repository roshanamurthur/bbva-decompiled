package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class fl extends GlobalEndpoint<fi> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f55549r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f55550s = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final setClipToOutline f55551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final component17 f55552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final setContentDescription f55553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final gr f55554q;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f55555p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f55557r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f55555p0 = objArr[1];
            aVar.f55557r0 |= Integer.MIN_VALUE;
            return fl.this.setCompoundDrawableTintBlendMode(null, aVar);
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[fg.values().length];
            iArr[fg.setDividerPadding.ordinal()] = 1;
            iArr[fg.setX.ordinal()] = 2;
            iArr[fg.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr[fg.setNavigationOnClickListener.ordinal()] = 4;
            iArr[fg.setZ.ordinal()] = 5;
            iArr[fg.UiMessageCallbackKtWhenMappings.ordinal()] = 6;
            iArr[fg.setOnEditorActionListener.ordinal()] = 7;
            iArr[fg.getAmountFieldTextColor.ordinal()] = 8;
            iArr[fg.setChildDivider.ordinal()] = 9;
            iArr[fg.setCompoundDrawablePadding.ordinal()] = 10;
            iArr[fg.getSuppressed.ordinal()] = 11;
            iArr[fg.setMaxEms.ordinal()] = 12;
            iArr[fg.setTextScaleX.ordinal()] = 13;
            setOnFocusChangeListener = iArr;
            int i10 = (1 ^ 63) + ((1 & 63) << 1);
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setTextKeepState settextkeepstate, @NotNull me meVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop, @NotNull setChildIndicator setchildindicator, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull setClipToOutline setcliptooutline, @NotNull component17 component17Var, @NotNull setContentDescription setcontentdescription) throws Exception {
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
        Intrinsics.checkNotNullParameter(setcliptooutline, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f55551n = setcliptooutline;
        this.f55552o = component17Var;
        this.f55553p = setcontentdescription;
        setX(new fi(setbackgroundtintlist, diVar, setchildindicator));
        fi navigationOnClickListener = setNavigationOnClickListener();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{navigationOnClickListener, meVar.setCompoundDrawableTintBlendMode(), settop}, -919932723, 919932782, System.identityHashCode(navigationOnClickListener));
        setAnimation setanimation = setAnimation.INSTANCE;
        setY(meVar, (TransactionFailed) setAnimation.setY(new Object[0], 481105771, -481105628, (int) System.currentTimeMillis()));
        this.f55554q = new gr();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d A[PHI: r8
      0x004d: PHI (r8v31 com.mypinpad.tsdk.i.fl$a) = (r8v30 com.mypinpad.tsdk.i.fl$a), (r8v33 com.mypinpad.tsdk.i.fl$a) binds: [B:12:0x004b, B:9:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x00b1  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        a aVar;
        int i13;
        int i14;
        int i15;
        fk fkVar;
        fk fkVar2;
        int i16;
        fl flVar = (fl) objArr[0];
        fg fgVar = (fg) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i17 = f55550s;
        int i18 = i17 & 67;
        int i19 = (~i18) & (i17 | 67);
        int i20 = i18 << 1;
        int i21 = (i19 & i20) + (i20 | i19);
        f55549r = i21 % 128;
        if (i21 % 2 != 0) {
            boolean z10 = continuation instanceof a;
            throw null;
        }
        if (continuation instanceof a) {
            int i22 = i17 & 120;
            int i23 = ((i17 ^ 120) + (i22 << 1)) - 1;
            f55549r = i23 % 128;
            if (i23 % 2 != 0) {
                aVar = (a) continuation;
                int i24 = 28 / 0;
                if ((aVar.f55557r0 & Integer.MIN_VALUE) != 0) {
                    int i25 = (i22 + (i17 | 120)) - 1;
                    f55549r = i25 % 128;
                    int i26 = i25 % 2;
                    int i27 = aVar.f55557r0;
                    int iIdentityHashCode = System.identityHashCode(flVar);
                    int i28 = -(-(i27 * 306));
                    int i29 = ((610 | i28) << 1) - (i28 ^ TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                    int i30 = ~((Integer.MIN_VALUE ^ i27) | (Integer.MIN_VALUE & i27));
                    int i31 = ~iIdentityHashCode;
                    int i32 = Integer.MIN_VALUE & i31;
                    int i33 = (iIdentityHashCode & Integer.MIN_VALUE) | (Integer.MAX_VALUE & iIdentityHashCode) | i32;
                    int i34 = ~i33;
                    int i35 = (i33 | i34) & i34;
                    int i36 = i30 & i35;
                    int i37 = (i35 | i30) & (~i36);
                    int i38 = -(-(((i37 & i36) | (i37 ^ i36)) * 305));
                    int i39 = i29 & i38;
                    int i40 = (i38 ^ i29) | i39;
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    int i42 = ~i27;
                    int i43 = (i31 ^ Integer.MIN_VALUE) | i32;
                    int i44 = ~i43;
                    int i45 = (i43 | i44) & i44;
                    int i46 = i42 & i45;
                    int i47 = (i42 | i45) & (~i46);
                    int i48 = -(-(((i47 & i46) | (i47 ^ i46)) * 305));
                    aVar.f55557r0 = ((((~i48) & i41) | ((~i41) & i48)) - (~((i48 & i41) << 1))) - 1;
                } else {
                    aVar = flVar.new a(continuation);
                    int i49 = f55549r;
                    int i50 = i49 & 51;
                    int i51 = (i49 ^ 51) | i50;
                    int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                    f55550s = i52 % 128;
                    int i53 = i52 % 2;
                }
            } else {
                aVar = (a) continuation;
                if ((aVar.f55557r0 & Integer.MIN_VALUE) != 0) {
                    int i210 = (i22 + (i17 | 120)) - 1;
                    f55549r = i210 % 128;
                    int i211 = i210 % 2;
                    int i212 = aVar.f55557r0;
                    int iIdentityHashCode2 = System.identityHashCode(flVar);
                    int i213 = -(-(i212 * 306));
                    int i214 = ((610 | i213) << 1) - (i213 ^ TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                    int i310 = ~((Integer.MIN_VALUE ^ i212) | (Integer.MIN_VALUE & i212));
                    int i311 = ~iIdentityHashCode2;
                    int i312 = Integer.MIN_VALUE & i311;
                    int i313 = (iIdentityHashCode2 & Integer.MIN_VALUE) | (Integer.MAX_VALUE & iIdentityHashCode2) | i312;
                    int i314 = ~i313;
                    int i315 = (i313 | i314) & i314;
                    int i316 = i310 & i315;
                    int i317 = (i315 | i310) & (~i316);
                    int i318 = -(-(((i317 & i316) | (i317 ^ i316)) * 305));
                    int i319 = i214 & i318;
                    int i410 = (i318 ^ i214) | i319;
                    int i411 = ((i319 | i410) << 1) - (i410 ^ i319);
                    int i412 = ~i212;
                    int i413 = (i311 ^ Integer.MIN_VALUE) | i312;
                    int i414 = ~i413;
                    int i415 = (i413 | i414) & i414;
                    int i416 = i412 & i415;
                    int i417 = (i412 | i415) & (~i416);
                    int i418 = -(-(((i417 & i416) | (i417 ^ i416)) * 305));
                    aVar.f55557r0 = ((((~i418) & i411) | ((~i411) & i418)) - (~((i418 & i411) << 1))) - 1;
                } else {
                    aVar = flVar.new a(continuation);
                    int i419 = f55549r;
                    int i54 = i419 & 51;
                    int i55 = (i419 ^ 51) | i54;
                    int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                    f55550s = i56 % 128;
                    int i57 = i56 % 2;
                }
            }
        } else {
            aVar = flVar.new a(continuation);
            int i4110 = f55549r;
            int i58 = i4110 & 51;
            int i59 = (i4110 ^ 51) | i58;
            int i510 = (i58 ^ i59) + ((i59 & i58) << 1);
            f55550s = i510 % 128;
            int i511 = i510 % 2;
        }
        Object compoundDrawableTintBlendMode = aVar.f55555p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (aVar.f55557r0) {
            case 0:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                switch (setCompoundDrawableTintBlendMode.setOnFocusChangeListener[fgVar.ordinal()]) {
                    case 1:
                        fz fzVar = new fz(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.f55552o);
                        aVar.f55557r0 = 1;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{fzVar, aVar}, 1559788296, -1559788294, System.identityHashCode(fzVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i60 = f55549r;
                            int i61 = (i60 | 111) << 1;
                            int i62 = -(i60 ^ 111);
                            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                            f55550s = i63 % 128;
                            int i64 = i63 % 2;
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 2:
                        ga gaVar = new ga(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY());
                        aVar.f55557r0 = 2;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{gaVar, aVar}, 1559788296, -1559788294, System.identityHashCode(gaVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i65 = f55550s;
                            int i66 = (i65 & 67) + (i65 | 67);
                            f55549r = i66 % 128;
                            int i67 = i66 % 2;
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 3:
                        gf gfVar = new gf(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY(), flVar.f55553p);
                        aVar.f55557r0 = 3;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{gfVar, aVar}, 1559788296, -1559788294, System.identityHashCode(gfVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i68 = f55549r + 47;
                            f55550s = i68 % 128;
                            if (i68 % 2 == 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 4:
                        gi giVar = new gi(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY(), flVar.f55553p);
                        aVar.f55557r0 = 4;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{giVar, aVar}, 1559788296, -1559788294, System.identityHashCode(giVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i69 = f55550s;
                            int i70 = (i69 & 93) + (i69 | 93);
                            f55549r = i70 % 128;
                            if (i70 % 2 != 0) {
                                int i71 = 67 / 0;
                            }
                            int i72 = i69 + 123;
                            f55549r = i72 % 128;
                            if (i72 % 2 != 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        System.identityHashCode(flVar);
                        System.identityHashCode(flVar);
                        return fkVar;
                    case 5:
                        gl glVar = new gl(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY(), flVar.setX(), flVar.f55553p, flVar.setDividerPadding());
                        aVar.f55557r0 = 5;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{glVar, aVar}, 1559788296, -1559788294, System.identityHashCode(glVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i73 = f55549r;
                            int i74 = (i73 ^ 41) + ((i73 & 41) << 1);
                            f55550s = i74 % 128;
                            if (i74 % 2 == 0) {
                                int i75 = 62 / 0;
                            }
                            return coroutine_suspended;
                        }
                        fkVar2 = (fk) compoundDrawableTintBlendMode;
                        int i76 = f55550s;
                        i16 = ((i76 | 69) << 1) - (i76 ^ 69);
                        f55549r = i16 % 128;
                        int i77 = i16 % 2;
                        return fkVar2;
                    case 6:
                        gu guVar = new gu(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY());
                        aVar.f55557r0 = 6;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{guVar, aVar}, 1559788296, -1559788294, System.identityHashCode(guVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            System.identityHashCode(flVar);
                            System.identityHashCode(flVar);
                            int i78 = f55550s;
                            int i79 = i78 ^ 91;
                            int i80 = (i78 & 91) << 1;
                            i13 = (i79 | i80) << 1;
                            i14 = i80 ^ i79;
                            i15 = i13 - i14;
                            f55549r = i15 % 128;
                            int i81 = i15 % 2;
                            return coroutine_suspended;
                        }
                        fkVar2 = (fk) compoundDrawableTintBlendMode;
                        int i82 = f55549r + 102;
                        i16 = (i82 ^ (-1)) + (i82 << 1);
                        f55550s = i16 % 128;
                        int i710 = i16 % 2;
                        return fkVar2;
                    case 7:
                        gb gbVar = new gb(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.f55551n);
                        aVar.f55557r0 = 7;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{gbVar, aVar}, 1559788296, -1559788294, System.identityHashCode(gbVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            System.identityHashCode(flVar);
                            System.identityHashCode(flVar);
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 8:
                        gd gdVar = new gd(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY());
                        aVar.f55557r0 = 8;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{gdVar, aVar}, 1559788296, -1559788294, System.identityHashCode(gdVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i83 = f55549r;
                            int i84 = (i83 & (-20)) | ((~i83) & 19);
                            int i85 = -(-((i83 & 19) << 1));
                            i15 = (i84 & i85) + (i85 | i84);
                            f55550s = i15 % 128;
                            int i86 = i15 % 2;
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 9:
                        gg ggVar = new gg(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY());
                        aVar.f55557r0 = 9;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{ggVar, aVar}, 1559788296, -1559788294, System.identityHashCode(ggVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i87 = f55550s;
                            int i88 = (((i87 ^ 29) | (i87 & 29)) << 1) - ((i87 & (-30)) | ((~i87) & 29));
                            f55549r = i88 % 128;
                            if (i88 % 2 != 0) {
                                int i89 = 1 / 0;
                            }
                            int i90 = i87 & 85;
                            int i91 = (i87 ^ 85) | i90;
                            i13 = (i90 | i91) << 1;
                            i14 = i90 ^ i91;
                            i15 = i13 - i14;
                            f55549r = i15 % 128;
                            int i810 = i15 % 2;
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 10:
                        ge geVar = new ge(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY());
                        aVar.f55557r0 = 10;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{geVar, aVar}, 1559788296, -1559788294, System.identityHashCode(geVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            System.identityHashCode(flVar);
                            System.identityHashCode(flVar);
                            int i92 = f55549r;
                            int i93 = (i92 & 87) + (i92 | 87);
                            f55550s = i93 % 128;
                            if (i93 % 2 == 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        System.identityHashCode(flVar);
                        System.identityHashCode(flVar);
                        return fkVar;
                    case 11:
                        gm gmVar = new gm(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY());
                        aVar.f55557r0 = 11;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{gmVar, aVar}, 1559788296, -1559788294, System.identityHashCode(gmVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int iIdentityHashCode3 = System.identityHashCode(flVar);
                            int i94 = (-1563995604) & iIdentityHashCode3;
                            int i95 = (~i94) & ((-1563995604) | iIdentityHashCode3);
                            int i96 = ~((i94 & i95) | (i95 ^ i94));
                            int i97 = ((~i96) & 1562414352) | (i96 & (-1562414353));
                            int i98 = i96 & 1562414352;
                            int i99 = (i98 & i97) | (i97 ^ i98);
                            int i100 = ~((-2108083485) | iIdentityHashCode3);
                            int i101 = (((i99 & i100) | (i99 ^ i100)) * (-754)) - 2050361450;
                            int i102 = ~(((-1562414353) ^ iIdentityHashCode3) | ((-1562414353) & iIdentityHashCode3));
                            int i103 = ~iIdentityHashCode3;
                            int i104 = (iIdentityHashCode3 | i103) & i103;
                            int i105 = i104 & 1563995603;
                            int i106 = (1563995603 | i104) & (~i105);
                            int i107 = (i106 & i105) | (i106 ^ i105);
                            int i108 = i107 ^ (-2108083485);
                            int i109 = (-2108083485) & i107;
                            int i110 = ~((i109 & i108) | (i108 ^ i109));
                            int i111 = i102 ^ i110;
                            int i112 = i110 & i102;
                            int i113 = ((i112 & i111) | (i111 ^ i112)) * (-754);
                            int i114 = i101 & i113;
                            int i115 = -(-((i101 ^ i113) | i114));
                            int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                            int i117 = (-1563995604) ^ i104;
                            int i118 = i104 & (-1563995604);
                            int i119 = -(~(-(-(((i118 & i117) | (i117 ^ i118)) * 754))));
                            int i120 = ((i116 ^ i119) + ((i119 & i116) << 1)) - 1;
                            int i121 = ~System.identityHashCode(flVar);
                            int i122 = i121 ^ (-154658241);
                            int i123 = i121 & (-154658241);
                            int i124 = ~((i122 & i123) | (i122 ^ i123));
                            int i125 = ((-42369) & i124) | ((~i124) & 42368);
                            int i126 = i124 & 42368;
                            int i127 = (((i126 & i125) | (i125 ^ i126)) * (-160)) + 940993364;
                            int i128 = (-2113357942) ^ i121;
                            int i129 = i121 & (-2113357942);
                            int i130 = ~((i129 & i128) | (i128 ^ i129));
                            int i131 = -(-(((i130 & (-154658241)) | ((~i130) & (-154658241)) | (154658240 & i130)) * 160));
                            int i132 = ((~i131) & i127) | ((~i127) & i131);
                            int i133 = -(-((i131 & i127) << 1));
                            if (i120 > (i132 & i133) + (i133 | i132)) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fk fkVar3 = (fk) compoundDrawableTintBlendMode;
                        int i134 = f55549r;
                        int i135 = i134 ^ 15;
                        int i136 = (i134 & 15) << 1;
                        int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                        f55550s = i137 % 128;
                        int i138 = i137 % 2;
                        return fkVar3;
                    case 12:
                        gs gsVar = new gs(flVar.setNavigationOnClickListener(), flVar.setOnFocusChangeListener(), flVar.f55554q, flVar.setY());
                        aVar.f55557r0 = 12;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{gsVar, aVar}, 1559788296, -1559788294, System.identityHashCode(gsVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i139 = f55550s + 103;
                            f55549r = i139 % 128;
                            if (i139 % 2 != 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fk fkVar4 = (fk) compoundDrawableTintBlendMode;
                        int i140 = f55550s;
                        int i141 = (i140 ^ 32) + ((i140 & 32) << 1);
                        int i142 = (i141 ^ (-1)) + (i141 << 1);
                        f55549r = i142 % 128;
                        int i143 = i142 % 2;
                        return fkVar4;
                    case 13:
                        return null;
                    default:
                        throw new fh(1, fgVar.toString());
                }
            case 1:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                return (fk) compoundDrawableTintBlendMode;
            case 2:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                return (fk) compoundDrawableTintBlendMode;
            case 3:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i144 = f55549r;
                int i145 = i144 & 115;
                int i146 = -(-((i144 ^ 115) | i145));
                int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
                f55550s = i147 % 128;
                int i148 = i147 % 2;
                return (fk) compoundDrawableTintBlendMode;
            case 4:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i149 = f55550s;
                int i150 = ((i149 & (-10)) | ((~i149) & 9)) + ((i149 & 9) << 1);
                f55549r = i150 % 128;
                int i151 = i150 % 2;
                fkVar = (fk) compoundDrawableTintBlendMode;
                System.identityHashCode(flVar);
                System.identityHashCode(flVar);
                return fkVar;
            case 5:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i152 = f55549r;
                int i153 = (i152 & (-4)) | ((~i152) & 3);
                int i154 = -(-((i152 & 3) << 1));
                int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                f55550s = i155 % 128;
                int i156 = i155 % 2;
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                int i711 = f55550s;
                i16 = ((i711 | 69) << 1) - (i711 ^ 69);
                f55549r = i16 % 128;
                int i712 = i16 % 2;
                return fkVar2;
            case 6:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                int i811 = f55549r + 102;
                i16 = (i811 ^ (-1)) + (i811 << 1);
                f55550s = i16 % 128;
                int i713 = i16 % 2;
                return fkVar2;
            case 7:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i157 = f55549r;
                int i158 = (i157 & 103) + (i157 | 103);
                f55550s = i158 % 128;
                int i159 = i158 % 2;
                return (fk) compoundDrawableTintBlendMode;
            case 8:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i160 = f55550s;
                int i161 = i160 & 125;
                int i162 = (i160 ^ 125) | i161;
                int i163 = (i161 ^ i162) + ((i162 & i161) << 1);
                f55549r = i163 % 128;
                int i164 = i163 % 2;
                return (fk) compoundDrawableTintBlendMode;
            case 9:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i165 = f55549r + 73;
                f55550s = i165 % 128;
                int i166 = i165 % 2;
                return (fk) compoundDrawableTintBlendMode;
            case 10:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i167 = f55550s;
                int i168 = i167 & 43;
                int i169 = (i168 - (~((i167 ^ 43) | i168))) - 1;
                f55549r = i169 % 128;
                int i170 = i169 % 2;
                fkVar = (fk) compoundDrawableTintBlendMode;
                System.identityHashCode(flVar);
                System.identityHashCode(flVar);
                return fkVar;
            case 11:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                fk fkVar5 = (fk) compoundDrawableTintBlendMode;
                int i1310 = f55549r;
                int i1311 = i1310 ^ 15;
                int i1312 = (i1310 & 15) << 1;
                int i1313 = (i1311 ^ i1312) + ((i1312 & i1311) << 1);
                f55550s = i1313 % 128;
                int i1314 = i1313 % 2;
                return fkVar5;
            case 12:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i171 = f55549r + 3;
                f55550s = i171 % 128;
                int i172 = i171 % 2;
                fk fkVar6 = (fk) compoundDrawableTintBlendMode;
                int i1410 = f55550s;
                int i1411 = (i1410 ^ 32) + ((i1410 & 32) << 1);
                int i1412 = (i1411 ^ (-1)) + (i1411 << 1);
                f55549r = i1412 % 128;
                int i1413 = i1412 % 2;
                return fkVar6;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull fg fgVar, @NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, fgVar, continuation}, -1405235497, 1405235497, System.identityHashCode(this));
    }
}
