package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class PaintCompat {

    @RequiresApi(23)
    public static class a {
        @DoNotInline
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @RequiresApi(29)
    public static class b {
        @DoNotInline
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    static {
        new ThreadLocal();
    }

    public static boolean hasGlyph(@NonNull Paint paint, @NonNull String str) {
        return a.a(paint, str);
    }

    public static boolean setBlendMode(@NonNull Paint paint, @Nullable BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, blendModeCompat != null ? androidx.core.graphics.a.b.a(blendModeCompat) : null);
            return true;
        }
        if (blendModeCompat == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = androidx.core.graphics.a.a(blendModeCompat);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
