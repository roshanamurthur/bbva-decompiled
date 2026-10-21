package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static void a(@NonNull Outline outline, @NonNull Path path) {
            outline.setConvexPath(path);
        }
    }

    @RequiresApi(30)
    public static class b {
        @DoNotInline
        public static void a(@NonNull Outline outline, @NonNull Path path) {
            outline.setPath(path);
        }
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }

    @Nullable
    public static Drawable createTintableDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            return drawable;
        }
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        if (mode == null) {
            return drawableMutate;
        }
        DrawableCompat.setTintMode(drawableMutate, mode);
        return drawableMutate;
    }

    @Nullable
    public static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            return drawable;
        }
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        if (mode == null) {
            return drawableMutate;
        }
        DrawableCompat.setTintMode(drawableMutate, mode);
        return drawableMutate;
    }

    @NonNull
    public static int[] getCheckedState(@NonNull int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == 16842912) {
                return iArr;
            }
            if (i11 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i10] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@Nullable Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !f.f(drawable)) {
            return null;
        }
        return g.c(drawable).getColorStateList();
    }

    @NonNull
    public static int[] getUncheckedState(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 != 16842912) {
                iArr2[i10] = i11;
                i10++;
            }
        }
        return iArr2;
    }

    @NonNull
    public static AttributeSet parseDrawableXml(@NonNull Context context, @XmlRes int i10, @NonNull CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e5) {
            e = e5;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e7) {
            e = e7;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void setOutlineToPath(@NonNull Outline outline, @NonNull Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            b.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(@Nullable RippleDrawable rippleDrawable, int i10) {
        rippleDrawable.setRadius(i10);
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i10) {
        if (i10 != 0) {
            DrawableCompat.setTint(drawable, i10);
        } else {
            DrawableCompat.setTintList(drawable, null);
        }
    }

    @Nullable
    public static PorterDuffColorFilter updateTintFilter(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Px int i10, @Px int i11) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i10 == -1 && (i10 = drawable2.getIntrinsicWidth()) == -1) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (i11 == -1 && (i11 = drawable2.getIntrinsicHeight()) == -1) {
            i11 = drawable.getIntrinsicHeight();
        }
        if (i10 > drawable.getIntrinsicWidth() || i11 > drawable.getIntrinsicHeight()) {
            float f6 = i10 / i11;
            if (f6 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i11 = (int) (intrinsicWidth / f6);
                i10 = intrinsicWidth;
            } else {
                i11 = drawable.getIntrinsicHeight();
                i10 = (int) (f6 * i11);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i10, i11);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }
}
