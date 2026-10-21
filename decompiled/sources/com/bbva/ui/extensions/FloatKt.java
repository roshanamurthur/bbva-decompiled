package com.bbva.ui.extensions;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Float.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"toDp", "", "context", "Landroid/content/Context;", "toPx", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatKt {
    public static final float toDp(float f6, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f6 / context.getResources().getDisplayMetrics().density;
    }

    public static final float toPx(float f6, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, f6, context.getResources().getDisplayMetrics());
    }
}
