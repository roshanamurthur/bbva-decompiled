package i1;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f69494p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f69495q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j10) {
        super(0);
        this.f69494p0 = layoutNodeLayoutDelegate;
        this.f69495q0 = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f69494p0.getOuterCoordinator().mo3575measureBRTryo0(this.f69495q0);
        return Unit.INSTANCE;
    }
}
