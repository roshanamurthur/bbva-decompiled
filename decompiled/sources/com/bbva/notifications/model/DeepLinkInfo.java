package com.bbva.notifications.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepLinkInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/bbva/notifications/model/DeepLinkInfo;", "", "", "component1", "component2", "read", "forceLaunch", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getRead", "()Z", "setRead", "(Z)V", "b", "getForceLaunch", "setForceLaunch", "<init>", "(ZZ)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DeepLinkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean read;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean forceLaunch;

    public DeepLinkInfo(boolean z10, boolean z11) {
        this.read = z10;
        this.forceLaunch = z11;
    }

    public static /* synthetic */ DeepLinkInfo copy$default(DeepLinkInfo deepLinkInfo, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = deepLinkInfo.read;
        }
        if ((i10 & 2) != 0) {
            z11 = deepLinkInfo.forceLaunch;
        }
        return deepLinkInfo.copy(z10, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getForceLaunch() {
        return this.forceLaunch;
    }

    @NotNull
    public final DeepLinkInfo copy(boolean read, boolean forceLaunch) {
        return new DeepLinkInfo(read, forceLaunch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinkInfo)) {
            return false;
        }
        DeepLinkInfo deepLinkInfo = (DeepLinkInfo) other;
        return this.read == deepLinkInfo.read && this.forceLaunch == deepLinkInfo.forceLaunch;
    }

    public final boolean getForceLaunch() {
        return this.forceLaunch;
    }

    public final boolean getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z10 = this.read;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.forceLaunch;
        return i10 + (z11 ? 1 : z11);
    }

    public final void setForceLaunch(boolean z10) {
        this.forceLaunch = z10;
    }

    public final void setRead(boolean z10) {
        this.read = z10;
    }

    @NotNull
    public String toString() {
        return "DeepLinkInfo(read=" + this.read + ", forceLaunch=" + this.forceLaunch + ")";
    }

    public /* synthetic */ DeepLinkInfo(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? false : z11);
    }
}
