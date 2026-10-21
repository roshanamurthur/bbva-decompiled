package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ci extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f54824g = {i.d(ci.class, "onlinePinSupported_B2b7", "getOnlinePinSupported_B2b7()Z", 0)};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f54825f;

    static {
        int i10 = (1 & (-68)) | ((~1) & 67);
        int i11 = (1 & 67) << 1;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public ci() {
        super(setAnimation.setTextLocale().setDividerPadding());
        this.f54825f = new h(1, 6);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        ci ciVar = (ci) objArr[0];
        h hVar = ciVar.f54825f;
        return Boolean.valueOf(((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, ciVar, f54824g[0]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue());
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setY(new Object[]{this}, -604970277, 604970277, System.identityHashCode(this))).booleanValue();
    }
}
