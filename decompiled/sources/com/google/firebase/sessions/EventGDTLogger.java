package com.google.firebase.sessions;

import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EventGDTLogger.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Lcom/google/firebase/sessions/SessionEvent;", "sessionEvent", "", LogKeysKt.LOG, "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "transportFactoryProvider", "<init>", "(Lcom/google/firebase/inject/Provider;)V", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class EventGDTLogger implements EventGDTLoggerInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Provider<TransportFactory> f48807a;

    /* JADX INFO: compiled from: EventGDTLogger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/EventGDTLogger$Companion;", "", "()V", "AQS_LOG_SOURCE", "", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EventGDTLogger(@NotNull Provider<TransportFactory> transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f48807a = transportFactoryProvider;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(@NotNull SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        this.f48807a.get().getTransport("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, Encoding.of("json"), new com.appsflyer.internal.a(this, 4)).send(Event.ofData(sessionEvent));
    }
}
