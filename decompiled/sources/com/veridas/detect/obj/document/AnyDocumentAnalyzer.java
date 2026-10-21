package com.veridas.detect.obj.document;

import com.veridas.detect.ObjectIdentifierCollection;
import com.veridas.detect.Request;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.lib.entities.resources.Document;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnyDocumentAnalyzer.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/veridas/detect/obj/document/AnyDocumentAnalyzer;", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "", "isIntelligent", "finish", "initialize", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "a", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "getPassportDetector", "()Lcom/veridas/detect/sequence/SequenceObjectDetector;", "passportDetector", "b", "getRectangleDetector", "rectangleDetector", "<init>", "(Lcom/veridas/detect/sequence/SequenceObjectDetector;Lcom/veridas/detect/sequence/SequenceObjectDetector;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class AnyDocumentAnalyzer implements ObjectDetector<SequentialDetectionResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequenceObjectDetector passportDetector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SequenceObjectDetector rectangleDetector;

    public AnyDocumentAnalyzer(@NotNull SequenceObjectDetector passportDetector, @NotNull SequenceObjectDetector rectangleDetector) {
        Intrinsics.checkNotNullParameter(passportDetector, "passportDetector");
        Intrinsics.checkNotNullParameter(rectangleDetector, "rectangleDetector");
        this.passportDetector = passportDetector;
        this.rectangleDetector = rectangleDetector;
    }

    @Override // com.veridas.detect.obj.ObjectDetector
    public boolean finish() {
        this.rectangleDetector.finish();
        this.passportDetector.finish();
        return true;
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
    public SequentialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ObjectIdentifierCollection objectIdentifierCollection = request.getObjectIdentifierCollection();
        if (objectIdentifierCollection.getContainsAnything()) {
            return ((objectIdentifierCollection.getContainsOne() && Document.INSTANCE.isPassport((String) CollectionsKt___CollectionsKt.first((List) objectIdentifierCollection.getElements()))) ? this.passportDetector : this.rectangleDetector).request(request);
        }
        throw new IllegalArgumentException("You must pass at least one object identifier to this objectDetector.".toString());
    }
}
