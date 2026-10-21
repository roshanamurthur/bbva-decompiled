package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextIndent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextIndent;", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextIndentKt {
    @NotNull
    public static final TextIndent lerp(@NotNull TextIndent start, @NotNull TextIndent stop, float f6) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TextIndent(SpanStyleKt.m3933lerpTextUnitInheritableC3pnCVY(start.getFirstLine(), stop.getFirstLine(), f6), SpanStyleKt.m3933lerpTextUnitInheritableC3pnCVY(start.getRestLine(), stop.getRestLine(), f6), null);
    }
}
