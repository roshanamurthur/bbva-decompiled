package com.bbva.glomohybrid.provider;

import android.content.Context;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.notifications.model.NotificationChannelProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryNotificationChannelsProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/provider/CountryNotificationChannelsProvider;", "", "", "Lcom/bbva/notifications/model/NotificationChannelProperties;", "a", "Ljava/util/List;", "getChannels", "()Ljava/util/List;", NavigationOperations.UPDATE, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryNotificationChannelsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<NotificationChannelProperties> channels;

    public CountryNotificationChannelsProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.channels = bk.d.listOf(NotificationChannelProperties.INSTANCE.getDefault());
    }

    @NotNull
    public final List<NotificationChannelProperties> getChannels() {
        return this.channels;
    }
}
