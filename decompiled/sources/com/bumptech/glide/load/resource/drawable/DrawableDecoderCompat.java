package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: classes9.dex */
public final class DrawableDecoderCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f38634a = true;

    public static Drawable a(Context context, Context context2, @DrawableRes int i10, @Nullable Resources.Theme theme) {
        try {
            if (f38634a) {
                return b(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e5) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e5;
            }
            return ContextCompat.getDrawable(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f38634a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i10, theme);
    }

    public static Drawable b(Context context, @DrawableRes int i10, @Nullable Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i10);
    }

    public static Drawable getDrawable(Context context, Context context2, @DrawableRes int i10) {
        return a(context, context2, i10, null);
    }

    public static Drawable getDrawable(Context context, @DrawableRes int i10, @Nullable Resources.Theme theme) {
        return a(context, context, i10, theme);
    }
}
