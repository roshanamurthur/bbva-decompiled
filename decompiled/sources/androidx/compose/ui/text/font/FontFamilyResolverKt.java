package androidx.compose.ui.text.font;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "a", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "getGlobalTypefaceRequestCache", "()Landroidx/compose/ui/text/font/TypefaceRequestCache;", "GlobalTypefaceRequestCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "b", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "getGlobalAsyncTypefaceCache", "()Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "GlobalAsyncTypefaceCache", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class FontFamilyResolverKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TypefaceRequestCache f17961a = new TypefaceRequestCache();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AsyncTypefaceCache f17962b = new AsyncTypefaceCache();

    @NotNull
    public static final AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return f17962b;
    }

    @NotNull
    public static final TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return f17961a;
    }
}
