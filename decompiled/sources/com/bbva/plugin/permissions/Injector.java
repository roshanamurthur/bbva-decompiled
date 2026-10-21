package com.bbva.plugin.permissions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/permissions/Injector;", "", "()V", "permissionHandler", "Lcom/bbva/plugin/permissions/PermissionHandler;", "getPermissionHandler", "()Lcom/bbva/plugin/permissions/PermissionHandler;", "setPermissionHandler", "(Lcom/bbva/plugin/permissions/PermissionHandler;)V", "warmUp", "", "permissions-plugin_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();
    public static PermissionHandler permissionHandler;

    public static /* synthetic */ void warmUp$default(Injector injector, PermissionHandler permissionHandler2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            permissionHandler2 = new SilentPermissionHandler();
        }
        injector.warmUp(permissionHandler2);
    }

    @NotNull
    public final PermissionHandler getPermissionHandler() {
        PermissionHandler permissionHandler2 = permissionHandler;
        if (permissionHandler2 != null) {
            return permissionHandler2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permissionHandler");
        return null;
    }

    public final void setPermissionHandler(@NotNull PermissionHandler permissionHandler2) {
        Intrinsics.checkNotNullParameter(permissionHandler2, "<set-?>");
        permissionHandler = permissionHandler2;
    }

    public final void warmUp(@NotNull PermissionHandler permissionHandler2) {
        Intrinsics.checkNotNullParameter(permissionHandler2, "permissionHandler");
        setPermissionHandler(permissionHandler2);
    }
}
