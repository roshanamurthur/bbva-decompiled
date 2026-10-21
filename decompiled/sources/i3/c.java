package i3;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Handler f69501p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Runnable f69502q0;

    public c(Handler handler, b bVar) {
        this.f69501p0 = handler;
        this.f69502q0 = bVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f69501p0.removeCallbacks(this.f69502q0);
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
