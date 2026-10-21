package mx.openpay.library.core.model.extra;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u00060"}, d2 = {"Lmx/openpay/library/core/model/extra/RefundResponseDTO;", "Landroid/os/Parcelable;", "id", "", "operationDate", "authorization", PushConstants.AMOUNT, "", "status", "conciliated", "", "currency", "fee", "Lmx/openpay/library/core/model/extra/FeeResponseDTO;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;ZLjava/lang/String;Lmx/openpay/library/core/model/extra/FeeResponseDTO;)V", "getAmount", "()D", "getAuthorization", "()Ljava/lang/String;", "getConciliated", "()Z", "getCurrency", "getFee", "()Lmx/openpay/library/core/model/extra/FeeResponseDTO;", "getId", "getOperationDate", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RefundResponseDTO implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<RefundResponseDTO> CREATOR = new Creator();
    private final double amount;

    @NotNull
    private final String authorization;
    private final boolean conciliated;

    @NotNull
    private final String currency;

    @Nullable
    private final FeeResponseDTO fee;

    @NotNull
    private final String id;

    @NotNull
    private final String operationDate;

    @NotNull
    private final String status;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RefundResponseDTO> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RefundResponseDTO createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RefundResponseDTO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : FeeResponseDTO.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RefundResponseDTO[] newArray(int i10) {
            return new RefundResponseDTO[i10];
        }
    }

    public RefundResponseDTO(@NotNull String id, @NotNull String operationDate, @NotNull String authorization, double d2, @NotNull String status, boolean z10, @NotNull String currency, @Nullable FeeResponseDTO feeResponseDTO) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.id = id;
        this.operationDate = operationDate;
        this.authorization = authorization;
        this.amount = d2;
        this.status = status;
        this.conciliated = z10;
        this.currency = currency;
        this.fee = feeResponseDTO;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperationDate() {
        return this.operationDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final FeeResponseDTO getFee() {
        return this.fee;
    }

    @NotNull
    public final RefundResponseDTO copy(@NotNull String id, @NotNull String operationDate, @NotNull String authorization, double amount, @NotNull String status, boolean conciliated, @NotNull String currency, @Nullable FeeResponseDTO fee) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operationDate, "operationDate");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new RefundResponseDTO(id, operationDate, authorization, amount, status, conciliated, currency, fee);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefundResponseDTO)) {
            return false;
        }
        RefundResponseDTO refundResponseDTO = (RefundResponseDTO) other;
        return Intrinsics.areEqual(this.id, refundResponseDTO.id) && Intrinsics.areEqual(this.operationDate, refundResponseDTO.operationDate) && Intrinsics.areEqual(this.authorization, refundResponseDTO.authorization) && Double.compare(this.amount, refundResponseDTO.amount) == 0 && Intrinsics.areEqual(this.status, refundResponseDTO.status) && this.conciliated == refundResponseDTO.conciliated && Intrinsics.areEqual(this.currency, refundResponseDTO.currency) && Intrinsics.areEqual(this.fee, refundResponseDTO.fee);
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAuthorization() {
        return this.authorization;
    }

    public final boolean getConciliated() {
        return this.conciliated;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final FeeResponseDTO getFee() {
        return this.fee;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getOperationDate() {
        return this.operationDate;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        int iA = a.a(this.authorization, a.a(this.operationDate, this.id.hashCode() * 31, 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int iA2 = a.a(this.status, (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + iA) * 31, 31);
        boolean z10 = this.conciliated;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iA3 = a.a(this.currency, (iA2 + r3) * 31, 31);
        FeeResponseDTO feeResponseDTO = this.fee;
        return iA3 + (feeResponseDTO == null ? 0 : feeResponseDTO.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.operationDate;
        String str3 = this.authorization;
        double d2 = this.amount;
        String str4 = this.status;
        boolean z10 = this.conciliated;
        String str5 = this.currency;
        FeeResponseDTO feeResponseDTO = this.fee;
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("RefundResponseDTO(id=", str, ", operationDate=", str2, ", authorization=");
        sbC.append(str3);
        sbC.append(", amount=");
        sbC.append(d2);
        sbC.append(", status=");
        sbC.append(str4);
        sbC.append(", conciliated=");
        sbC.append(z10);
        sbC.append(", currency=");
        sbC.append(str5);
        sbC.append(", fee=");
        sbC.append(feeResponseDTO);
        sbC.append(")");
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.operationDate);
        parcel.writeString(this.authorization);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.status);
        parcel.writeInt(this.conciliated ? 1 : 0);
        parcel.writeString(this.currency);
        FeeResponseDTO feeResponseDTO = this.fee;
        if (feeResponseDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feeResponseDTO.writeToParcel(parcel, flags);
        }
    }
}
