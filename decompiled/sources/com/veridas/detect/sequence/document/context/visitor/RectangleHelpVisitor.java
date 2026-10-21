package com.veridas.detect.sequence.document.context.visitor;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.DetectionMode;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.IntelligentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.detect.sequence.score.Scorekeeper;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.log.ILibraryLogger;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RectangleHelpVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/veridas/detect/sequence/document/context/visitor/RectangleHelpVisitor;", "Lcom/veridas/detect/sequence/context/SequentialAnalysisContextVisitor;", "Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "context", "", "visit", "Lcom/veridas/detect/sequence/score/Scorekeeper;", "a", "Lcom/veridas/detect/sequence/score/Scorekeeper;", "getScorekeeper", "()Lcom/veridas/detect/sequence/score/Scorekeeper;", "setScorekeeper", "(Lcom/veridas/detect/sequence/score/Scorekeeper;)V", "scorekeeper", "Lcom/veridas/log/ILibraryLogger;", "b", "Lcom/veridas/log/ILibraryLogger;", "getLogger", "()Lcom/veridas/log/ILibraryLogger;", "logger", "<init>", "(Lcom/veridas/detect/sequence/score/Scorekeeper;Lcom/veridas/log/ILibraryLogger;)V", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class RectangleHelpVisitor implements SequentialAnalysisContextVisitor<IntelligentSequentialAnalysisContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Scorekeeper scorekeeper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ILibraryLogger logger;

    /* JADX INFO: compiled from: RectangleHelpVisitor.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0013"}, d2 = {"Lcom/veridas/detect/sequence/document/context/visitor/RectangleHelpVisitor$Builder;", "", "Lcom/veridas/detect/sequence/score/Scorekeeper;", "value", "scorekeeper", "Lcom/veridas/log/ILibraryLogger;", "logger", "Lcom/veridas/detect/sequence/document/context/visitor/RectangleHelpVisitor;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/sequence/score/Scorekeeper;Lcom/veridas/log/ILibraryLogger;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Scorekeeper f66942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public ILibraryLogger f66943b;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Scorekeeper scorekeeper, ILibraryLogger iLibraryLogger, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                scorekeeper = builder.f66942a;
            }
            if ((i10 & 2) != 0) {
                iLibraryLogger = builder.f66943b;
            }
            return builder.copy(scorekeeper, iLibraryLogger);
        }

        @NotNull
        public final RectangleHelpVisitor build() {
            Scorekeeper scorekeeper = this.f66942a;
            ILibraryLogger iLibraryLogger = this.f66943b;
            if (scorekeeper == null) {
                throw new IllegalArgumentException("The scorekeeper parameter can't be null".toString());
            }
            if (iLibraryLogger != null) {
                return new RectangleHelpVisitor(scorekeeper, iLibraryLogger);
            }
            throw new IllegalArgumentException("The logger parameter can't be null".toString());
        }

        @NotNull
        public final Builder copy(@Nullable Scorekeeper scorekeeper, @Nullable ILibraryLogger logger) {
            return new Builder(scorekeeper, logger);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.f66942a, builder.f66942a) && Intrinsics.areEqual(this.f66943b, builder.f66943b);
        }

        public int hashCode() {
            Scorekeeper scorekeeper = this.f66942a;
            int iHashCode = (scorekeeper == null ? 0 : scorekeeper.hashCode()) * 31;
            ILibraryLogger iLibraryLogger = this.f66943b;
            return iHashCode + (iLibraryLogger != null ? iLibraryLogger.hashCode() : 0);
        }

        @NotNull
        public final Builder logger(@NotNull ILibraryLogger value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66943b = value;
            return this;
        }

        @NotNull
        public final Builder scorekeeper(@NotNull Scorekeeper value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66942a = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(scorekeeper=" + this.f66942a + ", logger=" + this.f66943b + ")";
        }

        public Builder(@Nullable Scorekeeper scorekeeper, @Nullable ILibraryLogger iLibraryLogger) {
            this.f66942a = scorekeeper;
            this.f66943b = iLibraryLogger;
        }

        public /* synthetic */ Builder(Scorekeeper scorekeeper, ILibraryLogger iLibraryLogger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : scorekeeper, (i10 & 2) != 0 ? null : iLibraryLogger);
        }
    }

    public RectangleHelpVisitor(@NotNull Scorekeeper scorekeeper, @NotNull ILibraryLogger logger) {
        Intrinsics.checkNotNullParameter(scorekeeper, "scorekeeper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.scorekeeper = scorekeeper;
        this.logger = logger;
    }

    @NotNull
    public final ILibraryLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public final Scorekeeper getScorekeeper() {
        return this.scorekeeper;
    }

    public final void setScorekeeper(@NotNull Scorekeeper scorekeeper) {
        Intrinsics.checkNotNullParameter(scorekeeper, "<set-?>");
        this.scorekeeper = scorekeeper;
    }

    @Override // com.veridas.detect.sequence.context.SequentialAnalysisContextVisitor
    public void visit(@NotNull IntelligentSequentialAnalysisContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DocumentSequentialAnalysisContext.DocumentDetectorElement documentDetectorElement = context.getDocumentDetectorElement();
        if (documentDetectorElement == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Request request = context.getRequest();
        if (request == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        SpatialObjectDetector rectangleDetector = documentDetectorElement.getRectangleDetector();
        VDConstantDefinition.TemplateProximity templateProximityCalculate = new DocumentViewportProximity.Builder(0.0d, 0.0d, null, 7, null).build().calculate(rectangleDetector.request(request));
        VDConstantDefinition.TemplateProximity templateProximity = VDConstantDefinition.TemplateProximity.CENTERED;
        ILibraryLogger iLibraryLogger = this.logger;
        if (templateProximityCalculate == templateProximity) {
            iLibraryLogger.log("RECTANGLES_FUSION", "detected: true");
            context.setRectangleDetected(context.getRectangleDetected() + 1);
            context.getRectangleDetected();
            if (context.getRectangleDetected() >= context.getRectangleDetectionSwitchLimit()) {
                context.setDetectionMode(DetectionMode.RECTANGLE);
                context.setDetector(rectangleDetector);
            }
        } else {
            iLibraryLogger.log("RECTANGLES_FUSION", "detected: false");
            context.setRectangleDetected(context.getRectangleDetected() - 1);
            context.getRectangleDetected();
            if (context.getRectangleDetected() < 0) {
                context.setRectangleDetected(0);
            }
        }
        context.setCycle(0);
    }
}
