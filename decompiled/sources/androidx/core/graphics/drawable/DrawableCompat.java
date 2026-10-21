package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class DrawableCompat {

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @DoNotInline
        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        @DoNotInline
        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @DoNotInline
        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @DoNotInline
        public static void e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    @RequiresApi(21)
    public static class b {
        @DoNotInline
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        public static void e(Drawable drawable, float f6, float f10) {
            drawable.setHotspot(f6, f10);
        }

        @DoNotInline
        public static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        @DoNotInline
        public static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        @DoNotInline
        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @RequiresApi(23)
    public static class c {
        @DoNotInline
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        public static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void applyTheme(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean canApplyTheme(@NonNull Drawable drawable) {
        return b.b(drawable);
    }

    public static void clearColorFilter(@NonNull Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int getAlpha(@NonNull Drawable drawable) {
        return a.a(drawable);
    }

    @Nullable
    public static ColorFilter getColorFilter(@NonNull Drawable drawable) {
        return b.c(drawable);
    }

    public static int getLayoutDirection(@NonNull Drawable drawable) {
        return c.a(drawable);
    }

    public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean isAutoMirrored(@NonNull Drawable drawable) {
        return a.d(drawable);
    }

    @Deprecated
    public static void jumpToCurrentState(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable drawable, boolean z10) {
        a.e(drawable, z10);
    }

    public static void setHotspot(@NonNull Drawable drawable, float f6, float f10) {
        b.e(drawable, f6, f10);
    }

    public static void setHotspotBounds(@NonNull Drawable drawable, int i10, int i11, int i12, int i13) {
        b.f(drawable, i10, i11, i12, i13);
    }

    public static boolean setLayoutDirection(@NonNull Drawable drawable, int i10) {
        return c.b(drawable, i10);
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i10) {
        b.g(drawable, i10);
    }

    public static void setTintList(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void setTintMode(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(@NonNull Drawable drawable) {
        return drawable instanceof WrappedDrawable ? (T) ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    @NonNull
    public static Drawable wrap(@NonNull Drawable drawable) {
        return drawable;
    }
}
