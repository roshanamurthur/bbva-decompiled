package t;

import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<PinnableContainer> f93435p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ x f93436q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Ref.ObjectRef<PinnableContainer> objectRef, x xVar) {
        super(0);
        this.f93435p0 = objectRef;
        this.f93436q0 = xVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f93435p0.element = CompositionLocalConsumerModifierNodeKt.currentValueOf(this.f93436q0, PinnableContainerKt.getLocalPinnableContainer());
        return Unit.INSTANCE;
    }
}
