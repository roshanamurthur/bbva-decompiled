package com.bbva.ui.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StatusNotification.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\n\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/bbva/ui/compose/StatusNotificationState;", "", "Lcom/bbva/ui/compose/StatusNotificationType;", "component1", "", "component2", "", "component3", "type", "textResId", "isVisible", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/bbva/ui/compose/StatusNotificationType;", "getType", "()Lcom/bbva/ui/compose/StatusNotificationType;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTextResId", "()I", "c", "Z", "()Z", "<init>", "(Lcom/bbva/ui/compose/StatusNotificationType;IZ)V", "ui_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class StatusNotificationState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StatusNotificationType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int textResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isVisible;

    public StatusNotificationState() {
        this(null, 0, false, 7, null);
    }

    public static /* synthetic */ StatusNotificationState copy$default(StatusNotificationState statusNotificationState, StatusNotificationType statusNotificationType, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            statusNotificationType = statusNotificationState.type;
        }
        if ((i11 & 2) != 0) {
            i10 = statusNotificationState.textResId;
        }
        if ((i11 & 4) != 0) {
            z10 = statusNotificationState.isVisible;
        }
        return statusNotificationState.copy(statusNotificationType, i10, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StatusNotificationType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTextResId() {
        return this.textResId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final StatusNotificationState copy(@NotNull StatusNotificationType type, int textResId, boolean isVisible) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new StatusNotificationState(type, textResId, isVisible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusNotificationState)) {
            return false;
        }
        StatusNotificationState statusNotificationState = (StatusNotificationState) other;
        return this.type == statusNotificationState.type && this.textResId == statusNotificationState.textResId && this.isVisible == statusNotificationState.isVisible;
    }

    public final int getTextResId() {
        return this.textResId;
    }

    @NotNull
    public final StatusNotificationType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.textResId) * 31) + (this.isVisible ? 1231 : 1237);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatusNotificationState(type=");
        sb2.append(this.type);
        sb2.append(", textResId=");
        sb2.append(this.textResId);
        sb2.append(", isVisible=");
        return androidx.appcompat.app.i.c(sb2, this.isVisible, ")");
    }

    public StatusNotificationState(@NotNull StatusNotificationType type, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.textResId = i10;
        this.isVisible = z10;
    }

    public /* synthetic */ StatusNotificationState(StatusNotificationType statusNotificationType, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? StatusNotificationType.INFO : statusNotificationType, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10);
    }
}
