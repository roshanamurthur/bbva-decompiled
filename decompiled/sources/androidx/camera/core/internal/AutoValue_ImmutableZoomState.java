package androidx.camera.core.internal;

import androidx.camera.camera2.internal.l0;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ImmutableZoomState extends ImmutableZoomState {
    private final float linearZoom;
    private final float maxZoomRatio;
    private final float minZoomRatio;
    private final float zoomRatio;

    public AutoValue_ImmutableZoomState(float f6, float f10, float f11, float f12) {
        this.zoomRatio = f6;
        this.maxZoomRatio = f10;
        this.minZoomRatio = f11;
        this.linearZoom = f12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableZoomState)) {
            return false;
        }
        ImmutableZoomState immutableZoomState = (ImmutableZoomState) obj;
        return Float.floatToIntBits(this.zoomRatio) == Float.floatToIntBits(immutableZoomState.getZoomRatio()) && Float.floatToIntBits(this.maxZoomRatio) == Float.floatToIntBits(immutableZoomState.getMaxZoomRatio()) && Float.floatToIntBits(this.minZoomRatio) == Float.floatToIntBits(immutableZoomState.getMinZoomRatio()) && Float.floatToIntBits(this.linearZoom) == Float.floatToIntBits(immutableZoomState.getLinearZoom());
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.linearZoom;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.zoomRatio;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.zoomRatio) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.maxZoomRatio)) * 1000003) ^ Float.floatToIntBits(this.minZoomRatio)) * 1000003) ^ Float.floatToIntBits(this.linearZoom);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb2.append(this.zoomRatio);
        sb2.append(", maxZoomRatio=");
        sb2.append(this.maxZoomRatio);
        sb2.append(", minZoomRatio=");
        sb2.append(this.minZoomRatio);
        sb2.append(", linearZoom=");
        return l0.a(sb2, this.linearZoom, "}");
    }
}
