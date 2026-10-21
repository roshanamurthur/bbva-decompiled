package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class xd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61787e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61788f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<sa, Unit> f61789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Boolean, Unit> f61790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final re f61791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<rs, Unit> f61792d;

    /* JADX WARN: Multi-variable type inference failed */
    public xd(@NotNull Function1<? super sa, Unit> function1, @NotNull Function1<? super Boolean, Unit> function2, @Nullable re reVar, @NotNull Function1<? super rs, Unit> function3) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function3, "");
        this.f61789a = function1;
        this.f61790b = function2;
        this.f61791c = reVar;
        this.f61792d = function3;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = i13 | i11;
        int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        int i18 = ((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15;
        if (i18 == 1) {
            xd xdVar = (xd) objArr[0];
            int i19 = f61787e;
            int i20 = i19 ^ 43;
            int i21 = ((i19 & 43) | i20) << 1;
            int i22 = -i20;
            int i23 = (i21 & i22) + (i21 | i22);
            int i24 = i23 % 128;
            f61788f = i24;
            int i25 = i23 % 2;
            re reVar = xdVar.f61791c;
            int i26 = ((i24 & (-120)) | ((~i24) & 119)) + ((i24 & 119) << 1);
            f61787e = i26 % 128;
            int i27 = i26 % 2;
            return reVar;
        }
        if (i18 == 2) {
            xd xdVar2 = (xd) objArr[0];
            int i28 = f61787e;
            int i29 = (i28 & 59) + (i28 | 59);
            f61788f = i29 % 128;
            int i30 = i29 % 2;
            Function1<sa, Unit> function1 = xdVar2.f61789a;
            int i31 = i28 & 69;
            int i32 = ((((i28 ^ 69) | i31) << 1) - (~(-((i28 | 69) & (~i31))))) - 1;
            f61788f = i32 % 128;
            int i33 = i32 % 2;
            return function1;
        }
        if (i18 != 3) {
            xd xdVar3 = (xd) objArr[0];
            int i34 = f61787e;
            int i35 = ((i34 | 99) << 1) - (i34 ^ 99);
            f61788f = i35 % 128;
            int i36 = i35 % 2;
            Function1<rs, Unit> function2 = xdVar3.f61792d;
            int i37 = i34 + 115;
            f61788f = i37 % 128;
            if (i37 % 2 != 0) {
                return function2;
            }
            int i38 = 79 / 0;
            return function2;
        }
        xd xdVar4 = (xd) objArr[0];
        int i39 = f61788f;
        int i40 = (i39 & (-78)) | ((~i39) & 77);
        int i41 = -(-((i39 & 77) << 1));
        int i42 = (i40 & i41) + (i40 | i41);
        f61787e = i42 % 128;
        int i43 = i42 % 2;
        Function1<Boolean, Unit> function3 = xdVar4.f61790b;
        int i44 = (i39 & 35) + (i39 | 35);
        f61787e = i44 % 128;
        int i45 = i44 % 2;
        return function3;
    }

    @NotNull
    public final Function1<sa, Unit> setCompoundDrawableTintBlendMode() {
        return (Function1) setY(new Object[]{this}, 740436500, -740436498, System.identityHashCode(this));
    }

    @NotNull
    public final Function1<rs, Unit> setDividerPadding() {
        return (Function1) setY(new Object[]{this}, -652797820, 652797820, System.identityHashCode(this));
    }

    @NotNull
    public final Function1<Boolean, Unit> setOnFocusChangeListener() {
        return (Function1) setY(new Object[]{this}, 1041335544, -1041335541, System.identityHashCode(this));
    }

    @Nullable
    public final re setX() {
        return (re) setY(new Object[]{this}, -991427312, 991427313, System.identityHashCode(this));
    }
}
