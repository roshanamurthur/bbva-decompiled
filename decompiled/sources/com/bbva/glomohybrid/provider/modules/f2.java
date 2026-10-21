package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.smartassistance.listeners.CustomBaseConversation;
import com.bbva.smartassistance.listeners.CustomBaseSessionListener;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SmartAssistanceModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSmartAssistanceModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartAssistanceModule.kt\ncom/bbva/glomohybrid/provider/modules/SmartAssistanceModuleKt$smartAssistanceModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,16:1\n129#2,5:17\n*S KotlinDebug\n*F\n+ 1 SmartAssistanceModule.kt\ncom/bbva/glomohybrid/provider/modules/SmartAssistanceModuleKt$smartAssistanceModule$1$3\n*L\n13#1:17,5\n*E\n"})
public final class f2 extends Lambda implements Function2<Scope, ParametersHolder, CustomBaseSessionListener> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f2 f34287p0 = new f2(2);

    @Override // kotlin.jvm.functions.Function2
    public final CustomBaseSessionListener invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CustomBaseSessionListener((DeviceIdDataSource) single.get(Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class), null, null), (CustomBaseConversation) single.get(Reflection.getOrCreateKotlinClass(CustomBaseConversation.class), null, null));
    }
}
