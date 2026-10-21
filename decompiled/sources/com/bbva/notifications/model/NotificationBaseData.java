package com.bbva.notifications.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationNoCommercialData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/notifications/model/NotificationBaseData;", "", "data", "Lcom/bbva/notifications/model/NotificationNoCommercialData;", "(Lcom/bbva/notifications/model/NotificationNoCommercialData;)V", "getData", "()Lcom/bbva/notifications/model/NotificationNoCommercialData;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NotificationBaseData {

    @Nullable
    private final NotificationNoCommercialData data;

    public NotificationBaseData(@Nullable NotificationNoCommercialData notificationNoCommercialData) {
        this.data = notificationNoCommercialData;
    }

    public static /* synthetic */ NotificationBaseData copy$default(NotificationBaseData notificationBaseData, NotificationNoCommercialData notificationNoCommercialData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            notificationNoCommercialData = notificationBaseData.data;
        }
        return notificationBaseData.copy(notificationNoCommercialData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NotificationNoCommercialData getData() {
        return this.data;
    }

    @NotNull
    public final NotificationBaseData copy(@Nullable NotificationNoCommercialData data) {
        return new NotificationBaseData(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationBaseData) && Intrinsics.areEqual(this.data, ((NotificationBaseData) other).data);
    }

    @Nullable
    public final NotificationNoCommercialData getData() {
        return this.data;
    }

    public int hashCode() {
        NotificationNoCommercialData notificationNoCommercialData = this.data;
        if (notificationNoCommercialData == null) {
            return 0;
        }
        return notificationNoCommercialData.hashCode();
    }

    @NotNull
    public String toString() {
        return "NotificationBaseData(data=" + this.data + ")";
    }
}
