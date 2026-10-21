package com.veridas.detect.sequence.context;

import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import kotlin.Metadata;

/* JADX INFO: compiled from: SequentialAnalysisContext.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0012\u0010\r\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0012\u0010\u0019\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0012\u0010\u001b\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0012\u0010\u001d\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0012\u0010\u001f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0005¨\u0006!"}, d2 = {"Lcom/veridas/detect/sequence/context/IntelligentSequentialAnalysisContext;", "Lcom/veridas/detect/sequence/context/DocumentSequentialAnalysisContext;", "cycle", "", "getCycle", "()I", "setCycle", "(I)V", "rectangleDetected", "getRectangleDetected", "setRectangleDetected", "rectangleDetectionCycleCount", "getRectangleDetectionCycleCount", "rectangleDetectionSwitchLimit", "getRectangleDetectionSwitchLimit", "requiredHitsMultiplier", "", "getRequiredHitsMultiplier", "()D", ImageScaleTypeHandler.ID, "getScale", "setScale", "(D)V", "scaleInitialValue", "getScaleInitialValue", "scaleMax", "getScaleMax", "scaleMin", "getScaleMin", "scaleStep", "getScaleStep", "stuckHitLimit", "getStuckHitLimit", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IntelligentSequentialAnalysisContext extends DocumentSequentialAnalysisContext {
    int getCycle();

    int getRectangleDetected();

    int getRectangleDetectionCycleCount();

    int getRectangleDetectionSwitchLimit();

    double getRequiredHitsMultiplier();

    double getScale();

    double getScaleInitialValue();

    double getScaleMax();

    double getScaleMin();

    double getScaleStep();

    int getStuckHitLimit();

    void setCycle(int i10);

    void setRectangleDetected(int i10);

    void setScale(double d2);
}
