package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/DelegatingFontLoaderForBridgeUsage;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "", "loadBlocking", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "a", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLoader$ui_text_release", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "loader", "c", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "cacheKey", "Landroid/content/Context;", "context", "<init>", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Font.ResourceLoader loader;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f17936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object cacheKey;

    public DelegatingFontLoaderForBridgeUsage(@NotNull Font.ResourceLoader loader, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(context, "context");
        this.loader = loader;
        this.f17936b = context;
        this.cacheKey = new Object();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object awaitLoad(@NotNull Font font, @NotNull Continuation<Object> continuation) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.f17936b, androidFont, continuation);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @NotNull
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: getLoader$ui_text_release, reason: from getter */
    public final Font.ResourceLoader getLoader() {
        return this.loader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object loadBlocking(@NotNull Font font) {
        Intrinsics.checkNotNullParameter(font, "font");
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.f17936b, androidFont);
    }
}
