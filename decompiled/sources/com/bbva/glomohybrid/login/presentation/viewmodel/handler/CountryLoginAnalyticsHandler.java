package com.bbva.glomohybrid.login.presentation.viewmodel.handler;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.login.domain.mapper.CountryErrorModals;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: CountryLoginAnalyticsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/CountryLoginAnalyticsHandler;", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics;", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "analyticsEvent", "", "trackEvent", "", "data", "addLoginAnalyticData", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "error", "modalId", "trackLoginError", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryLoginAnalyticsHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryLoginAnalyticsHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/CountryLoginAnalyticsHandler\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,62:1\n56#2,6:63\n*S KotlinDebug\n*F\n+ 1 CountryLoginAnalyticsHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/CountryLoginAnalyticsHandler\n*L\n13#1:63,6\n*E\n"})
public final class CountryLoginAnalyticsHandler implements LoginAnalytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f33743a;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryLoginAnalyticsHandler(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33743a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.handler.CountryLoginAnalyticsHandler$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), qualifier, objArr);
            }
        });
    }

    public final void addLoginAnalyticData(@NotNull AnalyticsEvent analyticsEvent, @NotNull String data) {
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        Intrinsics.checkNotNullParameter(data, "data");
        analyticsEvent.putData(AnalyticsConstants.Key.PROFILE_ID, data);
        ((AnalyticsManager) this.f33743a.getValue()).trackEvent(analyticsEvent);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.handler.LoginAnalytics
    @NotNull
    public String format(@Nullable String str) {
        return LoginAnalytics.DefaultImpls.format(this, str);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.handler.LoginAnalytics
    @NotNull
    public String formatException(@NotNull LoginException loginException) {
        return LoginAnalytics.DefaultImpls.formatException(this, loginException);
    }

    public final void trackEvent(@NotNull AnalyticsEvent analyticsEvent) {
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        ((AnalyticsManager) this.f33743a.getValue()).trackEvent(analyticsEvent);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.handler.LoginAnalytics
    public void trackLoginError(@NotNull LoginException error, @Nullable String modalId) {
        Intrinsics.checkNotNullParameter(error, "error");
        Unit unit = null;
        AnalyticsEvent analyticsEvent = Intrinsics.areEqual(modalId, CountryErrorModals.invalidCredentialsId) ? AnalyticsEvent.LOGIN_CREDENTIALS_ERROR : null;
        Lazy lazy = this.f33743a;
        if (analyticsEvent != null) {
            ((AnalyticsManager) lazy.getValue()).trackEvent(analyticsEvent);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            AnalyticsManager analyticsManager = (AnalyticsManager) lazy.getValue();
            Integer statusCode = error.getStatusCode();
            AnalyticsEvent analyticsEvent2 = (statusCode != null && statusCode.intValue() == 403) ? AnalyticsEvent.LOGIN_CREDENTIALS_ERROR : AnalyticsEvent.LOGIN_SERVICE_ERROR;
            analyticsEvent2.putData("error", formatException(error));
            analyticsManager.trackEvent(analyticsEvent2);
        }
    }
}
