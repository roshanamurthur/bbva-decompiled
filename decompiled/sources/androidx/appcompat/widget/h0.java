package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f1601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TintInfo f1602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TintInfo f1603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TintInfo f1604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TintInfo f1605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TintInfo f1606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TintInfo f1607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TintInfo f1608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final k0 f1609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1610j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1611k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f1612l;
    public boolean m;

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @RequiresApi(21)
    public static class b {
        @DoNotInline
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @RequiresApi(24)
    public static class c {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @RequiresApi(26)
    public static class d {
        @DoNotInline
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @DoNotInline
        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @DoNotInline
        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    @RequiresApi(28)
    public static class e {
        @DoNotInline
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public h0(@NonNull TextView textView) {
        this.f1601a = textView;
        this.f1609i = new k0(textView);
    }

    public static TintInfo c(Context context, AppCompatDrawableManager appCompatDrawableManager, int i10) {
        ColorStateList colorStateListE;
        synchronized (appCompatDrawableManager) {
            colorStateListE = appCompatDrawableManager.f1167a.e(context, i10);
        }
        if (colorStateListE == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = colorStateListE;
        return tintInfo;
    }

    public final void a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.a(drawable, tintInfo, this.f1601a.getDrawableState());
    }

    public final void b() {
        TintInfo tintInfo = this.f1602b;
        TextView textView = this.f1601a;
        if (tintInfo != null || this.f1603c != null || this.f1604d != null || this.f1605e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f1602b);
            a(compoundDrawables[1], this.f1603c);
            a(compoundDrawables[2], this.f1604d);
            a(compoundDrawables[3], this.f1605e);
        }
        if (this.f1606f == null && this.f1607g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1606f);
        a(compoundDrawablesRelative[2], this.f1607g);
    }

    @Nullable
    public final ColorStateList d() {
        TintInfo tintInfo = this.f1608h;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @Nullable
    public final PorterDuff.Mode e() {
        TintInfo tintInfo = this.f1608h;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    @SuppressLint({"NewApi"})
    public final void f(@Nullable AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String string;
        String string2;
        int i11;
        int unitFromComplexDimension;
        float dimensionPixelSize;
        int resourceId;
        TextView textView = this.f1601a;
        Context context = textView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        int[] iArr = R.styleable.AppCompatTextHelper;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        int resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        int i12 = R.styleable.AppCompatTextHelper_android_drawableLeft;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f1602b = c(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i12, 0));
        }
        int i13 = R.styleable.AppCompatTextHelper_android_drawableTop;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f1603c = c(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i13, 0));
        }
        int i14 = R.styleable.AppCompatTextHelper_android_drawableRight;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f1604d = c(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i14, 0));
        }
        int i15 = R.styleable.AppCompatTextHelper_android_drawableBottom;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f1605e = c(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i15, 0));
        }
        int i16 = R.styleable.AppCompatTextHelper_android_drawableStart;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f1606f = c(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i16, 0));
        }
        int i17 = R.styleable.AppCompatTextHelper_android_drawableEnd;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i17)) {
            this.f1607g = c(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i17, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId2 != -1) {
            TintTypedArray tintTypedArrayObtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId2, R.styleable.TextAppearance);
            if (z12) {
                z10 = false;
                z11 = false;
            } else {
                int i18 = R.styleable.TextAppearance_textAllCaps;
                if (tintTypedArrayObtainStyledAttributes2.hasValue(i18)) {
                    z10 = tintTypedArrayObtainStyledAttributes2.getBoolean(i18, false);
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
            }
            m(context, tintTypedArrayObtainStyledAttributes2);
            int i19 = Build.VERSION.SDK_INT;
            int i20 = R.styleable.TextAppearance_textLocale;
            string2 = tintTypedArrayObtainStyledAttributes2.hasValue(i20) ? tintTypedArrayObtainStyledAttributes2.getString(i20) : null;
            if (i19 >= 26) {
                int i21 = R.styleable.TextAppearance_fontVariationSettings;
                if (tintTypedArrayObtainStyledAttributes2.hasValue(i21)) {
                    string = tintTypedArrayObtainStyledAttributes2.getString(i21);
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            tintTypedArrayObtainStyledAttributes2.recycle();
        } else {
            z10 = false;
            z11 = false;
            string = null;
            string2 = null;
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TextAppearance, i10, 0);
        if (!z12) {
            int i22 = R.styleable.TextAppearance_textAllCaps;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i22)) {
                z10 = tintTypedArrayObtainStyledAttributes3.getBoolean(i22, false);
                z11 = true;
            }
        }
        int i23 = Build.VERSION.SDK_INT;
        int i24 = R.styleable.TextAppearance_textLocale;
        if (tintTypedArrayObtainStyledAttributes3.hasValue(i24)) {
            string2 = tintTypedArrayObtainStyledAttributes3.getString(i24);
        }
        if (i23 >= 26) {
            int i25 = R.styleable.TextAppearance_fontVariationSettings;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i25)) {
                string = tintTypedArrayObtainStyledAttributes3.getString(i25);
            }
        }
        if (i23 >= 28) {
            int i26 = R.styleable.TextAppearance_android_textSize;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i26) && tintTypedArrayObtainStyledAttributes3.getDimensionPixelSize(i26, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        m(context, tintTypedArrayObtainStyledAttributes3);
        tintTypedArrayObtainStyledAttributes3.recycle();
        if (!z12 && z11) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f1612l;
        if (typeface != null) {
            if (this.f1611k == -1) {
                textView.setTypeface(typeface, this.f1610j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            d.d(textView, string);
        }
        if (string2 == null) {
            i11 = 0;
        } else if (i23 >= 24) {
            c.b(textView, c.a(string2));
            i11 = 0;
        } else {
            i11 = 0;
            textView.setTextLocale(b.a(string2.split(",")[0]));
        }
        int[] iArr2 = R.styleable.AppCompatTextView;
        k0 k0Var = this.f1609i;
        Context context2 = k0Var.f1646j;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i10, i11);
        TextView textView2 = k0Var.f1645i;
        ViewCompat.saveAttributeDataForStyleable(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i27 = R.styleable.AppCompatTextView_autoSizeTextType;
        if (typedArrayObtainStyledAttributes.hasValue(i27)) {
            k0Var.f1637a = typedArrayObtainStyledAttributes.getInt(i27, 0);
        }
        int i28 = R.styleable.AppCompatTextView_autoSizeStepGranularity;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i28) ? typedArrayObtainStyledAttributes.getDimension(i28, -1.0f) : -1.0f;
        int i29 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i29) ? typedArrayObtainStyledAttributes.getDimension(i29, -1.0f) : -1.0f;
        int i30 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i30) ? typedArrayObtainStyledAttributes.getDimension(i30, -1.0f) : -1.0f;
        int i31 = R.styleable.AppCompatTextView_autoSizePresetSizes;
        if (typedArrayObtainStyledAttributes.hasValue(i31) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i31, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i32 = 0; i32 < length; i32++) {
                    iArr3[i32] = typedArrayObtainTypedArray.getDimensionPixelSize(i32, -1);
                }
                k0Var.f1642f = k0.b(iArr3);
                k0Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!k0Var.j()) {
            k0Var.f1637a = 0;
        } else if (k0Var.f1637a == 1) {
            if (!k0Var.f1643g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                k0Var.k(dimension2, dimension3, dimension);
            }
            k0Var.h();
        }
        if (ViewUtils.f1587c && k0Var.f1637a != 0) {
            int[] iArr4 = k0Var.f1642f;
            if (iArr4.length > 0) {
                if (d.a(textView) != -1.0f) {
                    d.b(textView, Math.round(k0Var.f1640d), Math.round(k0Var.f1641e), Math.round(k0Var.f1639c), 0);
                } else {
                    d.c(textView, iArr4, 0);
                }
            }
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextView);
        int resourceId3 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawable = resourceId3 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId3) : null;
        int resourceId4 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawable2 = resourceId4 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId4) : null;
        int resourceId5 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawable3 = resourceId5 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId5) : null;
        int resourceId6 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawable4 = resourceId6 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId6) : null;
        int resourceId7 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawable5 = resourceId7 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId7) : null;
        int resourceId8 = tintTypedArrayObtainStyledAttributes4.getResourceId(R.styleable.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawable6 = resourceId8 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId8) : null;
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            } else {
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            }
        }
        int i33 = R.styleable.AppCompatTextView_drawableTint;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i33)) {
            TextViewCompat.setCompoundDrawableTintList(textView, tintTypedArrayObtainStyledAttributes4.getColorStateList(i33));
        }
        int i34 = R.styleable.AppCompatTextView_drawableTintMode;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i34)) {
            TextViewCompat.setCompoundDrawableTintMode(textView, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes4.getInt(i34, -1), null));
        }
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize3 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int i35 = R.styleable.AppCompatTextView_lineHeight;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i35)) {
            TypedValue typedValuePeekValue = tintTypedArrayObtainStyledAttributes4.peekValue(i35);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(i35, -1);
                unitFromComplexDimension = -1;
            } else {
                unitFromComplexDimension = TypedValueCompat.getUnitFromComplexDimension(typedValuePeekValue.data);
                dimensionPixelSize = TypedValue.complexToFloat(typedValuePeekValue.data);
            }
        } else {
            unitFromComplexDimension = -1;
            dimensionPixelSize = -1.0f;
        }
        tintTypedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            TextViewCompat.setFirstBaselineToTopHeight(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            TextViewCompat.setLastBaselineToBottomHeight(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (unitFromComplexDimension == -1) {
                TextViewCompat.setLineHeight(textView, (int) dimensionPixelSize);
            } else {
                TextViewCompat.setLineHeight(textView, unitFromComplexDimension, dimensionPixelSize);
            }
        }
    }

    public final void g(Context context, int i10) {
        String string;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i10, R.styleable.TextAppearance);
        int i11 = R.styleable.TextAppearance_textAllCaps;
        boolean zHasValue = tintTypedArrayObtainStyledAttributes.hasValue(i11);
        TextView textView = this.f1601a;
        if (zHasValue) {
            textView.setAllCaps(tintTypedArrayObtainStyledAttributes.getBoolean(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = R.styleable.TextAppearance_android_textSize;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i13) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, tintTypedArrayObtainStyledAttributes);
        if (i12 >= 26) {
            int i14 = R.styleable.TextAppearance_fontVariationSettings;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i14) && (string = tintTypedArrayObtainStyledAttributes.getString(i14)) != null) {
                d.d(textView, string);
            }
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.f1612l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1610j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        k0 k0Var = this.f1609i;
        if (k0Var.j()) {
            DisplayMetrics displayMetrics = k0Var.f1646j.getResources().getDisplayMetrics();
            k0Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (k0Var.h()) {
                k0Var.a();
            }
        }
    }

    public final void i(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        k0 k0Var = this.f1609i;
        if (k0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = k0Var.f1646j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                k0Var.f1642f = k0.b(iArrCopyOf);
                if (!k0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                k0Var.f1643g = false;
            }
            if (k0Var.h()) {
                k0Var.a();
            }
        }
    }

    public final void j(int i10) {
        k0 k0Var = this.f1609i;
        if (k0Var.j()) {
            if (i10 == 0) {
                k0Var.f1637a = 0;
                k0Var.f1640d = -1.0f;
                k0Var.f1641e = -1.0f;
                k0Var.f1639c = -1.0f;
                k0Var.f1642f = new int[0];
                k0Var.f1638b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(g0.c("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = k0Var.f1646j.getResources().getDisplayMetrics();
            k0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (k0Var.h()) {
                k0Var.a();
            }
        }
    }

    public final void k(@Nullable ColorStateList colorStateList) {
        if (this.f1608h == null) {
            this.f1608h = new TintInfo();
        }
        TintInfo tintInfo = this.f1608h;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        this.f1602b = tintInfo;
        this.f1603c = tintInfo;
        this.f1604d = tintInfo;
        this.f1605e = tintInfo;
        this.f1606f = tintInfo;
        this.f1607g = tintInfo;
    }

    public final void l(@Nullable PorterDuff.Mode mode) {
        if (this.f1608h == null) {
            this.f1608h = new TintInfo();
        }
        TintInfo tintInfo = this.f1608h;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        this.f1602b = tintInfo;
        this.f1603c = tintInfo;
        this.f1604d = tintInfo;
        this.f1605e = tintInfo;
        this.f1606f = tintInfo;
        this.f1607g = tintInfo;
    }

    public final void m(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.f1610j = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.f1610j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.f1611k = i11;
            if (i11 != -1) {
                this.f1610j &= 2;
            }
        }
        int i12 = R.styleable.TextAppearance_android_fontFamily;
        if (!tintTypedArray.hasValue(i12) && !tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            int i13 = R.styleable.TextAppearance_android_typeface;
            if (tintTypedArray.hasValue(i13)) {
                this.m = false;
                int i14 = tintTypedArray.getInt(i13, 1);
                if (i14 == 1) {
                    this.f1612l = Typeface.SANS_SERIF;
                    return;
                } else if (i14 == 2) {
                    this.f1612l = Typeface.SERIF;
                    return;
                } else {
                    if (i14 != 3) {
                        return;
                    }
                    this.f1612l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1612l = null;
        int i15 = R.styleable.TextAppearance_fontFamily;
        if (tintTypedArray.hasValue(i15)) {
            i12 = i15;
        }
        int i16 = this.f1611k;
        int i17 = this.f1610j;
        if (!context.isRestricted()) {
            try {
                Typeface font = tintTypedArray.getFont(i12, this.f1610j, new a(i16, i17, new WeakReference(this.f1601a)));
                if (font != null) {
                    if (i10 < 28 || this.f1611k == -1) {
                        this.f1612l = font;
                    } else {
                        this.f1612l = e.a(Typeface.create(font, 0), this.f1611k, (this.f1610j & 2) != 0);
                    }
                }
                this.m = this.f1612l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1612l != null || (string = tintTypedArray.getString(i12)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1611k == -1) {
            this.f1612l = Typeface.create(string, this.f1610j);
        } else {
            this.f1612l = e.a(Typeface.create(string, 0), this.f1611k, (this.f1610j & 2) != 0);
        }
    }

    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public class a extends ResourcesCompat.FontCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f1615c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f1613a = i10;
            this.f1614b = i11;
            this.f1615c = weakReference;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* JADX INFO: renamed from: onFontRetrieved */
        public final void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1613a) != -1) {
                typeface = e.a(typeface, i10, (this.f1614b & 2) != 0);
            }
            h0 h0Var = h0.this;
            if (h0Var.m) {
                h0Var.f1612l = typeface;
                TextView textView = (TextView) this.f1615c.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new i0(textView, typeface, h0Var.f1610j));
                    } else {
                        textView.setTypeface(typeface, h0Var.f1610j);
                    }
                }
            }
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* JADX INFO: renamed from: onFontRetrievalFailed */
        public final void lambda$callbackFailAsync$1(int i10) {
        }
    }
}
