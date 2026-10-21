package com.bbva.notifications.extensions;

import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.model.NotificationDataLocal;
import com.bbva.push.model.NotificationOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NotificationOptionsExtension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"copyWith", "Lcom/bbva/push/model/NotificationOptions;", "data", "Lcom/bbva/notifications/model/NotificationDataLocal;", "isReactiveWithoutDetail", "", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NotificationOptionsExtensionKt {
    @NotNull
    public static final NotificationOptions copyWith(@NotNull NotificationOptions notificationOptions, @NotNull NotificationDataLocal data, boolean z10) {
        String preview;
        String message;
        Intrinsics.checkNotNullParameter(notificationOptions, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        String title = notificationOptions.getTitle();
        String title2 = (title == null || l.isBlank(title)) ? data.getTitle() : notificationOptions.getTitle();
        String content = notificationOptions.getContent();
        if (content == null || l.isBlank(content)) {
            preview = data.getPreview();
            if (preview == null) {
                message = data.getMessage();
            }
            String clickAction = notificationOptions.getClickAction();
            return notificationOptions.copy((16118 & 1) != 0 ? notificationOptions.title : title2, (16118 & 2) != 0 ? notificationOptions.titleLocKey : null, (16118 & 4) != 0 ? notificationOptions.titleLocArgs : null, (16118 & 8) != 0 ? notificationOptions.content : preview, (16118 & 16) != 0 ? notificationOptions.bodyLocKey : null, (16118 & 32) != 0 ? notificationOptions.bodyLocArgs : null, (16118 & 64) != 0 ? notificationOptions.icon : null, (16118 & 128) != 0 ? notificationOptions.channelId : null, (16118 & 256) != 0 ? notificationOptions.clickAction : ((clickAction != null || l.isBlank(clickAction)) && !z10) ? Reflection.getOrCreateKotlinClass(NotificationNoCommercialActivity.class).getSimpleName() : notificationOptions.getClickAction(), (16118 & 512) != 0 ? notificationOptions.color : null, (16118 & 1024) != 0 ? notificationOptions.link : null, (16118 & 2048) != 0 ? notificationOptions.sound : null, (16118 & 4096) != 0 ? notificationOptions.tag : null, (16118 & 8192) != 0 ? notificationOptions.rawMessage : null);
        }
        message = notificationOptions.getContent();
        preview = message;
        String clickAction2 = notificationOptions.getClickAction();
        return notificationOptions.copy((16118 & 1) != 0 ? notificationOptions.title : title2, (16118 & 2) != 0 ? notificationOptions.titleLocKey : null, (16118 & 4) != 0 ? notificationOptions.titleLocArgs : null, (16118 & 8) != 0 ? notificationOptions.content : preview, (16118 & 16) != 0 ? notificationOptions.bodyLocKey : null, (16118 & 32) != 0 ? notificationOptions.bodyLocArgs : null, (16118 & 64) != 0 ? notificationOptions.icon : null, (16118 & 128) != 0 ? notificationOptions.channelId : null, (16118 & 256) != 0 ? notificationOptions.clickAction : ((clickAction2 != null || l.isBlank(clickAction2)) && !z10) ? Reflection.getOrCreateKotlinClass(NotificationNoCommercialActivity.class).getSimpleName() : notificationOptions.getClickAction(), (16118 & 512) != 0 ? notificationOptions.color : null, (16118 & 1024) != 0 ? notificationOptions.link : null, (16118 & 2048) != 0 ? notificationOptions.sound : null, (16118 & 4096) != 0 ? notificationOptions.tag : null, (16118 & 8192) != 0 ? notificationOptions.rawMessage : null);
    }
}
