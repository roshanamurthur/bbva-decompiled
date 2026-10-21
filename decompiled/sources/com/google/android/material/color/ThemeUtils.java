package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ThemeUtils {
    public static void applyThemeOverlay(@NonNull Context context, @StyleRes int i10) {
        View viewPeekDecorView;
        Context context2;
        context.getTheme().applyStyle(i10, true);
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Resources.Theme theme = (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context2 = viewPeekDecorView.getContext()) == null) ? null : context2.getTheme();
            if (theme != null) {
                theme.applyStyle(i10, true);
            }
        }
    }
}
