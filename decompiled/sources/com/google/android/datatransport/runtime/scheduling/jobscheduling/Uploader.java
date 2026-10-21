package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import xd.f;
import y0.g;

/* JADX INFO: loaded from: classes9.dex */
public class Uploader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendRegistry f43830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EventStore f43831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkScheduler f43832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f43833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SynchronizationGuard f43834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clock f43835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clock f43836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ClientHealthMetricsStore f43837i;

    @Inject
    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f43829a = context;
        this.f43830b = backendRegistry;
        this.f43831c = eventStore;
        this.f43832d = workScheduler;
        this.f43833e = executor;
        this.f43834f = synchronizationGuard;
        this.f43835g = clock;
        this.f43836h = clock2;
        this.f43837i = clientHealthMetricsStore;
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        ClientHealthMetricsStore clientHealthMetricsStore = this.f43837i;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.f43835g.getTime()).setUptimeMillis(this.f43836h.getTime()).setTransportName("GDT_CLIENT_METRICS").setEncodedPayload(new EncodedPayload(Encoding.of("proto"), ((ClientMetrics) this.f43834f.runCriticalSection(new g(clientHealthMetricsStore))).toByteArray())).build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public BackendResponse logAndUpdateState(final TransportContext transportContext, int i10) {
        BackendResponse backendResponseSend;
        TransportBackend transportBackend = this.f43830b.get(transportContext.getBackendName());
        BackendResponse backendResponseOk = BackendResponse.ok(0L);
        final long j10 = 0;
        while (true) {
            SynchronizationGuard.CriticalSection criticalSection = new SynchronizationGuard.CriticalSection() { // from class: xd.c
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Boolean.valueOf(this.f94520p0.f43831c.hasPendingEventsFor(transportContext));
                }
            };
            SynchronizationGuard synchronizationGuard = this.f43834f;
            if (!((Boolean) synchronizationGuard.runCriticalSection(criticalSection)).booleanValue()) {
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: xd.g
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        Uploader uploader = this.f94530p0;
                        uploader.f43831c.recordNextCallTime(transportContext, uploader.f43835g.getTime() + j10);
                        return null;
                    }
                });
                return backendResponseOk;
            }
            final Iterable iterable = (Iterable) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: xd.d
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return this.f94522p0.f43831c.loadBatch(transportContext);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return backendResponseOk;
            }
            if (transportBackend == null) {
                Logging.d("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseSend = BackendResponse.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).getEvent());
                }
                if (transportContext.shouldUploadClientHealthMetrics()) {
                    arrayList.add(createMetricsEvent(transportBackend));
                }
                backendResponseSend = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
            }
            backendResponseOk = backendResponseSend;
            if (backendResponseOk.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: xd.e
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        Uploader uploader = this.f94524p0;
                        EventStore eventStore = uploader.f43831c;
                        eventStore.recordFailure(iterable);
                        eventStore.recordNextCallTime(transportContext, uploader.f43835g.getTime() + j10);
                        return null;
                    }
                });
                this.f43832d.schedule(transportContext, i10 + 1, true);
                return backendResponseOk;
            }
            synchronizationGuard.runCriticalSection(new f(this, iterable));
            if (backendResponseOk.getStatus() == BackendResponse.Status.OK) {
                long jMax = Math.max(j10, backendResponseOk.getNextRequestWaitMillis());
                if (transportContext.shouldUploadClientHealthMetrics()) {
                    synchronizationGuard.runCriticalSection(new k4.b(this));
                }
                j10 = jMax;
            } else if (backendResponseOk.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String transportName = ((PersistedEvent) it2.next()).getEvent().getTransportName();
                    if (map.containsKey(transportName)) {
                        map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                    } else {
                        map.put(transportName, 1);
                    }
                }
                synchronizationGuard.runCriticalSection(new androidx.camera.core.processing.g(this, map));
            }
        }
    }

    public void upload(final TransportContext transportContext, final int i10, final Runnable runnable) {
        this.f43833e.execute(new Runnable() { // from class: xd.b
            @Override // java.lang.Runnable
            public final void run() {
                TransportContext transportContext2 = transportContext;
                int i11 = i10;
                Runnable runnable2 = runnable;
                Uploader uploader = this.f94516p0;
                SynchronizationGuard synchronizationGuard = uploader.f43834f;
                try {
                    try {
                        EventStore eventStore = uploader.f43831c;
                        Objects.requireNonNull(eventStore);
                        synchronizationGuard.runCriticalSection(new com.dasnano.vdphotoselfiecapture.fragments.b(eventStore));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader.f43829a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            synchronizationGuard.runCriticalSection(new h(uploader, transportContext2, i11));
                        } else {
                            uploader.logAndUpdateState(transportContext2, i11);
                        }
                    } catch (SynchronizationException unused) {
                        uploader.f43832d.schedule(transportContext2, i11 + 1);
                    }
                } finally {
                    runnable2.run();
                }
            }
        });
    }
}
