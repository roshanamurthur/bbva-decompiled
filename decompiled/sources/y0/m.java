package y0;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;

/* JADX INFO: compiled from: PathMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m {
    public static /* synthetic */ boolean a(PathMeasure pathMeasure, float f6, float f10, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return pathMeasure.getSegment(f6, f10, path, z10);
    }
}
