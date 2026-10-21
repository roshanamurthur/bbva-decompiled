package mx.openpay.library.domain.bluetooth.model.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.sun.mail.imap.IMAPStore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectedDeviceQ8.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b9\u0010:J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003Jm\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u0010!\"\u0004\b4\u00105R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001f\u001a\u0004\b7\u0010!\"\u0004\b8\u00105¨\u0006;"}, d2 = {"Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "firmwareVersion", "batteryCheck", "codResponse", IMAPStore.ID_COMMAND, "model", "message", "serial", "status", "slotKey", "slotKeyName", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getFirmwareVersion", "()Ljava/lang/String;", "b", "getBatteryCheck", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCodResponse", "()I", "d", "getCommand", "e", "getModel", "f", "getMessage", "g", "getSerial", "h", "getStatus", "i", "getSlotKey", "setSlotKey", "(Ljava/lang/String;)V", "j", "getSlotKeyName", "setSlotKeyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ConnectedDeviceQ8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String firmwareVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String batteryCheck;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int codResponse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String command;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String model;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serial;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String status;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String slotKey;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String slotKeyName;

    public ConnectedDeviceQ8(@NotNull String firmwareVersion, @NotNull String batteryCheck, int i10, @NotNull String command, @NotNull String model, @NotNull String message, @NotNull String serial, @NotNull String status, @NotNull String slotKey, @NotNull String slotKeyName) {
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(batteryCheck, "batteryCheck");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        Intrinsics.checkNotNullParameter(slotKeyName, "slotKeyName");
        this.firmwareVersion = firmwareVersion;
        this.batteryCheck = batteryCheck;
        this.codResponse = i10;
        this.command = command;
        this.model = model;
        this.message = message;
        this.serial = serial;
        this.status = status;
        this.slotKey = slotKey;
        this.slotKeyName = slotKeyName;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSlotKeyName() {
        return this.slotKeyName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBatteryCheck() {
        return this.batteryCheck;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSlotKey() {
        return this.slotKey;
    }

    @NotNull
    public final ConnectedDeviceQ8 copy(@NotNull String firmwareVersion, @NotNull String batteryCheck, int codResponse, @NotNull String command, @NotNull String model, @NotNull String message, @NotNull String serial, @NotNull String status, @NotNull String slotKey, @NotNull String slotKeyName) {
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(batteryCheck, "batteryCheck");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        Intrinsics.checkNotNullParameter(slotKeyName, "slotKeyName");
        return new ConnectedDeviceQ8(firmwareVersion, batteryCheck, codResponse, command, model, message, serial, status, slotKey, slotKeyName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedDeviceQ8)) {
            return false;
        }
        ConnectedDeviceQ8 connectedDeviceQ8 = (ConnectedDeviceQ8) other;
        return Intrinsics.areEqual(this.firmwareVersion, connectedDeviceQ8.firmwareVersion) && Intrinsics.areEqual(this.batteryCheck, connectedDeviceQ8.batteryCheck) && this.codResponse == connectedDeviceQ8.codResponse && Intrinsics.areEqual(this.command, connectedDeviceQ8.command) && Intrinsics.areEqual(this.model, connectedDeviceQ8.model) && Intrinsics.areEqual(this.message, connectedDeviceQ8.message) && Intrinsics.areEqual(this.serial, connectedDeviceQ8.serial) && Intrinsics.areEqual(this.status, connectedDeviceQ8.status) && Intrinsics.areEqual(this.slotKey, connectedDeviceQ8.slotKey) && Intrinsics.areEqual(this.slotKeyName, connectedDeviceQ8.slotKeyName);
    }

    @NotNull
    public final String getBatteryCheck() {
        return this.batteryCheck;
    }

    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    public final String getSlotKey() {
        return this.slotKey;
    }

    @NotNull
    public final String getSlotKeyName() {
        return this.slotKeyName;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.slotKeyName.hashCode() + n1.c(this.slotKey, n1.c(this.status, n1.c(this.serial, n1.c(this.message, n1.c(this.model, n1.c(this.command, (n1.c(this.batteryCheck, this.firmwareVersion.hashCode() * 31, 31) + this.codResponse) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final void setSlotKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.slotKey = str;
    }

    public final void setSlotKeyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.slotKeyName = str;
    }

    @NotNull
    public String toString() {
        String str = this.slotKey;
        String str2 = this.slotKeyName;
        StringBuilder sb2 = new StringBuilder("ConnectedDeviceQ8(firmwareVersion=");
        sb2.append(this.firmwareVersion);
        sb2.append(", batteryCheck=");
        sb2.append(this.batteryCheck);
        sb2.append(", codResponse=");
        sb2.append(this.codResponse);
        sb2.append(", command=");
        sb2.append(this.command);
        sb2.append(", model=");
        sb2.append(this.model);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", serial=");
        sb2.append(this.serial);
        sb2.append(", status=");
        k.e(sb2, this.status, ", slotKey=", str, ", slotKeyName=");
        return d.f(sb2, str2, ")");
    }

    public /* synthetic */ ConnectedDeviceQ8(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, str3, str4, str5, str6, str7, (i11 & 256) != 0 ? "" : str8, (i11 & 512) != 0 ? "" : str9);
    }
}
