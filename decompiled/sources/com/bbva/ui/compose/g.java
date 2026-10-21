package com.bbva.ui.compose;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f37300p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MutableState<Boolean> mutableState) {
        super(0);
        this.f37300p0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Boolean> mutableState = this.f37300p0;
        mutableState.setValue(Boolean.valueOf(!TextFieldKt.access$InternalTextField$lambda$3(mutableState)));
        return Unit.INSTANCE;
    }
}
