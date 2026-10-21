package androidx.compose.ui.text.font;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FontSynthesis.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FontSynthesis_androidKt {
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    @NotNull
    /* JADX INFO: renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    public static final Object m4081synthesizeTypefaceFxwP2eA(int i10, @NotNull Object typeface, @NotNull Font font, @NotNull FontWeight requestedWeight, int i11) {
        boolean z10;
        android.graphics.Typeface typefaceCreate;
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(requestedWeight, "requestedWeight");
        if (!(typeface instanceof android.graphics.Typeface)) {
            return typeface;
        }
        boolean z11 = false;
        if (!FontSynthesis.m4074isWeightOnimpl$ui_text_release(i10) || Intrinsics.areEqual(font.getWeight(), requestedWeight)) {
            z10 = false;
        } else {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (requestedWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) < 0 || font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) >= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        boolean z12 = FontSynthesis.m4073isStyleOnimpl$ui_text_release(i10) && !FontStyle.m4062equalsimpl0(i11, font.getStyle());
        if (!z12 && !z10) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (z12 && FontStyle.m4062equalsimpl0(i11, FontStyle.INSTANCE.m4066getItalic_LCdwA())) {
                z11 = true;
            }
            typefaceCreate = android.graphics.Typeface.create((android.graphics.Typeface) typeface, AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z10, z11));
        } else {
            typefaceCreate = TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) typeface, z10 ? requestedWeight.getWeight() : font.getWeight().getWeight(), z12 ? FontStyle.m4062equalsimpl0(i11, FontStyle.INSTANCE.m4066getItalic_LCdwA()) : FontStyle.m4062equalsimpl0(font.getStyle(), FontStyle.INSTANCE.m4066getItalic_LCdwA()));
        }
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return typefaceCreate;
    }
}
