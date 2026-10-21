package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setBaselineAligned implements setContentDescription {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59498b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59499c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final component18 f59500a;

    public setBaselineAligned(@NotNull component18 component18Var) {
        Intrinsics.checkNotNullParameter(component18Var, "");
        this.f59500a = component18Var;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        setBaselineAligned setbaselinealigned = (setBaselineAligned) objArr[0];
        int i13 = f59498b;
        int i14 = i13 & 53;
        int i15 = (i13 | 53) & (~i14);
        int i16 = i14 << 1;
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        f59499c = i17 % 128;
        int i18 = i17 % 2;
        copy copyVar = copy.INSTANCE;
        TransactionCompleted transactionCompleted = (TransactionCompleted) copy.setOnFocusChangeListener(new Object[]{setbaselinealigned.f59500a.setDividerPadding()}, -1349205615, 1349205621, (int) System.currentTimeMillis());
        int i19 = f59499c;
        int i20 = (i19 | 51) << 1;
        int i21 = -(i19 ^ 51);
        int i22 = (i20 & i21) + (i21 | i20);
        f59498b = i22 % 128;
        if (i22 % 2 == 0) {
            return transactionCompleted;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.setContentDescription
    @NotNull
    public final TransactionCompleted setCompoundDrawableTintBlendMode() {
        return (TransactionCompleted) setY(new Object[]{this}, -680767354, 680767354, System.identityHashCode(this));
    }
}
