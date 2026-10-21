package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.u;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.TempListUtilsKt;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformTypefaces.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a \u0010\u0007\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¨\u0006\r"}, d2 = {"PlatformTypefaces", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "getWeightSuffixForFallbackFamilyName", "", "name", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "setFontVariationSettings", "Landroid/graphics/Typeface;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PlatformTypefacesKt {
    @NotNull
    public static final PlatformTypefaces PlatformTypefaces() {
        return Build.VERSION.SDK_INT >= 28 ? new f() : new g();
    }

    @VisibleForTesting
    @NotNull
    public static final String getWeightSuffixForFallbackFamilyName(@NotNull String name, @NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return u.f(name, "-thin");
        }
        if (2 <= weight && weight < 4) {
            return u.f(name, "-light");
        }
        if (weight == 4) {
            return name;
        }
        if (weight == 5) {
            return u.f(name, "-medium");
        }
        return ((6 > weight || weight >= 8) && 8 <= weight && weight < 11) ? u.f(name, "-black") : name;
    }

    @ExperimentalTextApi
    @Nullable
    public static final android.graphics.Typeface setFontVariationSettings(@Nullable android.graphics.Typeface typeface, @NotNull FontVariation.Settings variationSettings, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 26) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal = j.f18045a;
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        if (typeface == null) {
            return null;
        }
        if (variationSettings.getSettings().isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal2 = j.f18045a;
        Paint paint = threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(TempListUtilsKt.fastJoinToString$default(variationSettings.getSettings(), null, null, null, 0, null, new i(AndroidDensity_androidKt.Density(context)), 31, null));
        return paint.getTypeface();
    }
}
