package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.PaymentTypeRequestDto;
import mx.openpay.library.domain.model.eglobal.PaymentType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PaymentTypeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToPaymentTypeRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentTypeRequestDto;", "Lmx/openpay/library/domain/model/eglobal/PaymentType;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaymentTypeMapperKt {

    /* JADX INFO: compiled from: PaymentTypeMapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    @NotNull
    public static final PaymentTypeRequestDto mapToPaymentTypeRequestDto(@NotNull PaymentType paymentType) {
        Intrinsics.checkNotNullParameter(paymentType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
        if (i10 == 1) {
            return PaymentTypeRequestDto.WITHOUT_INTEREST;
        }
        if (i10 == 2) {
            return PaymentTypeRequestDto.WITH_INTEREST;
        }
        throw new NoWhenBranchMatchedException();
    }
}
