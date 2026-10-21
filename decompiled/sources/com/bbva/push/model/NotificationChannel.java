package com.bbva.push.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/bbva/push/model/NotificationChannel;", "", "id", "", "description", "importance", "Lcom/bbva/push/model/NotificationImportance;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/push/model/NotificationImportance;)V", "getDescription", "()Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getImportance", "()Lcom/bbva/push/model/NotificationImportance;", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NotificationChannel {

    @NotNull
    private final String description;

    @NotNull
    private String id;

    @NotNull
    private final NotificationImportance importance;

    public NotificationChannel(@NotNull String id, @NotNull String description, @NotNull NotificationImportance importance) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(importance, "importance");
        this.id = id;
        this.description = description;
        this.importance = importance;
    }

    public static /* synthetic */ NotificationChannel copy$default(NotificationChannel notificationChannel, String str, String str2, NotificationImportance notificationImportance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationChannel.id;
        }
        if ((i10 & 2) != 0) {
            str2 = notificationChannel.description;
        }
        if ((i10 & 4) != 0) {
            notificationImportance = notificationChannel.importance;
        }
        return notificationChannel.copy(str, str2, notificationImportance);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NotificationImportance getImportance() {
        return this.importance;
    }

    @NotNull
    public final NotificationChannel copy(@NotNull String id, @NotNull String description, @NotNull NotificationImportance importance) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(importance, "importance");
        return new NotificationChannel(id, description, importance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationChannel)) {
            return false;
        }
        NotificationChannel notificationChannel = (NotificationChannel) other;
        return Intrinsics.areEqual(this.id, notificationChannel.id) && Intrinsics.areEqual(this.description, notificationChannel.description) && this.importance == notificationChannel.importance;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final NotificationImportance getImportance() {
        return this.importance;
    }

    public int hashCode() {
        return this.importance.hashCode() + n1.c(this.description, this.id.hashCode() * 31, 31);
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    @NotNull
    public String toString() {
        return "NotificationChannel(id=" + this.id + ", description=" + this.description + ", importance=" + this.importance + RootService.CLOSE_BRACKET;
    }
}
