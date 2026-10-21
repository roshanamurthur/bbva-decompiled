package com.bbva.glomohybrid.provider.module;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomo.user.domain.usecase.StoreUserTypeUseCase;
import com.bbva.glomohybrid.base.session.SessionTokenGenerator;
import com.bbva.glomohybrid.base.session.UUIDTokenGenerator;
import com.bbva.glomohybrid.base.usecase.AbstractStartBioCatchUseCase;
import com.bbva.session.domain.observers.SessionTokenObserver;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SessionModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSessionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/provider/module/SessionModuleKt$sessionTracingModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,35:1\n352#2:36\n154#2,5:37\n129#2,5:42\n154#2,5:47\n*S KotlinDebug\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/provider/module/SessionModuleKt$sessionTracingModule$1$3\n*L\n28#1:36\n29#1:37,5\n30#1:42,5\n31#1:47,5\n*E\n"})
public final class e7 extends Lambda implements Function2<Scope, ParametersHolder, SessionTokenGenerator> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e7 f34044p0 = new e7(2);

    @Override // kotlin.jvm.functions.Function2
    public final SessionTokenGenerator invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new SessionTokenGenerator(new UUIDTokenGenerator(), single.getAll(Reflection.getOrCreateKotlinClass(SessionTokenObserver.class)), (StoreUserTypeUseCase) single.getOrNull(Reflection.getOrCreateKotlinClass(StoreUserTypeUseCase.class), null, null), (MessageDispatcher) single.get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null), (AbstractStartBioCatchUseCase) single.getOrNull(Reflection.getOrCreateKotlinClass(AbstractStartBioCatchUseCase.class), null, null));
    }
}
