package s1;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Only used by deprecated APIs in this file, remove with them.")
@RequiresApi(26)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f93135a = new a();

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
