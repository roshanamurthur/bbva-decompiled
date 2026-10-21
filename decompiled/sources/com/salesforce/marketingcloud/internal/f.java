package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.Message;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/internal/f;", "", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.internal.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0007¨\u0006\u0011"}, d2 = {"Lcom/salesforce/marketingcloud/internal/f$a;", "", "Lcom/salesforce/marketingcloud/messages/Message;", "message", "", "c", "id", "", "a", "Ljava/util/Date;", "b", "date", "d", "count", "e", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Date a(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getLastShownDate();
        }

        @JvmStatic
        @Nullable
        public final Date b(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getNextAllowedShow();
        }

        @JvmStatic
        public final int c(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getNotificationId();
        }

        @JvmStatic
        public final int d(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getPeriodShowCount();
        }

        @JvmStatic
        public final int e(@NotNull Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getShowCount();
        }

        @JvmStatic
        public final void a(@NotNull Message message, int id) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.m5370notificationId(id);
        }

        @JvmStatic
        public final void b(@NotNull Message message, int count) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.m5372periodShowCount(count);
        }

        @JvmStatic
        public final void c(@NotNull Message message, int count) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.m5374showCount(count);
        }

        @JvmStatic
        public final void a(@NotNull Message message, @Nullable Date date) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.m5366lastShownDate(date);
        }

        @JvmStatic
        public final void b(@NotNull Message message, @Nullable Date date) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.m5368nextAllowedShow(date);
        }
    }

    @JvmStatic
    @Nullable
    public static final Date a(@NotNull Message message) {
        return INSTANCE.a(message);
    }

    @JvmStatic
    @Nullable
    public static final Date b(@NotNull Message message) {
        return INSTANCE.b(message);
    }

    @JvmStatic
    public static final int c(@NotNull Message message) {
        return INSTANCE.c(message);
    }

    @JvmStatic
    public static final int d(@NotNull Message message) {
        return INSTANCE.d(message);
    }

    @JvmStatic
    public static final int e(@NotNull Message message) {
        return INSTANCE.e(message);
    }

    @JvmStatic
    public static final void a(@NotNull Message message, int i10) {
        INSTANCE.a(message, i10);
    }

    @JvmStatic
    public static final void b(@NotNull Message message, int i10) {
        INSTANCE.b(message, i10);
    }

    @JvmStatic
    public static final void c(@NotNull Message message, int i10) {
        INSTANCE.c(message, i10);
    }

    @JvmStatic
    public static final void a(@NotNull Message message, @Nullable Date date) {
        INSTANCE.a(message, date);
    }

    @JvmStatic
    public static final void b(@NotNull Message message, @Nullable Date date) {
        INSTANCE.b(message, date);
    }
}
