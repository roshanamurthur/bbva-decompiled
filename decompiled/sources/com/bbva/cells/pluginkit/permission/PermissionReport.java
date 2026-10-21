package com.bbva.cells.pluginkit.permission;

import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/bbva/cells/pluginkit/permission/PermissionReport;", "", "", "areAllGranted", "hasPermanentlyDeniedAnyPermission", "", "Lcom/bbva/cells/pluginkit/permission/Permission;", "component1", "component2", "granted", "denied", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/util/List;", "getGranted", "()Ljava/util/List;", "b", "getDenied", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class PermissionReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Permission> granted;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Permission> denied;

    public PermissionReport(@NotNull List<Permission> granted, @NotNull List<Permission> denied) {
        Intrinsics.checkNotNullParameter(granted, "granted");
        Intrinsics.checkNotNullParameter(denied, "denied");
        this.granted = granted;
        this.denied = denied;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermissionReport copy$default(PermissionReport permissionReport, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = permissionReport.granted;
        }
        if ((i10 & 2) != 0) {
            list2 = permissionReport.denied;
        }
        return permissionReport.copy(list, list2);
    }

    public final boolean areAllGranted() {
        return this.denied.isEmpty();
    }

    @NotNull
    public final List<Permission> component1() {
        return this.granted;
    }

    @NotNull
    public final List<Permission> component2() {
        return this.denied;
    }

    @NotNull
    public final PermissionReport copy(@NotNull List<Permission> granted, @NotNull List<Permission> denied) {
        Intrinsics.checkNotNullParameter(granted, "granted");
        Intrinsics.checkNotNullParameter(denied, "denied");
        return new PermissionReport(granted, denied);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionReport)) {
            return false;
        }
        PermissionReport permissionReport = (PermissionReport) other;
        return Intrinsics.areEqual(this.granted, permissionReport.granted) && Intrinsics.areEqual(this.denied, permissionReport.denied);
    }

    @NotNull
    public final List<Permission> getDenied() {
        return this.denied;
    }

    @NotNull
    public final List<Permission> getGranted() {
        return this.granted;
    }

    public final boolean hasPermanentlyDeniedAnyPermission() {
        List<Permission> list = this.denied;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Permission) it.next()).isPermanentlyDenied()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        List<Permission> list = this.granted;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Permission> list2 = this.denied;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionReport(granted=");
        sb2.append(this.granted);
        sb2.append(", denied=");
        return a.c(sb2, this.denied, ")");
    }
}
