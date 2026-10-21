package a;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.feature.TapOnPhoneController;
import mx.openpay.library.di.DependenciesProvider;

/* JADX INFO: loaded from: classes.dex */
public final class q extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f130a = new q();

    public q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = OpenPaySdk.appContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context = null;
        }
        Context context2 = context;
        DependenciesProvider.TapOnPhoneModule tapOnPhoneModule = DependenciesProvider.TapOnPhoneModule.INSTANCE;
        return new TapOnPhoneController(context2, tapOnPhoneModule.provideInitTsdkManualInitializerUseCase(), tapOnPhoneModule.provideCreatedTsdkManualInitializerUseCase(), tapOnPhoneModule.provideInitTapOnPhoneUseCase(), tapOnPhoneModule.provideExecuteTapOnPhoneChargeUseCase(), tapOnPhoneModule.provideExecuteTapOnPhoneChargePointsStepUseCase(), tapOnPhoneModule.provideExecuteTapOnPhoneChargePlansStepUseCase(), tapOnPhoneModule.provideExecuteTapOnPhoneChargeSignStepUseCase(), tapOnPhoneModule.provideExecuteTapOnPhoneRefundChargeUseCase(), tapOnPhoneModule.provideCancelTapOnPhoneProcessUseCase());
    }
}
