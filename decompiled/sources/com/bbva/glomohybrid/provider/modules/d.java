package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.domain.model.RememberedUser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Lambda implements Function0<ParametersHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RememberedUser f34274p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RememberedUser rememberedUser) {
        super(0);
        this.f34274p0 = rememberedUser;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParametersHolder invoke() {
        return ParametersHolderKt.parametersOf(this.f34274p0);
    }
}
