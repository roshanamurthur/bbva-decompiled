package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ke extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56778g = {i.d(ke.class, "dataStorageSupported_B1b1", "getDataStorageSupported_B1b1()Z", 0), i.d(ke.class, "extendedLoggingSupported_B1b2", "getExtendedLoggingSupported_B1b2()Z", 0), i.d(ke.class, "contactlessTearingRecoverySupported_B1b3", "getContactlessTearingRecoverySupported_B1b3()Z", 0)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f56779f;

    static {
        int i10 = 1 & 91;
        int i11 = (((1 ^ 91) | i10) << 1) - ((~i10) & (1 | 91));
        int i12 = i11 % 128;
        int i13 = i11 % 2;
    }

    public ke() {
        super(setAnimation.setProgressBackgroundTintBlendMode().setDividerPadding());
        new h(0, 0);
        new h(0, 1);
        this.f56779f = new h(0, 2);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        ke keVar = (ke) objArr[0];
        h hVar = keVar.f56779f;
        return Boolean.valueOf(((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, keVar, f56778g[2]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue());
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -256456682, 256456682, System.identityHashCode(this))).booleanValue();
    }
}
