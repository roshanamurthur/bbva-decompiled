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

/* JADX INFO: compiled from: Z13Response.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/model/Z13Response;", "", "codResponse", "", "status", "", "message", IMAPStore.ID_COMMAND, "hashRSA", "workingKCV", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCodResponse", "()I", "getCommand", "()Ljava/lang/String;", "getHashRSA", "getMessage", "getStatus", "getWorkingKCV", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Z13Response {

    @SerializedName("codResponse")
    private final int codResponse;

    @SerializedName(IMAPStore.ID_COMMAND)
    @NotNull
    private final String command;

    @SerializedName("hash_rsa")
    @NotNull
    private final String hashRSA;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private final String message;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("working_kcv")
    @NotNull
    private final String workingKCV;

    public Z13Response(int i10, @NotNull String status, @NotNull String message, @NotNull String command, @NotNull String hashRSA, @NotNull String workingKCV) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(hashRSA, "hashRSA");
        Intrinsics.checkNotNullParameter(workingKCV, "workingKCV");
        this.codResponse = i10;
        this.status = status;
        this.message = message;
        this.command = command;
        this.hashRSA = hashRSA;
        this.workingKCV = workingKCV;
    }

    public static /* synthetic */ Z13Response copy$default(Z13Response z13Response, int i10, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = z13Response.codResponse;
        }
        if ((i11 & 2) != 0) {
            str = z13Response.status;
        }
        String str6 = str;
        if ((i11 & 4) != 0) {
            str2 = z13Response.message;
        }
        String str7 = str2;
        if ((i11 & 8) != 0) {
            str3 = z13Response.command;
        }
        String str8 = str3;
        if ((i11 & 16) != 0) {
            str4 = z13Response.hashRSA;
        }
        String str9 = str4;
        if ((i11 & 32) != 0) {
            str5 = z13Response.workingKCV;
        }
        return z13Response.copy(i10, str6, str7, str8, str9, str5);
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
    public final String getHashRSA() {
        return this.hashRSA;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWorkingKCV() {
        return this.workingKCV;
    }

    @NotNull
    public final Z13Response copy(int codResponse, @NotNull String status, @NotNull String message, @NotNull String command, @NotNull String hashRSA, @NotNull String workingKCV) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(hashRSA, "hashRSA");
        Intrinsics.checkNotNullParameter(workingKCV, "workingKCV");
        return new Z13Response(codResponse, status, message, command, hashRSA, workingKCV);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Z13Response)) {
            return false;
        }
        Z13Response z13Response = (Z13Response) other;
        return this.codResponse == z13Response.codResponse && Intrinsics.areEqual(this.status, z13Response.status) && Intrinsics.areEqual(this.message, z13Response.message) && Intrinsics.areEqual(this.command, z13Response.command) && Intrinsics.areEqual(this.hashRSA, z13Response.hashRSA) && Intrinsics.areEqual(this.workingKCV, z13Response.workingKCV);
    }

    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    public final String getHashRSA() {
        return this.hashRSA;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getWorkingKCV() {
        return this.workingKCV;
    }

    public int hashCode() {
        return this.workingKCV.hashCode() + n1.c(this.hashRSA, n1.c(this.command, n1.c(this.message, n1.c(this.status, this.codResponse * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.codResponse;
        String str = this.status;
        String str2 = this.message;
        String str3 = this.command;
        String str4 = this.hashRSA;
        String str5 = this.workingKCV;
        StringBuilder sbE = v.e("Z13Response(codResponse=", i10, ", status=", str, ", message=");
        k.e(sbE, str2, ", command=", str3, ", hashRSA=");
        return c.b(sbE, str4, ", workingKCV=", str5, ")");
    }
}
