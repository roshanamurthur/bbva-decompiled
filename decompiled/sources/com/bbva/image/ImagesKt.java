package com.bbva.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.image.extractor.BitmapExtractor;
import com.bbva.image.extractor.ExtractScale;
import com.bbva.image.extractor.ImageScaler;
import com.bbva.image.extractor.MaxSideImageScaler;
import com.bbva.image.extractor.NoScale;
import com.bbva.image.extractor.WeightImageScaler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Images.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"extractBitmap", "Landroid/graphics/Bitmap;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", ImageScaleTypeHandler.ID, "Lcom/bbva/image/extractor/ExtractScale;", "image-transform_release"}, k = 2, mv = {1, 4, 2})
public final class ImagesKt {
    @Nullable
    public static final Bitmap extractBitmap(@NotNull Uri extractBitmap, @NotNull Context context, @NotNull ExtractScale scale) {
        ImageScaler maxSideImageScaler;
        Intrinsics.checkNotNullParameter(extractBitmap, "$this$extractBitmap");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scale, "scale");
        if (scale instanceof ExtractScale.Weight) {
            maxSideImageScaler = new WeightImageScaler(((ExtractScale.Weight) scale).getWeightInMegabytes());
        } else if (scale instanceof ExtractScale.Side) {
            maxSideImageScaler = new MaxSideImageScaler(((ExtractScale.Side) scale).getMaxSide());
        } else {
            if (!(scale instanceof ExtractScale.Default)) {
                throw new NoWhenBranchMatchedException();
            }
            maxSideImageScaler = NoScale.INSTANCE;
        }
        return new BitmapExtractor(maxSideImageScaler).extract(context, extractBitmap);
    }

    public static /* synthetic */ Bitmap extractBitmap$default(Uri uri, Context context, ExtractScale extractScale, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            extractScale = ExtractScale.Default.INSTANCE;
        }
        return extractBitmap(uri, context, extractScale);
    }
}
