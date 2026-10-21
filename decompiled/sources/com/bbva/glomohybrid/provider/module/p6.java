package com.bbva.glomohybrid.provider.module;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class p6 extends Lambda implements Function0<ParametersHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f34140p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(Map<String, ? extends Object> map) {
        super(0);
        this.f34140p0 = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParametersHolder invoke() {
        return ParametersHolderKt.parametersOf(Integer.valueOf(PresentationModuleKt.activityHashCode(this.f34140p0)));
    }
}
