package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface tn {
    void getNavBarTitleString();

    void setCompoundDrawableTintBlendMode();

    void setDividerPadding(@NotNull Throwable th2);

    boolean setDividerPadding();

    @NotNull
    UUID setOnFocusChangeListener();

    void setX();

    void setX(@NotNull sq sqVar, @NotNull Function1<? super sa, Unit> function1, @NotNull Function1<? super Boolean, Unit> function2, @Nullable re reVar, @NotNull Function1<? super rs, Unit> function3);

    long setY();

    void setY(@NotNull ns nsVar);
}
