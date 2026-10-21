package com.mypinpad.tsdk.isolation;

import com.google.android.gms.wearable.WearableStatusCodes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class getInstallationId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55899a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55900b = 1;

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        getInstallationId getinstallationid = (getInstallationId) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        int i13 = f55899a;
        int i14 = i13 & 95;
        int i15 = (((i13 | 95) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
        f55900b = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(terminal, "");
        if (terminal == getinstallationid.setOnFocusChangeListener()) {
            if (!getinstallationid.setY()) {
                throw new setIndeterminateDrawable(WearableStatusCodes.DATA_ITEM_TOO_LARGE, String.valueOf((int) getinstallationid.setOnFocusChangeListener().setY()), null, 4, null);
            }
            int i17 = f55899a;
            int i18 = i17 & 29;
            int i19 = (((i17 ^ 29) | i18) << 1) - ((i17 | 29) & (~i18));
            f55900b = i19 % 128;
            if (i19 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        StringBuilder sb2 = new StringBuilder("Kernel configuration is under wrong kernel, kernel for configuration type: ");
        sb2.append((int) getinstallationid.setOnFocusChangeListener().setY());
        sb2.append(", wrapping kernel: ");
        sb2.append((int) terminal.setY());
        SouthPacificEndpoint.setX(new Object[]{sb2.toString()}, 818541572, -818541572, (int) System.currentTimeMillis());
        int i20 = f55900b + 37;
        f55899a = i20 % 128;
        int i21 = i20 % 2;
        return Boolean.FALSE;
    }

    @NotNull
    public abstract Terminal setOnFocusChangeListener();

    public abstract boolean setY();

    public final boolean setY(@NotNull Terminal terminal) {
        return ((Boolean) setX(new Object[]{this, terminal}, -823358435, 823358435, System.identityHashCode(this))).booleanValue();
    }
}
