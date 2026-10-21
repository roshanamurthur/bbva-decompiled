package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s1.a;

/* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Duplicate cache")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "getOrCreate", "", "getKey", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
public final class AndroidTypefaceCache {

    @NotNull
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final LruCache<String, Typeface> f18204a = new LruCache<>(16);

    @Nullable
    public final String getKey(@NotNull Context context, @NotNull Font font) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        if (!(font instanceof ResourceFont)) {
            if (font instanceof AndroidPreloadedFont) {
                return ((AndroidPreloadedFont) font).getCacheKey();
            }
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
        StringBuilder sb2 = new StringBuilder("res:");
        CharSequence charSequence = typedValue.string;
        String string = charSequence != null ? charSequence.toString() : null;
        Intrinsics.checkNotNull(string);
        sb2.append(string);
        return sb2.toString();
    }

    @NotNull
    public final Typeface getOrCreate(@NotNull Context context, @NotNull Font font) {
        Typeface typefaceLoadBlocking;
        Typeface it;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        String key = getKey(context, font);
        LruCache<String, Typeface> lruCache = f18204a;
        if (key != null && (it = lruCache.get(key)) != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return it;
        }
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                typefaceLoadBlocking = a.f93135a.a(context, ((ResourceFont) font).getResId());
            } else {
                typefaceLoadBlocking = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
                Intrinsics.checkNotNull(typefaceLoadBlocking);
                Intrinsics.checkNotNullExpressionValue(typefaceLoadBlocking, "{\n                    Re…esId)!!\n                }");
            }
        } else {
            if (!(font instanceof AndroidFont)) {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
            AndroidFont androidFont = (AndroidFont) font;
            typefaceLoadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (typefaceLoadBlocking != null) {
            if (key != null) {
                lruCache.put(key, typefaceLoadBlocking);
            }
            return typefaceLoadBlocking;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
