package com.bbva.ethermobilesdk.devicemanager.data.permission.repository;

import com.bbva.ethermobile.help.kit.result.Result;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PermissionRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "", "isGrantedAccessFineLocation", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "isGrantedAccessCoarseLocation", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PermissionRepository {
    @NotNull
    Result<Boolean> isGrantedAccessCoarseLocation();

    @NotNull
    Result<Boolean> isGrantedAccessFineLocation();
}
