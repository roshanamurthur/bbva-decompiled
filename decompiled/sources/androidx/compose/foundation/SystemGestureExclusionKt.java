package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u001e\u0010\u0001\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "systemGestureExclusion", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "exclusion", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,176:1\n69#1:177\n69#1:178\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n45#1:177\n62#1:178\n*E\n"})
public final class SystemGestureExclusionKt {
    @NotNull
    public static final Modifier systemGestureExclusion(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(null));
    }

    @NotNull
    public static final Modifier systemGestureExclusion(@NotNull Modifier modifier, @NotNull Function1<? super LayoutCoordinates, Rect> exclusion) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(exclusion, "exclusion");
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(exclusion));
    }
}
