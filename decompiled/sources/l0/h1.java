package l0;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f82592p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82593q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(LazyGridState lazyGridState, CoroutineScope coroutineScope) {
        super(0);
        this.f82592p0 = lazyGridState;
        this.f82593q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z10;
        LazyGridState lazyGridState = this.f82592p0;
        if (lazyGridState.getCanScrollForward()) {
            BuildersKt__Builders_commonKt.launch$default(this.f82593q0, null, null, new g1(lazyGridState, null), 3, null);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
