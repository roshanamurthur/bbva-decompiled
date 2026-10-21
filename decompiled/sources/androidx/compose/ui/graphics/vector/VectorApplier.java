package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VectorCompose.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0014J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/graphics/vector/VNode;", "", FirebaseAnalytics.Param.INDEX, "instance", "", "insertTopDown", "insertBottomUp", "count", RemoveCommand.ID, "onClear", "from", TypedValues.TransitionType.S_TO, "move", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorApplier(@NotNull VNode root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
    }

    public static GroupComponent a(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, @NotNull VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        a(getCurrent()).move(from, to, count);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public void onClear() {
        GroupComponent groupComponentA = a(getRoot());
        groupComponentA.remove(0, groupComponentA.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        a(getCurrent()).remove(index, count);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, @NotNull VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        a(getCurrent()).insertAt(index, instance);
    }
}
