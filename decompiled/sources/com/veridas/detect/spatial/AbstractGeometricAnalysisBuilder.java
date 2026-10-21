package com.veridas.detect.spatial;

import com.veridas.math.geometry.Rectangle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeometricAnalysisBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/veridas/detect/spatial/AbstractGeometricAnalysisBuilder;", "Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;", "Lcom/veridas/math/geometry/Rectangle;", "value", "referenceObject", "result", "viewport", "a", "Lcom/veridas/math/geometry/Rectangle;", "getReferenceObject", "()Lcom/veridas/math/geometry/Rectangle;", "setReferenceObject", "(Lcom/veridas/math/geometry/Rectangle;)V", "b", "getResult", "setResult", "c", "getViewport", "setViewport", "<init>", "()V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public abstract class AbstractGeometricAnalysisBuilder implements GeometricAnalysisBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Rectangle referenceObject;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Rectangle result;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Rectangle viewport;

    @Nullable
    public final Rectangle getReferenceObject() {
        return this.referenceObject;
    }

    @Nullable
    public final Rectangle getResult() {
        return this.result;
    }

    @Nullable
    public final Rectangle getViewport() {
        return this.viewport;
    }

    @Override // com.veridas.detect.spatial.GeometricAnalysisBuilder
    @NotNull
    public GeometricAnalysisBuilder referenceObject(@NotNull Rectangle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.referenceObject = value;
        return this;
    }

    @Override // com.veridas.detect.spatial.GeometricAnalysisBuilder
    @NotNull
    public GeometricAnalysisBuilder result(@NotNull Rectangle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.result = value;
        return this;
    }

    public final void setReferenceObject(@Nullable Rectangle rectangle) {
        this.referenceObject = rectangle;
    }

    public final void setResult(@Nullable Rectangle rectangle) {
        this.result = rectangle;
    }

    public final void setViewport(@Nullable Rectangle rectangle) {
        this.viewport = rectangle;
    }

    @Override // com.veridas.detect.spatial.GeometricAnalysisBuilder
    @NotNull
    public GeometricAnalysisBuilder viewport(@NotNull Rectangle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.viewport = value;
        return this;
    }
}
