package com.bbva.plugin.digipassmanager.commands.params;

import androidx.camera.camera2.internal.n1;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivateTokenParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/params/ActivateTokenParams;", "", "deviceId", "", DigipassManagerConstants.KEY_SERIAL_NUMBER, "headers", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getDeviceId", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getSerialNumber", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ActivateTokenParams {

    @NotNull
    private final String deviceId;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final String serialNumber;

    public ActivateTokenParams(@NotNull String deviceId, @NotNull String serialNumber, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.deviceId = deviceId;
        this.serialNumber = serialNumber;
        this.headers = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivateTokenParams copy$default(ActivateTokenParams activateTokenParams, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activateTokenParams.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = activateTokenParams.serialNumber;
        }
        if ((i10 & 4) != 0) {
            map = activateTokenParams.headers;
        }
        return activateTokenParams.copy(str, str2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.headers;
    }

    @NotNull
    public final ActivateTokenParams copy(@NotNull String deviceId, @NotNull String serialNumber, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new ActivateTokenParams(deviceId, serialNumber, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivateTokenParams)) {
            return false;
        }
        ActivateTokenParams activateTokenParams = (ActivateTokenParams) other;
        return Intrinsics.areEqual(this.deviceId, activateTokenParams.deviceId) && Intrinsics.areEqual(this.serialNumber, activateTokenParams.serialNumber) && Intrinsics.areEqual(this.headers, activateTokenParams.headers);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        return this.headers.hashCode() + n1.c(this.serialNumber, this.deviceId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActivateTokenParams(deviceId=");
        sb2.append(this.deviceId);
        sb2.append(", serialNumber=");
        sb2.append(this.serialNumber);
        sb2.append(", headers=");
        return e.g(sb2, this.headers, RootService.CLOSE_BRACKET);
    }
}
