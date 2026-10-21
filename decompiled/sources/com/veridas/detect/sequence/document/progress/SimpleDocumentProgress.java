package com.veridas.detect.sequence.document.progress;

import kotlin.Metadata;

/* JADX INFO: compiled from: SimpleDocumentProgress.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/veridas/detect/sequence/document/progress/SimpleDocumentProgress;", "Lcom/veridas/detect/sequence/document/progress/DocumentProgress;", "", "calculate", "a", "D", "getProgressMax", "()D", "progressMax", "b", "getRequiredHits", "requiredHits", "c", "getTotalHits", "totalHits", "<init>", "(DDD)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class SimpleDocumentProgress implements DocumentProgress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double progressMax;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double requiredHits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double totalHits;

    public SimpleDocumentProgress(double d2, double d3, double d7) {
        this.progressMax = d2;
        this.requiredHits = d3;
        this.totalHits = d7;
        if (d3 <= 0.0d) {
            throw new IllegalArgumentException("requiredHits must be larger than zero".toString());
        }
        if (d7 < 0.0d) {
            throw new IllegalArgumentException("totalHits must be larger than or equal to zero".toString());
        }
    }

    @Override // com.veridas.detect.sequence.document.progress.DocumentProgress
    public double calculate() {
        double d2 = this.totalHits;
        double d3 = this.progressMax;
        double d7 = (d2 * d3) / this.requiredHits;
        return d7 > d3 ? d3 : d7;
    }

    public final double getProgressMax() {
        return this.progressMax;
    }

    public final double getRequiredHits() {
        return this.requiredHits;
    }

    public final double getTotalHits() {
        return this.totalHits;
    }
}
