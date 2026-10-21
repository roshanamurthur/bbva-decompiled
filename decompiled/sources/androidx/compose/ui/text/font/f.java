package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformTypefaces.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@VisibleForTesting
public final class f implements PlatformTypefaces {
    public static android.graphics.Typeface a(String str, FontWeight fontWeight, int i10) {
        FontStyle.Companion companion = FontStyle.INSTANCE;
        if (FontStyle.m4062equalsimpl0(i10, companion.m4067getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.INSTANCE.getNormal()) && (str == null || str.length() == 0)) {
            android.graphics.Typeface DEFAULT = android.graphics.Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), fontWeight.getWeight(), FontStyle.m4062equalsimpl0(i10, companion.m4066getItalic_LCdwA()));
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate;
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
        return a(name.getName(), fontWeight, i10);
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
        } else if (Intrinsics.areEqual(familyName, companion.getCursive().getName())) {
            typefaceMo4085createNamedRetOiIg = mo4085createNamedRetOiIg(companion.getCursive(), weight, i10);
        } else {
            android.graphics.Typeface typeface = null;
            if (familyName.length() != 0) {
                android.graphics.Typeface typefaceA = a(familyName, weight, i10);
                boolean zM4062equalsimpl0 = FontStyle.m4062equalsimpl0(i10, FontStyle.INSTANCE.m4066getItalic_LCdwA());
                TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = TypefaceHelperMethodsApi28.INSTANCE;
                android.graphics.Typeface DEFAULT = android.graphics.Typeface.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                if (!Intrinsics.areEqual(typefaceA, typefaceHelperMethodsApi28.create(DEFAULT, weight.getWeight(), zM4062equalsimpl0)) && !Intrinsics.areEqual(typefaceA, a(null, weight, i10))) {
                    typeface = typefaceA;
                }
            }
            typefaceMo4085createNamedRetOiIg = typeface;
        }
        return PlatformTypefacesKt.setFontVariationSettings(typefaceMo4085createNamedRetOiIg, variationSettings, context);
    }
}
