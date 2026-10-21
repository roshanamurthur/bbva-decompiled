package com.bbva.component.dm.devices.data;

import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HorizonUnrollNotificationsDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/devices/data/HorizonUnrollNotificationsDataSource;", "Lcom/bbva/component/dm/devices/data/UnrollNotificationsDataSource;", "", "e", "Ljava/lang/String;", "getAPI_PATH", "()Ljava/lang/String;", "API_PATH", "Lcom/bbva/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0})
public final class HorizonUnrollNotificationsDataSource extends UnrollNotificationsDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String API_PATH;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizonUnrollNotificationsDataSource(@NotNull NetworkWorker worker) {
        super(worker);
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.API_PATH = "/devices-management/v0/devices/" + getDEVICE_ID() + "/applications/" + getAPPLICATION_ID();
    }

    @Override // com.bbva.component.dm.devices.data.UnrollNotificationsDataSource
    @NotNull
    public String getAPI_PATH() {
        return this.API_PATH;
    }
}
