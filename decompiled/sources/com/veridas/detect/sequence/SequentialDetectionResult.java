package com.veridas.detect.sequence;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.salesforce.marketingcloud.storage.db.i;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SequentialDetectionResult.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0001'B_\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001c¨\u0006("}, d2 = {"Lcom/veridas/detect/sequence/SequentialDetectionResult;", "", "analysisType", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "fps", "", "objectData", "", "objectDetected", "", "objectLost", "progress", i.a.f65026x, "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "request", "Lcom/veridas/detect/Request;", "spatialDetectionResult", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "warmup", "warmupComplete", "(Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;DLjava/lang/String;ZZDLcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;Lcom/veridas/detect/Request;Lcom/veridas/detect/spatial/SpatialDetectionResult;ZZ)V", "getAnalysisType", "()Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "getFps", "()D", "getObjectData", "()Ljava/lang/String;", "getObjectDetected", "()Z", "getObjectLost", "getProgress", "getProximity", "()Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "getRequest", "()Lcom/veridas/detect/Request;", "getSpatialDetectionResult", "()Lcom/veridas/detect/spatial/SpatialDetectionResult;", "getWarmup", "getWarmupComplete", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SequentialDetectionResult {

    @NotNull
    private final VDConstantDefinition.AnalysisType analysisType;
    private final double fps;

    @NotNull
    private final String objectData;
    private final boolean objectDetected;
    private final boolean objectLost;
    private final double progress;

    @NotNull
    private final VDConstantDefinition.TemplateProximity proximity;

    @NotNull
    private final Request request;

    @NotNull
    private final SpatialDetectionResult spatialDetectionResult;
    private final boolean warmup;
    private final boolean warmupComplete;

    /* JADX INFO: compiled from: SequentialDetectionResult.kt */
    @Keep
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0003J\u0006\u0010:\u001a\u00020;J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0011HÆ\u0003J}\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\tHÆ\u0001J\u0013\u0010H\u001a\u00020\t2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0005J\t\u0010J\u001a\u00020KHÖ\u0001J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u00109\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u00109\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u00109\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010\u0011J\t\u0010L\u001a\u00020\u0007HÖ\u0001J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u00109\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u00109\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0012\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$¨\u0006M"}, d2 = {"Lcom/veridas/detect/sequence/SequentialDetectionResult$Builder;", "", "analysisType", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "fps", "", "objectData", "", "objectDetected", "", "objectLost", "progress", i.a.f65026x, "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "request", "Lcom/veridas/detect/Request;", "spatialDetectionResult", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "warmup", "warmupComplete", "(Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;DLjava/lang/String;ZZDLcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;Lcom/veridas/detect/Request;Lcom/veridas/detect/spatial/SpatialDetectionResult;ZZ)V", "getAnalysisType", "()Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;", "setAnalysisType", "(Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$AnalysisType;)V", "getFps", "()D", "setFps", "(D)V", "getObjectData", "()Ljava/lang/String;", "setObjectData", "(Ljava/lang/String;)V", "getObjectDetected", "()Z", "setObjectDetected", "(Z)V", "getObjectLost", "setObjectLost", "getProgress", "setProgress", "getProximity", "()Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "setProximity", "(Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;)V", "getRequest", "()Lcom/veridas/detect/Request;", "setRequest", "(Lcom/veridas/detect/Request;)V", "getSpatialDetectionResult", "()Lcom/veridas/detect/spatial/SpatialDetectionResult;", "setSpatialDetectionResult", "(Lcom/veridas/detect/spatial/SpatialDetectionResult;)V", "getWarmup", "setWarmup", "getWarmupComplete", "setWarmupComplete", "value", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSequentialDetectionResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SequentialDetectionResult.kt\ncom/veridas/detect/sequence/SequentialDetectionResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
    public static final /* data */ class Builder {

        @NotNull
        private VDConstantDefinition.AnalysisType analysisType;
        private double fps;

        @Nullable
        private String objectData;
        private boolean objectDetected;
        private boolean objectLost;
        private double progress;

        @NotNull
        private VDConstantDefinition.TemplateProximity proximity;

        @Nullable
        private Request request;

        @Nullable
        private SpatialDetectionResult spatialDetectionResult;
        private boolean warmup;
        private boolean warmupComplete;

        public Builder() {
            this(null, 0.0d, null, false, false, 0.0d, null, null, null, false, false, 2047, null);
        }

        @NotNull
        public final Builder analysisType(@NotNull VDConstantDefinition.AnalysisType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.analysisType = value;
            return this;
        }

        @NotNull
        public final SequentialDetectionResult build() {
            String str = this.objectData;
            Request request = this.request;
            SpatialDetectionResult spatialDetectionResult = this.spatialDetectionResult;
            if (str == null) {
                throw new IllegalArgumentException("The object data parameter can't be null.".toString());
            }
            if (request == null) {
                throw new IllegalArgumentException("The request parameter can't be null.".toString());
            }
            if (spatialDetectionResult != null) {
                return new SequentialDetectionResult(this.analysisType, this.fps, str, this.objectDetected, this.objectLost, this.progress, this.proximity, request, spatialDetectionResult, this.warmup, this.warmupComplete, null);
            }
            throw new IllegalArgumentException("The spatial detection result parameter can't be null.".toString());
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VDConstantDefinition.AnalysisType getAnalysisType() {
            return this.analysisType;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final boolean getWarmup() {
            return this.warmup;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final boolean getWarmupComplete() {
            return this.warmupComplete;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getFps() {
            return this.fps;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getObjectData() {
            return this.objectData;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getObjectDetected() {
            return this.objectDetected;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getObjectLost() {
            return this.objectLost;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final double getProgress() {
            return this.progress;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final VDConstantDefinition.TemplateProximity getProximity() {
            return this.proximity;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final SpatialDetectionResult getSpatialDetectionResult() {
            return this.spatialDetectionResult;
        }

        @NotNull
        public final Builder copy(@NotNull VDConstantDefinition.AnalysisType analysisType, double fps, @Nullable String objectData, boolean objectDetected, boolean objectLost, double progress, @NotNull VDConstantDefinition.TemplateProximity proximity, @Nullable Request request, @Nullable SpatialDetectionResult spatialDetectionResult, boolean warmup, boolean warmupComplete) {
            Intrinsics.checkNotNullParameter(analysisType, "analysisType");
            Intrinsics.checkNotNullParameter(proximity, "proximity");
            return new Builder(analysisType, fps, objectData, objectDetected, objectLost, progress, proximity, request, spatialDetectionResult, warmup, warmupComplete);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return this.analysisType == builder.analysisType && Double.compare(this.fps, builder.fps) == 0 && Intrinsics.areEqual(this.objectData, builder.objectData) && this.objectDetected == builder.objectDetected && this.objectLost == builder.objectLost && Double.compare(this.progress, builder.progress) == 0 && this.proximity == builder.proximity && Intrinsics.areEqual(this.request, builder.request) && Intrinsics.areEqual(this.spatialDetectionResult, builder.spatialDetectionResult) && this.warmup == builder.warmup && this.warmupComplete == builder.warmupComplete;
        }

        @NotNull
        public final Builder fps(double value) {
            this.fps = value;
            return this;
        }

        @NotNull
        public final VDConstantDefinition.AnalysisType getAnalysisType() {
            return this.analysisType;
        }

        public final double getFps() {
            return this.fps;
        }

        @Nullable
        public final String getObjectData() {
            return this.objectData;
        }

        public final boolean getObjectDetected() {
            return this.objectDetected;
        }

        public final boolean getObjectLost() {
            return this.objectLost;
        }

        public final double getProgress() {
            return this.progress;
        }

        @NotNull
        public final VDConstantDefinition.TemplateProximity getProximity() {
            return this.proximity;
        }

        @Nullable
        public final Request getRequest() {
            return this.request;
        }

        @Nullable
        public final SpatialDetectionResult getSpatialDetectionResult() {
            return this.spatialDetectionResult;
        }

        public final boolean getWarmup() {
            return this.warmup;
        }

        public final boolean getWarmupComplete() {
            return this.warmupComplete;
        }

        public int hashCode() {
            int iHashCode = this.analysisType.hashCode() * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.fps);
            int i10 = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            String str = this.objectData;
            int iHashCode2 = (((i10 + (str == null ? 0 : str.hashCode())) * 31) + (this.objectDetected ? 1231 : 1237)) * 31;
            int i11 = this.objectLost ? 1231 : 1237;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.progress);
            int iHashCode3 = (this.proximity.hashCode() + ((((iHashCode2 + i11) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31;
            Request request = this.request;
            int iHashCode4 = (iHashCode3 + (request == null ? 0 : request.hashCode())) * 31;
            SpatialDetectionResult spatialDetectionResult = this.spatialDetectionResult;
            return ((((iHashCode4 + (spatialDetectionResult != null ? spatialDetectionResult.hashCode() : 0)) * 31) + (this.warmup ? 1231 : 1237)) * 31) + (this.warmupComplete ? 1231 : 1237);
        }

        @NotNull
        public final Builder objectData(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.objectData = value;
            return this;
        }

        @NotNull
        public final Builder objectDetected(boolean value) {
            this.objectDetected = value;
            return this;
        }

        @NotNull
        public final Builder objectLost(boolean value) {
            this.objectLost = value;
            return this;
        }

        @NotNull
        public final Builder progress(double value) {
            this.progress = value;
            return this;
        }

        @NotNull
        public final Builder proximity(@NotNull VDConstantDefinition.TemplateProximity value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.proximity = value;
            return this;
        }

        @NotNull
        public final Builder request(@NotNull Request value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.request = value;
            return this;
        }

        public final void setAnalysisType(@NotNull VDConstantDefinition.AnalysisType analysisType) {
            Intrinsics.checkNotNullParameter(analysisType, "<set-?>");
            this.analysisType = analysisType;
        }

        public final void setFps(double d2) {
            this.fps = d2;
        }

        public final void setObjectData(@Nullable String str) {
            this.objectData = str;
        }

        public final void setObjectDetected(boolean z10) {
            this.objectDetected = z10;
        }

        public final void setObjectLost(boolean z10) {
            this.objectLost = z10;
        }

        public final void setProgress(double d2) {
            this.progress = d2;
        }

        public final void setProximity(@NotNull VDConstantDefinition.TemplateProximity templateProximity) {
            Intrinsics.checkNotNullParameter(templateProximity, "<set-?>");
            this.proximity = templateProximity;
        }

        public final void setRequest(@Nullable Request request) {
            this.request = request;
        }

        public final void setSpatialDetectionResult(@Nullable SpatialDetectionResult spatialDetectionResult) {
            this.spatialDetectionResult = spatialDetectionResult;
        }

        public final void setWarmup(boolean z10) {
            this.warmup = z10;
        }

        public final void setWarmupComplete(boolean z10) {
            this.warmupComplete = z10;
        }

        @NotNull
        public final Builder spatialDetectionResult(@Nullable SpatialDetectionResult value) {
            this.spatialDetectionResult = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(analysisType=" + this.analysisType + ", fps=" + this.fps + ", objectData=" + this.objectData + ", objectDetected=" + this.objectDetected + ", objectLost=" + this.objectLost + ", progress=" + this.progress + ", proximity=" + this.proximity + ", request=" + this.request + ", spatialDetectionResult=" + this.spatialDetectionResult + ", warmup=" + this.warmup + ", warmupComplete=" + this.warmupComplete + ")";
        }

        @NotNull
        public final Builder warmup(boolean value) {
            this.warmup = value;
            return this;
        }

        @NotNull
        public final Builder warmupComplete(boolean value) {
            this.warmupComplete = value;
            return this;
        }

        public Builder(@NotNull VDConstantDefinition.AnalysisType analysisType, double d2, @Nullable String str, boolean z10, boolean z11, double d3, @NotNull VDConstantDefinition.TemplateProximity proximity, @Nullable Request request, @Nullable SpatialDetectionResult spatialDetectionResult, boolean z12, boolean z13) {
            Intrinsics.checkNotNullParameter(analysisType, "analysisType");
            Intrinsics.checkNotNullParameter(proximity, "proximity");
            this.analysisType = analysisType;
            this.fps = d2;
            this.objectData = str;
            this.objectDetected = z10;
            this.objectLost = z11;
            this.progress = d3;
            this.proximity = proximity;
            this.request = request;
            this.spatialDetectionResult = spatialDetectionResult;
            this.warmup = z12;
            this.warmupComplete = z13;
        }

        public /* synthetic */ Builder(VDConstantDefinition.AnalysisType analysisType, double d2, String str, boolean z10, boolean z11, double d3, VDConstantDefinition.TemplateProximity templateProximity, Request request, SpatialDetectionResult spatialDetectionResult, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? VDConstantDefinition.AnalysisType.NONE : analysisType, (i10 & 2) != 0 ? 0.0d : d2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) == 0 ? d3 : 0.0d, (i10 & 64) != 0 ? VDConstantDefinition.TemplateProximity.NOT_FOUND : templateProximity, (i10 & 128) != 0 ? null : request, (i10 & 256) == 0 ? spatialDetectionResult : null, (i10 & 512) != 0 ? false : z12, (i10 & 1024) == 0 ? z13 : false);
        }
    }

    public /* synthetic */ SequentialDetectionResult(VDConstantDefinition.AnalysisType analysisType, double d2, String str, boolean z10, boolean z11, double d3, VDConstantDefinition.TemplateProximity templateProximity, Request request, SpatialDetectionResult spatialDetectionResult, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(analysisType, d2, str, z10, z11, d3, templateProximity, request, spatialDetectionResult, z12, z13);
    }

    @NotNull
    public final VDConstantDefinition.AnalysisType getAnalysisType() {
        return this.analysisType;
    }

    public final double getFps() {
        return this.fps;
    }

    @NotNull
    public final String getObjectData() {
        return this.objectData;
    }

    public final boolean getObjectDetected() {
        return this.objectDetected;
    }

    public final boolean getObjectLost() {
        return this.objectLost;
    }

    public final double getProgress() {
        return this.progress;
    }

    @NotNull
    public final VDConstantDefinition.TemplateProximity getProximity() {
        return this.proximity;
    }

    @NotNull
    public final Request getRequest() {
        return this.request;
    }

    @NotNull
    public final SpatialDetectionResult getSpatialDetectionResult() {
        return this.spatialDetectionResult;
    }

    public final boolean getWarmup() {
        return this.warmup;
    }

    public final boolean getWarmupComplete() {
        return this.warmupComplete;
    }

    private SequentialDetectionResult(VDConstantDefinition.AnalysisType analysisType, double d2, String str, boolean z10, boolean z11, double d3, VDConstantDefinition.TemplateProximity templateProximity, Request request, SpatialDetectionResult spatialDetectionResult, boolean z12, boolean z13) {
        this.analysisType = analysisType;
        this.fps = d2;
        this.objectData = str;
        this.objectDetected = z10;
        this.objectLost = z11;
        this.progress = d3;
        this.proximity = templateProximity;
        this.request = request;
        this.spatialDetectionResult = spatialDetectionResult;
        this.warmup = z12;
        this.warmupComplete = z13;
    }
}
