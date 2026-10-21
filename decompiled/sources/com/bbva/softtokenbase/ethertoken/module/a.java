package com.bbva.softtokenbase.ethertoken.module;

import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.network.model.pinning.PinningCatalog;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherTokenModule.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, TokenCompatConfig> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f36872p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f36873q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f36874r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ PinningCatalog f36875s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, PinningCatalog pinningCatalog, long j10) {
        super(2);
        this.f36872p0 = str;
        this.f36873q0 = str2;
        this.f36874r0 = j10;
        this.f36875s0 = pinningCatalog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TokenCompatConfig invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new TokenCompatConfig(ModuleExtKt.androidContext(single), this.f36875s0, TokenCompatConfig.StorageMode.SHARED, new TokenCompatConfig.EndpointConfig(this.f36872p0, TokenCompatConfig.EndpointConfig.HttpMethod.PUT, this.f36873q0, TokenCompatConfig.EndpointConfig.Mode.R2, this.f36874r0), null, 16, null);
    }
}
