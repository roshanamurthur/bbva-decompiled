package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface SurfaceProcessor {
    void onInputSurface(@NonNull SurfaceRequest surfaceRequest);

    void onOutputSurface(@NonNull SurfaceOutput surfaceOutput);
}
