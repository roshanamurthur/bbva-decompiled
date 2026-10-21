package com.bbva.glomohybrid.ether;

import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.deviceuid.DeviceUID;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultExternalDeviceIdProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/ether/DefaultExternalDeviceIdProvider;", "Lcom/bbva/glomohybrid/ether/ExternalDeviceIdProvider;", "", "obtain", "generateDeviceId", "Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "deviceIdDataSource", "Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;", "deviceUID", "<init>", "(Lcom/bbva/glomo/localstorage/DeviceIdDataSource;Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public class DefaultExternalDeviceIdProvider implements ExternalDeviceIdProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceIdDataSource f32121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceUID f32122b;

    public DefaultExternalDeviceIdProvider(@NotNull DeviceIdDataSource deviceIdDataSource, @NotNull DeviceUID deviceUID) {
        Intrinsics.checkNotNullParameter(deviceIdDataSource, "deviceIdDataSource");
        Intrinsics.checkNotNullParameter(deviceUID, "deviceUID");
        this.f32121a = deviceIdDataSource;
        this.f32122b = deviceUID;
    }

    @Override // com.bbva.glomohybrid.ether.ExternalDeviceIdProvider
    @NotNull
    public String generateDeviceId() {
        String str = (String) ResultKt.getOrNull(DeviceUID.DefaultImpls.uid$default(this.f32122b, false, 1, null));
        if (str == null) {
            str = "";
        }
        this.f32121a.persistDeviceId(str);
        return str;
    }

    @Override // com.bbva.glomohybrid.ether.ExternalDeviceIdProvider
    @NotNull
    public String obtain() {
        String deviceId = this.f32121a.getDeviceId();
        return deviceId != null ? deviceId : generateDeviceId();
    }
}
