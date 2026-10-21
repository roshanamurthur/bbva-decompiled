package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.databinding.f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b9\u0010:J\u001d\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0005J%\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J%\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002R\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001d\u0010-\u001a\u00020*8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c0.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00106\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u00107\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "Landroidx/compose/ui/node/LookaheadDelegate;", "p0", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,148:1\n1#2:149\n179#3:150\n157#3:153\n179#3:155\n157#3:158\n86#4:151\n79#4:152\n86#4:154\n86#4:156\n79#4:157\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n*L\n97#1:150\n98#1:153\n103#1:155\n109#1:158\n97#1:151\n97#1:152\n102#1:154\n105#1:156\n102#1:157\n*E\n"})
public final class LookaheadLayoutCoordinatesImpl implements LookaheadLayoutCoordinates {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinatesImpl(@NotNull LookaheadDelegate lookaheadDelegate) {
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final long a() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m2279minusMKHz9U(mo3582localPositionOfR5De75A(coordinates, companion.m2291getZeroF1C5BW0()), getCoordinator().mo3582localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m2291getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return this.lookaheadDelegate.get(alignmentLine);
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @NotNull
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
        }
        NodeCoordinator wrappedBy = getCoordinator().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
        }
        NodeCoordinator wrappedBy = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo3581getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        return getCoordinator().localBoundingBoxOf(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo3582localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        boolean z10 = sourceCoordinates instanceof LookaheadLayoutCoordinatesImpl;
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        if (!z10) {
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            return Offset.m2280plusMKHz9U(mo3582localPositionOfR5De75A(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), relativeToSource), rootLookaheadDelegate.getCoordinator().getCoordinates().mo3582localPositionOfR5De75A(sourceCoordinates, Offset.INSTANCE.m2291getZeroF1C5BW0()));
        }
        LookaheadDelegate lookaheadDelegate2 = ((LookaheadLayoutCoordinatesImpl) sourceCoordinates).lookaheadDelegate;
        lookaheadDelegate2.getCoordinator().onCoordinatesUsed$ui_release();
        LookaheadDelegate lookaheadDelegate3 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate2.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate3 != null) {
            long jM3692positionInBjo55l4$ui_release = lookaheadDelegate2.m3692positionInBjo55l4$ui_release(lookaheadDelegate3);
            long jIntOffset = IntOffsetKt.IntOffset(mk.c.roundToInt(Offset.m2275getXimpl(relativeToSource)), mk.c.roundToInt(Offset.m2276getYimpl(relativeToSource)));
            long jB = f.b(jIntOffset, IntOffset.m4508getYimpl(jM3692positionInBjo55l4$ui_release), IntOffset.m4507getXimpl(jIntOffset) + IntOffset.m4507getXimpl(jM3692positionInBjo55l4$ui_release));
            long jM3692positionInBjo55l4$ui_release2 = lookaheadDelegate.m3692positionInBjo55l4$ui_release(lookaheadDelegate3);
            long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jB) - IntOffset.m4507getXimpl(jM3692positionInBjo55l4$ui_release2), IntOffset.m4508getYimpl(jB) - IntOffset.m4508getYimpl(jM3692positionInBjo55l4$ui_release2));
            return OffsetKt.Offset(IntOffset.m4507getXimpl(jIntOffset2), IntOffset.m4508getYimpl(jIntOffset2));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate2);
        long jM3692positionInBjo55l4$ui_release3 = lookaheadDelegate2.m3692positionInBjo55l4$ui_release(rootLookaheadDelegate2);
        long position = rootLookaheadDelegate2.getPosition();
        long jB2 = f.b(position, IntOffset.m4508getYimpl(jM3692positionInBjo55l4$ui_release3), IntOffset.m4507getXimpl(position) + IntOffset.m4507getXimpl(jM3692positionInBjo55l4$ui_release3));
        long jIntOffset3 = IntOffsetKt.IntOffset(mk.c.roundToInt(Offset.m2275getXimpl(relativeToSource)), mk.c.roundToInt(Offset.m2276getYimpl(relativeToSource)));
        long jB3 = f.b(jIntOffset3, IntOffset.m4508getYimpl(jB2), IntOffset.m4507getXimpl(jIntOffset3) + IntOffset.m4507getXimpl(jB2));
        long jM3692positionInBjo55l4$ui_release4 = lookaheadDelegate.m3692positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate));
        long position2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate).getPosition();
        long jB4 = f.b(position2, IntOffset.m4508getYimpl(jM3692positionInBjo55l4$ui_release4), IntOffset.m4507getXimpl(position2) + IntOffset.m4507getXimpl(jM3692positionInBjo55l4$ui_release4));
        long jIntOffset4 = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jB3) - IntOffset.m4507getXimpl(jB4), IntOffset.m4508getYimpl(jB3) - IntOffset.m4508getYimpl(jB4));
        NodeCoordinator wrappedBy = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate).getCoordinator().getWrappedBy();
        Intrinsics.checkNotNull(wrappedBy);
        NodeCoordinator wrappedBy2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy();
        Intrinsics.checkNotNull(wrappedBy2);
        return wrappedBy.mo3582localPositionOfR5De75A(wrappedBy2, OffsetKt.Offset(IntOffset.m4507getXimpl(jIntOffset4), IntOffset.m4508getYimpl(jIntOffset4)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo3583localToRootMKHz9U(long relativeToLocal) {
        return getCoordinator().mo3583localToRootMKHz9U(Offset.m2280plusMKHz9U(relativeToLocal, a()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo3584localToWindowMKHz9U(long relativeToLocal) {
        return getCoordinator().mo3584localToWindowMKHz9U(Offset.m2280plusMKHz9U(relativeToLocal, a()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo3585transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        getCoordinator().mo3585transformFromEL8BTi8(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo3586windowToLocalMKHz9U(long relativeToWindow) {
        return Offset.m2280plusMKHz9U(getCoordinator().mo3586windowToLocalMKHz9U(relativeToWindow), a());
    }
}
