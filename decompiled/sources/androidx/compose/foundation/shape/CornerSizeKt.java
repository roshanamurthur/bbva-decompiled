package androidx.compose.foundation.shape;

import androidx.compose.runtime.Stable;
import d0.a;
import d0.b;
import d0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CornerSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\t\u001a\u001d\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0007\u001a\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007\" \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "size", "Landroidx/compose/foundation/shape/CornerSize;", "CornerSize-0680j_4", "(F)Landroidx/compose/foundation/shape/CornerSize;", "CornerSize", "", "", "percent", "a", "Landroidx/compose/foundation/shape/CornerSize;", "getZeroCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getZeroCornerSize$annotations", "()V", "ZeroCornerSize", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class CornerSizeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CornerSizeKt$ZeroCornerSize$1 f5633a = new CornerSizeKt$ZeroCornerSize$1();

    @Stable
    @NotNull
    public static final CornerSize CornerSize(float f6) {
        return new c(f6);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final CornerSize m478CornerSize0680j_4(float f6) {
        return new a(f6);
    }

    @NotNull
    public static final CornerSize getZeroCornerSize() {
        return f5633a;
    }

    @Stable
    @NotNull
    public static final CornerSize CornerSize(int i10) {
        return new b(i10);
    }

    @Stable
    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }
}
