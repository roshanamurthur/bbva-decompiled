package com.veridas.detect.spatial;

import androidx.annotation.Keep;
import com.veridas.math.geometry.Vector2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeometricAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/veridas/detect/spatial/GeometricAnalysis;", "", "absoluteAreaDelta", "", "absoluteDistanceToFocusPoint1D", "absoluteDistanceToFocusPoint2D", "Lcom/veridas/math/geometry/Vector2;", "relativeAreaDelta", "relativeDistanceToFocusPoint1D", "relativeDistanceToFocusPoint2D", "(DDLcom/veridas/math/geometry/Vector2;DDLcom/veridas/math/geometry/Vector2;)V", "getAbsoluteAreaDelta", "()D", "getAbsoluteDistanceToFocusPoint1D", "getAbsoluteDistanceToFocusPoint2D", "()Lcom/veridas/math/geometry/Vector2;", "getRelativeAreaDelta", "getRelativeDistanceToFocusPoint1D", "getRelativeDistanceToFocusPoint2D", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GeometricAnalysis {

    @NotNull
    private static final GeometricAnalysis EMPTY;
    private final double absoluteAreaDelta;
    private final double absoluteDistanceToFocusPoint1D;

    @NotNull
    private final Vector2 absoluteDistanceToFocusPoint2D;
    private final double relativeAreaDelta;
    private final double relativeDistanceToFocusPoint1D;

    @NotNull
    private final Vector2 relativeDistanceToFocusPoint2D;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<Double> excludedValues = CollectionsKt__CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(Double.NaN), Double.valueOf(Double.NEGATIVE_INFINITY), Double.valueOf(Double.POSITIVE_INFINITY)});

    static {
        Vector2.Companion companion = Vector2.INSTANCE;
        EMPTY = new GeometricAnalysis(0.0d, 0.0d, companion.getZERO(), 0.0d, 0.0d, companion.getZERO());
    }

    public GeometricAnalysis(double d2, double d3, @NotNull Vector2 absoluteDistanceToFocusPoint2D, double d7, double d10, @NotNull Vector2 relativeDistanceToFocusPoint2D) {
        Intrinsics.checkNotNullParameter(absoluteDistanceToFocusPoint2D, "absoluteDistanceToFocusPoint2D");
        Intrinsics.checkNotNullParameter(relativeDistanceToFocusPoint2D, "relativeDistanceToFocusPoint2D");
        this.absoluteAreaDelta = d2;
        this.absoluteDistanceToFocusPoint1D = d3;
        this.absoluteDistanceToFocusPoint2D = absoluteDistanceToFocusPoint2D;
        this.relativeAreaDelta = d7;
        this.relativeDistanceToFocusPoint1D = d10;
        this.relativeDistanceToFocusPoint2D = relativeDistanceToFocusPoint2D;
        List<Double> list = excludedValues;
        if (!(!list.contains(Double.valueOf(d2)))) {
            throw new IllegalArgumentException(("Invalid value for absoluteAreaDelta: \"" + d2 + "\"").toString());
        }
        if (!(!list.contains(Double.valueOf(d3)))) {
            throw new IllegalArgumentException(("Invalid value for absoluteDistanceToFocusPoint1D: \"" + d3 + "\"").toString());
        }
        if (!(!list.contains(Double.valueOf(d7)))) {
            throw new IllegalArgumentException(("Invalid value for relativeAreaDelta: \"" + d7 + "\"").toString());
        }
        if (!list.contains(Double.valueOf(d10))) {
            return;
        }
        throw new IllegalArgumentException(("Invalid value for relativeDistanceToFocusPoint1D: \"" + d10 + "\"").toString());
    }

    @NotNull
    public static final GeometricAnalysis getEMPTY() {
        return INSTANCE.getEMPTY();
    }

    public final double getAbsoluteAreaDelta() {
        return this.absoluteAreaDelta;
    }

    public final double getAbsoluteDistanceToFocusPoint1D() {
        return this.absoluteDistanceToFocusPoint1D;
    }

    @NotNull
    public final Vector2 getAbsoluteDistanceToFocusPoint2D() {
        return this.absoluteDistanceToFocusPoint2D;
    }

    public final double getRelativeAreaDelta() {
        return this.relativeAreaDelta;
    }

    public final double getRelativeDistanceToFocusPoint1D() {
        return this.relativeDistanceToFocusPoint1D;
    }

    @NotNull
    public final Vector2 getRelativeDistanceToFocusPoint2D() {
        return this.relativeDistanceToFocusPoint2D;
    }

    /* JADX INFO: compiled from: GeometricAnalysis.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/veridas/detect/spatial/GeometricAnalysis$Companion;", "", "()V", "EMPTY", "Lcom/veridas/detect/spatial/GeometricAnalysis;", "getEMPTY$annotations", "getEMPTY", "()Lcom/veridas/detect/spatial/GeometricAnalysis;", "excludedValues", "", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GeometricAnalysis getEMPTY() {
            return GeometricAnalysis.EMPTY;
        }

        @JvmStatic
        public static /* synthetic */ void getEMPTY$annotations() {
        }
    }
}
