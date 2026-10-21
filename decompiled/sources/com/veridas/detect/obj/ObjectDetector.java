package com.veridas.detect.obj;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.detect.spatial.SpatialObjectDetector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/veridas/detect/obj/ObjectDetector;", ExifInterface.GPS_DIRECTION_TRUE, "", "finish", "", "initialize", "isIntelligent", "request", "Lcom/veridas/detect/Request;", "(Lcom/veridas/detect/Request;)Ljava/lang/Object;", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ObjectDetector<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f66776a;

    /* JADX INFO: compiled from: ObjectDetector.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/veridas/detect/obj/ObjectDetector$Companion;", "", "()V", "wrap", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "sequentialObjectDetector", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "intelligent", "", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "spatialObjectDetector", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f66776a = new Companion();

        public static /* synthetic */ ObjectDetector wrap$default(Companion companion, SequenceObjectDetector sequenceObjectDetector, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.wrap(sequenceObjectDetector, z10);
        }

        @NotNull
        public final ObjectDetector<SequentialDetectionResult> wrap(@NotNull final SequenceObjectDetector sequentialObjectDetector, final boolean intelligent) {
            Intrinsics.checkNotNullParameter(sequentialObjectDetector, "sequentialObjectDetector");
            return new ObjectDetector<SequentialDetectionResult>() { // from class: com.veridas.detect.obj.ObjectDetector$Companion$wrap$1
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
                public boolean getF66779a() {
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

        public static /* synthetic */ ObjectDetector wrap$default(Companion companion, SpatialObjectDetector spatialObjectDetector, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.wrap(spatialObjectDetector, z10);
        }

        @NotNull
        public final ObjectDetector<SpatialDetectionResult> wrap(@NotNull final SpatialObjectDetector spatialObjectDetector, final boolean intelligent) {
            Intrinsics.checkNotNullParameter(spatialObjectDetector, "spatialObjectDetector");
            return new ObjectDetector<SpatialDetectionResult>() { // from class: com.veridas.detect.obj.ObjectDetector$Companion$wrap$2
                @Override // com.veridas.detect.obj.ObjectDetector
                public boolean finish() {
                    return spatialObjectDetector.finish();
                }

                @Override // com.veridas.detect.obj.ObjectDetector
                public boolean initialize() {
                    return spatialObjectDetector.initialize();
                }

                @Override // com.veridas.detect.obj.ObjectDetector
                /* JADX INFO: renamed from: isIntelligent, reason: from getter */
                public boolean getF66779a() {
                    return intelligent;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.veridas.detect.obj.ObjectDetector
                @NotNull
                public SpatialDetectionResult request(@NotNull Request request) {
                    Intrinsics.checkNotNullParameter(request, "request");
                    return spatialObjectDetector.request(request);
                }
            };
        }
    }

    boolean finish();

    boolean initialize();

    /* JADX INFO: renamed from: isIntelligent */
    boolean getF66779a();

    T request(@NotNull Request request);
}
