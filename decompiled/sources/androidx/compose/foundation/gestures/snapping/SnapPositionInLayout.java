package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapPositionInLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "", "position", "", "Landroidx/compose/ui/unit/Density;", "layoutSize", "itemSize", "itemIndex", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SnapPositionInLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f4080a;

    /* JADX INFO: compiled from: SnapPositionInLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout$Companion;", "", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "b", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getCenterToCenter", "()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "CenterToCenter", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f4080a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f4081b = a.f4082a;

        /* JADX INFO: compiled from: SnapPositionInLayout.kt */
        public static final class a implements SnapPositionInLayout {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f4082a = new a();

            @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
            public final int position(@NotNull Density SnapPositionInLayout, int i10, int i11, int i12) {
                Intrinsics.checkNotNullParameter(SnapPositionInLayout, "$this$SnapPositionInLayout");
                return (i10 / 2) - (i11 / 2);
            }
        }

        @NotNull
        public final SnapPositionInLayout getCenterToCenter() {
            return f4081b;
        }
    }

    int position(@NotNull Density density, int i10, int i11, int i12);
}
