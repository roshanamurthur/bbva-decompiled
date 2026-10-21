package i1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.node.BackwardsCompatNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier.Element f69476p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BackwardsCompatNode f69477q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Modifier.Element element, BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.f69476p0 = element;
        this.f69477q0 = backwardsCompatNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((DrawCacheModifier) this.f69476p0).onBuildCache(this.f69477q0);
        return Unit.INSTANCE;
    }
}
