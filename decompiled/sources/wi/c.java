package wi;

import android.hardware.Camera;
import com.veridas.camera.CameraProperties;
import com.veridas.camera.parameter.Parameter;
import com.veridas.camera.resolution.Resolution;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: CameraOneCameraProperties.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements CameraProperties {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Camera.Parameters f94265b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f94264a = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f94266c = Arrays.asList("edof", "fixed", "infinity");

    public c(Camera camera) {
        this.f94265b = camera.getParameters();
    }

    @Override // com.veridas.camera.CameraProperties
    public final Parameter.FlashMode getFlashMode() {
        return (Parameter.FlashMode) this.f94264a.translate(Parameter.FlashMode.class, this.f94265b.getFlashMode());
    }

    @Override // com.veridas.camera.CameraProperties
    public final Parameter.FocusMode getFocusMode() {
        return (Parameter.FocusMode) this.f94264a.translate(Parameter.FocusMode.class, this.f94265b.getFocusMode());
    }

    @Override // com.veridas.camera.CameraProperties
    public final Resolution getPictureResolution() {
        Camera.Parameters parameters = this.f94265b;
        if (parameters != null) {
            return Resolution.from(parameters.getPictureSize());
        }
        return null;
    }

    @Override // com.veridas.camera.CameraProperties
    public final Resolution getPreviewResolution() {
        Camera.Parameters parameters = this.f94265b;
        if (parameters != null) {
            return Resolution.from(parameters.getPreviewSize());
        }
        return null;
    }

    @Override // com.veridas.camera.CameraProperties
    public final List<int[]> getSupportedPreviewFpsRange() {
        Camera.Parameters parameters = this.f94265b;
        if (parameters != null) {
            return parameters.getSupportedPreviewFpsRange();
        }
        return null;
    }

    @Override // com.veridas.camera.CameraProperties
    public final Resolution getVideoResolution() {
        Camera.Parameters parameters = this.f94265b;
        if (parameters != null) {
            return Resolution.from(parameters.getPictureSize());
        }
        return null;
    }

    @Override // com.veridas.camera.CameraProperties
    public final boolean isAutoFocusAvailable() {
        String focusMode;
        Camera.Parameters parameters = this.f94265b;
        return (parameters == null || (focusMode = parameters.getFocusMode()) == null || this.f94266c.contains(focusMode)) ? false : true;
    }
}
