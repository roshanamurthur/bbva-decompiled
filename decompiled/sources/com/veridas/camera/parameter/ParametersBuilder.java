package com.veridas.camera.parameter;

import com.veridas.camera.CameraAction;
import com.veridas.camera.MeteringArea;
import com.veridas.camera.resolution.CaptureResolutionSelectionStrategy;
import com.veridas.camera.resolution.PreviewResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ParametersBuilder {
    void apply();

    void apply(CameraAction cameraAction);

    ParametersBuilder build();

    Resolution getSelectedPictureResolution();

    Resolution getSelectedPreviewResolution();

    Resolution getSelectedVideoResolution();

    ParametersBuilder setAntiBandingMode(Parameter.AntiBandingMode antiBandingMode);

    ParametersBuilder setCaptureMode(Parameter.CaptureMode captureMode);

    ParametersBuilder setCaptureResolutionSelectionStrategy(CaptureResolutionSelectionStrategy captureResolutionSelectionStrategy);

    ParametersBuilder setColorEffectMode(Parameter.ColorEffectMode colorEffectMode);

    ParametersBuilder setExposureCompensation(int i10);

    ParametersBuilder setFlashMode(Parameter.FlashMode flashMode);

    ParametersBuilder setFocusMode(Parameter.FocusMode focusMode);

    ParametersBuilder setFocusMode(List<Parameter.FocusMode> list);

    ParametersBuilder setJpegQualityLevel(int i10);

    ParametersBuilder setMeteringArea(MeteringArea meteringArea);

    ParametersBuilder setMeteringAreas(List<MeteringArea> list);

    ParametersBuilder setPreferredCaptureResolution(Resolution resolution);

    ParametersBuilder setPreferredPreviewResolution(Resolution resolution);

    ParametersBuilder setPreviewResolutionSelectionStrategy(PreviewResolutionSelectionStrategy previewResolutionSelectionStrategy);

    ParametersBuilder setSceneMode(Parameter.SceneMode sceneMode);

    ParametersBuilder setWhiteBalanceMode(Parameter.WhiteBalanceMode whiteBalanceMode);

    ParametersBuilder setZoomLevel(int i10);
}
