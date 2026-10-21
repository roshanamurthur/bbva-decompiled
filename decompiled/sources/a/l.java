package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.feature.PaymentLinkControllerImpl;
import mx.openpay.library.di.DependenciesProvider;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f110a = new l();

    public l() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependenciesProvider.PaymentLinkModule paymentLinkModule = DependenciesProvider.PaymentLinkModule.INSTANCE;
        return new PaymentLinkControllerImpl(paymentLinkModule.provideCreatePaymentLinkUseCase(), paymentLinkModule.provideGetAllPaymentLinksUseCase(), paymentLinkModule.provideUpdatePaymentLinkStatusUseCase(), paymentLinkModule.provideUpdatePaymentLinkUseCase(), paymentLinkModule.provideCheckPaymentLinkUseCase(), paymentLinkModule.provideRefundPaymentLinkUseCase(), DependenciesProvider.EglobalModule.INSTANCE.provideGetPaymentPlansWithoutBinUseCase());
    }
}
