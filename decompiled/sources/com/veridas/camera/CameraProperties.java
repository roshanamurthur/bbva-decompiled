package com.veridas.camera;

import com.veridas.camera.parameter.Parameter;
import com.veridas.camera.resolution.Resolution;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface CameraProperties {
    Parameter.FlashMode getFlashMode();

    Parameter.FocusMode getFocusMode();

    Resolution getPictureResolution();

    Resolution getPreviewResolution();

    List<int[]> getSupportedPreviewFpsRange();

    Resolution getVideoResolution();

    boolean isAutoFocusAvailable();
}
