package mx.openpay.library.data.datasource.remote.model.request.eglobal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReverseRequestDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/request/eglobal/ReverseRequestDto;", "", "orderId", "", "capture", "", "reasonReverse", "", "(Ljava/lang/String;ZLjava/lang/Integer;)V", "getCapture", "()Z", "getOrderId", "()Ljava/lang/String;", "getReasonReverse", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/Integer;)Lmx/openpay/library/data/datasource/remote/model/request/eglobal/ReverseRequestDto;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ReverseRequestDto {

    @SerializedName("capture")
    private final boolean capture;

    @SerializedName("order_id")
    @NotNull
    private final String orderId;

    @SerializedName("reason_reverse")
    @Nullable
    private final Integer reasonReverse;

    public ReverseRequestDto(@NotNull String orderId, boolean z10, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderId = orderId;
        this.capture = z10;
        this.reasonReverse = num;
    }

    public static /* synthetic */ ReverseRequestDto copy$default(ReverseRequestDto reverseRequestDto, String str, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reverseRequestDto.orderId;
        }
        if ((i10 & 2) != 0) {
            z10 = reverseRequestDto.capture;
        }
        if ((i10 & 4) != 0) {
            num = reverseRequestDto.reasonReverse;
        }
        return reverseRequestDto.copy(str, z10, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCapture() {
        return this.capture;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getReasonReverse() {
        return this.reasonReverse;
    }

    @NotNull
    public final ReverseRequestDto copy(@NotNull String orderId, boolean capture, @Nullable Integer reasonReverse) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new ReverseRequestDto(orderId, capture, reasonReverse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReverseRequestDto)) {
            return false;
        }
        ReverseRequestDto reverseRequestDto = (ReverseRequestDto) other;
        return Intrinsics.areEqual(this.orderId, reverseRequestDto.orderId) && this.capture == reverseRequestDto.capture && Intrinsics.areEqual(this.reasonReverse, reverseRequestDto.reasonReverse);
    }

    public final boolean getCapture() {
        return this.capture;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Integer getReasonReverse() {
        return this.reasonReverse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        boolean z10 = this.capture;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = (iHashCode + r1) * 31;
        Integer num = this.reasonReverse;
        return i10 + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ReverseRequestDto(orderId=" + this.orderId + ", capture=" + this.capture + ", reasonReverse=" + this.reasonReverse + ")";
    }

    public /* synthetic */ ReverseRequestDto(String str, boolean z10, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, (i10 & 4) != 0 ? null : num);
    }
}
