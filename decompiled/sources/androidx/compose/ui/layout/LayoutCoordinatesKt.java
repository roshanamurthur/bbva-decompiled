package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import dk.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Rect rectC;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectC = g1.d.c(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m4549getWidthimpl(layoutCoordinates.mo3581getSizeYbymL2g()), IntSize.m4548getHeightimpl(layoutCoordinates.mo3581getSizeYbymL2g())) : rectC;
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return g1.d.c(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        float fM4549getWidthimpl = IntSize.m4549getWidthimpl(layoutCoordinatesFindRootCoordinates.mo3581getSizeYbymL2g());
        float fM4548getHeightimpl = IntSize.m4548getHeightimpl(layoutCoordinatesFindRootCoordinates.mo3581getSizeYbymL2g());
        float fCoerceIn = kotlin.ranges.c.coerceIn(rectBoundsInRoot.getLeft(), 0.0f, fM4549getWidthimpl);
        float fCoerceIn2 = kotlin.ranges.c.coerceIn(rectBoundsInRoot.getTop(), 0.0f, fM4548getHeightimpl);
        float fCoerceIn3 = kotlin.ranges.c.coerceIn(rectBoundsInRoot.getRight(), 0.0f, fM4549getWidthimpl);
        float fCoerceIn4 = kotlin.ranges.c.coerceIn(rectBoundsInRoot.getBottom(), 0.0f, fM4548getHeightimpl);
        if (fCoerceIn == fCoerceIn3 || fCoerceIn2 == fCoerceIn4) {
            return Rect.INSTANCE.getZero();
        }
        long jMo3584localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo3584localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn, fCoerceIn2));
        long jMo3584localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo3584localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn3, fCoerceIn2));
        long jMo3584localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo3584localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn3, fCoerceIn4));
        long jMo3584localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo3584localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn, fCoerceIn4));
        return new Rect(f.minOf(Offset.m2275getXimpl(jMo3584localToWindowMKHz9U), Offset.m2275getXimpl(jMo3584localToWindowMKHz9U2), Offset.m2275getXimpl(jMo3584localToWindowMKHz9U4), Offset.m2275getXimpl(jMo3584localToWindowMKHz9U3)), f.minOf(Offset.m2276getYimpl(jMo3584localToWindowMKHz9U), Offset.m2276getYimpl(jMo3584localToWindowMKHz9U2), Offset.m2276getYimpl(jMo3584localToWindowMKHz9U4), Offset.m2276getYimpl(jMo3584localToWindowMKHz9U3)), f.maxOf(Offset.m2275getXimpl(jMo3584localToWindowMKHz9U), Offset.m2275getXimpl(jMo3584localToWindowMKHz9U2), Offset.m2275getXimpl(jMo3584localToWindowMKHz9U4), Offset.m2275getXimpl(jMo3584localToWindowMKHz9U3)), f.maxOf(Offset.m2276getYimpl(jMo3584localToWindowMKHz9U), Offset.m2276getYimpl(jMo3584localToWindowMKHz9U2), Offset.m2276getYimpl(jMo3584localToWindowMKHz9U4), Offset.m2276getYimpl(jMo3584localToWindowMKHz9U3)));
    }

    @NotNull
    public static final LayoutCoordinates findRootCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo3582localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m2291getZeroF1C5BW0()) : Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo3583localToRootMKHz9U(Offset.INSTANCE.m2291getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo3584localToWindowMKHz9U(Offset.INSTANCE.m2291getZeroF1C5BW0());
    }
}
