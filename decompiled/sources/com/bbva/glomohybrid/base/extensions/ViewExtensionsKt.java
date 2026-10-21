package com.bbva.glomohybrid.base.extensions;

import android.graphics.Color;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"accessibilityFocus", "Landroid/view/View;", "cancelAllAnimations", "", "show", "visible", "", "toColor", "", "", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewExtensionsKt {
    @NotNull
    public static final View accessibilityFocus(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.performAccessibilityAction(64, null);
        return view;
    }

    public static final void cancelAllAnimations(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.clearAnimation();
        view.animate().cancel();
    }

    public static final void show(@NotNull View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }

    public static final int toColor(@Nullable String str) {
        return Color.parseColor(str);
    }
}
