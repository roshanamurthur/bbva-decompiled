package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AndroidFont.TypefaceLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f18036a = new a();

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    @Nullable
    public final Object awaitLoad(@NotNull Context context, @NotNull AndroidFont androidFont, @NotNull Continuation<?> continuation) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    @Nullable
    public final android.graphics.Typeface loadBlocking(@NotNull Context context, @NotNull AndroidFont font) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        AndroidPreloadedFont androidPreloadedFont = font instanceof AndroidPreloadedFont ? (AndroidPreloadedFont) font : null;
        if (androidPreloadedFont != null) {
            return androidPreloadedFont.loadCached$ui_text_release(context);
        }
        return null;
    }
}
