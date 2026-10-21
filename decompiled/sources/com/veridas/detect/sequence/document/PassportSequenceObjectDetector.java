package com.veridas.detect.sequence.document;

import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.veridas.detect.DetectionMode;
import com.veridas.detect.ObjectConfigurationProvider;
import com.veridas.detect.ObjectIdentifierCollection;
import com.veridas.detect.Request;
import com.veridas.detect.sequence.SafeSequenceObjectDetector;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.sequence.context.DocumentSequentialAnalysisContext;
import com.veridas.detect.sequence.context.UniversalSequentialAnalysisContext;
import com.veridas.detect.sequence.document.analysis.PassportSequentialAnalysis;
import com.veridas.detect.sequence.document.proximity.DocumentViewportProximity;
import com.veridas.detect.sequence.document.score.PassportDocumentScorekeeper;
import com.veridas.detect.sequence.score.AbstractScorekeeper;
import com.veridas.detect.sequence.score.Score;
import com.veridas.detect.sequence.score.Scorekeeper;
import com.veridas.detect.spatial.SpatialObjectDetector;
import com.veridas.detect.spatial.bridge.SpatialObjectDetectorFactory;
import com.veridas.lib.entities.resources.Document;
import com.veridas.util.FpsCalculator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PassportSequenceObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/veridas/detect/sequence/document/PassportSequenceObjectDetector;", "Lcom/veridas/detect/sequence/document/AbstractSequenceDocumentDetector;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "createDetector", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class PassportSequenceObjectDetector extends AbstractSequenceDocumentDetector<DocumentSequentialAnalysisContext> {

    /* JADX INFO: compiled from: PassportSequenceObjectDetector.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000eJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0012Ji\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u001e"}, d2 = {"Lcom/veridas/detect/sequence/document/PassportSequenceObjectDetector$Builder;", "", "Lcom/veridas/detect/sequence/document/analysis/PassportSequentialAnalysis;", "value", "analysis", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "context", "Lcom/veridas/util/FpsCalculator;", "fpsCalculator", "Lcom/veridas/detect/ObjectConfigurationProvider;", "objectConfigurationProvider", "Lcom/veridas/detect/sequence/score/Score;", FirebaseAnalytics.Param.SCORE, "Lcom/veridas/detect/sequence/score/AbstractScorekeeper;", "Lcom/veridas/detect/sequence/document/score/DocumentScorekeeper;", "scorekeeper", "Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "spatialObjectDetectorFactory", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/sequence/document/analysis/PassportSequentialAnalysis;Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;Lcom/veridas/util/FpsCalculator;Lcom/veridas/detect/ObjectConfigurationProvider;Lcom/veridas/detect/sequence/score/Score;Lcom/veridas/detect/sequence/score/AbstractScorekeeper;Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public PassportSequentialAnalysis f66902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public DocumentSequentialAnalysisContext f66903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public FpsCalculator f66904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ObjectConfigurationProvider f66905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Score f66906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public AbstractScorekeeper<DocumentSequentialAnalysisContext> f66907f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public SpatialObjectDetectorFactory f66908g;

        public Builder() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder copy$default(Builder builder, PassportSequentialAnalysis passportSequentialAnalysis, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, Score score, AbstractScorekeeper abstractScorekeeper, SpatialObjectDetectorFactory spatialObjectDetectorFactory, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                passportSequentialAnalysis = builder.f66902a;
            }
            if ((i10 & 2) != 0) {
                documentSequentialAnalysisContext = builder.f66903b;
            }
            DocumentSequentialAnalysisContext documentSequentialAnalysisContext2 = documentSequentialAnalysisContext;
            if ((i10 & 4) != 0) {
                fpsCalculator = builder.f66904c;
            }
            FpsCalculator fpsCalculator2 = fpsCalculator;
            if ((i10 & 8) != 0) {
                objectConfigurationProvider = builder.f66905d;
            }
            ObjectConfigurationProvider objectConfigurationProvider2 = objectConfigurationProvider;
            if ((i10 & 16) != 0) {
                score = builder.f66906e;
            }
            Score score2 = score;
            if ((i10 & 32) != 0) {
                abstractScorekeeper = builder.f66907f;
            }
            AbstractScorekeeper abstractScorekeeper2 = abstractScorekeeper;
            if ((i10 & 64) != 0) {
                spatialObjectDetectorFactory = builder.f66908g;
            }
            return builder.copy(passportSequentialAnalysis, documentSequentialAnalysisContext2, fpsCalculator2, objectConfigurationProvider2, score2, abstractScorekeeper2, spatialObjectDetectorFactory);
        }

        @NotNull
        public final Builder analysis(@NotNull PassportSequentialAnalysis value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66902a = value;
            return this;
        }

        @NotNull
        public final SequenceObjectDetector build() {
            FpsCalculator fpsCalculator = this.f66904c;
            ObjectConfigurationProvider objectConfigurationProvider = this.f66905d;
            SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f66908g;
            PassportSequentialAnalysis passportSequentialAnalysisBuild = this.f66902a;
            DocumentSequentialAnalysisContext documentSequentialAnalysisContext = this.f66903b;
            Score score = this.f66906e;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> passportDocumentScorekeeper = this.f66907f;
            if (fpsCalculator == null) {
                throw new IllegalArgumentException("The fpsCalculator argument can't be null".toString());
            }
            if (objectConfigurationProvider == null) {
                throw new IllegalArgumentException("The objectConfigurationProvider argument can't be null".toString());
            }
            if (spatialObjectDetectorFactory == null) {
                throw new IllegalArgumentException("The spatialObjectDetectorFactory argument can't be null".toString());
            }
            if (score == null) {
                score = new Score(0, 0, 0.0d, 0.0d, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097135, null);
            }
            DocumentSequentialAnalysisContext universalSequentialAnalysisContext = documentSequentialAnalysisContext == null ? new UniversalSequentialAnalysisContext(score, null, false, null, null, null, 0.0d, false, 0, 0, 12, false, null, false, false, 0.0d, 100.0d, 25.0d, null, null, null, null, true, false, 0, 8, 1.5d, 1.5d, 0.0d, 0.0d, null, 0, null, 0, null, spatialObjectDetectorFactory, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 0.0d, 0, -239272962, 1073741815, null) : documentSequentialAnalysisContext;
            if (passportDocumentScorekeeper == null) {
                passportDocumentScorekeeper = new PassportDocumentScorekeeper();
            }
            if (passportSequentialAnalysisBuild == null) {
                passportSequentialAnalysisBuild = new PassportSequentialAnalysis.Builder(null, null, 3, null).documentViewportProximity(new DocumentViewportProximity.Builder(0.0d, 0.0d, null, 7, null).tooCloseScale(1.1d).tooFarScale(0.85d).centerMax(0.09d, 0.06d).build()).scorekeeper(passportDocumentScorekeeper).build();
            }
            return new SafeSequenceObjectDetector.Builder(null, null, 3, null).context(universalSequentialAnalysisContext).sequenceObjectDetector(new PassportSequenceObjectDetector(passportSequentialAnalysisBuild, score, passportDocumentScorekeeper, universalSequentialAnalysisContext, fpsCalculator, objectConfigurationProvider, spatialObjectDetectorFactory, null)).build();
        }

        @NotNull
        public final Builder context(@NotNull DocumentSequentialAnalysisContext value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66903b = value;
            return this;
        }

        @NotNull
        public final Builder copy(@Nullable PassportSequentialAnalysis analysis, @Nullable DocumentSequentialAnalysisContext context, @Nullable FpsCalculator fpsCalculator, @Nullable ObjectConfigurationProvider objectConfigurationProvider, @Nullable Score score, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> scorekeeper, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
            return new Builder(analysis, context, fpsCalculator, objectConfigurationProvider, score, scorekeeper, spatialObjectDetectorFactory);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.f66902a, builder.f66902a) && Intrinsics.areEqual(this.f66903b, builder.f66903b) && Intrinsics.areEqual(this.f66904c, builder.f66904c) && Intrinsics.areEqual(this.f66905d, builder.f66905d) && Intrinsics.areEqual(this.f66906e, builder.f66906e) && Intrinsics.areEqual(this.f66907f, builder.f66907f) && Intrinsics.areEqual(this.f66908g, builder.f66908g);
        }

        @NotNull
        public final Builder fpsCalculator(@NotNull FpsCalculator value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66904c = value;
            return this;
        }

        public int hashCode() {
            PassportSequentialAnalysis passportSequentialAnalysis = this.f66902a;
            int iHashCode = (passportSequentialAnalysis == null ? 0 : passportSequentialAnalysis.hashCode()) * 31;
            DocumentSequentialAnalysisContext documentSequentialAnalysisContext = this.f66903b;
            int iHashCode2 = (iHashCode + (documentSequentialAnalysisContext == null ? 0 : documentSequentialAnalysisContext.hashCode())) * 31;
            FpsCalculator fpsCalculator = this.f66904c;
            int iHashCode3 = (iHashCode2 + (fpsCalculator == null ? 0 : fpsCalculator.hashCode())) * 31;
            ObjectConfigurationProvider objectConfigurationProvider = this.f66905d;
            int iHashCode4 = (iHashCode3 + (objectConfigurationProvider == null ? 0 : objectConfigurationProvider.hashCode())) * 31;
            Score score = this.f66906e;
            int iHashCode5 = (iHashCode4 + (score == null ? 0 : score.hashCode())) * 31;
            AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper = this.f66907f;
            int iHashCode6 = (iHashCode5 + (abstractScorekeeper == null ? 0 : abstractScorekeeper.hashCode())) * 31;
            SpatialObjectDetectorFactory spatialObjectDetectorFactory = this.f66908g;
            return iHashCode6 + (spatialObjectDetectorFactory != null ? spatialObjectDetectorFactory.hashCode() : 0);
        }

        @NotNull
        public final Builder objectConfigurationProvider(@NotNull ObjectConfigurationProvider value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66905d = value;
            return this;
        }

        @NotNull
        public final Builder score(@NotNull Score value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66906e = value;
            return this;
        }

        @NotNull
        public final Builder scorekeeper(@NotNull AbstractScorekeeper<DocumentSequentialAnalysisContext> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66907f = value;
            return this;
        }

        @NotNull
        public final Builder spatialObjectDetectorFactory(@NotNull SpatialObjectDetectorFactory value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f66908g = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(analysis=" + this.f66902a + ", context=" + this.f66903b + ", fpsCalculator=" + this.f66904c + ", objectConfigurationProvider=" + this.f66905d + ", score=" + this.f66906e + ", scorekeeper=" + this.f66907f + ", spatialObjectDetectorFactory=" + this.f66908g + ")";
        }

        public Builder(@Nullable PassportSequentialAnalysis passportSequentialAnalysis, @Nullable DocumentSequentialAnalysisContext documentSequentialAnalysisContext, @Nullable FpsCalculator fpsCalculator, @Nullable ObjectConfigurationProvider objectConfigurationProvider, @Nullable Score score, @Nullable AbstractScorekeeper<DocumentSequentialAnalysisContext> abstractScorekeeper, @Nullable SpatialObjectDetectorFactory spatialObjectDetectorFactory) {
            this.f66902a = passportSequentialAnalysis;
            this.f66903b = documentSequentialAnalysisContext;
            this.f66904c = fpsCalculator;
            this.f66905d = objectConfigurationProvider;
            this.f66906e = score;
            this.f66907f = abstractScorekeeper;
            this.f66908g = spatialObjectDetectorFactory;
        }

        public /* synthetic */ Builder(PassportSequentialAnalysis passportSequentialAnalysis, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, Score score, AbstractScorekeeper abstractScorekeeper, SpatialObjectDetectorFactory spatialObjectDetectorFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : passportSequentialAnalysis, (i10 & 2) != 0 ? null : documentSequentialAnalysisContext, (i10 & 4) != 0 ? null : fpsCalculator, (i10 & 8) != 0 ? null : objectConfigurationProvider, (i10 & 16) != 0 ? null : score, (i10 & 32) != 0 ? null : abstractScorekeeper, (i10 & 64) != 0 ? null : spatialObjectDetectorFactory);
        }
    }

    public PassportSequenceObjectDetector(PassportSequentialAnalysis passportSequentialAnalysis, Score score, Scorekeeper scorekeeper, DocumentSequentialAnalysisContext documentSequentialAnalysisContext, FpsCalculator fpsCalculator, ObjectConfigurationProvider objectConfigurationProvider, SpatialObjectDetectorFactory spatialObjectDetectorFactory, DefaultConstructorMarker defaultConstructorMarker) {
        super(passportSequentialAnalysis, score, scorekeeper, fpsCalculator, spatialObjectDetectorFactory, documentSequentialAnalysisContext, objectConfigurationProvider);
    }

    @Override // com.veridas.detect.sequence.document.AbstractSequenceDocumentDetector
    @NotNull
    public SpatialObjectDetector createDetector() {
        return getSpatialObjectDetectorFactory().createPassportSpatialObjectDetector(null, null);
    }

    @Override // com.veridas.detect.sequence.SequenceObjectDetector
    @NotNull
    public SequentialDetectionResult request(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ObjectIdentifierCollection objectIdentifierCollection = request.getObjectIdentifierCollection();
        if (!objectIdentifierCollection.getContainsOne()) {
            throw new IllegalArgumentException("The document list must have exactly 1 element.".toString());
        }
        String str = (String) CollectionsKt___CollectionsKt.first((List) objectIdentifierCollection.getElements());
        if (!Document.INSTANCE.isPassport(str)) {
            throw new IllegalArgumentException(h0.b("The document id given is no passport type, given \"", str, "\".").toString());
        }
        getContext().setDetectionMode(DetectionMode.PASSPORT);
        ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) ((DocumentSequentialAnalysisContext) getContext().accept(getInitializerVisitor().request(request)).accept(getPreLightBlobDetectionVisitor())).accept(getDetectorVisitor())).accept(getFpsVisitor()).accept(getWarmupVisitor())).accept(getAnalysisVisitor())).accept(getResultVisitor()).accept(getPostLightBlobDetectionVisitor());
        SequentialDetectionResult result = getContext().getResult();
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
