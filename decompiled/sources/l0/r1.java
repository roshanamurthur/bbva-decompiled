package l0;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f82838p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82839q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(LazyListState lazyListState, CoroutineScope coroutineScope) {
        super(0);
        this.f82838p0 = lazyListState;
        this.f82839q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z10;
        LazyListState lazyListState = this.f82838p0;
        if (lazyListState.getCanScrollBackward()) {
            BuildersKt__Builders_commonKt.launch$default(this.f82839q0, null, null, new q1(lazyListState, null), 3, null);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
