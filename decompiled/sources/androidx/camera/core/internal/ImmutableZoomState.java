package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ZoomState;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class ImmutableZoomState implements ZoomState {
    @NonNull
    public static ZoomState create(float f6, float f10, float f11, float f12) {
        return new AutoValue_ImmutableZoomState(f6, f10, f11, f12);
    }

    @Override // androidx.camera.core.ZoomState
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();

    @NonNull
    public static ZoomState create(@NonNull ZoomState zoomState) {
        return new AutoValue_ImmutableZoomState(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }
}
