package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class CompoundButtonCompat {

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @DoNotInline
        public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @DoNotInline
        public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @RequiresApi(23)
    public static class b {
        @DoNotInline
        public static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @Nullable
    public static Drawable getButtonDrawable(@NonNull CompoundButton compoundButton) {
        return b.a(compoundButton);
    }

    @Nullable
    public static ColorStateList getButtonTintList(@NonNull CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    @Nullable
    public static PorterDuff.Mode getButtonTintMode(@NonNull CompoundButton compoundButton) {
        return a.b(compoundButton);
    }

    public static void setButtonTintList(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void setButtonTintMode(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}
