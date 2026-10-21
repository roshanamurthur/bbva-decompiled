package mx.openpay.library.data.datasource.remote.model.request.paymentlink;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdatePaymentLinkRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/UpdatePaymentLinkRequestDto;", "", "expirationDate", "", "sendEmail", "", "(Ljava/lang/String;Z)V", "getExpirationDate", "()Ljava/lang/String;", "getSendEmail", "()Z", "component1", "component2", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UpdatePaymentLinkRequestDto {

    @SerializedName("expiration_date")
    @NotNull
    private final String expirationDate;

    @SerializedName("send_email")
    private final boolean sendEmail;

    public UpdatePaymentLinkRequestDto(@NotNull String expirationDate, boolean z10) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.expirationDate = expirationDate;
        this.sendEmail = z10;
    }

    public static /* synthetic */ UpdatePaymentLinkRequestDto copy$default(UpdatePaymentLinkRequestDto updatePaymentLinkRequestDto, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updatePaymentLinkRequestDto.expirationDate;
        }
        if ((i10 & 2) != 0) {
            z10 = updatePaymentLinkRequestDto.sendEmail;
        }
        return updatePaymentLinkRequestDto.copy(str, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    @NotNull
    public final UpdatePaymentLinkRequestDto copy(@NotNull String expirationDate, boolean sendEmail) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return new UpdatePaymentLinkRequestDto(expirationDate, sendEmail);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePaymentLinkRequestDto)) {
            return false;
        }
        UpdatePaymentLinkRequestDto updatePaymentLinkRequestDto = (UpdatePaymentLinkRequestDto) other;
        return Intrinsics.areEqual(this.expirationDate, updatePaymentLinkRequestDto.expirationDate) && this.sendEmail == updatePaymentLinkRequestDto.sendEmail;
    }

    @NotNull
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final boolean getSendEmail() {
        return this.sendEmail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.expirationDate.hashCode() * 31;
        boolean z10 = this.sendEmail;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "UpdatePaymentLinkRequestDto(expirationDate=" + this.expirationDate + ", sendEmail=" + this.sendEmail + ")";
    }
}
