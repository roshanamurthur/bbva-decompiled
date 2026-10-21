package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PagerState f5560p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5561q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PagerState pagerState, CoroutineScope coroutineScope) {
        super(0);
        this.f5560p0 = pagerState;
        this.f5561q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(PagerKt.access$pagerSemantics$performBackwardPaging(this.f5560p0, this.f5561q0));
    }
}
