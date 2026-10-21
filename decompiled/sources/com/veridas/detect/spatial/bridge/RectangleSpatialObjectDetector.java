package com.veridas.detect.spatial.bridge;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.GeometricAnalysisBuilder;
import com.veridas.detect.spatial.ReferenceObjectGeometricAnalysisBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RectangleSpatialObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013J4\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0094 ¢\u0006\u0004\b\b\u0010\tJ,\u0010\n\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0094 ¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0094 ¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/veridas/detect/spatial/bridge/RectangleSpatialObjectDetector;", "Lcom/veridas/detect/spatial/bridge/AbstractSpatialObjectDetector;", "", "reference", "", "", "classTypes", "memberNames", "bridgeFinish", "(J[Ljava/lang/String;[Ljava/lang/String;)J", "bridgeInitialize", "([Ljava/lang/String;[Ljava/lang/String;)J", "Lcom/veridas/detect/Request;", "request", "Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;", "result", "", "bridgeRequest", "([Ljava/lang/String;[Ljava/lang/String;JLcom/veridas/detect/Request;Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;)V", "Companion", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRectangleSpatialObjectDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectangleSpatialObjectDetector.kt\ncom/veridas/detect/spatial/bridge/RectangleSpatialObjectDetector\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,61:1\n13309#2,2:62\n*S KotlinDebug\n*F\n+ 1 RectangleSpatialObjectDetector.kt\ncom/veridas/detect/spatial/bridge/RectangleSpatialObjectDetector\n*L\n25#1:62,2\n*E\n"})
public final class RectangleSpatialObjectDetector extends AbstractSpatialObjectDetector {

    /* JADX INFO: compiled from: RectangleSpatialObjectDetector.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0010"}, d2 = {"Lcom/veridas/detect/spatial/bridge/RectangleSpatialObjectDetector$Builder;", "", "Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;", "geometricAnalysisBuilder", "Lcom/veridas/detect/spatial/bridge/RectangleSpatialObjectDetector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public GeometricAnalysisBuilder f67025a;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, GeometricAnalysisBuilder geometricAnalysisBuilder, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                geometricAnalysisBuilder = builder.f67025a;
            }
            return builder.copy(geometricAnalysisBuilder);
        }

        @NotNull
        public final RectangleSpatialObjectDetector build() {
            return new RectangleSpatialObjectDetector(this.f67025a, null);
        }

        @NotNull
        public final Builder copy(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            return new Builder(geometricAnalysisBuilder);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Builder) && Intrinsics.areEqual(this.f67025a, ((Builder) other).f67025a);
        }

        @NotNull
        public final Builder geometricAnalysisBuilder(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            this.f67025a = geometricAnalysisBuilder;
            return this;
        }

        public int hashCode() {
            return this.f67025a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Builder(geometricAnalysisBuilder=" + this.f67025a + ")";
        }

        public Builder(@NotNull GeometricAnalysisBuilder geometricAnalysisBuilder) {
            Intrinsics.checkNotNullParameter(geometricAnalysisBuilder, "geometricAnalysisBuilder");
            this.f67025a = geometricAnalysisBuilder;
        }

        public /* synthetic */ Builder(GeometricAnalysisBuilder geometricAnalysisBuilder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new ReferenceObjectGeometricAnalysisBuilder() : geometricAnalysisBuilder);
        }
    }

    static {
        for (String str : RectangleSpatialObjectDetectorKt.f67026a) {
            System.loadLibrary(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RectangleSpatialObjectDetector(GeometricAnalysisBuilder geometricAnalysisBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        super(null, geometricAnalysisBuilder, 1, 0 == true ? 1 : 0);
    }

    @Override // com.veridas.detect.spatial.bridge.AbstractSpatialObjectDetector
    public native long bridgeFinish(long reference, @NotNull String[] classTypes, @NotNull String[] memberNames);

    @Override // com.veridas.detect.spatial.bridge.AbstractSpatialObjectDetector
    public native long bridgeInitialize(@NotNull String[] classTypes, @NotNull String[] memberNames);

    @Override // com.veridas.detect.spatial.bridge.AbstractSpatialObjectDetector
    public native void bridgeRequest(@NotNull String[] classTypes, @NotNull String[] memberNames, long reference, @NotNull Request request, @NotNull IntermediateDetectionResult result);
}
