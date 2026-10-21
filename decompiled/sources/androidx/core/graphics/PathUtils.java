package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class PathUtils {

    @RequiresApi(26)
    public static class a {
        @DoNotInline
        public static float[] a(Path path, float f6) {
            return path.approximate(f6);
        }
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path) {
        return flatten(path, 0.5f);
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path, @FloatRange(from = 0.0d) float f6) {
        float[] fArrA = a.a(path, f6);
        int length = fArrA.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = i10 * 3;
            int i12 = (i10 - 1) * 3;
            float f10 = fArrA[i11];
            float f11 = fArrA[i11 + 1];
            float f12 = fArrA[i11 + 2];
            float f13 = fArrA[i12];
            float f14 = fArrA[i12 + 1];
            float f15 = fArrA[i12 + 2];
            if (f10 != f13 && (f11 != f14 || f12 != f15)) {
                arrayList.add(new PathSegment(new PointF(f14, f15), f13, new PointF(f11, f12), f10));
            }
        }
        return arrayList;
    }
}
