package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.headers.EtagDataManager;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.network.NetworkWorker;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ComponentModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nComponentModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentModule.kt\ncom/bbva/glomohybrid/provider/module/ComponentModuleKt$componentModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,42:1\n129#2,5:43\n129#2,5:48\n*S KotlinDebug\n*F\n+ 1 ComponentModule.kt\ncom/bbva/glomohybrid/provider/module/ComponentModuleKt$componentModule$1$3\n*L\n26#1:43,5\n28#1:48,5\n*E\n"})
public final class f2 extends Lambda implements Function2<Scope, ParametersHolder, EtagDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f2 f34048p0 = new f2(2);

    @Override // kotlin.jvm.functions.Function2
    public final EtagDataManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        EtagDataManager etagDataManager = new EtagDataManager((NetworkWorker) factory.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null), (MainStorage) factory.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null));
        etagDataManager.setProperties((Map) factory.get(Reflection.getOrCreateKotlinClass(Map.class), QualifierKt.named(etagDataManager.getF28076q0()), null));
        return etagDataManager;
    }
}
