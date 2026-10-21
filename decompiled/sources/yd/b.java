package yd;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;

/* JADX INFO: compiled from: AutoValue_PersistedEvent.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends PersistedEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportContext f94769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EventInternal f94770c;

    public b(long j10, TransportContext transportContext, EventInternal eventInternal) {
        this.f94768a = j10;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f94769b = transportContext;
        if (eventInternal == null) {
            throw new NullPointerException("Null event");
        }
        this.f94770c = eventInternal;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.f94768a == persistedEvent.getId() && this.f94769b.equals(persistedEvent.getTransportContext()) && this.f94770c.equals(persistedEvent.getEvent());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final EventInternal getEvent() {
        return this.f94770c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final long getId() {
        return this.f94768a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final TransportContext getTransportContext() {
        return this.f94769b;
    }

    public final int hashCode() {
        long j10 = this.f94768a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f94769b.hashCode()) * 1000003) ^ this.f94770c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f94768a + ", transportContext=" + this.f94769b + ", event=" + this.f94770c + "}";
    }
}
