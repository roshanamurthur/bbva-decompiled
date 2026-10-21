package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.webApp.WebAppConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: WebAppDependenciesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getWebAppDependenciesModule", "()Lorg/koin/core/module/Module;", "webAppDependenciesModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class WebAppDependenciesModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33998a = ModuleDSLKt.module$default(false, a.f33999p0, 1, null);

    /* JADX INFO: compiled from: WebAppDependenciesModule.kt */
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33999p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            module2.scope(QualifierKt.named(WebAppConstants.KEY_SCOPE_WEB_APP_VIEW_MODEL), m7.f34116p0);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getWebAppDependenciesModule() {
        return f33998a;
    }
}
