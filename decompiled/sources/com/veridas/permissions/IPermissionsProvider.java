package com.veridas.permissions;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IPermissionsProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/veridas/permissions/IPermissionsProvider;", "", "arePermissionsGranted", "", "permissions", "", "Lcom/veridas/permissions/IPermission;", "getPermissionStatus", "Lcom/veridas/permissions/PermissionStatus;", "permission", "getPermissionsStatus", "isPermissionGranted", "requestPermission", "(Lcom/veridas/permissions/IPermission;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPermissions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IPermissionsProvider {
    boolean arePermissionsGranted(@NotNull List<? extends IPermission> permissions);

    @NotNull
    PermissionStatus getPermissionStatus(@NotNull IPermission permission);

    @NotNull
    List<PermissionStatus> getPermissionsStatus(@NotNull List<? extends IPermission> permissions);

    boolean isPermissionGranted(@NotNull IPermission permission);

    @Nullable
    Object requestPermission(@NotNull IPermission iPermission, @NotNull Continuation<? super PermissionStatus> continuation);

    @Nullable
    Object requestPermissions(@NotNull List<? extends IPermission> list, @NotNull Continuation<? super List<? extends PermissionStatus>> continuation);
}
