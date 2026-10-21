package com.bbva.glomohybrid.landing.presentation.router.handler;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.glomohybrid.base.handler.BiometricsIntentHandler;
import com.bbva.softtokenbase.usecase.IsSoftTokenBiometricActiveUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingDigitalTokenNavigationHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/router/handler/LandingDigitalTokenNavigationHandler;", "Lcom/bbva/glomohybrid/landing/presentation/router/handler/CustomNavigationHandler;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "transformNavigation", "", "c", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "route", "Lcom/bbva/softtokenbase/usecase/IsSoftTokenBiometricActiveUseCase;", "getBiometricsAvailability", "Lcom/bbva/component/ui/biometrics/BiometricsComponent;", BiometricsIntentHandler.ID, "<init>", "(Lcom/bbva/softtokenbase/usecase/IsSoftTokenBiometricActiveUseCase;Lcom/bbva/component/ui/biometrics/BiometricsComponent;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingDigitalTokenNavigationHandler implements CustomNavigationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IsSoftTokenBiometricActiveUseCase f33086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiometricsComponent f33087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    public LandingDigitalTokenNavigationHandler(@NotNull IsSoftTokenBiometricActiveUseCase getBiometricsAvailability, @NotNull BiometricsComponent biometrics) {
        Intrinsics.checkNotNullParameter(getBiometricsAvailability, "getBiometricsAvailability");
        Intrinsics.checkNotNullParameter(biometrics, "biometrics");
        this.f33086a = getBiometricsAvailability;
        this.f33087b = biometrics;
        this.route = CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
    }

    @Override // com.bbva.glomohybrid.landing.presentation.router.handler.CustomNavigationHandler
    @NotNull
    public String getRoute() {
        return this.route;
    }

    @Override // com.bbva.glomohybrid.landing.presentation.router.handler.CustomNavigationHandler
    public boolean transformNavigation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.f33086a.execute().booleanValue()) {
            return false;
        }
        this.f33087b.authenticate((FragmentActivity) activity);
        return true;
    }
}
