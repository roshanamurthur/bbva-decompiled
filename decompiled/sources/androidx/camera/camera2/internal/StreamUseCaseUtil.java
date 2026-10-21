package androidx.camera.camera2.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.VideoCaptureConfig;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class StreamUseCaseUtil {
    private StreamUseCaseUtil() {
    }

    public static long getStreamUseCaseFromUseCaseConfigs(@NonNull Collection<UseCaseConfig<?>> collection, @NonNull Collection<SessionConfig> collection2) {
        if (Build.VERSION.SDK_INT < 33) {
            return -1L;
        }
        if (collection.isEmpty()) {
            return 0L;
        }
        Iterator<SessionConfig> it = collection2.iterator();
        while (it.hasNext()) {
            if (it.next().getTemplateType() == 5) {
                return 0L;
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (UseCaseConfig<?> useCaseConfig : collection) {
            if (useCaseConfig instanceof ImageAnalysisConfig) {
                return 0L;
            }
            if (useCaseConfig instanceof PreviewConfig) {
                z12 = true;
            } else if (useCaseConfig instanceof ImageCaptureConfig) {
                if (z11) {
                    return 4L;
                }
                z10 = true;
            } else if (!(useCaseConfig instanceof VideoCaptureConfig)) {
                continue;
            } else {
                if (z10) {
                    return 4L;
                }
                z11 = true;
            }
        }
        if (z10) {
            return 2L;
        }
        if (z11) {
            return 3L;
        }
        return !z12 ? 0L : 1L;
    }
}
