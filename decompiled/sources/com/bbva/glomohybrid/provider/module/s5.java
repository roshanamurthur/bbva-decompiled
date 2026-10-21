package com.bbva.glomohybrid.provider.module;

import android.app.Activity;
import com.bbva.glomohybrid.base.cells.constants.KeyConstants;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.slidemenuview.presentation.DefaultMenuDelegate;
import com.bbva.slidemenuview.presentation.MenuDelegate;
import com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$8$2\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n44#2,2:252\n133#3:254\n352#3:256\n129#3,5:265\n176#4:255\n1655#5,8:257\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$8$2\n*L\n213#1:252,2\n217#1:254\n218#1:256\n219#1:265,5\n218#1:255\n218#1:257,8\n*E\n"})
public final class s5 extends Lambda implements Function2<Scope, ParametersHolder, MenuDelegate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s5 f34164p0 = new s5(2);

    @Override // kotlin.jvm.functions.Function2
    public final MenuDelegate invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        Activity activity = (Activity) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$scoped", parametersHolder2, "<name for destructuring parameter 0>", Activity.class));
        ViewModelComponentsProviders viewModelComponentsProviders = (ViewModelComponentsProviders) parametersHolder2.elementAt(1, Reflection.getOrCreateKotlinClass(ViewModelComponentsProviders.class));
        ActivityRouter activityRouter = (ActivityRouter) scope2.get(Reflection.getOrCreateKotlinClass(ActivityRouter.class), QualifierKt.named(KeyConstants.INSTANCE.getCELLS_ROUTER_KEY()), new r5(activity));
        List all = scope2.getKoin().getScopeRegistry().getRootScope().getAll(Reflection.getOrCreateKotlinClass(ClickInterceptor.class));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (hashSet.add(((ClickInterceptor) obj).getClass())) {
                arrayList.add(obj);
            }
        }
        return new DefaultMenuDelegate(viewModelComponentsProviders, "2131362466", activityRouter, arrayList, null, (MobileServices) scope2.get(Reflection.getOrCreateKotlinClass(MobileServices.class), null, null), 16, null);
    }
}
