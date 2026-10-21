package com.bbva.glomohybrid.provider.module;

import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l0 extends Lambda implements Function0<ParametersHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NetworkWorker f34100p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(NetworkWorker networkWorker) {
        super(0);
        this.f34100p0 = networkWorker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParametersHolder invoke() {
        return ParametersHolderKt.parametersOf(this.f34100p0);
    }
}
