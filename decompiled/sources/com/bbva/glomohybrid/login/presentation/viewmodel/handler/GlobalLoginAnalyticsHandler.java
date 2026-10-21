package com.bbva.glomohybrid.login.presentation.viewmodel.handler;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
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

/* JADX INFO: compiled from: GlobalLoginAnalyticsHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginAnalyticsHandler;", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics;", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "error", "", "modalId", "", "trackLoginError", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGlobalLoginAnalyticsHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalLoginAnalyticsHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginAnalyticsHandler\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,23:1\n56#2,6:24\n*S KotlinDebug\n*F\n+ 1 GlobalLoginAnalyticsHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginAnalyticsHandler\n*L\n17#1:24,6\n*E\n"})
public final class GlobalLoginAnalyticsHandler implements LoginAnalytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f33751a;

    /* JADX WARN: Multi-variable type inference failed */
    public GlobalLoginAnalyticsHandler(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33751a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginAnalyticsHandler$special$$inlined$inject$default$1
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

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.handler.LoginAnalytics
    public void trackLoginError(@NotNull LoginException error, @Nullable String modalId) {
        Intrinsics.checkNotNullParameter(error, "error");
        ((AnalyticsManager) this.f33751a.getValue()).trackEvent(AnalyticsEvent.LOGIN_ERROR);
    }
}
