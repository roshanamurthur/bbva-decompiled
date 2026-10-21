package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/graphics/Shadow;", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ShadowKt {
    @Stable
    @NotNull
    public static final Shadow lerp(@NotNull Shadow start, @NotNull Shadow stop, float f6) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new Shadow(ColorKt.m2558lerpjxsXWHM(start.getColor(), stop.getColor(), f6), OffsetKt.m2298lerpWko1d7g(start.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String(), stop.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String(), f6), MathHelpersKt.lerp(start.getBlurRadius(), stop.getBlurRadius(), f6), null);
    }
}
