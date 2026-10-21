package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.g0;
import androidx.camera.core.Logger;
import com.budiyev.android.codescanner.BarcodeUtils;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        throw new IllegalStateException(g0.c("Invalid sensor rotation: ", i10));
    }

    public static int getRelativeImageRotation(int i10, int i11, boolean z10) {
        int i12 = z10 ? ((i11 - i10) + 360) % 360 : (i11 + i10) % 360;
        if (Logger.isDebugEnabled(TAG)) {
            Logger.d(TAG, String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)));
        }
        return i12;
    }

    public static int surfaceRotationToDegrees(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return BarcodeUtils.ROTATION_270;
        }
        throw new IllegalArgumentException(g0.c("Unsupported surface rotation: ", i10));
    }
}
