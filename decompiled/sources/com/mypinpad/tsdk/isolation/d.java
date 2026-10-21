package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55068a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55069b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        f fVar = (f) objArr[0];
        int i13 = f55068a;
        int i14 = i13 | 95;
        int i15 = (i14 << 1) - ((~(i13 & 95)) & i14);
        f55069b = i15 % 128;
        if (i15 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fVar, "");
            setItemChecked.Companion companion = setItemChecked.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fVar, "");
        if (((setItemChecked) f.setOnFocusChangeListener(new Object[]{fVar}, -507364128, 507364135, System.identityHashCode(fVar))) == setItemChecked.setCompoundDrawableTintBlendMode) {
            int i16 = f55068a + 52;
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            f55069b = i17 % 128;
            if (i17 % 2 == 0) {
                setContentCaptureSession.Companion companion2 = setContentCaptureSession.INSTANCE;
                throw null;
            }
            if (((setContentCaptureSession) f.setOnFocusChangeListener(new Object[]{fVar}, 1210785074, -1210785072, System.identityHashCode(fVar))) == setContentCaptureSession.setDividerPadding && ((setDrawSelectorOnTop) f.setOnFocusChangeListener(new Object[]{fVar}, -1978094169, 1978094175, System.identityHashCode(fVar))) == setDrawSelectorOnTop.setX) {
                int i18 = f55069b;
                int i19 = (i18 & 67) + (i18 | 67);
                f55068a = i19 % 128;
                int i20 = i19 % 2;
                return Boolean.TRUE;
            }
        }
        int i21 = f55068a;
        int i22 = i21 & 37;
        int i23 = (i21 ^ 37) | i22;
        int i24 = (i22 & i23) + (i23 | i22);
        f55069b = i24 % 128;
        int i25 = i24 % 2;
        return Boolean.FALSE;
    }

    public static final boolean setY(@NotNull f fVar) {
        return ((Boolean) setDividerPadding(new Object[]{fVar}, -1630615362, 1630615362, (int) System.currentTimeMillis())).booleanValue();
    }
}
