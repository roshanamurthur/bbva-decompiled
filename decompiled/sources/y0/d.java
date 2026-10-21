package y0;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CanvasUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f94717a = new d();

    @DoNotInline
    public final void a(@NotNull Canvas canvas, boolean z10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
