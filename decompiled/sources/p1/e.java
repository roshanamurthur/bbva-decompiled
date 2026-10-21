package p1;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.PlatformResolveInterceptor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    @NotNull
    public static FontWeight d(PlatformResolveInterceptor platformResolveInterceptor, @NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return fontWeight;
    }

    @Nullable
    public static FontFamily a(PlatformResolveInterceptor platformResolveInterceptor, @Nullable FontFamily fontFamily) {
        return fontFamily;
    }

    public static int b(PlatformResolveInterceptor platformResolveInterceptor, int i10) {
        return i10;
    }

    public static int c(PlatformResolveInterceptor platformResolveInterceptor, int i10) {
        return i10;
    }
}
