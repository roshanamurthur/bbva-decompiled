package com.veridas.detect.sequence.score;

import androidx.appcompat.widget.a;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mk.c;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Score.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\bN\b\u0016\u0018\u00002\u00020\u0001BÛ\u0001\b\u0000\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010%\u001a\u00020\u0006\u0012\b\b\u0002\u0010)\u001a\u00020\u0006\u0012\b\b\u0002\u0010-\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u00104\u001a\u00020\u0006\u0012\b\b\u0002\u00108\u001a\u00020\u0006\u0012\b\b\u0002\u0010<\u001a\u00020\u0006\u0012\b\b\u0002\u0010@\u001a\u00020\u0006\u0012\b\b\u0002\u0010D\u001a\u00020\u0006\u0012\b\b\u0002\u0010H\u001a\u00020\u0006\u0012\b\b\u0002\u0010L\u001a\u00020\u0006\u0012\b\b\u0002\u0010P\u001a\u00020\u0006\u0012\b\b\u0002\u0010T\u001a\u00020\u0006\u0012\b\b\u0002\u0010X\u001a\u00020\u0006\u0012\b\b\u0002\u0010\\\u001a\u00020\u0006¢\u0006\u0004\b]\u0010^J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010 R\"\u0010)\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010 R\"\u0010-\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\n\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\n\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010 R\"\u00104\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010 R\"\u00108\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010 R\"\u0010<\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010 R\"\u0010@\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010 R\"\u0010D\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010 R\"\u0010H\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010 R\"\u0010L\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010 R\"\u0010P\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010 R\"\u0010T\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010 R\"\u0010X\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010\n\u001a\u0004\bV\u0010\f\"\u0004\bW\u0010 R\"\u0010\\\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\f\"\u0004\b[\u0010 ¨\u0006_"}, d2 = {"Lcom/veridas/detect/sequence/score/Score;", "", "", "toString", "", "reset", "", "requiredHits", "updateRequiredHits", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxFalseNegatives", "()I", "maxFalseNegatives", "b", "getMinRequiredHits", "minRequiredHits", "", "c", "D", "getRequiredHitsMultiplier", "()D", "requiredHitsMultiplier", "d", "getRequiredHitsFarMultiplier", "requiredHitsFarMultiplier", "e", "getWeight", "weight", "f", "getExtremelyFarThreshold", "setExtremelyFarThreshold", "(I)V", "extremelyFarThreshold", "g", "getFarDistanceThreshold", "setFarDistanceThreshold", "farDistanceThreshold", "h", "getMiddleDistanceThreshold", "setMiddleDistanceThreshold", "middleDistanceThreshold", "i", "getNotCenteredThreshold", "setNotCenteredThreshold", "notCenteredThreshold", "j", "getRequiredHits", "setRequiredHits", "k", "getRequiredHitsThreshold", "setRequiredHitsThreshold", "requiredHitsThreshold", "l", "getVeryCloseThreshold", "setVeryCloseThreshold", "veryCloseThreshold", "m", "getCentered", "setCentered", "centered", "n", "getCenteredFalseNegatives", "setCenteredFalseNegatives", "centeredFalseNegatives", "o", "getClose", "setClose", HearingDisabilitiesConstants.CLOSE_MODAL, "p", "getFalseNegatives", "setFalseNegatives", "falseNegatives", "q", "getFar", "setFar", "far", "r", "getNotCentered", "setNotCentered", "notCentered", "s", "getNotFound", "setNotFound", DeepLinkListenerAdapter.Constants.STATUS_NOT_FOUND, "t", "getTotal", "setTotal", "total", "u", "getRectangleDetected", "setRectangleDetected", "rectangleDetected", "<init>", "(IIDDIIIIIIIIIIIIIIIII)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public class Score {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int maxFalseNegatives;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int minRequiredHits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double requiredHitsMultiplier;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final double requiredHitsFarMultiplier;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int weight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int extremelyFarThreshold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int farDistanceThreshold;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int middleDistanceThreshold;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int notCenteredThreshold;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int requiredHits;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int requiredHitsThreshold;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int veryCloseThreshold;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int centered;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int centeredFalseNegatives;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int close;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int falseNegatives;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int far;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public int notCentered;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int notFound;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int total;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public int rectangleDetected;

    public Score() {
        this(0, 0, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null);
    }

    public final int getCentered() {
        return this.centered;
    }

    public final int getCenteredFalseNegatives() {
        return this.centeredFalseNegatives;
    }

    public final int getClose() {
        return this.close;
    }

    public final int getExtremelyFarThreshold() {
        return this.extremelyFarThreshold;
    }

    public final int getFalseNegatives() {
        return this.falseNegatives;
    }

    public final int getFar() {
        return this.far;
    }

    public final int getFarDistanceThreshold() {
        return this.farDistanceThreshold;
    }

    public final int getMaxFalseNegatives() {
        return this.maxFalseNegatives;
    }

    public final int getMiddleDistanceThreshold() {
        return this.middleDistanceThreshold;
    }

    public final int getMinRequiredHits() {
        return this.minRequiredHits;
    }

    public final int getNotCentered() {
        return this.notCentered;
    }

    public final int getNotCenteredThreshold() {
        return this.notCenteredThreshold;
    }

    public final int getNotFound() {
        return this.notFound;
    }

    public final int getRectangleDetected() {
        return this.rectangleDetected;
    }

    public final int getRequiredHits() {
        return this.requiredHits;
    }

    public final double getRequiredHitsFarMultiplier() {
        return this.requiredHitsFarMultiplier;
    }

    public final double getRequiredHitsMultiplier() {
        return this.requiredHitsMultiplier;
    }

    public final int getRequiredHitsThreshold() {
        return this.requiredHitsThreshold;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getVeryCloseThreshold() {
        return this.veryCloseThreshold;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final void reset() {
        this.total = 0;
        this.centered = 0;
        this.notCentered = 0;
        this.notFound = 0;
        this.far = 0;
        this.close = 0;
        this.falseNegatives = 0;
        this.centeredFalseNegatives = 0;
        this.rectangleDetected = 0;
    }

    public final void setCentered(int i10) {
        this.centered = i10;
    }

    public final void setCenteredFalseNegatives(int i10) {
        this.centeredFalseNegatives = i10;
    }

    public final void setClose(int i10) {
        this.close = i10;
    }

    public final void setExtremelyFarThreshold(int i10) {
        this.extremelyFarThreshold = i10;
    }

    public final void setFalseNegatives(int i10) {
        this.falseNegatives = i10;
    }

    public final void setFar(int i10) {
        this.far = i10;
    }

    public final void setFarDistanceThreshold(int i10) {
        this.farDistanceThreshold = i10;
    }

    public final void setMiddleDistanceThreshold(int i10) {
        this.middleDistanceThreshold = i10;
    }

    public final void setNotCentered(int i10) {
        this.notCentered = i10;
    }

    public final void setNotCenteredThreshold(int i10) {
        this.notCenteredThreshold = i10;
    }

    public final void setNotFound(int i10) {
        this.notFound = i10;
    }

    public final void setRectangleDetected(int i10) {
        this.rectangleDetected = i10;
    }

    public final void setRequiredHits(int i10) {
        this.requiredHits = i10;
    }

    public final void setRequiredHitsThreshold(int i10) {
        this.requiredHitsThreshold = i10;
    }

    public final void setTotal(int i10) {
        this.total = i10;
    }

    public final void setVeryCloseThreshold(int i10) {
        this.veryCloseThreshold = i10;
    }

    @NotNull
    public String toString() {
        String name = getClass().getName();
        int i10 = this.centered;
        int i11 = this.centeredFalseNegatives;
        int i12 = this.close;
        int i13 = this.extremelyFarThreshold;
        int i14 = this.falseNegatives;
        int i15 = this.far;
        int i16 = this.farDistanceThreshold;
        int i17 = this.middleDistanceThreshold;
        int i18 = this.notCentered;
        int i19 = this.notCenteredThreshold;
        int i20 = this.notFound;
        int i21 = this.rectangleDetected;
        int i22 = this.requiredHits;
        int i23 = this.requiredHitsThreshold;
        int i24 = this.total;
        int i25 = this.veryCloseThreshold;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("[centered=");
        sb2.append(i10);
        sb2.append(", centeredFalseNegatives=");
        sb2.append(i11);
        sb2.append(", close=");
        sb2.append(i12);
        sb2.append(", extremelyFarThreshold=");
        sb2.append(i13);
        sb2.append(", falseNegatives=");
        sb2.append(i14);
        sb2.append(", far=");
        sb2.append(i15);
        sb2.append(", farDistanceThreshold=");
        sb2.append(i16);
        sb2.append(", maxFalseNegatives=");
        sb2.append(this.maxFalseNegatives);
        sb2.append(", middleDistanceThreshold=");
        sb2.append(i17);
        sb2.append(", minRequiredHits=");
        sb2.append(this.minRequiredHits);
        sb2.append(", notCentered=");
        sb2.append(i18);
        sb2.append(", notCenteredThreshold=");
        sb2.append(i19);
        sb2.append(", notFound=");
        sb2.append(i20);
        sb2.append(", rectangleDetected=");
        sb2.append(i21);
        sb2.append(", requiredHits=");
        sb2.append(i22);
        sb2.append(", requiredHitsFarMultiplier=");
        sb2.append(this.requiredHitsFarMultiplier);
        sb2.append(", requiredHitsMultiplier=");
        sb2.append(this.requiredHitsMultiplier);
        sb2.append(", requiredHitsThreshold=");
        sb2.append(i23);
        sb2.append(", total=");
        sb2.append(i24);
        sb2.append(", veryCloseThreshold=");
        sb2.append(i25);
        sb2.append(", weight=");
        return a.c(sb2, this.weight, Constant.BRACKET_CLOSE);
    }

    @NotNull
    public final Score updateRequiredHits(int requiredHits) {
        int i10 = this.minRequiredHits;
        if (requiredHits < i10) {
            requiredHits = i10;
        }
        this.requiredHits = requiredHits;
        this.requiredHitsThreshold = c.roundToInt(((double) requiredHits) * this.requiredHitsMultiplier);
        return this;
    }

    public Score(int i10, int i11, double d2, double d3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28) {
        this.maxFalseNegatives = i10;
        this.minRequiredHits = i11;
        this.requiredHitsMultiplier = d2;
        this.requiredHitsFarMultiplier = d3;
        this.weight = i12;
        this.extremelyFarThreshold = i13;
        this.farDistanceThreshold = i14;
        this.middleDistanceThreshold = i15;
        this.notCenteredThreshold = i16;
        this.requiredHits = i17;
        this.requiredHitsThreshold = i18;
        this.veryCloseThreshold = i19;
        this.centered = i20;
        this.centeredFalseNegatives = i21;
        this.close = i22;
        this.falseNegatives = i23;
        this.far = i24;
        this.notCentered = i25;
        this.notFound = i26;
        this.total = i27;
        this.rectangleDetected = i28;
        updateRequiredHits(i17);
    }

    public /* synthetic */ Score(int i10, int i11, double d2, double d3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, DefaultConstructorMarker defaultConstructorMarker) {
        this((i29 & 1) != 0 ? 0 : i10, (i29 & 2) != 0 ? 5 : i11, (i29 & 4) != 0 ? 0.2d : d2, (i29 & 8) != 0 ? 0.5d : d3, (i29 & 16) != 0 ? 2 : i12, (i29 & 32) != 0 ? 50 : i13, (i29 & 64) != 0 ? 50 : i14, (i29 & 128) != 0 ? 50 : i15, (i29 & 256) != 0 ? 50 : i16, (i29 & 512) != 0 ? 50 : i17, (i29 & 1024) != 0 ? 50 : i18, (i29 & 2048) == 0 ? i19 : 50, (i29 & 4096) != 0 ? 0 : i20, (i29 & 8192) != 0 ? 0 : i21, (i29 & 16384) != 0 ? 0 : i22, (i29 & 32768) != 0 ? 0 : i23, (i29 & 65536) != 0 ? 0 : i24, (i29 & 131072) != 0 ? 0 : i25, (i29 & 262144) != 0 ? 0 : i26, (i29 & 524288) != 0 ? 0 : i27, (i29 & 1048576) != 0 ? 0 : i28);
    }
}
