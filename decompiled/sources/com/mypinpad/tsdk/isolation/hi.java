package com.mypinpad.tsdk.isolation;

import ek.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hi extends ec<gv, ex> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56193g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56194h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56195f;

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[setRotationY.values().length];
            iArr[setRotationY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr[setRotationY.setDividerPadding.ordinal()] = 2;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = (47 << 1) - 47;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue) {
        super(gvVar, settextkeepstate, exVar);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56195f = getvalue;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00c9  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object x4;
        t4 t4Var;
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        if (((i10 | i15) * 948) + ((~((~i12) | i14 | i15)) * (-948)) + (((~(i15 | i12)) | i14) * (-948)) + (i11 * 949) + (i10 * (-947)) == 1) {
            hi hiVar = (hi) objArr[0];
            Continuation continuation = (Continuation) objArr[1];
            int i16 = f56194h;
            int i17 = i16 & 11;
            int i18 = (i16 | 11) & (~i17);
            int i19 = i17 << 1;
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            f56193g = i20 % 128;
            if (i20 % 2 != 0) {
                x4 = setX(new Object[]{hiVar, continuation}, -1379562350, 1379562350, (int) System.currentTimeMillis());
                int i21 = 64 / 0;
            } else {
                x4 = setX(new Object[]{hiVar, continuation}, -1379562350, 1379562350, (int) System.currentTimeMillis());
            }
            Object obj = x4;
            int i22 = f56194h + 16;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            f56193g = i23 % 128;
            int i24 = i23 % 2;
            return obj;
        }
        hi hiVar2 = (hi) objArr[0];
        Continuation continuation2 = (Continuation) objArr[1];
        int i25 = f56194h;
        int i26 = i25 ^ 19;
        int i27 = ((i25 & 19) | i26) << 1;
        int i28 = -i26;
        int i29 = (i27 & i28) + (i28 | i27);
        f56193g = i29 % 128;
        if (i29 % 2 != 0) {
            boolean z10 = continuation2 instanceof t4;
            throw null;
        }
        if (continuation2 instanceof t4) {
            t4Var = (t4) continuation2;
            int i30 = t4Var.f60977s0;
            if ((i30 & Integer.MIN_VALUE) != 0) {
                int i31 = (i25 & 75) + (i25 | 75);
                f56193g = i31 % 128;
                int i32 = i31 % 2;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i33 = i30 * 628;
                int i34 = ~iCurrentTimeMillis;
                int i35 = ~i30;
                int i36 = iCurrentTimeMillis & i35;
                int i37 = (i30 & i34) | i36;
                int i38 = i30 & iCurrentTimeMillis;
                int i39 = (i37 & i38) | (i37 ^ i38);
                int i40 = i39 ^ Integer.MAX_VALUE;
                int i41 = i39 & Integer.MAX_VALUE;
                int i42 = ((i40 ^ i41) | (i41 & i40)) * (-627);
                int i43 = i33 & i42;
                int i44 = (i43 - (~((i33 ^ i42) | i43))) - 1;
                int i45 = (i35 ^ iCurrentTimeMillis) | i36;
                int i46 = ~i45;
                int i47 = (i45 | i46) & i46;
                int i48 = Integer.MIN_VALUE & i47;
                int i49 = (i47 | Integer.MIN_VALUE) & (~i48);
                int i50 = (-2) - ((i44 - (~(-(-(((i49 & i48) | (i49 ^ i48)) * (-627)))))) ^ (-1));
                int i51 = i30 | ((i34 | iCurrentTimeMillis) & i34);
                int i52 = ~i51;
                int i53 = (i51 | i52) & i52;
                int i54 = (i34 & Integer.MIN_VALUE) | (iCurrentTimeMillis & Integer.MAX_VALUE);
                int i55 = iCurrentTimeMillis & Integer.MIN_VALUE;
                int i56 = (i55 & i54) | (i54 ^ i55);
                int i57 = ~i56;
                int i58 = (i56 | i57) & i57;
                t4Var.f60977s0 = (i50 - (~(-(~(((i58 & i53) | (i53 ^ i58)) * 627))))) - 2;
                int i59 = f56194h;
                int i60 = i59 & 97;
                int i61 = i60 + ((i59 ^ 97) | i60);
                f56193g = i61 % 128;
                int i62 = i61 % 2;
            } else {
                t4Var = new t4(hiVar2, continuation2);
                int i63 = f56193g + 29;
                f56194h = i63 % 128;
                int i64 = i63 % 2;
            }
        } else {
            t4Var = new t4(hiVar2, continuation2);
            int i65 = f56193g + 29;
            f56194h = i65 % 128;
            int i66 = i65 % 2;
        }
        Object compoundDrawableTintBlendMode = t4Var.f60975q0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i67 = t4Var.f60977s0;
        if (i67 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            getValue getvalue = hiVar2.f56195f;
            t4Var.f60974p0 = hiVar2;
            t4Var.f60977s0 = 1;
            compoundDrawableTintBlendMode = getvalue.setCompoundDrawableTintBlendMode(t4Var);
            if (compoundDrawableTintBlendMode == coroutine_suspended) {
                int i68 = f56194h;
                int i69 = i68 & 33;
                int i70 = (i68 | 33) & (~i69);
                int i71 = -(-(i69 << 1));
                int i72 = (i70 & i71) + (i70 | i71);
                f56193g = i72 % 128;
                if (i72 % 2 == 0) {
                    return coroutine_suspended;
                }
                i13 = 6;
            }
            int i73 = i13 / 0;
            return coroutine_suspended;
        }
        if (i67 == 1) {
            hiVar2 = t4Var.f60974p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i74 = f56193g;
            int i75 = (i74 ^ 34) + ((i74 & 34) << 1);
            int i76 = (i75 ^ (-1)) + (i75 << 1);
            f56194h = i76 % 128;
            int i77 = i76 % 2;
        } else {
            if (i67 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i78 = f56193g;
            int i79 = (i78 ^ 37) + ((i78 & 37) << 1);
            f56194h = i79 % 128;
            int i80 = i79 % 2;
        }
        int i81 = f56194h;
        int i82 = (i81 & 107) + (i81 | 107);
        f56193g = i82 % 128;
        int i83 = i82 % 2;
        return compoundDrawableTintBlendMode;
        setRotationX setrotationx = (setRotationX) compoundDrawableTintBlendMode;
        int i84 = setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
        if (i84 == 1) {
            t4Var.f60974p0 = null;
            t4Var.f60977s0 = 2;
            compoundDrawableTintBlendMode = hiVar2.setY(setrotationx, t4Var);
            if (compoundDrawableTintBlendMode == coroutine_suspended) {
                int i85 = f56194h;
                int i86 = (i85 | 65) << 1;
                int i87 = -((i85 & (-66)) | ((~i85) & 65));
                int i88 = (i86 ^ i87) + ((i86 & i87) << 1);
                f56193g = i88 % 128;
                int i89 = i88 % 2;
                int i90 = i85 & 89;
                int i91 = -(-((i85 ^ 89) | i90));
                int i92 = (i90 & i91) + (i91 | i90);
                f56193g = i92 % 128;
                if (i92 % 2 == 0) {
                    return coroutine_suspended;
                }
                i13 = 41;
            }
            int i810 = f56194h;
            int i811 = (i810 & 107) + (i810 | 107);
            f56193g = i811 % 128;
            int i812 = i811 % 2;
            return compoundDrawableTintBlendMode;
        }
        if (i84 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        coroutine_suspended = hiVar2.setOnFocusChangeListener(setrotationx);
        int i93 = f56193g;
        int i94 = ((i93 ^ 29) | (i93 & 29)) << 1;
        int i95 = -(((~i93) & 29) | (i93 & (-30)));
        int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
        f56194h = i96 % 128;
        if (i96 % 2 != 0) {
            return coroutine_suspended;
        }
        i13 = 83;
        int i710 = i13 / 0;
        return coroutine_suspended;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, continuation}, -976970273, 976970274, System.identityHashCode(this));
    }

    @NotNull
    public fk setOnFocusChangeListener(@NotNull setRotationX setrotationx) {
        int i10 = f56193g;
        int i11 = (i10 & 99) + (i10 | 99);
        f56194h = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setrotationx, "");
            setX().setDividerPadding(setOnFocusChangeListener(), setCompoundDrawableTintBlendMode());
            throw null;
        }
        Intrinsics.checkNotNullParameter(setrotationx, "");
        fk dividerPadding = setX().setDividerPadding(setOnFocusChangeListener(), setCompoundDrawableTintBlendMode());
        int i12 = f56193g;
        int i13 = i12 & 3;
        int i14 = ((i12 ^ 3) | i13) << 1;
        int i15 = -((i12 | 3) & (~i13));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f56194h = i16 % 128;
        int i17 = i16 % 2;
        return dividerPadding;
    }

    @Nullable
    public abstract Object setY(@NotNull setRotationX setrotationx, @NotNull Continuation<? super fk> continuation);
}
