package mx.openpay.library.core.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.extra.ChargeTransaction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0003\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/core/model/OpenPayChargeState;", "openPayCharge", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "", "()V", "Idle", "Processing", "Success", "Lmx/openpay/library/core/model/OpenPayChargeState$Idle;", "Lmx/openpay/library/core/model/OpenPayChargeState$Processing;", "Lmx/openpay/library/core/model/OpenPayChargeState$Success;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OpenPayChargeState<openPayCharge extends ChargeTransaction> {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmx/openpay/library/core/model/OpenPayChargeState$Idle;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Idle extends OpenPayChargeState {
        public static final int $stable = 0;

        @NotNull
        public static final Idle INSTANCE = new Idle();

        public Idle() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/core/model/OpenPayChargeState$Processing;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "", "Lmx/openpay/library/core/model/OpenPayProcessingStep;", "a", "Lmx/openpay/library/core/model/OpenPayProcessingStep;", "getProcessingStep", "()Lmx/openpay/library/core/model/OpenPayProcessingStep;", "processingStep", "<init>", "(Lmx/openpay/library/core/model/OpenPayProcessingStep;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Processing extends OpenPayChargeState {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final OpenPayProcessingStep processingStep;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(@NotNull OpenPayProcessingStep processingStep) {
            super(null);
            Intrinsics.checkNotNullParameter(processingStep, "processingStep");
            this.processingStep = processingStep;
        }

        @NotNull
        public final OpenPayProcessingStep getProcessingStep() {
            return this.processingStep;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayChargeState$Success;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "a", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "getOpenPayCharge", "()Lmx/openpay/library/core/model/extra/ChargeTransaction;", "openPayCharge", "<init>", "(Lmx/openpay/library/core/model/extra/ChargeTransaction;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Success extends OpenPayChargeState<ChargeTransaction> {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ChargeTransaction openPayCharge;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull ChargeTransaction openPayCharge) {
            super(null);
            Intrinsics.checkNotNullParameter(openPayCharge, "openPayCharge");
            this.openPayCharge = openPayCharge;
        }

        @NotNull
        public final ChargeTransaction getOpenPayCharge() {
            return this.openPayCharge;
        }
    }

    public OpenPayChargeState() {
    }

    public /* synthetic */ OpenPayChargeState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
