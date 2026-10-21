package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setSupportBackgroundTintList extends setHorizontalScrollBarEnabled {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60607e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60608f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f60609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSupportBackgroundTintList(@NotNull String str, @NotNull String str2, long j10) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f60609c = str2;
        this.f60610d = j10;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        long j10;
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        if (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711)) == 1) {
            setSupportBackgroundTintList setsupportbackgroundtintlist = (setSupportBackgroundTintList) objArr[0];
            int i17 = f60608f;
            int i18 = i17 & 75;
            int i19 = (((i17 ^ 75) | i18) << 1) - ((i17 | 75) & (~i18));
            f60607e = i19 % 128;
            if (i19 % 2 != 0) {
                j10 = setsupportbackgroundtintlist.f60610d;
                int i20 = 23 / 0;
            } else {
                j10 = setsupportbackgroundtintlist.f60610d;
            }
            return Long.valueOf(j10);
        }
        setSupportBackgroundTintList setsupportbackgroundtintlist2 = (setSupportBackgroundTintList) objArr[0];
        int i21 = f60607e;
        int i22 = i21 & 115;
        int i23 = ((i21 ^ 115) | i22) << 1;
        int i24 = -((i21 | 115) & (~i22));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        int i26 = i25 % 128;
        f60608f = i26;
        int i27 = i25 % 2;
        String str = setsupportbackgroundtintlist2.f60609c;
        int i28 = ((i26 | 1) << 1) - (i26 ^ 1);
        f60607e = i28 % 128;
        int i29 = i28 % 2;
        return str;
    }

    public final long setCompoundDrawableTintBlendMode() {
        return ((Long) setX(new Object[]{this}, 655875256, -655875255, System.identityHashCode(this))).longValue();
    }

    @NotNull
    public final String setY() {
        return (String) setX(new Object[]{this}, -24970315, 24970315, System.identityHashCode(this));
    }
}
