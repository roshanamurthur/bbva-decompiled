package b0;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function0<h> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Function4<PagerScope, Integer, Composer, Integer, Unit>> f24756p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Object> f24757q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0<Integer> f24758r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(State<? extends Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit>> state, Function1<? super Integer, ? extends Object> function1, Function0<Integer> function0) {
        super(0);
        this.f24756p0 = state;
        this.f24757q0 = function1;
        this.f24758r0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final h invoke() {
        return new h(this.f24758r0.invoke().intValue(), this.f24757q0, this.f24756p0.getValue());
    }
}
