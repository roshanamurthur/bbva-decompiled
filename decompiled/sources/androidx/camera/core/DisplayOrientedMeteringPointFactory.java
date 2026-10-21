package androidx.camera.core;

import android.graphics.PointF;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInfoInternal;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class DisplayOrientedMeteringPointFactory extends MeteringPointFactory {

    @NonNull
    private final CameraInfo mCameraInfo;

    @NonNull
    private final Display mDisplay;
    private final float mHeight;
    private final float mWidth;

    public DisplayOrientedMeteringPointFactory(@NonNull Display display, @NonNull CameraInfo cameraInfo, float f6, float f10) {
        this.mWidth = f6;
        this.mHeight = f10;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }

    @Nullable
    private Integer getLensFacing() {
        CameraInfo cameraInfo = this.mCameraInfo;
        if (cameraInfo instanceof CameraInfoInternal) {
            return ((CameraInfoInternal) cameraInfo).getLensFacing();
        }
        return null;
    }

    private int getRelativeCameraOrientation(boolean z10) {
        try {
            int sensorRotationDegrees = this.mCameraInfo.getSensorRotationDegrees(this.mDisplay.getRotation());
            return z10 ? (360 - sensorRotationDegrees) % 360 : sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PointF convertPoint(float f6, float f10) {
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        Integer lensFacing = getLensFacing();
        boolean z10 = lensFacing != null && lensFacing.intValue() == 0;
        int relativeCameraOrientation = getRelativeCameraOrientation(z10);
        if (relativeCameraOrientation != 90 && relativeCameraOrientation != 270) {
            f10 = f6;
            f6 = f10;
            f12 = f11;
            f11 = f12;
        }
        if (relativeCameraOrientation == 90) {
            f6 = f11 - f6;
        } else if (relativeCameraOrientation == 180) {
            f10 = f12 - f10;
            f6 = f11 - f6;
        } else if (relativeCameraOrientation == 270) {
            f10 = f12 - f10;
        }
        if (z10) {
            f10 = f12 - f10;
        }
        return new PointF(f10 / f12, f6 / f11);
    }
}
