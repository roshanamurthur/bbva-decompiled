package wi;

import android.graphics.Rect;
import android.hardware.Camera;
import androidx.camera.camera2.internal.compat.u;
import com.veridas.camera.CameraAction;
import com.veridas.camera.MeteringArea;
import com.veridas.camera.one.CameraOneCamera;
import com.veridas.camera.parameter.AbstractParametersBuilder;
import com.veridas.camera.parameter.Parameter;
import com.veridas.camera.parameter.ParametersBuilder;
import com.veridas.camera.resolution.Resolution;
import com.veridas.log.Log;
import com.veridas.util.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: CameraOneParametersBuilder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends AbstractParametersBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f94276a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraOneCamera f94277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Camera.Parameters f94278c;

    public g(CameraOneCamera cameraOneCamera) {
        this.f94277b = cameraOneCamera;
        this.f94278c = cameraOneCamera.J0.getParameters();
    }

    public static boolean a(List list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public static boolean b(String str, List list) {
        if (str == null) {
            throw new IllegalArgumentException("parameterName cannot be null");
        }
        if (list != null) {
            return list.contains(str);
        }
        throw new IllegalArgumentException("parameterNames cannot be null");
    }

    public static boolean c(List list, Resolution resolution) {
        if (resolution != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Resolution resolution2 = (Resolution) it.next();
                if (resolution2.width == resolution.width && resolution2.height == resolution.height) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String d(List list) {
        int size = list != null ? list.size() : 0;
        Iterator it = list.iterator();
        String[] strArr = new String[size];
        int i10 = 0;
        while (it.hasNext()) {
            Resolution resolution = (Resolution) it.next();
            strArr[i10] = String.format(Locale.ROOT, "%dx%d", Integer.valueOf(resolution.width), Integer.valueOf(resolution.height));
            i10++;
        }
        return StringUtil.convertToString(strArr);
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public final void apply(CameraAction cameraAction) {
        CameraOneCamera cameraOneCamera = this.f94277b;
        cameraOneCamera.getClass();
        cameraOneCamera.i(new com.veridas.camera.one.a(cameraOneCamera, this.f94278c, cameraAction));
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public final ParametersBuilder build() {
        List<Resolution> listConvert;
        Parameter.AntiBandingMode antiBandingMode = this.antiBandingMode;
        f fVar = this.f94276a;
        Camera.Parameters parameters = this.f94278c;
        if (antiBandingMode != null) {
            List<String> supportedAntibanding = parameters.getSupportedAntibanding();
            String str = (String) fVar.translate(this.antiBandingMode);
            if (a(supportedAntibanding)) {
                String str2 = com.veridas.camera.Camera.LOG_TAG;
                Log.i(str2, "Available anti banding modes: [%s].", StringUtil.convertToString(supportedAntibanding));
                if (b(str, supportedAntibanding)) {
                    parameters.setAntibanding(str);
                    Log.i(str2, "Anti banding mode set to: \"%s\".", str);
                } else {
                    Log.e(str2, "Parameter \"%s\" is not a supported value.", str);
                }
            } else {
                Log.w(com.veridas.camera.Camera.LOG_TAG, "No anti banding modes available.");
            }
        }
        if (this.colorEffectMode != null) {
            List<String> supportedColorEffects = parameters.getSupportedColorEffects();
            String str3 = (String) fVar.translate(this.colorEffectMode);
            String str4 = com.veridas.camera.Camera.LOG_TAG;
            Log.i(str4, "Available color effect modes: %s.", StringUtil.convertToString(supportedColorEffects));
            if (!a(supportedColorEffects)) {
                Log.w(str4, "No color effect modes available.");
            } else if (b(str3, supportedColorEffects)) {
                parameters.setColorEffect(str3);
                Log.i(str4, "Color effect mode set to: \"%s\".", str3);
            } else {
                Log.e(str4, "Parameter \"%s\" is not a supported value.", str3);
            }
        }
        if (this.exposureCompensation != null) {
            int minExposureCompensation = parameters.getMinExposureCompensation();
            if (this.exposureCompensation.intValue() >= minExposureCompensation) {
                int maxExposureCompensation = parameters.getMaxExposureCompensation();
                if (this.exposureCompensation.intValue() <= maxExposureCompensation) {
                    parameters.setExposureCompensation(this.exposureCompensation.intValue());
                    Log.i(com.veridas.camera.Camera.LOG_TAG, "Exposure compensation level set to: %d.", this.exposureCompensation);
                } else {
                    Log.w(com.veridas.camera.Camera.LOG_TAG, "Exposure compensation level (%d) is larger than the maximum level (%d)", this.exposureCompensation, Integer.valueOf(maxExposureCompensation));
                }
            } else {
                Log.w(com.veridas.camera.Camera.LOG_TAG, "Exposure compensation level (%d) is smaller than the minimum level (%d)", this.exposureCompensation, Integer.valueOf(minExposureCompensation));
            }
        }
        if (this.flashMode != null) {
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            String str5 = (String) fVar.translate(this.flashMode);
            String str6 = com.veridas.camera.Camera.LOG_TAG;
            Log.i(str6, "Available flash modes: %s.", StringUtil.convertToString(supportedFlashModes));
            if (!a(supportedFlashModes)) {
                Log.w(str6, "No flash modes available.");
            } else if (b(str5, supportedFlashModes)) {
                parameters.setFlashMode(str5);
                Log.i(str6, "Flash mode set to: \"%s\".", str5);
            } else {
                Log.e(str6, "Parameter \"%s\" is not a supported value.", str5);
            }
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (a(supportedFocusModes)) {
            String str7 = com.veridas.camera.Camera.LOG_TAG;
            Log.i(str7, "Available focus modes: %s.", StringUtil.convertToString(supportedFocusModes));
            if (this.focusModes.isEmpty()) {
                Parameter.FocusMode focusMode = this.focusMode;
                if (focusMode != null) {
                    String str8 = (String) fVar.translate(focusMode);
                    if (b(str8, supportedFocusModes)) {
                        parameters.setFocusMode(str8);
                        Log.i(str7, "Focus mode set to: \"%s\".", str8);
                    } else {
                        Log.e(str7, "Parameter \"%s\" is not a supported value.", str8);
                    }
                }
            } else {
                Iterator<Parameter.FocusMode> it = this.focusModes.iterator();
                boolean z10 = false;
                while (!z10 && it.hasNext()) {
                    String str9 = (String) fVar.translate(it.next());
                    if (b(str9, supportedFocusModes)) {
                        parameters.setFocusMode(str9);
                        Log.i(com.veridas.camera.Camera.LOG_TAG, "Focus mode set to: \"%s\".", str9);
                        z10 = true;
                    } else {
                        String str10 = com.veridas.camera.Camera.LOG_TAG;
                        Log.e(str10, "Parameter \"%s\" is not a supported value.", str9);
                        Log.e(str10, "Available focus modes: %s.", StringUtil.convertToString(supportedFocusModes));
                    }
                }
            }
        } else {
            Log.w(com.veridas.camera.Camera.LOG_TAG, "No focus modes available.");
        }
        Integer num = this.jpegQualityLevel;
        if (num != null) {
            if (num.intValue() >= 0 || this.jpegQualityLevel.intValue() <= 100) {
                parameters.setJpegQuality(this.jpegQualityLevel.intValue());
            } else {
                Log.e(com.veridas.camera.Camera.LOG_TAG, "JPEG Quality level is out of range (%d), it must be between 0 and 100.", this.jpegQualityLevel);
            }
        }
        List<MeteringArea> list = this.meteringAreas;
        if (list != null && !list.isEmpty()) {
            int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
            int size = this.meteringAreas.size();
            if (maxNumMeteringAreas > 0) {
                int i10 = size > maxNumMeteringAreas ? maxNumMeteringAreas : size;
                if (size > maxNumMeteringAreas) {
                    Log.w(com.veridas.camera.Camera.LOG_TAG, "There are more metering areas (%d) declared than supported (%d), %d will be set.", Integer.valueOf(size), Integer.valueOf(maxNumMeteringAreas), Integer.valueOf(i10));
                }
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < i10; i11++) {
                    MeteringArea meteringArea = this.meteringAreas.get(i11);
                    int i12 = meteringArea.f66600x;
                    int i13 = meteringArea.f66601y;
                    arrayList.add(new Camera.Area(new Rect(i12, i13, meteringArea.width + i12, meteringArea.height + i13), meteringArea.weight));
                }
                parameters.setMeteringAreas(arrayList);
            } else {
                Log.w(com.veridas.camera.Camera.LOG_TAG, "Metering areas are not supported.");
            }
        }
        if (this.preferredCaptureResolution != null) {
            List<Resolution> listConvert2 = Resolution.convert(parameters.getSupportedPreviewSizes());
            if (this.captureMode == Parameter.CaptureMode.PICTURE) {
                listConvert = Resolution.convert(parameters.getSupportedPictureSizes());
            } else {
                List<Resolution> listConvert3 = Resolution.convert(parameters.getSupportedPictureSizes());
                List<Resolution> listConvert4 = Resolution.convert(parameters.getSupportedVideoSizes());
                ArrayList arrayList2 = new ArrayList();
                for (Resolution resolution : listConvert3) {
                    if (listConvert4.contains(resolution)) {
                        arrayList2.add(resolution);
                    }
                }
                listConvert = arrayList2;
            }
            if (listConvert.isEmpty()) {
                Log.w(com.veridas.camera.Camera.LOG_TAG, "Capture resolution list empty, fallback to preview resolution list.");
            } else {
                listConvert2 = listConvert;
            }
            String str11 = com.veridas.camera.Camera.LOG_TAG;
            Log.i(str11, "Available capture resolution list: %s", d(listConvert2));
            Resolution resolutionSelect = this.captureResolutionSelectionStrategy.select(listConvert2, this.preferredCaptureResolution);
            if (c(listConvert2, resolutionSelect)) {
                parameters.setPictureSize(resolutionSelect.width, resolutionSelect.height);
                Log.i(str11, "Capture resolution set to %dx%d", Integer.valueOf(resolutionSelect.width), Integer.valueOf(resolutionSelect.height));
            } else {
                Log.w(str11, "Capture resolution %dx%d is not supported.", Integer.valueOf(resolutionSelect.width), Integer.valueOf(resolutionSelect.height));
            }
        }
        if (this.preferredPreviewResolution != null) {
            List<Resolution> listConvert5 = Resolution.convert(parameters.getSupportedPreviewSizes());
            String str12 = com.veridas.camera.Camera.LOG_TAG;
            Log.i(str12, "Available preview resolution list: %s", d(listConvert5));
            Resolution resolutionSelect2 = this.previewResolutionSelectionStrategy.select(listConvert5, this.preferredPreviewResolution);
            if (c(listConvert5, resolutionSelect2)) {
                parameters.setPreviewSize(resolutionSelect2.width, resolutionSelect2.height);
                Log.i(str12, "Preview resolution set to %dx%d", Integer.valueOf(resolutionSelect2.width), Integer.valueOf(resolutionSelect2.height));
            } else {
                Log.w(str12, "Preview resolution %dx%d is not supported.", Integer.valueOf(resolutionSelect2.width), Integer.valueOf(resolutionSelect2.height));
            }
        }
        if (this.sceneMode != null) {
            List<String> supportedSceneModes = parameters.getSupportedSceneModes();
            String str13 = com.veridas.camera.Camera.LOG_TAG;
            Log.i(str13, "Available scene modes: %s.", StringUtil.convertToString(supportedSceneModes));
            String str14 = (String) fVar.translate(this.sceneMode);
            if (!a(supportedSceneModes)) {
                Log.w(str13, "No scene modes available.");
            } else if (b(str14, supportedSceneModes)) {
                parameters.setSceneMode(str14);
                Log.i(str13, "Scene mode set to: \"%s\".", str14);
            } else {
                Log.e(str13, "Parameter \"%s\" is not a supported value.", str14);
            }
        }
        if (this.whiteBalanceMode != null) {
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            String str15 = com.veridas.camera.Camera.LOG_TAG;
            Log.i(str15, "Available white balance modes: %s.", StringUtil.convertToString(supportedWhiteBalance));
            String str16 = (String) fVar.translate(this.whiteBalanceMode);
            if (!a(supportedWhiteBalance)) {
                Log.w(str15, "No white balance modes available.");
            } else if (b(str16, supportedWhiteBalance)) {
                parameters.setWhiteBalance(str16);
                Log.i(str15, "White balance mode set to: \"%s\".", str16);
            } else {
                Log.e(str15, "Parameter \"%s\" is not a supported value.", str16);
            }
        }
        if (this.zoomLevel != null) {
            int maxZoom = parameters.getMaxZoom();
            if (maxZoom == 0) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, "Zoom not supported on this device.");
            } else if (this.zoomLevel.intValue() < 0 || this.zoomLevel.intValue() > maxZoom) {
                Log.e(com.veridas.camera.Camera.LOG_TAG, "Zoom level is out of range (%d), it must be between 0 and %d.", this.zoomLevel, Integer.valueOf(maxZoom));
            } else {
                Log.i(com.veridas.camera.Camera.LOG_TAG, "Setting zoom level to %d", this.zoomLevel);
                parameters.setZoom(this.zoomLevel.intValue());
            }
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int size2 = supportedPreviewFpsRange.size();
        int i14 = size2 - 1;
        String strH = "";
        for (int i15 = 0; i15 < size2; i15++) {
            int[] iArr = supportedPreviewFpsRange.get(i15);
            strH = u.h("[%d, %d]", new Object[]{Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])}, androidx.camera.core.impl.utils.c.d(strH));
            if (i15 != i14) {
                strH = u.f(strH, ", ");
            }
        }
        String str17 = com.veridas.camera.Camera.LOG_TAG;
        Log.i(str17, "Supported preview FPS ranges: [%s]", strH);
        int[] iArr2 = new int[2];
        parameters.getPreviewFpsRange(iArr2);
        Log.i(str17, "Preview FPS range: min: %d, max: %d", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1]));
        Log.i(str17, "Supported preview frame rates: %s", parameters.getSupportedPreviewFrameRates());
        Log.i(str17, "Preview Frame rates %s", Integer.valueOf(parameters.getPreviewFrameRate()));
        return this;
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public final Resolution getSelectedPictureResolution() {
        return Resolution.from(this.f94278c.getPictureSize());
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public final Resolution getSelectedPreviewResolution() {
        return Resolution.from(this.f94278c.getPreviewSize());
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public final Resolution getSelectedVideoResolution() {
        return Resolution.from(this.f94278c.getPictureSize());
    }

    @Override // com.veridas.camera.parameter.ParametersBuilder
    public final void apply() {
        CameraOneCamera cameraOneCamera = this.f94277b;
        cameraOneCamera.getClass();
        cameraOneCamera.i(new com.veridas.camera.one.a(cameraOneCamera, this.f94278c, null));
    }
}
