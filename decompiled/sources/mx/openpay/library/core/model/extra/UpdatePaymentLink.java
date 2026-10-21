package mx.openpay.library.core.model.extra;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lmx/openpay/library/core/model/extra/UpdatePaymentLink;", "", "status", "", "expirationDate", "sendEmail", "", "id", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getExpirationDate", "()Ljava/lang/String;", "getId", "getSendEmail", "()Z", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UpdatePaymentLink {
    public static final int $stable = 0;

    @NotNull
    private final String expirationDate;

    @NotNull
    private final String id;
    private final boolean sendEmail;

    @NotNull
    private final String status;

    public UpdatePaymentLink(@NotNull String status, @NotNull String expirationDate, boolean z10, @NotNull String id) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(id, "id");
        this.status = status;
        this.expirationDate = expirationDate;
        this.sendEmail = z10;
        this.id = id;
    }

    public static /* synthetic */ UpdatePaymentLink copy$default(UpdatePaymentLink updatePaymentLink, String str, String str2, boolean z10, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updatePaymentLink.status;
        }
        if ((i10 & 2) != 0) {
            str2 = updatePaymentLink.expirationDate;
        }
        if ((i10 & 4) != 0) {
            z10 = updatePaymentLink.sendEmail;
        }
        if ((i10 & 8) != 0) {
            str3 = updatePaymentLink.id;
        }
        return updatePaymentLink.copy(str, str2, z10, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final UpdatePaymentLink copy(@NotNull String status, @NotNull String expirationDate, boolean sendEmail, @NotNull String id) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(id, "id");
        return new UpdatePaymentLink(status, expirationDate, sendEmail, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePaymentLink)) {
            return false;
        }
        UpdatePaymentLink updatePaymentLink = (UpdatePaymentLink) other;
        return Intrinsics.areEqual(this.status, updatePaymentLink.status) && Intrinsics.areEqual(this.expirationDate, updatePaymentLink.expirationDate) && this.sendEmail == updatePaymentLink.sendEmail && Intrinsics.areEqual(this.id, updatePaymentLink.id);
    }

    @NotNull
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iA = a.a(this.expirationDate, this.status.hashCode() * 31, 31);
        boolean z10 = this.sendEmail;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        return this.id.hashCode() + ((iA + r3) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.expirationDate;
        boolean z10 = this.sendEmail;
        String str3 = this.id;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("UpdatePaymentLink(status=", str, ", expirationDate=", str2, ", sendEmail=");
        sbC.append(z10);
        sbC.append(", id=");
        sbC.append(str3);
        sbC.append(")");
        return sbC.toString();
    }
}
