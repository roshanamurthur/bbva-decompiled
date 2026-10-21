package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface sa extends getDynamicButtonIconTextSpacingDp, Serializable {
    @Nullable
    sl getNavBarTitleString();

    @Nullable
    Long setCompoundDrawableTintBlendMode();

    @NotNull
    sb setDividerPadding();

    @Nullable
    rf setNavigationOnClickListener();

    @NotNull
    rz setOnFocusChangeListener();

    long setY();
}
