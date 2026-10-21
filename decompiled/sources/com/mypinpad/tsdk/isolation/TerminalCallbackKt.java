package com.mypinpad.tsdk.isolation;

import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface TerminalCallbackKt {
    void setCompoundDrawableTintBlendMode(@NotNull setVisibility setvisibility, @NotNull Function0<Unit> function0);

    @NotNull
    <T> Future<T> setOnFocusChangeListener(@NotNull Function0<? extends T> function0);
}
