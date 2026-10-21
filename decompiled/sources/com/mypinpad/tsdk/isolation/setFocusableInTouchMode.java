package com.mypinpad.tsdk.isolation;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setFocusableInTouchMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f59721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f59722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f59723c;

    public setFocusableInTouchMode(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f59721a = context;
        this.f59722b = str;
        this.f59723c = str2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setFocusableInTouchMode setfocusableintouchmode = (setFocusableInTouchMode) objArr[0];
        String str = setfocusableintouchmode.f59721a.getPackageManager().getPackageInfo(setfocusableintouchmode.f59721a.getPackageName(), 0).versionName;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return new setTextSelectHandle(str, setfocusableintouchmode.f59722b, setfocusableintouchmode.f59723c);
    }

    @NotNull
    public final setTextSelectHandle setX() {
        return (setTextSelectHandle) setDividerPadding(new Object[]{this}, -1941280040, 1941280040, System.identityHashCode(this));
    }
}
