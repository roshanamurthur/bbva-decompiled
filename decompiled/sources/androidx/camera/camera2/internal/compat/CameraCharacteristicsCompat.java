package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class CameraCharacteristicsCompat {

    @NonNull
    private final CameraCharacteristicsCompatImpl mCameraCharacteristicsImpl;

    @NonNull
    @GuardedBy("this")
    private final Map<CameraCharacteristics.Key<?>, Object> mValuesCache = new HashMap();

    public interface CameraCharacteristicsCompatImpl {
        @Nullable
        <T> T get(@NonNull CameraCharacteristics.Key<T> key);

        @NonNull
        Set<String> getPhysicalCameraIds();

        @NonNull
        CameraCharacteristics unwrap();
    }

    private CameraCharacteristicsCompat(@NonNull CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsApi28Impl(cameraCharacteristics);
        } else {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsBaseImpl(cameraCharacteristics);
        }
    }

    private boolean isKeyNonCacheable(@NonNull CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    public static CameraCharacteristicsCompat toCameraCharacteristicsCompat(@NonNull CameraCharacteristics cameraCharacteristics) {
        return new CameraCharacteristicsCompat(cameraCharacteristics);
    }

    @Nullable
    public <T> T get(@NonNull CameraCharacteristics.Key<T> key) {
        if (isKeyNonCacheable(key)) {
            return (T) this.mCameraCharacteristicsImpl.get(key);
        }
        synchronized (this) {
            try {
                T t10 = (T) this.mValuesCache.get(key);
                if (t10 != null) {
                    return t10;
                }
                T t11 = (T) this.mCameraCharacteristicsImpl.get(key);
                if (t11 != null) {
                    this.mValuesCache.put((CameraCharacteristics.Key<?>) key, t11);
                }
                return t11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public Set<String> getPhysicalCameraIds() {
        return this.mCameraCharacteristicsImpl.getPhysicalCameraIds();
    }

    @NonNull
    public CameraCharacteristics toCameraCharacteristics() {
        return this.mCameraCharacteristicsImpl.unwrap();
    }
}
