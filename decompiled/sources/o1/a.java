package o1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.x;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BoringLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class a {
    @JvmStatic
    @DoNotInline
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence text, @NotNull TextPaint paint, int i10, @NotNull Layout.Alignment alignment, float f6, float f10, @NotNull BoringLayout.Metrics metrics, boolean z10, boolean z11, @Nullable TextUtils.TruncateAt truncateAt, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return x.a(text, paint, i10, alignment, f6, f10, metrics, z10, truncateAt, i11, z11);
    }

    @JvmStatic
    @DoNotInline
    @Nullable
    public static final BoringLayout.Metrics b(@NotNull CharSequence text, @NotNull TextPaint paint, @NotNull TextDirectionHeuristic textDir) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        return BoringLayout.isBoring(text, paint, textDir, true, null);
    }
}
