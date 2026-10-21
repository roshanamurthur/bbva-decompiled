package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class setCropToPadding {
    @NotNull
    public static final <T> Iterable<T> setX(@NotNull JSONArray jSONArray, @NotNull Function2<? super JSONArray, ? super Integer, ? extends T> function2) {
        return (Iterable) setY(new Object[]{jSONArray, function2}, 1156772267, -1156772267, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        JSONArray jSONArray = (JSONArray) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        Intrinsics.checkNotNullParameter(jSONArray, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return new copydefault(jSONArray, function2);
    }
}
