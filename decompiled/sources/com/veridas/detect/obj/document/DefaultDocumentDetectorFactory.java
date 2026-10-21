package com.veridas.detect.obj.document;

import android.content.Context;
import androidx.annotation.Keep;
import com.veridas.detect.DocumentConfigurationProvider;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.obj.SafeObjectDetector;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.document.DefaultSequenceDocumentDetectorFactory;
import com.veridas.detect.sequence.document.SequenceDocumentDetectorFactory;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.bridge.DefaultSpatialObjectDetectorFactory;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.lib.entities.resources.Side;
import com.veridas.log.ILibraryLogger;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.util.DefaultFpsCalculatorFactory;
import com.veridas.util.FpsCalculator;
import com.veridas.util.FpsCalculatorFactory;
import com.veridas.vdlibraryimageprocessing.CaptureType;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultDocumentDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/veridas/detect/obj/document/DefaultDocumentDetectorFactory;", "Lcom/veridas/detect/obj/document/DocumentDetectorFactory;", "captureType", "Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "captureSide", "Lcom/veridas/lib/entities/resources/Side;", "resourcesDatabase", "Lcom/veridas/resource/database/IBlockingResourcesDatabase;", "logger", "Lcom/veridas/log/ILibraryLogger;", "objectIdentifiers", "", "", "objectConfigurationProvider", "Lcom/veridas/detect/ObjectConfigurationProvider;", "fpsCalculatorFactory", "Lcom/veridas/util/FpsCalculatorFactory;", "spatialObjectDetectorFactory", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "sequenceDocumentDetectorFactory", "Lcom/veridas/detect/sequence/document/SequenceDocumentDetectorFactory;", "(Lcom/veridas/vdlibraryimageprocessing/CaptureType;Lcom/veridas/lib/entities/resources/Side;Lcom/veridas/resource/database/IBlockingResourcesDatabase;Lcom/veridas/log/ILibraryLogger;Ljava/util/List;Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/util/FpsCalculatorFactory;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;Lcom/veridas/detect/sequence/document/SequenceDocumentDetectorFactory;)V", "createAnyDocumentAnalyzer", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "context", "Landroid/content/Context;", "createAnyDocumentDetector", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "createImageDocumentAnalyzer", "createImageDocumentDetector", "createPassportAnalyzer", "createPassportDetector", "createSmartDocumentAnalyzer", "createVideoDocumentDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultDocumentDetectorFactory implements DocumentDetectorFactory {

    @NotNull
    private final Side captureSide;

    @NotNull
    private final CaptureType captureType;

    @NotNull
    private final FpsCalculatorFactory fpsCalculatorFactory;

    @NotNull
    private final ILibraryLogger logger;

    @NotNull
    private final ObjectConfigurationProvider objectConfigurationProvider;

    @NotNull
    private final List<String> objectIdentifiers;

    @NotNull
    private final IBlockingResourcesDatabase resourcesDatabase;

    @NotNull
    private final SequenceDocumentDetectorFactory sequenceDocumentDetectorFactory;

    @NotNull
    private final SpatialObjectDetectorFactory spatialObjectDetectorFactory;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultDocumentDetectorFactory(@NotNull CaptureType captureType, @NotNull Side captureSide, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ILibraryLogger logger, @NotNull List<String> objectIdentifiers) {
        this(captureType, captureSide, resourcesDatabase, logger, objectIdentifiers, null, null, null, null, 480, null);
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(objectIdentifiers, "objectIdentifiers");
    }

    @Override // com.veridas.detect.obj.document.DocumentDetectorFactory
    @NotNull
    public ObjectDetector<SequentialDetectionResult> createAnyDocumentAnalyzer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FpsCalculator fpsCalculatorCreate = this.fpsCalculatorFactory.create();
        return SafeObjectDetector.INSTANCE.wrap(new AnyDocumentAnalyzer(SequenceDocumentDetectorFactory.DefaultImpls.createPassportSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null), SequenceDocumentDetectorFactory.DefaultImpls.createRectangleSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null)));
    }

    @Override // com.veridas.detect.obj.document.DocumentDetectorFactory
    @NotNull
    public ObjectDetector<SpatialDetectionResult> createAnyDocumentDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SafeObjectDetector.INSTANCE.wrap(ObjectDetector.Companion.wrap$default(ObjectDetector.INSTANCE, this.spatialObjectDetectorFactory.createRectangleSpatialObjectDetector(context, null), false, 2, (Object) null));
    }

    @Override // com.veridas.detect.obj.document.DocumentDetectorFactory
    @NotNull
    public ObjectDetector<SequentialDetectionResult> createImageDocumentAnalyzer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FpsCalculator fpsCalculatorCreate = this.fpsCalculatorFactory.create();
        SequenceObjectDetector sequenceObjectDetectorCreateIntelligentSequenceObjectDetector$default = SequenceDocumentDetectorFactory.DefaultImpls.createIntelligentSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null);
        SequenceObjectDetector sequenceObjectDetectorCreateNonIntelligentSequenceObjectDetector$default = SequenceDocumentDetectorFactory.DefaultImpls.createNonIntelligentSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null);
        SequenceObjectDetector sequenceObjectDetectorCreatePassportSequenceObjectDetector$default = SequenceDocumentDetectorFactory.DefaultImpls.createPassportSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null);
        SequenceObjectDetector sequenceObjectDetectorCreateRectangleSequenceObjectDetector$default = SequenceDocumentDetectorFactory.DefaultImpls.createRectangleSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null);
        return SafeObjectDetector.INSTANCE.wrap(new ImageDocumentAnalyzer(this.captureType, this.captureSide, this.objectConfigurationProvider.get(this.objectIdentifiers), sequenceObjectDetectorCreateIntelligentSequenceObjectDetector$default, sequenceObjectDetectorCreateNonIntelligentSequenceObjectDetector$default, sequenceObjectDetectorCreatePassportSequenceObjectDetector$default, sequenceObjectDetectorCreateRectangleSequenceObjectDetector$default));
    }

    @Override // com.veridas.detect.obj.document.DocumentDetectorFactory
    @NotNull
    public ObjectDetector<SpatialDetectionResult> createImageDocumentDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SafeObjectDetector.INSTANCE.wrap(new ImageDocumentDetector(this.objectConfigurationProvider.get(this.objectIdentifiers), this.spatialObjectDetectorFactory));
    }

    @Override // com.veridas.detect.obj.document.DocumentDetectorFactory
    @NotNull
    public ObjectDetector<SequentialDetectionResult> createPassportAnalyzer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SafeObjectDetector.INSTANCE.wrap(DocumentDetector.INSTANCE.wrap(SequenceDocumentDetectorFactory.DefaultImpls.createPassportSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, this.fpsCalculatorFactory.create(), null, 4, null), this.captureType, this.captureSide, false));
    }

    @Override // com.veridas.detect.obj.document.DocumentDetectorFactory
    @NotNull
    public ObjectDetector<SpatialDetectionResult> createPassportDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SafeObjectDetector.INSTANCE.wrap(ObjectDetector.Companion.wrap$default(ObjectDetector.INSTANCE, this.spatialObjectDetectorFactory.createPassportSpatialObjectDetector(null, null), false, 2, (Object) null));
    }

    @Override // com.veridas.detect.obj.document.DocumentDetectorFactory
    @NotNull
    public ObjectDetector<SequentialDetectionResult> createSmartDocumentAnalyzer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FpsCalculator fpsCalculatorCreate = this.fpsCalculatorFactory.create();
        SequenceObjectDetector sequenceObjectDetectorCreateIntelligentSequenceObjectDetector$default = SequenceDocumentDetectorFactory.DefaultImpls.createIntelligentSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null);
        SequenceObjectDetector sequenceObjectDetectorCreateNonIntelligentSequenceObjectDetector$default = SequenceDocumentDetectorFactory.DefaultImpls.createNonIntelligentSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null);
        SequenceObjectDetector sequenceObjectDetectorCreatePassportSequenceObjectDetector$default = SequenceDocumentDetectorFactory.DefaultImpls.createPassportSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null);
        SequenceObjectDetector sequenceObjectDetectorCreateRectangleSequenceObjectDetector$default = SequenceDocumentDetectorFactory.DefaultImpls.createRectangleSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, fpsCalculatorCreate, null, 4, null);
        return SafeObjectDetector.INSTANCE.wrap(new SmartDocumentAnalyzer(this.captureType, this.captureSide, this.objectConfigurationProvider.get(this.objectIdentifiers), sequenceObjectDetectorCreateIntelligentSequenceObjectDetector$default, sequenceObjectDetectorCreateNonIntelligentSequenceObjectDetector$default, sequenceObjectDetectorCreatePassportSequenceObjectDetector$default, sequenceObjectDetectorCreateRectangleSequenceObjectDetector$default));
    }

    @Override // com.veridas.detect.obj.document.DocumentDetectorFactory
    @NotNull
    public ObjectDetector<SequentialDetectionResult> createVideoDocumentDetector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SafeObjectDetector.INSTANCE.wrap(DocumentDetector.INSTANCE.wrap(SequenceDocumentDetectorFactory.DefaultImpls.createIntelligentSequenceObjectDetector$default(this.sequenceDocumentDetectorFactory, context, this.fpsCalculatorFactory.create(), null, 4, null), this.captureType, this.captureSide, true));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultDocumentDetectorFactory(@NotNull CaptureType captureType, @NotNull Side captureSide, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ILibraryLogger logger, @NotNull List<String> objectIdentifiers, @NotNull ObjectConfigurationProvider objectConfigurationProvider) {
        this(captureType, captureSide, resourcesDatabase, logger, objectIdentifiers, objectConfigurationProvider, null, null, null, 448, null);
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(objectIdentifiers, "objectIdentifiers");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultDocumentDetectorFactory(@NotNull CaptureType captureType, @NotNull Side captureSide, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ILibraryLogger logger, @NotNull List<String> objectIdentifiers, @NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull FpsCalculatorFactory fpsCalculatorFactory) {
        this(captureType, captureSide, resourcesDatabase, logger, objectIdentifiers, objectConfigurationProvider, fpsCalculatorFactory, null, null, BluetoothState.REQUEST_CONNECT_DEVICE, null);
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(objectIdentifiers, "objectIdentifiers");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(fpsCalculatorFactory, "fpsCalculatorFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DefaultDocumentDetectorFactory(@NotNull CaptureType captureType, @NotNull Side captureSide, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ILibraryLogger logger, @NotNull List<String> objectIdentifiers, @NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull FpsCalculatorFactory fpsCalculatorFactory, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
        this(captureType, captureSide, resourcesDatabase, logger, objectIdentifiers, objectConfigurationProvider, fpsCalculatorFactory, spatialObjectDetectorFactory, null, 256, null);
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(objectIdentifiers, "objectIdentifiers");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(fpsCalculatorFactory, "fpsCalculatorFactory");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
    }

    @JvmOverloads
    public DefaultDocumentDetectorFactory(@NotNull CaptureType captureType, @NotNull Side captureSide, @NotNull IBlockingResourcesDatabase resourcesDatabase, @NotNull ILibraryLogger logger, @NotNull List<String> objectIdentifiers, @NotNull ObjectConfigurationProvider objectConfigurationProvider, @NotNull FpsCalculatorFactory fpsCalculatorFactory, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory, @NotNull SequenceDocumentDetectorFactory sequenceDocumentDetectorFactory) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(resourcesDatabase, "resourcesDatabase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(objectIdentifiers, "objectIdentifiers");
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        Intrinsics.checkNotNullParameter(fpsCalculatorFactory, "fpsCalculatorFactory");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
        Intrinsics.checkNotNullParameter(sequenceDocumentDetectorFactory, "sequenceDocumentDetectorFactory");
        this.captureType = captureType;
        this.captureSide = captureSide;
        this.resourcesDatabase = resourcesDatabase;
        this.logger = logger;
        this.objectIdentifiers = objectIdentifiers;
        this.objectConfigurationProvider = objectConfigurationProvider;
        this.fpsCalculatorFactory = fpsCalculatorFactory;
        this.spatialObjectDetectorFactory = spatialObjectDetectorFactory;
        this.sequenceDocumentDetectorFactory = sequenceDocumentDetectorFactory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DefaultDocumentDetectorFactory(CaptureType captureType, Side side, IBlockingResourcesDatabase iBlockingResourcesDatabase, ILibraryLogger iLibraryLogger, List list, ObjectConfigurationProvider objectConfigurationProvider, FpsCalculatorFactory fpsCalculatorFactory, SpatialObjectDetectorFactory spatialObjectDetectorFactory, SequenceDocumentDetectorFactory sequenceDocumentDetectorFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ObjectConfigurationProvider documentConfigurationProvider = (i10 & 32) != 0 ? new DocumentConfigurationProvider(captureType, side, iBlockingResourcesDatabase) : objectConfigurationProvider;
        FpsCalculatorFactory defaultFpsCalculatorFactory = (i10 & 64) != 0 ? new DefaultFpsCalculatorFactory() : fpsCalculatorFactory;
        SpatialObjectDetectorFactory defaultSpatialObjectDetectorFactory = (i10 & 128) != 0 ? new DefaultSpatialObjectDetectorFactory(null, 1, null) : spatialObjectDetectorFactory;
        this(captureType, side, iBlockingResourcesDatabase, iLibraryLogger, list, documentConfigurationProvider, defaultFpsCalculatorFactory, defaultSpatialObjectDetectorFactory, (i10 & 256) != 0 ? new DefaultSequenceDocumentDetectorFactory(documentConfigurationProvider, defaultSpatialObjectDetectorFactory, iLibraryLogger) : sequenceDocumentDetectorFactory);
    }
}
