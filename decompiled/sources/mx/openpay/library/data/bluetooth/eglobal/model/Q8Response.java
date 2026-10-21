package mx.openpay.library.data.bluetooth.eglobal.model;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import com.sun.mail.imap.IMAPStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Q8Response.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/model/Q8Response;", "", "firmwareVersion", "", "batteryCheck", "codResponse", "", IMAPStore.ID_COMMAND, "model", "message", "serial", "status", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBatteryCheck", "()Ljava/lang/String;", "getCodResponse", "()I", "getCommand", "getFirmwareVersion", "getMessage", "getModel", "getSerial", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Q8Response {

    @SerializedName("batery_check")
    @NotNull
    private final String batteryCheck;

    @SerializedName("codResponse")
    private final int codResponse;

    @SerializedName(IMAPStore.ID_COMMAND)
    @NotNull
    private final String command;

    @SerializedName("app_ver")
    @NotNull
    private final String firmwareVersion;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private final String message;

    @SerializedName("modelo")
    @NotNull
    private final String model;

    @SerializedName("serial")
    @NotNull
    private final String serial;

    @SerializedName("status")
    @NotNull
    private final String status;

    public Q8Response(@NotNull String firmwareVersion, @NotNull String batteryCheck, int i10, @NotNull String command, @NotNull String model, @NotNull String message, @NotNull String serial, @NotNull String status) {
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(batteryCheck, "batteryCheck");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(status, "status");
        this.firmwareVersion = firmwareVersion;
        this.batteryCheck = batteryCheck;
        this.codResponse = i10;
        this.command = command;
        this.model = model;
        this.message = message;
        this.serial = serial;
        this.status = status;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
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
    public final Q8Response copy(@NotNull String firmwareVersion, @NotNull String batteryCheck, int codResponse, @NotNull String command, @NotNull String model, @NotNull String message, @NotNull String serial, @NotNull String status) {
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(batteryCheck, "batteryCheck");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(serial, "serial");
        Intrinsics.checkNotNullParameter(status, "status");
        return new Q8Response(firmwareVersion, batteryCheck, codResponse, command, model, message, serial, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Q8Response)) {
            return false;
        }
        Q8Response q8Response = (Q8Response) other;
        return Intrinsics.areEqual(this.firmwareVersion, q8Response.firmwareVersion) && Intrinsics.areEqual(this.batteryCheck, q8Response.batteryCheck) && this.codResponse == q8Response.codResponse && Intrinsics.areEqual(this.command, q8Response.command) && Intrinsics.areEqual(this.model, q8Response.model) && Intrinsics.areEqual(this.message, q8Response.message) && Intrinsics.areEqual(this.serial, q8Response.serial) && Intrinsics.areEqual(this.status, q8Response.status);
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
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + n1.c(this.serial, n1.c(this.message, n1.c(this.model, n1.c(this.command, (n1.c(this.batteryCheck, this.firmwareVersion.hashCode() * 31, 31) + this.codResponse) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.firmwareVersion;
        String str2 = this.batteryCheck;
        int i10 = this.codResponse;
        String str3 = this.command;
        String str4 = this.model;
        String str5 = this.message;
        String str6 = this.serial;
        String str7 = this.status;
        StringBuilder sbC = a.c("Q8Response(firmwareVersion=", str, ", batteryCheck=", str2, ", codResponse=");
        androidx.room.a.f(sbC, i10, ", command=", str3, ", model=");
        k.e(sbC, str4, ", message=", str5, ", serial=");
        return c.b(sbC, str6, ", status=", str7, ")");
    }
}
