package y0;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l {
    static {
        Path.Companion companion = Path.INSTANCE;
    }

    public static void a(Path path, @NotNull Rect rect, float f6, float f10, boolean z10) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        path.arcTo(rect, DegreesKt.degrees(f6), DegreesKt.degrees(f10), z10);
    }

    public static void b(Path path) {
        path.reset();
    }

    public static void c(Path path, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
    }

    public static /* synthetic */ void g(Path path, Path path2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        path.mo2407addPathUv8p0NA(path2, j10);
    }
}
