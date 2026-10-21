package com.mypinpad.tsdk.isolation;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class jz extends GlobalEndpoint<ka> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f56723r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f56724s = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final kb f56725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final component17 f56726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final kw f56728q;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f56729p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f56731r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            aVar.f56729p0 = objArr[1];
            int i10 = aVar.f56731r0;
            int i11 = (Integer.MAX_VALUE & i10) | ((~i10) & Integer.MIN_VALUE);
            int i12 = i10 & Integer.MIN_VALUE;
            aVar.f56731r0 = (i12 & i11) | (i11 ^ i12);
            return jz.this.setCompoundDrawableTintBlendMode(null, aVar);
        }
    }

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[fg.values().length];
            iArr[fg.setDividerPadding.ordinal()] = 1;
            iArr[fg.setX.ordinal()] = 2;
            iArr[fg.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr[fg.setNavigationOnClickListener.ordinal()] = 4;
            iArr[fg.setOnFocusChangeListener.ordinal()] = 5;
            iArr[fg.setTextScaleX.ordinal()] = 6;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = (91 << 1) - (91 & (~0));
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setTextKeepState settextkeepstate, @NotNull me meVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull kb kbVar, @NotNull setChildIndicator setchildindicator, @NotNull component17 component17Var, @NotNull setContentDescription setcontentdescription) throws Exception {
        super(settextkeepstate, getvalue, diVar, component10Var, settop, setfontfeaturesettings);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(meVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(kbVar, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56725n = kbVar;
        this.f56726o = component17Var;
        this.f56727p = setcontentdescription;
        setX(new ka(setbackgroundtintlist, diVar, setchildindicator));
        ka navigationOnClickListener = setNavigationOnClickListener();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{navigationOnClickListener, meVar.setCompoundDrawableTintBlendMode(), settop}, -919932723, 919932782, System.identityHashCode(navigationOnClickListener));
        this.f56728q = new kw();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x0327  */
    /* JADX WARN: Code duplicated, block: B:7:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        a aVar;
        int i13;
        fk fkVar;
        int i14;
        fk fkVar2;
        int i15;
        jz jzVar = (jz) objArr[0];
        fg fgVar = (fg) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i16 = f56724s;
        int i17 = i16 & 5;
        int i18 = (i17 - (~(-(-((i16 ^ 5) | i17))))) - 1;
        int i19 = i18 % 128;
        f56723r = i19;
        int i20 = i18 % 2;
        if (continuation instanceof a) {
            int i21 = i19 & 63;
            int i22 = i19 | 63;
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            f56724s = i23 % 128;
            int i24 = i23 % 2;
            aVar = (a) continuation;
            int i25 = aVar.f56731r0;
            if ((i25 & Integer.MIN_VALUE) != 0) {
                int i26 = ((i19 | 45) << 1) - (i19 ^ 45);
                f56724s = i26 % 128;
                int i27 = i26 % 2;
                int iIdentityHashCode = System.identityHashCode(jzVar);
                int i28 = ~i25;
                int i29 = ~iIdentityHashCode;
                int i30 = (i28 & i29) | ((~i28) & iIdentityHashCode);
                int i31 = i28 & iIdentityHashCode;
                int i32 = (i30 & i31) | (i30 ^ i31);
                int i33 = ~i32;
                int i34 = (i32 | i33) & i33;
                int i35 = i29 | Integer.MIN_VALUE;
                int i36 = ((~i35) & i25) | (i35 & i28);
                int i37 = i35 & i25;
                int i38 = (i36 & i37) | (i36 ^ i37);
                int i39 = ~i38;
                int i40 = (i38 | i39) & i39;
                int i41 = ((i25 * 407) - Integer.MIN_VALUE) - (~(((i40 & i34) | (((~i40) & i34) | ((~i34) & i40))) * (-406)));
                int i42 = (i41 ^ (-1)) + (i41 << 1);
                int i43 = i28 | i29;
                int i44 = -(-((~((i43 & Integer.MIN_VALUE) | (i43 ^ Integer.MIN_VALUE))) * (-406)));
                int i45 = ((~i44) & i42) | ((~i42) & i44);
                int i46 = (i42 & i44) << 1;
                int i47 = (i45 & i46) + (i46 | i45);
                int i48 = Integer.MAX_VALUE ^ iIdentityHashCode;
                int i49 = Integer.MAX_VALUE & iIdentityHashCode;
                int i50 = (i49 & i48) | (i48 ^ i49);
                int i51 = ~i50;
                int i52 = (i50 | i51) & i51;
                int i53 = i29 & i25;
                int i54 = (i25 | i29) & (~i53);
                int i55 = ~((i53 & i54) | (i54 ^ i53));
                int i56 = i52 ^ i55;
                int i57 = i52 & i55;
                int i58 = -(~(((i57 & i56) | (i56 ^ i57)) * 406));
                aVar.f56731r0 = ((i47 & i58) + (i58 | i47)) - 1;
                int i59 = f56724s;
                int i60 = i59 & 9;
                int i61 = i59 | 9;
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                f56723r = i62 % 128;
                int i63 = i62 % 2;
            } else {
                aVar = jzVar.new a(continuation);
                int i64 = f56723r;
                int i65 = ((i64 ^ 102) + ((i64 & 102) << 1)) - 1;
                f56724s = i65 % 128;
                int i66 = i65 % 2;
            }
        } else {
            aVar = jzVar.new a(continuation);
            int i67 = f56723r;
            int i68 = ((i67 ^ 102) + ((i67 & 102) << 1)) - 1;
            f56724s = i68 % 128;
            int i69 = i68 % 2;
        }
        Object compoundDrawableTintBlendMode = aVar.f56729p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i70 = aVar.f56731r0;
        if (i70 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            switch (setY.setCompoundDrawableTintBlendMode[fgVar.ordinal()]) {
                case 1:
                    kl klVar = new kl(jzVar.setNavigationOnClickListener(), jzVar.setOnFocusChangeListener(), jzVar.f56728q, jzVar.f56725n, jzVar.f56726o);
                    aVar.f56731r0 = 1;
                    compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{klVar, aVar}, 1559788296, -1559788294, System.identityHashCode(klVar));
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i71 = f56724s;
                        int i72 = i71 & 99;
                        int i73 = ((i71 | 99) & (~i72)) + (i72 << 1);
                        int i74 = i73 % 128;
                        f56723r = i74;
                        if (i73 % 2 != 0) {
                            throw null;
                        }
                        int i75 = ((i74 | 33) << 1) - (i74 ^ 33);
                        f56724s = i75 % 128;
                        if (i75 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                    fk fkVar3 = (fk) compoundDrawableTintBlendMode;
                    int i76 = f56723r;
                    int i77 = i76 ^ 103;
                    int i78 = (((i76 & 103) | i77) << 1) - i77;
                    f56724s = i78 % 128;
                    int i79 = i78 % 2;
                    return fkVar3;
                case 2:
                    km kmVar = new km(jzVar.setNavigationOnClickListener(), jzVar.setOnFocusChangeListener(), jzVar.f56728q, jzVar.setY(), jzVar.f56725n);
                    aVar.f56731r0 = 2;
                    compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{kmVar, aVar}, 1559788296, -1559788294, System.identityHashCode(kmVar));
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i80 = f56724s;
                        int i81 = i80 + 85;
                        f56723r = i81 % 128;
                        if (i81 % 2 != 0) {
                            throw null;
                        }
                        int i82 = (i80 ^ 5) + ((i80 & 5) << 1);
                        f56723r = i82 % 128;
                        if (i82 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                    fkVar = (fk) compoundDrawableTintBlendMode;
                    int i83 = f56723r;
                    int i84 = i83 & 83;
                    int i85 = -(-((i83 ^ 83) | i84));
                    i14 = ((i84 | i85) << 1) - (i85 ^ i84);
                    f56724s = i14 % 128;
                    if (i14 % 2 != 0) {
                        return fkVar;
                    }
                    throw null;
                case 3:
                    kn knVar = new kn(jzVar.setNavigationOnClickListener(), jzVar.setOnFocusChangeListener(), jzVar.f56728q, jzVar.setY(), jzVar.setDividerPadding(), jzVar.f56725n);
                    aVar.f56731r0 = 3;
                    compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{knVar, aVar}, 1559788296, -1559788294, System.identityHashCode(knVar));
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i86 = (-2) - ((f56723r + 110) ^ (-1));
                        int i87 = i86 % 128;
                        f56724s = i87;
                        if (i86 % 2 == 0) {
                            throw null;
                        }
                        int i88 = i87 & 43;
                        int i89 = i87 | 43;
                        i13 = ((i88 | i89) << 1) - (i88 ^ i89);
                        f56723r = i13 % 128;
                        break;
                    }
                    fkVar2 = (fk) compoundDrawableTintBlendMode;
                    int i90 = f56724s;
                    int i91 = i90 ^ 73;
                    i15 = (((i90 & 73) | i91) << 1) - i91;
                    f56723r = i15 % 128;
                    if (i15 % 2 != 0) {
                        return fkVar2;
                    }
                    int i92 = 83 / 0;
                    return fkVar2;
                case 4:
                    kp kpVar = new kp(jzVar.setNavigationOnClickListener(), jzVar.setOnFocusChangeListener(), jzVar.f56728q, jzVar.setY(), jzVar.f56725n);
                    aVar.f56731r0 = 4;
                    compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{kpVar, aVar}, 1559788296, -1559788294, System.identityHashCode(kpVar));
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i93 = f56723r + 35;
                        int i94 = i93 % 128;
                        f56724s = i94;
                        int i95 = i93 % 2;
                        int i96 = i94 + 55;
                        f56723r = i96 % 128;
                        if (i96 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        int i97 = 31 / 0;
                        return coroutine_suspended;
                    }
                    fk fkVar4 = (fk) compoundDrawableTintBlendMode;
                    int i98 = f56724s;
                    int i99 = (i98 ^ 81) + ((i98 & 81) << 1);
                    f56723r = i99 % 128;
                    int i100 = i99 % 2;
                    return fkVar4;
                case 5:
                    kq kqVar = new kq(jzVar.setNavigationOnClickListener(), jzVar.setOnFocusChangeListener(), jzVar.f56728q, jzVar.setX(), jzVar.f56727p);
                    aVar.f56731r0 = 5;
                    compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{kqVar, aVar}, 1559788296, -1559788294, System.identityHashCode(kqVar));
                    if (compoundDrawableTintBlendMode == coroutine_suspended) {
                        int i101 = f56724s;
                        int i102 = (i101 & (-114)) | ((~i101) & 113);
                        int i103 = (i101 & 113) << 1;
                        int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                        int i105 = i104 % 128;
                        f56723r = i105;
                        if (i104 % 2 != 0) {
                            throw null;
                        }
                        int i106 = (i105 ^ 91) + ((i105 & 91) << 1);
                        f56724s = i106 % 128;
                        if (i106 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                    coroutine_suspended = (fk) compoundDrawableTintBlendMode;
                    int i107 = f56723r;
                    int i108 = i107 & 101;
                    int i109 = -(-((i107 ^ 101) | i108));
                    i13 = ((i108 | i109) << 1) - (i109 ^ i108);
                    f56724s = i13 % 128;
                    break;
                case 6:
                    int i110 = f56723r;
                    int i111 = (-2) - ((((i110 | 96) << 1) - (i110 ^ 96)) ^ (-1));
                    f56724s = i111 % 128;
                    int i112 = i111 % 2;
                    return null;
                default:
                    throw new fh(1, fgVar.toString());
            }
        } else {
            if (i70 == 1) {
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                System.identityHashCode(jzVar);
                System.identityHashCode(jzVar);
                fk fkVar5 = (fk) compoundDrawableTintBlendMode;
                int i710 = f56723r;
                int i711 = i710 ^ 103;
                int i712 = (((i710 & 103) | i711) << 1) - i711;
                f56724s = i712 % 128;
                int i713 = i712 % 2;
                return fkVar5;
            }
            if (i70 == 2) {
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                System.identityHashCode(jzVar);
                System.identityHashCode(jzVar);
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i810 = f56723r;
                int i811 = i810 & 83;
                int i812 = -(-((i810 ^ 83) | i811));
                i14 = ((i811 | i812) << 1) - (i812 ^ i811);
                f56724s = i14 % 128;
                if (i14 % 2 != 0) {
                    return fkVar;
                }
                throw null;
            }
            if (i70 == 3) {
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i113 = f56724s;
                int i114 = i113 & 41;
                int i115 = (((i113 ^ 41) | i114) << 1) - ((i113 | 41) & (~i114));
                f56723r = i115 % 128;
                int i116 = i115 % 2;
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                int i910 = f56724s;
                int i911 = i910 ^ 73;
                i15 = (((i910 & 73) | i911) << 1) - i911;
                f56723r = i15 % 128;
                if (i15 % 2 != 0) {
                    return fkVar2;
                }
                int i912 = 83 / 0;
                return fkVar2;
            }
            if (i70 == 4) {
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i117 = f56724s;
                int i118 = i117 & 5;
                int i119 = (i117 | 5) & (~i118);
                int i120 = i118 << 1;
                int i121 = ((i119 | i120) << 1) - (i119 ^ i120);
                f56723r = i121 % 128;
                int i122 = i121 % 2;
                fk fkVar6 = (fk) compoundDrawableTintBlendMode;
                int i913 = f56724s;
                int i914 = (i913 ^ 81) + ((i913 & 81) << 1);
                f56723r = i914 % 128;
                int i1010 = i914 % 2;
                return fkVar6;
            }
            if (i70 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i123 = f56724s;
            int i124 = i123 & 109;
            int i125 = (i123 ^ 109) | i124;
            int i126 = (i124 & i125) + (i125 | i124);
            f56723r = i126 % 128;
            int i127 = i126 % 2;
            coroutine_suspended = (fk) compoundDrawableTintBlendMode;
            int i1011 = f56723r;
            int i1012 = i1011 & 101;
            int i1013 = -(-((i1011 ^ 101) | i1012));
            i13 = ((i1012 | i1013) << 1) - (i1013 ^ i1012);
            f56724s = i13 % 128;
        }
        int i128 = i13 % 2;
        return coroutine_suspended;
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull fg fgVar, @NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, fgVar, continuation}, 1633552980, -1633552980, System.identityHashCode(this));
    }
}
