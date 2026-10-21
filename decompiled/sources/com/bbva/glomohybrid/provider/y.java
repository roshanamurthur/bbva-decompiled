package com.bbva.glomohybrid.provider;

import android.content.Context;
import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentAuthenticationHandler;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class y extends Lambda implements Function2<Scope, ParametersHolder, PaymentAuthenticationHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y f34378p0 = new y(2);

    @Override // kotlin.jvm.functions.Function2
    public final PaymentAuthenticationHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        MobilePaymentLib mobilePaymentLib = new MobilePaymentLib();
        TrustDeviceLib trustDeviceLib = new TrustDeviceLib();
        Context applicationContext = ModuleExtKt.androidApplication(single).getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new PaymentAuthenticationHandler(mobilePaymentLib, trustDeviceLib, applicationContext);
    }
}
