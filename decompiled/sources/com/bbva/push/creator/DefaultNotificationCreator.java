package com.bbva.push.creator;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.util.d;
import androidx.core.view.accessibility.e;
import com.bbva.androidtoolkit.utils.ResourceUtils;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.NotificationOptions;
import com.bbva.push.model.Push;
import com.esotericsoftware.kryo.serializers.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultNotificationCreator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/push/creator/DefaultNotificationCreator;", "Lcom/bbva/push/creator/NotificationCreator;", "Landroid/content/Context;", "context", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "defaultChannel", "Lcom/bbva/push/model/Push;", "push", "Landroidx/core/app/NotificationCompat$Builder;", "createNotificationBuilder", "<init>", "()V", "push_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultNotificationCreator implements NotificationCreator {
    @Override // com.bbva.push.creator.NotificationCreator
    @NotNull
    public NotificationCompat.Builder createNotificationBuilder(@NotNull Context context, int defaultIcon, @NotNull NotificationChannel defaultChannel, @NotNull Push push) {
        String id;
        android.app.NotificationChannel notificationChannelA;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        Intrinsics.checkNotNullParameter(push, "push");
        String channelId = push.getNotification().getChannelId();
        if (Build.VERSION.SDK_INT >= 26) {
            if (channelId != null) {
                e.e();
                notificationChannelA = f0.c(channelId, channelId);
            } else {
                e.e();
                notificationChannelA = d.a(defaultChannel.getId(), defaultChannel.getDescription(), defaultChannel.getImportance().toInt());
            }
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelA);
            id = notificationChannelA.getId();
            Intrinsics.checkNotNullExpressionValue(id, "channel.id");
        } else {
            id = "";
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, id);
        NotificationOptions notification = push.getNotification();
        if (notification.getIcon() != null) {
            defaultIcon = ResourceUtils.getDrawable(context, notification.getIcon());
        }
        NotificationCompat.Builder priority = builder.setSmallIcon(defaultIcon).setContentTitle(push.getNotification().getTitle()).setContentText(push.getNotification().getContent()).setPriority(0);
        Intrinsics.checkNotNullExpressionValue(priority, "Builder(context, channel…nCompat.PRIORITY_DEFAULT)");
        return priority;
    }
}
