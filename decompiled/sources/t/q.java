package t;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@SourceDebugExtension({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1182#2:177\n1161#2,2:178\n138#3:180\n728#3,2:182\n1#4:181\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n*L\n131#1:177\n131#1:178,2\n132#1:180\n137#1:182,2\n*E\n"})
public final class q extends Modifier.Node implements GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {

    @Nullable
    public Function1<? super LayoutCoordinates, Rect> H0;

    @Nullable
    public android.graphics.Rect I0;

    public q() {
        throw null;
    }

    public final void a(@Nullable android.graphics.Rect rect) {
        MutableVector mutableVector = new MutableVector(new android.graphics.Rect[16], 0);
        List systemGestureExclusionRects = ((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView())).getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        android.graphics.Rect rect2 = this.I0;
        if (rect2 != null) {
            mutableVector.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            mutableVector.add(rect);
        }
        ((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView())).setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.I0 = rect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        super.onDetach();
        a(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        android.graphics.Rect rect;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Function1<? super LayoutCoordinates, Rect> function1 = this.H0;
        if (function1 == null) {
            Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(coordinates);
            rect = new android.graphics.Rect(mk.c.roundToInt(rectBoundsInRoot.getLeft()), mk.c.roundToInt(rectBoundsInRoot.getTop()), mk.c.roundToInt(rectBoundsInRoot.getRight()), mk.c.roundToInt(rectBoundsInRoot.getBottom()));
        } else {
            Intrinsics.checkNotNull(function1);
            Rect rectInvoke = function1.invoke(coordinates);
            LayoutCoordinates layoutCoordinates = coordinates;
            for (LayoutCoordinates parentLayoutCoordinates = coordinates.getParentLayoutCoordinates(); parentLayoutCoordinates != null; parentLayoutCoordinates = parentLayoutCoordinates.getParentLayoutCoordinates()) {
                layoutCoordinates = parentLayoutCoordinates;
            }
            long jMo3582localPositionOfR5De75A = layoutCoordinates.mo3582localPositionOfR5De75A(coordinates, rectInvoke.m2310getTopLeftF1C5BW0());
            long jMo3582localPositionOfR5De75A2 = layoutCoordinates.mo3582localPositionOfR5De75A(coordinates, rectInvoke.m2311getTopRightF1C5BW0());
            long jMo3582localPositionOfR5De75A3 = layoutCoordinates.mo3582localPositionOfR5De75A(coordinates, rectInvoke.m2303getBottomLeftF1C5BW0());
            long jMo3582localPositionOfR5De75A4 = layoutCoordinates.mo3582localPositionOfR5De75A(coordinates, rectInvoke.m2304getBottomRightF1C5BW0());
            rect = new android.graphics.Rect(mk.c.roundToInt(dk.f.minOf(Offset.m2275getXimpl(jMo3582localPositionOfR5De75A), Offset.m2275getXimpl(jMo3582localPositionOfR5De75A2), Offset.m2275getXimpl(jMo3582localPositionOfR5De75A3), Offset.m2275getXimpl(jMo3582localPositionOfR5De75A4))), mk.c.roundToInt(dk.f.minOf(Offset.m2276getYimpl(jMo3582localPositionOfR5De75A), Offset.m2276getYimpl(jMo3582localPositionOfR5De75A2), Offset.m2276getYimpl(jMo3582localPositionOfR5De75A3), Offset.m2276getYimpl(jMo3582localPositionOfR5De75A4))), mk.c.roundToInt(dk.f.maxOf(Offset.m2275getXimpl(jMo3582localPositionOfR5De75A), Offset.m2275getXimpl(jMo3582localPositionOfR5De75A2), Offset.m2275getXimpl(jMo3582localPositionOfR5De75A3), Offset.m2275getXimpl(jMo3582localPositionOfR5De75A4))), mk.c.roundToInt(dk.f.maxOf(Offset.m2276getYimpl(jMo3582localPositionOfR5De75A), Offset.m2276getYimpl(jMo3582localPositionOfR5De75A2), Offset.m2276getYimpl(jMo3582localPositionOfR5De75A3), Offset.m2276getYimpl(jMo3582localPositionOfR5De75A4))));
        }
        a(rect);
    }
}
