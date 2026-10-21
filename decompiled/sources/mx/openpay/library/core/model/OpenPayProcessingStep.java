package mx.openpay.library.core.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lmx/openpay/library/core/model/OpenPayProcessingStep;", "", "()V", "PayWithPlans", "PayWithPoints", "RequireDigitalSign", "Lmx/openpay/library/core/model/OpenPayProcessingStep$PayWithPlans;", "Lmx/openpay/library/core/model/OpenPayProcessingStep$PayWithPoints;", "Lmx/openpay/library/core/model/OpenPayProcessingStep$RequireDigitalSign;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OpenPayProcessingStep {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayProcessingStep$PayWithPlans;", "Lmx/openpay/library/core/model/OpenPayProcessingStep;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayWithPlans extends OpenPayProcessingStep {
        public static final int $stable = 0;

        @NotNull
        public static final PayWithPlans INSTANCE = new PayWithPlans();

        public PayWithPlans() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayProcessingStep$PayWithPoints;", "Lmx/openpay/library/core/model/OpenPayProcessingStep;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayWithPoints extends OpenPayProcessingStep {
        public static final int $stable = 0;

        @NotNull
        public static final PayWithPoints INSTANCE = new PayWithPoints();

        public PayWithPoints() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayProcessingStep$RequireDigitalSign;", "Lmx/openpay/library/core/model/OpenPayProcessingStep;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequireDigitalSign extends OpenPayProcessingStep {
        public static final int $stable = 0;

        @NotNull
        public static final RequireDigitalSign INSTANCE = new RequireDigitalSign();

        public RequireDigitalSign() {
            super(null);
        }
    }

    public OpenPayProcessingStep() {
    }

    public /* synthetic */ OpenPayProcessingStep(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
