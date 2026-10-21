package com.mypinpad.tsdk.isolation;

import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setForceDarkAllowed {
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        String str = (String) objArr[0];
        Intrinsics.checkNotNullParameter(str, "");
        return new Timer(str);
    }

    @NotNull
    public static Timer setY(@NotNull String str) {
        return (Timer) setY(new Object[]{str}, -1097943296, 1097943296, (int) System.currentTimeMillis());
    }
}
