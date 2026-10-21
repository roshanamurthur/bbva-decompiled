package j0;

import androidx.compose.material.pullrefresh.PullRefreshState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PullRefreshIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f78744p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PullRefreshState pullRefreshState) {
        super(0);
        this.f78744p0 = pullRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.f78744p0.getProgress() < 1.0f ? 0.3f : 1.0f);
    }
}
