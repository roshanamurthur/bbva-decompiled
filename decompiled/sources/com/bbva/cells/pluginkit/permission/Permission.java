package com.bbva.cells.pluginkit.permission;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/bbva/cells/pluginkit/permission/Permission;", "", "", "component1", "", "component2", "name", "isPermanentlyDenied", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Z", "()Z", "<init>", "(Ljava/lang/String;Z)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class Permission {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isPermanentlyDenied;

    public Permission(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.isPermanentlyDenied = z10;
    }

    public static /* synthetic */ Permission copy$default(Permission permission, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = permission.name;
        }
        if ((i10 & 2) != 0) {
            z10 = permission.isPermanentlyDenied;
        }
        return permission.copy(str, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPermanentlyDenied() {
        return this.isPermanentlyDenied;
    }

    @NotNull
    public final Permission copy(@NotNull String name, boolean isPermanentlyDenied) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Permission(name, isPermanentlyDenied);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Permission)) {
            return false;
        }
        Permission permission = (Permission) other;
        return Intrinsics.areEqual(this.name, permission.name) && this.isPermanentlyDenied == permission.isPermanentlyDenied;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z10 = this.isPermanentlyDenied;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isPermanentlyDenied() {
        return this.isPermanentlyDenied;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Permission(name=");
        sb2.append(this.name);
        sb2.append(", isPermanentlyDenied=");
        return i.c(sb2, this.isPermanentlyDenied, ")");
    }
}
