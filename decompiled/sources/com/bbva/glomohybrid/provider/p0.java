package com.bbva.glomohybrid.provider;

import com.bbva.glomo.user.domain.usecase.DeleteUserDataUseCase;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: DependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$13$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,200:1\n41#2,6:201\n47#2:208\n133#3:207\n107#4:209\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProvider$pluginsFactory$1$13$1\n*L\n141#1:201,6\n141#1:208\n141#1:207\n141#1:209\n*E\n"})
public final class p0 extends Lambda implements Function0<SuspendUseCase<Unit>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DependenciesProvider f34369p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(DependenciesProvider dependenciesProvider) {
        super(0);
        this.f34369p0 = dependenciesProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SuspendUseCase<Unit> invoke() {
        DependenciesProvider dependenciesProvider = this.f34369p0;
        boolean z10 = dependenciesProvider instanceof KoinScopeComponent;
        return (SuspendUseCase) (z10 ? ((KoinScopeComponent) dependenciesProvider).getScope() : androidx.databinding.c.e(dependenciesProvider)).get(Reflection.getOrCreateKotlinClass(DeleteUserDataUseCase.class), null, o0.f34367p0);
    }
}
