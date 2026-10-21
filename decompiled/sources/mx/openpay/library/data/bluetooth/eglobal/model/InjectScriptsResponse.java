package mx.openpay.library.data.bluetooth.eglobal.model;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.impl.v;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import com.sun.mail.imap.IMAPStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InjectScriptsResponse.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/model/InjectScriptsResponse;", "", "codResponse", "", "status", "", "message", IMAPStore.ID_COMMAND, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCodResponse", "()I", "getCommand", "()Ljava/lang/String;", "getMessage", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InjectScriptsResponse {

    @SerializedName("codResponse")
    private final int codResponse;

    @SerializedName(IMAPStore.ID_COMMAND)
    @NotNull
    private final String command;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private final String message;

    @SerializedName("status")
    @NotNull
    private final String status;

    public InjectScriptsResponse(int i10, @NotNull String status, @NotNull String message, @NotNull String command) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        this.codResponse = i10;
        this.status = status;
        this.message = message;
        this.command = command;
    }

    public static /* synthetic */ InjectScriptsResponse copy$default(InjectScriptsResponse injectScriptsResponse, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = injectScriptsResponse.codResponse;
        }
        if ((i11 & 2) != 0) {
            str = injectScriptsResponse.status;
        }
        if ((i11 & 4) != 0) {
            str2 = injectScriptsResponse.message;
        }
        if ((i11 & 8) != 0) {
            str3 = injectScriptsResponse.command;
        }
        return injectScriptsResponse.copy(i10, str, str2, str3);
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
    public final InjectScriptsResponse copy(int codResponse, @NotNull String status, @NotNull String message, @NotNull String command) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        return new InjectScriptsResponse(codResponse, status, message, command);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InjectScriptsResponse)) {
            return false;
        }
        InjectScriptsResponse injectScriptsResponse = (InjectScriptsResponse) other;
        return this.codResponse == injectScriptsResponse.codResponse && Intrinsics.areEqual(this.status, injectScriptsResponse.status) && Intrinsics.areEqual(this.message, injectScriptsResponse.message) && Intrinsics.areEqual(this.command, injectScriptsResponse.command);
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
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.command.hashCode() + n1.c(this.message, n1.c(this.status, this.codResponse * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.codResponse;
        String str = this.status;
        return c.b(v.e("InjectScriptsResponse(codResponse=", i10, ", status=", str, ", message="), this.message, ", command=", this.command, ")");
    }
}
