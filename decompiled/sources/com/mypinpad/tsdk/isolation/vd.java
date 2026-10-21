package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/vd;", "", "Lkotlin/Function0;", "", "p0", "setDividerPadding", "(Lkotlin/jvm/functions/Function0;)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
public final class vd {

    @NotNull
    public static final vd INSTANCE = new vd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final oa f61537a = oa.INSTANCE;

    static {
        int i10 = 103 % 128;
        if (103 % 2 == 0) {
            int i11 = 16 / 0;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Function0<Unit> function0 = (Function0) objArr[0];
        Intrinsics.checkNotNullParameter(function0, "");
        f61537a.setY(function0);
        return null;
    }

    public static void setDividerPadding(@NotNull Function0<Unit> p4) {
        setDividerPadding(new Object[]{p4}, 1115627770, -1115627770, (int) System.currentTimeMillis());
    }
}
