package o1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BoringLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    @JvmStatic
    @DoNotInline
    @NotNull
    public static final BoringLayout a(@NotNull CharSequence text, @NotNull TextPaint paint, int i10, @NotNull Layout.Alignment alignment, float f6, float f10, @NotNull BoringLayout.Metrics metrics, boolean z10, @Nullable TextUtils.TruncateAt truncateAt, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return new BoringLayout(text, paint, i10, alignment, f6, f10, metrics, z10, truncateAt, i11);
    }

    @JvmStatic
    @DoNotInline
    @Nullable
    public static final BoringLayout.Metrics b(@NotNull CharSequence text, @NotNull TextPaint paint, @NotNull TextDirectionHeuristic textDir) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        if (textDir.isRtl(text, 0, text.length())) {
            return null;
        }
        return BoringLayout.isBoring(text, paint, null);
    }
}
