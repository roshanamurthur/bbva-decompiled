package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultScheduler implements Scheduler {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f43801f = Logger.getLogger(TransportRuntime.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkScheduler f43802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f43803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendRegistry f43804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EventStore f43805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SynchronizationGuard f43806e;

    @Inject
    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f43803b = executor;
        this.f43804c = backendRegistry;
        this.f43802a = workScheduler;
        this.f43805d = eventStore;
        this.f43806e = synchronizationGuard;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.f43803b.execute(new Runnable() { // from class: wd.a
            @Override // java.lang.Runnable
            public final void run() {
                final TransportContext transportContext2 = transportContext;
                TransportScheduleCallback transportScheduleCallback2 = transportScheduleCallback;
                EventInternal eventInternal2 = eventInternal;
                Logger logger = DefaultScheduler.f43801f;
                final DefaultScheduler defaultScheduler = this.f94214p0;
                defaultScheduler.getClass();
                Logger logger2 = DefaultScheduler.f43801f;
                try {
                    TransportBackend transportBackend = defaultScheduler.f43804c.get(transportContext2.getBackendName());
                    if (transportBackend == null) {
                        String str = String.format("Transport backend '%s' is not registered", transportContext2.getBackendName());
                        logger2.warning(str);
                        transportScheduleCallback2.onSchedule(new IllegalArgumentException(str));
                    } else {
                        final EventInternal eventInternalDecorate = transportBackend.decorate(eventInternal2);
                        defaultScheduler.f43806e.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: wd.b
                            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                            public final Object execute() {
                                DefaultScheduler defaultScheduler2 = defaultScheduler;
                                EventStore eventStore = defaultScheduler2.f43805d;
                                TransportContext transportContext3 = transportContext2;
                                eventStore.persist(transportContext3, eventInternalDecorate);
                                defaultScheduler2.f43802a.schedule(transportContext3, 1);
                                return null;
                            }
                        });
                        transportScheduleCallback2.onSchedule(null);
                    }
                } catch (Exception e5) {
                    logger2.warning("Error scheduling event " + e5.getMessage());
                    transportScheduleCallback2.onSchedule(e5);
                }
            }
        });
    }
}
