package androidx.camera.core;

import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class ImageReaderFormatRecommender {

    @AutoValue
    public static abstract class FormatCombo {
        public static FormatCombo create(int i10, int i11) {
            return new AutoValue_ImageReaderFormatRecommender_FormatCombo(i10, i11);
        }

        public abstract int imageAnalysisFormat();

        public abstract int imageCaptureFormat();
    }

    private ImageReaderFormatRecommender() {
    }

    public static FormatCombo chooseCombo() {
        return FormatCombo.create(256, 35);
    }
}
