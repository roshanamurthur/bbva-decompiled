package com.mypinpad.tsdk.isolation;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/oa;", "Lcom/mypinpad/tsdk/i/nq;", "Lkotlin/Function0;", "", "p0", "setY", "(Lkotlin/jvm/functions/Function0;)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class oa implements nq {

    @NotNull
    public static final oa INSTANCE = new oa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57432b = 1;

    static {
        int i10 = f57432b;
        int i11 = ((((i10 ^ 85) | (i10 & 85)) << 1) - (~(-(((~i10) & 85) | (i10 & (-86)))))) - 1;
        f57431a = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Function0 function0 = (Function0) objArr[0];
        int i13 = f57431a;
        int i14 = ((i13 | 64) << 1) - (i13 ^ 64);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f57432b = i15 % 128;
        if (i15 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            function0.invoke();
            return null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
        throw null;
    }

    public final synchronized void setY(@NotNull Function0<Unit> p4) {
        Intrinsics.checkNotNullParameter(p4, "");
        new Handler(Looper.getMainLooper()).post(new k3(p4, 1));
        int i10 = f57431a;
        int i11 = i10 & 51;
        int i12 = -(-((i10 ^ 51) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f57432b = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }
}
