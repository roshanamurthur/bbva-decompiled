package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.DefaultUserTypeActivityDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeActivityDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nUserTypeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$10$1\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,66:1\n44#2,2:67\n*S KotlinDebug\n*F\n+ 1 UserTypeModule.kt\ncom/bbva/glomohybrid/provider/modules/UserTypeModuleKt$userTypeModule$1$10$1\n*L\n51#1:67,2\n*E\n"})
public final class i2 extends Lambda implements Function2<Scope, ParametersHolder, UserTypeActivityDelegate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i2 f34299p0 = new i2(2);

    @Override // kotlin.jvm.functions.Function2
    public final UserTypeActivityDelegate invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        return new DefaultUserTypeActivityDelegate((CellsWebActivity) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$scoped", parametersHolder2, "<name for destructuring parameter 0>", CellsWebActivity.class)), ((CellsWebViewModel) parametersHolder2.elementAt(1, Reflection.getOrCreateKotlinClass(CellsWebViewModel.class))).getUserTypeViewModelDelegate());
    }
}
