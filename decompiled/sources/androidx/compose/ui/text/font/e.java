package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements AndroidFont.TypefaceLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f18042a = new e();

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    @Nullable
    public final Object awaitLoad(@NotNull Context context, @NotNull AndroidFont androidFont, @NotNull Continuation<? super android.graphics.Typeface> continuation) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    @Nullable
    public final android.graphics.Typeface loadBlocking(@NotNull Context context, @NotNull AndroidFont font) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        b bVar = font instanceof b ? (b) font : null;
        if (bVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        return PlatformTypefacesKt.PlatformTypefaces().mo4086optionalOnDeviceFontFamilyByName78DK7lM(bVar.f18037d, bVar.f18038e, bVar.f18039f, bVar.getVariationSettings(), context);
    }
}
