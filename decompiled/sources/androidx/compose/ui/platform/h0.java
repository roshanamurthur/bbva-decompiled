package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidFontResourceLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h0 f17406a = new h0();

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final Typeface a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Typeface font = context.getResources().getFont(i10);
        Intrinsics.checkNotNullExpressionValue(font, "context.resources.getFont(resourceId)");
        return font;
    }
}
