package com.veridas.detect.obj.document;

import com.veridas.detect.Request;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.lib.entities.resources.Side;
import com.veridas.vdlibraryimageprocessing.CaptureType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/veridas/detect/obj/document/DocumentDetector;", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "a", "Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "getCaptureType", "()Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "captureType", "Lcom/veridas/lib/entities/resources/Side;", "b", "Lcom/veridas/lib/entities/resources/Side;", "getCaptureSide", "()Lcom/veridas/lib/entities/resources/Side;", "captureSide", "<init>", "(Lcom/veridas/vdlibraryimageprocessing/CaptureType;Lcom/veridas/lib/entities/resources/Side;)V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public abstract class DocumentDetector implements ObjectDetector<SequentialDetectionResult> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CaptureType captureType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Side captureSide;

    /* JADX INFO: compiled from: DocumentDetector.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/veridas/detect/obj/document/DocumentDetector$Companion;", "", "()V", "wrap", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "sequentialObjectDetector", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "captureType", "Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "captureSide", "Lcom/veridas/lib/entities/resources/Side;", "intelligent", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ObjectDetector wrap$default(Companion companion, SequenceObjectDetector sequenceObjectDetector, CaptureType captureType, Side side, boolean z10, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            return companion.wrap(sequenceObjectDetector, captureType, side, z10);
        }

        @NotNull
        public final ObjectDetector<SequentialDetectionResult> wrap(@NotNull final SequenceObjectDetector sequentialObjectDetector, @NotNull final CaptureType captureType, @NotNull final Side captureSide, final boolean intelligent) {
            Intrinsics.checkNotNullParameter(sequentialObjectDetector, "sequentialObjectDetector");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            return new DocumentDetector(captureType, captureSide) { // from class: com.veridas.detect.obj.document.DocumentDetector$Companion$wrap$1
                @Override // com.veridas.detect.obj.ObjectDetector
                public boolean finish() {
                    return sequentialObjectDetector.finish();
                }

                @Override // com.veridas.detect.obj.ObjectDetector
                public boolean initialize() {
                    return sequentialObjectDetector.initialize();
                }

                @Override // com.veridas.detect.obj.ObjectDetector
                /* JADX INFO: renamed from: isIntelligent, reason: from getter */
                public boolean getF66788c() {
                    return intelligent;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.veridas.detect.obj.ObjectDetector
                @NotNull
                public SequentialDetectionResult request(@NotNull Request request) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    return sequentialObjectDetector.request(request);
                }
            };
        }
    }

    public DocumentDetector(@NotNull CaptureType captureType, @NotNull Side captureSide) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        this.captureType = captureType;
        this.captureSide = captureSide;
    }

    @NotNull
    public final Side getCaptureSide() {
        return this.captureSide;
    }

    @NotNull
    public final CaptureType getCaptureType() {
        return this.captureType;
    }
}
