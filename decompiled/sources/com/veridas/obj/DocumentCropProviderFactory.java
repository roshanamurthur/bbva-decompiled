package com.veridas.obj;

import android.content.Context;
import androidx.annotation.Keep;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.graphics.ImageUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentCropProviderFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B!\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/veridas/obj/DocumentCropProviderFactory;", "Lcom/veridas/obj/ObjectCropProviderFactory;", "spatialObjectDetectorFactory", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "(Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "imageUtils", "Lcom/veridas/graphics/ImageUtils;", "(Lcom/veridas/graphics/ImageUtils;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "cropMargin", "", "(DLcom/veridas/graphics/ImageUtils;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "getCropMargin", "()D", "getImageUtils", "()Lcom/veridas/graphics/ImageUtils;", "getSpatialObjectDetectorFactory", "()Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "create", "Lcom/veridas/obj/ObjectCropProvider;", "context", "Landroid/content/Context;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCropProviderFactory implements ObjectCropProviderFactory {
    private final double cropMargin;

    @NotNull
    private final ImageUtils imageUtils;

    @NotNull
    private final SpatialObjectDetectorFactory spatialObjectDetectorFactory;

    public DocumentCropProviderFactory(double d2, @NotNull ImageUtils imageUtils, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
        this.cropMargin = d2;
        this.imageUtils = imageUtils;
        this.spatialObjectDetectorFactory = spatialObjectDetectorFactory;
    }

    @Override // com.veridas.obj.ObjectCropProviderFactory
    @NotNull
    public ObjectCropProvider create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DocumentCropProvider(this.imageUtils, this.spatialObjectDetectorFactory.createRectangleSpatialObjectDetector(context, null), this.cropMargin);
    }

    public final double getCropMargin() {
        return this.cropMargin;
    }

    @NotNull
    public final ImageUtils getImageUtils() {
        return this.imageUtils;
    }

    @NotNull
    public final SpatialObjectDetectorFactory getSpatialObjectDetectorFactory() {
        return this.spatialObjectDetectorFactory;
    }

    public /* synthetic */ DocumentCropProviderFactory(double d2, ImageUtils imageUtils, SpatialObjectDetectorFactory spatialObjectDetectorFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.06d : d2, (i10 & 2) != 0 ? new ImageUtils() : imageUtils, spatialObjectDetectorFactory);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentCropProviderFactory(@NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
        this(new ImageUtils(), spatialObjectDetectorFactory);
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentCropProviderFactory(@NotNull ImageUtils imageUtils, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
        this(0.06d, imageUtils, spatialObjectDetectorFactory);
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
    }
}
