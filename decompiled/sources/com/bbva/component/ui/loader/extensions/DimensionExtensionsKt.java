package com.bbva.component.ui.loader.extensions;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DimensionExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"toDp", "", "context", "Landroid/content/Context;", "", "component-ui-loader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DimensionExtensionsKt {
    public static final float toDp(float f6, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, f6, context.getResources().getDisplayMetrics());
    }

    public static final int toDp(int i10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) toDp(i10, context);
    }
}
