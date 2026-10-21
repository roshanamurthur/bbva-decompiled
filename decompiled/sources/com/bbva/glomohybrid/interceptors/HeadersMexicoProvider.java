package com.bbva.glomohybrid.interceptors;

import androidx.camera.core.processing.f;
import bk.q;
import com.bbva.component.request.header.deviceid.DeviceIdInterceptorConfig;
import com.bbva.component.request.header.deviceid.HeadersProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeadersMexicoProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/interceptors/HeadersMexicoProvider;", "Lcom/bbva/component/request/header/deviceid/HeadersProvider;", "Lcom/bbva/component/request/header/deviceid/DeviceIdInterceptorConfig;", "config", "", "deviceId", "", "provideHeaders", "<init>", "()V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class HeadersMexicoProvider implements HeadersProvider {
    @Override // com.bbva.component.request.header.deviceid.HeadersProvider
    @NotNull
    public Map<String, String> provideHeaders(@NotNull DeviceIdInterceptorConfig config, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        String authenticationType = config.getAuthenticationType();
        String strD = f.d("deviceId=", deviceId);
        Pair[] pairArr = new Pair[2];
        if (authenticationType == null) {
            authenticationType = "";
        }
        pairArr[0] = TuplesKt.to("authenticationtype", authenticationType);
        pairArr[1] = TuplesKt.to("authenticationdata", strD);
        return q.mapOf(pairArr);
    }
}
