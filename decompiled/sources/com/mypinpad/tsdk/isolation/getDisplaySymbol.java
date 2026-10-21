package com.mypinpad.tsdk.isolation;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getDisplaySymbol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f55814a;

    public getDisplaySymbol(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f55814a = context;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        getDisplaySymbol getdisplaysymbol = (getDisplaySymbol) objArr[0];
        return getdisplaysymbol.f55814a.getPackageManager().getInstallerPackageName(getdisplaysymbol.f55814a.getPackageName());
    }

    @Nullable
    public final String setOnFocusChangeListener() {
        return (String) setY(new Object[]{this}, 1447781523, -1447781523, System.identityHashCode(this));
    }
}
