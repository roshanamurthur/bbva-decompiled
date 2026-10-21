package com.bbva.cells.componentkit.resource;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ResourceString.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\r"}, d2 = {"idToColor", "", "", "context", "Landroid/content/Context;", "idToDimension", "", "idToString", "toColorId", "toDimensionId", "toDrawableId", "toFontId", "toStringId", "componentkit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ResourceStringKt {
    public static final int idToColor(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.getColor(context, toColorId(str, context));
    }

    public static final float idToDimension(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDimension(toDimensionId(str, context));
    }

    @NotNull
    public static final String idToString(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(toStringId(str, context));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(id)");
        return string;
    }

    public static final int toColorId(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getIdentifier(str, "color", context.getPackageName());
    }

    public static final int toDimensionId(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getIdentifier(str, PluginUtils.IDENTIFIER_DIMENSION, context.getPackageName());
    }

    public static final int toDrawableId(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getIdentifier(str, PluginUtils.IDENTIFIER_DRAWABLE, context.getPackageName());
    }

    public static final int toFontId(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getIdentifier(str, "font", context.getPackageName());
    }

    public static final int toStringId(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getIdentifier(str, "string", context.getPackageName());
    }
}
