package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import androidx.webkit.internal.AssetHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface AutoSizeTextType {
    }

    @RequiresApi(16)
    public static class a {
        @DoNotInline
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @DoNotInline
        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        @DoNotInline
        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    @RequiresApi(17)
    public static class b {
        @DoNotInline
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        public static int b(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        public static int c(View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        @DoNotInline
        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        @DoNotInline
        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        public static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    @RequiresApi(23)
    public static class c {
        @DoNotInline
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @DoNotInline
        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @DoNotInline
        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @DoNotInline
        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        @DoNotInline
        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @DoNotInline
        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @DoNotInline
        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    @RequiresApi(24)
    public static class d {
        @DoNotInline
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @RequiresApi(26)
    public static class e {
        @DoNotInline
        public static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @DoNotInline
        public static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @DoNotInline
        public static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @DoNotInline
        public static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @DoNotInline
        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @DoNotInline
        public static void g(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @DoNotInline
        public static void h(TextView textView, int i10) {
            textView.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    @RequiresApi(34)
    public static class g {
        @DoNotInline
        public static void a(@NonNull TextView textView, int i10, @FloatRange(from = 0.0d) float f6) {
            textView.setLineHeight(i10, f6);
        }
    }

    @RequiresApi(26)
    public static class h implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f20451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f20452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f20453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f20454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f20456f = false;

        public h(TextView textView, ActionMode.Callback callback) {
            this.f20451a = callback;
            this.f20452b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f20451a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f20451a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f20451a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            String str;
            TextView textView = this.f20452b;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f20456f) {
                this.f20456f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f20453c = cls;
                    this.f20454d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f20455e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f20453c = null;
                    this.f20454d = null;
                    this.f20455e = false;
                }
            }
            try {
                Method declaredMethod = (this.f20455e && this.f20453c.isInstance(menu)) ? this.f20454d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(AssetHelper.DEFAULT_MIME_TYPE), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                        arrayList.add(resolveInfo);
                    }
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i10);
                    MenuItem menuItemAdd = menu.add(0, 0, i10 + 100, resolveInfo2.loadLabel(packageManager));
                    Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f20451a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMaxTextSize(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.a(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeMinTextSize(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.b(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeStepGranularity(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.c(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static int[] getAutoSizeTextAvailableSizes(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.d(textView);
        }
        return textView instanceof AutoSizeableTextView ? ((AutoSizeableTextView) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getAutoSizeTextType(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.e(textView);
        }
        if (textView instanceof AutoSizeableTextView) {
            return ((AutoSizeableTextView) textView).getAutoSizeTextType();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static ColorStateList getCompoundDrawableTintList(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return c.b(textView);
        }
        if (textView instanceof TintableCompoundDrawablesView) {
            return ((TintableCompoundDrawablesView) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static PorterDuff.Mode getCompoundDrawableTintMode(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return c.c(textView);
        }
        if (textView instanceof TintableCompoundDrawablesView) {
            return ((TintableCompoundDrawablesView) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    @NonNull
    public static Drawable[] getCompoundDrawablesRelative(@NonNull TextView textView) {
        return b.a(textView);
    }

    public static int getFirstBaselineToTopHeight(@NonNull TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int getLastBaselineToBottomHeight(@NonNull TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int getMaxLines(@NonNull TextView textView) {
        return a.b(textView);
    }

    public static int getMinLines(@NonNull TextView textView) {
        return a.c(textView);
    }

    @NonNull
    public static PrecomputedTextCompat.Params getTextMetricsParams(@NonNull TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new PrecomputedTextCompat.Params(f.c(textView));
        }
        PrecomputedTextCompat.Params.Builder builder = new PrecomputedTextCompat.Params.Builder(new TextPaint(textView.getPaint()));
        builder.setBreakStrategy(c.a(textView));
        builder.setHyphenationFrequency(c.d(textView));
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i10 < 28 || (textView.getInputType() & 15) != 3) {
            boolean z10 = b.b(textView) == 1;
            switch (b.c(textView)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z10 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(f.b(d.a(b.d(textView)))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        builder.setTextDirection(textDirectionHeuristic);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithConfiguration(@NonNull TextView textView, int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.f(textView, i10, i11, i12, i13);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull TextView textView, @NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.g(textView, iArr, i10);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setAutoSizeTextTypeWithDefaults(@NonNull TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.h(textView, i10);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setCompoundDrawableTintList(@NonNull TextView textView, @Nullable ColorStateList colorStateList) {
        Preconditions.checkNotNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.f(textView, colorStateList);
        } else if (textView instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setCompoundDrawableTintMode(@NonNull TextView textView, @Nullable PorterDuff.Mode mode) {
        Preconditions.checkNotNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.g(textView, mode);
        } else if (textView instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void setCompoundDrawablesRelative(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        b.e(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        b.g(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void setCustomSelectionActionModeCallback(@NonNull TextView textView, @NonNull ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(wrapCustomSelectionActionModeCallback(textView, callback));
    }

    public static void setFirstBaselineToTopHeight(@NonNull TextView textView, @IntRange(from = 0) @Px int i10) {
        Preconditions.checkArgumentNonnegative(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            f.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void setLastBaselineToBottomHeight(@NonNull TextView textView, @IntRange(from = 0) @Px int i10) {
        Preconditions.checkArgumentNonnegative(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void setLineHeight(@NonNull TextView textView, @IntRange(from = 0) @Px int i10) {
        Preconditions.checkArgumentNonnegative(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void setPrecomputedText(@NonNull TextView textView, @NonNull PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(f.a(precomputedTextCompat.getPrecomputedText()));
        } else {
            if (!getTextMetricsParams(textView).equalsWithoutTextDirection(precomputedTextCompat.getParams())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(precomputedTextCompat);
        }
    }

    public static void setTextAppearance(@NonNull TextView textView, @StyleRes int i10) {
        textView.setTextAppearance(i10);
    }

    public static void setTextMetricsParams(@NonNull TextView textView, @NonNull PrecomputedTextCompat.Params params) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirection = params.getTextDirection();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirection != textDirectionHeuristic2 && textDirection != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirection == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirection == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirection == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirection == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirection == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirection == textDirectionHeuristic2) {
                i10 = 7;
            }
        }
        b.h(textView, i10);
        textView.getPaint().set(params.getTextPaint());
        c.e(textView, params.getBreakStrategy());
        c.h(textView, params.getHyphenationFrequency());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback unwrapCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        return (!(callback instanceof h) || Build.VERSION.SDK_INT < 26) ? callback : ((h) callback).f20451a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback wrapCustomSelectionActionModeCallback(@NonNull TextView textView, @Nullable ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof h) || callback == null) ? callback : new h(textView, callback);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(@NonNull TextView textView, @DrawableRes int i10, @DrawableRes int i11, @DrawableRes int i12, @DrawableRes int i13) {
        b.f(textView, i10, i11, i12, i13);
    }

    public static void setLineHeight(@NonNull TextView textView, int i10, @FloatRange(from = 0.0d) float f6) {
        if (Build.VERSION.SDK_INT >= 34) {
            g.a(textView, i10, f6);
        } else {
            setLineHeight(textView, Math.round(TypedValue.applyDimension(i10, f6, textView.getResources().getDisplayMetrics())));
        }
    }

    @RequiresApi(28)
    public static class f {
        @DoNotInline
        public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @DoNotInline
        public static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @DoNotInline
        public static void d(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }

        @DoNotInline
        public static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
