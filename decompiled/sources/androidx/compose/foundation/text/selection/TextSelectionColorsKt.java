package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextSelectionColors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextSelectionColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextSelectionColors", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TextSelectionColorsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<TextSelectionColors> f6448a = CompositionLocalKt.compositionLocalOf$default(null, a.f6450p0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final TextSelectionColors f6449b;

    /* JADX INFO: compiled from: TextSelectionColors.kt */
    public static final class a extends Lambda implements Function0<TextSelectionColors> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6450p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final TextSelectionColors invoke() {
            return TextSelectionColorsKt.f6449b;
        }
    }

    static {
        long jColor = ColorKt.Color(4282550004L);
        f6449b = new TextSelectionColors(jColor, Color.m2507copywmQWz5c$default(jColor, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextSelectionColors> getLocalTextSelectionColors() {
        return f6448a;
    }
}
