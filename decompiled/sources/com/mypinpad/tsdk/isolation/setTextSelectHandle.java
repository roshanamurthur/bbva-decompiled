package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTextSelectHandle implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60692d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60693e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f60694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f60695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f60696c;

    public setTextSelectHandle(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.f60694a = str;
        this.f60695b = str2;
        this.f60696c = str3;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        String str;
        int i13 = ~i10;
        int i14 = (~(i13 | i12)) | (~((~i11) | i13));
        int i15 = ((i11 | i12) * 496) + (((~(i10 | (~i12) | i11)) | i14) * (-496)) + (i14 * 992) + (i11 * (-495)) + (i10 * (-495));
        if (i15 == 1) {
            setTextSelectHandle settextselecthandle = (setTextSelectHandle) objArr[0];
            int i16 = f60692d;
            int i17 = (i16 ^ 77) + ((i16 & 77) << 1);
            int i18 = i17 % 128;
            f60693e = i18;
            int i19 = i17 % 2;
            str = settextselecthandle.f60696c;
            if (i19 == 0) {
                throw null;
            }
            int i20 = ((i18 ^ 82) + ((i18 & 82) << 1)) - 1;
            f60692d = i20 % 128;
            int i21 = i20 % 2;
        } else if (i15 != 2) {
            setTextSelectHandle settextselecthandle2 = (setTextSelectHandle) objArr[0];
            int i22 = f60693e;
            int i23 = i22 & 5;
            int i24 = (((i22 | 5) & (~i23)) - (~(i23 << 1))) - 1;
            f60692d = i24 % 128;
            int i25 = i24 % 2;
            str = settextselecthandle2.f60695b;
            if (i25 != 0) {
                int i26 = 19 / 0;
            }
        } else {
            setTextSelectHandle settextselecthandle3 = (setTextSelectHandle) objArr[0];
            int i27 = f60693e;
            int i28 = i27 | 67;
            int i29 = (i28 << 1) - ((~(i27 & 67)) & i28);
            f60692d = i29 % 128;
            int i30 = i29 % 2;
            str = settextselecthandle3.f60694a;
            if (i30 != 0) {
                int i31 = 45 / 0;
            }
        }
        return str;
    }

    @NotNull
    public final String setDividerPadding() {
        return (String) setY(new Object[]{this}, -2115593116, 2115593118, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setY(new Object[]{this}, -1138307747, 1138307748, System.identityHashCode(this));
    }

    @NotNull
    public final String setY() {
        return (String) setY(new Object[]{this}, -1888958068, 1888958068, System.identityHashCode(this));
    }
}
