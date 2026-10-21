package com.bbva.softtokenbase.ethertoken.module;

import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.softtokenbase.ethertoken.GlomoEtherTokenCompat;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherTokenModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nEtherTokenModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenCompatModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,103:1\n129#2,5:104\n*S KotlinDebug\n*F\n+ 1 EtherTokenModule.kt\ncom/bbva/softtokenbase/ethertoken/module/EtherTokenModuleKt$getEtherTokenCompatModule$1$2\n*L\n91#1:104,5\n*E\n"})
public final class b extends Lambda implements Function2<Scope, ParametersHolder, GlomoEtherTokenCompat> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f36876p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final GlomoEtherTokenCompat invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GlomoEtherTokenCompat(new TokenCompat((TokenCompatConfig) single.get(Reflection.getOrCreateKotlinClass(TokenCompatConfig.class), null, null)));
    }
}
