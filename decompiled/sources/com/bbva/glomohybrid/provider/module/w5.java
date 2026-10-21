package com.bbva.glomohybrid.provider.module;

import android.app.Activity;
import com.bbva.glomohybrid.base.cells.constants.KeyConstants;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.slidemenuview.presentation.DefaultMenuDelegate;
import com.bbva.slidemenuview.presentation.MenuDelegate;
import com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$9$2\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,251:1\n44#2,2:252\n133#3:254\n352#3:256\n129#3,5:257\n176#4:255\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$9$2\n*L\n236#1:252,2\n240#1:254\n241#1:256\n242#1:257,5\n241#1:255\n*E\n"})
public final class w5 extends Lambda implements Function2<Scope, ParametersHolder, MenuDelegate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w5 f34196p0 = new w5(2);

    @Override // kotlin.jvm.functions.Function2
    public final MenuDelegate invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        Activity activity = (Activity) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$scoped", parametersHolder2, "<name for destructuring parameter 0>", Activity.class));
        return new DefaultMenuDelegate((ViewModelComponentsProviders) parametersHolder2.elementAt(1, Reflection.getOrCreateKotlinClass(ViewModelComponentsProviders.class)), "2131362382", (ActivityRouter) scope2.get(Reflection.getOrCreateKotlinClass(ActivityRouter.class), QualifierKt.named(KeyConstants.INSTANCE.getLOGIN_ROUTER_KEY()), new v5(activity)), scope2.getKoin().getScopeRegistry().getRootScope().getAll(Reflection.getOrCreateKotlinClass(ClickInterceptor.class)), null, (MobileServices) scope2.get(Reflection.getOrCreateKotlinClass(MobileServices.class), null, null), 16, null);
    }
}
