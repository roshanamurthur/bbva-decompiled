package com.mypinpad.tsdk.isolation;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ks extends GlobalEndpoint<kz> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f56827q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f56828r = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final component17 f56829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final lj f56831p;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f56832s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56833t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f56834p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f56836r0;

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
            int i10 = f56833t0;
            int i11 = ((((i10 ^ 85) | (i10 & 85)) << 1) - (~(-(((~i10) & 85) | (i10 & (-86)))))) - 1;
            f56832s0 = i11 % 128;
            int i12 = i11 % 2;
            aVar.f56834p0 = obj2;
            int i13 = aVar.f56836r0;
            int i14 = (Integer.MAX_VALUE & i13) | ((~i13) & Integer.MIN_VALUE);
            int i15 = i13 & Integer.MIN_VALUE;
            aVar.f56836r0 = (i15 & i14) | (i14 ^ i15);
            Object compoundDrawableTintBlendMode = ks.this.setCompoundDrawableTintBlendMode(null, aVar);
            int i16 = f56832s0;
            int i17 = i16 | 75;
            int i18 = i17 << 1;
            int i19 = -((~(i16 & 75)) & i17);
            int i20 = (i18 & i19) + (i19 | i18);
            f56833t0 = i20 % 128;
            int i21 = i20 % 2;
            return compoundDrawableTintBlendMode;
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[fg.values().length];
            iArr[fg.setDividerPadding.ordinal()] = 1;
            iArr[fg.setX.ordinal()] = 2;
            iArr[fg.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr[fg.setNavigationOnClickListener.ordinal()] = 4;
            iArr[fg.setZ.ordinal()] = 5;
            iArr[fg.UiMessageCallbackKtWhenMappings.ordinal()] = 6;
            iArr[fg.setOnFocusChangeListener.ordinal()] = 7;
            iArr[fg.setTextScaleX.ordinal()] = 8;
            setDividerPadding = iArr;
            int i10 = (~0) & 115;
            int i11 = (i10 << 1) - i10;
            int i12 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setTextKeepState settextkeepstate, @NotNull me meVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop, @NotNull setChildIndicator setchildindicator, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull component17 component17Var, @NotNull setContentDescription setcontentdescription) throws Exception {
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
        this.f56829n = component17Var;
        this.f56830o = setcontentdescription;
        setX(new kz(setbackgroundtintlist, diVar, setchildindicator));
        kz navigationOnClickListener = setNavigationOnClickListener();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{navigationOnClickListener, meVar.setCompoundDrawableTintBlendMode(), settop}, -919932723, 919932782, System.identityHashCode(navigationOnClickListener));
        this.f56831p = new lj();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x017b  */
    /* JADX WARN: Code duplicated, block: B:41:0x017e  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        a aVar;
        int i13;
        fk fkVar;
        int i14;
        int i15;
        fk fkVar2;
        int i16;
        fk fkVar3;
        int i17;
        ks ksVar = (ks) objArr[0];
        fg fgVar = (fg) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i18 = f56828r;
        int i19 = i18 ^ 23;
        int i20 = -(-((i18 & 23) << 1));
        int i21 = (i19 & i20) + (i20 | i19);
        int i22 = i21 % 128;
        f56827q = i22;
        if (i21 % 2 != 0) {
            boolean z10 = continuation instanceof a;
            throw null;
        }
        if (continuation instanceof a) {
            int i23 = ((i22 & (-78)) | ((~i22) & 77)) + ((i22 & 77) << 1);
            f56828r = i23 % 128;
            int i24 = i23 % 2;
            aVar = (a) continuation;
            int i25 = aVar.f56836r0;
            int i26 = i25 & Integer.MIN_VALUE;
            if (i26 != 0) {
                int i27 = i22 & 13;
                int i28 = -(-((i22 ^ 13) | i27));
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                f56828r = i29 % 128;
                if (i29 % 2 == 0) {
                    aVar.f56836r0 = i25 * Integer.MIN_VALUE;
                } else {
                    int i30 = ((i25 ^ Integer.MIN_VALUE) | i26) << 1;
                    int i31 = -((Integer.MAX_VALUE & i25) | ((~i25) & Integer.MIN_VALUE));
                    aVar.f56836r0 = (i30 & i31) + (i30 | i31);
                }
            } else {
                aVar = ksVar.new a(continuation);
                System.identityHashCode(ksVar);
                System.identityHashCode(ksVar);
            }
        } else {
            aVar = ksVar.new a(continuation);
            System.identityHashCode(ksVar);
            System.identityHashCode(ksVar);
        }
        Object compoundDrawableTintBlendMode = aVar.f56834p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (aVar.f56836r0) {
            case 0:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                switch (setOnFocusChangeListener.setDividerPadding[fgVar.ordinal()]) {
                    case 1:
                        le leVar = new le(ksVar.setNavigationOnClickListener(), ksVar.setOnFocusChangeListener(), ksVar.f56831p, ksVar.f56829n);
                        aVar.f56836r0 = 1;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{leVar, aVar}, 1559788296, -1559788294, System.identityHashCode(leVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i32 = f56828r;
                            int i33 = (i32 & 89) + (i32 | 89);
                            f56827q = i33 % 128;
                            if (i33 % 2 != 0) {
                                throw null;
                            }
                            int i34 = i32 ^ 115;
                            int i35 = ((i32 & 115) | i34) << 1;
                            int i36 = -i34;
                            int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                            f56827q = i37 % 128;
                            if (i37 % 2 != 0) {
                                i13 = 84;
                                int i38 = i13 / 0;
                            }
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 2:
                        lc lcVar = new lc(ksVar.setNavigationOnClickListener(), ksVar.setOnFocusChangeListener(), ksVar.f56831p, ksVar.setY());
                        aVar.f56836r0 = 2;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lcVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lcVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i39 = f56827q;
                            int i40 = i39 & 65;
                            int i41 = i40 + ((i39 ^ 65) | i40);
                            f56828r = i41 % 128;
                            if (i41 % 2 == 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        int i42 = f56827q;
                        i14 = i42 ^ 55;
                        i15 = i42 & 55;
                        int i43 = i14 + (i15 << 1);
                        f56828r = i43 % 128;
                        int i44 = i43 % 2;
                        return fkVar;
                    case 3:
                        ld ldVar = new ld(ksVar.setNavigationOnClickListener(), ksVar.setOnFocusChangeListener(), ksVar.f56831p, ksVar.setY(), ksVar.f56830o);
                        aVar.f56836r0 = 3;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{ldVar, aVar}, 1559788296, -1559788294, System.identityHashCode(ldVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i45 = f56827q;
                            int i46 = (i45 & 107) + (i45 | 107);
                            int i47 = i46 % 128;
                            f56828r = i47;
                            int i48 = i46 % 2;
                            int i49 = i47 ^ 41;
                            int i50 = ((((i47 & 41) | i49) << 1) - (~(-i49))) - 1;
                            f56827q = i50 % 128;
                            if (i50 % 2 != 0) {
                                i13 = 54;
                                int i310 = i13 / 0;
                            }
                            return coroutine_suspended;
                        }
                        return (fk) compoundDrawableTintBlendMode;
                    case 4:
                        lg lgVar = new lg(ksVar.setNavigationOnClickListener(), ksVar.setOnFocusChangeListener(), ksVar.f56831p, ksVar.setY(), ksVar.f56830o);
                        aVar.f56836r0 = 4;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lgVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lgVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i51 = f56828r;
                            int i52 = i51 & 73;
                            int i53 = -(-((i51 ^ 73) | i52));
                            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                            f56827q = i54 % 128;
                            if (i54 % 2 != 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fkVar2 = (fk) compoundDrawableTintBlendMode;
                        i16 = f56827q + 13;
                        f56828r = i16 % 128;
                        int i55 = i16 % 2;
                        return fkVar2;
                    case 5:
                        ll llVar = new ll(ksVar.setNavigationOnClickListener(), ksVar.setOnFocusChangeListener(), ksVar.f56831p, ksVar.setY(), ksVar.setX(), ksVar.setDividerPadding());
                        aVar.f56836r0 = 5;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{llVar, aVar}, 1559788296, -1559788294, System.identityHashCode(llVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i56 = f56827q;
                            int i57 = i56 & 121;
                            int i58 = (((~i57) & (i56 | 121)) - (~(-(-(i57 << 1))))) - 1;
                            f56828r = i58 % 128;
                            int i59 = i58 % 2;
                            int i60 = ((i56 ^ 28) + ((i56 & 28) << 1)) - 1;
                            f56828r = i60 % 128;
                            if (i60 % 2 == 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fkVar2 = (fk) compoundDrawableTintBlendMode;
                        int i61 = f56827q;
                        int i62 = i61 & 97;
                        i16 = (((i61 | 97) & (~i62)) - (~(i62 << 1))) - 1;
                        f56828r = i16 % 128;
                        int i510 = i16 % 2;
                        return fkVar2;
                    case 6:
                        li liVar = new li(ksVar.setNavigationOnClickListener(), ksVar.setOnFocusChangeListener(), ksVar.f56831p, ksVar.setY(), ksVar.f56830o, ksVar.setDividerPadding(), ksVar.setX());
                        aVar.f56836r0 = 6;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{liVar, aVar}, 1559788296, -1559788294, System.identityHashCode(liVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i63 = f56827q;
                            int i64 = i63 | 35;
                            int i65 = i64 << 1;
                            int i66 = -((~(i63 & 35)) & i64);
                            int i67 = (i65 & i66) + (i66 | i65);
                            f56828r = i67 % 128;
                            int i68 = i67 % 2;
                            return coroutine_suspended;
                        }
                        fkVar = (fk) compoundDrawableTintBlendMode;
                        int i69 = f56827q;
                        i14 = (i69 & (-126)) | ((~i69) & 125);
                        i15 = i69 & 125;
                        int i410 = i14 + (i15 << 1);
                        f56828r = i410 % 128;
                        int i411 = i410 % 2;
                        return fkVar;
                    case 7:
                        lk lkVar = new lk(ksVar.setNavigationOnClickListener(), ksVar.setOnFocusChangeListener(), ksVar.f56831p);
                        aVar.f56836r0 = 7;
                        compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{lkVar, aVar}, 1559788296, -1559788294, System.identityHashCode(lkVar));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i70 = f56827q;
                            int i71 = (((i70 | 56) << 1) - (i70 ^ 56)) - 1;
                            int i72 = i71 % 128;
                            f56828r = i72;
                            int i73 = i71 % 2;
                            int i74 = i72 + 81;
                            f56827q = i74 % 128;
                            if (i74 % 2 != 0) {
                                throw null;
                            }
                            return coroutine_suspended;
                        }
                        fkVar3 = (fk) compoundDrawableTintBlendMode;
                        int i75 = f56828r;
                        i17 = ((i75 ^ 126) + ((i75 & 126) << 1)) - 1;
                        f56827q = i17 % 128;
                        if (i17 % 2 == 0) {
                            return fkVar3;
                        }
                        throw null;
                    case 8:
                        int i76 = f56827q;
                        int i77 = i76 & 3;
                        int i78 = (i76 ^ 3) | i77;
                        int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                        f56828r = i79 % 128;
                        if (i79 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    default:
                        throw new fh(1, fgVar.toString());
                }
            case 1:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                return (fk) compoundDrawableTintBlendMode;
            case 2:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i412 = f56827q;
                i14 = i412 ^ 55;
                i15 = i412 & 55;
                int i413 = i14 + (i15 << 1);
                f56828r = i413 % 128;
                int i414 = i413 % 2;
                return fkVar;
            case 3:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i80 = f56828r;
                int i81 = i80 & 125;
                int i82 = (i81 - (~(-(-((i80 ^ 125) | i81))))) - 1;
                f56827q = i82 % 128;
                int i83 = i82 % 2;
                return (fk) compoundDrawableTintBlendMode;
            case 4:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i84 = f56828r;
                int i85 = (i84 ^ 35) + ((i84 & 35) << 1);
                f56827q = i85 % 128;
                int i86 = i85 % 2;
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                i16 = f56827q + 13;
                f56828r = i16 % 128;
                int i511 = i16 % 2;
                return fkVar2;
            case 5:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i87 = f56827q;
                int i88 = i87 & 43;
                int i89 = ((i87 ^ 43) | i88) << 1;
                int i90 = -((i87 | 43) & (~i88));
                int i91 = (i89 & i90) + (i90 | i89);
                f56828r = i91 % 128;
                int i92 = i91 % 2;
                fkVar2 = (fk) compoundDrawableTintBlendMode;
                int i610 = f56827q;
                int i611 = i610 & 97;
                i16 = (((i610 | 97) & (~i611)) - (~(i611 << 1))) - 1;
                f56828r = i16 % 128;
                int i512 = i16 % 2;
                return fkVar2;
            case 6:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                int i93 = f56827q;
                int i94 = (i93 ^ 103) + ((i93 & 103) << 1);
                f56828r = i94 % 128;
                int i95 = i94 % 2;
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i612 = f56827q;
                i14 = (i612 & (-126)) | ((~i612) & 125);
                i15 = i612 & 125;
                int i415 = i14 + (i15 << 1);
                f56828r = i415 % 128;
                int i416 = i415 % 2;
                return fkVar;
            case 7:
                ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
                System.identityHashCode(ksVar);
                System.identityHashCode(ksVar);
                fkVar3 = (fk) compoundDrawableTintBlendMode;
                int i710 = f56828r;
                i17 = ((i710 ^ 126) + ((i710 & 126) << 1)) - 1;
                f56827q = i17 % 128;
                if (i17 % 2 == 0) {
                    return fkVar3;
                }
                throw null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull fg fgVar, @NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, fgVar, continuation}, -564800794, 564800794, System.identityHashCode(this));
    }
}
