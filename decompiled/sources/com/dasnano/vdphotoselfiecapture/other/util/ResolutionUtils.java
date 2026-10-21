package com.dasnano.vdphotoselfiecapture.other.util;

import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.veridas.camera.resolution.Resolution;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ResolutionUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/other/util/ResolutionUtils;", "", "()V", "getDesiredResolution", "Lcom/veridas/camera/resolution/Resolution;", VDPhotoSelfieConfiguration.DESIRED_WIDTH, "", "resolution", "isLandscapeOrientation", "", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResolutionUtils {

    @NotNull
    public static final ResolutionUtils INSTANCE = new ResolutionUtils();

    @JvmStatic
    @NotNull
    public static final Resolution getDesiredResolution(int desiredWidth, @NotNull Resolution resolution, boolean isLandscapeOrientation) {
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        if (desiredWidth != 0) {
            resolution = isLandscapeOrientation ? Resolution.create((resolution.height * desiredWidth) / resolution.width, desiredWidth) : Resolution.create(desiredWidth, (resolution.height * desiredWidth) / resolution.width);
            Intrinsics.checkNotNull(resolution);
        }
        return resolution;
    }
}
