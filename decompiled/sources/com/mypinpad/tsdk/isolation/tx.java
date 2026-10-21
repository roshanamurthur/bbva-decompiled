package com.mypinpad.tsdk.isolation;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class tx implements uf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61208c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61209d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function3<Runnable, Long, TimeUnit, ScheduledFuture<?>> f61210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ScheduledFuture<?> f61211b;

    /* JADX WARN: Multi-variable type inference failed */
    public tx(@NotNull Function3<? super Runnable, ? super Long, ? super TimeUnit, ? extends ScheduledFuture<?>> function3) {
        Intrinsics.checkNotNullParameter(function3, "");
        this.f61210a = function3;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i12;
        if ((((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529)) != 1) {
            tx txVar = (tx) objArr[0];
            Runnable runnable = (Runnable) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            TimeUnit timeUnit = (TimeUnit) objArr[3];
            int i17 = f61208c;
            int i18 = (i17 & (-70)) | ((~i17) & 69);
            int i19 = (i17 & 69) << 1;
            int i20 = (i18 & i19) + (i19 | i18);
            f61209d = i20 % 128;
            int i21 = i20 % 2;
            Intrinsics.checkNotNullParameter(runnable, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            txVar.f61211b = txVar.f61210a.invoke(runnable, Long.valueOf(jLongValue), timeUnit);
            int i22 = f61209d;
            int i23 = i22 & 7;
            int i24 = (i22 ^ 7) | i23;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f61208c = i25 % 128;
            int i26 = i25 % 2;
        } else {
            tx txVar2 = (tx) objArr[0];
            ((Boolean) objArr[1]).booleanValue();
            int i27 = f61209d;
            int i28 = i27 + 43;
            f61208c = i28 % 128;
            int i29 = i28 % 2;
            ScheduledFuture<?> scheduledFuture = txVar2.f61211b;
            if (scheduledFuture != null) {
                int i30 = (i27 ^ 83) + ((i27 & 83) << 1);
                f61208c = i30 % 128;
                int i31 = i30 % 2;
                scheduledFuture.cancel(false);
                int i32 = f61209d;
                int i33 = (i32 ^ 99) + ((i32 & 99) << 1);
                f61208c = i33 % 128;
                int i34 = i33 % 2;
            } else {
                int i35 = i27 & 109;
                int i36 = -(-(i27 | 109));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f61208c = i37 % 128;
                int i38 = i37 % 2;
            }
            txVar2.f61211b = null;
            int i39 = f61209d;
            int i40 = (i39 ^ 67) + ((i39 & 67) << 1);
            f61208c = i40 % 128;
            if (i40 % 2 != 0) {
                int i41 = 44 / 0;
            }
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.uf
    public final void setCompoundDrawableTintBlendMode(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -622457780, 622457781, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.uf
    public final void setY(@NotNull Runnable runnable, long j10, @NotNull TimeUnit timeUnit) {
        setDividerPadding(new Object[]{this, runnable, Long.valueOf(j10), timeUnit}, -310490034, 310490034, System.identityHashCode(this));
    }
}
