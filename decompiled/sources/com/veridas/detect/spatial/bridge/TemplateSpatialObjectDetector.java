package com.veridas.detect.spatial.bridge;

import androidx.annotation.Keep;
import androidx.camera.core.impl.v;
import bk.g;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.InitializeDetectorException;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.GeometricAnalysisBuilder;
import com.veridas.detect.spatial.ReferenceObjectGeometricAnalysisBuilder;
import com.veridas.graphics.Frame;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TemplateSpatialObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 #2\u00020\u0001:\u0003$#%J4\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0094 ¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0094 ¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0094 ¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector;", "Lcom/veridas/detect/spatial/bridge/AbstractSpatialObjectDetector;", "", "reference", "", "", "classTypes", "memberNames", "bridgeFinish", "(J[Ljava/lang/String;[Ljava/lang/String;)J", "bridgeInitialize", "([Ljava/lang/String;[Ljava/lang/String;)J", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;", "result", "", "bridgeRequest", "([Ljava/lang/String;[Ljava/lang/String;JLcom/veridas/detect/Request;Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;)V", "", "initialize", "Lcom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector$Configuration;", "configuration", "Lcom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector$Configuration;", "getConfiguration", "()Lcom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector$Configuration;", "setConfiguration", "(Lcom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector$Configuration;)V", "Lcom/veridas/graphics/Frame;", "template", "Lcom/veridas/graphics/Frame;", "getTemplate", "()Lcom/veridas/graphics/Frame;", "setTemplate", "(Lcom/veridas/graphics/Frame;)V", "Companion", "Builder", "Configuration", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTemplateSpatialObjectDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplateSpatialObjectDetector.kt\ncom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,270:1\n37#2,2:271\n37#2,2:273\n13309#3,2:275\n*S KotlinDebug\n*F\n+ 1 TemplateSpatialObjectDetector.kt\ncom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector\n*L\n109#1:271,2\n110#1:273,2\n41#1:275,2\n*E\n"})
public final class TemplateSpatialObjectDetector extends AbstractSpatialObjectDetector {

    @Keep
    @NotNull
    private Configuration configuration;

    @Keep
    @NotNull
    private Frame template;

    /* JADX INFO: compiled from: TemplateSpatialObjectDetector.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0015J\u0097\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u001f"}, d2 = {"Lcom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector$Builder;", "", "Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;", "geometricAnalysisBuilder", "", "grayscale", "", "heightTransformationFactor", "minimumFactor", "", "previousMargin", "pyramidFactor", "pyramidRange", "roiFactor", "Lcom/veridas/graphics/Frame;", "template", "thresholdArea", "thresholdMaximumValue", "widthTransformationFactor", "xTransformationFactor", "yTransformationFactor", "Lcom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "<init>", "(Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;ZDDDDIIIDDDDLcom/veridas/graphics/Frame;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public GeometricAnalysisBuilder f67027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f67028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f67029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f67030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f67031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f67032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f67033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f67034h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f67035i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f67036j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f67037k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f67038l;
        public double m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public Frame f67039n;

        public Builder() {
            this(null, false, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, 16383, null);
        }

        @NotNull
        public final TemplateSpatialObjectDetector build() {
            Frame frame = this.f67039n;
            if (frame == null) {
                throw new IllegalArgumentException("The Template parameter can't be null.".toString());
            }
            return new TemplateSpatialObjectDetector(this.f67027a, new Configuration(this.f67028b, this.f67029c, this.f67030d, this.f67031e, this.f67032f, this.f67033g, this.f67034h, this.f67035i, this.f67036j, this.f67037k, this.f67038l, this.m), frame, null);
        }

        @NotNull
        public final Builder copy(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder, boolean grayscale, double minimumFactor, double pyramidFactor, double roiFactor, double thresholdMaximumValue, int previousMargin, int pyramidRange, int thresholdArea, double xTransformationFactor, double yTransformationFactor, double widthTransformationFactor, double heightTransformationFactor, @Nullable Frame template) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            return new Builder(geometricAnalysisBuilder, grayscale, minimumFactor, pyramidFactor, roiFactor, thresholdMaximumValue, previousMargin, pyramidRange, thresholdArea, xTransformationFactor, yTransformationFactor, widthTransformationFactor, heightTransformationFactor, template);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.f67027a, builder.f67027a) && this.f67028b == builder.f67028b && Double.compare(this.f67029c, builder.f67029c) == 0 && Double.compare(this.f67030d, builder.f67030d) == 0 && Double.compare(this.f67031e, builder.f67031e) == 0 && Double.compare(this.f67032f, builder.f67032f) == 0 && this.f67033g == builder.f67033g && this.f67034h == builder.f67034h && this.f67035i == builder.f67035i && Double.compare(this.f67036j, builder.f67036j) == 0 && Double.compare(this.f67037k, builder.f67037k) == 0 && Double.compare(this.f67038l, builder.f67038l) == 0 && Double.compare(this.m, builder.m) == 0 && Intrinsics.areEqual(this.f67039n, builder.f67039n);
        }

        @NotNull
        public final Builder geometricAnalysisBuilder(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            this.f67027a = geometricAnalysisBuilder;
            return this;
        }

        @NotNull
        public final Builder grayscale(boolean grayscale) {
            this.f67028b = grayscale;
            return this;
        }

        public int hashCode() {
            int iHashCode = ((this.f67027a.hashCode() * 31) + (this.f67028b ? 1231 : 1237)) * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.f67029c);
            int i10 = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.f67030d);
            int i11 = (i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
            long jDoubleToLongBits3 = Double.doubleToLongBits(this.f67031e);
            int i12 = (i11 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
            long jDoubleToLongBits4 = Double.doubleToLongBits(this.f67032f);
            int i13 = (((((((i12 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + this.f67033g) * 31) + this.f67034h) * 31) + this.f67035i) * 31;
            long jDoubleToLongBits5 = Double.doubleToLongBits(this.f67036j);
            int i14 = (i13 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
            long jDoubleToLongBits6 = Double.doubleToLongBits(this.f67037k);
            int i15 = (i14 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
            long jDoubleToLongBits7 = Double.doubleToLongBits(this.f67038l);
            int i16 = (i15 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31;
            long jDoubleToLongBits8 = Double.doubleToLongBits(this.m);
            int i17 = (i16 + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 31;
            Frame frame = this.f67039n;
            return i17 + (frame == null ? 0 : frame.hashCode());
        }

        @NotNull
        public final Builder heightTransformationFactor(double heightTransformationFactor) {
            this.m = heightTransformationFactor;
            return this;
        }

        @NotNull
        public final Builder minimumFactor(double minimumFactor) {
            this.f67029c = minimumFactor;
            return this;
        }

        @NotNull
        public final Builder previousMargin(int previousMargin) {
            this.f67033g = previousMargin;
            return this;
        }

        @NotNull
        public final Builder pyramidFactor(double pyramidFactor) {
            this.f67030d = pyramidFactor;
            return this;
        }

        @NotNull
        public final Builder pyramidRange(int pyramidRange) {
            this.f67034h = pyramidRange;
            return this;
        }

        @NotNull
        public final Builder roiFactor(double roiFactor) {
            this.f67031e = roiFactor;
            return this;
        }

        @NotNull
        public final Builder template(@NotNull Frame template) {
            Intrinsics.checkNotNullParameter(template, "template");
            this.f67039n = template;
            return this;
        }

        @NotNull
        public final Builder thresholdArea(int thresholdArea) {
            this.f67035i = thresholdArea;
            return this;
        }

        @NotNull
        public final Builder thresholdMaximumValue(double thresholdMaximumValue) {
            this.f67032f = thresholdMaximumValue;
            return this;
        }

        @NotNull
        public String toString() {
            GeometricAnalysisBuilder geometricAnalysisBuilder = this.f67027a;
            boolean z10 = this.f67028b;
            double d2 = this.f67029c;
            double d3 = this.f67030d;
            double d7 = this.f67031e;
            double d10 = this.f67032f;
            int i10 = this.f67033g;
            int i11 = this.f67034h;
            int i12 = this.f67035i;
            double d11 = this.f67036j;
            double d12 = this.f67037k;
            double d13 = this.f67038l;
            double d14 = this.m;
            Frame frame = this.f67039n;
            StringBuilder sb2 = new StringBuilder("Builder(geometricAnalysisBuilder=");
            sb2.append(geometricAnalysisBuilder);
            sb2.append(", grayscale=");
            sb2.append(z10);
            sb2.append(", minimumFactor=");
            sb2.append(d2);
            v.f(sb2, ", pyramidFactor=", d3, ", roiFactor=");
            sb2.append(d7);
            v.f(sb2, ", thresholdMaximumValue=", d10, ", previousMargin=");
            sb2.append(i10);
            sb2.append(", pyramidRange=");
            sb2.append(i11);
            sb2.append(", thresholdArea=");
            sb2.append(i12);
            sb2.append(", xTransformationFactor=");
            sb2.append(d11);
            v.f(sb2, ", yTransformationFactor=", d12, ", widthTransformationFactor=");
            sb2.append(d13);
            v.f(sb2, ", heightTransformationFactor=", d14, ", template=");
            sb2.append(frame);
            sb2.append(")");
            return sb2.toString();
        }

        @NotNull
        public final Builder widthTransformationFactor(double widthTransformationFactor) {
            this.f67038l = widthTransformationFactor;
            return this;
        }

        @NotNull
        public final Builder xTransformationFactor(double xTransformationFactor) {
            this.f67036j = xTransformationFactor;
            return this;
        }

        @NotNull
        public final Builder yTransformationFactor(double yTransformationFactor) {
            this.f67037k = yTransformationFactor;
            return this;
        }

        public Builder(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder, boolean z10, double d2, double d3, double d7, double d10, int i10, int i11, int i12, double d11, double d12, double d13, double d14, @Nullable Frame frame) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            this.f67027a = geometricAnalysisBuilder;
            this.f67028b = z10;
            this.f67029c = d2;
            this.f67030d = d3;
            this.f67031e = d7;
            this.f67032f = d10;
            this.f67033g = i10;
            this.f67034h = i11;
            this.f67035i = i12;
            this.f67036j = d11;
            this.f67037k = d12;
            this.f67038l = d13;
            this.m = d14;
            this.f67039n = frame;
        }

        public /* synthetic */ Builder(GeometricAnalysisBuilder geometricAnalysisBuilder, boolean z10, double d2, double d3, double d7, double d10, int i10, int i11, int i12, double d11, double d12, double d13, double d14, Frame frame, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new ReferenceObjectGeometricAnalysisBuilder() : geometricAnalysisBuilder, (i13 & 2) != 0 ? true : z10, (i13 & 4) != 0 ? 2.0d : d2, (i13 & 8) != 0 ? 0.95d : d3, (i13 & 16) != 0 ? 0.15d : d7, (i13 & 32) != 0 ? 1.0d : d10, (i13 & 64) != 0 ? 2 : i10, (i13 & 128) != 0 ? 12 : i11, (i13 & 256) != 0 ? 35 : i12, (i13 & 512) != 0 ? 0.0d : d11, (i13 & 1024) == 0 ? d12 : 0.0d, (i13 & 2048) != 0 ? 1.0d : d13, (i13 & 4096) != 0 ? 1.0d : d14, (i13 & 8192) != 0 ? null : frame);
        }
    }

    /* JADX INFO: compiled from: TemplateSpatialObjectDetector.kt */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u0081\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\nHÖ\u0001J\t\u0010?\u001a\u00020@HÖ\u0001R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015¨\u0006A"}, d2 = {"Lcom/veridas/detect/spatial/bridge/TemplateSpatialObjectDetector$Configuration;", "", "isGray", "", "minimumFactor", "", "pyramidFactor", "roiFactor", "thresholdMaximumValue", "previousMargin", "", "pyramidRange", "thresholdArea", "xTransformationFactor", "yTransformationFactor", "widthTransformationFactor", "heightTransformationFactor", "(ZDDDDIIIDDDD)V", "getHeightTransformationFactor", "()D", "setHeightTransformationFactor", "(D)V", "()Z", "setGray", "(Z)V", "getMinimumFactor", "setMinimumFactor", "getPreviousMargin", "()I", "setPreviousMargin", "(I)V", "getPyramidFactor", "setPyramidFactor", "getPyramidRange", "setPyramidRange", "getRoiFactor", "setRoiFactor", "getThresholdArea", "setThresholdArea", "getThresholdMaximumValue", "setThresholdMaximumValue", "getWidthTransformationFactor", "setWidthTransformationFactor", "getXTransformationFactor", "setXTransformationFactor", "getYTransformationFactor", "setYTransformationFactor", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Configuration {
        private double heightTransformationFactor;
        private boolean isGray;
        private double minimumFactor;
        private int previousMargin;
        private double pyramidFactor;
        private int pyramidRange;
        private double roiFactor;
        private int thresholdArea;
        private double thresholdMaximumValue;
        private double widthTransformationFactor;
        private double xTransformationFactor;
        private double yTransformationFactor;

        public Configuration() {
            this(false, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 4095, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsGray() {
            return this.isGray;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final double getYTransformationFactor() {
            return this.yTransformationFactor;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final double getWidthTransformationFactor() {
            return this.widthTransformationFactor;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final double getHeightTransformationFactor() {
            return this.heightTransformationFactor;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getMinimumFactor() {
            return this.minimumFactor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final double getPyramidFactor() {
            return this.pyramidFactor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final double getRoiFactor() {
            return this.roiFactor;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final double getThresholdMaximumValue() {
            return this.thresholdMaximumValue;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getPreviousMargin() {
            return this.previousMargin;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getPyramidRange() {
            return this.pyramidRange;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getThresholdArea() {
            return this.thresholdArea;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final double getXTransformationFactor() {
            return this.xTransformationFactor;
        }

        @NotNull
        public final Configuration copy(boolean isGray, double minimumFactor, double pyramidFactor, double roiFactor, double thresholdMaximumValue, int previousMargin, int pyramidRange, int thresholdArea, double xTransformationFactor, double yTransformationFactor, double widthTransformationFactor, double heightTransformationFactor) {
            return new Configuration(isGray, minimumFactor, pyramidFactor, roiFactor, thresholdMaximumValue, previousMargin, pyramidRange, thresholdArea, xTransformationFactor, yTransformationFactor, widthTransformationFactor, heightTransformationFactor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.isGray == configuration.isGray && Double.compare(this.minimumFactor, configuration.minimumFactor) == 0 && Double.compare(this.pyramidFactor, configuration.pyramidFactor) == 0 && Double.compare(this.roiFactor, configuration.roiFactor) == 0 && Double.compare(this.thresholdMaximumValue, configuration.thresholdMaximumValue) == 0 && this.previousMargin == configuration.previousMargin && this.pyramidRange == configuration.pyramidRange && this.thresholdArea == configuration.thresholdArea && Double.compare(this.xTransformationFactor, configuration.xTransformationFactor) == 0 && Double.compare(this.yTransformationFactor, configuration.yTransformationFactor) == 0 && Double.compare(this.widthTransformationFactor, configuration.widthTransformationFactor) == 0 && Double.compare(this.heightTransformationFactor, configuration.heightTransformationFactor) == 0;
        }

        public final double getHeightTransformationFactor() {
            return this.heightTransformationFactor;
        }

        public final double getMinimumFactor() {
            return this.minimumFactor;
        }

        public final int getPreviousMargin() {
            return this.previousMargin;
        }

        public final double getPyramidFactor() {
            return this.pyramidFactor;
        }

        public final int getPyramidRange() {
            return this.pyramidRange;
        }

        public final double getRoiFactor() {
            return this.roiFactor;
        }

        public final int getThresholdArea() {
            return this.thresholdArea;
        }

        public final double getThresholdMaximumValue() {
            return this.thresholdMaximumValue;
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
            int i10 = this.isGray ? 1231 : 1237;
            long jDoubleToLongBits = Double.doubleToLongBits(this.minimumFactor);
            int i11 = ((i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.pyramidFactor);
            int i12 = (i11 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
            long jDoubleToLongBits3 = Double.doubleToLongBits(this.roiFactor);
            int i13 = (i12 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
            long jDoubleToLongBits4 = Double.doubleToLongBits(this.thresholdMaximumValue);
            int i14 = (((((((i13 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + this.previousMargin) * 31) + this.pyramidRange) * 31) + this.thresholdArea) * 31;
            long jDoubleToLongBits5 = Double.doubleToLongBits(this.xTransformationFactor);
            int i15 = (i14 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
            long jDoubleToLongBits6 = Double.doubleToLongBits(this.yTransformationFactor);
            int i16 = (i15 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
            long jDoubleToLongBits7 = Double.doubleToLongBits(this.widthTransformationFactor);
            int i17 = (i16 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31;
            long jDoubleToLongBits8 = Double.doubleToLongBits(this.heightTransformationFactor);
            return i17 + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        }

        public final boolean isGray() {
            return this.isGray;
        }

        public final void setGray(boolean z10) {
            this.isGray = z10;
        }

        public final void setHeightTransformationFactor(double d2) {
            this.heightTransformationFactor = d2;
        }

        public final void setMinimumFactor(double d2) {
            this.minimumFactor = d2;
        }

        public final void setPreviousMargin(int i10) {
            this.previousMargin = i10;
        }

        public final void setPyramidFactor(double d2) {
            this.pyramidFactor = d2;
        }

        public final void setPyramidRange(int i10) {
            this.pyramidRange = i10;
        }

        public final void setRoiFactor(double d2) {
            this.roiFactor = d2;
        }

        public final void setThresholdArea(int i10) {
            this.thresholdArea = i10;
        }

        public final void setThresholdMaximumValue(double d2) {
            this.thresholdMaximumValue = d2;
        }

        public final void setWidthTransformationFactor(double d2) {
            this.widthTransformationFactor = d2;
        }

        public final void setXTransformationFactor(double d2) {
            this.xTransformationFactor = d2;
        }

        public final void setYTransformationFactor(double d2) {
            this.yTransformationFactor = d2;
        }

        @NotNull
        public String toString() {
            boolean z10 = this.isGray;
            double d2 = this.minimumFactor;
            double d3 = this.pyramidFactor;
            double d7 = this.roiFactor;
            double d10 = this.thresholdMaximumValue;
            int i10 = this.previousMargin;
            int i11 = this.pyramidRange;
            int i12 = this.thresholdArea;
            double d11 = this.xTransformationFactor;
            double d12 = this.yTransformationFactor;
            double d13 = this.widthTransformationFactor;
            double d14 = this.heightTransformationFactor;
            StringBuilder sb2 = new StringBuilder("Configuration(isGray=");
            sb2.append(z10);
            sb2.append(", minimumFactor=");
            sb2.append(d2);
            v.f(sb2, ", pyramidFactor=", d3, ", roiFactor=");
            sb2.append(d7);
            v.f(sb2, ", thresholdMaximumValue=", d10, ", previousMargin=");
            sb2.append(i10);
            sb2.append(", pyramidRange=");
            sb2.append(i11);
            sb2.append(", thresholdArea=");
            sb2.append(i12);
            sb2.append(", xTransformationFactor=");
            sb2.append(d11);
            v.f(sb2, ", yTransformationFactor=", d12, ", widthTransformationFactor=");
            sb2.append(d13);
            sb2.append(", heightTransformationFactor=");
            sb2.append(d14);
            sb2.append(")");
            return sb2.toString();
        }

        public Configuration(boolean z10, double d2, double d3, double d7, double d10, int i10, int i11, int i12, double d11, double d12, double d13, double d14) {
            this.isGray = z10;
            this.minimumFactor = d2;
            this.pyramidFactor = d3;
            this.roiFactor = d7;
            this.thresholdMaximumValue = d10;
            this.previousMargin = i10;
            this.pyramidRange = i11;
            this.thresholdArea = i12;
            this.xTransformationFactor = d11;
            this.yTransformationFactor = d12;
            this.widthTransformationFactor = d13;
            this.heightTransformationFactor = d14;
            if (d2 <= 0.0d) {
                throw new IllegalArgumentException("The minimum factor must not be lower than: 0".toString());
            }
            if (d3 <= 0.0d) {
                throw new IllegalArgumentException("The pyramid factor must not be lower than: + 0".toString());
            }
            if (d7 <= 0.0d) {
                throw new IllegalArgumentException("The roi factor must not be lower than: + 0".toString());
            }
            if (d10 <= 0.0d) {
                throw new IllegalArgumentException("The threshold maximum value of neighbours must not be lower than: 0".toString());
            }
            if (i10 <= 0) {
                throw new IllegalArgumentException("The previous margin score must not be lower than: 0".toString());
            }
            if (i11 <= 1) {
                throw new IllegalArgumentException("The pyramid range score must not be lower than: 1".toString());
            }
            if (i12 <= 0) {
                throw new IllegalArgumentException("The threshold area score must not be lower than: 0".toString());
            }
        }

        public /* synthetic */ Configuration(boolean z10, double d2, double d3, double d7, double d10, int i10, int i11, int i12, double d11, double d12, double d13, double d14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? true : z10, (i13 & 2) != 0 ? 2.0d : d2, (i13 & 4) != 0 ? 0.95d : d3, (i13 & 8) != 0 ? 0.15d : d7, (i13 & 16) != 0 ? 1.0d : d10, (i13 & 32) != 0 ? 2 : i10, (i13 & 64) != 0 ? 12 : i11, (i13 & 128) != 0 ? 35 : i12, (i13 & 256) != 0 ? 0.0d : d11, (i13 & 512) == 0 ? d12 : 0.0d, (i13 & 1024) != 0 ? 1.0d : d13, (i13 & 2048) == 0 ? d14 : 1.0d);
        }
    }

    static {
        for (String str : TemplateSpatialObjectDetectorKt.f67040a) {
            System.loadLibrary(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateSpatialObjectDetector(GeometricAnalysisBuilder geometricAnalysisBuilder, Configuration configuration, Frame frame, DefaultConstructorMarker defaultConstructorMarker) {
        super(null, geometricAnalysisBuilder, 1, 0 == true ? 1 : 0);
        this.configuration = configuration;
        this.template = frame;
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

    @NotNull
    public final Frame getTemplate() {
        return this.template;
    }

    @Override // com.veridas.detect.spatial.bridge.AbstractSpatialObjectDetector, com.veridas.detect.spatial.SpatialObjectDetector
    public boolean initialize() throws InitializeDetectorException {
        if (getReference() != 0) {
            throw new IllegalStateException("This objectDetector has already been initialized.".toString());
        }
        try {
            String jniClassName = toJniClassName(Reflection.getOrCreateKotlinClass(TemplateSpatialObjectDetector.class));
            String jniClassName2 = toJniClassName(Reflection.getOrCreateKotlinClass(Configuration.class));
            ArrayList arrayList = new ArrayList();
            g.addAll(arrayList, createClassTypeList());
            arrayList.add(jniClassName);
            arrayList.add(jniClassName2);
            ArrayList arrayList2 = new ArrayList();
            g.addAll(arrayList2, createMemberNameList());
            g.addAll(arrayList2, new String[]{"configuration", "minimumFactor", "roiFactor", "pyramidFactor", "pyramidRange", "previousMargin", "thresholdArea", "thresholdMaximumValue", "xTransformationFactor", "yTransformationFactor", "widthTransformationFactor", "heightTransformationFactor", "template", "encoding", "code", "data", "dimensions", "width", "height", "orientation"});
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

    public final void setTemplate(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "<set-?>");
        this.template = frame;
    }
}
