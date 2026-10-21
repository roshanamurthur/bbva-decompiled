package zc;

import androidx.annotation.NonNull;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;

/* JADX INFO: compiled from: ApplicationLifecycle.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements Lifecycle {
    @Override // com.bumptech.glide.manager.Lifecycle
    public final void addListener(@NonNull LifecycleListener lifecycleListener) {
        lifecycleListener.onStart();
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void removeListener(@NonNull LifecycleListener lifecycleListener) {
    }
}
