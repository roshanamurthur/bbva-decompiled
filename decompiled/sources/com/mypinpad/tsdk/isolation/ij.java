package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface ij {

    public static final class setX {
        @NotNull
        public static io setCompoundDrawableTintBlendMode(@NotNull ij ijVar, @NotNull setTextKeepState settextkeepstate) {
            return (io) setDividerPadding(new Object[]{ijVar, settextkeepstate}, 1355852393, -1355852393, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            ij ijVar = (ij) objArr[0];
            setTextKeepState settextkeepstate = (setTextKeepState) objArr[1];
            Intrinsics.checkNotNullParameter(ijVar, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            return new io(settextkeepstate);
        }
    }

    @NotNull
    io setY(@NotNull setTextKeepState settextkeepstate);
}
