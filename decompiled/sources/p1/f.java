package p1;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.font.ResourceFont;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f92552a = new f();

    @DoNotInline
    @NotNull
    public final Typeface a(@NotNull Context context, @NotNull ResourceFont font) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        Typeface font2 = context.getResources().getFont(font.getResId());
        Intrinsics.checkNotNullExpressionValue(font2, "context.resources.getFont(font.resId)");
        return font2;
    }
}
