package l0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f82607p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(MutableState<Boolean> mutableState) {
        super(0);
        this.f82607p0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<Boolean> mutableState = this.f82607p0;
        mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }
}
