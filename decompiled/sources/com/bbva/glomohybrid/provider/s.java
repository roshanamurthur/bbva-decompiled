package com.bbva.glomohybrid.provider;

import android.content.Context;
import com.bancomer.mbanking.R;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.cellscore.web.constant.DarkMode;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.glomohybrid.WebChromeClient;
import com.bbva.glomohybrid.WebViewClient;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.usecase.GetUrlUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAppDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,238:1\n129#2,5:239\n*S KotlinDebug\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1$4\n*L\n134#1:239,5\n*E\n"})
public final class s extends Lambda implements Function2<Scope, ParametersHolder, WebViewBuilder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s f34372p0 = new s(2);

    @Override // kotlin.jvm.functions.Function2
    public final WebViewBuilder invoke(Scope scope, ParametersHolder parametersHolder) throws MissingAndroidContextException {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        AppDependenciesProvider appDependenciesProvider = AppDependenciesProvider.INSTANCE;
        Context contextAndroidContext = ModuleExtKt.androidContext(single);
        WebChromeClient webChromeClient = (WebChromeClient) single.get(Reflection.getOrCreateKotlinClass(WebChromeClient.class), null, null);
        GetUrlUseCase getUrlUseCase = (GetUrlUseCase) single.get(Reflection.getOrCreateKotlinClass(GetUrlUseCase.class), null, null);
        appDependenciesProvider.getClass();
        WebViewBuilder webViewBuilder = new WebViewBuilder();
        webViewBuilder.nativeWebContainerRoute(new Route.Builder().activity(CellsWebActivity.class).animationIn(R.anim.fade_in).animationOut(R.anim.fade_out).build());
        webViewBuilder.client(new WebViewClient(contextAndroidContext, false, getUrlUseCase));
        webViewBuilder.chromeClient(webChromeClient);
        webViewBuilder.webDebugging(false);
        webViewBuilder.webViewLoadDelay(0L);
        webViewBuilder.darkMode(DarkMode.FORCE_OFF);
        webViewBuilder.webId("glomo");
        return webViewBuilder;
    }
}
