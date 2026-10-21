package com.bbva.component.request.behavior;

import com.bbva.component.request.header.deviceid.DeviceIdInterceptorConfig;
import com.bbva.network.model.request.MutableNetworkRequest;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HandlePublicZoneHeadersBehavior.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H&J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H&¨\u0006\f"}, d2 = {"Lcom/bbva/component/request/behavior/HandlePublicZoneHeadersBehavior;", "", "handle", "", "", "url", "deviceIdInterceptorConfig", "Lcom/bbva/component/request/header/deviceid/DeviceIdInterceptorConfig;", "deviceId", "handleCustomerHeaders", "request", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request-header-deviceid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HandlePublicZoneHeadersBehavior {
    @NotNull
    Map<String, String> handle(@NotNull String url, @NotNull DeviceIdInterceptorConfig deviceIdInterceptorConfig, @NotNull String deviceId);

    @NotNull
    Map<String, String> handleCustomerHeaders(@NotNull MutableNetworkRequest request, @NotNull DeviceIdInterceptorConfig deviceIdInterceptorConfig, @NotNull String deviceId);
}
