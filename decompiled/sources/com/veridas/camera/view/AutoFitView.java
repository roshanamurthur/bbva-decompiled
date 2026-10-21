package com.veridas.camera.view;

import com.veridas.camera.resolution.Resolution;

/* JADX INFO: loaded from: classes9.dex */
public interface AutoFitView {

    public static class DefaultAutoFitView implements AutoFitView {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f66674p0 = 1.0f;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Resolution f66675q0;

        public Resolution fit(Resolution resolution) {
            Resolution resolutionCreate;
            setScale(1.0f);
            Resolution resolution2 = this.f66675q0;
            if (resolution2 == null || resolution.aspectRatio == resolution2.aspectRatio) {
                resolutionCreate = resolution;
            } else if (resolution.isLandscape()) {
                int i10 = resolution.width;
                resolutionCreate = Resolution.create(i10, (int) (i10 * this.f66675q0.inverseAspectRatio));
            } else {
                int i11 = resolution.width;
                resolutionCreate = Resolution.create(i11, (int) (i11 * this.f66675q0.aspectRatio));
            }
            int i12 = resolutionCreate.width;
            int i13 = resolution.width;
            if (i12 >= i13 && resolutionCreate.height >= resolution.height) {
                return resolutionCreate;
            }
            float fMax = Math.max(i13 / i12, resolution.height / resolutionCreate.height);
            setScale(fMax);
            return resolutionCreate.scale(fMax);
        }

        @Override // com.veridas.camera.view.AutoFitView
        public Resolution getResolution() {
            return this.f66675q0;
        }

        @Override // com.veridas.camera.view.AutoFitView
        public float getScale() {
            return this.f66674p0;
        }

        @Override // com.veridas.camera.view.AutoFitView
        public void setResolution(Resolution resolution) {
            this.f66675q0 = resolution;
        }

        @Override // com.veridas.camera.view.AutoFitView
        public void setScale(float f6) {
            if (f6 < 0.0f) {
                throw new IllegalArgumentException(String.format("The requested scale (%f) cannot be negative", Float.valueOf(f6)));
            }
            this.f66674p0 = f6;
        }
    }

    Resolution getResolution();

    float getScale();

    void setResolution(Resolution resolution);

    void setScale(float f6);
}
