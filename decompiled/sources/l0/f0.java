package l0;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82540p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f82541q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(LazyListState lazyListState, CoroutineScope coroutineScope) {
        super(0);
        this.f82540p0 = coroutineScope;
        this.f82541q0 = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f82540p0, null, null, new e0(this.f82541q0, null), 3, null);
        return Unit.INSTANCE;
    }
}
