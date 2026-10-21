package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getCause {

    public static final class setX implements getDetailsFieldTextSizeSp {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55718b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f55719c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Enum<?> f55720a;

        public setX() {
            throw null;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setX setx = (setX) objArr[0];
            int i13 = f55719c;
            int i14 = i13 & 43;
            int i15 = ((i13 ^ 43) | i14) << 1;
            int i16 = -((i13 | 43) & (~i14));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f55718b = i17 % 128;
            int i18 = i17 % 2;
            String strValueOf = String.valueOf(setx.f55720a.ordinal());
            int i19 = f55718b;
            int i20 = i19 & 29;
            int i21 = ((i19 ^ 29) | i20) << 1;
            int i22 = -((i19 | 29) & (~i20));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f55719c = i23 % 128;
            if (i23 % 2 != 0) {
                return strValueOf;
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setDividerPadding(new Object[]{this}, -1042694866, 1042694866, System.identityHashCode(this));
        }
    }

    @NotNull
    public static final getDetailsFieldTextSizeSp setDividerPadding(@NotNull Enum<?> r3) {
        return (getDetailsFieldTextSizeSp) setY(new Object[]{r3}, -464716334, 464716334, (int) System.currentTimeMillis());
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Enum<?> r1 = (Enum) objArr[0];
        Intrinsics.checkNotNullParameter(r1, "");
        setX setx = new setX();
        setx.f55720a = r1;
        return setx;
    }
}
