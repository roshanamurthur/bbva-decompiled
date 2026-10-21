package com.bbva.component.dm.akamai.interceptor;

import com.akamai.botman.CYFMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AkamaiSensorInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/akamai/interceptor/AkamaiSensorInfo;", "Lcom/bbva/component/dm/akamai/interceptor/SensorInfo;", "()V", "data", "", "getData", "()Ljava/lang/String;", "component-ic-akamai_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AkamaiSensorInfo implements SensorInfo {
    @Override // com.bbva.component.dm.akamai.interceptor.SensorInfo
    @NotNull
    public String getData() {
        String sensorData = CYFMonitor.getSensorData();
        Intrinsics.checkNotNullExpressionValue(sensorData, "getSensorData()");
        return sensorData;
    }
}
