package mx.openpay.library.data.bluetooth.eglobal.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
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

/* JADX INFO: compiled from: C54Response.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/model/C54Response;", "", "codResponse", "", "status", "", "message", IMAPStore.ID_COMMAND, "e2", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCodResponse", "()I", "getCommand", "()Ljava/lang/String;", "getE2", "getMessage", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class C54Response {

    @SerializedName("codResponse")
    private final int codResponse;

    @SerializedName(IMAPStore.ID_COMMAND)
    @NotNull
    private final String command;

    @SerializedName("E2")
    @Nullable
    private final String e2;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    @NotNull
    private final String message;

    @SerializedName("status")
    @NotNull
    private final String status;

    public C54Response(int i10, @NotNull String status, @NotNull String message, @NotNull String command, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        this.codResponse = i10;
        this.status = status;
        this.message = message;
        this.command = command;
        this.e2 = str;
    }

    public static /* synthetic */ C54Response copy$default(C54Response c54Response, int i10, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c54Response.codResponse;
        }
        if ((i11 & 2) != 0) {
            str = c54Response.status;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = c54Response.message;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = c54Response.command;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = c54Response.e2;
        }
        return c54Response.copy(i10, str5, str6, str7, str4);
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

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getE2() {
        return this.e2;
    }

    @NotNull
    public final C54Response copy(int codResponse, @NotNull String status, @NotNull String message, @NotNull String command, @Nullable String e5) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(command, "command");
        return new C54Response(codResponse, status, message, command, e5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C54Response)) {
            return false;
        }
        C54Response c54Response = (C54Response) other;
        return this.codResponse == c54Response.codResponse && Intrinsics.areEqual(this.status, c54Response.status) && Intrinsics.areEqual(this.message, c54Response.message) && Intrinsics.areEqual(this.command, c54Response.command) && Intrinsics.areEqual(this.e2, c54Response.e2);
    }

    public final int getCodResponse() {
        return this.codResponse;
    }

    @NotNull
    public final String getCommand() {
        return this.command;
    }

    @Nullable
    public final String getE2() {
        return this.e2;
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
        int iC = n1.c(this.command, n1.c(this.message, n1.c(this.status, this.codResponse * 31, 31), 31), 31);
        String str = this.e2;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i10 = this.codResponse;
        String str = this.status;
        String str2 = this.message;
        String str3 = this.command;
        String str4 = this.e2;
        StringBuilder sbE = v.e("C54Response(codResponse=", i10, ", status=", str, ", message=");
        k.e(sbE, str2, ", command=", str3, ", e2=");
        return d.f(sbE, str4, ")");
    }
}
