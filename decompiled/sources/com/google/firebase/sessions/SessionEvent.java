package com.google.firebase.sessions;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.encoders.annotations.Encodable;
import com.noknok.android.passportsdksvc.PassportSDKIntentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/google/firebase/sessions/SessionEvent;", "", "Lcom/google/firebase/sessions/EventType;", "component1", "Lcom/google/firebase/sessions/SessionInfo;", "component2", "Lcom/google/firebase/sessions/ApplicationInfo;", "component3", "eventType", PassportSDKIntentActivity.SESSION_DATA, "applicationInfo", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/google/firebase/sessions/EventType;", "getEventType", "()Lcom/google/firebase/sessions/EventType;", "b", "Lcom/google/firebase/sessions/SessionInfo;", "getSessionData", "()Lcom/google/firebase/sessions/SessionInfo;", "c", "Lcom/google/firebase/sessions/ApplicationInfo;", "getApplicationInfo", "()Lcom/google/firebase/sessions/ApplicationInfo;", "<init>", "(Lcom/google/firebase/sessions/EventType;Lcom/google/firebase/sessions/SessionInfo;Lcom/google/firebase/sessions/ApplicationInfo;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
@Encodable
public final /* data */ class SessionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EventType eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SessionInfo sessionData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ApplicationInfo applicationInfo;

    public SessionEvent(@NotNull EventType eventType, @NotNull SessionInfo sessionData, @NotNull ApplicationInfo applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.eventType = eventType;
        this.sessionData = sessionData;
        this.applicationInfo = applicationInfo;
    }

    public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eventType = sessionEvent.eventType;
        }
        if ((i10 & 2) != 0) {
            sessionInfo = sessionEvent.sessionData;
        }
        if ((i10 & 4) != 0) {
            applicationInfo = sessionEvent.applicationInfo;
        }
        return sessionEvent.copy(eventType, sessionInfo, applicationInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EventType getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    @NotNull
    public final SessionEvent copy(@NotNull EventType eventType, @NotNull SessionInfo sessionData, @NotNull ApplicationInfo applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        return new SessionEvent(eventType, sessionData, applicationInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) other;
        return this.eventType == sessionEvent.eventType && Intrinsics.areEqual(this.sessionData, sessionEvent.sessionData) && Intrinsics.areEqual(this.applicationInfo, sessionEvent.applicationInfo);
    }

    @NotNull
    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    @NotNull
    public final EventType getEventType() {
        return this.eventType;
    }

    @NotNull
    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return this.applicationInfo.hashCode() + ((this.sessionData.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SessionEvent(eventType=" + this.eventType + ", sessionData=" + this.sessionData + ", applicationInfo=" + this.applicationInfo + RootService.CLOSE_BRACKET;
    }
}
