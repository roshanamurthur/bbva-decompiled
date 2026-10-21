package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface ImageProxyBundle {
    @NonNull
    List<Integer> getCaptureIds();

    @NonNull
    ListenableFuture<ImageProxy> getImageProxy(int i10);
}
