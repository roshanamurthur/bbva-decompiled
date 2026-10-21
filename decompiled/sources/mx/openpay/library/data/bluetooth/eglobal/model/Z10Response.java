package mx.openpay.library.data.bluetooth.eglobal.model;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.impl.v;
import androidx.collection.k;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import com.sun.mail.imap.IMAPStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Z10Response.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/model/Z10Response;", "", "codResponse", "", "status", "", "message", IMAPStore.ID_COMMAND, "tokenEw", "tokenEs", "appVer", "serial", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVer", "()Ljava/lang/String;", "getCodResponse", "()I", "getCommand", "getMessage", "getSerial", "getStatus", "getTokenEs", "getTokenEw", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Z10Response {

    @SerializedName("app_ver")
    @NotNull
    private final String appVer;

    @SerializedName("codResponse")
    private final int codResponse;

    @SerializedName(IMAPStore.ID_COMMAND)
    @NotNull
    private final String command;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private final String message;

    @SerializedName("serial")
    @NotNull
    private final String serial;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("tokenes")
    @NotNull
    private final String tokenEs;

    @SerializedName("tokenew")
    @NotNull
    private final String tokenEw;

    public Z10Response(int i10, @NotNull String status, @NotNull String message, @NotNull String command, @NotNull String tokenEw, @NotNull String tokenEs, @NotNull String appVer, @NotNull String serial) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(tokenEw, "tokenEw");
        Intrinsics.checkNotNullParameter(tokenEs, "tokenEs");
        Intrinsics.checkNotNullParameter(appVer, "appVer");
        Intrinsics.checkNotNullParameter(serial, "serial");
        this.codResponse = i10;
        this.status = status;
        this.message = message;
        this.command = command;
        this.tokenEw = tokenEw;
        this.tokenEs = tokenEs;
        this.appVer = appVer;
        this.serial = serial;
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
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTokenEw() {
        return this.tokenEw;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTokenEs() {
        return this.tokenEs;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAppVer() {
        return this.appVer;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    public final Z10Response copy(int codResponse, @NotNull String status, @NotNull String message, @NotNull String command, @NotNull String tokenEw, @NotNull String tokenEs, @NotNull String appVer, @NotNull String serial) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(tokenEw, "tokenEw");
        Intrinsics.checkNotNullParameter(tokenEs, "tokenEs");
        Intrinsics.checkNotNullParameter(appVer, "appVer");
        Intrinsics.checkNotNullParameter(serial, "serial");
        return new Z10Response(codResponse, status, message, command, tokenEw, tokenEs, appVer, serial);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Z10Response)) {
            return false;
        }
        Z10Response z10Response = (Z10Response) other;
        return this.codResponse == z10Response.codResponse && Intrinsics.areEqual(this.status, z10Response.status) && Intrinsics.areEqual(this.message, z10Response.message) && Intrinsics.areEqual(this.command, z10Response.command) && Intrinsics.areEqual(this.tokenEw, z10Response.tokenEw) && Intrinsics.areEqual(this.tokenEs, z10Response.tokenEs) && Intrinsics.areEqual(this.appVer, z10Response.appVer) && Intrinsics.areEqual(this.serial, z10Response.serial);
    }

    @NotNull
    public final String getAppVer() {
        return this.appVer;
    }

    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTokenEs() {
        return this.tokenEs;
    }

    @NotNull
    public final String getTokenEw() {
        return this.tokenEw;
    }

    public int hashCode() {
        return this.serial.hashCode() + n1.c(this.appVer, n1.c(this.tokenEs, n1.c(this.tokenEw, n1.c(this.command, n1.c(this.message, n1.c(this.status, this.codResponse * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.codResponse;
        String str = this.status;
        String str2 = this.message;
        String str3 = this.command;
        String str4 = this.tokenEw;
        String str5 = this.tokenEs;
        String str6 = this.appVer;
        String str7 = this.serial;
        StringBuilder sbE = v.e("Z10Response(codResponse=", i10, ", status=", str, ", message=");
        k.e(sbE, str2, ", command=", str3, ", tokenEw=");
        k.e(sbE, str4, ", tokenEs=", str5, ", appVer=");
        return c.b(sbE, str6, ", serial=", str7, ")");
    }
}
