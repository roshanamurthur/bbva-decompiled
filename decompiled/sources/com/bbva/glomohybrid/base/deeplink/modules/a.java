package com.bbva.glomohybrid.base.deeplink.modules;

import com.bbva.glomohybrid.base.deeplink.model.DeeplinkConfig;
import com.bbva.glomohybrid.base.deeplink.model.GoogleAssistantConfig;
import com.bbva.glomohybrid.base.deeplink.model.QRConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: DynamicLinkModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, DeeplinkConfig> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f31275p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f31276q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f31277r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f31278s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ String f31279t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ int f31280u0;
    public final /* synthetic */ String v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, String str, String str2, int i11, String str3, int i12, String str4) {
        super(2);
        this.f31275p0 = i10;
        this.f31276q0 = str;
        this.f31277r0 = str2;
        this.f31278s0 = i11;
        this.f31279t0 = str3;
        this.f31280u0 = i12;
        this.v0 = str4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final DeeplinkConfig invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        String string = ModuleExtKt.androidContext(single).getString(this.f31275p0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        QRConfig qRConfig = new QRConfig(this.f31276q0, this.f31277r0);
        String string2 = ModuleExtKt.androidContext(single).getString(this.f31278s0);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        GoogleAssistantConfig googleAssistantConfig = new GoogleAssistantConfig(string2, this.f31279t0);
        String string3 = ModuleExtKt.androidContext(single).getString(this.f31280u0);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new DeeplinkConfig(string, qRConfig, googleAssistantConfig, string3, this.v0);
    }
}
