package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56712c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56713d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final iv f56714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getValue f56715b;

    public jv(@NotNull iv ivVar, @NotNull getValue getvalue) {
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56714a = ivVar;
        this.f56715b = getvalue;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        jv jvVar = (jv) objArr[0];
        int i13 = f56713d;
        int i14 = i13 ^ 21;
        int i15 = -(-((i13 & 21) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f56712c = i16 % 128;
        int i17 = i16 % 2;
        ee eeVar = ee.setDividerPadding;
        iv ivVar = jvVar.f56714a;
        setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar}, -219236292, 219236298, System.identityHashCode(ivVar));
        iv ivVar2 = jvVar.f56714a;
        fk fkVar = (fk) ee.setOnFocusChangeListener(new Object[]{eeVar, ivVar, jvVar.f56715b, setfitssystemwindows, (ds) iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar2}, 1118340294, -1118340287, System.identityHashCode(ivVar2))}, 432395290, -432395271, System.identityHashCode(eeVar));
        int i18 = f56712c;
        int i19 = (((i18 | 60) << 1) - (i18 ^ 60)) - 1;
        f56713d = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 50 / 0;
        }
        return fkVar;
    }

    @NotNull
    public final fk setY() {
        return (fk) setDividerPadding(new Object[]{this}, 1958509473, -1958509473, System.identityHashCode(this));
    }
}
