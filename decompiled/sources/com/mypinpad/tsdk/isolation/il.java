package com.mypinpad.tsdk.isolation;

import bk.w;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class il extends GlobalEndpoint<im> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f56467q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f56468r = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final component17 f56469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final iu f56471p;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f56472s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56473t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f56474p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f56476r0;

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
            int i10 = f56472s0;
            int i11 = i10 & 39;
            int i12 = ((i10 ^ 39) | i11) << 1;
            int i13 = -((i10 | 39) & (~i11));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            f56473t0 = i14 % 128;
            int i15 = i14 % 2;
            aVar.f56474p0 = obj2;
            int i16 = aVar.f56476r0;
            int i17 = i16 ^ Integer.MIN_VALUE;
            int i18 = i16 & Integer.MIN_VALUE;
            aVar.f56476r0 = (i18 & i17) | (i17 ^ i18);
            Object compoundDrawableTintBlendMode = il.this.setCompoundDrawableTintBlendMode(null, aVar);
            int i19 = f56473t0;
            int i20 = i19 & 107;
            int i21 = -(-((i19 ^ 107) | i20));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f56472s0 = i22 % 128;
            if (i22 % 2 == 0) {
                return compoundDrawableTintBlendMode;
            }
            throw null;
        }
    }

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[fg.values().length];
            iArr[fg.setDividerPadding.ordinal()] = 1;
            iArr[fg.setCompoundDrawableTintBlendMode.ordinal()] = 2;
            iArr[fg.setNavigationOnClickListener.ordinal()] = 3;
            iArr[fg.setTextScaleX.ordinal()] = 4;
            setOnFocusChangeListener = iArr;
            int i10 = 1 ^ 97;
            int i11 = ((1 & 97) | i10) << 1;
            int i12 = -i10;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            int i14 = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull setTextKeepState settextkeepstate, @NotNull me meVar, @NotNull getValue getvalue, @NotNull di diVar, @NotNull component10 component10Var, @NotNull setTop settop, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull setChildIndicator setchildindicator, @NotNull component17 component17Var, @NotNull setContentDescription setcontentdescription) throws Exception {
        super(settextkeepstate, getvalue, diVar, component10Var, settop, setfontfeaturesettings);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(meVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(diVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(settop, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56469n = component17Var;
        this.f56470o = setcontentdescription;
        setX(new im(setbackgroundtintlist, setfontfeaturesettings, diVar, setchildindicator));
        im navigationOnClickListener = setNavigationOnClickListener();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{navigationOnClickListener, meVar.setCompoundDrawableTintBlendMode(), settop}, -919932723, 919932782, System.identityHashCode(navigationOnClickListener));
        this.f56471p = new iu();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0255  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        a aVar;
        fk fkVar;
        int i13;
        int i14;
        if (((i10 | (~((~i12) | i11))) * 56) + ((~(i10 | i11)) * (-56)) + ((i11 | (~(i10 | i12))) * 56) + (i11 * (-55)) + (i10 * (-55)) != 1) {
            il ilVar = (il) objArr[0];
            int i15 = f56467q;
            int i16 = (i15 & 33) + (i15 | 33);
            f56468r = i16 % 128;
            int i17 = i16 % 2;
            if (CollectionsKt___CollectionsKt.contains(w.setOf((Object[]) new fg[]{fg.setCompoundDrawableTintBlendMode, fg.setNavigationOnClickListener}), ilVar.setLayoutAnimation())) {
                int i18 = f56467q;
                int i19 = (i18 ^ 41) + ((i18 & 41) << 1);
                f56468r = i19 % 128;
                int i20 = i19 % 2;
                return Boolean.FALSE;
            }
            int i21 = f56467q;
            int i22 = i21 | 49;
            int i23 = i22 << 1;
            int i24 = -((~(i21 & 49)) & i22);
            int i25 = (i23 & i24) + (i24 | i23);
            int i26 = i25 % 128;
            f56468r = i26;
            boolean z10 = i25 % 2 != 0;
            int i27 = i26 + 3;
            f56467q = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 60 / 0;
            }
            return Boolean.valueOf(z10);
        }
        il ilVar2 = (il) objArr[0];
        fg fgVar = (fg) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i29 = f56468r;
        int i30 = ((i29 | 25) << 1) - (i29 ^ 25);
        f56467q = i30 % 128;
        int i31 = i30 % 2;
        if (!(continuation instanceof a)) {
            aVar = ilVar2.new a(continuation);
            int i32 = f56468r;
            int i33 = ((i32 & 69) - (~(-(-(i32 | 69))))) - 1;
            f56467q = i33 % 128;
            int i34 = i33 % 2;
        } else {
            int i35 = i29 + 3;
            f56467q = i35 % 128;
            int i36 = i35 % 2;
            aVar = (a) continuation;
            int i37 = aVar.f56476r0;
            if ((i37 & Integer.MIN_VALUE) != 0) {
                int i38 = i29 & 61;
                int i39 = ((((i29 ^ 61) | i38) << 1) - (~(-((i29 | 61) & (~i38))))) - 1;
                f56467q = i39 % 128;
                if (i39 % 2 != 0) {
                    aVar.f56476r0 = i37 / Integer.MIN_VALUE;
                } else {
                    aVar.f56476r0 = (-2) - ((((i37 | (-2147483647)) << 1) - ((-2147483647) ^ i37)) ^ (-1));
                }
            } else {
                aVar = ilVar2.new a(continuation);
                int i310 = f56468r;
                int i311 = ((i310 & 69) - (~(-(-(i310 | 69))))) - 1;
                f56467q = i311 % 128;
                int i312 = i311 % 2;
            }
        }
        Object compoundDrawableTintBlendMode = aVar.f56474p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i40 = aVar.f56476r0;
        if (i40 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i41 = setOnFocusChangeListener.setOnFocusChangeListener[fgVar.ordinal()];
            if (i41 == 1) {
                ip ipVar = new ip(ilVar2.setNavigationOnClickListener(), ilVar2.setOnFocusChangeListener(), ilVar2.f56471p, ilVar2.setY(), ilVar2.f56469n);
                aVar.f56476r0 = 1;
                compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{ipVar, aVar}, 1559788296, -1559788294, System.identityHashCode(ipVar));
                if (compoundDrawableTintBlendMode == coroutine_suspended) {
                    int i42 = f56467q;
                    int i43 = i42 & 15;
                    int i44 = (i43 - (~(-(-((i42 ^ 15) | i43))))) - 1;
                    f56468r = i44 % 128;
                    int i45 = i44 % 2;
                    int i46 = (i42 | 87) << 1;
                    int i47 = -(((~i42) & 87) | (i42 & (-88)));
                    int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                    f56468r = i48 % 128;
                    int i49 = i48 % 2;
                }
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i50 = f56467q;
                i13 = (i50 ^ 25) + ((i50 & 25) << 1);
                f56468r = i13 % 128;
                int i51 = i13 % 2;
            } else if (i41 == 2) {
                ir irVar = new ir(ilVar2.setNavigationOnClickListener(), ilVar2.setOnFocusChangeListener(), ilVar2.f56471p, ilVar2.setY(), ilVar2.setCompoundDrawableTintBlendMode(), ilVar2.setX(), ilVar2.f56470o);
                aVar.f56476r0 = 2;
                compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{irVar, aVar}, 1559788296, -1559788294, System.identityHashCode(irVar));
                if (compoundDrawableTintBlendMode == coroutine_suspended) {
                    int i52 = f56467q;
                    int i53 = (-2) - ((((i52 | 58) << 1) - (i52 ^ 58)) ^ (-1));
                    int i54 = i53 % 128;
                    f56468r = i54;
                    int i55 = i53 % 2;
                    int i56 = (-2) - ((i54 + 124) ^ (-1));
                    f56467q = i56 % 128;
                    if (i56 % 2 != 0) {
                        int i57 = 68 / 0;
                    }
                }
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i58 = f56468r + 44;
                i14 = (i58 ^ (-1)) + (i58 << 1);
                f56467q = i14 % 128;
                if (i14 % 2 != 0) {
                    int i59 = 67 / 0;
                }
            } else {
                if (i41 != 3) {
                    if (i41 != 4) {
                        throw new fh(1, fgVar.toString());
                    }
                    int i60 = f56468r;
                    int i61 = i60 & 17;
                    int i62 = i61 + ((i60 ^ 17) | i61);
                    f56467q = i62 % 128;
                    if (i62 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                it itVar = new it(ilVar2.setNavigationOnClickListener(), ilVar2.setOnFocusChangeListener(), ilVar2.f56471p, ilVar2.setY(), ilVar2.setCompoundDrawableTintBlendMode(), ilVar2.setX(), ilVar2.f56470o);
                aVar.f56476r0 = 3;
                compoundDrawableTintBlendMode = ec.setCompoundDrawableTintBlendMode(new Object[]{itVar, aVar}, 1559788296, -1559788294, System.identityHashCode(itVar));
                if (compoundDrawableTintBlendMode == coroutine_suspended) {
                    int i63 = f56468r;
                    int i64 = i63 + 31;
                    f56467q = i64 % 128;
                    int i65 = i64 % 2;
                    int i66 = i63 ^ 63;
                    int i67 = -(-((i63 & 63) << 1));
                    int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                    f56467q = i68 % 128;
                    if (i68 % 2 != 0) {
                        throw null;
                    }
                }
                fkVar = (fk) compoundDrawableTintBlendMode;
                int i69 = f56467q;
                i13 = ((i69 | 97) << 1) - (i69 ^ 97);
                f56468r = i13 % 128;
                int i510 = i13 % 2;
            }
            return coroutine_suspended;
        }
        if (i40 == 1) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i70 = f56467q;
            int i71 = (((i70 | 113) << 1) - (~(-(((~i70) & 113) | (i70 & (-114)))))) - 1;
            f56468r = i71 % 128;
            int i72 = i71 % 2;
            fkVar = (fk) compoundDrawableTintBlendMode;
            int i511 = f56467q;
            i13 = (i511 ^ 25) + ((i511 & 25) << 1);
            f56468r = i13 % 128;
            int i512 = i13 % 2;
        } else if (i40 == 2) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i73 = f56467q;
            int i74 = (-2) - ((((i73 | 126) << 1) - (i73 ^ 126)) ^ (-1));
            f56468r = i74 % 128;
            int i75 = i74 % 2;
            fkVar = (fk) compoundDrawableTintBlendMode;
            int i513 = f56468r + 44;
            i14 = (i513 ^ (-1)) + (i513 << 1);
            f56467q = i14 % 128;
            if (i14 % 2 != 0) {
                int i514 = 67 / 0;
            }
        } else {
            if (i40 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i76 = f56468r;
            int i77 = ((i76 & 22) + (i76 | 22)) - 1;
            f56467q = i77 % 128;
            int i78 = i77 % 2;
            fkVar = (fk) compoundDrawableTintBlendMode;
            int i610 = f56467q;
            i13 = ((i610 | 97) << 1) - (i610 ^ 97);
            f56468r = i13 % 128;
            int i515 = i13 % 2;
        }
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    @Nullable
    public final Object setCompoundDrawableTintBlendMode(@NotNull fg fgVar, @NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, fgVar, continuation}, -1120578809, 1120578810, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.GlobalEndpoint
    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, 326170320, -326170320, System.identityHashCode(this))).booleanValue();
    }
}
