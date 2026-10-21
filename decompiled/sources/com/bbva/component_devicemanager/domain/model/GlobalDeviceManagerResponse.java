package com.bbva.component_devicemanager.domain.model;

import androidx.camera.core.impl.a;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceCheckerPlayIntegrityResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceCheckerResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceIdResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceInfoResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceTypeResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceUIdResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.GeolocationResponse;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalDeviceManagerResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0004\b0\u00101J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J{\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#¨\u00062"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/GlobalDeviceManagerResponse;", "", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceIdResponse;", "component1", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceUIdResponse;", "component2", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceTypeResponse;", "component3", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceInfoResponse;", "component4", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerResponse;", "component5", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerPlayIntegrityResponse;", "component6", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/GeolocationResponse;", "component7", "deviceIdResponse", "deviceUIdResponse", "deviceTypeResponse", "deviceInfoResponse", "deviceCheckerResponse", "deviceCheckerPlayIntegrityResponse", "geolocationResponse", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/ethermobile/help/kit/result/Result;", "getDeviceIdResponse", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "b", "getDeviceUIdResponse", "c", "getDeviceTypeResponse", "d", "getDeviceInfoResponse", "e", "getDeviceCheckerResponse", "f", "getDeviceCheckerPlayIntegrityResponse", "g", "getGeolocationResponse", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class GlobalDeviceManagerResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Result<DeviceIdResponse> deviceIdResponse;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Result<DeviceUIdResponse> deviceUIdResponse;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Result<DeviceTypeResponse> deviceTypeResponse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Result<DeviceInfoResponse> deviceInfoResponse;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Result<DeviceCheckerResponse> deviceCheckerResponse;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Result<DeviceCheckerPlayIntegrityResponse> deviceCheckerPlayIntegrityResponse;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Result<GeolocationResponse> geolocationResponse;

    public GlobalDeviceManagerResponse(@NotNull Result<DeviceIdResponse> deviceIdResponse, @NotNull Result<DeviceUIdResponse> deviceUIdResponse, @NotNull Result<DeviceTypeResponse> deviceTypeResponse, @NotNull Result<DeviceInfoResponse> deviceInfoResponse, @NotNull Result<DeviceCheckerResponse> deviceCheckerResponse, @Nullable Result<DeviceCheckerPlayIntegrityResponse> result, @NotNull Result<GeolocationResponse> geolocationResponse) {
        Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
        Intrinsics.checkNotNullParameter(deviceUIdResponse, "deviceUIdResponse");
        Intrinsics.checkNotNullParameter(deviceTypeResponse, "deviceTypeResponse");
        Intrinsics.checkNotNullParameter(deviceInfoResponse, "deviceInfoResponse");
        Intrinsics.checkNotNullParameter(deviceCheckerResponse, "deviceCheckerResponse");
        Intrinsics.checkNotNullParameter(geolocationResponse, "geolocationResponse");
        this.deviceIdResponse = deviceIdResponse;
        this.deviceUIdResponse = deviceUIdResponse;
        this.deviceTypeResponse = deviceTypeResponse;
        this.deviceInfoResponse = deviceInfoResponse;
        this.deviceCheckerResponse = deviceCheckerResponse;
        this.deviceCheckerPlayIntegrityResponse = result;
        this.geolocationResponse = geolocationResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlobalDeviceManagerResponse copy$default(GlobalDeviceManagerResponse globalDeviceManagerResponse, Result result, Result result2, Result result3, Result result4, Result result5, Result result6, Result result7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result = globalDeviceManagerResponse.deviceIdResponse;
        }
        if ((i10 & 2) != 0) {
            result2 = globalDeviceManagerResponse.deviceUIdResponse;
        }
        Result result8 = result2;
        if ((i10 & 4) != 0) {
            result3 = globalDeviceManagerResponse.deviceTypeResponse;
        }
        Result result9 = result3;
        if ((i10 & 8) != 0) {
            result4 = globalDeviceManagerResponse.deviceInfoResponse;
        }
        Result result10 = result4;
        if ((i10 & 16) != 0) {
            result5 = globalDeviceManagerResponse.deviceCheckerResponse;
        }
        Result result11 = result5;
        if ((i10 & 32) != 0) {
            result6 = globalDeviceManagerResponse.deviceCheckerPlayIntegrityResponse;
        }
        Result result12 = result6;
        if ((i10 & 64) != 0) {
            result7 = globalDeviceManagerResponse.geolocationResponse;
        }
        return globalDeviceManagerResponse.copy(result, result8, result9, result10, result11, result12, result7);
    }

    @NotNull
    public final Result<DeviceIdResponse> component1() {
        return this.deviceIdResponse;
    }

    @NotNull
    public final Result<DeviceUIdResponse> component2() {
        return this.deviceUIdResponse;
    }

    @NotNull
    public final Result<DeviceTypeResponse> component3() {
        return this.deviceTypeResponse;
    }

    @NotNull
    public final Result<DeviceInfoResponse> component4() {
        return this.deviceInfoResponse;
    }

    @NotNull
    public final Result<DeviceCheckerResponse> component5() {
        return this.deviceCheckerResponse;
    }

    @Nullable
    public final Result<DeviceCheckerPlayIntegrityResponse> component6() {
        return this.deviceCheckerPlayIntegrityResponse;
    }

    @NotNull
    public final Result<GeolocationResponse> component7() {
        return this.geolocationResponse;
    }

    @NotNull
    public final GlobalDeviceManagerResponse copy(@NotNull Result<DeviceIdResponse> deviceIdResponse, @NotNull Result<DeviceUIdResponse> deviceUIdResponse, @NotNull Result<DeviceTypeResponse> deviceTypeResponse, @NotNull Result<DeviceInfoResponse> deviceInfoResponse, @NotNull Result<DeviceCheckerResponse> deviceCheckerResponse, @Nullable Result<DeviceCheckerPlayIntegrityResponse> deviceCheckerPlayIntegrityResponse, @NotNull Result<GeolocationResponse> geolocationResponse) {
        Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
        Intrinsics.checkNotNullParameter(deviceUIdResponse, "deviceUIdResponse");
        Intrinsics.checkNotNullParameter(deviceTypeResponse, "deviceTypeResponse");
        Intrinsics.checkNotNullParameter(deviceInfoResponse, "deviceInfoResponse");
        Intrinsics.checkNotNullParameter(deviceCheckerResponse, "deviceCheckerResponse");
        Intrinsics.checkNotNullParameter(geolocationResponse, "geolocationResponse");
        return new GlobalDeviceManagerResponse(deviceIdResponse, deviceUIdResponse, deviceTypeResponse, deviceInfoResponse, deviceCheckerResponse, deviceCheckerPlayIntegrityResponse, geolocationResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalDeviceManagerResponse)) {
            return false;
        }
        GlobalDeviceManagerResponse globalDeviceManagerResponse = (GlobalDeviceManagerResponse) other;
        return Intrinsics.areEqual(this.deviceIdResponse, globalDeviceManagerResponse.deviceIdResponse) && Intrinsics.areEqual(this.deviceUIdResponse, globalDeviceManagerResponse.deviceUIdResponse) && Intrinsics.areEqual(this.deviceTypeResponse, globalDeviceManagerResponse.deviceTypeResponse) && Intrinsics.areEqual(this.deviceInfoResponse, globalDeviceManagerResponse.deviceInfoResponse) && Intrinsics.areEqual(this.deviceCheckerResponse, globalDeviceManagerResponse.deviceCheckerResponse) && Intrinsics.areEqual(this.deviceCheckerPlayIntegrityResponse, globalDeviceManagerResponse.deviceCheckerPlayIntegrityResponse) && Intrinsics.areEqual(this.geolocationResponse, globalDeviceManagerResponse.geolocationResponse);
    }

    @Nullable
    public final Result<DeviceCheckerPlayIntegrityResponse> getDeviceCheckerPlayIntegrityResponse() {
        return this.deviceCheckerPlayIntegrityResponse;
    }

    @NotNull
    public final Result<DeviceCheckerResponse> getDeviceCheckerResponse() {
        return this.deviceCheckerResponse;
    }

    @NotNull
    public final Result<DeviceIdResponse> getDeviceIdResponse() {
        return this.deviceIdResponse;
    }

    @NotNull
    public final Result<DeviceInfoResponse> getDeviceInfoResponse() {
        return this.deviceInfoResponse;
    }

    @NotNull
    public final Result<DeviceTypeResponse> getDeviceTypeResponse() {
        return this.deviceTypeResponse;
    }

    @NotNull
    public final Result<DeviceUIdResponse> getDeviceUIdResponse() {
        return this.deviceUIdResponse;
    }

    @NotNull
    public final Result<GeolocationResponse> getGeolocationResponse() {
        return this.geolocationResponse;
    }

    public int hashCode() {
        int iB = a.b(this.deviceCheckerResponse, a.b(this.deviceInfoResponse, a.b(this.deviceTypeResponse, a.b(this.deviceUIdResponse, this.deviceIdResponse.hashCode() * 31, 31), 31), 31), 31);
        Result<DeviceCheckerPlayIntegrityResponse> result = this.deviceCheckerPlayIntegrityResponse;
        return this.geolocationResponse.hashCode() + ((iB + (result == null ? 0 : result.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "GlobalDeviceManagerResponse(deviceIdResponse=" + this.deviceIdResponse + ", deviceUIdResponse=" + this.deviceUIdResponse + ", deviceTypeResponse=" + this.deviceTypeResponse + ", deviceInfoResponse=" + this.deviceInfoResponse + ", deviceCheckerResponse=" + this.deviceCheckerResponse + ", deviceCheckerPlayIntegrityResponse=" + this.deviceCheckerPlayIntegrityResponse + ", geolocationResponse=" + this.geolocationResponse + ")";
    }
}
