package com.bbva.push.model;

import androidx.annotation.Keep;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/bbva/push/model/Push;", "", "origin", "", "notification", "Lcom/bbva/push/model/NotificationOptions;", "data", "", "(Ljava/lang/String;Lcom/bbva/push/model/NotificationOptions;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "setData", "(Ljava/util/Map;)V", "getNotification", "()Lcom/bbva/push/model/NotificationOptions;", "setNotification", "(Lcom/bbva/push/model/NotificationOptions;)V", "getOrigin", "()Ljava/lang/String;", "setOrigin", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Push {

    @NotNull
    private Map<String, String> data;

    @NotNull
    private NotificationOptions notification;

    @NotNull
    private String origin;

    public Push(@NotNull String origin, @NotNull NotificationOptions notification, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(data, "data");
        this.origin = origin;
        this.notification = notification;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Push copy$default(Push push, String str, NotificationOptions notificationOptions, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = push.origin;
        }
        if ((i10 & 2) != 0) {
            notificationOptions = push.notification;
        }
        if ((i10 & 4) != 0) {
            map = push.data;
        }
        return push.copy(str, notificationOptions, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NotificationOptions getNotification() {
        return this.notification;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.data;
    }

    @NotNull
    public final Push copy(@NotNull String origin, @NotNull NotificationOptions notification, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Push(origin, notification, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Push)) {
            return false;
        }
        Push push = (Push) other;
        return Intrinsics.areEqual(this.origin, push.origin) && Intrinsics.areEqual(this.notification, push.notification) && Intrinsics.areEqual(this.data, push.data);
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }

    @NotNull
    public final NotificationOptions getNotification() {
        return this.notification;
    }

    @NotNull
    public final String getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return this.data.hashCode() + ((this.notification.hashCode() + (this.origin.hashCode() * 31)) * 31);
    }

    public final void setData(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.data = map;
    }

    public final void setNotification(@NotNull NotificationOptions notificationOptions) {
        Intrinsics.checkNotNullParameter(notificationOptions, "<set-?>");
        this.notification = notificationOptions;
    }

    public final void setOrigin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.origin = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Push(origin=");
        sb2.append(this.origin);
        sb2.append(", notification=");
        sb2.append(this.notification);
        sb2.append(", data=");
        return e.g(sb2, this.data, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ Push(String str, NotificationOptions notificationOptions, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, notificationOptions, map);
    }
}
