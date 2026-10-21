package com.bbva.push.firebase.extensions;

import com.bbva.push.model.RawMessage;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RawMessage.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFirebaseRemoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "Lcom/bbva/push/model/RawMessage;", "firebase-push_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RawMessageKt {
    @NotNull
    public static final RemoteMessage toFirebaseRemoteMessage(@NotNull RawMessage rawMessage) {
        Intrinsics.checkNotNullParameter(rawMessage, "<this>");
        Object raw = rawMessage.getRaw();
        Intrinsics.checkNotNull(raw, "null cannot be cast to non-null type com.google.firebase.messaging.RemoteMessage");
        return (RemoteMessage) raw;
    }
}
