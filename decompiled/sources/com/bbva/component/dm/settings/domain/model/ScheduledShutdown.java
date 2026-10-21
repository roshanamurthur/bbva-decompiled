package com.bbva.component.dm.settings.domain.model;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppStatusConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;", "", "", "component1", "component2", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "component3", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "message", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getStart", "()Ljava/lang/String;", "b", "getEnd", "c", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "getMessage", "()Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ScheduledShutdown {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final VisualMessageConfiguration message;

    public ScheduledShutdown(@Nullable String str, @Nullable String str2, @Nullable VisualMessageConfiguration visualMessageConfiguration) {
        this.start = str;
        this.end = str2;
        this.message = visualMessageConfiguration;
    }

    public static /* synthetic */ ScheduledShutdown copy$default(ScheduledShutdown scheduledShutdown, String str, String str2, VisualMessageConfiguration visualMessageConfiguration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = scheduledShutdown.start;
        }
        if ((i10 & 2) != 0) {
            str2 = scheduledShutdown.end;
        }
        if ((i10 & 4) != 0) {
            visualMessageConfiguration = scheduledShutdown.message;
        }
        return scheduledShutdown.copy(str, str2, visualMessageConfiguration);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VisualMessageConfiguration getMessage() {
        return this.message;
    }

    @NotNull
    public final ScheduledShutdown copy(@Nullable String start, @Nullable String end, @Nullable VisualMessageConfiguration message) {
        return new ScheduledShutdown(start, end, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduledShutdown)) {
            return false;
        }
        ScheduledShutdown scheduledShutdown = (ScheduledShutdown) other;
        return Intrinsics.areEqual(this.start, scheduledShutdown.start) && Intrinsics.areEqual(this.end, scheduledShutdown.end) && Intrinsics.areEqual(this.message, scheduledShutdown.message);
    }

    @Nullable
    public final String getEnd() {
        return this.end;
    }

    @Nullable
    public final VisualMessageConfiguration getMessage() {
        return this.message;
    }

    @Nullable
    public final String getStart() {
        return this.start;
    }

    public int hashCode() {
        String str = this.start;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.end;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VisualMessageConfiguration visualMessageConfiguration = this.message;
        return iHashCode2 + (visualMessageConfiguration != null ? visualMessageConfiguration.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScheduledShutdown(start=" + this.start + ", end=" + this.end + ", message=" + this.message + ")";
    }

    public /* synthetic */ ScheduledShutdown(String str, String str2, VisualMessageConfiguration visualMessageConfiguration, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : visualMessageConfiguration);
    }
}
