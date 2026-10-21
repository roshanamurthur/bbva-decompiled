package b0;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function0<PagerLazyLayoutItemProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<h> f24759p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PagerState f24760q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(State<h> state, PagerState pagerState) {
        super(0);
        this.f24759p0 = state;
        this.f24760q0 = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PagerLazyLayoutItemProvider invoke() {
        h value = this.f24759p0.getValue();
        PagerState pagerState = this.f24760q0;
        return new PagerLazyLayoutItemProvider(pagerState, value, new NearestRangeKeyIndexMap(pagerState.getNearestRange$foundation_release(), value));
    }
}
