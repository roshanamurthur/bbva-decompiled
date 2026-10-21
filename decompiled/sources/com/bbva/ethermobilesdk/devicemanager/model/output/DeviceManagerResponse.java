package com.bbva.ethermobilesdk.devicemanager.model.output;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.camera.core.impl.a;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse;", "", "<init>", "()V", "DeviceManagerDefaultResponse", "DeviceManagerGmsResponse", "DeviceManagerGmsIdResponse", "DeviceManagerHmsResponse", "DeviceManagerHmsIdResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerDefaultResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerGmsIdResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerGmsResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerHmsIdResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerHmsResponse;", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceManagerResponse {

    /* JADX INFO: compiled from: DeviceManagerResponse.kt */
    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003JY\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006#"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerDefaultResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse;", "deviceIdResponse", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceIdResponse;", "deviceUIdResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceUIdResponse;", "deviceTypeResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceTypeResponse;", "deviceInfoResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceInfoResponse;", "deviceCheckerResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerResponse;", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;)V", "getDeviceIdResponse", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "getDeviceUIdResponse", "getDeviceTypeResponse", "getDeviceInfoResponse", "getDeviceCheckerResponse", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceManagerDefaultResponse extends DeviceManagerResponse {

        @NotNull
        private final Result<DeviceCheckerResponse> deviceCheckerResponse;

        @NotNull
        private final Result<DeviceIdResponse> deviceIdResponse;

        @NotNull
        private final Result<DeviceInfoResponse> deviceInfoResponse;

        @NotNull
        private final Result<DeviceTypeResponse> deviceTypeResponse;

        @NotNull
        private final Result<DeviceUIdResponse> deviceUIdResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceManagerDefaultResponse(@NotNull Result<DeviceIdResponse> deviceIdResponse, @NotNull Result<DeviceUIdResponse> deviceUIdResponse, @NotNull Result<DeviceTypeResponse> deviceTypeResponse, @NotNull Result<DeviceInfoResponse> deviceInfoResponse, @NotNull Result<DeviceCheckerResponse> deviceCheckerResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            Intrinsics.checkNotNullParameter(deviceUIdResponse, "deviceUIdResponse");
            Intrinsics.checkNotNullParameter(deviceTypeResponse, "deviceTypeResponse");
            Intrinsics.checkNotNullParameter(deviceInfoResponse, "deviceInfoResponse");
            Intrinsics.checkNotNullParameter(deviceCheckerResponse, "deviceCheckerResponse");
            this.deviceIdResponse = deviceIdResponse;
            this.deviceUIdResponse = deviceUIdResponse;
            this.deviceTypeResponse = deviceTypeResponse;
            this.deviceInfoResponse = deviceInfoResponse;
            this.deviceCheckerResponse = deviceCheckerResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeviceManagerDefaultResponse copy$default(DeviceManagerDefaultResponse deviceManagerDefaultResponse, Result result, Result result2, Result result3, Result result4, Result result5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                result = deviceManagerDefaultResponse.deviceIdResponse;
            }
            if ((i10 & 2) != 0) {
                result2 = deviceManagerDefaultResponse.deviceUIdResponse;
            }
            Result result6 = result2;
            if ((i10 & 4) != 0) {
                result3 = deviceManagerDefaultResponse.deviceTypeResponse;
            }
            Result result7 = result3;
            if ((i10 & 8) != 0) {
                result4 = deviceManagerDefaultResponse.deviceInfoResponse;
            }
            Result result8 = result4;
            if ((i10 & 16) != 0) {
                result5 = deviceManagerDefaultResponse.deviceCheckerResponse;
            }
            return deviceManagerDefaultResponse.copy(result, result6, result7, result8, result5);
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

        @NotNull
        public final DeviceManagerDefaultResponse copy(@NotNull Result<DeviceIdResponse> deviceIdResponse, @NotNull Result<DeviceUIdResponse> deviceUIdResponse, @NotNull Result<DeviceTypeResponse> deviceTypeResponse, @NotNull Result<DeviceInfoResponse> deviceInfoResponse, @NotNull Result<DeviceCheckerResponse> deviceCheckerResponse) {
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            Intrinsics.checkNotNullParameter(deviceUIdResponse, "deviceUIdResponse");
            Intrinsics.checkNotNullParameter(deviceTypeResponse, "deviceTypeResponse");
            Intrinsics.checkNotNullParameter(deviceInfoResponse, "deviceInfoResponse");
            Intrinsics.checkNotNullParameter(deviceCheckerResponse, "deviceCheckerResponse");
            return new DeviceManagerDefaultResponse(deviceIdResponse, deviceUIdResponse, deviceTypeResponse, deviceInfoResponse, deviceCheckerResponse);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceManagerDefaultResponse)) {
                return false;
            }
            DeviceManagerDefaultResponse deviceManagerDefaultResponse = (DeviceManagerDefaultResponse) other;
            return Intrinsics.areEqual(this.deviceIdResponse, deviceManagerDefaultResponse.deviceIdResponse) && Intrinsics.areEqual(this.deviceUIdResponse, deviceManagerDefaultResponse.deviceUIdResponse) && Intrinsics.areEqual(this.deviceTypeResponse, deviceManagerDefaultResponse.deviceTypeResponse) && Intrinsics.areEqual(this.deviceInfoResponse, deviceManagerDefaultResponse.deviceInfoResponse) && Intrinsics.areEqual(this.deviceCheckerResponse, deviceManagerDefaultResponse.deviceCheckerResponse);
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

        public int hashCode() {
            return this.deviceCheckerResponse.hashCode() + a.b(this.deviceInfoResponse, a.b(this.deviceTypeResponse, a.b(this.deviceUIdResponse, this.deviceIdResponse.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Result<DeviceIdResponse> result = this.deviceIdResponse;
            Result<DeviceUIdResponse> result2 = this.deviceUIdResponse;
            Result<DeviceTypeResponse> result3 = this.deviceTypeResponse;
            Result<DeviceInfoResponse> result4 = this.deviceInfoResponse;
            Result<DeviceCheckerResponse> result5 = this.deviceCheckerResponse;
            StringBuilder sb2 = new StringBuilder("DeviceManagerDefaultResponse(deviceIdResponse=");
            sb2.append(result);
            sb2.append(", deviceUIdResponse=");
            sb2.append(result2);
            sb2.append(", deviceTypeResponse=");
            i.g(sb2, result3, ", deviceInfoResponse=", result4, ", deviceCheckerResponse=");
            sb2.append(result5);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: DeviceManagerResponse.kt */
    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerGmsIdResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse;", "deviceIdResponse", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceIdResponse;", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;)V", "getDeviceIdResponse", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceManagerGmsIdResponse extends DeviceManagerResponse {

        @NotNull
        private final Result<DeviceIdResponse> deviceIdResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceManagerGmsIdResponse(@NotNull Result<DeviceIdResponse> deviceIdResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            this.deviceIdResponse = deviceIdResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeviceManagerGmsIdResponse copy$default(DeviceManagerGmsIdResponse deviceManagerGmsIdResponse, Result result, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                result = deviceManagerGmsIdResponse.deviceIdResponse;
            }
            return deviceManagerGmsIdResponse.copy(result);
        }

        @NotNull
        public final Result<DeviceIdResponse> component1() {
            return this.deviceIdResponse;
        }

        @NotNull
        public final DeviceManagerGmsIdResponse copy(@NotNull Result<DeviceIdResponse> deviceIdResponse) {
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            return new DeviceManagerGmsIdResponse(deviceIdResponse);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeviceManagerGmsIdResponse) && Intrinsics.areEqual(this.deviceIdResponse, ((DeviceManagerGmsIdResponse) other).deviceIdResponse);
        }

        @NotNull
        public final Result<DeviceIdResponse> getDeviceIdResponse() {
            return this.deviceIdResponse;
        }

        public int hashCode() {
            return this.deviceIdResponse.hashCode();
        }

        @NotNull
        public String toString() {
            return "DeviceManagerGmsIdResponse(deviceIdResponse=" + this.deviceIdResponse + ")";
        }
    }

    /* JADX INFO: compiled from: DeviceManagerResponse.kt */
    @Keep
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0003Jy\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006+"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerGmsResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse;", "deviceIdResponse", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceIdResponse;", "deviceUIdResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceUIdResponse;", "deviceTypeResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceTypeResponse;", "deviceInfoResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceInfoResponse;", "deviceCheckerResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerResponse;", "deviceCheckerPlayIntegrityResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerPlayIntegrityResponse;", "geolocationResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/GeolocationResponse;", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;)V", "getDeviceIdResponse", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "getDeviceUIdResponse", "getDeviceTypeResponse", "getDeviceInfoResponse", "getDeviceCheckerResponse", "getDeviceCheckerPlayIntegrityResponse", "getGeolocationResponse", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceManagerGmsResponse extends DeviceManagerResponse {

        @NotNull
        private final Result<DeviceCheckerPlayIntegrityResponse> deviceCheckerPlayIntegrityResponse;

        @NotNull
        private final Result<DeviceCheckerResponse> deviceCheckerResponse;

        @NotNull
        private final Result<DeviceIdResponse> deviceIdResponse;

        @NotNull
        private final Result<DeviceInfoResponse> deviceInfoResponse;

        @NotNull
        private final Result<DeviceTypeResponse> deviceTypeResponse;

        @NotNull
        private final Result<DeviceUIdResponse> deviceUIdResponse;

        @NotNull
        private final Result<GeolocationResponse> geolocationResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceManagerGmsResponse(@NotNull Result<DeviceIdResponse> deviceIdResponse, @NotNull Result<DeviceUIdResponse> deviceUIdResponse, @NotNull Result<DeviceTypeResponse> deviceTypeResponse, @NotNull Result<DeviceInfoResponse> deviceInfoResponse, @NotNull Result<DeviceCheckerResponse> deviceCheckerResponse, @NotNull Result<DeviceCheckerPlayIntegrityResponse> deviceCheckerPlayIntegrityResponse, @NotNull Result<GeolocationResponse> geolocationResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            Intrinsics.checkNotNullParameter(deviceUIdResponse, "deviceUIdResponse");
            Intrinsics.checkNotNullParameter(deviceTypeResponse, "deviceTypeResponse");
            Intrinsics.checkNotNullParameter(deviceInfoResponse, "deviceInfoResponse");
            Intrinsics.checkNotNullParameter(deviceCheckerResponse, "deviceCheckerResponse");
            Intrinsics.checkNotNullParameter(deviceCheckerPlayIntegrityResponse, "deviceCheckerPlayIntegrityResponse");
            Intrinsics.checkNotNullParameter(geolocationResponse, "geolocationResponse");
            this.deviceIdResponse = deviceIdResponse;
            this.deviceUIdResponse = deviceUIdResponse;
            this.deviceTypeResponse = deviceTypeResponse;
            this.deviceInfoResponse = deviceInfoResponse;
            this.deviceCheckerResponse = deviceCheckerResponse;
            this.deviceCheckerPlayIntegrityResponse = deviceCheckerPlayIntegrityResponse;
            this.geolocationResponse = geolocationResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeviceManagerGmsResponse copy$default(DeviceManagerGmsResponse deviceManagerGmsResponse, Result result, Result result2, Result result3, Result result4, Result result5, Result result6, Result result7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                result = deviceManagerGmsResponse.deviceIdResponse;
            }
            if ((i10 & 2) != 0) {
                result2 = deviceManagerGmsResponse.deviceUIdResponse;
            }
            Result result8 = result2;
            if ((i10 & 4) != 0) {
                result3 = deviceManagerGmsResponse.deviceTypeResponse;
            }
            Result result9 = result3;
            if ((i10 & 8) != 0) {
                result4 = deviceManagerGmsResponse.deviceInfoResponse;
            }
            Result result10 = result4;
            if ((i10 & 16) != 0) {
                result5 = deviceManagerGmsResponse.deviceCheckerResponse;
            }
            Result result11 = result5;
            if ((i10 & 32) != 0) {
                result6 = deviceManagerGmsResponse.deviceCheckerPlayIntegrityResponse;
            }
            Result result12 = result6;
            if ((i10 & 64) != 0) {
                result7 = deviceManagerGmsResponse.geolocationResponse;
            }
            return deviceManagerGmsResponse.copy(result, result8, result9, result10, result11, result12, result7);
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

        @NotNull
        public final Result<DeviceCheckerPlayIntegrityResponse> component6() {
            return this.deviceCheckerPlayIntegrityResponse;
        }

        @NotNull
        public final Result<GeolocationResponse> component7() {
            return this.geolocationResponse;
        }

        @NotNull
        public final DeviceManagerGmsResponse copy(@NotNull Result<DeviceIdResponse> deviceIdResponse, @NotNull Result<DeviceUIdResponse> deviceUIdResponse, @NotNull Result<DeviceTypeResponse> deviceTypeResponse, @NotNull Result<DeviceInfoResponse> deviceInfoResponse, @NotNull Result<DeviceCheckerResponse> deviceCheckerResponse, @NotNull Result<DeviceCheckerPlayIntegrityResponse> deviceCheckerPlayIntegrityResponse, @NotNull Result<GeolocationResponse> geolocationResponse) {
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            Intrinsics.checkNotNullParameter(deviceUIdResponse, "deviceUIdResponse");
            Intrinsics.checkNotNullParameter(deviceTypeResponse, "deviceTypeResponse");
            Intrinsics.checkNotNullParameter(deviceInfoResponse, "deviceInfoResponse");
            Intrinsics.checkNotNullParameter(deviceCheckerResponse, "deviceCheckerResponse");
            Intrinsics.checkNotNullParameter(deviceCheckerPlayIntegrityResponse, "deviceCheckerPlayIntegrityResponse");
            Intrinsics.checkNotNullParameter(geolocationResponse, "geolocationResponse");
            return new DeviceManagerGmsResponse(deviceIdResponse, deviceUIdResponse, deviceTypeResponse, deviceInfoResponse, deviceCheckerResponse, deviceCheckerPlayIntegrityResponse, geolocationResponse);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceManagerGmsResponse)) {
                return false;
            }
            DeviceManagerGmsResponse deviceManagerGmsResponse = (DeviceManagerGmsResponse) other;
            return Intrinsics.areEqual(this.deviceIdResponse, deviceManagerGmsResponse.deviceIdResponse) && Intrinsics.areEqual(this.deviceUIdResponse, deviceManagerGmsResponse.deviceUIdResponse) && Intrinsics.areEqual(this.deviceTypeResponse, deviceManagerGmsResponse.deviceTypeResponse) && Intrinsics.areEqual(this.deviceInfoResponse, deviceManagerGmsResponse.deviceInfoResponse) && Intrinsics.areEqual(this.deviceCheckerResponse, deviceManagerGmsResponse.deviceCheckerResponse) && Intrinsics.areEqual(this.deviceCheckerPlayIntegrityResponse, deviceManagerGmsResponse.deviceCheckerPlayIntegrityResponse) && Intrinsics.areEqual(this.geolocationResponse, deviceManagerGmsResponse.geolocationResponse);
        }

        @NotNull
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
            return this.geolocationResponse.hashCode() + a.b(this.deviceCheckerPlayIntegrityResponse, a.b(this.deviceCheckerResponse, a.b(this.deviceInfoResponse, a.b(this.deviceTypeResponse, a.b(this.deviceUIdResponse, this.deviceIdResponse.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Result<DeviceIdResponse> result = this.deviceIdResponse;
            Result<DeviceUIdResponse> result2 = this.deviceUIdResponse;
            Result<DeviceTypeResponse> result3 = this.deviceTypeResponse;
            Result<DeviceInfoResponse> result4 = this.deviceInfoResponse;
            Result<DeviceCheckerResponse> result5 = this.deviceCheckerResponse;
            Result<DeviceCheckerPlayIntegrityResponse> result6 = this.deviceCheckerPlayIntegrityResponse;
            Result<GeolocationResponse> result7 = this.geolocationResponse;
            StringBuilder sb2 = new StringBuilder("DeviceManagerGmsResponse(deviceIdResponse=");
            sb2.append(result);
            sb2.append(", deviceUIdResponse=");
            sb2.append(result2);
            sb2.append(", deviceTypeResponse=");
            i.g(sb2, result3, ", deviceInfoResponse=", result4, ", deviceCheckerResponse=");
            i.g(sb2, result5, ", deviceCheckerPlayIntegrityResponse=", result6, ", geolocationResponse=");
            sb2.append(result7);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: DeviceManagerResponse.kt */
    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerHmsIdResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse;", "deviceIdResponse", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceIdResponse;", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;)V", "getDeviceIdResponse", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceManagerHmsIdResponse extends DeviceManagerResponse {

        @NotNull
        private final Result<DeviceIdResponse> deviceIdResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceManagerHmsIdResponse(@NotNull Result<DeviceIdResponse> deviceIdResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            this.deviceIdResponse = deviceIdResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeviceManagerHmsIdResponse copy$default(DeviceManagerHmsIdResponse deviceManagerHmsIdResponse, Result result, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                result = deviceManagerHmsIdResponse.deviceIdResponse;
            }
            return deviceManagerHmsIdResponse.copy(result);
        }

        @NotNull
        public final Result<DeviceIdResponse> component1() {
            return this.deviceIdResponse;
        }

        @NotNull
        public final DeviceManagerHmsIdResponse copy(@NotNull Result<DeviceIdResponse> deviceIdResponse) {
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            return new DeviceManagerHmsIdResponse(deviceIdResponse);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeviceManagerHmsIdResponse) && Intrinsics.areEqual(this.deviceIdResponse, ((DeviceManagerHmsIdResponse) other).deviceIdResponse);
        }

        @NotNull
        public final Result<DeviceIdResponse> getDeviceIdResponse() {
            return this.deviceIdResponse;
        }

        public int hashCode() {
            return this.deviceIdResponse.hashCode();
        }

        @NotNull
        public String toString() {
            return "DeviceManagerHmsIdResponse(deviceIdResponse=" + this.deviceIdResponse + ")";
        }
    }

    /* JADX INFO: compiled from: DeviceManagerResponse.kt */
    @Keep
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006'"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerHmsResponse;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse;", "deviceIdResponse", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceIdResponse;", "deviceUIdResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceUIdResponse;", "deviceTypeResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceTypeResponse;", "deviceInfoResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceInfoResponse;", "deviceCheckerResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerResponse;", "geolocationResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/GeolocationResponse;", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;)V", "getDeviceIdResponse", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "getDeviceUIdResponse", "getDeviceTypeResponse", "getDeviceInfoResponse", "getDeviceCheckerResponse", "getGeolocationResponse", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceManagerHmsResponse extends DeviceManagerResponse {

        @NotNull
        private final Result<DeviceCheckerResponse> deviceCheckerResponse;

        @NotNull
        private final Result<DeviceIdResponse> deviceIdResponse;

        @NotNull
        private final Result<DeviceInfoResponse> deviceInfoResponse;

        @NotNull
        private final Result<DeviceTypeResponse> deviceTypeResponse;

        @NotNull
        private final Result<DeviceUIdResponse> deviceUIdResponse;

        @NotNull
        private final Result<GeolocationResponse> geolocationResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceManagerHmsResponse(@NotNull Result<DeviceIdResponse> deviceIdResponse, @NotNull Result<DeviceUIdResponse> deviceUIdResponse, @NotNull Result<DeviceTypeResponse> deviceTypeResponse, @NotNull Result<DeviceInfoResponse> deviceInfoResponse, @NotNull Result<DeviceCheckerResponse> deviceCheckerResponse, @NotNull Result<GeolocationResponse> geolocationResponse) {
            super(null);
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
            this.geolocationResponse = geolocationResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeviceManagerHmsResponse copy$default(DeviceManagerHmsResponse deviceManagerHmsResponse, Result result, Result result2, Result result3, Result result4, Result result5, Result result6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                result = deviceManagerHmsResponse.deviceIdResponse;
            }
            if ((i10 & 2) != 0) {
                result2 = deviceManagerHmsResponse.deviceUIdResponse;
            }
            Result result7 = result2;
            if ((i10 & 4) != 0) {
                result3 = deviceManagerHmsResponse.deviceTypeResponse;
            }
            Result result8 = result3;
            if ((i10 & 8) != 0) {
                result4 = deviceManagerHmsResponse.deviceInfoResponse;
            }
            Result result9 = result4;
            if ((i10 & 16) != 0) {
                result5 = deviceManagerHmsResponse.deviceCheckerResponse;
            }
            Result result10 = result5;
            if ((i10 & 32) != 0) {
                result6 = deviceManagerHmsResponse.geolocationResponse;
            }
            return deviceManagerHmsResponse.copy(result, result7, result8, result9, result10, result6);
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

        @NotNull
        public final Result<GeolocationResponse> component6() {
            return this.geolocationResponse;
        }

        @NotNull
        public final DeviceManagerHmsResponse copy(@NotNull Result<DeviceIdResponse> deviceIdResponse, @NotNull Result<DeviceUIdResponse> deviceUIdResponse, @NotNull Result<DeviceTypeResponse> deviceTypeResponse, @NotNull Result<DeviceInfoResponse> deviceInfoResponse, @NotNull Result<DeviceCheckerResponse> deviceCheckerResponse, @NotNull Result<GeolocationResponse> geolocationResponse) {
            Intrinsics.checkNotNullParameter(deviceIdResponse, "deviceIdResponse");
            Intrinsics.checkNotNullParameter(deviceUIdResponse, "deviceUIdResponse");
            Intrinsics.checkNotNullParameter(deviceTypeResponse, "deviceTypeResponse");
            Intrinsics.checkNotNullParameter(deviceInfoResponse, "deviceInfoResponse");
            Intrinsics.checkNotNullParameter(deviceCheckerResponse, "deviceCheckerResponse");
            Intrinsics.checkNotNullParameter(geolocationResponse, "geolocationResponse");
            return new DeviceManagerHmsResponse(deviceIdResponse, deviceUIdResponse, deviceTypeResponse, deviceInfoResponse, deviceCheckerResponse, geolocationResponse);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceManagerHmsResponse)) {
                return false;
            }
            DeviceManagerHmsResponse deviceManagerHmsResponse = (DeviceManagerHmsResponse) other;
            return Intrinsics.areEqual(this.deviceIdResponse, deviceManagerHmsResponse.deviceIdResponse) && Intrinsics.areEqual(this.deviceUIdResponse, deviceManagerHmsResponse.deviceUIdResponse) && Intrinsics.areEqual(this.deviceTypeResponse, deviceManagerHmsResponse.deviceTypeResponse) && Intrinsics.areEqual(this.deviceInfoResponse, deviceManagerHmsResponse.deviceInfoResponse) && Intrinsics.areEqual(this.deviceCheckerResponse, deviceManagerHmsResponse.deviceCheckerResponse) && Intrinsics.areEqual(this.geolocationResponse, deviceManagerHmsResponse.geolocationResponse);
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
            return this.geolocationResponse.hashCode() + a.b(this.deviceCheckerResponse, a.b(this.deviceInfoResponse, a.b(this.deviceTypeResponse, a.b(this.deviceUIdResponse, this.deviceIdResponse.hashCode() * 31, 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Result<DeviceIdResponse> result = this.deviceIdResponse;
            Result<DeviceUIdResponse> result2 = this.deviceUIdResponse;
            Result<DeviceTypeResponse> result3 = this.deviceTypeResponse;
            Result<DeviceInfoResponse> result4 = this.deviceInfoResponse;
            Result<DeviceCheckerResponse> result5 = this.deviceCheckerResponse;
            Result<GeolocationResponse> result6 = this.geolocationResponse;
            StringBuilder sb2 = new StringBuilder("DeviceManagerHmsResponse(deviceIdResponse=");
            sb2.append(result);
            sb2.append(", deviceUIdResponse=");
            sb2.append(result2);
            sb2.append(", deviceTypeResponse=");
            i.g(sb2, result3, ", deviceInfoResponse=", result4, ", deviceCheckerResponse=");
            sb2.append(result5);
            sb2.append(", geolocationResponse=");
            sb2.append(result6);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private DeviceManagerResponse() {
    }

    public /* synthetic */ DeviceManagerResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
