package com.veridas.detect;

import androidx.annotation.Keep;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageAnalysis.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b.\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0002\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\u0095\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\u0013\u00105\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0005HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#¨\u0006:"}, d2 = {"Lcom/veridas/detect/ImageAnalysis;", "", "underExposureDetectionEnabled", "", "underExposureThreshold", "", "overExposureDetectionEnabled", "overExposureThreshold", "outOfFocusDetectionEnabled", "outOfFocusThreshold", "", "detectLightBlobs", "lightBlobMinArea", "lightBlobMaxArea", "lightBlobIntensity", "detectCameraFlash", "cameraFlashMinArea", "cameraFlashMaxArea", "cameraFlashIntensity", "(ZIZIZDZDDDZDDD)V", "getCameraFlashIntensity", "()D", "getCameraFlashMaxArea", "getCameraFlashMinArea", "getDetectCameraFlash", "()Z", "getDetectLightBlobs", "isImageAnalysisEnabled", "getLightBlobIntensity", "getLightBlobMaxArea", "getLightBlobMinArea", "getOutOfFocusDetectionEnabled", "getOutOfFocusThreshold", "getOverExposureDetectionEnabled", "getOverExposureThreshold", "()I", "getUnderExposureDetectionEnabled", "getUnderExposureThreshold", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ImageAnalysis {
    private final double cameraFlashIntensity;
    private final double cameraFlashMaxArea;
    private final double cameraFlashMinArea;
    private final boolean detectCameraFlash;
    private final boolean detectLightBlobs;
    private final boolean isImageAnalysisEnabled;
    private final double lightBlobIntensity;
    private final double lightBlobMaxArea;
    private final double lightBlobMinArea;
    private final boolean outOfFocusDetectionEnabled;
    private final double outOfFocusThreshold;
    private final boolean overExposureDetectionEnabled;
    private final int overExposureThreshold;
    private final boolean underExposureDetectionEnabled;
    private final int underExposureThreshold;

    public ImageAnalysis() {
        this(false, 0, false, 0, false, 0.0d, false, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUnderExposureDetectionEnabled() {
        return this.underExposureDetectionEnabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getLightBlobIntensity() {
        return this.lightBlobIntensity;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getDetectCameraFlash() {
        return this.detectCameraFlash;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getCameraFlashMinArea() {
        return this.cameraFlashMinArea;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getCameraFlashMaxArea() {
        return this.cameraFlashMaxArea;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getCameraFlashIntensity() {
        return this.cameraFlashIntensity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnderExposureThreshold() {
        return this.underExposureThreshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getOverExposureDetectionEnabled() {
        return this.overExposureDetectionEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOverExposureThreshold() {
        return this.overExposureThreshold;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getOutOfFocusDetectionEnabled() {
        return this.outOfFocusDetectionEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getOutOfFocusThreshold() {
        return this.outOfFocusThreshold;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDetectLightBlobs() {
        return this.detectLightBlobs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getLightBlobMinArea() {
        return this.lightBlobMinArea;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getLightBlobMaxArea() {
        return this.lightBlobMaxArea;
    }

    @NotNull
    public final ImageAnalysis copy(boolean underExposureDetectionEnabled, int underExposureThreshold, boolean overExposureDetectionEnabled, int overExposureThreshold, boolean outOfFocusDetectionEnabled, double outOfFocusThreshold, boolean detectLightBlobs, double lightBlobMinArea, double lightBlobMaxArea, double lightBlobIntensity, boolean detectCameraFlash, double cameraFlashMinArea, double cameraFlashMaxArea, double cameraFlashIntensity) {
        return new ImageAnalysis(underExposureDetectionEnabled, underExposureThreshold, overExposureDetectionEnabled, overExposureThreshold, outOfFocusDetectionEnabled, outOfFocusThreshold, detectLightBlobs, lightBlobMinArea, lightBlobMaxArea, lightBlobIntensity, detectCameraFlash, cameraFlashMinArea, cameraFlashMaxArea, cameraFlashIntensity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageAnalysis)) {
            return false;
        }
        ImageAnalysis imageAnalysis = (ImageAnalysis) other;
        return this.underExposureDetectionEnabled == imageAnalysis.underExposureDetectionEnabled && this.underExposureThreshold == imageAnalysis.underExposureThreshold && this.overExposureDetectionEnabled == imageAnalysis.overExposureDetectionEnabled && this.overExposureThreshold == imageAnalysis.overExposureThreshold && this.outOfFocusDetectionEnabled == imageAnalysis.outOfFocusDetectionEnabled && Double.compare(this.outOfFocusThreshold, imageAnalysis.outOfFocusThreshold) == 0 && this.detectLightBlobs == imageAnalysis.detectLightBlobs && Double.compare(this.lightBlobMinArea, imageAnalysis.lightBlobMinArea) == 0 && Double.compare(this.lightBlobMaxArea, imageAnalysis.lightBlobMaxArea) == 0 && Double.compare(this.lightBlobIntensity, imageAnalysis.lightBlobIntensity) == 0 && this.detectCameraFlash == imageAnalysis.detectCameraFlash && Double.compare(this.cameraFlashMinArea, imageAnalysis.cameraFlashMinArea) == 0 && Double.compare(this.cameraFlashMaxArea, imageAnalysis.cameraFlashMaxArea) == 0 && Double.compare(this.cameraFlashIntensity, imageAnalysis.cameraFlashIntensity) == 0;
    }

    public final double getCameraFlashIntensity() {
        return this.cameraFlashIntensity;
    }

    public final double getCameraFlashMaxArea() {
        return this.cameraFlashMaxArea;
    }

    public final double getCameraFlashMinArea() {
        return this.cameraFlashMinArea;
    }

    public final boolean getDetectCameraFlash() {
        return this.detectCameraFlash;
    }

    public final boolean getDetectLightBlobs() {
        return this.detectLightBlobs;
    }

    public final double getLightBlobIntensity() {
        return this.lightBlobIntensity;
    }

    public final double getLightBlobMaxArea() {
        return this.lightBlobMaxArea;
    }

    public final double getLightBlobMinArea() {
        return this.lightBlobMinArea;
    }

    public final boolean getOutOfFocusDetectionEnabled() {
        return this.outOfFocusDetectionEnabled;
    }

    public final double getOutOfFocusThreshold() {
        return this.outOfFocusThreshold;
    }

    public final boolean getOverExposureDetectionEnabled() {
        return this.overExposureDetectionEnabled;
    }

    public final int getOverExposureThreshold() {
        return this.overExposureThreshold;
    }

    public final boolean getUnderExposureDetectionEnabled() {
        return this.underExposureDetectionEnabled;
    }

    public final int getUnderExposureThreshold() {
        return this.underExposureThreshold;
    }

    public int hashCode() {
        int i10 = (((((((((this.underExposureDetectionEnabled ? 1231 : 1237) * 31) + this.underExposureThreshold) * 31) + (this.overExposureDetectionEnabled ? 1231 : 1237)) * 31) + this.overExposureThreshold) * 31) + (this.outOfFocusDetectionEnabled ? 1231 : 1237)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.outOfFocusThreshold);
        int i11 = (((i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + (this.detectLightBlobs ? 1231 : 1237)) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.lightBlobMinArea);
        int i12 = (i11 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.lightBlobMaxArea);
        int i13 = (i12 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.lightBlobIntensity);
        int i14 = (((i13 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + (this.detectCameraFlash ? 1231 : 1237)) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.cameraFlashMinArea);
        int i15 = (i14 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.cameraFlashMaxArea);
        int i16 = (i15 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.cameraFlashIntensity);
        return i16 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
    }

    /* JADX INFO: renamed from: isImageAnalysisEnabled, reason: from getter */
    public final boolean getIsImageAnalysisEnabled() {
        return this.isImageAnalysisEnabled;
    }

    @NotNull
    public String toString() {
        boolean z10 = this.underExposureDetectionEnabled;
        int i10 = this.underExposureThreshold;
        boolean z11 = this.overExposureDetectionEnabled;
        int i11 = this.overExposureThreshold;
        boolean z12 = this.outOfFocusDetectionEnabled;
        double d2 = this.outOfFocusThreshold;
        boolean z13 = this.detectLightBlobs;
        double d3 = this.lightBlobMinArea;
        double d7 = this.lightBlobMaxArea;
        double d10 = this.lightBlobIntensity;
        boolean z14 = this.detectCameraFlash;
        double d11 = this.cameraFlashMinArea;
        double d12 = this.cameraFlashMaxArea;
        double d13 = this.cameraFlashIntensity;
        StringBuilder sb2 = new StringBuilder("ImageAnalysis(underExposureDetectionEnabled=");
        sb2.append(z10);
        sb2.append(", underExposureThreshold=");
        sb2.append(i10);
        sb2.append(", overExposureDetectionEnabled=");
        sb2.append(z11);
        sb2.append(", overExposureThreshold=");
        sb2.append(i11);
        sb2.append(", outOfFocusDetectionEnabled=");
        sb2.append(z12);
        sb2.append(", outOfFocusThreshold=");
        sb2.append(d2);
        sb2.append(", detectLightBlobs=");
        sb2.append(z13);
        sb2.append(", lightBlobMinArea=");
        sb2.append(d3);
        v.f(sb2, ", lightBlobMaxArea=", d7, ", lightBlobIntensity=");
        sb2.append(d10);
        sb2.append(", detectCameraFlash=");
        sb2.append(z14);
        v.f(sb2, ", cameraFlashMinArea=", d11, ", cameraFlashMaxArea=");
        sb2.append(d12);
        sb2.append(", cameraFlashIntensity=");
        sb2.append(d13);
        sb2.append(")");
        return sb2.toString();
    }

    public ImageAnalysis(boolean z10, int i10, boolean z11, int i11, boolean z12, double d2, boolean z13, double d3, double d7, double d10, boolean z14, double d11, double d12, double d13) {
        this.underExposureDetectionEnabled = z10;
        this.underExposureThreshold = i10;
        this.overExposureDetectionEnabled = z11;
        this.overExposureThreshold = i11;
        this.outOfFocusDetectionEnabled = z12;
        this.outOfFocusThreshold = d2;
        this.detectLightBlobs = z13;
        this.lightBlobMinArea = d3;
        this.lightBlobMaxArea = d7;
        this.lightBlobIntensity = d10;
        this.detectCameraFlash = z14;
        this.cameraFlashMinArea = d11;
        this.cameraFlashMaxArea = d12;
        this.cameraFlashIntensity = d13;
        this.isImageAnalysisEnabled = z10 || z11 || z12 || z13 || z14;
    }

    public /* synthetic */ ImageAnalysis(boolean z10, int i10, boolean z11, int i11, boolean z12, double d2, boolean z13, double d3, double d7, double d10, boolean z14, double d11, double d12, double d13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? 35 : i10, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? ImageAnalysisKt.OVER_EXPOSED_THRESHOLD : i11, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? 600.0d : d2, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? 2500.0d : d3, (i12 & 256) != 0 ? 250000.0d : d7, (i12 & 512) != 0 ? 245.0d : d10, (i12 & 1024) == 0 ? z14 : false, (i12 & 2048) != 0 ? 225.0d : d11, (i12 & 4096) != 0 ? 90000.0d : d12, (i12 & 8192) == 0 ? d13 : 245.0d);
    }
}
