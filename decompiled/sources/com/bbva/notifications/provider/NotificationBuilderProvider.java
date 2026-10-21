package com.bbva.notifications.provider;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NotificationBuilderProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/notifications/provider/NotificationBuilderProvider;", "", "", "channel", "Landroidx/core/app/NotificationCompat$Builder;", "initialize", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class NotificationBuilderProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f35441a;

    public NotificationBuilderProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35441a = context;
    }

    @NotNull
    public final NotificationCompat.Builder initialize(@NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new NotificationCompat.Builder(this.f35441a, channel);
    }
}
