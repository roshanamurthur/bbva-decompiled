package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f17395p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f17396q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Lifecycle lifecycle, e1 e1Var) {
        super(0);
        this.f17395p0 = lifecycle;
        this.f17396q0 = e1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f17395p0.removeObserver(this.f17396q0);
        return Unit.INSTANCE;
    }
}
