package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObserverModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/ObserverModifierNode;", "p0", "Landroidx/compose/ui/node/ObserverModifierNode;", "getObserverNode$ui_release", "()Landroidx/compose/ui/node/ObserverModifierNode;", "observerNode", "", "isValidOwnerScope", "()Z", "<init>", "(Landroidx/compose/ui/node/ObserverModifierNode;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class ObserverNodeOwnerScope implements OwnerScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final a f16915q0 = a.f16917p0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ObserverModifierNode observerNode;

    /* JADX INFO: compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;", "", "()V", "OnObserveReadsChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "", "getOnObserveReadsChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<ObserverNodeOwnerScope, Unit> getOnObserveReadsChanged$ui_release() {
            return ObserverNodeOwnerScope.f16915q0;
        }
    }

    /* JADX INFO: compiled from: ObserverModifierNode.kt */
    public static final class a extends Lambda implements Function1<ObserverNodeOwnerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16917p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            ObserverNodeOwnerScope it = observerNodeOwnerScope;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isValidOwnerScope()) {
                it.getObserverNode().onObservedReadsChanged();
            }
            return Unit.INSTANCE;
        }
    }

    public ObserverNodeOwnerScope(@NotNull ObserverModifierNode observerNode) {
        Intrinsics.checkNotNullParameter(observerNode, "observerNode");
        this.observerNode = observerNode;
    }

    @NotNull
    /* JADX INFO: renamed from: getObserverNode$ui_release, reason: from getter */
    public final ObserverModifierNode getObserverNode() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().getIsAttached();
    }
}
