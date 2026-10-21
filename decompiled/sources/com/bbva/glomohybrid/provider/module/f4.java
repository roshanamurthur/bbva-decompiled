package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomo.user.repository.datasource.UserLoginDataSource;
import com.bbva.glomohybrid.login.domain.usecase.GetCustomerUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$12\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n129#2,5:59\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$12\n*L\n52#1:59,5\n*E\n"})
public final class f4 extends Lambda implements Function2<Scope, ParametersHolder, GetCustomerUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f4 f34050p0 = new f4(2);

    @Override // kotlin.jvm.functions.Function2
    public final GetCustomerUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GetCustomerUseCase((CustomerDataManager) factory.get(Reflection.getOrCreateKotlinClass(CustomerDataManager.class), null, null), (AppSettingsRepository) factory.get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), null, null), (UserLoginDataSource) factory.get(Reflection.getOrCreateKotlinClass(UserLoginDataSource.class), null, null), (RememberedUserDataSource) factory.get(Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), null, null), null, 16, null);
    }
}
