package com.google.crypto.tink.internal;

import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.monitoring.MonitoringKeysetInfo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MutableMonitoringRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MutableMonitoringRegistry f46655b = new MutableMonitoringRegistry();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46656c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<MonitoringClient> f46657a = new AtomicReference<>();

    public static class a implements MonitoringClient {
        @Override // com.google.crypto.tink.monitoring.MonitoringClient
        public final MonitoringClient.Logger createLogger(MonitoringKeysetInfo monitoringKeysetInfo, String str, String str2) {
            return MonitoringUtil.DO_NOTHING_LOGGER;
        }
    }

    public static MutableMonitoringRegistry globalInstance() {
        return f46655b;
    }

    public synchronized void clear() {
        this.f46657a.set(null);
    }

    public MonitoringClient getMonitoringClient() {
        MonitoringClient monitoringClient = this.f46657a.get();
        return monitoringClient == null ? f46656c : monitoringClient;
    }

    public synchronized void registerMonitoringClient(MonitoringClient monitoringClient) {
        if (this.f46657a.get() != null) {
            throw new IllegalStateException("a monitoring client has already been registered");
        }
        this.f46657a.set(monitoringClient);
    }
}
