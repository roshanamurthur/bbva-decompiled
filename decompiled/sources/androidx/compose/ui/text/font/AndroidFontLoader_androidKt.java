package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidFontLoader_androidKt {
    public static final android.graphics.Typeface access$load(ResourceFont resourceFont, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p1.f.f92552a.a(context, resourceFont);
        }
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        Intrinsics.checkNotNull(font);
        Intrinsics.checkNotNullExpressionValue(font, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return font;
    }
}
