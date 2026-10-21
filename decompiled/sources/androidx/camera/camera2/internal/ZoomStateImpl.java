package androidx.camera.camera2.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.ZoomState;
import androidx.core.math.MathUtils;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f6, float f10) {
        this.mMaxZoomRatio = f6;
        this.mMinZoomRatio = f10;
    }

    private float getPercentageByRatio(float f6) {
        float f10 = this.mMaxZoomRatio;
        float f11 = this.mMinZoomRatio;
        if (f10 == f11) {
            return 0.0f;
        }
        if (f6 == f10) {
            return 1.0f;
        }
        if (f6 == f11) {
            return 0.0f;
        }
        float f12 = 1.0f / f11;
        return ((1.0f / f6) - f12) / ((1.0f / f10) - f12);
    }

    private float getRatioByPercentage(float f6) {
        if (f6 == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f6 == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f10 = this.mMaxZoomRatio;
        float f11 = this.mMinZoomRatio;
        double d2 = 1.0f / f11;
        return (float) MathUtils.clamp(1.0d / (((((double) (1.0f / f10)) - d2) * ((double) f6)) + d2), f11, f10);
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f6) throws IllegalArgumentException {
        if (f6 <= 1.0f && f6 >= 0.0f) {
            this.mLinearZoom = f6;
            this.mZoomRatio = getRatioByPercentage(f6);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f6 + " is not within valid range [0..1]");
        }
    }

    public void setZoomRatio(float f6) throws IllegalArgumentException {
        if (f6 <= this.mMaxZoomRatio && f6 >= this.mMinZoomRatio) {
            this.mZoomRatio = f6;
            this.mLinearZoom = getPercentageByRatio(f6);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Requested zoomRatio ");
        sb2.append(f6);
        sb2.append(" is not within valid range [");
        sb2.append(this.mMinZoomRatio);
        sb2.append(" , ");
        throw new IllegalArgumentException(l0.a(sb2, this.mMaxZoomRatio, Constant.BRACKET_CLOSE));
    }
}
