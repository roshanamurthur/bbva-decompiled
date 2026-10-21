package com.veridas.permissions;

import kotlin.Metadata;

/* JADX INFO: compiled from: PermissionsActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001R\"\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"com/veridas/permissions/PermissionsActivity$permissionsToRequest$2$1$1", "Lcom/veridas/permissions/IPermission;", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class PermissionsActivity$permissionsToRequest$2$1$1 implements IPermission {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    public PermissionsActivity$permissionsToRequest$2$1$1(String str) {
        this.id = str;
    }

    @Override // com.veridas.permissions.IPermission
    public String getId() {
        return this.id;
    }
}
