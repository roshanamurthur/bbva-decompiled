package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SelectionMode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "Landroidx/compose/ui/geometry/Offset;", "position", "Landroidx/compose/ui/geometry/Rect;", "bounds", "", "compare-3MmeM6k$foundation_release", "(JLandroidx/compose/ui/geometry/Rect;)I", "compare", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "isSelected-2x9bVx0$foundation_release", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "isSelected", "Vertical", "Horizontal", "foundation_release"}, k = 1, mv = {1, 8, 0})
public abstract class SelectionMode {
    private static final /* synthetic */ SelectionMode[] $VALUES;
    public static final SelectionMode Horizontal;
    public static final SelectionMode Vertical;

    /* JADX INFO: compiled from: SelectionMode.kt */
    public static final class a extends SelectionMode {
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public final int mo635compare3MmeM6k$foundation_release(long j10, @NotNull Rect bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            if (bounds.m2301containsk4lQ0M(j10)) {
                return 0;
            }
            if (Offset.m2275getXimpl(j10) < bounds.getLeft()) {
                return -1;
            }
            return (Offset.m2276getYimpl(j10) >= bounds.getTop() || Offset.m2275getXimpl(j10) >= bounds.getRight()) ? 1 : -1;
        }
    }

    /* JADX INFO: compiled from: SelectionMode.kt */
    public static final class b extends SelectionMode {
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public final int mo635compare3MmeM6k$foundation_release(long j10, @NotNull Rect bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            if (bounds.m2301containsk4lQ0M(j10)) {
                return 0;
            }
            if (Offset.m2276getYimpl(j10) < bounds.getTop()) {
                return -1;
            }
            return (Offset.m2275getXimpl(j10) >= bounds.getLeft() || Offset.m2276getYimpl(j10) >= bounds.getBottom()) ? 1 : -1;
        }
    }

    static {
        b bVar = new b("Vertical", 0, null);
        Vertical = bVar;
        a aVar = new a("Horizontal", 1, null);
        Horizontal = aVar;
        $VALUES = new SelectionMode[]{bVar, aVar};
    }

    public SelectionMode() {
        throw null;
    }

    public SelectionMode(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i10);
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo635compare3MmeM6k$foundation_release(long position, @NotNull Rect bounds);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m636isSelected2x9bVx0$foundation_release(@NotNull Rect bounds, long start, long end) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.m2301containsk4lQ0M(start) || bounds.m2301containsk4lQ0M(end)) {
            return true;
        }
        return (mo635compare3MmeM6k$foundation_release(start, bounds) > 0) ^ (mo635compare3MmeM6k$foundation_release(end, bounds) > 0);
    }
}
