package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface component20 {

    public static final class setDividerPadding {
        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            component20 component20Var = (component20) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            Intrinsics.checkNotNullParameter(component20Var, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            return null;
        }

        public static void setOnFocusChangeListener(@NotNull component20 component20Var, @NotNull byte[] bArr) {
            setCompoundDrawableTintBlendMode(new Object[]{component20Var, bArr}, -669423152, 669423152, (int) System.currentTimeMillis());
        }
    }

    void setCompoundDrawableTintBlendMode(@NotNull setSystemGestureExclusionRects setsystemgestureexclusionrects);

    void setY(@NotNull byte[] bArr);
}
