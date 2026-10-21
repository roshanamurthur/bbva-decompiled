package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface getPinPadConfiguration {
    @Nullable
    <T> T setOnFocusChangeListener(@NotNull Class<T> cls);

    <T> T setOnFocusChangeListener(@NotNull Class<T> cls, @NotNull Function0<? extends T> function0);

    <T> T setX(@NotNull Class<T> cls);
}
