package com.veridas.detect.obj.document;

import com.veridas.detect.ObjectConfigurationCollection;
import com.veridas.detect.ObjectIdentifierCollection;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.lib.entities.resources.Document;
import com.veridas.lib.entities.resources.Side;
import com.veridas.vdlibraryimageprocessing.CaptureType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SmartDocumentAnalyzer.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/veridas/detect/obj/document/SmartDocumentAnalyzer;", "Lcom/veridas/detect/obj/document/DocumentDetector;", "", "isIntelligent", "finish", "initialize", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "Lcom/veridas/detect/ObjectConfigurationCollection;", "c", "Lcom/veridas/detect/ObjectConfigurationCollection;", "getConfigurationCollection", "()Lcom/veridas/detect/ObjectConfigurationCollection;", "configurationCollection", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "d", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "getIntelligentDetector", "()Lcom/veridas/detect/sequence/SequenceObjectDetector;", "intelligentDetector", "e", "getNonIntelligentDetector", "nonIntelligentDetector", "f", "getPassportDetector", "passportDetector", "g", "getRectangleDetector", "rectangleDetector", "h", "Z", "getIntelligentDetection", "()Z", "setIntelligentDetection", "(Z)V", "intelligentDetection", "Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "captureType", "Lcom/veridas/lib/entities/resources/Side;", "captureSide", "<init>", "(Lcom/veridas/vdlibraryimageprocessing/CaptureType;Lcom/veridas/lib/entities/resources/Side;Lcom/veridas/detect/ObjectConfigurationCollection;Lcom/veridas/detect/sequence/SequenceObjectDetector;Lcom/veridas/detect/sequence/SequenceObjectDetector;Lcom/veridas/detect/sequence/SequenceObjectDetector;Lcom/veridas/detect/sequence/SequenceObjectDetector;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class SmartDocumentAnalyzer extends DocumentDetector {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ObjectConfigurationCollection configurationCollection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequenceObjectDetector intelligentDetector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequenceObjectDetector nonIntelligentDetector;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequenceObjectDetector passportDetector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequenceObjectDetector rectangleDetector;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean intelligentDetection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartDocumentAnalyzer(@NotNull CaptureType captureType, @NotNull Side captureSide, @NotNull ObjectConfigurationCollection configurationCollection, @NotNull SequenceObjectDetector intelligentDetector, @NotNull SequenceObjectDetector nonIntelligentDetector, @NotNull SequenceObjectDetector passportDetector, @NotNull SequenceObjectDetector rectangleDetector) {
        super(captureType, captureSide);
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(configurationCollection, "configurationCollection");
        Intrinsics.checkNotNullParameter(intelligentDetector, "intelligentDetector");
        Intrinsics.checkNotNullParameter(nonIntelligentDetector, "nonIntelligentDetector");
        Intrinsics.checkNotNullParameter(passportDetector, "passportDetector");
        Intrinsics.checkNotNullParameter(rectangleDetector, "rectangleDetector");
        this.configurationCollection = configurationCollection;
        this.intelligentDetector = intelligentDetector;
        this.nonIntelligentDetector = nonIntelligentDetector;
        this.passportDetector = passportDetector;
        this.rectangleDetector = rectangleDetector;
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean finish() {
        this.rectangleDetector.finish();
        this.passportDetector.finish();
        this.nonIntelligentDetector.finish();
        this.intelligentDetector.finish();
        return true;
    }

    @NotNull
    public final ObjectConfigurationCollection getConfigurationCollection() {
        return this.configurationCollection;
    }

    public final boolean getIntelligentDetection() {
        return this.intelligentDetection;
    }

    @NotNull
    public final SequenceObjectDetector getIntelligentDetector() {
        return this.intelligentDetector;
    }

    @NotNull
    public final SequenceObjectDetector getNonIntelligentDetector() {
        return this.nonIntelligentDetector;
    }

    @NotNull
    public final SequenceObjectDetector getPassportDetector() {
        return this.passportDetector;
    }

    @NotNull
    public final SequenceObjectDetector getRectangleDetector() {
        return this.rectangleDetector;
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean initialize() {
        this.rectangleDetector.initialize();
        this.passportDetector.initialize();
        this.nonIntelligentDetector.initialize();
        this.intelligentDetector.initialize();
        return true;
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    /* JADX INFO: renamed from: isIntelligent */
    public boolean getF66788c() {
        return this.intelligentDetection;
    }

    public final void setIntelligentDetection(boolean z10) {
        this.intelligentDetection = z10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.veridas.detect.obj.ObjectDetector
    @NotNull
    public SequentialDetectionResult request(@NotNull Request request) {
        SequenceObjectDetector sequenceObjectDetector;
        Intrinsics.checkNotNullParameter(request, "request");
        ObjectIdentifierCollection objectIdentifierCollection = request.getObjectIdentifierCollection();
        List<String> elements = objectIdentifierCollection.getElements();
        ObjectConfigurationCollection objectConfigurationCollectionSubset = this.configurationCollection.subset(elements);
        if (!objectIdentifierCollection.getContainsAnything()) {
            throw new IllegalArgumentException("You must pass at least one object identifier to this objectDetector.".toString());
        }
        boolean rectangleHelp = false;
        this.intelligentDetection = false;
        if (Document.INSTANCE.isPassport((String) CollectionsKt___CollectionsKt.first((List) elements))) {
            sequenceObjectDetector = this.passportDetector;
        } else if (objectConfigurationCollectionSubset.getAllIntelligent()) {
            rectangleHelp = request.getRectangleHelp();
            this.intelligentDetection = true;
            sequenceObjectDetector = this.intelligentDetector;
        } else {
            sequenceObjectDetector = (objectConfigurationCollectionSubset.getAtLeastOneIntelligent() && getCaptureSide() == Side.REVERSE) ? this.rectangleDetector : this.nonIntelligentDetector;
        }
        return sequenceObjectDetector.request(new Request.Builder(null, false, null, null, null, null, false, null, null, null, 0.0d, null, false, 0, false, 0, false, 0.0d, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, false, null, null, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null).copyFrom(request).rectangleHelp(rectangleHelp).build());
    }
}
