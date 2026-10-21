package com.veridas.detect.spatial.document;

import android.content.Context;
import com.veridas.detect.DetectableObjectConfiguration;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.bridge.DefaultSpatialObjectDetectorFactory;
import com.veridas.detect.spatial.bridge.PassportSpatialObjectDetector;
import com.veridas.detect.spatial.bridge.RectangleSpatialObjectDetector;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultSpatialDocumentDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, d2 = {"Lcom/veridas/detect/spatial/document/DefaultSpatialDocumentDetectorFactory;", "Lcom/veridas/detect/spatial/document/SpatialDocumentDetectorFactory;", "Landroid/content/Context;", "context", "", "identifier", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "createIntelligentSpatialDocumentDetector", "createNonIntelligentSpatialDocumentDetector", "createPassportSpatialDocumentDetector", "createRectangleSpatialDocumentDetector", "Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "<init>", "(Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultSpatialDocumentDetectorFactory implements SpatialDocumentDetectorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ObjectConfigurationProvider f67041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SpatialObjectDetectorFactory f67042b;

    public DefaultSpatialDocumentDetectorFactory(@NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
        this.f67041a = objectConfigurationProvider;
        this.f67042b = spatialObjectDetectorFactory;
    }

    @Override // com.veridas.detect.spatial.document.SpatialDocumentDetectorFactory
    @NotNull
    public SpatialObjectDetector createIntelligentSpatialDocumentDetector(@NotNull Context context, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        DetectableObjectConfiguration detectableObjectConfiguration = this.f67041a.get(identifier);
        SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f67042b;
        SpatialObjectDetector spatialObjectDetectorCreateCascadeSpatialObjectDetector = spatialObjectDetectorFactory.createCascadeSpatialObjectDetector(context, detectableObjectConfiguration);
        return new IntelligentSpatialDocumentDetector.Builder(null, null, 3, null).cascadeSpatialObjectDetector(spatialObjectDetectorCreateCascadeSpatialObjectDetector).templateSpatialObjectDetector(spatialObjectDetectorFactory.createTemplateSpatialObjectDetector(context, detectableObjectConfiguration)).build();
    }

    @Override // com.veridas.detect.spatial.document.SpatialDocumentDetectorFactory
    @NotNull
    public SpatialObjectDetector createNonIntelligentSpatialDocumentDetector(@NotNull Context context, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        DetectableObjectConfiguration detectableObjectConfiguration = this.f67041a.get(identifier);
        SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f67042b;
        SpatialObjectDetector spatialObjectDetectorCreateCascadeSpatialObjectDetector = spatialObjectDetectorFactory.createCascadeSpatialObjectDetector(context, detectableObjectConfiguration);
        SpatialObjectDetector spatialObjectDetectorCreateRectangleSpatialObjectDetector = spatialObjectDetectorFactory.createRectangleSpatialObjectDetector(context, detectableObjectConfiguration);
        return new NonIntelligentSpatialDocumentDetector.Builder(null, null, null, 7, null).cascadeSpatialObjectDetector(spatialObjectDetectorCreateCascadeSpatialObjectDetector).rectangleSpatialObjectDetector(spatialObjectDetectorCreateRectangleSpatialObjectDetector).templateSpatialObjectDetector(spatialObjectDetectorFactory.createTemplateSpatialObjectDetector(context, detectableObjectConfiguration)).build();
    }

    @Override // com.veridas.detect.spatial.document.SpatialDocumentDetectorFactory
    @NotNull
    public SpatialObjectDetector createPassportSpatialDocumentDetector(@NotNull Context context, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new SpatialDocumentDetector.Builder(null, 1, null).detector(new PassportSpatialObjectDetector.Builder(null, 1, null).build()).build();
    }

    @Override // com.veridas.detect.spatial.document.SpatialDocumentDetectorFactory
    @NotNull
    public SpatialObjectDetector createRectangleSpatialDocumentDetector(@NotNull Context context, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new SpatialDocumentDetector.Builder(null, 1, null).detector(new RectangleSpatialObjectDetector.Builder(null, 1, null).build()).build();
    }

    public /* synthetic */ DefaultSpatialDocumentDetectorFactory(ObjectConfigurationProvider objectConfigurationProvider, SpatialObjectDetectorFactory spatialObjectDetectorFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(objectConfigurationProvider, (i10 & 2) != 0 ? new DefaultSpatialObjectDetectorFactory(null, 1, null) : spatialObjectDetectorFactory);
    }
}
