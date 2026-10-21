package com.bbva.glomohybrid.provider.module;

import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.shared.SharedStorage;
import com.bbva.localstorage.storage.Storage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$repository$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$repository$1$3\n*L\n180#1:299,5\n*E\n"})
public final class v0 extends Lambda implements Function2<Scope, ParametersHolder, MainStorage> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v0 f34183p0 = new v0(2);

    @Override // kotlin.jvm.functions.Function2
    public final MainStorage invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MainStorage((Storage) single.get(Reflection.getOrCreateKotlinClass(Storage.class), null, null), new SharedStorage((SecureSharing) single.get(Reflection.getOrCreateKotlinClass(SecureSharing.class), null, null)));
    }
}
