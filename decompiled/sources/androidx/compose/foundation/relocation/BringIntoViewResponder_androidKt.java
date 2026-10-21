package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BringIntoViewResponder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "defaultBringIntoViewParent", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class BringIntoViewResponder_androidKt {

    /* JADX INFO: compiled from: BringIntoViewResponder.android.kt */
    public static final class a implements BringIntoViewParent {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CompositionLocalConsumerModifierNode f5581p0;

        public a(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
            this.f5581p0 = compositionLocalConsumerModifierNode;
        }

        @Override // androidx.compose.foundation.relocation.BringIntoViewParent
        @Nullable
        public final Object bringChildIntoView(@NotNull LayoutCoordinates layoutCoordinates, @NotNull Function0<Rect> function0, @NotNull Continuation<? super Unit> continuation) {
            View view = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.f5581p0, AndroidCompositionLocals_androidKt.getLocalView());
            long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
            Rect rectInvoke = function0.invoke();
            Rect rectM2312translatek4lQ0M = rectInvoke != null ? rectInvoke.m2312translatek4lQ0M(jPositionInRoot) : null;
            if (rectM2312translatek4lQ0M != null) {
                view.requestRectangleOnScreen(BringIntoViewResponder_androidKt.access$toRect(rectM2312translatek4lQ0M), false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final android.graphics.Rect access$toRect(Rect rect) {
        return new android.graphics.Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    @NotNull
    public static final BringIntoViewParent defaultBringIntoViewParent(@NotNull CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        Intrinsics.checkNotNullParameter(compositionLocalConsumerModifierNode, "<this>");
        return new a(compositionLocalConsumerModifierNode);
    }
}
