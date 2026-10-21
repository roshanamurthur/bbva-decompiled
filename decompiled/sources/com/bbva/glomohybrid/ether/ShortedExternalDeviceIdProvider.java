package com.bbva.glomohybrid.ether;

import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.deviceuid.DeviceUID;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShortedExternalDeviceIdProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/ether/ShortedExternalDeviceIdProvider;", "Lcom/bbva/glomohybrid/ether/DefaultExternalDeviceIdProvider;", "", "obtain", "generateDeviceId", "Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "deviceIdDataSource", "Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;", "deviceUID", "<init>", "(Lcom/bbva/glomo/localstorage/DeviceIdDataSource;Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class ShortedExternalDeviceIdProvider extends DefaultExternalDeviceIdProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DeviceIdDataSource f32123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DeviceUID f32124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortedExternalDeviceIdProvider(@NotNull DeviceIdDataSource deviceIdDataSource, @NotNull DeviceUID deviceUID) {
        super(deviceIdDataSource, deviceUID);
        Intrinsics.checkNotNullParameter(deviceIdDataSource, "deviceIdDataSource");
        Intrinsics.checkNotNullParameter(deviceUID, "deviceUID");
        this.f32123c = deviceIdDataSource;
        this.f32124d = deviceUID;
    }

    @Override // com.bbva.glomohybrid.ether.DefaultExternalDeviceIdProvider, com.bbva.glomohybrid.ether.ExternalDeviceIdProvider
    @NotNull
    public String generateDeviceId() {
        String str = (String) ResultKt.getOrNull(this.f32124d.uid(true));
        if (str == null) {
            str = "";
        }
        this.f32123c.persistDeviceId(str);
        return str;
    }

    @Override // com.bbva.glomohybrid.ether.DefaultExternalDeviceIdProvider, com.bbva.glomohybrid.ether.ExternalDeviceIdProvider
    @NotNull
    public String obtain() {
        String deviceId = this.f32123c.getDeviceId();
        if (deviceId != null) {
            if (deviceId.length() != 32) {
                deviceId = generateDeviceId();
            }
            if (deviceId != null) {
                return deviceId;
            }
        }
        return generateDeviceId();
    }
}
