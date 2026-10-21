package u;

import androidx.compose.foundation.gestures.ScrollConfig;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidScrollable.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n59#2,3:36\n62#2,2:43\n64#2:46\n33#3,4:39\n38#3:45\n154#4:47\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:36,3\n33#1:43,2\n33#1:46\n33#1:39,4\n33#1:45\n33#1:47\n*E\n"})
public final class a implements ScrollConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f93630a = new a();

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* JADX INFO: renamed from: calculateMouseWheelScroll-8xgXZGE */
    public final long mo217calculateMouseWheelScroll8xgXZGE(@NotNull Density calculateMouseWheelScroll, @NotNull PointerEvent event, long j10) {
        Intrinsics.checkNotNullParameter(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        Intrinsics.checkNotNullParameter(event, "event");
        List<PointerInputChange> changes = event.getChanges();
        Offset offsetM2264boximpl = Offset.m2264boximpl(Offset.INSTANCE.m2291getZeroF1C5BW0());
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            offsetM2264boximpl = Offset.m2264boximpl(Offset.m2280plusMKHz9U(offsetM2264boximpl.getF15533a(), changes.get(i10).getScrollDelta()));
        }
        return Offset.m2282timestuRUvjQ(offsetM2264boximpl.getF15533a(), -calculateMouseWheelScroll.mo415toPx0680j_4(Dp.m4389constructorimpl(64)));
    }
}
