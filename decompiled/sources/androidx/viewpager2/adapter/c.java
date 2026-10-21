package androidx.viewpager2.adapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter.d f23957p0;

    public c(FragmentStateAdapter.d dVar) {
        this.f23957p0 = dVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        this.f23957p0.b(false);
    }
}
