package com.veridas.detect.spatial.bridge;

import androidx.annotation.Keep;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.veridas.math.geometry.Rectangle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntermediateDetectionResult.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006#"}, d2 = {"Lcom/veridas/detect/spatial/bridge/IntermediateDetectionResult;", "", "()V", "cameraFlashes", "", "Lcom/veridas/math/geometry/Rectangle;", "getCameraFlashes", "()Ljava/util/List;", "candidates", "getCandidates", "lightBlobs", "getLightBlobs", "outOfFocusValue", "", "getOutOfFocusValue", "()D", "setOutOfFocusValue", "(D)V", "overExposureValue", "getOverExposureValue", "setOverExposureValue", "underExposureValue", "getUnderExposureValue", "setUnderExposureValue", "parseResult", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "results", "", "putOutOfFocusValue", "putOverExposureValue", "putUnderExposureValue", "setCameraFlashes", "setCandidates", "setLightBlobs", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntermediateDetectionResult {

    @NotNull
    private final List<Rectangle> candidates = new ArrayList();
    private double underExposureValue = Double.POSITIVE_INFINITY;
    private double overExposureValue = Double.POSITIVE_INFINITY;
    private double outOfFocusValue = Double.POSITIVE_INFINITY;

    @NotNull
    private final List<Rectangle> lightBlobs = new ArrayList();

    @NotNull
    private final List<Rectangle> cameraFlashes = new ArrayList();

    private final void parseResult(List<Rectangle> list, int[] results) {
        list.clear();
        int i10 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, results.length - 1, 4);
        if (progressionLastElement < 0) {
            return;
        }
        while (true) {
            list.add(new Rectangle(results[i10], results[i10 + 1], results[i10 + 2], results[i10 + 3]));
            if (i10 == progressionLastElement) {
                return;
            } else {
                i10 += 4;
            }
        }
    }

    @NotNull
    public final List<Rectangle> getCameraFlashes() {
        return this.cameraFlashes;
    }

    @NotNull
    public final List<Rectangle> getCandidates() {
        return this.candidates;
    }

    @NotNull
    public final List<Rectangle> getLightBlobs() {
        return this.lightBlobs;
    }

    public final double getOutOfFocusValue() {
        return this.outOfFocusValue;
    }

    public final double getOverExposureValue() {
        return this.overExposureValue;
    }

    public final double getUnderExposureValue() {
        return this.underExposureValue;
    }

    public final void putOutOfFocusValue(double outOfFocusValue) {
        this.outOfFocusValue = outOfFocusValue;
    }

    public final void putOverExposureValue(double overExposureValue) {
        this.overExposureValue = overExposureValue;
    }

    public final void putUnderExposureValue(double underExposureValue) {
        this.underExposureValue = underExposureValue;
    }

    public final void setCameraFlashes(@NotNull int[] results) {
        Intrinsics.checkNotNullParameter(results, "results");
        parseResult(this.cameraFlashes, results);
    }

    public final void setCandidates(@NotNull int[] results) {
        Intrinsics.checkNotNullParameter(results, "results");
        parseResult(this.candidates, results);
    }

    public final void setLightBlobs(@NotNull int[] results) {
        Intrinsics.checkNotNullParameter(results, "results");
        parseResult(this.lightBlobs, results);
    }

    public final void setOutOfFocusValue(double d2) {
        this.outOfFocusValue = d2;
    }

    public final void setOverExposureValue(double d2) {
        this.overExposureValue = d2;
    }

    public final void setUnderExposureValue(double d2) {
        this.underExposureValue = d2;
    }
}
