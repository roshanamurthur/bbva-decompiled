package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CornerRadius.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"CornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "x", "", "y", "(FF)J", "lerp", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp-3Ry4LBc", "(JJF)J", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n25#2,3:165\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:165,3\n*E\n"})
public final class CornerRadiusKt {
    @Stable
    public static final long CornerRadius(float f6, float f10) {
        return CornerRadius.m2244constructorimpl((((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f6) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f6, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = f6;
        }
        return CornerRadius(f6, f10);
    }

    @Stable
    /* JADX INFO: renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m2261lerp3Ry4LBc(long j10, long j11, float f6) {
        return CornerRadius(MathHelpersKt.lerp(CornerRadius.m2250getXimpl(j10), CornerRadius.m2250getXimpl(j11), f6), MathHelpersKt.lerp(CornerRadius.m2251getYimpl(j10), CornerRadius.m2251getYimpl(j11), f6));
    }
}
