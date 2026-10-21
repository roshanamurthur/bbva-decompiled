package com.veridas.detect.sequence.document.proximity;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.spatial.GeometricAnalysis;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.math.geometry.Vector2;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DocumentViewportProximity.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", "", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "result", "Lcom/veridas/vdlibraryimageprocessing/VDConstantDefinition$TemplateProximity;", "calculate", "", "a", "D", "getTooCloseScale", "()D", "tooCloseScale", "b", "getTooFarScale", "setTooFarScale", "(D)V", "tooFarScale", "Lcom/veridas/math/geometry/Vector2;", "c", "Lcom/veridas/math/geometry/Vector2;", "getCenterMax", "()Lcom/veridas/math/geometry/Vector2;", "centerMax", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class DocumentViewportProximity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double tooCloseScale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public double tooFarScale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Vector2 centerMax;

    /* JADX INFO: compiled from: DocumentViewportProximity.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\tJ\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity$Builder;", "", "", "tooCloseScale", "tooFarScale", "Lcom/veridas/math/geometry/Vector2;", "centerMax", "x", "y", "Lcom/veridas/detect/sequence/document/proximity/DocumentViewportProximity;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "component1", "component2", "component3", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "D", "getTooCloseScale", "()D", "setTooCloseScale", "(D)V", "b", "getTooFarScale", "setTooFarScale", "c", "Lcom/veridas/math/geometry/Vector2;", "getCenterMax", "()Lcom/veridas/math/geometry/Vector2;", "setCenterMax", "(Lcom/veridas/math/geometry/Vector2;)V", "<init>", "(DDLcom/veridas/math/geometry/Vector2;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nDocumentViewportProximity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentViewportProximity.kt\ncom/veridas/detect/sequence/document/proximity/DocumentViewportProximity$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public double tooCloseScale;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public double tooFarScale;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Vector2 centerMax;

        public Builder() {
            this(0.0d, 0.0d, null, 7, null);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, double d2, double d3, Vector2 vector2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d2 = builder.tooCloseScale;
            }
            double d7 = d2;
            if ((i10 & 2) != 0) {
                d3 = builder.tooFarScale;
            }
            double d10 = d3;
            if ((i10 & 4) != 0) {
                vector2 = builder.centerMax;
            }
            return builder.copy(d7, d10, vector2);
        }

        @NotNull
        public final DocumentViewportProximity build() {
            return new DocumentViewportProximity(this.tooCloseScale, this.tooFarScale, this.centerMax, null);
        }

        @NotNull
        public final Builder centerMax(@NotNull Vector2 centerMax) {
            Intrinsics.checkNotNullParameter(centerMax, "centerMax");
            this.centerMax = centerMax;
            return this;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getTooCloseScale() {
            return this.tooCloseScale;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getTooFarScale() {
            return this.tooFarScale;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Vector2 getCenterMax() {
            return this.centerMax;
        }

        @NotNull
        public final Builder copy(double tooCloseScale, double tooFarScale, @NotNull Vector2 centerMax) {
            Intrinsics.checkNotNullParameter(centerMax, "centerMax");
            return new Builder(tooCloseScale, tooFarScale, centerMax);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Double.compare(this.tooCloseScale, builder.tooCloseScale) == 0 && Double.compare(this.tooFarScale, builder.tooFarScale) == 0 && Intrinsics.areEqual(this.centerMax, builder.centerMax);
        }

        @NotNull
        public final Vector2 getCenterMax() {
            return this.centerMax;
        }

        public final double getTooCloseScale() {
            return this.tooCloseScale;
        }

        public final double getTooFarScale() {
            return this.tooFarScale;
        }

        public int hashCode() {
            long jDoubleToLongBits = Double.doubleToLongBits(this.tooCloseScale);
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.tooFarScale);
            return this.centerMax.hashCode() + (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31);
        }

        public final void setCenterMax(@NotNull Vector2 vector2) {
            Intrinsics.checkNotNullParameter(vector2, "<set-?>");
            this.centerMax = vector2;
        }

        public final void setTooCloseScale(double d2) {
            this.tooCloseScale = d2;
        }

        public final void setTooFarScale(double d2) {
            this.tooFarScale = d2;
        }

        @NotNull
        public String toString() {
            return "Builder(tooCloseScale=" + this.tooCloseScale + ", tooFarScale=" + this.tooFarScale + ", centerMax=" + this.centerMax + ")";
        }

        @NotNull
        public final Builder tooCloseScale(double tooCloseScale) {
            this.tooCloseScale = tooCloseScale;
            return this;
        }

        @NotNull
        public final Builder tooFarScale(double tooFarScale) {
            this.tooFarScale = tooFarScale;
            return this;
        }

        public Builder(double d2, double d3, @NotNull Vector2 centerMax) {
            Intrinsics.checkNotNullParameter(centerMax, "centerMax");
            this.tooCloseScale = d2;
            this.tooFarScale = d3;
            this.centerMax = centerMax;
        }

        @NotNull
        public final Builder centerMax(double x4, double y7) {
            centerMax(new Vector2(x4, y7));
            return this;
        }

        public /* synthetic */ Builder(double d2, double d3, Vector2 vector2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 1.15d : d2, (i10 & 2) != 0 ? 0.8d : d3, (i10 & 4) != 0 ? new Vector2(0.085d, 0.055d) : vector2);
        }
    }

    public DocumentViewportProximity(double d2, double d3, Vector2 vector2, DefaultConstructorMarker defaultConstructorMarker) {
        this.tooCloseScale = d2;
        this.tooFarScale = d3;
        this.centerMax = vector2;
    }

    @NotNull
    public final VDConstantDefinition.TemplateProximity calculate(@NotNull SpatialDetectionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getCandidate().isEmpty()) {
            return VDConstantDefinition.TemplateProximity.NOT_FOUND;
        }
        GeometricAnalysis geometricAnalysis = result.getGeometricAnalysis();
        double relativeAreaDelta = geometricAnalysis.getRelativeAreaDelta();
        double relativeDistanceToFocusPoint1D = geometricAnalysis.getRelativeDistanceToFocusPoint1D();
        if (relativeAreaDelta >= this.tooCloseScale) {
            return VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE;
        }
        if (relativeAreaDelta <= this.tooFarScale) {
            return VDConstantDefinition.TemplateProximity.EXTREMELY_FAR;
        }
        return relativeDistanceToFocusPoint1D < this.centerMax.magnitude() ? VDConstantDefinition.TemplateProximity.CENTERED : VDConstantDefinition.TemplateProximity.ERROR;
    }

    @NotNull
    public final Vector2 getCenterMax() {
        return this.centerMax;
    }

    public final double getTooCloseScale() {
        return this.tooCloseScale;
    }

    public final double getTooFarScale() {
        return this.tooFarScale;
    }

    public final void setTooFarScale(double d2) {
        this.tooFarScale = d2;
    }
}
