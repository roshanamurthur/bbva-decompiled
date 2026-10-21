package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setSubtitleTextAppearance {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60599e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60600f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f60601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final onPinPadLaunchRequest f60602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f60604d;

    public setSubtitleTextAppearance(@NotNull String str, @NotNull onPinPadLaunchRequest onpinpadlaunchrequest, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onpinpadlaunchrequest, "");
        this.f60601a = str;
        this.f60602b = onpinpadlaunchrequest;
        this.f60603c = i10;
        this.f60604d = i11;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~(i11 | i14))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i13 | (~(i14 | i15))) * 1324) + (i11 * (-661)) + (i10 * (-661));
        if (i16 == 1) {
            setSubtitleTextAppearance setsubtitletextappearance = (setSubtitleTextAppearance) objArr[0];
            int i17 = f60599e;
            int i18 = i17 & 47;
            int i19 = (i17 ^ 47) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i21 = i20 % 128;
            f60600f = i21;
            int i22 = i20 % 2;
            onPinPadLaunchRequest onpinpadlaunchrequest = setsubtitletextappearance.f60602b;
            int i23 = ((i21 ^ 40) + ((i21 & 40) << 1)) - 1;
            f60599e = i23 % 128;
            if (i23 % 2 == 0) {
                return onpinpadlaunchrequest;
            }
            int i24 = 90 / 0;
            return onpinpadlaunchrequest;
        }
        if (i16 == 2) {
            setSubtitleTextAppearance setsubtitletextappearance2 = (setSubtitleTextAppearance) objArr[0];
            int i25 = f60600f;
            int i26 = ((((i25 ^ 47) | (i25 & 47)) << 1) - (~(-(((~i25) & 47) | (i25 & (-48)))))) - 1;
            f60599e = i26 % 128;
            int i27 = i26 % 2;
            int i28 = setsubtitletextappearance2.f60604d;
            if (i27 == 0) {
                return Integer.valueOf(i28);
            }
            throw null;
        }
        if (i16 == 3) {
            setSubtitleTextAppearance setsubtitletextappearance3 = (setSubtitleTextAppearance) objArr[0];
            int i29 = f60600f + 11;
            f60599e = i29 % 128;
            int i30 = i29 % 2;
            int i31 = setsubtitletextappearance3.f60603c;
            if (i30 == 0) {
                return Integer.valueOf(i31);
            }
            throw null;
        }
        setSubtitleTextAppearance setsubtitletextappearance4 = (setSubtitleTextAppearance) objArr[0];
        int i32 = f60599e;
        int i33 = ((i32 ^ 32) + ((i32 & 32) << 1)) - 1;
        int i34 = i33 % 128;
        f60600f = i34;
        int i35 = i33 % 2;
        String str = setsubtitletextappearance4.f60601a;
        if (i35 == 0) {
            int i36 = 6 / 0;
        }
        int i37 = ((i34 | 10) << 1) - (i34 ^ 10);
        int i38 = (i37 ^ (-1)) + (i37 << 1);
        f60599e = i38 % 128;
        int i39 = i38 % 2;
        return str;
    }

    public final int setDividerPadding() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1003832922, 1003832924, System.identityHashCode(this))).intValue();
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1931512686, -1931512683, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final String setY() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1525765535, -1525765535, System.identityHashCode(this));
    }

    @NotNull
    public final onPinPadLaunchRequest setCompoundDrawableTintBlendMode() {
        return (onPinPadLaunchRequest) setCompoundDrawableTintBlendMode(new Object[]{this}, -480585336, 480585337, System.identityHashCode(this));
    }
}
