package com.bbva.glomohybrid.provider.module;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: NotificationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e5 extends Lambda implements Function0<ParametersHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f34042p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(int i10) {
        super(0);
        this.f34042p0 = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParametersHolder invoke() {
        return ParametersHolderKt.parametersOf(Integer.valueOf(this.f34042p0));
    }
}
