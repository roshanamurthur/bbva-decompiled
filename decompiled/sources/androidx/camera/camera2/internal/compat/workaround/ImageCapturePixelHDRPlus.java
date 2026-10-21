package androidx.camera.camera2.internal.compat.workaround;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
public class ImageCapturePixelHDRPlus {
    @SuppressLint({"NewApi"})
    public void toggleHDRPlus(int i10, @NonNull Camera2ImplConfig.Builder builder) {
        if (((ImageCapturePixelHDRPlusQuirk) DeviceQuirks.get(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i10 == 0) {
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i10 != 1) {
                return;
            }
            builder.setCaptureRequestOption(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
