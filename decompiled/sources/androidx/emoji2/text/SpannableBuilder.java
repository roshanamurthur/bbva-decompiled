package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class SpannableBuilder extends SpannableStringBuilder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Class<?> f21301p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final ArrayList f21302q0;

    public static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Object f21303p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f21304q0 = new AtomicInteger(0);

        public a(Object obj) {
            this.f21303p0 = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f21303p0).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f21303p0).beforeTextChanged(charSequence, i10, i11, i12);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f21304q0.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f21303p0).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
          0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f21304q0.get() <= 0 || !(obj instanceof EmojiSpan)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i14 = i10;
                    i15 = i12;
                } else {
                    if (i10 > i11) {
                        i10 = 0;
                    }
                    if (i12 > i13) {
                        i14 = i10;
                        i15 = 0;
                    } else {
                        i14 = i10;
                        i15 = i12;
                    }
                }
                ((SpanWatcher) this.f21303p0).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f21304q0.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f21303p0).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f21303p0).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f21302q0 = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.f21301p0 = cls;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static SpannableBuilder create(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21302q0;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).f21304q0.incrementAndGet();
            i10++;
        }
    }

    public final a b(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21302q0;
            if (i10 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i10);
            if (aVar.f21303p0 == obj) {
                return aVar;
            }
            i10++;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void beginBatchEdit() {
        a();
    }

    public final boolean c(@Nullable Object obj) {
        if (obj != null) {
            if (this.f21301p0 == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21302q0;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).f21304q0.decrementAndGet();
            i10++;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void endBatchEdit() {
        d();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f21302q0;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@Nullable Object obj) {
        a aVarB;
        if (c(obj) && (aVarB = b(obj)) != null) {
            obj = aVarB;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@Nullable Object obj) {
        a aVarB;
        if (c(obj) && (aVarB = b(obj)) != null) {
            obj = aVarB;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@Nullable Object obj) {
        a aVarB;
        if (c(obj) && (aVarB = b(obj)) != null) {
            obj = aVarB;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i10, int i11, @NonNull Class<T> cls) {
        if (this.f21301p0 != cls) {
            return (T[]) super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f21303p0;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, @Nullable Class cls) {
        if (cls == null || this.f21301p0 == cls) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@Nullable Object obj) {
        a aVarB;
        if (c(obj)) {
            aVarB = b(obj);
            if (aVarB != null) {
                obj = aVarB;
            }
        } else {
            aVarB = null;
        }
        super.removeSpan(obj);
        if (aVarB != null) {
            this.f21302q0.remove(aVarB);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@Nullable Object obj, int i10, int i11, int i12) {
        if (c(obj)) {
            a aVar = new a(obj);
            this.f21302q0.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i10, int i11) {
        return new SpannableBuilder(this.f21301p0, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        d();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f21302q0 = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.f21301p0 = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        d();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
