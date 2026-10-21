package mx.openpay.library.core.model.taponphone;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.extra.TransactionDTO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0003\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState;", "openPayTransaction", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "", "()V", "Idle", "Processing", "Success", "Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState$Idle;", "Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState$Processing;", "Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState$Success;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OpenPayTapOnPhoneRefundChargeState<openPayTransaction extends TransactionDTO> {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState$Idle;", "Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState;", "", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Idle extends OpenPayTapOnPhoneRefundChargeState {
        public static final int $stable = 0;

        @NotNull
        public static final Idle INSTANCE = new Idle();

        public Idle() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState$Processing;", "Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState;", "", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Processing extends OpenPayTapOnPhoneRefundChargeState {
        public static final int $stable = 0;

        @NotNull
        public static final Processing INSTANCE = new Processing();

        public Processing() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState$Success;", "Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState;", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "a", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "getTransactionDTO", "()Lmx/openpay/library/core/model/extra/TransactionDTO;", "transactionDTO", "<init>", "(Lmx/openpay/library/core/model/extra/TransactionDTO;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Success extends OpenPayTapOnPhoneRefundChargeState<TransactionDTO> {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TransactionDTO transactionDTO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull TransactionDTO transactionDTO) {
            super(null);
            Intrinsics.checkNotNullParameter(transactionDTO, "transactionDTO");
            this.transactionDTO = transactionDTO;
        }

        @NotNull
        public final TransactionDTO getTransactionDTO() {
            return this.transactionDTO;
        }
    }

    public OpenPayTapOnPhoneRefundChargeState() {
    }

    public /* synthetic */ OpenPayTapOnPhoneRefundChargeState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
