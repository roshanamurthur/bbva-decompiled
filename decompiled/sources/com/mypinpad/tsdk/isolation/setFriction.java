package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setFriction extends setHorizontalScrollBarEnabled {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<String> f59751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setFriction(@NotNull String str, @NotNull List<String> list) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f59751c = list;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((setFriction) objArr[0]).f59751c;
    }

    @NotNull
    public final List<String> setY() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 355777135, -355777135, System.identityHashCode(this));
    }
}
