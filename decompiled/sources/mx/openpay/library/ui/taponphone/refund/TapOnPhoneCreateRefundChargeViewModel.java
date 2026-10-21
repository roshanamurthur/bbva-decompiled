package mx.openpay.library.ui.taponphone.refund;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import h.e;
import h.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.core.model.taponphone.OpenPayTapOnPhoneRefundChargeState;
import mx.openpay.library.domain.model.ProcessingStep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0006R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", "context", "Lmx/openpay/library/core/model/OpenPayTransaction;", "transactionData", "Lkotlinx/coroutines/Job;", "executeRefundCharge", "cancelProcess", "Landroidx/lifecycle/LiveData;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState;", "getUiState", "()Landroidx/lifecycle/LiveData;", "uiState", "<init>", "()V", "Companion", "RefundChargeUiState", "library_release"}, k = 1, mv = {1, 8, 0})
public final class TapOnPhoneCreateRefundChargeViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84391a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData f84392b = new MutableLiveData(RefundChargeUiState.Idle.INSTANCE);
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState;", "", "BringCardCloser", "CompleteRefundChargeStatus", "Idle", "MoveCardAway", "Processing", "SeeDevice", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$BringCardCloser;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$CompleteRefundChargeStatus;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$Idle;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$MoveCardAway;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$Processing;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$SeeDevice;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class RefundChargeUiState {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$BringCardCloser;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class BringCardCloser extends RefundChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final BringCardCloser INSTANCE = new BringCardCloser();

            public BringCardCloser() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bR#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$CompleteRefundChargeStatus;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState;", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState;", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "a", "Lmx/openpay/library/core/model/OpenPayResult;", "getResult", "()Lmx/openpay/library/core/model/OpenPayResult;", "result", "<init>", "(Lmx/openpay/library/core/model/OpenPayResult;)V", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class CompleteRefundChargeStatus extends RefundChargeUiState {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final OpenPayResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompleteRefundChargeStatus(@NotNull OpenPayResult<? extends OpenPayTapOnPhoneRefundChargeState<TransactionDTO>> result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            public final OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>> getResult() {
                return this.result;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$Idle;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class Idle extends RefundChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final Idle INSTANCE = new Idle();

            public Idle() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$MoveCardAway;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class MoveCardAway extends RefundChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final MoveCardAway INSTANCE = new MoveCardAway();

            public MoveCardAway() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$Processing;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class Processing extends RefundChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final Processing INSTANCE = new Processing();

            public Processing() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState$SeeDevice;", "Lmx/openpay/library/ui/taponphone/refund/TapOnPhoneCreateRefundChargeViewModel$RefundChargeUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class SeeDevice extends RefundChargeUiState {
            public static final int $stable = 0;

            @NotNull
            public static final SeeDevice INSTANCE = new SeeDevice();

            public SeeDevice() {
                super(null);
            }
        }

        public RefundChargeUiState() {
        }

        public /* synthetic */ RefundChargeUiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProcessingStep.values().length];
            try {
                iArr[ProcessingStep.PROCESSED_STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProcessingStep.PAY_WITH_POINTS_STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProcessingStep.DIGITAL_SIGN_STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProcessingStep.PAY_WITH_PLANS_STEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r5 != 4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$refundCharge(final mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeViewModel r4, android.content.Context r5, mx.openpay.library.core.model.OpenPayTransaction r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeViewModel.access$refundCharge(mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeViewModel, android.content.Context, mx.openpay.library.core.model.OpenPayTransaction, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final Job cancelProcess() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e(null), 3, null);
    }

    @NotNull
    public final Job executeRefundCharge(@NotNull Context context, @Nullable OpenPayTransaction transactionData) {
        Intrinsics.checkNotNullParameter(context, "context");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f(this, context, transactionData, null), 3, null);
    }

    @NotNull
    public final LiveData<RefundChargeUiState> getUiState() {
        return this.f84392b;
    }
}
