package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class dd extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55136g = {i.d(dd.class, "transactionType_B1", "getTransactionType_B1()Lcom/mypinpad/softpos/emv/terminal/transaction/model/TransactionType;", 0)};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55138i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f55139f;

    static {
        int i10 = f55138i;
        int i11 = ((i10 ^ 40) + ((i10 & 40) << 1)) - 1;
        f55137h = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public dd() {
        super(setAnimation.SessionActivationFailure().setDividerPadding());
        md.Companion companion = md.INSTANCE;
        this.f55139f = new n(0, 7, 0, (openContextMenu) md.Companion.setCompoundDrawableTintBlendMode(new Object[0], 1227270162, -1227270160, (int) System.currentTimeMillis()));
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        dd ddVar = (dd) objArr[0];
        int i13 = f55137h;
        int i14 = ((i13 ^ 62) + ((i13 & 62) << 1)) - 1;
        f55138i = i14 % 128;
        int i15 = i14 % 2;
        n nVar = ddVar.f55139f;
        md mdVar = (md) ((Enum) n.setCompoundDrawableTintBlendMode(new Object[]{nVar, ddVar, f55136g[0]}, 2052976211, -2052976210, System.identityHashCode(nVar)));
        int i16 = (((i13 | 114) << 1) - (i13 ^ 114)) - 1;
        f55138i = i16 % 128;
        int i17 = i16 % 2;
        return mdVar;
    }

    @NotNull
    public final md setLayoutAnimation() {
        return (md) setDividerPadding(new Object[]{this}, -2041109093, 2041109093, System.identityHashCode(this));
    }
}
