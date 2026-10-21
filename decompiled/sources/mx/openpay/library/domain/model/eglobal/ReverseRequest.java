package mx.openpay.library.domain.model.eglobal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReverseRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/ReverseRequest;", "", "", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "orderId", "capture", "reasonReverse", "copy", "(Ljava/lang/String;ZLjava/lang/Integer;)Lmx/openpay/library/domain/model/eglobal/ReverseRequest;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "b", "Z", "getCapture", "()Z", "c", "Ljava/lang/Integer;", "getReasonReverse", "setReasonReverse", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ReverseRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean capture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer reasonReverse;

    public ReverseRequest(@NotNull String orderId, boolean z10, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderId = orderId;
        this.capture = z10;
        this.reasonReverse = num;
    }

    public static /* synthetic */ ReverseRequest copy$default(ReverseRequest reverseRequest, String str, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reverseRequest.orderId;
        }
        if ((i10 & 2) != 0) {
            z10 = reverseRequest.capture;
        }
        if ((i10 & 4) != 0) {
            num = reverseRequest.reasonReverse;
        }
        return reverseRequest.copy(str, z10, num);
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
    public final ReverseRequest copy(@NotNull String orderId, boolean capture, @Nullable Integer reasonReverse) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new ReverseRequest(orderId, capture, reasonReverse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReverseRequest)) {
            return false;
        }
        ReverseRequest reverseRequest = (ReverseRequest) other;
        return Intrinsics.areEqual(this.orderId, reverseRequest.orderId) && this.capture == reverseRequest.capture && Intrinsics.areEqual(this.reasonReverse, reverseRequest.reasonReverse);
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

    public final void setReasonReverse(@Nullable Integer num) {
        this.reasonReverse = num;
    }

    @NotNull
    public String toString() {
        return "ReverseRequest(orderId=" + this.orderId + ", capture=" + this.capture + ", reasonReverse=" + this.reasonReverse + ")";
    }

    public /* synthetic */ ReverseRequest(String str, boolean z10, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, (i10 & 4) != 0 ? null : num);
    }
}
