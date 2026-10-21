package com.bbva.ui.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class f extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f37299p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Function1<? super String, Unit> function1) {
        super(0);
        this.f37299p0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<String, Unit> function1 = this.f37299p0;
        if (function1 != null) {
            function1.invoke("");
        }
        return Unit.INSTANCE;
    }
}
