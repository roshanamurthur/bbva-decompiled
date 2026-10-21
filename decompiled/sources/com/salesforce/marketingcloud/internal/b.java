package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/internal/b;", "", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.internal.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0007J\u0018\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0007¨\u0006\u0010"}, d2 = {"Lcom/salesforce/marketingcloud/internal/b$a;", "", "Lcom/salesforce/marketingcloud/messages/inbox/InboxMessage;", "message", "", "b", "", "c", "a", "", "read", "", "deleted", "dirty", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final String a(@NotNull InboxMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getMessageHash();
        }

        @JvmStatic
        @Nullable
        public final String b(@NotNull InboxMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getRequestId();
        }

        @JvmStatic
        public final int c(@NotNull InboxMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getViewCount();
        }

        @JvmStatic
        public final void a(@NotNull InboxMessage message, boolean deleted) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.m5443deleted(deleted);
        }

        @JvmStatic
        public final void b(@NotNull InboxMessage message, boolean dirty) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.m5458dirty(dirty);
        }

        @JvmStatic
        public final void c(@NotNull InboxMessage message, boolean read) {
            Intrinsics.checkNotNullParameter(message, "message");
            message.m5461read(read);
        }
    }

    @JvmStatic
    @Nullable
    public static final String a(@NotNull InboxMessage inboxMessage) {
        return INSTANCE.a(inboxMessage);
    }

    @JvmStatic
    @Nullable
    public static final String b(@NotNull InboxMessage inboxMessage) {
        return INSTANCE.b(inboxMessage);
    }

    @JvmStatic
    public static final int c(@NotNull InboxMessage inboxMessage) {
        return INSTANCE.c(inboxMessage);
    }

    @JvmStatic
    public static final void a(@NotNull InboxMessage inboxMessage, boolean z10) {
        INSTANCE.a(inboxMessage, z10);
    }

    @JvmStatic
    public static final void b(@NotNull InboxMessage inboxMessage, boolean z10) {
        INSTANCE.b(inboxMessage, z10);
    }

    @JvmStatic
    public static final void c(@NotNull InboxMessage inboxMessage, boolean z10) {
        INSTANCE.c(inboxMessage, z10);
    }
}
