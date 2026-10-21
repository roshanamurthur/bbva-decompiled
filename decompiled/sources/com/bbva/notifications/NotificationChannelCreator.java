package com.bbva.notifications;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.core.util.d;
import androidx.core.view.accessibility.e;
import com.bbva.notifications.interfaces.ChannelCreator;
import com.bbva.notifications.model.NotificationChannelProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NotificationChannelCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/bbva/notifications/NotificationChannelCreator;", "Lcom/bbva/notifications/interfaces/ChannelCreator;", "", "createChannels", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "Lcom/bbva/notifications/model/NotificationChannelProperties;", "channelPropertiesList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationChannelCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationChannelCreator.kt\ncom/bbva/notifications/NotificationChannelCreator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1855#2,2:43\n*S KotlinDebug\n*F\n+ 1 NotificationChannelCreator.kt\ncom/bbva/notifications/NotificationChannelCreator\n*L\n21#1:43,2\n*E\n"})
public final class NotificationChannelCreator implements ChannelCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<NotificationChannelProperties> f35276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NotificationManager f35277c;

    public NotificationChannelCreator(@NotNull Context context, @NotNull List<NotificationChannelProperties> channelPropertiesList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelPropertiesList, "channelPropertiesList");
        this.context = context;
        this.f35276b = channelPropertiesList;
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f35277c = (NotificationManager) systemService;
    }

    @Override // com.bbva.notifications.interfaces.ChannelCreator
    public void createChannels() {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannelProperties notificationChannelProperties : this.f35276b) {
                e.e();
                NotificationChannel notificationChannelA = d.a(notificationChannelProperties.getId(), notificationChannelProperties.getName(), notificationChannelProperties.getImportance());
                notificationChannelA.setDescription(notificationChannelProperties.getDescription());
                notificationChannelA.setShowBadge(notificationChannelProperties.getShowBadge());
                Uri sound = notificationChannelProperties.getSound();
                if (sound != null) {
                    notificationChannelA.setSound(sound, new AudioAttributes.Builder().setUsage(5).setContentType(4).build());
                }
                this.f35277c.createNotificationChannel(notificationChannelA);
            }
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
