package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.VisibleForTesting;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o1.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PaintExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a$\u0010\u000b\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0001¨\u0006\f"}, d2 = {"Landroid/text/TextPaint;", "", "text", "", "startInclusive", "endExclusive", "Landroid/graphics/Rect;", "getCharSequenceBounds", "Landroid/graphics/Paint;", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "getStringBounds", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class PaintExtensionsKt {
    @NotNull
    public static final Rect getCharSequenceBounds(@NotNull TextPaint textPaint, @NotNull CharSequence text, int i10, int i11) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (SpannedExtensionsKt.hasSpan(spanned, MetricAffectingSpan.class, i10, i11)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] spans = (MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    Intrinsics.checkNotNullExpressionValue(spans, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : spans) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        e.a(textPaint2, text, i10, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(text.toString(), i10, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return getStringBounds(textPaint, text, i10, i11);
    }

    @VisibleForTesting
    @NotNull
    public static final Rect getStringBounds(@NotNull Paint paint, @NotNull CharSequence text, int i10, int i11) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            e.a(paint, text, i10, i11, rect);
        } else {
            paint.getTextBounds(text.toString(), i10, i11, rect);
        }
        return rect;
    }
}
