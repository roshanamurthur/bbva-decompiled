package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f1636l = new RectF();

    @SuppressLint({"BanConcurrentHashMap"})
    public static final ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1637a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1638b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1639c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1640d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1641e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1642f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1643g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f1644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f1645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f1646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f1647k;

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @RequiresApi(23)
    public static final class a {
        @NonNull
        @DoNotInline
        public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @RequiresApi(23)
    public static class b extends d {
        @Override // androidx.appcompat.widget.k0.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) k0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    @RequiresApi(29)
    public static class c extends b {
        @Override // androidx.appcompat.widget.k0.b, androidx.appcompat.widget.k0.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.k0.d
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) k0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public k0(@NonNull TextView textView) {
        this.f1645i = textView;
        this.f1646j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1647k = new c();
        } else {
            this.f1647k = new b();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    @Nullable
    public static Method d(@NonNull String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = m;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e5);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static <T> T e(@NonNull Object obj, @NonNull String str, @NonNull T t10) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e5);
            return t10;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void a() {
        if (f()) {
            if (this.f1638b) {
                if (this.f1645i.getMeasuredHeight() <= 0 || this.f1645i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1647k.b(this.f1645i) ? 1048576 : (this.f1645i.getMeasuredWidth() - this.f1645i.getTotalPaddingLeft()) - this.f1645i.getTotalPaddingRight();
                int height = (this.f1645i.getHeight() - this.f1645i.getCompoundPaddingBottom()) - this.f1645i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1636l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f1645i.getTextSize()) {
                            g(fC, 0);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f1638b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f1642f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f1642f[i13];
            TextView textView = this.f1645i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f1644h;
            if (textPaint == null) {
                this.f1644h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f1644h.set(textView.getPaint());
            this.f1644h.setTextSize(i14);
            StaticLayout staticLayoutA = a.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f1645i, this.f1644h, this.f1647k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f1642f[i11];
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean f() {
        return j() && this.f1637a != 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void g(float f6, int i10) {
        Context context = this.f1646j;
        float fApplyDimension = TypedValue.applyDimension(i10, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f1645i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f1638b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception e5) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e5);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f1637a == 1) {
            if (!this.f1643g || this.f1642f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1641e - this.f1640d) / this.f1639c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f1639c) + this.f1640d);
                }
                this.f1642f = b(iArr);
            }
            this.f1638b = true;
        } else {
            this.f1638b = false;
        }
        return this.f1638b;
    }

    public final boolean i() {
        int[] iArr = this.f1642f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1643g = z10;
        if (z10) {
            this.f1637a = 1;
            this.f1640d = iArr[0];
            this.f1641e = iArr[length - 1];
            this.f1639c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f1645i instanceof AppCompatEditText);
    }

    public final void k(float f6, float f10, float f11) throws IllegalArgumentException {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f10 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f1637a = 1;
        this.f1640d = f6;
        this.f1641e = f10;
        this.f1639c = f11;
        this.f1643g = false;
    }
}
