package com.bbva.notifications;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.d;
import androidx.core.view.accessibility.e;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationActivity;
import com.bbva.notifications.activity.NotificationActivity;
import com.bbva.notifications.model.LocalNotificationChannel;
import com.bbva.notifications.model.LocalNotificationData;
import com.bbva.notifications.provider.NotificationBuilderProvider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GloMoLocalNotificationCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¨\u0006\u0015"}, d2 = {"Lcom/bbva/notifications/GloMoLocalNotificationCreator;", "", "Lcom/bbva/notifications/model/LocalNotificationData;", "data", "", "priority", "", "onlyLocal", "Lkotlin/Pair;", "", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "deeplinkInfo", "paymentInfoType", "Landroidx/core/app/NotificationCompat$Builder;", "create", "Landroid/content/Context;", "context", "Lcom/bbva/notifications/provider/NotificationBuilderProvider;", "provider", "<init>", "(Landroid/content/Context;Lcom/bbva/notifications/provider/NotificationBuilderProvider;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class GloMoLocalNotificationCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f35271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NotificationBuilderProvider f35272b;

    public GloMoLocalNotificationCreator(@NotNull Context context, @NotNull NotificationBuilderProvider provider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f35271a = context;
        this.f35272b = provider;
    }

    @NotNull
    public final NotificationCompat.Builder create(@NotNull LocalNotificationData data, int priority, boolean onlyLocal, @Nullable Pair<String, DeepLinkModel> deeplinkInfo, @Nullable String paymentInfoType) {
        Intent intent;
        Intrinsics.checkNotNullParameter(data, "data");
        LocalNotificationChannel channel = data.getChannel();
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f35271a;
        if (i10 >= 26) {
            String string = context.getString(channel.getName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = context.getString(channel.getDescription());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            e.e();
            NotificationChannel notificationChannelA = d.a(channel.getId(), string, channel.getPriority());
            notificationChannelA.setDescription(string2);
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelA);
        }
        NotificationCompat.Builder autoCancel = this.f35272b.initialize(data.getChannelId()).setDefaults(-1).setSmallIcon(data.getSmallIcon()).setColor(ContextCompat.getColor(context, R.color.core_blue_70)).setContentTitle(data.getTitle()).setContentText(data.getMessage()).setStyle(new NotificationCompat.BigTextStyle().bigText(data.getMessage())).setPriority(priority).setLocalOnly(onlyLocal).setAutoCancel(true);
        if (paymentInfoType != null) {
            intent = new Intent(context, (Class<?>) PaymentsInfoNotificationActivity.class);
            intent.putExtra(PaymentsInfoNotificationActivity.TOHU_INFO_PAYMENT_TYPE, paymentInfoType);
        } else {
            intent = new Intent(context, (Class<?>) NotificationActivity.class);
            if (deeplinkInfo != null) {
                intent.putExtra(deeplinkInfo.getFirst(), deeplinkInfo.getSecond());
            }
        }
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        NotificationCompat.Builder contentIntent = autoCancel.setContentIntent(activity);
        Intrinsics.checkNotNullExpressionValue(contentIntent, "setContentIntent(...)");
        return contentIntent;
    }
}
