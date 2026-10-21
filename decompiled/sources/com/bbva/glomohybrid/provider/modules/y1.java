package com.bbva.glomohybrid.provider.modules;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrToolbarViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: QrModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nQrModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrModule.kt\ncom/bbva/glomohybrid/provider/modules/QrModuleKt$qrModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,23:1\n129#2,5:24\n*S KotlinDebug\n*F\n+ 1 QrModule.kt\ncom/bbva/glomohybrid/provider/modules/QrModuleKt$qrModule$1$3\n*L\n20#1:24,5\n*E\n"})
public final class y1 extends Lambda implements Function2<Scope, ParametersHolder, QrToolbarViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y1 f34360p0 = new y1(2);

    @Override // kotlin.jvm.functions.Function2
    public final QrToolbarViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new QrToolbarViewModel((MessageDispatcher) factory.get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null));
    }
}
