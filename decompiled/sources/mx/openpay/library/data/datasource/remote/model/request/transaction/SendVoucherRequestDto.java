package mx.openpay.library.data.datasource.remote.model.request.transaction;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SendVoucherRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/transaction/SendVoucherRequestDto;", "", "transactionId", "", "email", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getTransactionId", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SendVoucherRequestDto {

    @SerializedName("send_to")
    @NotNull
    private final String email;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    @NotNull
    private final String transactionId;

    public SendVoucherRequestDto(@NotNull String transactionId, @NotNull String email) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(email, "email");
        this.transactionId = transactionId;
        this.email = email;
    }

    public static /* synthetic */ SendVoucherRequestDto copy$default(SendVoucherRequestDto sendVoucherRequestDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sendVoucherRequestDto.transactionId;
        }
        if ((i10 & 2) != 0) {
            str2 = sendVoucherRequestDto.email;
        }
        return sendVoucherRequestDto.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final SendVoucherRequestDto copy(@NotNull String transactionId, @NotNull String email) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(email, "email");
        return new SendVoucherRequestDto(transactionId, email);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendVoucherRequestDto)) {
            return false;
        }
        SendVoucherRequestDto sendVoucherRequestDto = (SendVoucherRequestDto) other;
        return Intrinsics.areEqual(this.transactionId, sendVoucherRequestDto.transactionId) && Intrinsics.areEqual(this.email, sendVoucherRequestDto.email);
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return this.email.hashCode() + (this.transactionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("SendVoucherRequestDto(transactionId=", this.transactionId, ", email=", this.email, ")");
    }
}
