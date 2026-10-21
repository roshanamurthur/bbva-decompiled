package mx.openpay.library.data.bluetooth.eglobal.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceStatusChange.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/model/DeviceStatusChange;", "", "codResponse", "", "status", "", "message", "(ILjava/lang/String;Ljava/lang/String;)V", "getCodResponse", "()I", "getMessage", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeviceStatusChange {

    @SerializedName("codResponse")
    private final int codResponse;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private final String message;

    @SerializedName("status")
    @NotNull
    private final String status;

    public DeviceStatusChange(int i10, @NotNull String status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        this.codResponse = i10;
        this.status = status;
        this.message = message;
    }

    public static /* synthetic */ DeviceStatusChange copy$default(DeviceStatusChange deviceStatusChange, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = deviceStatusChange.codResponse;
        }
        if ((i11 & 2) != 0) {
            str = deviceStatusChange.status;
        }
        if ((i11 & 4) != 0) {
            str2 = deviceStatusChange.message;
        }
        return deviceStatusChange.copy(i10, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final DeviceStatusChange copy(int codResponse, @NotNull String status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        return new DeviceStatusChange(codResponse, status, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStatusChange)) {
            return false;
        }
        DeviceStatusChange deviceStatusChange = (DeviceStatusChange) other;
        return this.codResponse == deviceStatusChange.codResponse && Intrinsics.areEqual(this.status, deviceStatusChange.status) && Intrinsics.areEqual(this.message, deviceStatusChange.message);
    }

    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.message.hashCode() + n1.c(this.status, this.codResponse * 31, 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.codResponse;
        String str = this.status;
        return d.f(v.e("DeviceStatusChange(codResponse=", i10, ", status=", str, ", message="), this.message, ")");
    }
}
