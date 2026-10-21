package com.bbva.glomohybrid.provider.modules;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.qrscanner.customenroll.viewmodel.QrReaderViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: QrModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nQrModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrModule.kt\ncom/bbva/glomohybrid/provider/modules/QrModuleKt$qrModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,23:1\n129#2,5:24\n*S KotlinDebug\n*F\n+ 1 QrModule.kt\ncom/bbva/glomohybrid/provider/modules/QrModuleKt$qrModule$1$1\n*L\n12#1:24,5\n*E\n"})
public final class w1 extends Lambda implements Function2<Scope, ParametersHolder, QrReaderViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w1 f34354p0 = new w1(2);

    @Override // kotlin.jvm.functions.Function2
    public final QrReaderViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new QrReaderViewModel((MessageDispatcher) factory.get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null));
    }
}
