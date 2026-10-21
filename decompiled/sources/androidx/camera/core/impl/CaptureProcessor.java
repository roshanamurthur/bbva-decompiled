package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CaptureProcessor {
    void close();

    @NonNull
    ListenableFuture<Void> getCloseFuture();

    void onOutputSurface(@NonNull Surface surface, int i10);

    void onResolutionUpdate(@NonNull Size size);

    void process(@NonNull ImageProxyBundle imageProxyBundle);
}
