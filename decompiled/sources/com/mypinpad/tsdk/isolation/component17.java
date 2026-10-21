package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface component17 {

    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54862a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54863b = 1;

        public static /* synthetic */ byte[] setCompoundDrawableTintBlendMode(component17 component17Var) {
            return (byte[]) setOnFocusChangeListener(new Object[]{component17Var}, -811017857, 811017857, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            component17 component17Var = (component17) objArr[0];
            int i13 = f54863b;
            int i14 = ((i13 | 107) << 1) - (i13 ^ 107);
            f54862a = i14 % 128;
            int i15 = i14 % 2;
            byte[] compoundDrawableTintBlendMode = component17Var.setCompoundDrawableTintBlendMode(4);
            int i16 = f54862a;
            int i17 = (i16 & (-14)) | ((~i16) & 13);
            int i18 = -(-((i16 & 13) << 1));
            int i19 = (i17 & i18) + (i18 | i17);
            f54863b = i19 % 128;
            int i20 = i19 % 2;
            return compoundDrawableTintBlendMode;
        }
    }

    @NotNull
    byte[] setCompoundDrawableTintBlendMode(int i10);
}
