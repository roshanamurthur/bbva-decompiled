package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidGenericFontFamilyTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "This path for preloading loading fonts is not supported.")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "Landroidx/compose/ui/text/font/FontFamily;", "a", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/GenericFontFamily;", "<init>", "(Landroidx/compose/ui/text/font/GenericFontFamily;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GenericFontFamily f18184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Typeface f18185b;

    public AndroidGenericFontFamilyTypeface(@NotNull GenericFontFamily fontFamily) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        this.f18184a = fontFamily;
        Typeface typefaceCreate = Typeface.create(fontFamily.getName(), 0);
        Intrinsics.checkNotNull(typefaceCreate);
        this.f18185b = typefaceCreate;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.f18184a;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo4177getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int fontStyle, int synthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int i10 = Build.VERSION.SDK_INT;
        Typeface typeface = this.f18185b;
        Typeface typefaceCreate = i10 < 28 ? Typeface.create(typeface, AndroidFontUtils_androidKt.m4018getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle)) : TypefaceHelperMethodsApi28.INSTANCE.create(typeface, fontWeight.getWeight(), FontStyle.m4062equalsimpl0(fontStyle, FontStyle.INSTANCE.m4066getItalic_LCdwA()));
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "buildStyledTypeface(fontWeight, fontStyle)");
        return typefaceCreate;
    }
}
