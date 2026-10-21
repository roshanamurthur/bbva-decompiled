package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class AttachedSurfaceInfo {
    @NonNull
    public static AttachedSurfaceInfo create(@NonNull SurfaceConfig surfaceConfig, int i10, @NonNull Size size, @Nullable Range<Integer> range) {
        return new AutoValue_AttachedSurfaceInfo(surfaceConfig, i10, size, range);
    }

    public abstract int getImageFormat();

    @NonNull
    public abstract Size getSize();

    @NonNull
    public abstract SurfaceConfig getSurfaceConfig();

    @Nullable
    public abstract Range<Integer> getTargetFrameRate();
}
