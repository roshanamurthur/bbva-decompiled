package com.bbva.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.bbva.androidtoolkit.utils.ResourceUtils;
import com.bbva.notifications.activity.NotificationActivity;
import com.bbva.push.creator.NotificationCreator;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GloMoNotificationCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/notifications/GloMoNotificationCreator;", "Lcom/bbva/push/creator/NotificationCreator;", "Landroid/content/Context;", "context", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "defaultChannel", "Lcom/bbva/push/model/Push;", "push", "Landroidx/core/app/NotificationCompat$Builder;", "createNotificationBuilder", "Lcom/bbva/notifications/GloMoNotificationBodyCreator;", "creator", "<init>", "(Lcom/bbva/notifications/GloMoNotificationBodyCreator;)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGloMoNotificationCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GloMoNotificationCreator.kt\ncom/bbva/notifications/GloMoNotificationCreator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class GloMoNotificationCreator implements NotificationCreator {
    public static final int NOTIFICATION_REQUEST_CODE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GloMoNotificationBodyCreator f35274a;

    public GloMoNotificationCreator(@NotNull GloMoNotificationBodyCreator creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.f35274a = creator;
    }

    @Override // com.bbva.push.creator.NotificationCreator
    @NotNull
    public NotificationCompat.Builder createNotificationBuilder(@NotNull Context context, int defaultIcon, @NotNull NotificationChannel defaultChannel, @NotNull Push push) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        Intrinsics.checkNotNullParameter(push, "push");
        String channelId = push.getNotification().getChannelId();
        if (channelId == null) {
            channelId = defaultChannel.getId();
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId);
        String icon = push.getNotification().getIcon();
        if (icon != null) {
            defaultIcon = ResourceUtils.getDrawable(context, icon);
        }
        NotificationCompat.Builder contentTitle = builder.setSmallIcon(defaultIcon).setContentTitle(push.getNotification().getTitle());
        Map<String, String> data = push.getData();
        GloMoNotificationBodyCreator gloMoNotificationBodyCreator = this.f35274a;
        NotificationCompat.Builder autoCancel = contentTitle.setContentText(gloMoNotificationBodyCreator.createBody(data)).setStyle(new NotificationCompat.BigTextStyle().bigText(gloMoNotificationBodyCreator.createBigBody(push.getData()))).setPriority(0).setContentIntent(PendingIntent.getActivity(context, 1, new Intent(context, (Class<?>) NotificationActivity.class), 201326592)).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "setAutoCancel(...)");
        return autoCancel;
    }
}
