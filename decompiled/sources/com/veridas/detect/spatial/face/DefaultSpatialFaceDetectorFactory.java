package com.veridas.detect.spatial.face;

import android.content.Context;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.ViewportGeometricAnalysisBuilder;
import com.veridas.detect.spatial.bridge.DefaultSpatialObjectDetectorFactory;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultSpatialFaceDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/veridas/detect/spatial/face/DefaultSpatialFaceDetectorFactory;", "Lcom/veridas/detect/spatial/face/SpatialFaceDetectorFactory;", "Landroid/content/Context;", "context", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "createSpatialFaceDetector", "Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "<init>", "(Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultSpatialFaceDetectorFactory implements SpatialFaceDetectorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ObjectConfigurationProvider f67055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SpatialObjectDetectorFactory f67056b;

    public DefaultSpatialFaceDetectorFactory(@NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
        this.f67055a = objectConfigurationProvider;
        this.f67056b = spatialObjectDetectorFactory;
    }

    @Override // com.veridas.detect.spatial.face.SpatialFaceDetectorFactory
    @NotNull
    public SpatialObjectDetector createSpatialFaceDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f67056b.createCascadeSpatialObjectDetector(context, this.f67055a.get());
    }

    public /* synthetic */ DefaultSpatialFaceDetectorFactory(ObjectConfigurationProvider objectConfigurationProvider, SpatialObjectDetectorFactory spatialObjectDetectorFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(objectConfigurationProvider, (i10 & 2) != 0 ? new DefaultSpatialObjectDetectorFactory(new ViewportGeometricAnalysisBuilder()) : spatialObjectDetectorFactory);
    }
}
