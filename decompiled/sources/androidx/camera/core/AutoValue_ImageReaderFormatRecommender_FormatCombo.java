package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ImageReaderFormatRecommender_FormatCombo extends ImageReaderFormatRecommender.FormatCombo {
    private final int imageAnalysisFormat;
    private final int imageCaptureFormat;

    public AutoValue_ImageReaderFormatRecommender_FormatCombo(int i10, int i11) {
        this.imageCaptureFormat = i10;
        this.imageAnalysisFormat = i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageReaderFormatRecommender.FormatCombo)) {
            return false;
        }
        ImageReaderFormatRecommender.FormatCombo formatCombo = (ImageReaderFormatRecommender.FormatCombo) obj;
        return this.imageCaptureFormat == formatCombo.imageCaptureFormat() && this.imageAnalysisFormat == formatCombo.imageAnalysisFormat();
    }

    public int hashCode() {
        return ((this.imageCaptureFormat ^ 1000003) * 1000003) ^ this.imageAnalysisFormat;
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    public int imageAnalysisFormat() {
        return this.imageAnalysisFormat;
    }

    @Override // androidx.camera.core.ImageReaderFormatRecommender.FormatCombo
    public int imageCaptureFormat() {
        return this.imageCaptureFormat;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FormatCombo{imageCaptureFormat=");
        sb2.append(this.imageCaptureFormat);
        sb2.append(", imageAnalysisFormat=");
        return androidx.appcompat.widget.a.c(sb2, this.imageAnalysisFormat, "}");
    }
}
