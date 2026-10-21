package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class kf extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56780h = {i.d(kf.class, "cdcvmPerformed_B2b2", "getCdcvmPerformed_B2b2()Z", 0), i.d(kf.class, "cdcvmPerformedAndFailed_B2b1", "getCdcvmPerformedAndFailed_B2b1()Z", 0)};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56781i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56782j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f56783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f56784g;

    static {
        int i10 = f56781i;
        int i11 = ((i10 & 50) + (i10 | 50)) - 1;
        f56782j = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 13 / 0;
        }
    }

    public kf() {
        super(setAnimation.onOptionsItemSelected().setDividerPadding());
        this.f56783f = new h(1, 1);
        this.f56784g = new h(1, 0);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i10 | i11) * 624) + ((i13 | i11) * 624) + (i13 * (-624)) + (i11 * (-623)) + (i10 * (-623));
        KProperty<Object>[] kPropertyArr = f56780h;
        if (i14 != 1) {
            kf kfVar = (kf) objArr[0];
            int i15 = f56782j;
            int i16 = (i15 ^ 13) + ((i15 & 13) << 1);
            f56781i = i16 % 128;
            int i17 = i16 % 2;
            h hVar = kfVar.f56784g;
            boolean zBooleanValue = ((Boolean) (i17 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar, kfVar, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar)) : h.setOnFocusChangeListener(new Object[]{hVar, kfVar, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar)))).booleanValue();
            int i18 = f56782j + 104;
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            f56781i = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 81 / 0;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        kf kfVar2 = (kf) objArr[0];
        int i21 = f56782j;
        int i22 = i21 & 13;
        int i23 = -(-((i21 ^ 13) | i22));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        f56781i = i24 % 128;
        int i25 = i24 % 2;
        h hVar2 = kfVar2.f56783f;
        boolean zBooleanValue2 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar2, kfVar2, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar2))).booleanValue();
        int i26 = f56781i;
        int i27 = (((i26 | 98) << 1) - (i26 ^ 98)) - 1;
        f56782j = i27 % 128;
        if (i27 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue2);
        }
        throw null;
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -341767026, 341767026, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setY(new Object[]{this}, 741538341, -741538340, System.identityHashCode(this))).booleanValue();
    }
}
