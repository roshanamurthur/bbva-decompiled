package com.mypinpad.tsdk.isolation;

import androidx.camera.camera2.interop.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.h;

/* JADX INFO: loaded from: classes10.dex */
public final class vh implements TerminalCallbackKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61553b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61554c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ExecutorService f61555a;

    public vh(@NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "");
        this.f61555a = executorService;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-667)) + (i10 * (-1335));
        int i14 = ~i11;
        int i15 = i10 | i12;
        int i16 = ((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13;
        int i17 = 1;
        if (i16 == 1) {
            setVisibility setvisibility = (setVisibility) objArr[0];
            Function0<Unit> function0 = (Function0) objArr[1];
            int i18 = f61554c;
            int i19 = i18 & 119;
            int i20 = (i19 - (~((i18 ^ 119) | i19))) - 1;
            f61553b = i20 % 128;
            if (i20 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setvisibility, "");
                Intrinsics.checkNotNullParameter(function0, "");
                setvisibility.execute(function0);
                return null;
            }
            Intrinsics.checkNotNullParameter(setvisibility, "");
            Intrinsics.checkNotNullParameter(function0, "");
            setvisibility.execute(function0);
            throw null;
        }
        if (i16 == 2) {
            vh vhVar = (vh) objArr[0];
            final setVisibility setvisibility2 = (setVisibility) objArr[1];
            final Function0 function1 = (Function0) objArr[2];
            int i21 = f61553b + 115;
            f61554c = i21 % 128;
            if (i21 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setvisibility2, "");
                Intrinsics.checkNotNullParameter(function1, "");
                vhVar.f61555a.submit(new a(setvisibility2, function1, 5));
                return null;
            }
            Intrinsics.checkNotNullParameter(setvisibility2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            vhVar.f61555a.submit(new Runnable() { // from class: com.mypinpad.tsdk.i.e00
                @Override // java.lang.Runnable
                public final void run() {
                    vh.setCompoundDrawableTintBlendMode(new Object[]{setvisibility2, function1}, -234774682, 234774683, (int) System.currentTimeMillis());
                }
            });
            throw null;
        }
        if (i16 == 3) {
            Function0 function2 = (Function0) objArr[0];
            int i22 = f61553b;
            int i23 = i22 & 13;
            int i24 = i23 + ((i22 ^ 13) | i23);
            f61554c = i24 % 128;
            int i25 = i24 % 2;
            Intrinsics.checkNotNullParameter(function2, "");
            Object objInvoke = function2.invoke();
            int i26 = f61554c;
            int i27 = i26 & 87;
            int i28 = (i27 - (~((i26 ^ 87) | i27))) - 1;
            f61553b = i28 % 128;
            int i29 = i28 % 2;
            return objInvoke;
        }
        vh vhVar2 = (vh) objArr[0];
        Function0 function3 = (Function0) objArr[1];
        int i30 = f61553b;
        int i31 = (i30 & 7) + (i30 | 7);
        f61554c = i31 % 128;
        int i32 = i31 % 2;
        Intrinsics.checkNotNullParameter(function3, "");
        Future futureSubmit = vhVar2.f61555a.submit(new h(function3, i17));
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "");
        int i33 = f61553b;
        int i34 = i33 & 111;
        int i35 = (i33 ^ 111) | i34;
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        f61554c = i36 % 128;
        int i37 = i36 % 2;
        return futureSubmit;
    }

    @Override // com.mypinpad.tsdk.isolation.TerminalCallbackKt
    @NotNull
    public final <T> Future<T> setOnFocusChangeListener(@NotNull Function0<? extends T> function0) {
        return (Future) setCompoundDrawableTintBlendMode(new Object[]{this, function0}, 2118774792, -2118774792, System.identityHashCode(this));
    }

    public final synchronized void setY() {
        int i10 = f61554c;
        int i11 = ((i10 ^ 90) + ((i10 & 90) << 1)) - 1;
        f61553b = i11 % 128;
        if (i11 % 2 != 0) {
            this.f61555a.isShutdown();
            throw null;
        }
        if (!this.f61555a.isShutdown()) {
            this.f61555a.shutdown();
            int i12 = f61553b;
            int i13 = (i12 & 9) + (i12 | 9);
            f61554c = i13 % 128;
            if (i13 % 2 != 0) {
                return;
            } else {
                throw null;
            }
        }
        int i14 = f61554c;
        int i15 = i14 ^ 91;
        int i16 = (((i14 & 91) | i15) << 1) - i15;
        f61553b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 50 / 0;
            return;
        }
        return;
        throw th;
    }

    @Override // com.mypinpad.tsdk.isolation.TerminalCallbackKt
    public final void setCompoundDrawableTintBlendMode(@NotNull setVisibility setvisibility, @NotNull Function0<Unit> function0) {
        setCompoundDrawableTintBlendMode(new Object[]{this, setvisibility, function0}, 268290187, -268290185, System.identityHashCode(this));
    }
}
