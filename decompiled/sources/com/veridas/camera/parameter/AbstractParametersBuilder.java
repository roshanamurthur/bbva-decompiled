package com.veridas.camera.parameter;

import com.veridas.camera.MeteringArea;
import com.veridas.camera.resolution.CaptureResolutionSelectionStrategy;
import com.veridas.camera.resolution.LargestCaptureResolutionSelectionStrategy;
import com.veridas.camera.resolution.LargestPreviewResolutionSelectionStrategy;
import com.veridas.camera.resolution.PreviewResolutionSelectionStrategy;
import com.veridas.camera.resolution.Resolution;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractParametersBuilder implements ParametersBuilder {
    protected Parameter.AntiBandingMode antiBandingMode;
    protected Parameter.CaptureMode captureMode;
    protected Parameter.ColorEffectMode colorEffectMode;
    protected Integer exposureCompensation;
    protected Parameter.FlashMode flashMode;
    protected Parameter.FocusMode focusMode;
    protected Integer jpegQualityLevel;
    protected Resolution preferredCaptureResolution;
    protected Resolution preferredPreviewResolution;
    protected Parameter.SceneMode sceneMode;
    protected Parameter.WhiteBalanceMode whiteBalanceMode;
    protected Integer zoomLevel;
    protected CaptureResolutionSelectionStrategy captureResolutionSelectionStrategy = new LargestCaptureResolutionSelectionStrategy();
    protected List<Parameter.FocusMode> focusModes = new ArrayList();
    protected List<MeteringArea> meteringAreas = new ArrayList();
    protected PreviewResolutionSelectionStrategy previewResolutionSelectionStrategy = new LargestPreviewResolutionSelectionStrategy();

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setAntiBandingMode(Parameter.AntiBandingMode antiBandingMode) {
        if (antiBandingMode == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.antiBandingMode = antiBandingMode;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setCaptureMode(Parameter.CaptureMode captureMode) {
        this.captureMode = captureMode;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public final ParametersBuilder setCaptureResolutionSelectionStrategy(CaptureResolutionSelectionStrategy captureResolutionSelectionStrategy) {
        if (captureResolutionSelectionStrategy == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.captureResolutionSelectionStrategy = captureResolutionSelectionStrategy;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setColorEffectMode(Parameter.ColorEffectMode colorEffectMode) {
        if (colorEffectMode == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.colorEffectMode = colorEffectMode;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setExposureCompensation(int i10) {
        this.exposureCompensation = Integer.valueOf(i10);
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setFlashMode(Parameter.FlashMode flashMode) {
        if (flashMode == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.flashMode = flashMode;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setFocusMode(Parameter.FocusMode focusMode) {
        if (focusMode == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.focusMode = focusMode;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setJpegQualityLevel(int i10) {
        this.jpegQualityLevel = Integer.valueOf(i10);
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setMeteringArea(MeteringArea meteringArea) {
        if (meteringArea == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        ArrayList arrayList = new ArrayList();
        this.meteringAreas = arrayList;
        arrayList.add(meteringArea);
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setMeteringAreas(List<MeteringArea> list) {
        if (list == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.meteringAreas = list;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setPreferredCaptureResolution(Resolution resolution) {
        if (resolution == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.preferredCaptureResolution = resolution;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setPreferredPreviewResolution(Resolution resolution) {
        if (resolution == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.preferredPreviewResolution = resolution;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public final ParametersBuilder setPreviewResolutionSelectionStrategy(PreviewResolutionSelectionStrategy previewResolutionSelectionStrategy) {
        if (previewResolutionSelectionStrategy == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.previewResolutionSelectionStrategy = previewResolutionSelectionStrategy;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setSceneMode(Parameter.SceneMode sceneMode) {
        if (sceneMode == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.sceneMode = sceneMode;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setWhiteBalanceMode(Parameter.WhiteBalanceMode whiteBalanceMode) {
        if (whiteBalanceMode == null) {
            throw new IllegalArgumentException("Argument cannot be null.");
        }
        this.whiteBalanceMode = whiteBalanceMode;
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setZoomLevel(int i10) {
        this.zoomLevel = Integer.valueOf(i10);
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public ParametersBuilder setFocusMode(List<Parameter.FocusMode> list) {
        if (list != null) {
            this.focusModes = list;
            return this;
        }
        throw new IllegalArgumentException("Argument cannot be null.");
    }
}
