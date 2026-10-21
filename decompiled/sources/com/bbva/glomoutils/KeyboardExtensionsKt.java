package com.bbva.glomoutils;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KeyboardExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"openKeyboard", "", "window", "Landroid/view/Window;", "rootView", "Landroid/view/View;", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class KeyboardExtensionsKt {
    public static final void openKeyboard(@NotNull Window window, @NotNull View rootView) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        WindowCompat.getInsetsController(window, rootView).show(WindowInsetsCompat.Type.ime());
    }
}
