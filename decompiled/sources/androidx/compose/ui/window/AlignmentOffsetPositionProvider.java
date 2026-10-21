package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Popup.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/Alignment;", "a", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "alignment", "b", "J", "getOffset-nOcc-ac", "()J", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,102:1\n86#2:103\n86#2:104\n79#2:105\n86#2:106\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n84#1:103\n87#1:104\n90#1:105\n97#1:106\n*E\n"})
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Alignment alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long offset;

    public AlignmentOffsetPositionProvider(Alignment alignment, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.alignment = alignment;
        this.offset = j10;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo601calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long jIntOffset = IntOffsetKt.IntOffset(0, 0);
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.INSTANCE;
        long jMo2184alignKFBX0sM = alignment.mo2184alignKFBX0sM(companion.m4554getZeroYbymL2g(), IntSizeKt.IntSize(anchorBounds.getWidth(), anchorBounds.getHeight()), layoutDirection);
        long jMo2184alignKFBX0sM2 = this.alignment.mo2184alignKFBX0sM(companion.m4554getZeroYbymL2g(), IntSizeKt.IntSize(IntSize.m4549getWidthimpl(popupContentSize), IntSize.m4548getHeightimpl(popupContentSize)), layoutDirection);
        long jIntOffset2 = IntOffsetKt.IntOffset(anchorBounds.getLeft(), anchorBounds.getTop());
        long jB = f.b(jIntOffset2, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(jIntOffset2) + IntOffset.m4507getXimpl(jIntOffset));
        long jB2 = f.b(jMo2184alignKFBX0sM, IntOffset.m4508getYimpl(jB), IntOffset.m4507getXimpl(jMo2184alignKFBX0sM) + IntOffset.m4507getXimpl(jB));
        long jIntOffset3 = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jMo2184alignKFBX0sM2), IntOffset.m4508getYimpl(jMo2184alignKFBX0sM2));
        long jIntOffset4 = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jB2) - IntOffset.m4507getXimpl(jIntOffset3), IntOffset.m4508getYimpl(jB2) - IntOffset.m4508getYimpl(jIntOffset3));
        long j10 = this.offset;
        long jIntOffset5 = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(j10) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), IntOffset.m4508getYimpl(j10));
        return f.b(jIntOffset5, IntOffset.m4508getYimpl(jIntOffset4), IntOffset.m4507getXimpl(jIntOffset5) + IntOffset.m4507getXimpl(jIntOffset4));
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }
}
