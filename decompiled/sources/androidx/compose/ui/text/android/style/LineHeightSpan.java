package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LineHeightSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "", "text", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "spanstartVertical", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", "", "a", "F", "getLineHeight", "()F", "<init>", "(F)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class LineHeightSpan implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float lineHeight;

    public LineHeightSpan(float f6) {
        this.lineHeight = f6;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int start, int end, int spanstartVertical, int lineHeight, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        int iLineHeight = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        if (iLineHeight <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.lineHeight);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iLineHeight)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}
