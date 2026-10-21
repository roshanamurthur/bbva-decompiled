package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.camera.core.impl.t;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes9.dex */
public class WorkInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f43847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventStore f43848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkScheduler f43849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SynchronizationGuard f43850d;

    @Inject
    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f43847a = executor;
        this.f43848b = eventStore;
        this.f43849c = workScheduler;
        this.f43850d = synchronizationGuard;
    }

    public void ensureContextsScheduled() {
        this.f43847a.execute(new t(this, 5));
    }
}
