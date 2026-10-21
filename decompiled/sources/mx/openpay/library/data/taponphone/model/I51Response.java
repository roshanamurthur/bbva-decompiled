package mx.openpay.library.data.taponphone.model;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.impl.v;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.gson.annotations.SerializedName;
import com.sun.mail.imap.IMAPStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: I51Response.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lmx/openpay/library/data/taponphone/model/I51Response;", "", "", "component1", "", "component2", "component3", "component4", "codResponse", "status", "message", IMAPStore.ID_COMMAND, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCodResponse", "()I", "b", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "c", "getMessage", "d", "getCommand", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "data_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class I51Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("codResponse")
    private final int codResponse;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(IMAPStore.ID_COMMAND)
    @NotNull
    private final String command;

    public I51Response(int i10, @NotNull String status, @NotNull String message, @NotNull String command) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        this.codResponse = i10;
        this.status = status;
        this.message = message;
        this.command = command;
    }

    public static /* synthetic */ I51Response copy$default(I51Response i51Response, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = i51Response.codResponse;
        }
        if ((i11 & 2) != 0) {
            str = i51Response.status;
        }
        if ((i11 & 4) != 0) {
            str2 = i51Response.message;
        }
        if ((i11 & 8) != 0) {
            str3 = i51Response.command;
        }
        return i51Response.copy(i10, str, str2, str3);
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
    public final I51Response copy(int codResponse, @NotNull String status, @NotNull String message, @NotNull String command) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        return new I51Response(codResponse, status, message, command);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof I51Response)) {
            return false;
        }
        I51Response i51Response = (I51Response) other;
        return this.codResponse == i51Response.codResponse && Intrinsics.areEqual(this.status, i51Response.status) && Intrinsics.areEqual(this.message, i51Response.message) && Intrinsics.areEqual(this.command, i51Response.command);
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
        return c.b(v.e("I51Response(codResponse=", i10, ", status=", str, ", message="), this.message, ", command=", this.command, ")");
    }
}
