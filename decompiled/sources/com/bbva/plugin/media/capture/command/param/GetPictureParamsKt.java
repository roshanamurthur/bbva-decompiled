package com.bbva.plugin.media.capture.command.param;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetPictureParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\b"}, d2 = {"base64", "", "Lcom/bbva/plugin/media/capture/command/param/GetPictureParams;", "grayscale", "monochrome", ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY, "", "showMetadata", "media-capture-plugin_release"}, k = 2, mv = {1, 4, 2})
public final class GetPictureParamsKt {
    public static final boolean base64(@Nullable GetPictureParams getPictureParams) {
        Boolean base64;
        if (getPictureParams == null || (base64 = getPictureParams.getBase64()) == null) {
            return true;
        }
        return base64.booleanValue();
    }

    public static final boolean grayscale(@Nullable GetPictureParams getPictureParams) {
        Boolean grayscale;
        if (getPictureParams == null || (grayscale = getPictureParams.getGrayscale()) == null) {
            return false;
        }
        return grayscale.booleanValue();
    }

    public static final boolean monochrome(@Nullable GetPictureParams getPictureParams) {
        Boolean monochrome;
        if (getPictureParams == null || (monochrome = getPictureParams.getMonochrome()) == null) {
            return false;
        }
        return monochrome.booleanValue();
    }

    public static final int quality(@Nullable GetPictureParams getPictureParams) {
        Integer quality;
        if (getPictureParams == null || (quality = getPictureParams.getQuality()) == null) {
            return 100;
        }
        return quality.intValue();
    }

    public static final boolean showMetadata(@Nullable GetPictureParams getPictureParams) {
        Boolean showMetadata;
        if (getPictureParams == null || (showMetadata = getPictureParams.getShowMetadata()) == null) {
            return false;
        }
        return showMetadata.booleanValue();
    }
}
