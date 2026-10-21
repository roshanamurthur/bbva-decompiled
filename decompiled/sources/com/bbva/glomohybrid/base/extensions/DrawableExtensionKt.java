package com.bbva.glomohybrid.base.extensions;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DrawableExtension.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"setColorFilter", "", "Landroid/graphics/drawable/Drawable;", "color", "", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DrawableExtensionKt {
    public static final void setColorFilter(@NotNull Drawable drawable, @ColorInt int i10) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (Build.VERSION.SDK_INT < 29) {
            drawable.setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
        } else {
            e.b();
            drawable.setColorFilter(d.a(i10, BlendMode.SRC_ATOP));
        }
    }
}
