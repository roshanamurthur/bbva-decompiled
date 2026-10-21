package com.bbva.glomohybrid.provider.modules;

import androidx.appcompat.app.AppCompatActivity;
import com.bbva.glomohybrid.base.cells.constants.KeyConstants;
import com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.provider.module.PresentationModuleKt;
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

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$11\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 ViewModelComponentsProviders.kt\ncom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProvidersKt\n*L\n1#1,110:1\n44#2:111\n129#3,5:112\n133#3:120\n133#3:128\n41#4,3:117\n37#4,7:121\n*S KotlinDebug\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$11\n*L\n98#1:111\n99#1:112,5\n103#1:120\n106#1:128\n103#1:117,3\n106#1:121,7\n*E\n"})
public final class u extends Lambda implements Function2<Scope, ParametersHolder, CellsWebViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u f34345p0 = new u(2);

    @Override // kotlin.jvm.functions.Function2
    public final CellsWebViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        Map map = (Map) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$viewModel", parametersHolder2, "<name for destructuring parameter 0>", Map.class));
        ViewModelComponentsProviders viewModelComponentsProviders = (ViewModelComponentsProviders) scope2.get(Reflection.getOrCreateKotlinClass(ViewModelComponentsProviders.class), null, new t(map));
        AppCompatActivity appCompatActivityActivity = PresentationModuleKt.activity(map);
        return new CellsWebViewModel(viewModelComponentsProviders, (MenuDelegate) Koin.getOrCreateScope$default(ComponentCallbackExtKt.getKoin(appCompatActivityActivity), KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(appCompatActivityActivity.getClass())) + "@" + appCompatActivityActivity.hashCode(), new TypeQualifier(Reflection.getOrCreateKotlinClass(appCompatActivityActivity.getClass())), null, 4, null).get(Reflection.getOrCreateKotlinClass(MenuDelegate.class), QualifierKt.named(KeyConstants.INSTANCE.getCELLS_MENU_DELEGATE_KEY()), new r(map, viewModelComponentsProviders)), (DynamicModulesDelegate) Koin.getOrCreateScope$default(ComponentCallbackExtKt.getKoin(appCompatActivityActivity), KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(appCompatActivityActivity.getClass())) + "@" + appCompatActivityActivity.hashCode(), new TypeQualifier(Reflection.getOrCreateKotlinClass(appCompatActivityActivity.getClass())), null, 4, null).get(Reflection.getOrCreateKotlinClass(DynamicModulesDelegate.class), null, new s(viewModelComponentsProviders)), null, 8, null);
    }
}
