package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ActualKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import i1.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "prev", "next", "", "actionForModifiers", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,858:1\n1162#2:859\n1#3:860\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n829#1:859\n*E\n"})
public final class NodeChainKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final NodeChainKt$SentinelHead$1 f16894a;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeChainKt$SentinelHead$1] */
    static {
        ?? r1 = new Modifier.Node() { // from class: androidx.compose.ui.node.NodeChainKt$SentinelHead$1
            @NotNull
            public String toString() {
                return "<Head>";
            }
        };
        r1.setAggregateChildKindSet$ui_release(-1);
        f16894a = r1;
    }

    public static final MutableVector access$fillVector(Modifier modifier, MutableVector mutableVector) {
        MutableVector mutableVector2 = new MutableVector(new Modifier[kotlin.ranges.c.coerceAtLeast(mutableVector.getSize(), 16)], 0);
        mutableVector2.add(modifier);
        while (mutableVector2.isNotEmpty()) {
            Modifier modifier2 = (Modifier) androidx.constraintlayout.core.parser.a.a(mutableVector2, 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner());
                mutableVector2.add(combinedModifier.getOuter());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                modifier2.all(new l(mutableVector));
            }
        }
        return mutableVector;
    }

    public static final void access$updateUnsafe(ModifierNodeElement modifierNodeElement, Modifier.Node node) {
        Intrinsics.checkNotNull(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement.update(node);
    }

    public static final int actionForModifiers(@NotNull Modifier.Element prev, @NotNull Modifier.Element next) {
        Intrinsics.checkNotNullParameter(prev, "prev");
        Intrinsics.checkNotNullParameter(next, "next");
        if (Intrinsics.areEqual(prev, next)) {
            return 2;
        }
        return (ActualKt.areObjectsOfSameType(prev, next) || ((prev instanceof ForceUpdateElement) && ActualKt.areObjectsOfSameType(((ForceUpdateElement) prev).f16771b, next))) ? 1 : 0;
    }
}
