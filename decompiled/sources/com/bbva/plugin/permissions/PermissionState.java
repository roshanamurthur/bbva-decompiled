package com.bbva.plugin.permissions;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Permissions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/permissions/PermissionState;", "", "GRANTED", "DENIED", "PERMANENTLY_DENIED", "UNKNOWN", "permissions-plugin_release"}, k = 1, mv = {1, 6, 0})
public final class PermissionState {
    private static final /* synthetic */ PermissionState[] $VALUES;
    public static final PermissionState DENIED;
    public static final PermissionState GRANTED;
    public static final PermissionState PERMANENTLY_DENIED;
    public static final PermissionState UNKNOWN;

    static {
        PermissionState permissionState = new PermissionState("GRANTED", 0);
        GRANTED = permissionState;
        PermissionState permissionState2 = new PermissionState("DENIED", 1);
        DENIED = permissionState2;
        PermissionState permissionState3 = new PermissionState("PERMANENTLY_DENIED", 2);
        PERMANENTLY_DENIED = permissionState3;
        PermissionState permissionState4 = new PermissionState("UNKNOWN", 3);
        UNKNOWN = permissionState4;
        $VALUES = new PermissionState[]{permissionState, permissionState2, permissionState3, permissionState4};
    }

    public PermissionState() {
        throw null;
    }

    public static PermissionState valueOf(String str) {
        return (PermissionState) Enum.valueOf(PermissionState.class, str);
    }

    public static PermissionState[] values() {
        return (PermissionState[]) $VALUES.clone();
    }
}
