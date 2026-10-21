package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jf extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56632g = {c.e(jf.class, "evmMode_B1b8", "getEvmMode_B1b8()Z", 0), c.e(jf.class, "magStripeMode_B1b7", "getMagStripeMode_B1b7()Z", 0), c.e(jf.class, "cvmRequired_B1b4", "getCvmRequired_B1b4()Z", 0)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f56633f;

    static {
        int i10 = -(-37);
        int i11 = (i10 << 1) - i10;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
    }

    public jf() {
        super(setAnimation.setLayerType().setDividerPadding());
        new h(0, 7);
        new h(0, 6);
        this.f56633f = new h(0, 3);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        jf jfVar = (jf) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        h hVar = jfVar.f56633f;
        h.setOnFocusChangeListener(new Object[]{hVar, jfVar, f56632g[2], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar));
        return null;
    }

    public final void setDividerPadding(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 1781419836, -1781419836, System.identityHashCode(this));
    }
}
