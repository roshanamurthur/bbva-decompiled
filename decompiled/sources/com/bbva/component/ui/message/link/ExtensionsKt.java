package com.bbva.component.ui.message.link;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.resource.ResourceStringKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\n"}, d2 = {"getColor", "", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "context", "Landroid/content/Context;", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Landroid/content/Context;)Ljava/lang/Integer;", "getColorId", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getDrawableId", "component-ui-message-link_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExtensionsKt {
    @Nullable
    public static final Integer getColor(@NotNull ResourceId resourceId, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resourceId, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int colorId = getColorId(resourceId, context);
        if (colorId == 0) {
            return null;
        }
        return Integer.valueOf(ContextCompat.getColor(context, colorId));
    }

    public static final int getColorId(@NotNull ResourceId resourceId, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resourceId, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourceId.getAndroidId() != null) {
            Integer androidId = resourceId.getAndroidId();
            Intrinsics.checkNotNull(androidId);
            return androidId.intValue();
        }
        if (resourceId.getValue() == null) {
            return 0;
        }
        String value = resourceId.getValue();
        Intrinsics.checkNotNull(value);
        return ResourceStringKt.toColorId(value, context);
    }

    @Nullable
    public static final Drawable getDrawable(@NotNull ResourceId resourceId, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resourceId, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int drawableId = getDrawableId(resourceId, context);
        if (drawableId == 0) {
            return null;
        }
        return ContextCompat.getDrawable(context, drawableId);
    }

    public static final int getDrawableId(@NotNull ResourceId resourceId, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resourceId, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourceId.getAndroidId() != null) {
            Integer androidId = resourceId.getAndroidId();
            Intrinsics.checkNotNull(androidId);
            return androidId.intValue();
        }
        if (resourceId.getValue() == null) {
            return 0;
        }
        String value = resourceId.getValue();
        Intrinsics.checkNotNull(value);
        return ResourceStringKt.toDrawableId(value, context);
    }
}
