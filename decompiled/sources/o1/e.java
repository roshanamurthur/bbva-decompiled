package o1;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PaintExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class e {
    @JvmStatic
    @DoNotInline
    public static final void a(@NotNull Paint paint, @NotNull CharSequence text, int i10, int i11, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(text, i10, i11, rect);
    }
}
