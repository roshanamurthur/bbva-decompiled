package com.bbva.ethermobilesdk.devicemanager.data.permission.repository;

import android.content.Context;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.extension.ContextKt;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PermissionRepositoryImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepositoryImpl;", "Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "isGrantedAccessFineLocation", "isGrantedAccessCoarseLocation", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class PermissionRepositoryImpl implements PermissionRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29658a;

    public PermissionRepositoryImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29658a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.ethermobilesdk.devicemanager.data.permission.repository.PermissionRepository
    @NotNull
    public Result<Boolean> isGrantedAccessCoarseLocation() {
        if (ContextKt.isGrantedPermission(this.f29658a, "android.permission.ACCESS_COARSE_LOCATION")) {
            return new Result.Success(Boolean.TRUE);
        }
        return new Result.Error(new DeviceManagerError.GeolocationError.AccessCoarseLocationNotGranted(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.ethermobilesdk.devicemanager.data.permission.repository.PermissionRepository
    @NotNull
    public Result<Boolean> isGrantedAccessFineLocation() {
        if (ContextKt.isGrantedPermission(this.f29658a, "android.permission.ACCESS_FINE_LOCATION")) {
            return new Result.Success(Boolean.TRUE);
        }
        return new Result.Error(new DeviceManagerError.GeolocationError.AccessFineLocationNotGranted(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }
}
