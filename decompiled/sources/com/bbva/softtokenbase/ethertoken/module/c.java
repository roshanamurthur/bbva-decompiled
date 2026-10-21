package com.bbva.softtokenbase.ethertoken.module;

import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.softtokenbase.ethertoken.plugin.GlomoEtherTokenCompatPluginProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherTokenModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nEtherTokenModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenCompatModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,103:1\n129#2,5:104\n*S KotlinDebug\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenCompatModule$1$3\n*L\n94#1:104,5\n*E\n"})
public final class c extends Lambda implements Function2<Scope, ParametersHolder, GlomoEtherTokenCompatPluginProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f36877p0 = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final GlomoEtherTokenCompatPluginProvider invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GlomoEtherTokenCompatPluginProvider((TokenCompatConfig) single.get(Reflection.getOrCreateKotlinClass(TokenCompatConfig.class), null, null));
    }
}
