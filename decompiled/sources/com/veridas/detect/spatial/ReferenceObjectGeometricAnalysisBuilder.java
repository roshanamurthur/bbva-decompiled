package com.veridas.detect.spatial;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.Vector2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReferenceObjectGeometricAnalysisBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/veridas/detect/spatial/ReferenceObjectGeometricAnalysisBuilder;", "Lcom/veridas/detect/spatial/AbstractGeometricAnalysisBuilder;", "()V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/detect/spatial/GeometricAnalysis;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReferenceObjectGeometricAnalysisBuilder extends AbstractGeometricAnalysisBuilder {
    @Override // com.veridas.detect.spatial.GeometricAnalysisBuilder
    @NotNull
    public GeometricAnalysis build() {
        Rectangle referenceObject = getReferenceObject();
        if (referenceObject == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Rectangle result = getResult();
        if (result == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Vector2 dimensions = result.getDimensions();
        Vector2 dimensions2 = referenceObject.getDimensions();
        double dAbsoluteAreaDelta = dimensions.absoluteAreaDelta(dimensions2);
        double dRelativeAreaDelta = dimensions.relativeAreaDelta(dimensions2);
        Vector2 vector2Minus = result.absoluteCenter().minus(referenceObject.absoluteCenter());
        double dMagnitude = vector2Minus.magnitude();
        Vector2.Companion companion = Vector2.INSTANCE;
        Vector2 vector2Div = !Intrinsics.areEqual(dimensions2, companion.getZERO()) ? vector2Minus.div(dimensions2) : companion.getZERO();
        return new GeometricAnalysis(dAbsoluteAreaDelta, dMagnitude, vector2Minus, dRelativeAreaDelta, !Intrinsics.areEqual(vector2Div, companion.getZERO()) ? vector2Div.magnitude() : 0.0d, vector2Div);
    }
}
