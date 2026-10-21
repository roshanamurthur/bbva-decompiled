package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public class BlendModeColorFilterCompat {

    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static ColorFilter a(int i10, Object obj) {
            return new BlendModeColorFilter(i10, (BlendMode) obj);
        }
    }

    @Nullable
    public static ColorFilter createBlendModeColorFilterCompat(int i10, @NonNull BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objA = androidx.core.graphics.a.b.a(blendModeCompat);
            if (objA != null) {
                return a.a(i10, objA);
            }
            return null;
        }
        PorterDuff.Mode modeA = androidx.core.graphics.a.a(blendModeCompat);
        if (modeA != null) {
            return new PorterDuffColorFilter(i10, modeA);
        }
        return null;
    }
}
