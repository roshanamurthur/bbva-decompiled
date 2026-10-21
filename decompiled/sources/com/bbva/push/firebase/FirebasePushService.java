package com.bbva.push.firebase;

import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.push.firebase.extensions.RemoteMessageKt;
import com.bbva.push.model.NotificationOptions;
import com.bbva.push.model.Push;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FirebasePushService.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/push/firebase/FirebasePushService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", BanxicoConstants.UNIFIED_LOG_EVENT_MESSAGE_RECEIVED_VALUE, "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "firebase-push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebasePushService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FirebasePushSource firebasePushSource = FirebasePushSource.INSTANCE;
        NotificationOptions notificationOptions = RemoteMessageKt.notificationOptions(message);
        Map<String, String> data = message.getData();
        Intrinsics.checkNotNullExpressionValue(data, "message.data");
        firebasePushSource.pushes(new Push(null, notificationOptions, data, 1, null));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        FirebasePushSource.INSTANCE.tokens(token);
    }
}
