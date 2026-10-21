package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setProgressDrawableTiled {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60379c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final component14 f60380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f60381b;

    public setProgressDrawableTiled(@NotNull component14 component14Var, byte b10) {
        Intrinsics.checkNotNullParameter(component14Var, "");
        this.f60380a = component14Var;
        this.f60381b = b10;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-667)) + (i10 * (-1335));
        int i14 = ~i11;
        int i15 = i10 | i12;
        if (((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13 != 1) {
            setProgressDrawableTiled setprogressdrawabletiled = (setProgressDrawableTiled) objArr[0];
            int i16 = f60379c;
            int i17 = i16 + 117;
            int i18 = i17 % 128;
            int i19 = i17 % 2;
            byte b10 = setprogressdrawabletiled.f60381b;
            int i20 = ((i16 & 57) - (~(-(-(i16 | 57))))) - 1;
            int i21 = i20 % 128;
            int i22 = i20 % 2;
            return Byte.valueOf(b10);
        }
        setProgressDrawableTiled setprogressdrawabletiled2 = (setProgressDrawableTiled) objArr[0];
        int i23 = f60379c;
        int i24 = i23 ^ 55;
        int i25 = (((i23 & 55) | i24) << 1) - i24;
        int i26 = i25 % 128;
        int i27 = i25 % 2;
        component14 component14Var = setprogressdrawabletiled2.f60380a;
        int i28 = ((i26 & (-4)) | ((~i26) & 3)) + ((i26 & 3) << 1);
        f60379c = i28 % 128;
        if (i28 % 2 != 0) {
            return component14Var;
        }
        int i29 = 65 / 0;
        return component14Var;
    }

    @NotNull
    public final component14 setX() {
        return (component14) setY(new Object[]{this}, 953160250, -953160249, System.identityHashCode(this));
    }

    public final byte setY() {
        return ((Byte) setY(new Object[]{this}, 1453588839, -1453588839, System.identityHashCode(this))).byteValue();
    }
}
