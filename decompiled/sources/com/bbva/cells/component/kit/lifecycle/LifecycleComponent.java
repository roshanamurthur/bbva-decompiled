package com.bbva.cells.component.kit.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bbva.cells.component.kit.common.ReactiveComponent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LifecycleComponent extends ReactiveComponent implements LifecycleObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LifecycleOwner f26687p0;

    public LifecycleComponent(LifecycleOwner lifecycleOwner) {
        this.f26687p0 = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f26687p0.getLifecycle().removeObserver(this);
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onAny(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
