package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.deeplink.DeeplinkDispatcherProvider;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.notifications.viewmodel.NotificationViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NotificationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNotificationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationModule.kt\ncom/bbva/glomohybrid/provider/module/NotificationModuleKt$notificationModule$1$1\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,32:1\n44#2:33\n129#3,5:34\n129#3,5:39\n*S KotlinDebug\n*F\n+ 1 NotificationModule.kt\ncom/bbva/glomohybrid/provider/module/NotificationModuleKt$notificationModule$1$1\n*L\n14#1:33\n15#1:34,5\n16#1:39,5\n*E\n"})
public final class f5 extends Lambda implements Function2<Scope, ParametersHolder, NotificationViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f5 f34051p0 = new f5(2);

    @Override // kotlin.jvm.functions.Function2
    public final NotificationViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new NotificationViewModel(null, (ViewModelComponentsProviders) scope2.get(Reflection.getOrCreateKotlinClass(ViewModelComponentsProviders.class), null, new e5(((Number) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$viewModel", parametersHolder2, "<name for destructuring parameter 0>", Integer.class))).intValue())), null, (DeeplinkDispatcherProvider) scope2.get(Reflection.getOrCreateKotlinClass(DeeplinkDispatcherProvider.class), null, null), 5, null);
    }
}
