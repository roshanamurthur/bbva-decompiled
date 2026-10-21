package com.bbva.glomohybrid.provider.modules;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.smartassistance.listeners.CustomBaseConversation;
import com.bbva.smartassistance.listeners.CustomBaseConversationListener;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SmartAssistanceModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSmartAssistanceModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartAssistanceModule.kt\ncom/bbva/glomohybrid/provider/modules/SmartAssistanceModuleKt$smartAssistanceModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,16:1\n129#2,5:17\n*S KotlinDebug\n*F\n+ 1 SmartAssistanceModule.kt\ncom/bbva/glomohybrid/provider/modules/SmartAssistanceModuleKt$smartAssistanceModule$1$2\n*L\n12#1:17,5\n*E\n"})
public final class e2 extends Lambda implements Function2<Scope, ParametersHolder, CustomBaseConversationListener> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e2 f34281p0 = new e2(2);

    @Override // kotlin.jvm.functions.Function2
    public final CustomBaseConversationListener invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CustomBaseConversationListener((MessageDispatcher) single.get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null), (CustomBaseConversation) single.get(Reflection.getOrCreateKotlinClass(CustomBaseConversation.class), null, null));
    }
}
