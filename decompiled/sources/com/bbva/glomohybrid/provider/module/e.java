package com.bbva.glomohybrid.provider.module;

import android.webkit.CookieManager;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.dm.analytics.model.CookiesRepository;
import com.bbva.component.dm.analytics.usecase.CleanCookiesUseCase;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.usecase.GetUrlUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AnalyticsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAnalyticsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,64:1\n129#2,5:65\n*S KotlinDebug\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1$1\n*L\n25#1:65,5\n*E\n"})
public final class e extends Lambda implements Function2<Scope, ParametersHolder, CleanCookiesUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e f34036p0 = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final CleanCookiesUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        GetUrlUseCase getUrlUseCase = (GetUrlUseCase) scope2.get(androidx.activity.a.f(scope2, "$this$factory", parametersHolder, "it", GetUrlUseCase.class), null, null);
        CookieManager cookieManager = CookieManager.getInstance();
        Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
        return new CleanCookiesUseCase(new CookiesRepository(cookieManager, getUrlUseCase.execute(UserType.PERSONAL)), (MessageDispatcher) ComponentManager.get("web-dispatcher"));
    }
}
