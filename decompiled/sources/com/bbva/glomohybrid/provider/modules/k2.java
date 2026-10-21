package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.glomohybrid.CountryChangeUserFullScreenModalFactory;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.cellsweb.presentation.view.CountrySingleAppModalsView;
import com.bbva.glomohybrid.cellsweb.presentation.view.ModalsView;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nUserTypeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$11$1\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,66:1\n44#2:67\n129#3,5:68\n*S KotlinDebug\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$11$1\n*L\n57#1:67\n61#1:68,5\n*E\n"})
public final class k2 extends Lambda implements Function2<Scope, ParametersHolder, ModalsView> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k2 f34307p0 = new k2(2);

    @Override // kotlin.jvm.functions.Function2
    public final ModalsView invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new CountrySingleAppModalsView((CellsWebActivity) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$scoped", parametersHolder2, "<name for destructuring parameter 0>", CellsWebActivity.class)), new CountryChangeUserFullScreenModalFactory(), null, (HalfModalComponent) scope2.get(Reflection.getOrCreateKotlinClass(HalfModalComponent.class), null, null), 4, null);
    }
}
