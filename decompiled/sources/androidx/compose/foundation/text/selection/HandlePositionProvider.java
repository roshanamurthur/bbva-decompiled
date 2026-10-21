package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\tø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "handleReferencePoint", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(Landroidx/compose/foundation/text/selection/HandleReferencePoint;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class HandlePositionProvider implements PopupPositionProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HandleReferencePoint f6302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6303b;

    /* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            try {
                iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HandleReferencePoint.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HandleReferencePoint.TopMiddle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HandlePositionProvider(HandleReferencePoint handleReferencePoint, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(handleReferencePoint, "handleReferencePoint");
        this.f6302a = handleReferencePoint;
        this.f6303b = j10;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo601calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.f6302a.ordinal()];
        long j10 = this.f6303b;
        if (i10 == 1) {
            return androidx.databinding.f.b(j10, anchorBounds.getTop(), IntOffset.m4507getXimpl(j10) + anchorBounds.getLeft());
        }
        if (i10 == 2) {
            return androidx.databinding.f.b(j10, anchorBounds.getTop(), (IntOffset.m4507getXimpl(j10) + anchorBounds.getLeft()) - IntSize.m4549getWidthimpl(popupContentSize));
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return androidx.databinding.f.b(j10, anchorBounds.getTop(), (IntOffset.m4507getXimpl(j10) + anchorBounds.getLeft()) - (IntSize.m4549getWidthimpl(popupContentSize) / 2));
    }
}
