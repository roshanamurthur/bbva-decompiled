package com.veridas.detect.sequence.document.analysis.visitor;

import androidx.camera.core.processing.f;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.detect.spatial.SpatialObjectDetector;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentConfigurationSelectionVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/veridas/detect/sequence/document/analysis/visitor/DocumentConfigurationSelectionVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "", "parseDocuments", "visit", "Lcom/veridas/detect/ObjectConfigurationProvider;", "a", "Lcom/veridas/detect/ObjectConfigurationProvider;", "getObjectConfigurationProvider", "()Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "<init>", "(Lcom/veridas/detect/ObjectConfigurationProvider;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDocumentConfigurationSelectionVisitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentConfigurationSelectionVisitor.kt\ncom/veridas/detect/sequence/document/analysis/visitor/DocumentConfigurationSelectionVisitor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1855#2,2:70\n*S KotlinDebug\n*F\n+ 1 DocumentConfigurationSelectionVisitor.kt\ncom/veridas/detect/sequence/document/analysis/visitor/DocumentConfigurationSelectionVisitor\n*L\n28#1:70,2\n*E\n"})
public final class DocumentConfigurationSelectionVisitor implements SequentialAnalysisContextVisitor<DocumentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ObjectConfigurationProvider objectConfigurationProvider;

    public DocumentConfigurationSelectionVisitor(@NotNull ObjectConfigurationProvider objectConfigurationProvider) {
        Intrinsics.checkNotNullParameter(objectConfigurationProvider, "objectConfigurationProvider");
        this.objectConfigurationProvider = objectConfigurationProvider;
    }

    @NotNull
    public final ObjectConfigurationProvider getObjectConfigurationProvider() {
        return this.objectConfigurationProvider;
    }

    public final void parseDocuments(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = context.getRequest();
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        SpatialObjectDetector detector = context.getDetector();
        if (detector == null) {
            throw new IllegalArgumentException("The rectangle object detector can't be null.".toString());
        }
        List<String> elements = request.getObjectIdentifierCollection().getElements();
        List<String> documentIds = context.getDocumentIds();
        Map<String, DocumentSequentialAnalysisContext.DocumentDetectorElement> documentMap = context.getDocumentMap();
        for (String str : elements) {
            if (!documentIds.contains(str)) {
                documentIds.add(str);
            }
            if (!documentMap.containsKey(str)) {
                documentMap.put(str, new DocumentSequentialAnalysisContext.DocumentDetectorElement(str, this.objectConfigurationProvider.get(str), null, detector, null, 20, null));
            }
        }
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull DocumentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Request request = context.getRequest();
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (!request.getObjectIdentifierCollection().getContainsAnything()) {
            throw new IllegalArgumentException("No document identifiers given.".toString());
        }
        parseDocuments(context);
        String str = context.getDocumentIds().get(context.getDocumentIndex());
        DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement = context.getDocumentMap().get(str);
        if (documentDetectorElement == null) {
            throw new IllegalArgumentException(f.d("There is no element associated with document ", str).toString());
        }
        context.setDocumentDetectorElement(documentDetectorElement);
    }
}
