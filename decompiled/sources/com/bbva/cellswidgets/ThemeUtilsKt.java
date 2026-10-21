package com.bbva.cellswidgets;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.annotation.StyleRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ThemeUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"withDefaultStyle", "Landroid/content/Context;", "styleResId", "", "cells-widgets_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ThemeUtilsKt {
    @NotNull
    public static final Context withDefaultStyle(@NotNull Context context, @StyleRes int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getClass().isAssignableFrom(ContextThemeWrapper.class) || context.getClass().isAssignableFrom(androidx.appcompat.view.ContextThemeWrapper.class)) ? context : new ContextThemeWrapper(context, i10);
    }
}
