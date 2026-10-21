package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidFontResourceLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @ReplaceWith(expression = "PlatformFontLoader", imports = {}))
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "load", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidFontResourceLoader implements Font.ResourceLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f17114a;

    public AndroidFontResourceLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17114a = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    public Typeface load(@NotNull Font font) {
        Intrinsics.checkNotNullParameter(font, "font");
        if (!(font instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f17114a;
        if (i10 >= 26) {
            return h0.f17406a.a(context, ((ResourceFont) font).getResId());
        }
        Typeface font2 = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
        Intrinsics.checkNotNull(font2);
        Intrinsics.checkNotNullExpressionValue(font2, "{\n                    Re…esId)!!\n                }");
        return font2;
    }
}
