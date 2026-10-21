package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PagerState f5558p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5559q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PagerState pagerState, CoroutineScope coroutineScope) {
        super(0);
        this.f5558p0 = pagerState;
        this.f5559q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(PagerKt.access$pagerSemantics$performForwardPaging(this.f5558p0, this.f5559q0));
    }
}
