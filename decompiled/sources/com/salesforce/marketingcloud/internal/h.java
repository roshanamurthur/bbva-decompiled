package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/internal/h;", "", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.internal.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, d2 = {"Lcom/salesforce/marketingcloud/internal/h$a;", "", "", "", "data", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage;", "a", "Lcom/salesforce/marketingcloud/messages/Message;", "message", "Lcom/salesforce/marketingcloud/messages/Region;", "region", "", "id", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final NotificationMessage a(@NotNull Message message, @NotNull Region region) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(region, "region");
            return NotificationMessage.INSTANCE.a(message, region);
        }

        @JvmStatic
        @NotNull
        public final NotificationMessage a(@NotNull Map<String, String> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return NotificationMessage.INSTANCE.a(data);
        }

        @JvmStatic
        public final void a(@NotNull NotificationMessage message, int id) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.setNotificationId$sdk_release(id);
        }
    }

    @JvmStatic
    @NotNull
    public static final NotificationMessage a(@NotNull Message message, @NotNull Region region) {
        return INSTANCE.a(message, region);
    }

    @JvmStatic
    @NotNull
    public static final NotificationMessage a(@NotNull Map<String, String> map) {
        return INSTANCE.a(map);
    }

    @JvmStatic
    public static final void a(@NotNull NotificationMessage notificationMessage, int i10) {
        INSTANCE.a(notificationMessage, i10);
    }
}
