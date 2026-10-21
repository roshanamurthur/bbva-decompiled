package mx.openpay.library.data.datasource.local.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.sun.mail.imap.IMAPStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConnectedDeviceEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Entity(tableName = "connected_device")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/entity/ConnectedDeviceEntity;", "", "serial", "", "firmwareVersion", "batteryCheck", "codResponse", "", IMAPStore.ID_COMMAND, "model", "message", "status", "slotKey", "slotKeyName", "keyInjectedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBatteryCheck", "()Ljava/lang/String;", "getCodResponse", "()I", "getCommand", "getFirmwareVersion", "getKeyInjectedDate", "setKeyInjectedDate", "(Ljava/lang/String;)V", "getMessage", "getModel", "getSerial", "getSlotKey", "setSlotKey", "getSlotKeyName", "setSlotKeyName", "getStatus", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectedDeviceEntity {

    @NotNull
    private final String batteryCheck;
    private final int codResponse;

    @NotNull
    private final String command;

    @NotNull
    private final String firmwareVersion;

    @NotNull
    private String keyInjectedDate;

    @NotNull
    private final String message;

    @NotNull
    private final String model;

    @PrimaryKey
    @NotNull
    private final String serial;

    @NotNull
    private String slotKey;

    @NotNull
    private String slotKeyName;

    @NotNull
    private final String status;

    public ConnectedDeviceEntity(@NotNull String serial, @NotNull String firmwareVersion, @NotNull String batteryCheck, int i10, @NotNull String command, @NotNull String model, @NotNull String message, @NotNull String status, @NotNull String slotKey, @NotNull String slotKeyName, @NotNull String keyInjectedDate) {
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(batteryCheck, "batteryCheck");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        Intrinsics.checkNotNullParameter(slotKeyName, "slotKeyName");
        Intrinsics.checkNotNullParameter(keyInjectedDate, "keyInjectedDate");
        this.serial = serial;
        this.firmwareVersion = firmwareVersion;
        this.batteryCheck = batteryCheck;
        this.codResponse = i10;
        this.command = command;
        this.model = model;
        this.message = message;
        this.status = status;
        this.slotKey = slotKey;
        this.slotKeyName = slotKeyName;
        this.keyInjectedDate = keyInjectedDate;
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
    public final String getKeyInjectedDate() {
        return this.keyInjectedDate;
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

    public final void setKeyInjectedDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.keyInjectedDate = str;
    }

    public final void setSlotKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.slotKey = str;
    }

    public final void setSlotKeyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.slotKeyName = str;
    }
}
