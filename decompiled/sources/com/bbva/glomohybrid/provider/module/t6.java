package com.bbva.glomohybrid.provider.module;

import androidx.appcompat.app.AppCompatActivity;
import com.bbva.glomohybrid.base.cells.constants.KeyConstants;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.slidemenuview.presentation.MenuDelegate;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$6\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 ViewModelComponentsProviders.kt\ncom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProvidersKt\n*L\n1#1,251:1\n44#2:252\n129#3,5:253\n133#3:261\n41#4,3:258\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$6\n*L\n99#1:252\n100#1:253,5\n104#1:261\n104#1:258,3\n*E\n"})
public final class t6 extends Lambda implements Function2<Scope, ParametersHolder, CellsWebViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t6 f34173p0 = new t6(2);

    @Override // kotlin.jvm.functions.Function2
    public final CellsWebViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        Map map = (Map) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$viewModel", parametersHolder2, "<name for destructuring parameter 0>", Map.class));
        ViewModelComponentsProviders viewModelComponentsProviders = (ViewModelComponentsProviders) scope2.get(Reflection.getOrCreateKotlinClass(ViewModelComponentsProviders.class), null, new s6(map));
        AppCompatActivity appCompatActivityActivity = PresentationModuleKt.activity(map);
        return new CellsWebViewModel(viewModelComponentsProviders, (MenuDelegate) Koin.getOrCreateScope$default(ComponentCallbackExtKt.getKoin(appCompatActivityActivity), KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(appCompatActivityActivity.getClass())) + "@" + appCompatActivityActivity.hashCode(), new TypeQualifier(Reflection.getOrCreateKotlinClass(appCompatActivityActivity.getClass())), null, 4, null).get(Reflection.getOrCreateKotlinClass(MenuDelegate.class), QualifierKt.named(KeyConstants.INSTANCE.getCELLS_MENU_DELEGATE_KEY()), new r6(map, viewModelComponentsProviders)), null, null, 12, null);
    }
}
