package com.veridas.detect.spatial;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.math.geometry.Rectangle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GeometricAnalysisBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/veridas/detect/spatial/GeometricAnalysisBuilder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/detect/spatial/GeometricAnalysis;", "referenceObject", "value", "Lcom/veridas/math/geometry/Rectangle;", "result", "viewport", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GeometricAnalysisBuilder {
    @NotNull
    GeometricAnalysis build();

    @NotNull
    GeometricAnalysisBuilder referenceObject(@NotNull Rectangle value);

    @NotNull
    GeometricAnalysisBuilder result(@NotNull Rectangle value);

    @NotNull
    GeometricAnalysisBuilder viewport(@NotNull Rectangle value);
}
