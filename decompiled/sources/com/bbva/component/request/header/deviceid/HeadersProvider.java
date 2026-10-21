package com.bbva.component.request.header.deviceid;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeadersProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/bbva/component/request/header/deviceid/HeadersProvider;", "", "provideHeaders", "", "", "config", "Lcom/bbva/component/request/header/deviceid/DeviceIdInterceptorConfig;", "deviceId", "request-header-deviceid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HeadersProvider {
    @NotNull
    Map<String, String> provideHeaders(@NotNull DeviceIdInterceptorConfig config, @NotNull String deviceId);
}
