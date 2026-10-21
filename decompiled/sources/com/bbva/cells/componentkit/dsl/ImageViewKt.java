package com.bbva.cells.componentkit.dsl;

import android.content.Context;
import android.widget.ImageView;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.Scale;
import com.bbva.cells.componentkit.resource.ResourceStringKt;
import com.bbva.widgets.image.extensions.ImageViewExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {ImageScaleTypeHandler.ID, "", "Landroid/widget/ImageView;", "Lcom/bbva/cells/componentkit/model/dsl/Scale;", "settings", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "source", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "url", "", "componentkit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ImageViewKt {

    /* JADX INFO: compiled from: ImageView.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            iArr[Scale.Center.ordinal()] = 1;
            iArr[Scale.CenterCrop.ordinal()] = 2;
            iArr[Scale.FitCenter.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void scale(@NotNull ImageView imageView, @Nullable Scale scale) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        int i10 = scale == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                scaleType = ImageView.ScaleType.CENTER;
            } else if (i10 != 2) {
                scaleType = i10 != 3 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            imageView.setScaleType(scaleType);
        }
    }

    public static final void settings(@NotNull ImageView imageView, @Nullable ImageSettings imageSettings) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (imageSettings == null) {
            return;
        }
        ViewKt.settings(imageView, imageSettings.getView());
        scale(imageView, imageSettings.getScale());
        source(imageView, imageSettings.getSource(), imageSettings.getUrl());
    }

    public static final void source(@NotNull ImageView imageView, @Nullable ResourceId resourceId, @Nullable String str) {
        int drawableId;
        Integer androidId;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str != null) {
            int iIntValue = 0;
            if (resourceId != null && (androidId = resourceId.getAndroidId()) != null) {
                iIntValue = androidId.intValue();
            }
            ImageViewExtensionsKt.load$default(imageView, str, iIntValue, null, 0, 12, null);
            return;
        }
        if (resourceId == null) {
            return;
        }
        if (resourceId.getAndroidId() != null) {
            Integer androidId2 = resourceId.getAndroidId();
            Intrinsics.checkNotNull(androidId2);
            drawableId = androidId2.intValue();
        } else {
            if (resourceId.getValue() == null) {
                return;
            }
            String value = resourceId.getValue();
            Intrinsics.checkNotNull(value);
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            drawableId = ResourceStringKt.toDrawableId(value, context);
        }
        imageView.setImageResource(drawableId);
    }
}
