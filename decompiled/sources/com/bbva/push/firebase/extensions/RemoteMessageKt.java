package com.bbva.push.firebase.extensions;

import com.bbva.push.model.NotificationOptions;
import com.bbva.push.model.RawMessage;
import com.bbva.push.model.ServiceResource;
import com.google.firebase.messaging.RemoteMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RemoteMessage.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"notificationOptions", "Lcom/bbva/push/model/NotificationOptions;", "Lcom/google/firebase/messaging/RemoteMessage;", "firebase-push_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRemoteMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteMessage.kt\ncom/bbva/push/firebase/extensions/RemoteMessageKt\n+ 2 NotificationModel.kt\ncom/bbva/push/model/NotificationOptions$Companion\n*L\n1#1,37:1\n62#2:38\n62#2:39\n*S KotlinDebug\n*F\n+ 1 RemoteMessage.kt\ncom/bbva/push/firebase/extensions/RemoteMessageKt\n*L\n15#1:38\n33#1:39\n*E\n"})
public final class RemoteMessageKt {
    @NotNull
    public static final NotificationOptions notificationOptions(@NotNull RemoteMessage remoteMessage) {
        List<String> listAsList;
        Intrinsics.checkNotNullParameter(remoteMessage, "<this>");
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if (notification == null) {
            NotificationOptions.Companion companion = NotificationOptions.INSTANCE;
            NotificationOptions.Builder builder = new NotificationOptions.Builder();
            builder.setRawMessage(new RawMessage(ServiceResource.FIREBASE, remoteMessage));
            return builder.build();
        }
        NotificationOptions.Companion companion2 = NotificationOptions.INSTANCE;
        NotificationOptions.Builder builder2 = new NotificationOptions.Builder();
        builder2.setTitle(notification.getTitle());
        builder2.setTitleLocKey(notification.getTitleLocalizationKey());
        String[] titleLocalizationArgs = notification.getTitleLocalizationArgs();
        List<String> listAsList2 = null;
        if (titleLocalizationArgs != null) {
            Intrinsics.checkNotNullExpressionValue(titleLocalizationArgs, "titleLocalizationArgs");
            listAsList = ArraysKt___ArraysJvmKt.asList(titleLocalizationArgs);
        } else {
            listAsList = null;
        }
        builder2.setTitleLocArgs(listAsList);
        builder2.setContent(notification.getBody());
        builder2.setBodyLocKey(notification.getBodyLocalizationKey());
        String[] bodyLocalizationArgs = notification.getBodyLocalizationArgs();
        if (bodyLocalizationArgs != null) {
            Intrinsics.checkNotNullExpressionValue(bodyLocalizationArgs, "bodyLocalizationArgs");
            listAsList2 = ArraysKt___ArraysJvmKt.asList(bodyLocalizationArgs);
        }
        builder2.setBodyLocArgs(listAsList2);
        builder2.setIcon(notification.getIcon());
        builder2.setChannelId(notification.getChannelId());
        builder2.setClickAction(notification.getClickAction());
        builder2.setColor(notification.getColor());
        builder2.setLink(notification.getLink());
        builder2.setSound(notification.getSound());
        builder2.setTag(notification.getTag());
        builder2.setRawMessage(new RawMessage(ServiceResource.FIREBASE, remoteMessage));
        return builder2.build();
    }
}
