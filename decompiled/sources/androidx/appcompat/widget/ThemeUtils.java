package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ThemeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1486a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1487b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f1488c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1489d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f1490e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f1491f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f1492g = new int[1];

    public static void checkAppCompatTheme(@NonNull View view, @NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static ColorStateList createDisabledStateList(int i10, int i11) {
        return new ColorStateList(new int[][]{f1487b, f1491f}, new int[]{i11, i10});
    }

    public static int getDisabledThemeAttrColor(@NonNull Context context, int i10) {
        ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i10);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(f1487b, themeAttrColorStateList.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1486a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f6 = typedValue.getFloat();
        int themeAttrColor = getThemeAttrColor(context, i10);
        return ColorUtils.setAlphaComponent(themeAttrColor, Math.round(Color.alpha(themeAttrColor) * f6));
    }

    public static int getThemeAttrColor(@NonNull Context context, int i10) {
        int[] iArr = f1492g;
        iArr[0] = i10;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return tintTypedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    @Nullable
    public static ColorStateList getThemeAttrColorStateList(@NonNull Context context, int i10) {
        int[] iArr = f1492g;
        iArr[0] = i10;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return tintTypedArrayObtainStyledAttributes.getColorStateList(0);
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }
}
