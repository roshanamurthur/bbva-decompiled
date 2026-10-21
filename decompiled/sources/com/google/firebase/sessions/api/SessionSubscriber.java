package com.google.firebase.sessions.api;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionSubscriber.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber;", "", "isDataCollectionEnabled", "", "()Z", "sessionSubscriberName", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "getSessionSubscriberName", "()Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "onSessionChanged", "", "sessionDetails", "Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "Name", "SessionDetails", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SessionSubscriber {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SessionSubscriber.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public static final class Name {
        private static final /* synthetic */ Name[] $VALUES;
        public static final Name CRASHLYTICS;
        public static final Name MATT_SAYS_HI;
        public static final Name PERFORMANCE;

        static {
            Name name = new Name("CRASHLYTICS", 0);
            CRASHLYTICS = name;
            Name name2 = new Name("PERFORMANCE", 1);
            PERFORMANCE = name2;
            Name name3 = new Name("MATT_SAYS_HI", 2);
            MATT_SAYS_HI = name3;
            $VALUES = new Name[]{name, name2, name3};
        }

        public Name() {
            throw null;
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: SessionSubscriber.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "", "", "component1", AuthConstants.SESSION_ID, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class SessionDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String sessionId;

        public SessionDetails(@NotNull String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        @NotNull
        public final SessionDetails copy(@NotNull String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new SessionDetails(sessionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionDetails) && Intrinsics.areEqual(this.sessionId, ((SessionDetails) other).sessionId);
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        @NotNull
        public String toString() {
            return y2.b(new StringBuilder("SessionDetails(sessionId="), this.sessionId, RootService.CLOSE_BRACKET);
        }
    }

    @NotNull
    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(@NotNull SessionDetails sessionDetails);
}
