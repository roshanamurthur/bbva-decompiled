package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a!\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "modulate", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "TextDrawStyleKt")
public final class TextDrawStyleKt {
    public static final float access$takeOrElse(float f6, Function0 function0) {
        return Float.isNaN(f6) ? ((Number) function0.invoke()).floatValue() : f6;
    }

    @NotNull
    public static final TextForegroundStyle lerp(@NotNull TextForegroundStyle start, @NotNull TextForegroundStyle stop, float f6) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        boolean z10 = start instanceof u1.a;
        if (z10 || (stop instanceof u1.a)) {
            return (z10 && (stop instanceof u1.a)) ? TextForegroundStyle.INSTANCE.from((Brush) SpanStyleKt.lerpDiscrete(((u1.a) start).f93715a, ((u1.a) stop).f93715a, f6), MathHelpersKt.lerp(start.getAlpha(), stop.getAlpha(), f6)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(start, stop, f6);
        }
        return TextForegroundStyle.INSTANCE.m4316from8_81llA(ColorKt.m2558lerpjxsXWHM(start.mo4315getColor0d7_KjU(), stop.mo4315getColor0d7_KjU(), f6));
    }

    /* JADX INFO: renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m4314modulateDxMtmZc(long j10, float f6) {
        return (Float.isNaN(f6) || f6 >= 1.0f) ? j10 : Color.m2507copywmQWz5c$default(j10, Color.m2510getAlphaimpl(j10) * f6, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
