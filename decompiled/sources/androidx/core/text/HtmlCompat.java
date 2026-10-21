package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class HtmlCompat {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    @RequiresApi(24)
    public static class a {
        @DoNotInline
        public static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        @DoNotInline
        public static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }

        @DoNotInline
        public static String c(Spanned spanned, int i10) {
            return Html.toHtml(spanned, i10);
        }
    }

    @NonNull
    public static Spanned fromHtml(@NonNull String str, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? a.a(str, i10) : Html.fromHtml(str);
    }

    @NonNull
    public static String toHtml(@NonNull Spanned spanned, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? a.c(spanned, i10) : Html.toHtml(spanned);
    }

    @NonNull
    public static Spanned fromHtml(@NonNull String str, int i10, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.b(str, i10, imageGetter, tagHandler);
        }
        return Html.fromHtml(str, imageGetter, tagHandler);
    }
}
