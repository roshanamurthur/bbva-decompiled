package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.compose.ui.platform.h1;
import androidx.core.os.TraceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.accessibility.g;
import com.facetec.sdk.s6;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class PrecomputedTextCompat implements Spannable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Object f20122t0 = new Object();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NonNull
    @GuardedBy("sLock")
    public static ExecutorService f20123u0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Spannable f20124p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final Params f20125q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final int[] f20126r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final PrecomputedText f20127s0;

    public static class b extends FutureTask<PrecomputedTextCompat> {

        public static class a implements Callable<PrecomputedTextCompat> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Params f20137p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public CharSequence f20138q0;

            @Override // java.util.concurrent.Callable
            public final PrecomputedTextCompat call() throws Exception {
                return PrecomputedTextCompat.create(this.f20138q0, this.f20137p0);
            }
        }
    }

    public PrecomputedTextCompat(@NonNull CharSequence charSequence, @NonNull Params params, @NonNull int[] iArr) {
        this.f20124p0 = new SpannableString(charSequence);
        this.f20125q0 = params;
        this.f20126r0 = iArr;
        this.f20127s0 = null;
    }

    @SuppressLint({"WrongConstant"})
    public static PrecomputedTextCompat create(@NonNull CharSequence charSequence, @NonNull Params params) {
        PrecomputedText.Params params2;
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(params);
        try {
            TraceCompat.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params2 = params.f20132e) != null) {
                return new PrecomputedTextCompat(PrecomputedText.create(charSequence, params2), params);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i10, length);
                i10 = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i10));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(params.getBreakStrategy()).setHyphenationFrequency(params.getHyphenationFrequency()).setTextDirection(params.getTextDirection()).build();
            return new PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            TraceCompat.endSection();
        }
    }

    @UiThread
    public static Future<PrecomputedTextCompat> getTextFuture(@NonNull CharSequence charSequence, @NonNull Params params, @Nullable Executor executor) {
        b.a aVar = new b.a();
        aVar.f20137p0 = params;
        aVar.f20138q0 = charSequence;
        b bVar = new b(aVar);
        if (executor == null) {
            synchronized (f20122t0) {
                try {
                    if (f20123u0 == null) {
                        f20123u0 = Executors.newFixedThreadPool(1);
                    }
                    executor = f20123u0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f20124p0.charAt(i10);
    }

    @IntRange(from = 0)
    public int getParagraphCount() {
        return Build.VERSION.SDK_INT >= 29 ? this.f20127s0.getParagraphCount() : this.f20126r0.length;
    }

    @IntRange(from = 0)
    public int getParagraphEnd(@IntRange(from = 0) int i10) {
        Preconditions.checkArgumentInRange(i10, 0, getParagraphCount(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f20127s0.getParagraphEnd(i10) : this.f20126r0[i10];
    }

    @IntRange(from = 0)
    public int getParagraphStart(@IntRange(from = 0) int i10) {
        Preconditions.checkArgumentInRange(i10, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f20127s0.getParagraphStart(i10);
        }
        if (i10 == 0) {
            return 0;
        }
        return this.f20126r0[i10 - 1];
    }

    @NonNull
    public Params getParams() {
        return this.f20125q0;
    }

    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText getPrecomputedText() {
        Spannable spannable = this.f20124p0;
        if (h1.d(spannable)) {
            return s6.a(spannable);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f20124p0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f20124p0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f20124p0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f20127s0.getSpans(i10, i11, cls) : (T[]) this.f20124p0.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f20124p0.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f20124p0.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f20127s0.removeSpan(obj);
        } else {
            this.f20124p0.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f20127s0.setSpan(obj, i10, i11, i12);
        } else {
            this.f20124p0.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f20124p0.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f20124p0.toString();
    }

    @RequiresApi(28)
    public PrecomputedTextCompat(@NonNull PrecomputedText precomputedText, @NonNull Params params) {
        this.f20124p0 = a.a(precomputedText);
        this.f20125q0 = params;
        this.f20126r0 = null;
        this.f20127s0 = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static final class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final TextPaint f20128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final TextDirectionHeuristic f20129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f20132e;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NonNull
            public final TextPaint f20133a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f20135c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f20136d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f20134b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public Builder(@NonNull TextPaint textPaint) {
                this.f20133a = textPaint;
            }

            @NonNull
            public Params build() {
                return new Params(this.f20133a, this.f20134b, this.f20135c, this.f20136d);
            }

            @RequiresApi(23)
            public Builder setBreakStrategy(int i10) {
                this.f20135c = i10;
                return this;
            }

            @RequiresApi(23)
            public Builder setHyphenationFrequency(int i10) {
                this.f20136d = i10;
                return this;
            }

            @RequiresApi(18)
            public Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.f20134b = textDirectionHeuristic;
                return this;
            }
        }

        public Params(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f20132e = g.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f20132e = null;
            }
            this.f20128a = textPaint;
            this.f20129b = textDirectionHeuristic;
            this.f20130c = i10;
            this.f20131d = i11;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return equalsWithoutTextDirection(params) && this.f20129b == params.getTextDirection();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean equalsWithoutTextDirection(@NonNull Params params) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f20130c != params.getBreakStrategy() || this.f20131d != params.getHyphenationFrequency()) {
                return false;
            }
            TextPaint textPaint = this.f20128a;
            if (textPaint.getTextSize() != params.getTextPaint().getTextSize() || textPaint.getTextScaleX() != params.getTextPaint().getTextScaleX() || textPaint.getTextSkewX() != params.getTextPaint().getTextSkewX() || textPaint.getLetterSpacing() != params.getTextPaint().getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), params.getTextPaint().getFontFeatureSettings()) || textPaint.getFlags() != params.getTextPaint().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!textPaint.getTextLocales().equals(params.getTextPaint().getTextLocales())) {
                    return false;
                }
            } else if (!textPaint.getTextLocale().equals(params.getTextPaint().getTextLocale())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                return params.getTextPaint().getTypeface() == null;
            }
            return textPaint.getTypeface().equals(params.getTextPaint().getTypeface());
        }

        @RequiresApi(23)
        public int getBreakStrategy() {
            return this.f20130c;
        }

        @RequiresApi(23)
        public int getHyphenationFrequency() {
            return this.f20131d;
        }

        @Nullable
        @RequiresApi(18)
        public TextDirectionHeuristic getTextDirection() {
            return this.f20129b;
        }

        @NonNull
        public TextPaint getTextPaint() {
            return this.f20128a;
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            int i11 = this.f20131d;
            int i12 = this.f20130c;
            TextDirectionHeuristic textDirectionHeuristic = this.f20129b;
            TextPaint textPaint = this.f20128a;
            return i10 >= 24 ? ObjectsCompat.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11)) : ObjectsCompat.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f20128a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            if (i10 >= 24) {
                sb2.append(", textLocale=" + textPaint.getTextLocales());
            } else {
                sb2.append(", textLocale=" + textPaint.getTextLocale());
            }
            sb2.append(", typeface=" + textPaint.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f20129b);
            sb2.append(", breakStrategy=" + this.f20130c);
            sb2.append(", hyphenationFrequency=" + this.f20131d);
            sb2.append("}");
            return sb2.toString();
        }

        @RequiresApi(28)
        public Params(@NonNull PrecomputedText.Params params) {
            this.f20128a = params.getTextPaint();
            this.f20129b = params.getTextDirection();
            this.f20130c = params.getBreakStrategy();
            this.f20131d = params.getHyphenationFrequency();
            this.f20132e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }

    @RequiresApi(28)
    public static class a {
        @DoNotInline
        public static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
