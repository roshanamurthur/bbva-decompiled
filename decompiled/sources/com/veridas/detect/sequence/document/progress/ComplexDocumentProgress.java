package com.veridas.detect.sequence.document.progress;

import kotlin.Metadata;

/* JADX INFO: compiled from: ComplexDocumentProgress.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0018\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/veridas/detect/sequence/document/progress/ComplexDocumentProgress;", "Lcom/veridas/detect/sequence/document/progress/DocumentProgress;", "", "calculate", "a", "D", "getCaptureMaxFrameCount", "()D", "captureMaxFrameCount", "b", "getCenteredHits", "centeredHits", "c", "getCenteredMaxFrameCount", "centeredMaxFrameCount", "d", "getProgressMax", "progressMax", "e", "getTotalHits", "totalHits", "f", "getWeight", "weight", "<init>", "(DDDDDD)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class ComplexDocumentProgress implements DocumentProgress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double captureMaxFrameCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double centeredHits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double centeredMaxFrameCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final double progressMax;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final double totalHits;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final double weight;

    public ComplexDocumentProgress(double d2, double d3, double d7, double d10, double d11, double d12) {
        this.captureMaxFrameCount = d2;
        this.centeredHits = d3;
        this.centeredMaxFrameCount = d7;
        this.progressMax = d10;
        this.totalHits = d11;
        this.weight = d12;
        if (d2 <= 0.0d) {
            throw new IllegalArgumentException("captureMaxFrameCount must be larger than zero".toString());
        }
        if (d3 < 0.0d) {
            throw new IllegalArgumentException("centeredHits must be larger than or equal to zero".toString());
        }
        if (d7 <= 0.0d) {
            throw new IllegalArgumentException("centeredMaxFrameCount must be larger than zero".toString());
        }
    }

    @Override // com.veridas.detect.sequence.document.progress.DocumentProgress
    public double calculate() {
        double d2 = this.captureMaxFrameCount - (this.totalHits / this.weight);
        double d3 = this.centeredHits;
        double dMax = d3 / Math.max(d2 + d3, this.centeredMaxFrameCount);
        double d7 = this.progressMax;
        double d10 = dMax * d7;
        return d10 > d7 ? d7 : d10;
    }

    public final double getCaptureMaxFrameCount() {
        return this.captureMaxFrameCount;
    }

    public final double getCenteredHits() {
        return this.centeredHits;
    }

    public final double getCenteredMaxFrameCount() {
        return this.centeredMaxFrameCount;
    }

    public final double getProgressMax() {
        return this.progressMax;
    }

    public final double getTotalHits() {
        return this.totalHits;
    }

    public final double getWeight() {
        return this.weight;
    }
}
