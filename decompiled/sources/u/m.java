package u;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<ScrollingLogic> f93681p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(State<ScrollingLogic> state) {
        super(0);
        this.f93681p0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        OverscrollEffect overscrollEffect;
        ScrollingLogic value = this.f93681p0.getValue();
        return Boolean.valueOf(value.f3843d.isScrollInProgress() || value.f3846g.getValue().booleanValue() || ((overscrollEffect = value.f3845f) != null && overscrollEffect.isInProgress()));
    }
}
