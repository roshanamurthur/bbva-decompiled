package com.veridas.detect.obj.face;

import android.content.Context;
import androidx.annotation.Keep;
import com.veridas.detect.FaceObjectConfigurationProvider;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.obj.SafeObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.face.DefaultSequenceFaceDetectorFactory;
import com.veridas.detect.sequence.face.SequenceFaceDetectorFactory;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.face.DefaultSpatialFaceDetectorFactory;
import com.veridas.detect.spatial.face.SpatialFaceDetectorFactory;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.util.DefaultFpsCalculatorFactory;
import com.veridas.util.FpsCalculatorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultFaceDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/veridas/detect/obj/face/DefaultFaceDetectorFactory;", "Lcom/veridas/detect/obj/face/FaceDetectorFactory;", "context", "Landroid/content/Context;", "resourcesDatabase", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "objectConfigurationProvider", "Lcom/veridas/detect/ObjectConfigurationProvider;", "fpsCalculatorFactory", "Lcom/veridas/util/FpsCalculatorFactory;", "spatialFaceDetectorFactory", "Lcom/veridas/detect/spatial/face/SpatialFaceDetectorFactory;", "sequenceFaceDetectorFactory", "Lcom/veridas/detect/sequence/face/SequenceFaceDetectorFactory;", "(Landroid/content/Context;Lcom/veridas/resource/database/IBlockingResourcesDatabase;Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/util/FpsCalculatorFactory;Lcom/veridas/detect/spatial/face/SpatialFaceDetectorFactory;Lcom/veridas/detect/sequence/face/SequenceFaceDetectorFactory;)V", "createImageFaceAnalyzer", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "createImageFaceDetector", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "createVideoFaceDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultFaceDetectorFactory implements FaceDetectorFactory {

    @NotNull
    private final Context context;

    @NotNull
    private final FpsCalculatorFactory fpsCalculatorFactory;

    @NotNull
    private final ObjectConfigurationProvider objectConfigurationProvider;

    @NotNull
    private final IBlockingResourcesDatabase resourcesDatabase;

    @NotNull
    private final SequenceFaceDetectorFactory sequenceFaceDetectorFactory;

    @NotNull
    private final SpatialFaceDetectorFactory spatialFaceDetectorFactory;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultFaceDetectorFactory(@NotNull Context context, @NotNull IBlockingResourcesDatabase resourcesDatabase) {
        this(context, resourcesDatabase, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
    }

    @Override // com.veridas.detect.obj.face.FaceDetectorFactory
    @NotNull
    public ObjectDetector<SpatialDetectionResult> createImageFaceAnalyzer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SafeObjectDetector.INSTANCE.wrap(ObjectDetector.Companion.wrap$default(ObjectDetector.INSTANCE, this.spatialFaceDetectorFactory.createSpatialFaceDetector(context), false, 2, (Object) null));
    }

    @Override // com.veridas.detect.obj.face.FaceDetectorFactory
    @NotNull
    public ObjectDetector<SequentialDetectionResult> createImageFaceDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SafeObjectDetector.INSTANCE.wrap(ObjectDetector.Companion.wrap$default(ObjectDetector.INSTANCE, this.sequenceFaceDetectorFactory.createImageFaceDetector(context, this.fpsCalculatorFactory.create()), false, 2, (Object) null));
    }

    @Override // com.veridas.detect.obj.face.FaceDetectorFactory
    @NotNull
    public ObjectDetector<SequentialDetectionResult> createVideoFaceDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SafeObjectDetector.INSTANCE.wrap(ObjectDetector.Companion.wrap$default(ObjectDetector.INSTANCE, this.sequenceFaceDetectorFactory.createVideoFaceDetector(context, this.fpsCalculatorFactory.create()), false, 2, (Object) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultFaceDetectorFactory(@NotNull Context context, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ObjectConfigurationProvider objectConfigurationProvider) {
        this(context, resourcesDatabase, objectConfigurationProvider, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultFaceDetectorFactory(@NotNull Context context, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull FpsCalculatorFactory fpsCalculatorFactory) {
        this(context, resourcesDatabase, objectConfigurationProvider, fpsCalculatorFactory, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(fpsCalculatorFactory, "fpsCalculatorFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultFaceDetectorFactory(@NotNull Context context, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull FpsCalculatorFactory fpsCalculatorFactory, @NotNull SpatialFaceDetectorFactory spatialFaceDetectorFactory) {
        this(context, resourcesDatabase, objectConfigurationProvider, fpsCalculatorFactory, spatialFaceDetectorFactory, null, 32, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(fpsCalculatorFactory, "fpsCalculatorFactory");
        Intrinsics.checkNotNullParameter(spatialFaceDetectorFactory, "spatialFaceDetectorFactory");
    }

    @JvmOverloads
    public DefaultFaceDetectorFactory(@NotNull Context context, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull FpsCalculatorFactory fpsCalculatorFactory, @NotNull SpatialFaceDetectorFactory spatialFaceDetectorFactory, @NotNull SequenceFaceDetectorFactory sequenceFaceDetectorFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(fpsCalculatorFactory, "fpsCalculatorFactory");
        Intrinsics.checkNotNullParameter(spatialFaceDetectorFactory, "spatialFaceDetectorFactory");
        Intrinsics.checkNotNullParameter(sequenceFaceDetectorFactory, "sequenceFaceDetectorFactory");
        this.context = context;
        this.resourcesDatabase = resourcesDatabase;
        this.objectConfigurationProvider = objectConfigurationProvider;
        this.fpsCalculatorFactory = fpsCalculatorFactory;
        this.spatialFaceDetectorFactory = spatialFaceDetectorFactory;
        this.sequenceFaceDetectorFactory = sequenceFaceDetectorFactory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DefaultFaceDetectorFactory(Context context, IBlockingResourcesDatabase iBlockingResourcesDatabase, ObjectConfigurationProvider objectConfigurationProvider, FpsCalculatorFactory fpsCalculatorFactory, SpatialFaceDetectorFactory spatialFaceDetectorFactory, SequenceFaceDetectorFactory sequenceFaceDetectorFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ObjectConfigurationProvider faceObjectConfigurationProvider = (i10 & 4) != 0 ? new FaceObjectConfigurationProvider(iBlockingResourcesDatabase) : objectConfigurationProvider;
        FpsCalculatorFactory defaultFpsCalculatorFactory = (i10 & 8) != 0 ? new DefaultFpsCalculatorFactory() : fpsCalculatorFactory;
        SpatialFaceDetectorFactory defaultSpatialFaceDetectorFactory = (i10 & 16) != 0 ? new DefaultSpatialFaceDetectorFactory(faceObjectConfigurationProvider, null, 2, null) : spatialFaceDetectorFactory;
        this(context, iBlockingResourcesDatabase, faceObjectConfigurationProvider, defaultFpsCalculatorFactory, defaultSpatialFaceDetectorFactory, (i10 & 32) != 0 ? new DefaultSequenceFaceDetectorFactory(defaultSpatialFaceDetectorFactory) : sequenceFaceDetectorFactory);
    }
}
