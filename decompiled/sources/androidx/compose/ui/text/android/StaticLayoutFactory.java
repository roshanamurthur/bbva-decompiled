package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.androidtoolkit.utils.PluginUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o1.f;
import o1.o;
import o1.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%JØ\u0001\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u00042\b\b\u0003\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u0016\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0016¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "", "text", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "Landroid/text/StaticLayout;", "create", PluginUtils.IDENTIFIER_LAYOUT, "isFallbackLineSpacingEnabled", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class StaticLayoutFactory {

    @NotNull
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f17797a = new f();
    public static final int $stable = 8;

    @NotNull
    public final StaticLayout create(@NotNull CharSequence text, int start, int end, @NotNull TextPaint paint, int width, @NotNull TextDirectionHeuristic textDir, @NotNull Layout.Alignment alignment, @IntRange(from = 0) int maxLines, @Nullable TextUtils.TruncateAt ellipsize, @IntRange(from = 0) int ellipsizedWidth, @FloatRange(from = 0.0d) float lineSpacingMultiplier, float lineSpacingExtra, int justificationMode, boolean includePadding, boolean useFallbackLineSpacing, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, int hyphenationFrequency, @Nullable int[] leftIndents, @Nullable int[] rightIndents) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return f17797a.a(new q(text, start, end, paint, width, textDir, alignment, maxLines, ellipsize, ellipsizedWidth, lineSpacingMultiplier, lineSpacingExtra, justificationMode, includePadding, useFallbackLineSpacing, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphenationFrequency, leftIndents, rightIndents));
    }

    public final boolean isFallbackLineSpacingEnabled(@NotNull StaticLayout layout, boolean useFallbackLineSpacing) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        f17797a.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return o.a(layout);
        }
        if (i10 >= 28) {
            return useFallbackLineSpacing;
        }
        return false;
    }
}
