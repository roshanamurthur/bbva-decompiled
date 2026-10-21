package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class r6 extends Lambda implements Function0<ParametersHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f34156p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ViewModelComponentsProviders f34157q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Map<String, ? extends Object> map, ViewModelComponentsProviders viewModelComponentsProviders) {
        super(0);
        this.f34156p0 = map;
        this.f34157q0 = viewModelComponentsProviders;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParametersHolder invoke() {
        return ParametersHolderKt.parametersOf(PresentationModuleKt.activity(this.f34156p0), this.f34157q0);
    }
}
