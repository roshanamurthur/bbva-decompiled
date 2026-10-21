package com.bbva.softtokenbase.ethertoken.module;

import com.bbva.softtokenbase.ethertoken.plugin.GloMoEtherTokenPluginProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherTokenModule.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends Lambda implements Function2<Scope, ParametersHolder, GloMoEtherTokenPluginProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f36882p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(2);
        this.f36882p0 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final GloMoEtherTokenPluginProvider invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GloMoEtherTokenPluginProvider(new g(this.f36882p0));
    }
}
