package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class la extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56924g = {i.d(la.class, "cdcvmPerformed_B10b8", "getCdcvmPerformed_B10b8()Z", 0)};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56925h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56926i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f56927f;

    static {
        int i10 = f56926i;
        int i11 = (i10 & (-68)) | ((~i10) & 67);
        int i12 = (i10 & 67) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f56925h = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public la() {
        super(setAnimation.setShowDividers().setDividerPadding());
        this.f56927f = new h(9, 7);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        la laVar = (la) objArr[0];
        int i13 = f56925h;
        int i14 = i13 & 105;
        int i15 = (i13 ^ 105) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f56926i = i16 % 128;
        int i17 = i16 % 2;
        h hVar = laVar.f56927f;
        boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, laVar, f56924g[0]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
        int i18 = f56926i;
        int i19 = i18 & 113;
        int i20 = i19 + ((i18 ^ 113) | i19);
        f56925h = i20 % 128;
        if (i20 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 609695293, -609695293, System.identityHashCode(this))).booleanValue();
    }
}
