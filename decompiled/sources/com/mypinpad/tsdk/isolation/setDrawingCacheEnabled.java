package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface setDrawingCacheEnabled extends setTextLocale {

    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f59636a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59637b = 1;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setDrawingCacheEnabled setdrawingcacheenabled = (setDrawingCacheEnabled) objArr[0];
            int i13 = f59636a + 27;
            f59637b = i13 % 128;
            if (i13 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setdrawingcacheenabled, "");
                setForegroundGravity setforegroundgravity = setForegroundGravity.setX;
                throw null;
            }
            Intrinsics.checkNotNullParameter(setdrawingcacheenabled, "");
            setForegroundGravity setforegroundgravity2 = setForegroundGravity.setCompoundDrawableTintBlendMode;
            int i14 = f59637b;
            int i15 = i14 & 15;
            int i16 = i14 | 15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f59636a = i17 % 128;
            int i18 = i17 % 2;
            return setforegroundgravity2;
        }

        @NotNull
        public static setForegroundGravity setX(@NotNull setDrawingCacheEnabled setdrawingcacheenabled) {
            return (setForegroundGravity) setDividerPadding(new Object[]{setdrawingcacheenabled}, 1549364492, -1549364492, (int) System.currentTimeMillis());
        }
    }
}
