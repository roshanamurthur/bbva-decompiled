package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformTypefaces.kt */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class g implements PlatformTypefaces {
    public static android.graphics.Typeface a(String str, FontWeight fontWeight, int i10) {
        if (FontStyle.m4062equalsimpl0(i10, FontStyle.INSTANCE.m4067getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.INSTANCE.getNormal()) && (str == null || str.length() == 0)) {
            android.graphics.Typeface DEFAULT = android.graphics.Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        int iM4018getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m4018getAndroidTypefaceStyleFO1MlWM(fontWeight, i10);
        if (str == null || str.length() == 0) {
            android.graphics.Typeface typefaceDefaultFromStyle = android.graphics.Typeface.defaultFromStyle(iM4018getAndroidTypefaceStyleFO1MlWM);
            Intrinsics.checkNotNullExpressionValue(typefaceDefaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return typefaceDefaultFromStyle;
        }
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(str, iM4018getAndroidTypefaceStyleFO1MlWM);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "{\n            Typeface.c…y, targetStyle)\n        }");
        return typefaceCreate;
    }

    public static android.graphics.Typeface b(String str, FontWeight fontWeight, int i10) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceA = a(str, fontWeight, i10);
        if (Intrinsics.areEqual(typefaceA, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m4018getAndroidTypefaceStyleFO1MlWM(fontWeight, i10))) || Intrinsics.areEqual(typefaceA, a(null, fontWeight, i10))) {
            return null;
        }
        return typefaceA;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @NotNull
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public final android.graphics.Typeface mo4084createDefaultFO1MlWM(@NotNull FontWeight fontWeight, int i10) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return a(null, fontWeight, i10);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @NotNull
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public final android.graphics.Typeface mo4085createNamedRetOiIg(@NotNull GenericFontFamily name, @NotNull FontWeight fontWeight, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        android.graphics.Typeface typefaceB = b(PlatformTypefacesKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, i10);
        return typefaceB == null ? a(name.getName(), fontWeight, i10) : typefaceB;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    @Nullable
    /* JADX INFO: renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public final android.graphics.Typeface mo4086optionalOnDeviceFontFamilyByName78DK7lM(@NotNull String familyName, @NotNull FontWeight weight, int i10, @NotNull FontVariation.Settings variationSettings, @NotNull Context context) {
        android.graphics.Typeface typefaceMo4085createNamedRetOiIg;
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        FontFamily.Companion companion = FontFamily.INSTANCE;
        if (Intrinsics.areEqual(familyName, companion.getSansSerif().getName())) {
            typefaceMo4085createNamedRetOiIg = mo4085createNamedRetOiIg(companion.getSansSerif(), weight, i10);
        } else if (Intrinsics.areEqual(familyName, companion.getSerif().getName())) {
            typefaceMo4085createNamedRetOiIg = mo4085createNamedRetOiIg(companion.getSerif(), weight, i10);
        } else if (Intrinsics.areEqual(familyName, companion.getMonospace().getName())) {
            typefaceMo4085createNamedRetOiIg = mo4085createNamedRetOiIg(companion.getMonospace(), weight, i10);
        } else {
            typefaceMo4085createNamedRetOiIg = Intrinsics.areEqual(familyName, companion.getCursive().getName()) ? mo4085createNamedRetOiIg(companion.getCursive(), weight, i10) : b(familyName, weight, i10);
        }
        return PlatformTypefacesKt.setFontVariationSettings(typefaceMo4085createNamedRetOiIg, variationSettings, context);
    }
}
