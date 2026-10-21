package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\u00020\u0001:\u0007\u0016\u0017\u0015\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H ¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0006\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/layout/Placeable;", "placeable", "beforeCrossAxisAlignmentLine", "align$foundation_layout_release", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I", "align", "calculateAlignmentLinePosition$foundation_layout_release", "(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;", "calculateAlignmentLinePosition", "", "isRelative$foundation_layout_release", "()Z", "isRelative", "<init>", "()V", "Companion", "a", "b", "c", "d", "e", "f", "Landroidx/compose/foundation/layout/CrossAxisAlignment$a;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$b;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$c;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$d;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$e;", "Landroidx/compose/foundation/layout/CrossAxisAlignment$f;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public abstract class CrossAxisAlignment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f4233a = b.f4237d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e f4234b = e.f4240d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c f4235c = c.f4238d;

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class a extends CrossAxisAlignment {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final AlignmentLineProvider f4236d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull AlignmentLineProvider alignmentLineProvider) {
            super(null);
            Intrinsics.checkNotNullParameter(alignmentLineProvider, "alignmentLineProvider");
            this.f4236d = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout_release(int i10, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int i11) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            int iCalculateAlignmentLinePosition = this.f4236d.calculateAlignmentLinePosition(placeable);
            if (iCalculateAlignmentLinePosition == Integer.MIN_VALUE) {
                return 0;
            }
            int i12 = i11 - iCalculateAlignmentLinePosition;
            return layoutDirection == LayoutDirection.Rtl ? i10 - i12 : i12;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        @NotNull
        public final Integer calculateAlignmentLinePosition$foundation_layout_release(@NotNull Placeable placeable) {
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            return Integer.valueOf(this.f4236d.calculateAlignmentLinePosition(placeable));
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final boolean isRelative$foundation_layout_release() {
            return true;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class b extends CrossAxisAlignment {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final b f4237d = new b(null);

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout_release(int i10, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int i11) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            return i10 / 2;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class c extends CrossAxisAlignment {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final c f4238d = new c(null);

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout_release(int i10, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int i11) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class d extends CrossAxisAlignment {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Alignment.Horizontal f4239d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull Alignment.Horizontal horizontal) {
            super(null);
            Intrinsics.checkNotNullParameter(horizontal, "horizontal");
            this.f4239d = horizontal;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout_release(int i10, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int i11) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            return this.f4239d.align(0, i10, layoutDirection);
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class e extends CrossAxisAlignment {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final e f4240d = new e(null);

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout_release(int i10, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int i11) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class f extends CrossAxisAlignment {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Alignment.Vertical f4241d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull Alignment.Vertical vertical) {
            super(null);
            Intrinsics.checkNotNullParameter(vertical, "vertical");
            this.f4241d = vertical;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public final int align$foundation_layout_release(int i10, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int i11) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            return this.f4241d.align(0, i10);
        }
    }

    public /* synthetic */ CrossAxisAlignment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int align$foundation_layout_release(int size, @NotNull LayoutDirection layoutDirection, @NotNull Placeable placeable, int beforeCrossAxisAlignmentLine);

    @Nullable
    public Integer calculateAlignmentLinePosition$foundation_layout_release(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "placeable");
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }

    public CrossAxisAlignment() {
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;", "", "()V", "Center", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "End", "getEnd$annotations", "getEnd", "Start", "getStart$annotations", "getStart", "AlignmentLine", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "Relative", "alignmentLineProvider", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "Relative$foundation_layout_release", "horizontal", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontal$foundation_layout_release", "vertical", "Landroidx/compose/ui/Alignment$Vertical;", "vertical$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CrossAxisAlignment AlignmentLine(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            return new a(new AlignmentLineProvider.Value(alignmentLine));
        }

        @NotNull
        public final CrossAxisAlignment Relative$foundation_layout_release(@NotNull AlignmentLineProvider alignmentLineProvider) {
            Intrinsics.checkNotNullParameter(alignmentLineProvider, "alignmentLineProvider");
            return new a(alignmentLineProvider);
        }

        @NotNull
        public final CrossAxisAlignment getCenter() {
            return CrossAxisAlignment.f4233a;
        }

        @NotNull
        public final CrossAxisAlignment getEnd() {
            return CrossAxisAlignment.f4235c;
        }

        @NotNull
        public final CrossAxisAlignment getStart() {
            return CrossAxisAlignment.f4234b;
        }

        @NotNull
        public final CrossAxisAlignment horizontal$foundation_layout_release(@NotNull Alignment.Horizontal horizontal) {
            Intrinsics.checkNotNullParameter(horizontal, "horizontal");
            return new d(horizontal);
        }

        @NotNull
        public final CrossAxisAlignment vertical$foundation_layout_release(@NotNull Alignment.Vertical vertical) {
            Intrinsics.checkNotNullParameter(vertical, "vertical");
            return new f(vertical);
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }
    }
}
