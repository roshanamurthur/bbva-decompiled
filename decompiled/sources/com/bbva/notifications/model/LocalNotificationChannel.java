package com.bbva.notifications.model;

import androidx.annotation.StringRes;
import com.bbva.notifications.R;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalNotification.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bbva/notifications/model/LocalNotificationChannel;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getName", "()I", "name", "c", "getDescription", "description", "d", "getPriority", "priority", "<init>", "(Ljava/lang/String;III)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LocalNotificationChannel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final LocalNotificationChannel f35390e = new LocalNotificationChannel("wear-notifications-channel", R.string.label_wear, R.string.message_wear_channel_description, 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int priority;

    /* JADX INFO: compiled from: LocalNotification.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/notifications/model/LocalNotificationChannel$Companion;", "", "()V", "WEAR", "Lcom/bbva/notifications/model/LocalNotificationChannel;", "getWEAR", "()Lcom/bbva/notifications/model/LocalNotificationChannel;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocalNotificationChannel getWEAR() {
            return LocalNotificationChannel.f35390e;
        }
    }

    public LocalNotificationChannel(@NotNull String id, @StringRes int i10, @StringRes int i11, int i12) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.name = i10;
        this.description = i11;
        this.priority = i12;
    }

    public final int getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public /* synthetic */ LocalNotificationChannel(String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, (i13 & 8) != 0 ? 3 : i12);
    }
}
