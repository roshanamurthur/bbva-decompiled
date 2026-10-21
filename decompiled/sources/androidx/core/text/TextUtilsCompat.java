package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class TextUtilsCompat {

    @RequiresApi(17)
    public static class a {
        @DoNotInline
        public static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    static {
        new Locale("", "");
    }

    public static int getLayoutDirectionFromLocale(@Nullable Locale locale) {
        return a.a(locale);
    }

    @NonNull
    public static String htmlEncode(@NonNull String str) {
        return TextUtils.htmlEncode(str);
    }
}
