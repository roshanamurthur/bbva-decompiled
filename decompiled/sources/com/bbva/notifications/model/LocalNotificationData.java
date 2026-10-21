package com.bbva.notifications.model;

import androidx.annotation.DrawableRes;
import com.bbva.notifications.R;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalNotification.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/bbva/notifications/model/LocalNotificationData;", "", "Lcom/bbva/notifications/model/LocalNotificationChannel;", "a", "Lcom/bbva/notifications/model/LocalNotificationChannel;", "getChannel", "()Lcom/bbva/notifications/model/LocalNotificationChannel;", "channel", "", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "c", "getMessage", "message", "", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSmallIcon", "()I", "smallIcon", "getChannelId", "channelId", "<init>", "(Lcom/bbva/notifications/model/LocalNotificationChannel;Ljava/lang/String;Ljava/lang/String;I)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LocalNotificationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LocalNotificationChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int smallIcon;

    public LocalNotificationData(@NotNull LocalNotificationChannel channel, @NotNull String title, @NotNull String message, @DrawableRes int i10) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.channel = channel;
        this.title = title;
        this.message = message;
        this.smallIcon = i10;
    }

    @NotNull
    public final LocalNotificationChannel getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getChannelId() {
        return this.channel.getId();
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getSmallIcon() {
        return this.smallIcon;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ LocalNotificationData(LocalNotificationChannel localNotificationChannel, String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(localNotificationChannel, str, str2, (i11 & 8) != 0 ? R.drawable.icon_notification : i10);
    }
}
