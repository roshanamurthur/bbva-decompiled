package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ub {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61260d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61261e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final tw f61262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final tv f61263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UUID f61264c;

    public ub(@NotNull tw twVar, @NotNull tv tvVar, @NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(twVar, "");
        Intrinsics.checkNotNullParameter(tvVar, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        this.f61262a = twVar;
        this.f61263b = tvVar;
        this.f61264c = uuid;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-755)) + (i10 * (-755));
        int i14 = ~((~i10) | (~i11));
        int i15 = i10 | i11;
        int i16 = ((~(i15 | i12)) | i14) * (-756);
        int i17 = ((i15 | (~i12)) * 756) + i16 + (i14 * 1512) + i13;
        if (i17 == 1) {
            ub ubVar = (ub) objArr[0];
            Function0 function0 = (Function0) objArr[1];
            Intrinsics.checkNotNullParameter(function0, "");
            ta taVar = new ta(ubVar.f61263b, 0, function0, 2, null);
            int i18 = f61261e + 39;
            f61260d = i18 % 128;
            if (i18 % 2 == 0) {
                return taVar;
            }
            int i19 = 7 / 0;
            return taVar;
        }
        if (i17 == 2) {
            ub ubVar2 = (ub) objArr[0];
            Function1 function1 = (Function1) objArr[1];
            Intrinsics.checkNotNullParameter(function1, "");
            uh uhVar = new uh(ubVar2.f61262a, function1, ubVar2.f61263b, ubVar2.f61264c);
            int i20 = f61260d;
            int i21 = (i20 ^ 103) + ((i20 & 103) << 1);
            f61261e = i21 % 128;
            int i22 = i21 % 2;
            return uhVar;
        }
        ub ubVar3 = (ub) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        Function0 function2 = (Function0) objArr[2];
        Intrinsics.checkNotNullParameter(function2, "");
        tr trVar = new tr(ubVar3.f61263b, iIntValue, function2);
        int i23 = f61261e;
        int i24 = i23 ^ 11;
        int i25 = ((i23 & 11) | i24) << 1;
        int i26 = -i24;
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        f61260d = i27 % 128;
        if (i27 % 2 == 0) {
            return trVar;
        }
        throw null;
    }

    @NotNull
    public final ue<sz> setDividerPadding(@NotNull Function0<Unit> function0) {
        return (ue) setY(new Object[]{this, function0}, -1170467262, 1170467263, System.identityHashCode(this));
    }

    @NotNull
    public final ue<ug> setOnFocusChangeListener(@NotNull Function1<? super ro, Unit> function1) {
        return (ue) setY(new Object[]{this, function1}, 1640575172, -1640575170, System.identityHashCode(this));
    }

    @NotNull
    public final ue<ts> setX(int i10, @NotNull Function0<Unit> function0) {
        return (ue) setY(new Object[]{this, Integer.valueOf(i10), function0}, 485715142, -485715142, i10);
    }
}
