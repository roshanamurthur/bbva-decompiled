package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(30)
public interface SideCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Companion f4358a = Companion.f4359a;

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "side", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator-ni1skBw", "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "chooseCalculator", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f4359a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SideCalculator$Companion$LeftSideCalculator$1 f4360b = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int newValue) {
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(newValue, oldInsets.top, oldInsets.right, oldInsets.bottom);
                Intrinsics.checkNotNullExpressionValue(insetsOf, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo316consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m2275getXimpl(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo317consumedVelocityQWom1Mo(long available, float remaining) {
                return VelocityKt.Velocity(Velocity.m4614getXimpl(available) - remaining, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float hideMotion(float f6, float f10) {
                return kotlin.ranges.c.coerceAtMost(motionOf(f6, f10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float showMotion(float f6, float f10) {
                return kotlin.ranges.c.coerceAtLeast(motionOf(f6, f10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x4, float y7) {
                return x4;
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final SideCalculator$Companion$TopSideCalculator$1 f4361c = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int newValue) {
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, newValue, oldInsets.right, oldInsets.bottom);
                Intrinsics.checkNotNullExpressionValue(insetsOf, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo316consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m2276getYimpl(available));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo317consumedVelocityQWom1Mo(long available, float remaining) {
                return VelocityKt.Velocity(0.0f, Velocity.m4615getYimpl(available) - remaining);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float hideMotion(float f6, float f10) {
                return kotlin.ranges.c.coerceAtMost(motionOf(f6, f10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float showMotion(float f6, float f10) {
                return kotlin.ranges.c.coerceAtLeast(motionOf(f6, f10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x4, float y7) {
                return y7;
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final SideCalculator$Companion$RightSideCalculator$1 f4362d = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int newValue) {
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, oldInsets.top, newValue, oldInsets.bottom);
                Intrinsics.checkNotNullExpressionValue(insetsOf, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo316consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m2275getXimpl(available), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo317consumedVelocityQWom1Mo(long available, float remaining) {
                return VelocityKt.Velocity(Velocity.m4614getXimpl(available) + remaining, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float hideMotion(float f6, float f10) {
                return kotlin.ranges.c.coerceAtMost(motionOf(f6, f10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x4, float y7) {
                return -x4;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float showMotion(float f6, float f10) {
                return kotlin.ranges.c.coerceAtLeast(motionOf(f6, f10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                return insets.right;
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final SideCalculator$Companion$BottomSideCalculator$1 f4363e = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @NotNull
            public Insets adjustInsets(@NotNull Insets oldInsets, int newValue) {
                Intrinsics.checkNotNullParameter(oldInsets, "oldInsets");
                Insets insetsOf = Insets.of(oldInsets.left, oldInsets.top, oldInsets.right, newValue);
                Intrinsics.checkNotNullExpressionValue(insetsOf, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return insetsOf;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo316consumedOffsetsMKHz9U(long available) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m2276getYimpl(available));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo317consumedVelocityQWom1Mo(long available, float remaining) {
                return VelocityKt.Velocity(0.0f, Velocity.m4615getYimpl(available) + remaining);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float hideMotion(float f6, float f10) {
                return kotlin.ranges.c.coerceAtMost(motionOf(f6, f10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float x4, float y7) {
                return -y7;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float showMotion(float f6, float f10) {
                return kotlin.ranges.c.coerceAtLeast(motionOf(f6, f10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@NotNull Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                return insets.bottom;
            }
        };

        @NotNull
        /* JADX INFO: renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m318chooseCalculatorni1skBw(int side, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
            boolean zM349equalsimpl0 = WindowInsetsSides.m349equalsimpl0(side, companion.m362getLeftJoeWqyM());
            SideCalculator$Companion$LeftSideCalculator$1 sideCalculator$Companion$LeftSideCalculator$1 = f4360b;
            if (zM349equalsimpl0) {
                return sideCalculator$Companion$LeftSideCalculator$1;
            }
            if (WindowInsetsSides.m349equalsimpl0(side, companion.m365getTopJoeWqyM())) {
                return f4361c;
            }
            boolean zM349equalsimpl1 = WindowInsetsSides.m349equalsimpl0(side, companion.m363getRightJoeWqyM());
            SideCalculator$Companion$RightSideCalculator$1 sideCalculator$Companion$RightSideCalculator$1 = f4362d;
            if (!zM349equalsimpl1) {
                if (WindowInsetsSides.m349equalsimpl0(side, companion.m359getBottomJoeWqyM())) {
                    return f4363e;
                }
                if (WindowInsetsSides.m349equalsimpl0(side, companion.m364getStartJoeWqyM())) {
                    if (layoutDirection == LayoutDirection.Ltr) {
                        return sideCalculator$Companion$LeftSideCalculator$1;
                    }
                } else {
                    if (!WindowInsetsSides.m349equalsimpl0(side, companion.m360getEndJoeWqyM())) {
                        throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
                    }
                    if (layoutDirection != LayoutDirection.Ltr) {
                        return sideCalculator$Companion$LeftSideCalculator$1;
                    }
                }
            }
            return sideCalculator$Companion$RightSideCalculator$1;
        }
    }

    @NotNull
    Insets adjustInsets(@NotNull Insets insets, int i10);

    /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo316consumedOffsetsMKHz9U(long j10);

    /* JADX INFO: renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo317consumedVelocityQWom1Mo(long j10, float f6);

    float hideMotion(float f6, float f10);

    float motionOf(float f6, float f10);

    float showMotion(float f6, float f10);

    int valueOf(@NotNull Insets insets);
}
