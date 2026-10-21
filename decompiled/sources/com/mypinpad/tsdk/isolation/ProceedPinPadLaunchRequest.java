package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ProceedPinPadLaunchRequest extends setFastScrollAlwaysVisible {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f51801r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f51802s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f51803p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f51804q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProceedPinPadLaunchRequest(@NotNull String str, @NotNull String str2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f51803p0 = str;
        this.f51804q0 = str2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-864)) + (i10 * 866);
        int i14 = ~i11;
        int i15 = ~i10;
        int i16 = ~i12;
        if ((((~(i10 | i16)) | (~(i14 | i16))) * 865) + ((~(i12 | i10)) * 865) + (((~(i15 | i16)) | i14) * (-865)) + i13 == 1) {
            ProceedPinPadLaunchRequest proceedPinPadLaunchRequest = (ProceedPinPadLaunchRequest) objArr[0];
            System.identityHashCode(proceedPinPadLaunchRequest);
            System.identityHashCode(proceedPinPadLaunchRequest);
            String str = proceedPinPadLaunchRequest.f51804q0;
            int i17 = f51802s0;
            int i18 = ((i17 & 40) + (i17 | 40)) - 1;
            f51801r0 = i18 % 128;
            int i19 = i18 % 2;
            return str;
        }
        ProceedPinPadLaunchRequest proceedPinPadLaunchRequest2 = (ProceedPinPadLaunchRequest) objArr[0];
        int i20 = f51801r0;
        int i21 = (i20 & (-20)) | ((~i20) & 19);
        int i22 = (i20 & 19) << 1;
        int i23 = (i21 & i22) + (i22 | i21);
        int i24 = i23 % 128;
        f51802s0 = i24;
        int i25 = i23 % 2;
        String str2 = proceedPinPadLaunchRequest2.f51803p0;
        int i26 = (-2) - ((((i24 | 56) << 1) - (i24 ^ 56)) ^ (-1));
        f51801r0 = i26 % 128;
        if (i26 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    @NotNull
    public final String setDividerPadding() {
        return (String) setY(new Object[]{this}, -1662177047, 1662177048, System.identityHashCode(this));
    }

    @NotNull
    public final String setY() {
        return (String) setY(new Object[]{this}, -1414403004, 1414403004, System.identityHashCode(this));
    }
}
