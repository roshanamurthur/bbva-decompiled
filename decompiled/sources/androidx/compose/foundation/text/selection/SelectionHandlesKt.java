package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u001d\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001d\u0010\r\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "position", "getAdjustedCoordinates-k-4lQ0M", "(J)J", "getAdjustedCoordinates", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getHandleWidth", "()F", "HandleWidth", "b", "getHandleHeight", "HandleHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "c", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getSelectionHandleInfoKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "SelectionHandleInfoKey", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,70:1\n154#2:71\n154#2:72\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/SelectionHandlesKt\n*L\n27#1:71\n28#1:72\n*E\n"})
public final class SelectionHandlesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f6342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f6343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final SemanticsPropertyKey<SelectionHandleInfo> f6344c = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, null);

    static {
        float f6 = 25;
        f6342a = Dp.m4389constructorimpl(f6);
        f6343b = Dp.m4389constructorimpl(f6);
    }

    /* JADX INFO: renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m616getAdjustedCoordinatesk4lQ0M(long j10) {
        return OffsetKt.Offset(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10) - 1.0f);
    }

    public static final float getHandleHeight() {
        return f6343b;
    }

    public static final float getHandleWidth() {
        return f6342a;
    }

    @NotNull
    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return f6344c;
    }
}
