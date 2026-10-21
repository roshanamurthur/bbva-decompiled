package com.google.firebase.sessions;

import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastore;", "", "getCurrentSessionId", "", "updateSessionId", "", AuthConstants.SESSION_ID, "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SessionDatastore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f48820a;

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastore$Companion;", "", "()V", "instance", "Lcom/google/firebase/sessions/SessionDatastore;", "getInstance", "()Lcom/google/firebase/sessions/SessionDatastore;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f48820a = new Companion();

        @NotNull
        public final SessionDatastore getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionDatastore.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionDatastore::class.java]");
            return (SessionDatastore) obj;
        }
    }

    @Nullable
    String getCurrentSessionId();

    void updateSessionId(@NotNull String sessionId);
}
