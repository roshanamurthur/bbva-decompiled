package l0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.StateData;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82674p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f82675q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ StateData f82676r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f82677s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, StateData stateData, LazyListState lazyListState) {
        super(1);
        this.f82674p0 = coroutineScope;
        this.f82675q0 = mutableState;
        this.f82676r0 = stateData;
        this.f82677s0 = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        MutableState<Boolean> mutableState = this.f82675q0;
        mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        BuildersKt__Builders_commonKt.launch$default(this.f82674p0, null, null, new k0(this.f82676r0, this.f82677s0, iIntValue, null), 3, null);
        return Unit.INSTANCE;
    }
}
