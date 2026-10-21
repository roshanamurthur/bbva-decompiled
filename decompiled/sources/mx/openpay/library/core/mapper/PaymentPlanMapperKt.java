package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayPaymentPlan;
import mx.openpay.library.core.model.OpenPayPaymentType;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import mx.openpay.library.domain.model.eglobal.PaymentType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "Lmx/openpay/library/core/model/OpenPayPaymentPlan;", "Lmx/openpay/library/domain/model/eglobal/PaymentType;", "Lmx/openpay/library/core/model/OpenPayPaymentType;", "mapToLibraryModel", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaymentPlanMapperKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentType.values().length];
            try {
                iArr[PaymentType.WITHOUT_INTEREST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentType.WITH_INTEREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OpenPayPaymentType.values().length];
            try {
                iArr2[OpenPayPaymentType.WITHOUT_INTEREST.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OpenPayPaymentType.WITH_INTEREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final PaymentPlan mapToDomainModel(@NotNull OpenPayPaymentPlan openPayPaymentPlan) {
        Intrinsics.checkNotNullParameter(openPayPaymentPlan, "<this>");
        return new PaymentPlan(openPayPaymentPlan.getPayments(), mapToDomainModel(openPayPaymentPlan.getPaymentsType()));
    }

    @NotNull
    public static final OpenPayPaymentPlan mapToLibraryModel(@NotNull PaymentPlan paymentPlan) {
        Intrinsics.checkNotNullParameter(paymentPlan, "<this>");
        return new OpenPayPaymentPlan(paymentPlan.getPayments(), mapToLibraryModel(paymentPlan.getPaymentsType()));
    }

    @NotNull
    public static final PaymentType mapToDomainModel(@NotNull OpenPayPaymentType openPayPaymentType) {
        Intrinsics.checkNotNullParameter(openPayPaymentType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[openPayPaymentType.ordinal()];
        if (i10 == 1) {
            return PaymentType.WITHOUT_INTEREST;
        }
        if (i10 == 2) {
            return PaymentType.WITH_INTEREST;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final OpenPayPaymentType mapToLibraryModel(@NotNull PaymentType paymentType) {
        Intrinsics.checkNotNullParameter(paymentType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
        if (i10 == 1) {
            return OpenPayPaymentType.WITHOUT_INTEREST;
        }
        if (i10 == 2) {
            return OpenPayPaymentType.WITH_INTEREST;
        }
        throw new NoWhenBranchMatchedException();
    }
}
