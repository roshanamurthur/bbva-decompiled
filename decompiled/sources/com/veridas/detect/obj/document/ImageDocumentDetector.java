package com.veridas.detect.obj.document;

import com.veridas.detect.DetectableObjectConfiguration;
import com.veridas.detect.ObjectConfigurationCollection;
import com.veridas.detect.Request;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.lib.entities.resources.Document;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageDocumentDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/veridas/detect/obj/document/ImageDocumentDetector;", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "", "isIntelligent", "finish", "initialize", "", "objectIdentifier", "Lcom/veridas/detect/DetectableObjectConfiguration;", "configuration", "", "createCascadeSpatialObjectDetector", "createTemplateSpatialObjectDetector", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "getCascadeSpatialObjectDetector", "getTemplateSpatialObjectDetector", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/ObjectConfigurationCollection;", "a", "Lcom/veridas/detect/ObjectConfigurationCollection;", "getConfigurationCollection", "()Lcom/veridas/detect/ObjectConfigurationCollection;", "configurationCollection", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "b", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "getSpatialObjectDetectorFactory", "()Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "<init>", "(Lcom/veridas/detect/ObjectConfigurationCollection;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nImageDocumentDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDocumentDetector.kt\ncom/veridas/detect/obj/document/ImageDocumentDetector\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,154:1\n215#2,2:155\n215#2,2:157\n*S KotlinDebug\n*F\n+ 1 ImageDocumentDetector.kt\ncom/veridas/detect/obj/document/ImageDocumentDetector\n*L\n28#1:155,2\n33#1:157,2\n*E\n"})
public final class ImageDocumentDetector implements ObjectDetector<SpatialDetectionResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ObjectConfigurationCollection configurationCollection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SpatialObjectDetectorFactory spatialObjectDetectorFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f66798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f66799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SpatialObjectDetector f66800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SpatialObjectDetector f66801f;

    public ImageDocumentDetector(@NotNull ObjectConfigurationCollection configurationCollection, @NotNull SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
        Intrinsics.checkNotNullParameter(configurationCollection, "configurationCollection");
        Intrinsics.checkNotNullParameter(spatialObjectDetectorFactory, "spatialObjectDetectorFactory");
        this.configurationCollection = configurationCollection;
        this.spatialObjectDetectorFactory = spatialObjectDetectorFactory;
        this.f66798c = new LinkedHashMap();
        this.f66799d = new LinkedHashMap();
        this.f66800e = spatialObjectDetectorFactory.createPassportSpatialObjectDetector(null, null);
        this.f66801f = spatialObjectDetectorFactory.createRectangleSpatialObjectDetector(null, null);
    }

    public final void createCascadeSpatialObjectDetector(@NotNull String objectIdentifier, @NotNull DetectableObjectConfiguration configuration) {
        Intrinsics.checkNotNullParameter(objectIdentifier, "objectIdentifier");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SpatialObjectDetector spatialObjectDetectorCreateCascadeSpatialObjectDetector = this.spatialObjectDetectorFactory.createCascadeSpatialObjectDetector(null, configuration);
        spatialObjectDetectorCreateCascadeSpatialObjectDetector.initialize();
        this.f66798c.put(objectIdentifier, spatialObjectDetectorCreateCascadeSpatialObjectDetector);
    }

    public final void createTemplateSpatialObjectDetector(@NotNull String objectIdentifier, @NotNull DetectableObjectConfiguration configuration) {
        Intrinsics.checkNotNullParameter(objectIdentifier, "objectIdentifier");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SpatialObjectDetector spatialObjectDetectorCreateTemplateSpatialObjectDetector = this.spatialObjectDetectorFactory.createTemplateSpatialObjectDetector(null, configuration);
        spatialObjectDetectorCreateTemplateSpatialObjectDetector.initialize();
        this.f66799d.put(objectIdentifier, spatialObjectDetectorCreateTemplateSpatialObjectDetector);
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean finish() {
        this.f66801f.finish();
        this.f66800e.finish();
        Iterator it = this.f66798c.entrySet().iterator();
        while (it.hasNext()) {
            ((SpatialObjectDetector) ((Map.Entry) it.next()).getValue()).finish();
        }
        Iterator it2 = this.f66799d.entrySet().iterator();
        while (it2.hasNext()) {
            ((SpatialObjectDetector) ((Map.Entry) it2.next()).getValue()).finish();
        }
        return true;
    }

    @NotNull
    public final SpatialObjectDetector getCascadeSpatialObjectDetector(@NotNull String objectIdentifier, @NotNull DetectableObjectConfiguration configuration) {
        Intrinsics.checkNotNullParameter(objectIdentifier, "objectIdentifier");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LinkedHashMap linkedHashMap = this.f66798c;
        if (!linkedHashMap.containsKey(objectIdentifier)) {
            createCascadeSpatialObjectDetector(objectIdentifier, configuration);
        }
        SpatialObjectDetector spatialObjectDetector = (SpatialObjectDetector) linkedHashMap.get(objectIdentifier);
        if (spatialObjectDetector != null) {
            return spatialObjectDetector;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @NotNull
    public final ObjectConfigurationCollection getConfigurationCollection() {
        return this.configurationCollection;
    }

    @NotNull
    public final SpatialObjectDetectorFactory getSpatialObjectDetectorFactory() {
        return this.spatialObjectDetectorFactory;
    }

    @NotNull
    public final SpatialObjectDetector getTemplateSpatialObjectDetector(@NotNull String objectIdentifier, @NotNull DetectableObjectConfiguration configuration) {
        Intrinsics.checkNotNullParameter(objectIdentifier, "objectIdentifier");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LinkedHashMap linkedHashMap = this.f66799d;
        if (!linkedHashMap.containsKey(objectIdentifier)) {
            createTemplateSpatialObjectDetector(objectIdentifier, configuration);
        }
        SpatialObjectDetector spatialObjectDetector = (SpatialObjectDetector) linkedHashMap.get(objectIdentifier);
        if (spatialObjectDetector != null) {
            return spatialObjectDetector;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean initialize() {
        this.f66801f.initialize();
        this.f66800e.initialize();
        return true;
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    /* JADX INFO: renamed from: isIntelligent */
    public boolean getF66788c() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.veridas.detect.obj.ObjectDetector
    @NotNull
    public SpatialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String str = (String) CollectionsKt___CollectionsKt.first((List) request.getObjectIdentifierCollection().getElements());
        DetectableObjectConfiguration detectableObjectConfiguration = this.configurationCollection.getConfigurations().get(str);
        Request requestBuild = new Request.Builder(null, false, null, null, null, null, false, null, null, null, 0.0d, null, false, 0, false, 0, false, 0.0d, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, false, null, null, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null).copyFrom(request).build();
        SpatialObjectDetector spatialObjectDetector = this.f66801f;
        if (detectableObjectConfiguration == null) {
            return spatialObjectDetector.request(requestBuild);
        }
        if (Document.INSTANCE.isPassport(str)) {
            return this.f66800e.request(requestBuild);
        }
        SpatialDetectionResult spatialDetectionResultRequest = null;
        if (detectableObjectConfiguration.isIntelligent()) {
            spatialDetectionResultRequest = detectableObjectConfiguration.getCascadeDetectionCapable() ? getCascadeSpatialObjectDetector(str, detectableObjectConfiguration).request(requestBuild) : null;
            if (spatialDetectionResultRequest == null && detectableObjectConfiguration.getTemplateDetectionCapable()) {
                spatialDetectionResultRequest = getTemplateSpatialObjectDetector(str, detectableObjectConfiguration).request(requestBuild);
            }
        }
        return spatialDetectionResultRequest == null ? spatialObjectDetector.request(requestBuild) : spatialDetectionResultRequest;
    }
}
