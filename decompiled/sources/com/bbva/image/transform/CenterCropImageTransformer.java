package com.bbva.image.transform;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.util.Size;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CenterCropImageTransformer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001d\b\u0016\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/image/transform/CenterCropImageTransformer;", "Lcom/bbva/image/transform/ImageTransformer;", "Landroid/graphics/Bitmap;", "bitmap", "transform", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "b", "Z", "getPerformResize", "()Z", "performResize", "Landroid/util/Size;", "size", "<init>", "(Landroid/util/Size;)V", "", "", "parameters", "(Ljava/util/Map;)V", "Companion", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class CenterCropImageTransformer implements ImageTransformer {

    @NotNull
    public static final String ID = "CenterCrop";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean performResize;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f34888c;

    public CenterCropImageTransformer(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f34888c = size;
        this.id = ID;
        this.performResize = true;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    public boolean getPerformResize() {
        return this.performResize;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    @NotNull
    public Bitmap transform(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Size size = this.f34888c;
        Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, size.getWidth(), size.getHeight());
        Intrinsics.checkNotNullExpressionValue(bitmapExtractThumbnail, "ThumbnailUtils.extractTh… size.width, size.height)");
        return bitmapExtractThumbnail;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenterCropImageTransformer(@NotNull Map<String, ? extends Object> parameters) {
        this(UtilsKt.size(parameters));
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }
}
