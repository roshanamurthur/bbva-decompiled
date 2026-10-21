package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class initialise implements setDrawingCacheEnabled {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56499a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56500b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        if ((((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13 != 1) {
            initialise initialiseVar = (initialise) objArr[0];
            int i15 = f56499a;
            int i16 = (((i15 | 46) << 1) - (i15 ^ 46)) - 1;
            f56500b = i16 % 128;
            int i17 = i16 % 2;
            obj = (setForegroundGravity) setDrawingCacheEnabled.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{initialiseVar}, 1549364492, -1549364492, (int) System.currentTimeMillis());
            int i18 = f56499a;
            int i19 = i18 ^ 29;
            int i20 = ((i18 & 29) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            f56500b = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
        } else {
            byte[] bArr = (byte[]) objArr[1];
            byte[] bArr2 = (byte[]) objArr[2];
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            amj amjVar = new amj(new aly());
            amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar, new ann(bArr)}, 156325013, -156325007, System.identityHashCode(amjVar));
            int length = bArr2.length;
            amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar, bArr2, Integer.valueOf(length)}, 1913310697, -1913310697, length);
            obj = new byte[((Integer) amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar}, 587204740, -587204738, System.identityHashCode(amjVar))).intValue()];
            ((Integer) amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar, obj}, -2044201634, 2044201635, System.identityHashCode(amjVar))).intValue();
            int i23 = (-2) - ((f56500b + 96) ^ (-1));
            f56499a = i23 % 128;
            if (i23 % 2 != 0) {
                throw null;
            }
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.setTextLocale
    @NotNull
    public final setForegroundGravity setOnFocusChangeListener() {
        return (setForegroundGravity) setDividerPadding(new Object[]{this}, 559601733, -559601733, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setTextLocale
    @NotNull
    public final byte[] setDividerPadding(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (byte[]) setDividerPadding(new Object[]{this, bArr, bArr2}, 214581838, -214581837, System.identityHashCode(this));
    }
}
