package com.bbva.ethermobilesdk.devicemanager.data.deviceuid.repository;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.deviceuid.DeviceUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceUidRepositoryImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepositoryImpl;", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepository;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "getUidDefault", "getUidShort", "Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;", "deviceUid", "<init>", "(Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceUidRepositoryImpl implements DeviceUidRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceUID f29650a;

    public DeviceUidRepositoryImpl(@NotNull DeviceUID deviceUid) {
        Intrinsics.checkNotNullParameter(deviceUid, "deviceUid");
        this.f29650a = deviceUid;
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceuid.repository.DeviceUidRepository
    @NotNull
    public Result<String> getUidDefault() {
        return DeviceUID.DefaultImpls.uid$default(this.f29650a, false, 1, null);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceuid.repository.DeviceUidRepository
    @NotNull
    public Result<String> getUidShort() {
        return this.f29650a.uid(true);
    }
}
