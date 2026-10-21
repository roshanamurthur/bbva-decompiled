package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ImmediateSurface extends DeferrableSurface {
    private final Surface mSurface;

    public ImmediateSurface(@NonNull Surface surface, @NonNull Size size, int i10) {
        super(size, i10);
        this.mSurface = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public ListenableFuture<Surface> provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }

    public ImmediateSurface(@NonNull Surface surface) {
        this.mSurface = surface;
    }
}
