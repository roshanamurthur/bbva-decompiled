package com.veridas.detect.spatial.bridge;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import bk.g;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.InitializeDetectorException;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.GeometricAnalysisBuilder;
import com.veridas.detect.spatial.ReferenceObjectGeometricAnalysisBuilder;
import com.veridas.math.geometry.Vector2;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CascadeSpatialObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001c\u001eJ4\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0094 ¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0094 ¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0094 ¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector;", "Lcom/veridas/detect/spatial/bridge/AbstractSpatialObjectDetector;", "", "reference", "", "", "classTypes", "memberNames", "bridgeFinish", "(J[Ljava/lang/String;[Ljava/lang/String;)J", "bridgeInitialize", "([Ljava/lang/String;[Ljava/lang/String;)J", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;", "result", "", "bridgeRequest", "([Ljava/lang/String;[Ljava/lang/String;JLcom/veridas/detect/Request;Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;)V", "", "initialize", "Lcom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector$Configuration;", "configuration", "Lcom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector$Configuration;", "getConfiguration", "()Lcom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector$Configuration;", "setConfiguration", "(Lcom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector$Configuration;)V", "Companion", "Builder", "Configuration", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCascadeSpatialObjectDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CascadeSpatialObjectDetector.kt\ncom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,213:1\n37#2,2:214\n37#2,2:216\n13309#3,2:218\n*S KotlinDebug\n*F\n+ 1 CascadeSpatialObjectDetector.kt\ncom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector\n*L\n104#1:214,2\n105#1:216,2\n41#1:218,2\n*E\n"})
public final class CascadeSpatialObjectDetector extends AbstractSpatialObjectDetector {

    @Keep
    @NotNull
    private Configuration configuration;

    /* JADX INFO: compiled from: CascadeSpatialObjectDetector.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\b\u0002\u0010\u000b\u001a\u00060\bj\u0002`\t\u0012\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\n\u001a\u00020\u00002\n\u0010\n\u001a\u00060\bj\u0002`\tJ\u0012\u0010\u000b\u001a\u00020\u00002\n\u0010\u000b\u001a\u00060\bj\u0002`\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0012Jw\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\b\u0002\u0010\u000b\u001a\u00060\bj\u0002`\t2\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u001c"}, d2 = {"Lcom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector$Builder;", "", "", "cascadeFile", "", "heightTransformationFactor", "Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;", "geometricAnalysisBuilder", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "maxDimensionFactor", "minDimensionFactor", "", "neighbors", ImageScaleTypeHandler.ID, "widthTransformationFactor", "xTransformationFactor", "yTransformationFactor", "Lcom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;Lcom/veridas/math/geometry/Vector2;Lcom/veridas/math/geometry/Vector2;DILjava/lang/String;DDDD)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public GeometricAnalysisBuilder f67012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public Vector2 f67013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public Vector2 f67014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f67015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f67016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f67017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f67018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f67019h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f67020i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f67021j;

        public Builder() {
            this(null, null, null, 0.0d, 0, null, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null);
        }

        @NotNull
        public final CascadeSpatialObjectDetector build() {
            String str = this.f67017f;
            if (str == null) {
                throw new IllegalArgumentException("The Cascade File parameter can't be null.".toString());
            }
            return new CascadeSpatialObjectDetector(this.f67012a, new Configuration(this.f67013b, this.f67014c, this.f67015d, this.f67016e, str, this.f67018g, this.f67019h, this.f67020i, this.f67021j), null);
        }

        @NotNull
        public final Builder cascadeFile(@Nullable String cascadeFile) {
            this.f67017f = cascadeFile;
            return this;
        }

        @NotNull
        public final Builder copy(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder, @NotNull Vector2 minDimensionFactor, @NotNull Vector2 maxDimensionFactor, double scale, int neighbors, @Nullable String cascadeFile, double xTransformationFactor, double yTransformationFactor, double widthTransformationFactor, double heightTransformationFactor) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            Intrinsics.checkNotNullParameter(minDimensionFactor, "minDimensionFactor");
            Intrinsics.checkNotNullParameter(maxDimensionFactor, "maxDimensionFactor");
            return new Builder(geometricAnalysisBuilder, minDimensionFactor, maxDimensionFactor, scale, neighbors, cascadeFile, xTransformationFactor, yTransformationFactor, widthTransformationFactor, heightTransformationFactor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.f67012a, builder.f67012a) && Intrinsics.areEqual(this.f67013b, builder.f67013b) && Intrinsics.areEqual(this.f67014c, builder.f67014c) && Double.compare(this.f67015d, builder.f67015d) == 0 && this.f67016e == builder.f67016e && Intrinsics.areEqual(this.f67017f, builder.f67017f) && Double.compare(this.f67018g, builder.f67018g) == 0 && Double.compare(this.f67019h, builder.f67019h) == 0 && Double.compare(this.f67020i, builder.f67020i) == 0 && Double.compare(this.f67021j, builder.f67021j) == 0;
        }

        @NotNull
        public final Builder geometricAnalysisBuilder(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            this.f67012a = geometricAnalysisBuilder;
            return this;
        }

        public int hashCode() {
            int iHashCode = (this.f67014c.hashCode() + ((this.f67013b.hashCode() + (this.f67012a.hashCode() * 31)) * 31)) * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.f67015d);
            int i10 = (((iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + this.f67016e) * 31;
            String str = this.f67017f;
            int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.f67018g);
            int i11 = (iHashCode2 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
            long jDoubleToLongBits3 = Double.doubleToLongBits(this.f67019h);
            int i12 = (i11 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
            long jDoubleToLongBits4 = Double.doubleToLongBits(this.f67020i);
            int i13 = (i12 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
            long jDoubleToLongBits5 = Double.doubleToLongBits(this.f67021j);
            return i13 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        }

        @NotNull
        public final Builder heightTransformationFactor(double heightTransformationFactor) {
            this.f67021j = heightTransformationFactor;
            return this;
        }

        @NotNull
        public final Builder maxDimensionFactor(@NotNull Vector2 maxDimensionFactor) {
            Intrinsics.checkNotNullParameter(maxDimensionFactor, "maxDimensionFactor");
            this.f67014c = maxDimensionFactor;
            return this;
        }

        @NotNull
        public final Builder minDimensionFactor(@NotNull Vector2 minDimensionFactor) {
            Intrinsics.checkNotNullParameter(minDimensionFactor, "minDimensionFactor");
            this.f67013b = minDimensionFactor;
            return this;
        }

        @NotNull
        public final Builder neighbors(int neighbors) {
            this.f67016e = neighbors;
            return this;
        }

        @NotNull
        public final Builder scale(double scale) {
            this.f67015d = scale;
            return this;
        }

        @NotNull
        public String toString() {
            GeometricAnalysisBuilder geometricAnalysisBuilder = this.f67012a;
            Vector2 vector2 = this.f67013b;
            Vector2 vector3 = this.f67014c;
            double d2 = this.f67015d;
            int i10 = this.f67016e;
            String str = this.f67017f;
            double d3 = this.f67018g;
            double d7 = this.f67019h;
            double d10 = this.f67020i;
            double d11 = this.f67021j;
            StringBuilder sb2 = new StringBuilder("Builder(geometricAnalysisBuilder=");
            sb2.append(geometricAnalysisBuilder);
            sb2.append(", minDimensionFactor=");
            sb2.append(vector2);
            sb2.append(", maxDimensionFactor=");
            sb2.append(vector3);
            sb2.append(", scale=");
            sb2.append(d2);
            sb2.append(", neighbors=");
            sb2.append(i10);
            sb2.append(", cascadeFile=");
            sb2.append(str);
            v.f(sb2, ", xTransformationFactor=", d3, ", yTransformationFactor=");
            sb2.append(d7);
            v.f(sb2, ", widthTransformationFactor=", d10, ", heightTransformationFactor=");
            sb2.append(d11);
            sb2.append(")");
            return sb2.toString();
        }

        @NotNull
        public final Builder widthTransformationFactor(double widthTransformationFactor) {
            this.f67020i = widthTransformationFactor;
            return this;
        }

        @NotNull
        public final Builder xTransformationFactor(double xTransformationFactor) {
            this.f67018g = xTransformationFactor;
            return this;
        }

        @NotNull
        public final Builder yTransformationFactor(double yTransformationFactor) {
            this.f67019h = yTransformationFactor;
            return this;
        }

        public Builder(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder, @NotNull Vector2 minDimensionFactor, @NotNull Vector2 maxDimensionFactor, double d2, int i10, @Nullable String str, double d3, double d7, double d10, double d11) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            Intrinsics.checkNotNullParameter(minDimensionFactor, "minDimensionFactor");
            Intrinsics.checkNotNullParameter(maxDimensionFactor, "maxDimensionFactor");
            this.f67012a = geometricAnalysisBuilder;
            this.f67013b = minDimensionFactor;
            this.f67014c = maxDimensionFactor;
            this.f67015d = d2;
            this.f67016e = i10;
            this.f67017f = str;
            this.f67018g = d3;
            this.f67019h = d7;
            this.f67020i = d10;
            this.f67021j = d11;
        }

        public /* synthetic */ Builder(GeometricAnalysisBuilder geometricAnalysisBuilder, Vector2 vector2, Vector2 vector3, double d2, int i10, String str, double d3, double d7, double d10, double d11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ReferenceObjectGeometricAnalysisBuilder() : geometricAnalysisBuilder, (i11 & 2) != 0 ? new Vector2(5, 5) : vector2, (i11 & 4) != 0 ? new Vector2(1.5d, 1.5d) : vector3, (i11 & 8) != 0 ? 1.1d : d2, (i11 & 16) != 0 ? 2 : i10, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? 0.0d : d3, (i11 & 128) == 0 ? d7 : 0.0d, (i11 & 256) != 0 ? 1.0d : d10, (i11 & 512) == 0 ? d11 : 1.0d);
        }
    }

    /* JADX INFO: compiled from: CascadeSpatialObjectDetector.kt */
    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010J\r\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\u001f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003Jk\u0010'\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006-"}, d2 = {"Lcom/veridas/detect/spatial/bridge/CascadeSpatialObjectDetector$Configuration;", "", "minDimensionFactor", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "maxDimensionFactor", ImageScaleTypeHandler.ID, "", "neighbors", "", "cascadeFile", "", "xTransformationFactor", "yTransformationFactor", "widthTransformationFactor", "heightTransformationFactor", "(Lcom/veridas/math/geometry/Vector2;Lcom/veridas/math/geometry/Vector2;DILjava/lang/String;DDDD)V", "getCascadeFile", "()Ljava/lang/String;", "getHeightTransformationFactor", "()D", "getMaxDimensionFactor", "()Lcom/veridas/math/geometry/Vector2;", "getMinDimensionFactor", "getNeighbors", "()I", "getScale", "getWidthTransformationFactor", "getXTransformationFactor", "getYTransformationFactor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Configuration {

        @NotNull
        private final String cascadeFile;
        private final double heightTransformationFactor;

        @NotNull
        private final Vector2 maxDimensionFactor;

        @NotNull
        private final Vector2 minDimensionFactor;
        private final int neighbors;
        private final double scale;
        private final double widthTransformationFactor;
        private final double xTransformationFactor;
        private final double yTransformationFactor;

        public Configuration(@NotNull Vector2 minDimensionFactor, @NotNull Vector2 maxDimensionFactor, double d2, int i10, @NotNull String cascadeFile, double d3, double d7, double d10, double d11) {
            Intrinsics.checkNotNullParameter(minDimensionFactor, "minDimensionFactor");
            Intrinsics.checkNotNullParameter(maxDimensionFactor, "maxDimensionFactor");
            Intrinsics.checkNotNullParameter(cascadeFile, "cascadeFile");
            this.minDimensionFactor = minDimensionFactor;
            this.maxDimensionFactor = maxDimensionFactor;
            this.scale = d2;
            this.neighbors = i10;
            this.cascadeFile = cascadeFile;
            this.xTransformationFactor = d3;
            this.yTransformationFactor = d7;
            this.widthTransformationFactor = d10;
            this.heightTransformationFactor = d11;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Vector2 getMinDimensionFactor() {
            return this.minDimensionFactor;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Vector2 getMaxDimensionFactor() {
            return this.maxDimensionFactor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final double getScale() {
            return this.scale;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getNeighbors() {
            return this.neighbors;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCascadeFile() {
            return this.cascadeFile;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final double getXTransformationFactor() {
            return this.xTransformationFactor;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final double getYTransformationFactor() {
            return this.yTransformationFactor;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final double getWidthTransformationFactor() {
            return this.widthTransformationFactor;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final double getHeightTransformationFactor() {
            return this.heightTransformationFactor;
        }

        @NotNull
        public final Configuration copy(@NotNull Vector2 minDimensionFactor, @NotNull Vector2 maxDimensionFactor, double scale, int neighbors, @NotNull String cascadeFile, double xTransformationFactor, double yTransformationFactor, double widthTransformationFactor, double heightTransformationFactor) {
            Intrinsics.checkNotNullParameter(minDimensionFactor, "minDimensionFactor");
            Intrinsics.checkNotNullParameter(maxDimensionFactor, "maxDimensionFactor");
            Intrinsics.checkNotNullParameter(cascadeFile, "cascadeFile");
            return new Configuration(minDimensionFactor, maxDimensionFactor, scale, neighbors, cascadeFile, xTransformationFactor, yTransformationFactor, widthTransformationFactor, heightTransformationFactor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return Intrinsics.areEqual(this.minDimensionFactor, configuration.minDimensionFactor) && Intrinsics.areEqual(this.maxDimensionFactor, configuration.maxDimensionFactor) && Double.compare(this.scale, configuration.scale) == 0 && this.neighbors == configuration.neighbors && Intrinsics.areEqual(this.cascadeFile, configuration.cascadeFile) && Double.compare(this.xTransformationFactor, configuration.xTransformationFactor) == 0 && Double.compare(this.yTransformationFactor, configuration.yTransformationFactor) == 0 && Double.compare(this.widthTransformationFactor, configuration.widthTransformationFactor) == 0 && Double.compare(this.heightTransformationFactor, configuration.heightTransformationFactor) == 0;
        }

        @NotNull
        public final String getCascadeFile() {
            return this.cascadeFile;
        }

        public final double getHeightTransformationFactor() {
            return this.heightTransformationFactor;
        }

        @NotNull
        public final Vector2 getMaxDimensionFactor() {
            return this.maxDimensionFactor;
        }

        @NotNull
        public final Vector2 getMinDimensionFactor() {
            return this.minDimensionFactor;
        }

        public final int getNeighbors() {
            return this.neighbors;
        }

        public final double getScale() {
            return this.scale;
        }

        public final double getWidthTransformationFactor() {
            return this.widthTransformationFactor;
        }

        public final double getXTransformationFactor() {
            return this.xTransformationFactor;
        }

        public final double getYTransformationFactor() {
            return this.yTransformationFactor;
        }

        public int hashCode() {
            int iHashCode = (this.maxDimensionFactor.hashCode() + (this.minDimensionFactor.hashCode() * 31)) * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.scale);
            int iC = n1.c(this.cascadeFile, (((iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + this.neighbors) * 31, 31);
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.xTransformationFactor);
            int i10 = (iC + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
            long jDoubleToLongBits3 = Double.doubleToLongBits(this.yTransformationFactor);
            int i11 = (i10 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
            long jDoubleToLongBits4 = Double.doubleToLongBits(this.widthTransformationFactor);
            int i12 = (i11 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
            long jDoubleToLongBits5 = Double.doubleToLongBits(this.heightTransformationFactor);
            return i12 + ((int) ((jDoubleToLongBits5 >>> 32) ^ jDoubleToLongBits5));
        }

        @NotNull
        public String toString() {
            Vector2 vector2 = this.minDimensionFactor;
            Vector2 vector3 = this.maxDimensionFactor;
            double d2 = this.scale;
            int i10 = this.neighbors;
            String str = this.cascadeFile;
            double d3 = this.xTransformationFactor;
            double d7 = this.yTransformationFactor;
            double d10 = this.widthTransformationFactor;
            double d11 = this.heightTransformationFactor;
            StringBuilder sb2 = new StringBuilder("Configuration(minDimensionFactor=");
            sb2.append(vector2);
            sb2.append(", maxDimensionFactor=");
            sb2.append(vector3);
            sb2.append(", scale=");
            sb2.append(d2);
            sb2.append(", neighbors=");
            sb2.append(i10);
            sb2.append(", cascadeFile=");
            sb2.append(str);
            sb2.append(", xTransformationFactor=");
            sb2.append(d3);
            v.f(sb2, ", yTransformationFactor=", d7, ", widthTransformationFactor=");
            sb2.append(d10);
            sb2.append(", heightTransformationFactor=");
            sb2.append(d11);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        for (String str : CascadeSpatialObjectDetectorKt.f67022a) {
            System.loadLibrary(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CascadeSpatialObjectDetector(GeometricAnalysisBuilder geometricAnalysisBuilder, Configuration configuration, DefaultConstructorMarker defaultConstructorMarker) {
        super(null, geometricAnalysisBuilder, 1, 0 == true ? 1 : 0);
        this.configuration = configuration;
    }

    @Override // com.veridas.detect.spatial.bridge.AbstractSpatialObjectDetector
    public native long bridgeFinish(long reference, @NotNull String[] classTypes, @NotNull String[] memberNames);

    @Override // com.veridas.detect.spatial.bridge.AbstractSpatialObjectDetector
    public native long bridgeInitialize(@NotNull String[] classTypes, @NotNull String[] memberNames);

    @Override // com.veridas.detect.spatial.bridge.AbstractSpatialObjectDetector
    public native void bridgeRequest(@NotNull String[] classTypes, @NotNull String[] memberNames, long reference, @NotNull Request request, @NotNull IntermediateDetectionResult result);

    @NotNull
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    @Override // com.veridas.detect.spatial.bridge.AbstractSpatialObjectDetector, com.veridas.detect.spatial.SpatialObjectDetector
    public boolean initialize() throws InitializeDetectorException {
        if (getReference() != 0) {
            throw new IllegalStateException("This objectDetector has already been initialized.".toString());
        }
        try {
            String jniClassName = toJniClassName(Reflection.getOrCreateKotlinClass(CascadeSpatialObjectDetector.class));
            String jniClassName2 = toJniClassName(Reflection.getOrCreateKotlinClass(Configuration.class));
            ArrayList arrayList = new ArrayList();
            g.addAll(arrayList, createClassTypeList());
            arrayList.add(jniClassName);
            arrayList.add(jniClassName2);
            ArrayList arrayList2 = new ArrayList();
            g.addAll(arrayList2, createMemberNameList());
            g.addAll(arrayList2, new String[]{"configuration", "cascadeFile", "maxDimensionFactor", "x", "y", "minDimensionFactor", "x", "y", "neighbors", ImageScaleTypeHandler.ID, "xTransformationFactor", "yTransformationFactor", "widthTransformationFactor", "heightTransformationFactor"});
            setReference(bridgeInitialize((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0])));
            return true;
        } catch (Exception e5) {
            throw new InitializeDetectorException(e5);
        }
    }

    public final void setConfiguration(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<set-?>");
        this.configuration = configuration;
    }
}
