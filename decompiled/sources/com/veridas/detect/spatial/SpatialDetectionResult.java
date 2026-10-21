package com.veridas.detect.spatial;

import androidx.annotation.Keep;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.measurement.internal.a;
import com.veridas.detect.ImageAnalysis;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.bridge.IntermediateDetectionResult;
import com.veridas.math.geometry.Rectangle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpatialDetectionResult.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002+,Bk\b\u0002\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"¨\u0006-"}, d2 = {"Lcom/veridas/detect/spatial/SpatialDetectionResult;", "", "cameraFlashes", "", "Lcom/veridas/math/geometry/Rectangle;", "candidate", "candidates", "geometricAnalysis", "Lcom/veridas/detect/spatial/GeometricAnalysis;", "lightBlobs", "outOfFocusValue", "", "overExposureValue", "request", "Lcom/veridas/detect/Request;", "underExposureValue", "(Ljava/util/List;Lcom/veridas/math/geometry/Rectangle;Ljava/util/List;Lcom/veridas/detect/spatial/GeometricAnalysis;Ljava/util/List;DDLcom/veridas/detect/Request;D)V", "cameraFlashDetected", "", "getCameraFlashDetected", "()Z", "getCameraFlashes", "()Ljava/util/List;", "getCandidate", "()Lcom/veridas/math/geometry/Rectangle;", "getCandidates", "getGeometricAnalysis", "()Lcom/veridas/detect/spatial/GeometricAnalysis;", "lightBlobDetected", "getLightBlobDetected", "getLightBlobs", "outOfFocus", "getOutOfFocus", "getOutOfFocusValue", "()D", "overExposed", "getOverExposed", "getOverExposureValue", "getRequest", "()Lcom/veridas/detect/Request;", "underExposed", "getUnderExposed", "getUnderExposureValue", "Builder", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SpatialDetectionResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean cameraFlashDetected;

    @NotNull
    private final List<Rectangle> cameraFlashes;

    @NotNull
    private final Rectangle candidate;

    @NotNull
    private final List<Rectangle> candidates;

    @NotNull
    private final GeometricAnalysis geometricAnalysis;
    private final boolean lightBlobDetected;

    @NotNull
    private final List<Rectangle> lightBlobs;
    private final boolean outOfFocus;
    private final double outOfFocusValue;
    private final boolean overExposed;
    private final double overExposureValue;

    @NotNull
    private final Request request;
    private final boolean underExposed;
    private final double underExposureValue;

    /* JADX INFO: compiled from: SpatialDetectionResult.kt */
    @Keep
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0002\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÂ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÂ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÂ\u0003J{\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\t\u0010!\u001a\u00020\"HÖ\u0001J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000eJ\t\u0010%\u001a\u00020&HÖ\u0001J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/veridas/detect/spatial/SpatialDetectionResult$Builder;", "", "cameraFlashes", "", "Lcom/veridas/math/geometry/Rectangle;", "candidate", "candidates", "geometricAnalysis", "Lcom/veridas/detect/spatial/GeometricAnalysis;", "lightBlobs", "overExposureValue", "", "outOfFocusValue", "request", "Lcom/veridas/detect/Request;", "underExposureValue", "(Ljava/util/List;Lcom/veridas/math/geometry/Rectangle;Ljava/util/List;Lcom/veridas/detect/spatial/GeometricAnalysis;Ljava/util/List;DDLcom/veridas/detect/Request;D)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "value", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "intermediateDetectionResult", "Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;", "toString", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Builder {

        @NotNull
        private List<Rectangle> cameraFlashes;

        @Nullable
        private Rectangle candidate;

        @NotNull
        private List<Rectangle> candidates;

        @Nullable
        private GeometricAnalysis geometricAnalysis;

        @NotNull
        private List<Rectangle> lightBlobs;
        private double outOfFocusValue;
        private double overExposureValue;

        @Nullable
        private Request request;
        private double underExposureValue;

        public Builder() {
            this(null, null, null, null, null, 0.0d, 0.0d, null, 0.0d, 511, null);
        }

        private final List<Rectangle> component1() {
            return this.cameraFlashes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final Rectangle getCandidate() {
            return this.candidate;
        }

        private final List<Rectangle> component3() {
            return this.candidates;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        private final GeometricAnalysis getGeometricAnalysis() {
            return this.geometricAnalysis;
        }

        private final List<Rectangle> component5() {
            return this.lightBlobs;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        private final double getOverExposureValue() {
            return this.overExposureValue;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        private final double getOutOfFocusValue() {
            return this.outOfFocusValue;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        private final Request getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        private final double getUnderExposureValue() {
            return this.underExposureValue;
        }

        @NotNull
        public final SpatialDetectionResult build() {
            Rectangle rectangle = this.candidate;
            if (rectangle == null) {
                throw new IllegalArgumentException("The candidate argument is null.".toString());
            }
            GeometricAnalysis geometricAnalysis = this.geometricAnalysis;
            if (geometricAnalysis == null) {
                throw new IllegalArgumentException("The geometric analysis argument is null.".toString());
            }
            Request request = this.request;
            if (request != null) {
                return new SpatialDetectionResult(this.cameraFlashes, rectangle, this.candidates, geometricAnalysis, this.lightBlobs, this.outOfFocusValue, this.overExposureValue, request, this.underExposureValue, null);
            }
            throw new IllegalArgumentException("Can't return result without request.".toString());
        }

        @NotNull
        public final Builder cameraFlashes(@NotNull List<Rectangle> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.cameraFlashes = value;
            return this;
        }

        @NotNull
        public final Builder candidate(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.candidate = value;
            return this;
        }

        @NotNull
        public final Builder candidates(@NotNull List<Rectangle> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.candidates = value;
            return this;
        }

        @NotNull
        public final Builder copy(@NotNull List<Rectangle> cameraFlashes, @Nullable Rectangle candidate, @NotNull List<Rectangle> candidates, @Nullable GeometricAnalysis geometricAnalysis, @NotNull List<Rectangle> lightBlobs, double overExposureValue, double outOfFocusValue, @Nullable Request request, double underExposureValue) {
            Intrinsics.checkNotNullParameter(cameraFlashes, "cameraFlashes");
            Intrinsics.checkNotNullParameter(candidates, "candidates");
            Intrinsics.checkNotNullParameter(lightBlobs, "lightBlobs");
            return new Builder(cameraFlashes, candidate, candidates, geometricAnalysis, lightBlobs, overExposureValue, outOfFocusValue, request, underExposureValue);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.cameraFlashes, builder.cameraFlashes) && Intrinsics.areEqual(this.candidate, builder.candidate) && Intrinsics.areEqual(this.candidates, builder.candidates) && Intrinsics.areEqual(this.geometricAnalysis, builder.geometricAnalysis) && Intrinsics.areEqual(this.lightBlobs, builder.lightBlobs) && Double.compare(this.overExposureValue, builder.overExposureValue) == 0 && Double.compare(this.outOfFocusValue, builder.outOfFocusValue) == 0 && Intrinsics.areEqual(this.request, builder.request) && Double.compare(this.underExposureValue, builder.underExposureValue) == 0;
        }

        @NotNull
        public final Builder geometricAnalysis(@NotNull GeometricAnalysis value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.geometricAnalysis = value;
            return this;
        }

        public int hashCode() {
            int iHashCode = this.cameraFlashes.hashCode() * 31;
            Rectangle rectangle = this.candidate;
            int iA = a.a(this.candidates, (iHashCode + (rectangle == null ? 0 : rectangle.hashCode())) * 31, 31);
            GeometricAnalysis geometricAnalysis = this.geometricAnalysis;
            int iA2 = a.a(this.lightBlobs, (iA + (geometricAnalysis == null ? 0 : geometricAnalysis.hashCode())) * 31, 31);
            long jDoubleToLongBits = Double.doubleToLongBits(this.overExposureValue);
            int i10 = (iA2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.outOfFocusValue);
            int i11 = (i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
            Request request = this.request;
            int iHashCode2 = (i11 + (request != null ? request.hashCode() : 0)) * 31;
            long jDoubleToLongBits3 = Double.doubleToLongBits(this.underExposureValue);
            return iHashCode2 + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3));
        }

        @NotNull
        public final Builder intermediateDetectionResult(@NotNull IntermediateDetectionResult intermediateDetectionResult) {
            Intrinsics.checkNotNullParameter(intermediateDetectionResult, "intermediateDetectionResult");
            this.cameraFlashes = intermediateDetectionResult.getCameraFlashes();
            this.lightBlobs = intermediateDetectionResult.getLightBlobs();
            this.overExposureValue = intermediateDetectionResult.getOverExposureValue();
            this.outOfFocusValue = intermediateDetectionResult.getOutOfFocusValue();
            this.underExposureValue = intermediateDetectionResult.getUnderExposureValue();
            return this;
        }

        @NotNull
        public final Builder lightBlobs(@NotNull List<Rectangle> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.lightBlobs = value;
            return this;
        }

        @NotNull
        public final Builder outOfFocusValue(double value) {
            this.outOfFocusValue = value;
            return this;
        }

        @NotNull
        public final Builder overExposureValue(double value) {
            this.overExposureValue = value;
            return this;
        }

        @NotNull
        public final Builder request(@NotNull Request value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.request = value;
            return this;
        }

        @NotNull
        public String toString() {
            List<Rectangle> list = this.cameraFlashes;
            Rectangle rectangle = this.candidate;
            List<Rectangle> list2 = this.candidates;
            GeometricAnalysis geometricAnalysis = this.geometricAnalysis;
            List<Rectangle> list3 = this.lightBlobs;
            double d2 = this.overExposureValue;
            double d3 = this.outOfFocusValue;
            Request request = this.request;
            double d7 = this.underExposureValue;
            StringBuilder sb2 = new StringBuilder("Builder(cameraFlashes=");
            sb2.append(list);
            sb2.append(", candidate=");
            sb2.append(rectangle);
            sb2.append(", candidates=");
            sb2.append(list2);
            sb2.append(", geometricAnalysis=");
            sb2.append(geometricAnalysis);
            sb2.append(", lightBlobs=");
            sb2.append(list3);
            sb2.append(", overExposureValue=");
            sb2.append(d2);
            v.f(sb2, ", outOfFocusValue=", d3, ", request=");
            sb2.append(request);
            sb2.append(", underExposureValue=");
            sb2.append(d7);
            sb2.append(")");
            return sb2.toString();
        }

        @NotNull
        public final Builder underExposureValue(double value) {
            this.underExposureValue = value;
            return this;
        }

        public Builder(@NotNull List<Rectangle> cameraFlashes, @Nullable Rectangle rectangle, @NotNull List<Rectangle> candidates, @Nullable GeometricAnalysis geometricAnalysis, @NotNull List<Rectangle> lightBlobs, double d2, double d3, @Nullable Request request, double d7) {
            Intrinsics.checkNotNullParameter(cameraFlashes, "cameraFlashes");
            Intrinsics.checkNotNullParameter(candidates, "candidates");
            Intrinsics.checkNotNullParameter(lightBlobs, "lightBlobs");
            this.cameraFlashes = cameraFlashes;
            this.candidate = rectangle;
            this.candidates = candidates;
            this.geometricAnalysis = geometricAnalysis;
            this.lightBlobs = lightBlobs;
            this.overExposureValue = d2;
            this.outOfFocusValue = d3;
            this.request = request;
            this.underExposureValue = d7;
        }

        public /* synthetic */ Builder(List list, Rectangle rectangle, List list2, GeometricAnalysis geometricAnalysis, List list3, double d2, double d3, Request request, double d7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? null : rectangle, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i10 & 8) != 0 ? null : geometricAnalysis, (i10 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i10 & 32) != 0 ? Double.POSITIVE_INFINITY : d2, (i10 & 64) != 0 ? Double.POSITIVE_INFINITY : d3, (i10 & 128) == 0 ? request : null, (i10 & 256) == 0 ? d7 : Double.POSITIVE_INFINITY);
        }
    }

    /* JADX INFO: compiled from: SpatialDetectionResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/spatial/SpatialDetectionResult$Companion;", "", "()V", "createEmptyResult", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "request", "Lcom/veridas/detect/Request;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SpatialDetectionResult createEmptyResult(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new Builder(null, null, null, null, null, 0.0d, 0.0d, null, 0.0d, 511, null).geometricAnalysis(GeometricAnalysis.INSTANCE.getEMPTY()).request(request).candidate(new Rectangle(0, 0, 0, 0)).build();
        }
    }

    public /* synthetic */ SpatialDetectionResult(List list, Rectangle rectangle, List list2, GeometricAnalysis geometricAnalysis, List list3, double d2, double d3, Request request, double d7, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, rectangle, list2, geometricAnalysis, list3, d2, d3, request, d7);
    }

    @JvmStatic
    @NotNull
    public static final SpatialDetectionResult createEmptyResult(@NotNull Request request) {
        return INSTANCE.createEmptyResult(request);
    }

    public final boolean getCameraFlashDetected() {
        return this.cameraFlashDetected;
    }

    @NotNull
    public final List<Rectangle> getCameraFlashes() {
        return this.cameraFlashes;
    }

    @NotNull
    public final Rectangle getCandidate() {
        return this.candidate;
    }

    @NotNull
    public final List<Rectangle> getCandidates() {
        return this.candidates;
    }

    @NotNull
    public final GeometricAnalysis getGeometricAnalysis() {
        return this.geometricAnalysis;
    }

    public final boolean getLightBlobDetected() {
        return this.lightBlobDetected;
    }

    @NotNull
    public final List<Rectangle> getLightBlobs() {
        return this.lightBlobs;
    }

    public final boolean getOutOfFocus() {
        return this.outOfFocus;
    }

    public final double getOutOfFocusValue() {
        return this.outOfFocusValue;
    }

    public final boolean getOverExposed() {
        return this.overExposed;
    }

    public final double getOverExposureValue() {
        return this.overExposureValue;
    }

    @NotNull
    public final Request getRequest() {
        return this.request;
    }

    public final boolean getUnderExposed() {
        return this.underExposed;
    }

    public final double getUnderExposureValue() {
        return this.underExposureValue;
    }

    private SpatialDetectionResult(List<Rectangle> list, Rectangle rectangle, List<Rectangle> list2, GeometricAnalysis geometricAnalysis, List<Rectangle> list3, double d2, double d3, Request request, double d7) {
        this.cameraFlashes = list;
        this.candidate = rectangle;
        this.candidates = list2;
        this.geometricAnalysis = geometricAnalysis;
        this.lightBlobs = list3;
        this.outOfFocusValue = d2;
        this.overExposureValue = d3;
        this.request = request;
        this.underExposureValue = d7;
        ImageAnalysis imageAnalysis = request.getImageAnalysis();
        boolean z10 = false;
        this.underExposed = imageAnalysis.getUnderExposureDetectionEnabled() && d7 < 0.75d;
        this.overExposed = imageAnalysis.getOverExposureDetectionEnabled() && d3 >= 0.6d;
        if (imageAnalysis.getOutOfFocusDetectionEnabled() && d2 < imageAnalysis.getOutOfFocusThreshold()) {
            z10 = true;
        }
        this.outOfFocus = z10;
        this.cameraFlashDetected = !list.isEmpty();
        this.lightBlobDetected = !list3.isEmpty();
    }

    public /* synthetic */ SpatialDetectionResult(List list, Rectangle rectangle, List list2, GeometricAnalysis geometricAnalysis, List list3, double d2, double d3, Request request, double d7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, rectangle, list2, geometricAnalysis, (i10 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i10 & 32) != 0 ? Double.POSITIVE_INFINITY : d2, (i10 & 64) != 0 ? Double.POSITIVE_INFINITY : d3, request, (i10 & 256) != 0 ? Double.POSITIVE_INFINITY : d7);
    }
}
