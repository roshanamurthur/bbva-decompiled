package zc;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: LifecycleLifecycle.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements Lifecycle, LifecycleObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final HashSet f95027p0 = new HashSet();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final androidx.lifecycle.Lifecycle f95028q0;

    public e(androidx.lifecycle.Lifecycle lifecycle) {
        this.f95028q0 = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void addListener(@NonNull LifecycleListener lifecycleListener) {
        this.f95027p0.add(lifecycleListener);
        androidx.lifecycle.Lifecycle lifecycle = this.f95028q0;
        if (lifecycle.getF21906d() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            lifecycleListener.onDestroy();
        } else if (lifecycle.getF21906d().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.f95027p0).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.f95027p0).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = Util.getSnapshot(this.f95027p0).iterator();
        while (it.hasNext()) {
            ((LifecycleListener) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public final void removeListener(@NonNull LifecycleListener lifecycleListener) {
        this.f95027p0.remove(lifecycleListener);
    }
}
